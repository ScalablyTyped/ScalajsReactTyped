package typingsJapgolly.zetapushJs.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionStatusListener extends js.Object {
  def onConnectionBroken(): Unit
  def onConnectionClosed(): Unit
  def onConnectionEstablished(): Unit
  def onConnectionToServerFail(failure: js.Any): Unit
  def onConnectionWillClose(): Unit
  def onFailedHandshake(failure: js.Any): Unit
  def onMessageLost(): Unit
  def onNegotiationFailed(failure: js.Any): Unit
  def onNoServerUrlAvailable(): Unit
  def onSuccessfulHandshake(authentication: js.Any): Unit
}

object ConnectionStatusListener {
  @scala.inline
  def apply(
    onConnectionBroken: Callback,
    onConnectionClosed: Callback,
    onConnectionEstablished: Callback,
    onConnectionToServerFail: js.Any => Callback,
    onConnectionWillClose: Callback,
    onFailedHandshake: js.Any => Callback,
    onMessageLost: Callback,
    onNegotiationFailed: js.Any => Callback,
    onNoServerUrlAvailable: Callback,
    onSuccessfulHandshake: js.Any => Callback
  ): ConnectionStatusListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onConnectionBroken")(onConnectionBroken.toJsFn)
    __obj.updateDynamic("onConnectionClosed")(onConnectionClosed.toJsFn)
    __obj.updateDynamic("onConnectionEstablished")(onConnectionEstablished.toJsFn)
    __obj.updateDynamic("onConnectionToServerFail")(js.Any.fromFunction1((t0: js.Any) => onConnectionToServerFail(t0).runNow()))
    __obj.updateDynamic("onConnectionWillClose")(onConnectionWillClose.toJsFn)
    __obj.updateDynamic("onFailedHandshake")(js.Any.fromFunction1((t0: js.Any) => onFailedHandshake(t0).runNow()))
    __obj.updateDynamic("onMessageLost")(onMessageLost.toJsFn)
    __obj.updateDynamic("onNegotiationFailed")(js.Any.fromFunction1((t0: js.Any) => onNegotiationFailed(t0).runNow()))
    __obj.updateDynamic("onNoServerUrlAvailable")(onNoServerUrlAvailable.toJsFn)
    __obj.updateDynamic("onSuccessfulHandshake")(js.Any.fromFunction1((t0: js.Any) => onSuccessfulHandshake(t0).runNow()))
    __obj.asInstanceOf[ConnectionStatusListener]
  }
}

