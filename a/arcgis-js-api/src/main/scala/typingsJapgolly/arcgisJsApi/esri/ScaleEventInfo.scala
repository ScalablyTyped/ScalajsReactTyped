package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`scale-start`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`scale-stop`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.scale
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleEventInfo
  extends Object
     with UpdateToolEventInfo {
  /**
    * Returns information indicating the stage of the scale operation.  **Possible Values:**
    *
    * Value | Description |
    * ----- | ----------- |
    * scale-start | The type changes to `scale-start` at the start of scale or resize operation.
    * scale | The type changes to `scale` while graphics are being scaled or resized.
    * scale-stop | The type changes to `scale-stop` once graphics are scaled or resized.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#ScaleEventInfo)
    */
  var `type`: `scale-start` | scale | `scale-stop`
  /**
    * The x scale factor used to enlarge or shrink the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#ScaleEventInfo)
    */
  var xScale: Double
  /**
    * The y scale factor used to enlarge or shrink the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#ScaleEventInfo)
    */
  var yScale: Double
}

object ScaleEventInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    `type`: `scale-start` | scale | `scale-stop`,
    xScale: Double,
    yScale: Double
  ): ScaleEventInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], xScale = xScale.asInstanceOf[js.Any], yScale = yScale.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleEventInfo]
  }
}

