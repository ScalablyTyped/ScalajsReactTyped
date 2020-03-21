package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`rotate-start`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`rotate-stop`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.rotate
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotateEventInfo
  extends Object
     with UpdateToolEventInfo {
  /**
    * Angle of rotation in degrees.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#RotateEventInfo)
    */
  var angle: Double
  /**
    * Returns information indicating the stage of the rotate operation.  **Possible Values:**
    *
    * Value | Description |
    * ----- | ----------- |
    * rotate-start | The type changes to `rotate-start` at the start of `rotate` operation.
    * rotate | The type changes to `rotate` while graphics are being rotated.
    * rotate-stop | The type changes to `rotate-stop` once graphics are rotated.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#RotateEventInfo)
    */
  var `type`: `rotate-start` | rotate | `rotate-stop`
}

object RotateEventInfo {
  @scala.inline
  def apply(
    angle: Double,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    `type`: `rotate-start` | rotate | `rotate-stop`
  ): RotateEventInfo = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotateEventInfo]
  }
}

