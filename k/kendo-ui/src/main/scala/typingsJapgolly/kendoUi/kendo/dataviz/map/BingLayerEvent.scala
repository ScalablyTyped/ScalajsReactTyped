package typingsJapgolly.kendoUi.kendo.dataviz.map

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BingLayerEvent extends js.Object {
  var preventDefault: js.Function
  var sender: BingLayer
  def isDefaultPrevented(): Boolean
}

object BingLayerEvent {
  @scala.inline
  def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: BingLayer): BingLayerEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    __obj.asInstanceOf[BingLayerEvent]
  }
}

