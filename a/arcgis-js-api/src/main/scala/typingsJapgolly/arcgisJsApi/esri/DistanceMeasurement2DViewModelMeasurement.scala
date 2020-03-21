package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistanceMeasurement2DViewModelMeasurement extends Object {
  /**
    * Measurement line.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#measurement)
    */
  var geometry: js.Any
  /**
    * Line length (m).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#measurement)
    */
  var length: Double
}

object DistanceMeasurement2DViewModelMeasurement {
  @scala.inline
  def apply(
    constructor: js.Function,
    geometry: js.Any,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    length: Double,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean]
  ): DistanceMeasurement2DViewModelMeasurement = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[DistanceMeasurement2DViewModelMeasurement]
  }
}

