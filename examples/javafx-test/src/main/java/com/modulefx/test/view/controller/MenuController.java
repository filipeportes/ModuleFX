/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modulefx.test.view.controller;

import com.modulefx.test.view.Activator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleException;
import org.osgi.framework.FrameworkUtil;

/**
 *
 * @author filipe
 */
public class MenuController {

    @FXML
    private MenuBar menuBar;

    @FXML
    protected void processExit(ActionEvent event) {
        try {
            System.out.println("JavaFx Osig view test stoped");
            Bundle bundle = FrameworkUtil.getBundle(Activator.class);
            bundle.getBundleContext().getBundle(0).stop();
        } catch (BundleException ex) {
            Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
