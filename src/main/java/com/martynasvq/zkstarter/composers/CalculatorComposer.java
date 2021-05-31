package com.martynasvq.zkstarter.composers;

import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Button;
import org.zkoss.zul.Intbox;
import org.zkoss.zul.Window;

public class CalculatorComposer extends SelectorComposer<Window> {
    @Wire
    Intbox first;
    @Wire
    Intbox second;
    @Wire
    Intbox result;
    @Wire
    Button mainbtn;

    @Override
    public void doAfterCompose(Window comp) throws Exception {
        super.doAfterCompose(comp);
    }

    @Listen("onClick=#mainbtn")
    public void clicked() {
        Clients.alert("Hello");
    }

    @Listen("onChange=#first,#second")
    public void calculate() {
        if(first.getValue() != null && second.getValue() !=null) {
            result.setValue(first.getValue()*second.getValue());
        }
    }
}
