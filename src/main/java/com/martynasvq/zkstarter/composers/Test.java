package com.martynasvq.zkstarter.composers;

import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Button;
import org.zkoss.zul.Window;

public class Test extends SelectorComposer {

    @Wire
    Button btn;

    @Listen("onClick=#btn")
    void clicked() {
        Clients.alert("Alert");
    }
}
