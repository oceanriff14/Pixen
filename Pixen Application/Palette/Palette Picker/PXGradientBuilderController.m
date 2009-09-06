//
//  PXGradientBuilderController.m
//  Pixen-XCode
//
// Copyright (c) 2003,2004,2005 Open Sword Group

// Permission is hereby granted, free of charge, to any person obtaining a copy 
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights 
// to use,copy, modify, merge, publish, distribute, sublicense, and/or sell 
// copies of the Software, and to permit persons to whom the Software is
//  furnished to do so, subject to the following conditions:

// The above copyright notice and this permission notice shall be included in
//  all copies or substantial portions of the Software.

// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. 
// IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS
// BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF
// CONTRACT, TORT OR OTHERWISE, ARISING FROM,  OUT OF OR IN CONNECTION WITH
// THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

//  Created by Ian Henderson on 26.08.04.
//  Copyright 2004 Open Sword Group. All rights reserved.
//

#import "PXGradientBuilderController.h"
#import <AppKit/NSColorWell.h>
#import <AppKit/NSColor.h>
#import <AppKit/NSApplication.h>
#import <AppKit/NSTextField.h>

@implementation PXGradientBuilderController
//#warning unused, but kept because we'll probably use it with the new palette ui
-(id)  init
{
	return [super initWithWindowNibName:@"PXGradientBuilder"];
}

- (id) initWithDelegate:(id)aDelegate
{
	[self init];
	delegate = aDelegate;
	return self;
}

- (void)beginSheetInWindow:(NSWindow *) window
{
	[NSApp beginSheet:[self window] modalForWindow:window
		modalDelegate:nil
	   didEndSelector:NULL
		  contextInfo:NULL];
}

- (IBAction)create:(id)sender
{
	NSMutableArray *colors = [NSMutableArray arrayWithCapacity:[colorsField intValue]];
	int i;
	float r, g, b, a, deltaR, deltaG, deltaB, deltaA;
	int colorCount = [colorsField intValue];

#ifdef __COCOA__
	NSColor *startColor = [[startColorWell color] colorUsingColorSpaceName:NSCalibratedRGBColorSpace];
	NSColor *endColor = [[endColorWell color] colorUsingColorSpaceName:NSCalibratedRGBColorSpace];

#else
#warning GNUstep TODO
	NSColor *startColor = [startColorWell color];
	NSColor *endColor = [endColorWell color];
#endif
	
	r = [startColor redComponent];
	g = [startColor greenComponent];
	b = [startColor blueComponent];
	a = [startColor alphaComponent];
	deltaR = ([endColor redComponent] - r) / colorCount;
	deltaG = ([endColor greenComponent] - g) / colorCount;
	deltaB = ([endColor blueComponent] - b) / colorCount;
	deltaA = ([endColor alphaComponent] - a) / colorCount;
	
	for (i=0; i<colorCount; i++) {
		[colors addObject:[NSColor colorWithCalibratedRed:r green:g blue:b alpha:a]];
		r += deltaR;
		g += deltaG;
		b += deltaB;
		a += deltaA;
	}
	
//	PXColorBank *bank = [[[PXColorBank alloc] initWithName:[nameField stringValue] colors:colors] autorelease];
	
//#warning TODO import delegate header
//Eh?
#ifdef __COCOA__
//	[delegate gradientBuilderBuiltColorBank:bank]; 
#endif
	[NSApp endSheet:[self window]];
	[self close];
}

- (IBAction)cancel:(id)sender
{
	[NSApp endSheet:[self window]];
	[self close];
}

@end