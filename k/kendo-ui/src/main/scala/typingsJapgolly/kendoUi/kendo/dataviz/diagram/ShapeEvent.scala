package typingsJapgolly.kendoUi.kendo.dataviz.diagram

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeEvent extends js.Object {
  var preventDefault: js.Function
  var sender: Shape
  def isDefaultPrevented(): Boolean
}

object ShapeEvent {
  @scala.inline
  def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: Shape): ShapeEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    __obj.asInstanceOf[ShapeEvent]
  }
}

