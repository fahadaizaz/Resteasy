package org.jboss.resteasy.plugins.servlet.i18n;

import java.lang.invoke.MethodHandles;

import org.jboss.logging.annotations.Message;
import org.jboss.logging.annotations.MessageBundle;

/**
 *
 * @author <a href="ron.sigal@jboss.com">Ron Sigal</a>
 * @version $Revision: 1.1 $
 *
 *          Copyright Aug 29, 2015
 */
@MessageBundle(projectCode = "RESTEASY")
public interface Messages {
    Messages MESSAGES = org.jboss.logging.Messages.getBundle(MethodHandles.lookup(), Messages.class);
    int BASE = 12500;

    @Message(id = BASE + 0, value = "Default Application class not implemented yet")
    String defaultApplicationNotImplemented();
}
