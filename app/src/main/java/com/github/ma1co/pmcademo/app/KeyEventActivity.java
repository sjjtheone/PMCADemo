package com.github.ma1co.pmcademo.app;

import android.os.Bundle;
import android.widget.TextView;

public class KeyEventActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_key_event);
    }

    protected void log(String msg) {
        TextView log = (TextView) findViewById(R.id.log);
        log.append(msg + "\n");
    }

    protected boolean logKey(Boolean down, String key) {
        log(key + " key " + (down ? "pressed" : "released"));
        return false;
    }

    protected boolean logDial(String key, int value) {
        log(key + " dial changed: " + value);
        return false;
    }

    protected boolean onUpKeyDown() { return logKey(true, "up"); }
    protected boolean onUpKeyUp() { return logKey(false, "up"); }
    protected boolean onDownKeyDown() { return logKey(true, "down"); }
    protected boolean onDownKeyUp() { return logKey(false, "down"); }
    protected boolean onLeftKeyDown() { return logKey(true, "left"); }
    protected boolean onLeftKeyUp() { return logKey(false, "left"); }
    protected boolean onRightKeyDown() { return logKey(true, "right"); }
    protected boolean onRightKeyUp() { return logKey(false, "right"); }
    protected boolean onEnterKeyDown() { return logKey(true, "enter"); }
    protected boolean onEnterKeyUp() { return logKey(false, "enter"); }
    protected boolean onFnKeyDown() { return logKey(true, "fn"); }
    protected boolean onFnKeyUp() { return logKey(false, "fn"); }
    protected boolean onAelKeyDown() { return logKey(true, "ael"); }
    protected boolean onAelKeyUp() { return logKey(false, "ael"); }
    protected boolean onMenuKeyDown() { return logKey(true, "menu"); }
    protected boolean onMenuKeyUp() { return logKey(false, "menu"); }
    protected boolean onFocusKeyDown() { return logKey(true, "focus"); }
    protected boolean onFocusKeyUp() { return logKey(false, "focus"); }
    protected boolean onShutterKeyDown() { return logKey(true, "shutter"); }
    protected boolean onShutterKeyUp() { return logKey(false, "shutter"); }
    protected boolean onC1KeyDown() { return logKey(true, "c1"); }
    protected boolean onC1KeyUp() { return logKey(false, "c1"); }
    protected boolean onLensAttached() { log("lens attached"); return false; }
    protected boolean onDail1Changed(int value) { return logDial("dial 1", value); }
    protected boolean onDail2Changed(int value) { return logDial("dial 2", value); }
}
