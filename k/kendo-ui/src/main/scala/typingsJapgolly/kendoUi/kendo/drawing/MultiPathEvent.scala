package typingsJapgolly.kendoUi.kendo.drawing

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiPathEvent extends js.Object {
  var preventDefault: js.Function
  var sender: MultiPath
  def isDefaultPrevented(): Boolean
}

object MultiPathEvent {
  @scala.inline
  def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: MultiPath): MultiPathEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    __obj.asInstanceOf[MultiPathEvent]
  }
}

