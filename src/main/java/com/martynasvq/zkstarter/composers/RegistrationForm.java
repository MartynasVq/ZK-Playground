package com.martynasvq.zkstarter.composers;

import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.*;

import java.sql.Date;
import java.time.LocalDate;

public class RegistrationForm extends SelectorComposer<Window> {
    @Wire
    Textbox nameBox;
    @Wire
    Button resetBtn;
    @Wire
    Button submitBtn;
    @Wire
    Datebox bbox;
    @Wire
    Radiogroup radioBtn;
    @Wire
    Checkbox terms;

    @Listen("onClick=#resetBtn")
    public void reset() {
        nameBox.setValue(" ");
        submitBtn.setDisabled(true);
        bbox.setValue(Date.valueOf(LocalDate.now().minusDays(1)));
        radioBtn.setSelectedIndex(0);
        terms.setChecked(false);
    }

    @Listen("onClick=#terms")
    public void confirmAccepted() {
        if(terms.isChecked()) {
            submitBtn.setDisabled(false);
        } else {
            submitBtn.setDisabled(true);
        }
    }

    @Listen("onClick=#submitBtn")
    public void register() {
        if(validate()) {
            reset();
        }
    }

    private boolean validate() {
        if(terms.isChecked() && !nameBox.getValue().isEmpty() && !nameBox.getValue().isBlank() && radioBtn.getSelectedItem() != null && bbox.getValue() != null)
            return true;

        return false;
    }

}
