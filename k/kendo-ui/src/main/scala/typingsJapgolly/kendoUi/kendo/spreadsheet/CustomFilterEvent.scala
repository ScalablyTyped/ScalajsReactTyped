package typingsJapgolly.kendoUi.kendo.spreadsheet

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomFilterEvent extends js.Object {
  var preventDefault: js.Function
  var sender: CustomFilter
  def isDefaultPrevented(): Boolean
}

object CustomFilterEvent {
  @scala.inline
  def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: CustomFilter): CustomFilterEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    __obj.asInstanceOf[CustomFilterEvent]
  }
}

