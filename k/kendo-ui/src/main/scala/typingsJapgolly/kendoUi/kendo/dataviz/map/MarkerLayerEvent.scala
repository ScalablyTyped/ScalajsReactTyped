package typingsJapgolly.kendoUi.kendo.dataviz.map

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerLayerEvent extends js.Object {
  var preventDefault: js.Function
  var sender: MarkerLayer
  def isDefaultPrevented(): Boolean
}

object MarkerLayerEvent {
  @scala.inline
  def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: MarkerLayer): MarkerLayerEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    __obj.asInstanceOf[MarkerLayerEvent]
  }
}

