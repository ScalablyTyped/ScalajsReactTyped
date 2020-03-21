package typingsJapgolly.winrt.Windows.Networking.Sockets

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.ApplicationModel.Background.IBackgroundTrigger
import typingsJapgolly.winrt.Windows.Foundation.IClosable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IControlChannelTrigger extends IClosable {
  var controlChannelTriggerId: String
  var currentKeepAliveIntervalInMinutes: Double
  var keepAliveTrigger: IBackgroundTrigger
  var pushNotificationTrigger: IBackgroundTrigger
  var serverKeepAliveIntervalInMinutes: Double
  var transportObject: js.Any
  def decreaseNetworkKeepAliveInterval(): Unit
  def flushTransport(): Unit
  def usingTransport(transport: js.Any): Unit
  def waitForPushEnabled(): ControlChannelTriggerStatus
}

object IControlChannelTrigger {
  @scala.inline
  def apply(
    close: Callback,
    controlChannelTriggerId: String,
    currentKeepAliveIntervalInMinutes: Double,
    decreaseNetworkKeepAliveInterval: Callback,
    flushTransport: Callback,
    keepAliveTrigger: IBackgroundTrigger,
    pushNotificationTrigger: IBackgroundTrigger,
    serverKeepAliveIntervalInMinutes: Double,
    transportObject: js.Any,
    usingTransport: js.Any => Callback,
    waitForPushEnabled: CallbackTo[ControlChannelTriggerStatus]
  ): IControlChannelTrigger = {
    val __obj = js.Dynamic.literal(controlChannelTriggerId = controlChannelTriggerId.asInstanceOf[js.Any], currentKeepAliveIntervalInMinutes = currentKeepAliveIntervalInMinutes.asInstanceOf[js.Any], keepAliveTrigger = keepAliveTrigger.asInstanceOf[js.Any], pushNotificationTrigger = pushNotificationTrigger.asInstanceOf[js.Any], serverKeepAliveIntervalInMinutes = serverKeepAliveIntervalInMinutes.asInstanceOf[js.Any], transportObject = transportObject.asInstanceOf[js.Any])
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("decreaseNetworkKeepAliveInterval")(decreaseNetworkKeepAliveInterval.toJsFn)
    __obj.updateDynamic("flushTransport")(flushTransport.toJsFn)
    __obj.updateDynamic("usingTransport")(js.Any.fromFunction1((t0: js.Any) => usingTransport(t0).runNow()))
    __obj.updateDynamic("waitForPushEnabled")(waitForPushEnabled.toJsFn)
    __obj.asInstanceOf[IControlChannelTrigger]
  }
}

