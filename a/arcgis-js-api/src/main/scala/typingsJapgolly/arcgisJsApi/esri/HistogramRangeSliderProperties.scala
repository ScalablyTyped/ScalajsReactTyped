package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.Callback
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`at-least`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`at-most`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`greater-than`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`less-than`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`not-between`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`not-equal`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.average
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.between_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.equal
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.max
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.min
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.tick
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistogramRangeSliderProperties
  extends StObject
     with WidgetProperties {
  
  /**
    * The statistical average of the data in the histogram.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#average)
    */
  var average: js.UndefOr[Double] = js.undefined
  
  /**
    * Function for styling bars representing histogram bins.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#barCreatedFunction)
    */
  var barCreatedFunction: js.UndefOr[BarCreatedFunction] = js.undefined
  
  /**
    * An array of objects representing each bin in the histogram.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#bins)
    */
  var bins: js.UndefOr[js.Array[Bin]] = js.undefined
  
  /**
    * Function that fires each time a data line is created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#dataLineCreatedFunction)
    */
  var dataLineCreatedFunction: js.UndefOr[DataLineCreatedFunction] = js.undefined
  
  /**
    * When set, renders lines on the histogram that indicate important or meaningful values to the end user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#dataLines)
    */
  var dataLines: js.UndefOr[js.Array[HistogramRangeSliderDataLines]] = js.undefined
  
  /**
    * Sets the color of the histogram bars that are excluded based on the specified [rangeType](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#rangeType).
    *
    * @default #d7e5f0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#excludedBarColor)
    */
  var excludedBarColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
  
  /**
    * Sets the color of the histogram bars that are included in the specified [rangeType](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#rangeType).
    *
    * @default #599dd4
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#includedBarColor)
    */
  var includedBarColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
  
  /**
    * A function used to format labels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#labelFormatFunction)
    */
  var labelFormatFunction: js.UndefOr[SliderLabelFormatter] = js.undefined
  
  /**
    * The maximum value or upper bound of the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#max)
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum value or lower bound of the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#min)
    */
  var min: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines how slider thumb values should be rounded.
    *
    * @default 4
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#precision)
    */
  var precision: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates how the histogram bins should be rendered as the user slides the thumbs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#rangeType)
    */
  var rangeType: js.UndefOr[
    equal | `not-equal` | `less-than` | `greater-than` | `at-most` | `at-least` | between_ | `not-between`
  ] = js.undefined
  
  /**
    * Indicates the standard deviation of the dataset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#standardDeviation)
    */
  var standardDeviation: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates the number of standard deviation lines to render on the histogram from the [average].
    *
    * @default 1
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#standardDeviationCount)
    */
  var standardDeviationCount: js.UndefOr[Double] = js.undefined
  
  /**
    * An array of either one or two numbers representing thumb positions on the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#values)
    */
  var values: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The view model for the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#viewModel)
    */
  var viewModel: js.UndefOr[HistogramRangeSliderViewModelProperties] = js.undefined
}
object HistogramRangeSliderProperties {
  
  inline def apply(): HistogramRangeSliderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistogramRangeSliderProperties]
  }
  
  extension [Self <: HistogramRangeSliderProperties](x: Self) {
    
    inline def setAverage(value: Double): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
    
    inline def setAverageUndefined: Self = StObject.set(x, "average", js.undefined)
    
    inline def setBarCreatedFunction(value: (/* index */ Double, /* element */ Any) => Callback): Self = StObject.set(x, "barCreatedFunction", js.Any.fromFunction2((t0: /* index */ Double, t1: /* element */ Any) => (value(t0, t1)).runNow()))
    
    inline def setBarCreatedFunctionUndefined: Self = StObject.set(x, "barCreatedFunction", js.undefined)
    
    inline def setBins(value: js.Array[Bin]): Self = StObject.set(x, "bins", value.asInstanceOf[js.Any])
    
    inline def setBinsUndefined: Self = StObject.set(x, "bins", js.undefined)
    
    inline def setBinsVarargs(value: Bin*): Self = StObject.set(x, "bins", js.Array(value*))
    
    inline def setDataLineCreatedFunction(
      value: (/* lineElement */ Any, /* labelElement */ js.UndefOr[Any], /* index */ js.UndefOr[Double]) => Callback
    ): Self = StObject.set(x, "dataLineCreatedFunction", js.Any.fromFunction3((t0: /* lineElement */ Any, t1: /* labelElement */ js.UndefOr[Any], t2: /* index */ js.UndefOr[Double]) => (value(t0, t1, t2)).runNow()))
    
    inline def setDataLineCreatedFunctionUndefined: Self = StObject.set(x, "dataLineCreatedFunction", js.undefined)
    
    inline def setDataLines(value: js.Array[HistogramRangeSliderDataLines]): Self = StObject.set(x, "dataLines", value.asInstanceOf[js.Any])
    
    inline def setDataLinesUndefined: Self = StObject.set(x, "dataLines", js.undefined)
    
    inline def setDataLinesVarargs(value: HistogramRangeSliderDataLines*): Self = StObject.set(x, "dataLines", js.Array(value*))
    
    inline def setExcludedBarColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "excludedBarColor", value.asInstanceOf[js.Any])
    
    inline def setExcludedBarColorUndefined: Self = StObject.set(x, "excludedBarColor", js.undefined)
    
    inline def setExcludedBarColorVarargs(value: Double*): Self = StObject.set(x, "excludedBarColor", js.Array(value*))
    
    inline def setIncludedBarColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "includedBarColor", value.asInstanceOf[js.Any])
    
    inline def setIncludedBarColorUndefined: Self = StObject.set(x, "includedBarColor", js.undefined)
    
    inline def setIncludedBarColorVarargs(value: Double*): Self = StObject.set(x, "includedBarColor", js.Array(value*))
    
    inline def setLabelFormatFunction(
      value: (/* value */ Double, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => String
    ): Self = StObject.set(x, "labelFormatFunction", js.Any.fromFunction3(value))
    
    inline def setLabelFormatFunctionUndefined: Self = StObject.set(x, "labelFormatFunction", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setRangeType(
      value: equal | `not-equal` | `less-than` | `greater-than` | `at-most` | `at-least` | between_ | `not-between`
    ): Self = StObject.set(x, "rangeType", value.asInstanceOf[js.Any])
    
    inline def setRangeTypeUndefined: Self = StObject.set(x, "rangeType", js.undefined)
    
    inline def setStandardDeviation(value: Double): Self = StObject.set(x, "standardDeviation", value.asInstanceOf[js.Any])
    
    inline def setStandardDeviationCount(value: Double): Self = StObject.set(x, "standardDeviationCount", value.asInstanceOf[js.Any])
    
    inline def setStandardDeviationCountUndefined: Self = StObject.set(x, "standardDeviationCount", js.undefined)
    
    inline def setStandardDeviationUndefined: Self = StObject.set(x, "standardDeviation", js.undefined)
    
    inline def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value*))
    
    inline def setViewModel(value: HistogramRangeSliderViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
  }
}
