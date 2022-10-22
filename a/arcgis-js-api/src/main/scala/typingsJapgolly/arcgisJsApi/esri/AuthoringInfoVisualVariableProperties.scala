package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`above-and-below`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`centered-on`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`high-to-low`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`percent-of-total`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.above
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.below
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.days
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.extremes
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.hours
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.minutes
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.months
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.percent
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.ratio
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.seconds
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.years
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthoringInfoVisualVariableProperties extends StObject {
  
  /**
    * If an age or timeline renderer was generated, indicates the end time of the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#endTime)
    */
  var endTime: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Indicates the field name used for generating the data-driven visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#field)
    */
  var field: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the value of the upper handle if a slider was used to generate the visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#maxSliderValue)
    */
  var maxSliderValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates the value of the lower handle if a slider was used to generate the visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#minSliderValue)
    */
  var minSliderValue: js.UndefOr[Double] = js.undefined
  
  /**
    * If an age or timeline renderer was generated, indicates the start time of the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#startTime)
    */
  var startTime: js.UndefOr[String | Double] = js.undefined
  
  /**
    * If the UI offers the option to display values based on a ratio or percentage, this indicates which selection was made.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#style)
    */
  var style: js.UndefOr[percent | `percent-of-total` | ratio] = js.undefined
  
  /**
    * Indicates the theme selected by the user when generating a renderer or visual variable with one of the Smart Mapping functions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#theme)
    */
  var theme: js.UndefOr[above | below | `above-and-below` | `centered-on` | extremes | `high-to-low`] = js.undefined
  
  /**
    * The type of visual variable generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#type)
    */
  var `type`: js.UndefOr[
    typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.color | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.size | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.opacity
  ] = js.undefined
  
  /**
    * If an age or timeline renderer was generated, indicates the time units used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#units)
    */
  var units: js.UndefOr[seconds | minutes | hours | days | months | years] = js.undefined
}
object AuthoringInfoVisualVariableProperties {
  
  inline def apply(): AuthoringInfoVisualVariableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthoringInfoVisualVariableProperties]
  }
  
  extension [Self <: AuthoringInfoVisualVariableProperties](x: Self) {
    
    inline def setEndTime(value: String | Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setMaxSliderValue(value: Double): Self = StObject.set(x, "maxSliderValue", value.asInstanceOf[js.Any])
    
    inline def setMaxSliderValueUndefined: Self = StObject.set(x, "maxSliderValue", js.undefined)
    
    inline def setMinSliderValue(value: Double): Self = StObject.set(x, "minSliderValue", value.asInstanceOf[js.Any])
    
    inline def setMinSliderValueUndefined: Self = StObject.set(x, "minSliderValue", js.undefined)
    
    inline def setStartTime(value: String | Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStyle(value: percent | `percent-of-total` | ratio): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTheme(value: above | below | `above-and-below` | `centered-on` | extremes | `high-to-low`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setType(
      value: typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.color | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.size | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.opacity
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnits(value: seconds | minutes | hours | days | months | years): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
  }
}
