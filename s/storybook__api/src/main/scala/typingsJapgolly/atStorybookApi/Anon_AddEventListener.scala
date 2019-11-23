package typingsJapgolly.atStorybookApi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.atStorybookApi.distModulesShortcutsMod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddEventListener extends js.Object {
  var tagName: String
  def addEventListener(): Unit
  def dispatchEvent(event: Event): Boolean
  def getAttribute(attr: String): String | Null
  def removeEventListener(): Boolean
}

object Anon_AddEventListener {
  @scala.inline
  def apply(
    addEventListener: Callback,
    dispatchEvent: Event => CallbackTo[Boolean],
    getAttribute: String => CallbackTo[String | Null],
    removeEventListener: CallbackTo[Boolean],
    tagName: String
  ): Anon_AddEventListener = {
    val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(addEventListener.toJsFn)
    __obj.updateDynamic("dispatchEvent")(js.Any.fromFunction1((t0: typingsJapgolly.atStorybookApi.distModulesShortcutsMod.Event) => dispatchEvent(t0).runNow()))
    __obj.updateDynamic("getAttribute")(js.Any.fromFunction1((t0: java.lang.String) => getAttribute(t0).runNow()))
    __obj.updateDynamic("removeEventListener")(removeEventListener.toJsFn)
    __obj.asInstanceOf[Anon_AddEventListener]
  }
}

