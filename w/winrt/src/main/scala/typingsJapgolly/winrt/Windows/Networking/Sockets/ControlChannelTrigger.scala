package typingsJapgolly.winrt.Windows.Networking.Sockets

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.ApplicationModel.Background.IBackgroundTrigger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlChannelTrigger
  extends StObject
     with IControlChannelTrigger {
  
  def dispose(): Unit
}
object ControlChannelTrigger {
  
  inline def apply(
    close: Callback,
    controlChannelTriggerId: String,
    currentKeepAliveIntervalInMinutes: Double,
    decreaseNetworkKeepAliveInterval: Callback,
    dispose: Callback,
    flushTransport: Callback,
    keepAliveTrigger: IBackgroundTrigger,
    pushNotificationTrigger: IBackgroundTrigger,
    serverKeepAliveIntervalInMinutes: Double,
    transportObject: Any,
    usingTransport: Any => Callback,
    waitForPushEnabled: CallbackTo[ControlChannelTriggerStatus]
  ): ControlChannelTrigger = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, controlChannelTriggerId = controlChannelTriggerId.asInstanceOf[js.Any], currentKeepAliveIntervalInMinutes = currentKeepAliveIntervalInMinutes.asInstanceOf[js.Any], decreaseNetworkKeepAliveInterval = decreaseNetworkKeepAliveInterval.toJsFn, dispose = dispose.toJsFn, flushTransport = flushTransport.toJsFn, keepAliveTrigger = keepAliveTrigger.asInstanceOf[js.Any], pushNotificationTrigger = pushNotificationTrigger.asInstanceOf[js.Any], serverKeepAliveIntervalInMinutes = serverKeepAliveIntervalInMinutes.asInstanceOf[js.Any], transportObject = transportObject.asInstanceOf[js.Any], usingTransport = js.Any.fromFunction1((t0: Any) => usingTransport(t0).runNow()), waitForPushEnabled = waitForPushEnabled.toJsFn)
    __obj.asInstanceOf[ControlChannelTrigger]
  }
  
  extension [Self <: ControlChannelTrigger](x: Self) {
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
  }
}
