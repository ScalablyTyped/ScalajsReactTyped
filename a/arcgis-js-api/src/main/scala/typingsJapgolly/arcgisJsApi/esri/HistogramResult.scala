package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistogramResult extends Object {
  /**
    * An array of objects representing each bin in the histogram.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-histogram.html#HistogramResult)
    */
  var bins: js.Array[Bin]
  /**
    * The maximum value returned by the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-histogram.html#HistogramResult)
    */
  var maxValue: Double
  /**
    * The minimum value returned by the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-histogram.html#HistogramResult)
    */
  var minValue: Double
}

object HistogramResult {
  @scala.inline
  def apply(
    bins: js.Array[Bin],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    maxValue: Double,
    minValue: Double,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean]
  ): HistogramResult = {
    val __obj = js.Dynamic.literal(bins = bins.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[HistogramResult]
  }
}

