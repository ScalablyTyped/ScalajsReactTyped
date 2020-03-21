package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectLineMeasurement3DViewModelMeasurementValue extends Object {
  /**
    * State of the measured value.
    *
    * Value | Description
    * ------------|-------------
    * available | measured value is available
    * unavailable | measured value is not available due an incomplete measurement or because the value is not available for the given measurement configuration (e.g. direct distance is unavailable in `geodesic` mode)
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D-DirectLineMeasurement3DViewModel.html#MeasurementValue)
    */
  var state: String
  /**
    * Textual representation of the measured value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D-DirectLineMeasurement3DViewModel.html#MeasurementValue)
    */
  var text: String
}

object DirectLineMeasurement3DViewModelMeasurementValue {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    state: String,
    text: String
  ): DirectLineMeasurement3DViewModelMeasurementValue = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[DirectLineMeasurement3DViewModelMeasurementValue]
  }
}

