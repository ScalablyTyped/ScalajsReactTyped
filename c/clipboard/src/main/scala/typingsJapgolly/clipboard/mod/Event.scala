package typingsJapgolly.clipboard.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var action: String
  var text: String
  var trigger: Element
  def clearSelection(): Unit
}

object Event {
  @scala.inline
  def apply(action: String, clearSelection: Callback, text: String, trigger: Element): Event = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.updateDynamic("clearSelection")(clearSelection.toJsFn)
    __obj.asInstanceOf[Event]
  }
}

