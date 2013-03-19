### JavaFx Embedded Bundle for OSGI framework ####

this bundle embbed the JavaFX 2.2 Runtime inside your OSGI Framework, 
and allow you to create javafx based interfaces using all the features of JavaFX like fxml, css, charts, layouts, etc.. with all the power of OSGI especs.

It's necessarry to add this on your OSGI framework implementation configuration file:org.osgi.framework.system.packages.extra=com.sun.java.browser.dom,com.sun.java.browser.net,com.sun.net.ssl.internal.ssl,javax.imageio,javax.imageio.stream,javax.net.ssl,javax.script,javax.security.auth.callback,javax.security.auth.x500,javax.swing,javax.swing.border,javax.swing.event,javax.swing.filechooser,javax.swing.plaf,javax.swing.plaf.metal,javax.swing.table,javax.swing.text,javax.swing.text.html,javax.swing.text.html.parser,javax.swing.tree,javax.xml.parsers,javax.xml.stream,javax.xml.stream.util,org.eclipse.swt,org.eclipse.swt.dnd,org.eclipse.swt.events,org.eclipse.swt.graphics,org.eclipse.swt.widgets,org.w3c.dom,org.w3c.dom.css,org.w3c.dom.events,org.w3c.dom.html,org.w3c.dom.ranges,org.w3c.dom.stylesheets,org.w3c.dom.traversal,org.w3c.dom.views,org.w3c.dom.xpath,org.xml.sax,org.xml.sax.helpers,sun.applet,sun.awt,sun.awt.image,sun.awt.windows,sun.misc,sun.net,sun.net.www,sun.net.www.protocol.http.ntlm,sun.net.www.protocol.https,sun.net.www.protocol.jar,sun.reflect.misc,sun.rmi.transport.proxy,sun.security.action,sun.security.pkcs,sun.security.provider,sun.security.provider.certpath,sun.security.rsa,sun.security.timestamp,sun.security.util,sun.security.validator,sun.security.x509

Filipe Portes <omeuefilipe@gmail.com>
Brasília - Brazil

