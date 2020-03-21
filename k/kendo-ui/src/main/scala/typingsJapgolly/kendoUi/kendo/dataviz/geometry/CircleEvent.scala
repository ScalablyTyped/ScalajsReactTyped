package typingsJapgolly.kendoUi.kendo.dataviz.geometry

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircleEvent extends js.Object {
  var preventDefault: js.Function
  var sender: Circle
  def isDefaultPrevented(): Boolean
}

object CircleEvent {
  @scala.inline
  def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: Circle): CircleEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    __obj.asInstanceOf[CircleEvent]
  }
}

