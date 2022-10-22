package typingsJapgolly.cordovaPluginBackgroundMode

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CordovaPluginBackgroundMode extends StObject {
  
  /**
    * Configure the default background notification
    */
  def configure(item: ICordovaPluginBackgroundModeNotificationItem): Unit
  
  /**
    * The background mode can be disabled
    */
  def disable(): Unit
  
  /**
    * The background mode can be enabled
    */
  def enable(): Unit
  
  /**
    * Checks if the background mode is activated or not
    */
  def isActivated(): Boolean
  
  /**
    * Checks if the background mode is enabled or not
    */
  def isEnabled(): Boolean
  
  /**
    * Function to get notified when the background mode has been activated
    */
  def onactivate(): Unit
  
  /**
    * Function to get notified when the background mode has been deactivated
    */
  def ondeactivate(): Unit
  
  /**
    * Function to get notified when the background could not benn activated
    */
  def onfailure(callback: js.Function1[/* errorCode */ Double, Unit]): Unit
  
  /**
    * Customize default title, ticker and text for the notification
    */
  def setDefaults(item: ICordovaPluginBackgroundModeNotificationItem): Unit
}
object CordovaPluginBackgroundMode {
  
  inline def apply(
    configure: ICordovaPluginBackgroundModeNotificationItem => Callback,
    disable: Callback,
    enable: Callback,
    isActivated: CallbackTo[Boolean],
    isEnabled: CallbackTo[Boolean],
    onactivate: Callback,
    ondeactivate: Callback,
    onfailure: js.Function1[/* errorCode */ Double, Unit] => Callback,
    setDefaults: ICordovaPluginBackgroundModeNotificationItem => Callback
  ): CordovaPluginBackgroundMode = {
    val __obj = js.Dynamic.literal(configure = js.Any.fromFunction1((t0: ICordovaPluginBackgroundModeNotificationItem) => configure(t0).runNow()), disable = disable.toJsFn, enable = enable.toJsFn, isActivated = isActivated.toJsFn, isEnabled = isEnabled.toJsFn, onactivate = onactivate.toJsFn, ondeactivate = ondeactivate.toJsFn, onfailure = js.Any.fromFunction1((t0: js.Function1[/* errorCode */ Double, Unit]) => onfailure(t0).runNow()), setDefaults = js.Any.fromFunction1((t0: ICordovaPluginBackgroundModeNotificationItem) => setDefaults(t0).runNow()))
    __obj.asInstanceOf[CordovaPluginBackgroundMode]
  }
  
  extension [Self <: CordovaPluginBackgroundMode](x: Self) {
    
    inline def setConfigure(value: ICordovaPluginBackgroundModeNotificationItem => Callback): Self = StObject.set(x, "configure", js.Any.fromFunction1((t0: ICordovaPluginBackgroundModeNotificationItem) => value(t0).runNow()))
    
    inline def setDisable(value: Callback): Self = StObject.set(x, "disable", value.toJsFn)
    
    inline def setEnable(value: Callback): Self = StObject.set(x, "enable", value.toJsFn)
    
    inline def setIsActivated(value: CallbackTo[Boolean]): Self = StObject.set(x, "isActivated", value.toJsFn)
    
    inline def setIsEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEnabled", value.toJsFn)
    
    inline def setOnactivate(value: Callback): Self = StObject.set(x, "onactivate", value.toJsFn)
    
    inline def setOndeactivate(value: Callback): Self = StObject.set(x, "ondeactivate", value.toJsFn)
    
    inline def setOnfailure(value: js.Function1[/* errorCode */ Double, Unit] => Callback): Self = StObject.set(x, "onfailure", js.Any.fromFunction1((t0: js.Function1[/* errorCode */ Double, Unit]) => value(t0).runNow()))
    
    inline def setSetDefaults(value: ICordovaPluginBackgroundModeNotificationItem => Callback): Self = StObject.set(x, "setDefaults", js.Any.fromFunction1((t0: ICordovaPluginBackgroundModeNotificationItem) => value(t0).runNow()))
  }
}
