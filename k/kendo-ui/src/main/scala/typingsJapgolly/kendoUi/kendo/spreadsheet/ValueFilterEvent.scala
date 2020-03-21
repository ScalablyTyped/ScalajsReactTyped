package typingsJapgolly.kendoUi.kendo.spreadsheet

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueFilterEvent extends js.Object {
  var preventDefault: js.Function
  var sender: ValueFilter
  def isDefaultPrevented(): Boolean
}

object ValueFilterEvent {
  @scala.inline
  def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: ValueFilter): ValueFilterEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    __obj.asInstanceOf[ValueFilterEvent]
  }
}

