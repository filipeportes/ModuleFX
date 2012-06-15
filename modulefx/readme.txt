### JavaFx Embedded Bundle for OSGI framework ####

this bundle embbed the JavaFX 2.1 Runtime inside your OSGI Framework, 
and allow you to create javafx based interfaces using all the features of JavaFX like fxml, css, charts, layouts, etc.. with all the power of OSGI especs.

It's necessarry to add this configuration on your OSGI framework implementation configuration file:
org.osgi.framework.system.packages.extra=com.sun.java.browser.net, javax.swing.tree, org.w3c.dom.css, sun.awt.image, netscape.javascript, sun.security.provider, org.xml.sax, sun.security.timestamp, javax.xml.stream, com.sun.net.ssl.internal.ssl, org.w3c.dom.views, sun.net.www.protocol.http.ntlm, javax.swing, javax.swing.filechooser, javax.swing.plaf, sun.net.www, javax.security.auth.x500, javax.net.ssl, javax.swing.text.html, javax.swing.border, javax.xml.parsers, org.w3c.dom, sun.awt, javax.swing.table, org.eclipse.swt.graphics, org.xml.sax.helpers, javax.swing.text, sun.security.rsa, com.sun.prism.opengl.impl, sun.net, sun.security.provider.certpath, javax.script, org.w3c.dom.stylesheets, sun.net.www.protocol.jar, sun.security.action, sun.applet, sun.security.pkcs, sun.security.validator, javax.swing.event, sun.misc, com.sun.java.browser.dom, javax.security.auth.callback, org.w3c.dom.events, sun.awt.windows, org.eclipse.swt, javax.swing.text.html.parser, org.eclipse.swt.events, sun.net.www.protocol.https, sun.security.util, sun.rmi.transport.proxy, javax.xml.stream.util, sun.security.x509, org.eclipse.swt.widgets, javax.swing.plaf.metal, org.w3c.dom.html,org.ietf.jgss, javax.ws.rs,javax.ws.rs.core,javax.ws.rs.ext,javax.xml.datatype,javax.xml.namespace,org.ietf.jgss,org.w3c.dom.bootstrap,org.w3c.dom.ls,javax.activation,javax.xml.bind,javax.xml.bind.annotation,javax.xml.bind.annotation.adapters

Filipe Portes <omeuefilipe@gmail.com>
Brasília - Brazil

