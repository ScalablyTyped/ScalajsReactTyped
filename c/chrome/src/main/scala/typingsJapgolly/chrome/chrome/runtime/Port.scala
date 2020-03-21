package typingsJapgolly.chrome.chrome.runtime

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Port extends js.Object {
  var name: String
  /** An object which allows the addition and removal of listeners for a Chrome event. */
  var onDisconnect: PortDisconnectEvent
  /** An object which allows the addition and removal of listeners for a Chrome event. */
  var onMessage: PortMessageEvent
  /**
    * Optional.
    * This property will only be present on ports passed to onConnect/onConnectExternal listeners.
    */
  var sender: js.UndefOr[MessageSender] = js.undefined
  def disconnect(): Unit
  def postMessage(message: js.Object): Unit
}

object Port {
  @scala.inline
  def apply(
    disconnect: Callback,
    name: String,
    onDisconnect: PortDisconnectEvent,
    onMessage: PortMessageEvent,
    postMessage: js.Object => Callback,
    sender: MessageSender = null
  ): Port = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onDisconnect = onDisconnect.asInstanceOf[js.Any], onMessage = onMessage.asInstanceOf[js.Any])
    __obj.updateDynamic("disconnect")(disconnect.toJsFn)
    __obj.updateDynamic("postMessage")(js.Any.fromFunction1((t0: js.Object) => postMessage(t0).runNow()))
    if (sender != null) __obj.updateDynamic("sender")(sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[Port]
  }
}

