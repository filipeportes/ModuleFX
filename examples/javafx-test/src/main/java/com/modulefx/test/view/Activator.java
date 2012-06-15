package com.modulefx.test.view;

import javafx.application.Application;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    @Override
    public void start(final BundleContext bundle) throws Exception {

        new Thread() {
            @Override
            public void run() {
                Application.launch(App.class);
            };
        }.start();

    }

    @Override
    public void stop(BundleContext arg0) throws Exception {
    }
}
