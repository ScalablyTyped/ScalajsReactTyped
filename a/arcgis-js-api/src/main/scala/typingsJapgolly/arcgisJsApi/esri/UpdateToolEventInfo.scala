package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`move-start`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`move-stop`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`reshape-start`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`reshape-stop`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`rotate-start`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`rotate-stop`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`scale-start`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`scale-stop`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`vertex-add`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`vertex-remove`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.move
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.reshape
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.rotate
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.scale
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.arcgisJsApi.esri.MoveEventInfo
  - typingsJapgolly.arcgisJsApi.esri.ReshapeEventInfo
  - typingsJapgolly.arcgisJsApi.esri.RotateEventInfo
  - typingsJapgolly.arcgisJsApi.esri.ScaleEventInfo
  - typingsJapgolly.arcgisJsApi.esri.VertexAddEventInfo
  - typingsJapgolly.arcgisJsApi.esri.VertexRemoveEventInfo
*/
trait UpdateToolEventInfo extends js.Object

object UpdateToolEventInfo {
  @scala.inline
  def RotateEventInfo(
    angle: Double,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    `type`: `rotate-start` | rotate | `rotate-stop`
  ): UpdateToolEventInfo = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateToolEventInfo]
  }
  @scala.inline
  def MoveEventInfo(
    constructor: js.Function,
    dx: Double,
    dy: Double,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    mover: Graphic,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    `type`: `move-start` | move | `move-stop`
  ): UpdateToolEventInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], mover = mover.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateToolEventInfo]
  }
  @scala.inline
  def VertexRemoveEventInfo(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    removed: js.Array[Graphic],
    `type`: `vertex-remove`
  ): UpdateToolEventInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateToolEventInfo]
  }
  @scala.inline
  def ScaleEventInfo(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    `type`: `scale-start` | scale | `scale-stop`,
    xScale: Double,
    yScale: Double
  ): UpdateToolEventInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], xScale = xScale.asInstanceOf[js.Any], yScale = yScale.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateToolEventInfo]
  }
  @scala.inline
  def ReshapeEventInfo(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    `type`: `reshape-start` | reshape | `reshape-stop`
  ): UpdateToolEventInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateToolEventInfo]
  }
  @scala.inline
  def VertexAddEventInfo(
    added: js.Array[Graphic],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    `type`: `vertex-add`
  ): UpdateToolEventInfo = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateToolEventInfo]
  }
}

