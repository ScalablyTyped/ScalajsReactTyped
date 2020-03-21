package typingsJapgolly.baseui

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItem extends js.Object {
  var event: js.UndefOr[ReactEventFrom[HTMLElement] | KeyboardEvent] = js.undefined
  var item: js.Any
}

object AnonItem {
  @scala.inline
  def apply(item: js.Any, event: ReactEventFrom[HTMLElement] | KeyboardEvent = null): AnonItem = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItem]
  }
}

