package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`at-least`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`at-most`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`greater-than`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`less-than`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`not-between`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`not-equal`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.average
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.between
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.equal
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.max
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.min
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.tick
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistogramRangeSliderViewModelProperties extends SliderViewModelProperties {
  /**
    * The statistical average of the data in the histogram. You would typically get this value from the `avg` property of SummaryStatisticsResult, which is the result of the [summaryStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-summaryStatistics.html) function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#average)
    */
  var average: js.UndefOr[Double] = js.undefined
  /**
    * An array of objects representing each bin in the histogram. This information is typically returned from the [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-histogram.html) function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#bins)
    */
  var bins: js.UndefOr[js.Array[Bin]] = js.undefined
  /**
    * Determines the SQL where clause generated in [generateWhereClause()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#generateWhereClause) for filtering purposes. The value set here determines the number of [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#values) allowed on the slider.  See the table below for a description and requirements of all possible values. `value1` refers to the value of the first thumb position. `value2` refers to the value of the final thumb position, if applicable.
    *
    * Possible Value | Number of [Values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#values) | [Where clause](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#generateWhereClause)
    * ---------------|----------------------------|----------------------
    * equal | 1 | `${field} = ${value1}`
    * not-equal | 1 | `${field} <> ${value1}`
    * less-than | 1 | `${field} < ${value1}`
    * greater-than | 1 | `${field} > ${value1}`
    * at-most | 1 | `${field} <= ${value1}`
    * at-least | 1 | `${field} >= ${value1}`
    * between | 2 | `${field} BETWEEN ${value1} AND ${value2}`
    * not-between | 2 | `${field} NOT BETWEEN ${value1} AND ${value2}`
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#rangeType)
    *
    * @default equal
    */
  var rangeType: js.UndefOr[
    equal | `not-equal` | `less-than` | `greater-than` | `at-most` | `at-least` | between | `not-between`
  ] = js.undefined
  /**
    * Indicates the standard deviation of the dataset above and below the `average`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#standardDeviation)
    */
  var standardDeviation: js.UndefOr[Double] = js.undefined
}

object HistogramRangeSliderViewModelProperties {
  @scala.inline
  def apply(
    average: Int | Double = null,
    bins: js.Array[Bin] = null,
    inputFormatFunction: (/* value */ Double, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => CallbackTo[String] = null,
    inputParseFunction: (/* value */ String, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => CallbackTo[Double] = null,
    labelFormatFunction: (/* value */ Double, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => CallbackTo[String] = null,
    max: Int | Double = null,
    min: Int | Double = null,
    precision: Int | Double = null,
    rangeType: equal | `not-equal` | `less-than` | `greater-than` | `at-most` | `at-least` | between | `not-between` = null,
    standardDeviation: Int | Double = null,
    thumbsConstrained: js.UndefOr[Boolean] = js.undefined,
    values: js.Array[Double] = null
  ): HistogramRangeSliderViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (average != null) __obj.updateDynamic("average")(average.asInstanceOf[js.Any])
    if (bins != null) __obj.updateDynamic("bins")(bins.asInstanceOf[js.Any])
    if (inputFormatFunction != null) __obj.updateDynamic("inputFormatFunction")(js.Any.fromFunction3((t0: /* value */ scala.Double, t1: /* type */ js.UndefOr[
  typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.average | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.min | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.max | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.tick | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.value], t2: /* index */ js.UndefOr[scala.Double]) => inputFormatFunction(t0, t1, t2).runNow()))
    if (inputParseFunction != null) __obj.updateDynamic("inputParseFunction")(js.Any.fromFunction3((t0: /* value */ java.lang.String, t1: /* type */ js.UndefOr[
  typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.average | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.min | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.max | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.tick | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.value], t2: /* index */ js.UndefOr[scala.Double]) => inputParseFunction(t0, t1, t2).runNow()))
    if (labelFormatFunction != null) __obj.updateDynamic("labelFormatFunction")(js.Any.fromFunction3((t0: /* value */ scala.Double, t1: /* type */ js.UndefOr[
  typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.average | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.min | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.max | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.tick | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.value], t2: /* index */ js.UndefOr[scala.Double]) => labelFormatFunction(t0, t1, t2).runNow()))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (rangeType != null) __obj.updateDynamic("rangeType")(rangeType.asInstanceOf[js.Any])
    if (standardDeviation != null) __obj.updateDynamic("standardDeviation")(standardDeviation.asInstanceOf[js.Any])
    if (!js.isUndefined(thumbsConstrained)) __obj.updateDynamic("thumbsConstrained")(thumbsConstrained.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistogramRangeSliderViewModelProperties]
  }
}

