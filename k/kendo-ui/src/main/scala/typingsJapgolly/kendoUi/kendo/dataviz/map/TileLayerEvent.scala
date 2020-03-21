package typingsJapgolly.kendoUi.kendo.dataviz.map

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileLayerEvent extends js.Object {
  var preventDefault: js.Function
  var sender: TileLayer
  def isDefaultPrevented(): Boolean
}

object TileLayerEvent {
  @scala.inline
  def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: TileLayer): TileLayerEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    __obj.asInstanceOf[TileLayerEvent]
  }
}

