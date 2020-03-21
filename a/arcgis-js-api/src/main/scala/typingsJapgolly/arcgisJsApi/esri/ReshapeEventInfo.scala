package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`reshape-start`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`reshape-stop`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.reshape
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReshapeEventInfo
  extends Object
     with UpdateToolEventInfo {
  /**
    * Returns information indicating the stage of the reshape operation.  **Possible Values:**
    *
    * Value | Description |
    * ----- | ----------- |
    * reshape-start | The type changes to `reshape-start` at the start of `reshape` operation.
    * reshape | The type changes to `reshape` while graphics are being reshaped.
    * reshape-stop | The type changes to `reshape-stop` once graphics are reshaped.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#ReshapeEventInfo)
    */
  var `type`: `reshape-start` | reshape | `reshape-stop`
}

object ReshapeEventInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    `type`: `reshape-start` | reshape | `reshape-stop`
  ): ReshapeEventInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReshapeEventInfo]
  }
}

