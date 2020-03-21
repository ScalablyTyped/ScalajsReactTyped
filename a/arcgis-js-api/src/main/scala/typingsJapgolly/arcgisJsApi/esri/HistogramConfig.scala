package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistogramConfig extends Object {
  /**
    * Indicates the average value of the dataset. When set, a solid line on the histogram will render at the location of the average value along with a label defaulting to the value set here.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#HistogramConfig)
    */
  var average: js.UndefOr[Double] = js.undefined
  /**
    * Function for styling bars representing histogram bins. This can be used to style bins or add custom interaction to them. For example, you can use this function to color bins that match the colors on the slider's track.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#HistogramConfig)
    */
  var barCreatedFunction: js.UndefOr[BarCreatedFunction] = js.undefined
  /**
    * The bins of the histogram. This is an array of objects indicating the range and count of data in each bin. This value is typically retrieved from the [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-histogram.html) function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#HistogramConfig)
    */
  var bins: js.UndefOr[js.Array[Bin]] = js.undefined
  /**
    * Function that fires each time a data line is created. You can use this to style individual [dataLines](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#dataLines) on the data axis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#HistogramConfig)
    */
  var dataLineCreatedFunction: js.UndefOr[DataLineCreatedFunction] = js.undefined
  /**
    * When set, renders lines on the histogram that indicate important or meaningful values to the end user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#HistogramConfig)
    */
  var dataLines: js.UndefOr[js.Array[HistogramConfigDataLines]] = js.undefined
  /**
    * Indicates the standard deviation of the dataset. When set, data lines are on the histogram at the locations of the standard deviations above and below the `average`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#HistogramConfig)
    */
  var standardDeviation: js.UndefOr[Double] = js.undefined
  /**
    * Indicates the standard deviation of the dataset. When set, data lines are on the histogram at the locations of the standard deviations above and below the `average`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#HistogramConfig)
    */
  var standardDeviationCount: js.UndefOr[Double] = js.undefined
}

object HistogramConfig {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    average: Int | Double = null,
    barCreatedFunction: (/* index */ Double, /* element */ js.Any) => Callback = null,
    bins: js.Array[Bin] = null,
    dataLineCreatedFunction: (/* lineElement */ js.Any, /* labelElement */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double]) => Callback = null,
    dataLines: js.Array[HistogramConfigDataLines] = null,
    standardDeviation: Int | Double = null,
    standardDeviationCount: Int | Double = null
  ): HistogramConfig = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (average != null) __obj.updateDynamic("average")(average.asInstanceOf[js.Any])
    if (barCreatedFunction != null) __obj.updateDynamic("barCreatedFunction")(js.Any.fromFunction2((t0: /* index */ scala.Double, t1: /* element */ js.Any) => barCreatedFunction(t0, t1).runNow()))
    if (bins != null) __obj.updateDynamic("bins")(bins.asInstanceOf[js.Any])
    if (dataLineCreatedFunction != null) __obj.updateDynamic("dataLineCreatedFunction")(js.Any.fromFunction3((t0: /* lineElement */ js.Any, t1: /* labelElement */ js.UndefOr[js.Any], t2: /* index */ js.UndefOr[scala.Double]) => dataLineCreatedFunction(t0, t1, t2).runNow()))
    if (dataLines != null) __obj.updateDynamic("dataLines")(dataLines.asInstanceOf[js.Any])
    if (standardDeviation != null) __obj.updateDynamic("standardDeviation")(standardDeviation.asInstanceOf[js.Any])
    if (standardDeviationCount != null) __obj.updateDynamic("standardDeviationCount")(standardDeviationCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistogramConfig]
  }
}

