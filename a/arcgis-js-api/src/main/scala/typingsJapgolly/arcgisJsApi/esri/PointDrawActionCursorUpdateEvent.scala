package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`cursor-update`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointDrawActionCursorUpdateEvent extends js.Object {
  var coordinates: js.Array[Double]
  var defaultPrevented: Boolean
  var preventDefault: js.Function
  var `type`: `cursor-update`
}

object PointDrawActionCursorUpdateEvent {
  @scala.inline
  def apply(
    coordinates: js.Array[Double],
    defaultPrevented: Boolean,
    preventDefault: js.Function,
    `type`: `cursor-update`
  ): PointDrawActionCursorUpdateEvent = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointDrawActionCursorUpdateEvent]
  }
}

