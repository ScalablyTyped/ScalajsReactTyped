package typingsJapgolly.kendoUi.kendo.dataviz.map

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeLayerEvent extends js.Object {
  var preventDefault: js.Function
  var sender: ShapeLayer
  def isDefaultPrevented(): Boolean
}

object ShapeLayerEvent {
  @scala.inline
  def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: ShapeLayer): ShapeLayerEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    __obj.asInstanceOf[ShapeLayerEvent]
  }
}

