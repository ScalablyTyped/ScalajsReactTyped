package typingsJapgolly.angularWebsocket.mod.angularAugmentingMod.websocket

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.MessageEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Type corresponding to onMessage callbacks stored in $Websocket#onMessageCallbacks instance. */
trait IWebSocketMessageHandler extends js.Object {
  var autoApply: Boolean
  var pattern: js.UndefOr[String | js.RegExp] = js.undefined
  def fn(evt: MessageEvent): Unit
}

object IWebSocketMessageHandler {
  @scala.inline
  def apply(autoApply: Boolean, fn: MessageEvent => Callback, pattern: String | js.RegExp = null): IWebSocketMessageHandler = {
    val __obj = js.Dynamic.literal(autoApply = autoApply.asInstanceOf[js.Any])
    __obj.updateDynamic("fn")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.MessageEvent) => fn(t0).runNow()))
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebSocketMessageHandler]
  }
}

