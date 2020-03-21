package typingsJapgolly.firefoxWebextBrowser.browser.runtime

import japgolly.scalajs.react.Callback
import typingsJapgolly.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* runtime types */
/** An object which allows two way communication with other pages. */
trait Port extends js.Object {
  var error: js.UndefOr[js.Error] = js.undefined
  var name: String
  var onDisconnect: WebExtEvent[js.Function1[/* port */ this.type, Unit]]
  var onMessage: WebExtEvent[js.Function1[/* response */ js.Object, Unit]]
  /** This property will **only** be present on ports passed to onConnect/onConnectExternal listeners. */
  var sender: js.UndefOr[MessageSender] = js.undefined
  def disconnect(): Unit
  def postMessage(message: js.Object): Unit
}

object Port {
  @scala.inline
  def apply(
    disconnect: Callback,
    name: String,
    onDisconnect: WebExtEvent[js.Function1[Port, Unit]],
    onMessage: WebExtEvent[js.Function1[/* response */ js.Object, Unit]],
    postMessage: js.Object => Callback,
    error: js.Error = null,
    sender: MessageSender = null
  ): Port = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onDisconnect = onDisconnect.asInstanceOf[js.Any], onMessage = onMessage.asInstanceOf[js.Any])
    __obj.updateDynamic("disconnect")(disconnect.toJsFn)
    __obj.updateDynamic("postMessage")(js.Any.fromFunction1((t0: js.Object) => postMessage(t0).runNow()))
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (sender != null) __obj.updateDynamic("sender")(sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[Port]
  }
}

