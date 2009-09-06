// _PXImageSizePrompt_EOArchive_English.java
// Generated by EnterpriseObjects palette at Tuesday, 9 August, 2005 17.47.57 US/Pacific

import com.webobjects.eoapplication.*;
import com.webobjects.eocontrol.*;
import com.webobjects.eointerface.*;
import com.webobjects.eointerface.swing.*;
import com.webobjects.foundation.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;
import javax.swing.text.*;

public class _PXImageSizePrompt_EOArchive_English extends com.webobjects.eoapplication.EOArchive {
    UserDefaultsController _userDefaultsController0;
    com.webobjects.eointerface.swing.EOFrame _eoFrame0;
    com.webobjects.eointerface.swing.EOImageView _nsImageView0;
    com.webobjects.eointerface.swing.EOTextField _nsTextField0, _nsTextField1, _nsTextField2;
    com.webobjects.foundation.NSNumberFormatter _nsNumberFormatter0;
    javax.swing.JButton _nsButton0, _nsButton1;
    javax.swing.JPanel _nsView0;

    public _PXImageSizePrompt_EOArchive_English(Object owner, NSDisposableRegistry registry) {
        super(owner, registry);
    }

    protected void _construct() {
        Object owner = _owner();
        EOArchive._ObjectInstantiationDelegate delegate = (owner instanceof EOArchive._ObjectInstantiationDelegate) ? (EOArchive._ObjectInstantiationDelegate)owner : null;
        Object replacement;

        super._construct();

        _userDefaultsController0 = (UserDefaultsController)_registered(new UserDefaultsController(), "NSUserDefaultsController");
        _nsImageView0 = (com.webobjects.eointerface.swing.EOImageView)_registered(new com.webobjects.eointerface.swing.EOImageView(), "");

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "widthField.formatter")) != null)) {
            _nsNumberFormatter0 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (com.webobjects.foundation.NSNumberFormatter)replacement;
            _replacedObjects.setObjectForKey(replacement, "_nsNumberFormatter0");
        } else {
            _nsNumberFormatter0 = (com.webobjects.foundation.NSNumberFormatter)_registered(new com.webobjects.foundation.NSNumberFormatter("0;-0"), "NSNumberFormatter");
        }

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "widthField.nextFocusableComponent.nextFocusableComponent")) != null)) {
            _nsButton1 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (javax.swing.JButton)replacement;
            _replacedObjects.setObjectForKey(replacement, "_nsButton1");
        } else {
            _nsButton1 = (javax.swing.JButton)_registered(new javax.swing.JButton("Cancel"), "NSButton1");
        }

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "widthField.nextFocusableComponent")) != null)) {
            _nsTextField2 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (com.webobjects.eointerface.swing.EOTextField)replacement;
            _replacedObjects.setObjectForKey(replacement, "_nsTextField2");
        } else {
            _nsTextField2 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField1");
        }

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "widthField")) != null)) {
            _nsTextField1 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (com.webobjects.eointerface.swing.EOTextField)replacement;
            _replacedObjects.setObjectForKey(replacement, "_nsTextField1");
        } else {
            _nsTextField1 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField");
        }

        _nsButton0 = (javax.swing.JButton)_registered(new javax.swing.JButton("Use this Size"), "NSButton");
        _nsTextField0 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField2");

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "window")) != null)) {
            _eoFrame0 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (com.webobjects.eointerface.swing.EOFrame)replacement;
            _replacedObjects.setObjectForKey(replacement, "_eoFrame0");
        } else {
            _eoFrame0 = (com.webobjects.eointerface.swing.EOFrame)_registered(new com.webobjects.eointerface.swing.EOFrame(), "Panel");
        }

        _nsView0 = (JPanel)_eoFrame0.getContentPane();
    }

    protected void _awaken() {
        super._awaken();

        if (_replacedObjects.objectForKey("_nsTextField2") == null) {
            _connect(_owner(), _nsTextField2, "heightField");
        }

        _nsButton1.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "cancel", _nsButton1), ""));

        if (_replacedObjects.objectForKey("_nsTextField1") == null) {
            _connect(_owner(), _nsTextField1, "widthField");
        }

        if (_replacedObjects.objectForKey("_eoFrame0") == null) {
            _connect(_owner(), _eoFrame0, "window");
        }

        _nsButton0.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "useEnteredSize", _nsButton0), ""));
    }

    protected void _init() {
        super._init();
        _connect(_nsButton0, _nsTextField1, "nextFocusableComponent");

        if (_replacedObjects.objectForKey("_nsTextField1") == null) {
            _connect(_nsTextField1, _nsNumberFormatter0, "formatter");
        }

        if (_replacedObjects.objectForKey("_nsNumberFormatter0") == null) {
            _nsNumberFormatter0.setMinimum(new java.math.BigDecimal("1"));
        }

        if (_replacedObjects.objectForKey("_nsTextField2") == null) {
            _connect(_nsTextField2, _nsNumberFormatter0, "formatter");
        }

        if (_replacedObjects.objectForKey("_nsButton1") == null) {
            _connect(_nsButton1, _nsButton0, "nextFocusableComponent");
        }

        if (_replacedObjects.objectForKey("_nsButton1") == null) {
            _setFontForComponent(_nsButton1, "Lucida Grande", 13, Font.PLAIN);
            _nsButton1.setMargin(new Insets(0, 2, 0, 2));
        }

        if (_replacedObjects.objectForKey("_nsTextField2") == null) {
            _connect(_nsTextField2, _nsButton1, "nextFocusableComponent");
        }

        if (_replacedObjects.objectForKey("_nsTextField2") == null) {
            _setFontForComponent(_nsTextField2, "Lucida Grande", 13, Font.PLAIN);
            _nsTextField2.setEditable(true);
            _nsTextField2.setOpaque(true);
            _nsTextField2.setText("");
            _nsTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
            _nsTextField2.setSelectable(true);
            _nsTextField2.setEnabled(true);
        }

        if (_replacedObjects.objectForKey("_nsTextField1") == null) {
            _connect(_nsTextField1, _nsTextField2, "nextFocusableComponent");
        }

        if (_replacedObjects.objectForKey("_nsTextField1") == null) {
            _setFontForComponent(_nsTextField1, "Lucida Grande", 13, Font.PLAIN);
            _nsTextField1.setEditable(true);
            _nsTextField1.setOpaque(true);
            _nsTextField1.setText("");
            _nsTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
            _nsTextField1.setSelectable(true);
            _nsTextField1.setEnabled(true);
        }

        _setFontForComponent(_nsButton0, "Lucida Grande", 13, Font.PLAIN);
        _nsButton0.setMargin(new Insets(0, 2, 0, 2));
        _setFontForComponent(_nsTextField0, "Lucida Grande", 13, Font.PLAIN);
        _nsTextField0.setEditable(false);
        _nsTextField0.setOpaque(false);
        _nsTextField0.setText("Please specify the size of the image.");
        _nsTextField0.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        _nsTextField0.setSelectable(false);
        _nsTextField0.setEnabled(true);
        _nsTextField0.setBorder(null);
        if (!(_nsView0.getLayout() instanceof EOViewLayout)) { _nsView0.setLayout(new EOViewLayout()); }
        _nsTextField0.setSize(233, 17);
        _nsTextField0.setLocation(11, 20);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsTextField0, EOViewLayout.MinYMargin);
        _nsView0.add(_nsTextField0);
        _nsButton0.setSize(113, 26);
        _nsButton0.setLocation(131, 189);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsButton0, EOViewLayout.MinYMargin);
        _nsView0.add(_nsButton0);
        _nsButton1.setSize(75, 26);
        _nsButton1.setLocation(12, 189);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsButton1, EOViewLayout.MinYMargin);
        _nsView0.add(_nsButton1);
        _nsTextField1.setSize(44, 22);
        _nsTextField1.setLocation(105, 149);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsTextField1, EOViewLayout.MinYMargin);
        _nsView0.add(_nsTextField1);
        _nsTextField2.setSize(50, 22);
        _nsTextField2.setLocation(183, 82);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsTextField2, EOViewLayout.MinYMargin);
        _nsView0.add(_nsTextField2);
        _nsImageView0.setSize(96, 96);
        _nsImageView0.setLocation(78, 45);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsImageView0, EOViewLayout.MinYMargin);
        _nsView0.add(_nsImageView0);

        if (_replacedObjects.objectForKey("_eoFrame0") == null) {
            _nsView0.setSize(253, 225);
            _eoFrame0.setTitle("Specify Size");
            _eoFrame0.setLocation(537, 325);
            _eoFrame0.setSize(253, 225);
        }
    }
}