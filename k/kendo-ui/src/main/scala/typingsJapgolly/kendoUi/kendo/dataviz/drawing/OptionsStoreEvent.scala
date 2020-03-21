package typingsJapgolly.kendoUi.kendo.dataviz.drawing

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsStoreEvent extends js.Object {
  var preventDefault: js.Function
  var sender: OptionsStore
  def isDefaultPrevented(): Boolean
}

object OptionsStoreEvent {
  @scala.inline
  def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: OptionsStore): OptionsStoreEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    __obj.asInstanceOf[OptionsStoreEvent]
  }
}

