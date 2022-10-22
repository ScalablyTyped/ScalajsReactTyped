package typingsJapgolly.winrt.Windows.Networking.Sockets

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.ApplicationModel.Background.IBackgroundTrigger
import typingsJapgolly.winrt.Windows.Foundation.IClosable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IControlChannelTrigger
  extends StObject
     with IClosable {
  
  var controlChannelTriggerId: String
  
  var currentKeepAliveIntervalInMinutes: Double
  
  def decreaseNetworkKeepAliveInterval(): Unit
  
  def flushTransport(): Unit
  
  var keepAliveTrigger: IBackgroundTrigger
  
  var pushNotificationTrigger: IBackgroundTrigger
  
  var serverKeepAliveIntervalInMinutes: Double
  
  var transportObject: Any
  
  def usingTransport(transport: Any): Unit
  
  def waitForPushEnabled(): ControlChannelTriggerStatus
}
object IControlChannelTrigger {
  
  inline def apply(
    close: Callback,
    controlChannelTriggerId: String,
    currentKeepAliveIntervalInMinutes: Double,
    decreaseNetworkKeepAliveInterval: Callback,
    flushTransport: Callback,
    keepAliveTrigger: IBackgroundTrigger,
    pushNotificationTrigger: IBackgroundTrigger,
    serverKeepAliveIntervalInMinutes: Double,
    transportObject: Any,
    usingTransport: Any => Callback,
    waitForPushEnabled: CallbackTo[ControlChannelTriggerStatus]
  ): IControlChannelTrigger = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, controlChannelTriggerId = controlChannelTriggerId.asInstanceOf[js.Any], currentKeepAliveIntervalInMinutes = currentKeepAliveIntervalInMinutes.asInstanceOf[js.Any], decreaseNetworkKeepAliveInterval = decreaseNetworkKeepAliveInterval.toJsFn, flushTransport = flushTransport.toJsFn, keepAliveTrigger = keepAliveTrigger.asInstanceOf[js.Any], pushNotificationTrigger = pushNotificationTrigger.asInstanceOf[js.Any], serverKeepAliveIntervalInMinutes = serverKeepAliveIntervalInMinutes.asInstanceOf[js.Any], transportObject = transportObject.asInstanceOf[js.Any], usingTransport = js.Any.fromFunction1((t0: Any) => usingTransport(t0).runNow()), waitForPushEnabled = waitForPushEnabled.toJsFn)
    __obj.asInstanceOf[IControlChannelTrigger]
  }
  
  extension [Self <: IControlChannelTrigger](x: Self) {
    
    inline def setControlChannelTriggerId(value: String): Self = StObject.set(x, "controlChannelTriggerId", value.asInstanceOf[js.Any])
    
    inline def setCurrentKeepAliveIntervalInMinutes(value: Double): Self = StObject.set(x, "currentKeepAliveIntervalInMinutes", value.asInstanceOf[js.Any])
    
    inline def setDecreaseNetworkKeepAliveInterval(value: Callback): Self = StObject.set(x, "decreaseNetworkKeepAliveInterval", value.toJsFn)
    
    inline def setFlushTransport(value: Callback): Self = StObject.set(x, "flushTransport", value.toJsFn)
    
    inline def setKeepAliveTrigger(value: IBackgroundTrigger): Self = StObject.set(x, "keepAliveTrigger", value.asInstanceOf[js.Any])
    
    inline def setPushNotificationTrigger(value: IBackgroundTrigger): Self = StObject.set(x, "pushNotificationTrigger", value.asInstanceOf[js.Any])
    
    inline def setServerKeepAliveIntervalInMinutes(value: Double): Self = StObject.set(x, "serverKeepAliveIntervalInMinutes", value.asInstanceOf[js.Any])
    
    inline def setTransportObject(value: Any): Self = StObject.set(x, "transportObject", value.asInstanceOf[js.Any])
    
    inline def setUsingTransport(value: Any => Callback): Self = StObject.set(x, "usingTransport", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setWaitForPushEnabled(value: CallbackTo[ControlChannelTriggerStatus]): Self = StObject.set(x, "waitForPushEnabled", value.toJsFn)
  }
}
