package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`at-least`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`at-most`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`greater-than`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`less-than`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`not-between`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`not-equal`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.between_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.equal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistogramRangeSliderViewModelProperties
  extends StObject
     with SliderViewModelProperties {
  
  /**
    * The statistical average of the data in the histogram.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#average)
    */
  var average: js.UndefOr[Double] = js.undefined
  
  /**
    * An array of objects representing each bin in the histogram.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#bins)
    */
  var bins: js.UndefOr[js.Array[Bin]] = js.undefined
  
  /**
    * Determines the SQL where clause generated in [generateWhereClause()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#generateWhereClause) for filtering purposes.
    *
    * @default equal
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#rangeType)
    */
  var rangeType: js.UndefOr[
    equal | `not-equal` | `less-than` | `greater-than` | `at-most` | `at-least` | between_ | `not-between`
  ] = js.undefined
  
  /**
    * Indicates the standard deviation of the dataset above and below the `average`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#standardDeviation)
    */
  var standardDeviation: js.UndefOr[Double] = js.undefined
}
object HistogramRangeSliderViewModelProperties {
  
  inline def apply(): HistogramRangeSliderViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistogramRangeSliderViewModelProperties]
  }
  
  extension [Self <: HistogramRangeSliderViewModelProperties](x: Self) {
    
    inline def setAverage(value: Double): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
    
    inline def setAverageUndefined: Self = StObject.set(x, "average", js.undefined)
    
    inline def setBins(value: js.Array[Bin]): Self = StObject.set(x, "bins", value.asInstanceOf[js.Any])
    
    inline def setBinsUndefined: Self = StObject.set(x, "bins", js.undefined)
    
    inline def setBinsVarargs(value: Bin*): Self = StObject.set(x, "bins", js.Array(value*))
    
    inline def setRangeType(
      value: equal | `not-equal` | `less-than` | `greater-than` | `at-most` | `at-least` | between_ | `not-between`
    ): Self = StObject.set(x, "rangeType", value.asInstanceOf[js.Any])
    
    inline def setRangeTypeUndefined: Self = StObject.set(x, "rangeType", js.undefined)
    
    inline def setStandardDeviation(value: Double): Self = StObject.set(x, "standardDeviation", value.asInstanceOf[js.Any])
    
    inline def setStandardDeviationUndefined: Self = StObject.set(x, "standardDeviation", js.undefined)
  }
}
