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

@js.native
trait HistogramRangeSliderViewModel
  extends StObject
     with SliderViewModel {
  
  /**
    * The statistical average of the data in the histogram.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#average)
    */
  var average: Double = js.native
  
  /**
    * An array of objects representing each bin in the histogram.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#bins)
    */
  var bins: js.Array[Bin] = js.native
  
  /**
    * Generates a SQL where clause based on a given field and the slider's [rangeType](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#rangeType).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#generateWhereClause)
    */
  def generateWhereClause(field: String): String = js.native
  
  /**
    * Determines the SQL where clause generated in [generateWhereClause()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#generateWhereClause) for filtering purposes.
    *
    * @default equal
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#rangeType)
    */
  var rangeType: equal | `not-equal` | `less-than` | `greater-than` | `at-most` | `at-least` | between_ | `not-between` = js.native
  
  /**
    * Indicates the standard deviation of the dataset above and below the `average`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#standardDeviation)
    */
  var standardDeviation: Double = js.native
}
