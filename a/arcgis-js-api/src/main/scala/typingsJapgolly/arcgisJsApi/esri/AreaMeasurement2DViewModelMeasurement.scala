package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaMeasurement2DViewModelMeasurement extends Object {
  /**
    * The area (m²).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#measurement)
    */
  var area: Double
  /**
    * Measurement area.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#measurement)
    */
  var geometry: js.Any
  /**
    * The perimeter (m).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#measurement)
    */
  var perimeter: Double
}

object AreaMeasurement2DViewModelMeasurement {
  @scala.inline
  def apply(
    area: Double,
    constructor: js.Function,
    geometry: js.Any,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    perimeter: Double,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean]
  ): AreaMeasurement2DViewModelMeasurement = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], perimeter = perimeter.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[AreaMeasurement2DViewModelMeasurement]
  }
}

