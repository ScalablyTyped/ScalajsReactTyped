package typingsJapgolly.storybookApi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.storybookApi.shortcutsMod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddEventListener extends js.Object {
  var tagName: String
  def addEventListener(): Unit
  def dispatchEvent(event: Event): Boolean
  def getAttribute(attr: String): String | Null
  def removeEventListener(): Boolean
}

object AnonAddEventListener {
  @scala.inline
  def apply(
    addEventListener: Callback,
    dispatchEvent: Event => CallbackTo[Boolean],
    getAttribute: String => CallbackTo[String | Null],
    removeEventListener: CallbackTo[Boolean],
    tagName: String
  ): AnonAddEventListener = {
    val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(addEventListener.toJsFn)
    __obj.updateDynamic("dispatchEvent")(js.Any.fromFunction1((t0: typingsJapgolly.storybookApi.shortcutsMod.Event) => dispatchEvent(t0).runNow()))
    __obj.updateDynamic("getAttribute")(js.Any.fromFunction1((t0: java.lang.String) => getAttribute(t0).runNow()))
    __obj.updateDynamic("removeEventListener")(removeEventListener.toJsFn)
    __obj.asInstanceOf[AnonAddEventListener]
  }
}

