package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.framework

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Manage the set of registered event listeners and the event notification for a configuration controller.
  *
  * The listeners are called in the order in which they are registered.
  */
trait XConfigurationControllerBroadcaster extends StObject {
  
  /**
    * Add a new listener for configuration changes.
    *
    * The listener is notified only for the specified type of configuration changes. When the listener is interested in more than one event type this method
    * has to be called multiple times. Alternatively it can register as universal listener that will be called for all event types. However, this option is
    * provided primarily to support debugging and monitoring.
    * @param xListener The new listener.
    * @param sEventType The event type that the listener is interested in. The set of event types is not fixed and there can be no exhaustive list. The empty
    * @param aUserData Arbitrary data that is passed to the listener when it is called for the specified event type. When one listener is registered for more
    */
  def addConfigurationChangeListener(xListener: XConfigurationChangeListener, sEventType: String, aUserData: Any): Unit
  
  /** With this method other objects can send events to all the registered listeners. */
  def notifyEvent(aEvent: ConfigurationChangeEvent): Unit
  
  /**
    * Remove a listener for configuration changes.
    * @param xListener The listener that is to be removed.
    */
  def removeConfigurationChangeListener(xListener: XConfigurationChangeListener): Unit
}
object XConfigurationControllerBroadcaster {
  
  inline def apply(
    addConfigurationChangeListener: (XConfigurationChangeListener, String, Any) => Callback,
    notifyEvent: ConfigurationChangeEvent => Callback,
    removeConfigurationChangeListener: XConfigurationChangeListener => Callback
  ): XConfigurationControllerBroadcaster = {
    val __obj = js.Dynamic.literal(addConfigurationChangeListener = js.Any.fromFunction3((t0: XConfigurationChangeListener, t1: String, t2: Any) => (addConfigurationChangeListener(t0, t1, t2)).runNow()), notifyEvent = js.Any.fromFunction1((t0: ConfigurationChangeEvent) => notifyEvent(t0).runNow()), removeConfigurationChangeListener = js.Any.fromFunction1((t0: XConfigurationChangeListener) => removeConfigurationChangeListener(t0).runNow()))
    __obj.asInstanceOf[XConfigurationControllerBroadcaster]
  }
  
  extension [Self <: XConfigurationControllerBroadcaster](x: Self) {
    
    inline def setAddConfigurationChangeListener(value: (XConfigurationChangeListener, String, Any) => Callback): Self = StObject.set(x, "addConfigurationChangeListener", js.Any.fromFunction3((t0: XConfigurationChangeListener, t1: String, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setNotifyEvent(value: ConfigurationChangeEvent => Callback): Self = StObject.set(x, "notifyEvent", js.Any.fromFunction1((t0: ConfigurationChangeEvent) => value(t0).runNow()))
    
    inline def setRemoveConfigurationChangeListener(value: XConfigurationChangeListener => Callback): Self = StObject.set(x, "removeConfigurationChangeListener", js.Any.fromFunction1((t0: XConfigurationChangeListener) => value(t0).runNow()))
  }
}
