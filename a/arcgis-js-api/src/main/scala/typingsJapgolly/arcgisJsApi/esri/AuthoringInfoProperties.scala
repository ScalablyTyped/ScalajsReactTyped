package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`above-and-below`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`circle-arrow`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`circle-caret`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`circle-plus-minus`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`class-breaks-color`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`class-breaks-size`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`classed-color`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`classed-size`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`decimal-degrees`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`defined-interval`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`equal-interval`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`flow-line`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`happy-sad`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`high-to-low`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`natural-breaks`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`plus-minus`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`standard-deviation`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`univariate-color-size`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`wave-front`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.above
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.arrow
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.below
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.caret
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.centimeters
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.circle
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.custom_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.decimeters
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.feet_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.inches
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.manual
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.meters_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.miles_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.millimeters
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.quantile
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.square_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.thumb
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.triangle_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.yards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthoringInfoProperties extends StObject {
  
  /**
    * Indicates which classification method was used if a classed color or classed size renderer was generated using one of the Smart Mapping functions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#classificationMethod)
    */
  var classificationMethod: js.UndefOr[
    `equal-interval` | `defined-interval` | manual | `natural-breaks` | quantile | `standard-deviation`
  ] = js.undefined
  
  /**
    * Indicates the color ramp was used to create the symbols for Unique Value or Class Breaks renderer for Imagery Layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#colorRamp)
    */
  var colorRamp: js.UndefOr[ColorRampProperties] = js.undefined
  
  /**
    * A numeric field used for generating a [relationship renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html) along with [field2](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field2).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field1)
    */
  var field1: js.UndefOr[AuthoringInfoField1] = js.undefined
  
  /**
    * A numeric field used for generating a [relationship renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html) along with [field1](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field1).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field2)
    */
  var field2: js.UndefOr[AuthoringInfoField2] = js.undefined
  
  /**
    * An array of string values representing field names used for creating a [predominance renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#fields)
    */
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Only applicable to flow renderers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#flowTheme)
    */
  var flowTheme: js.UndefOr[`flow-line` | `wave-front`] = js.undefined
  
  /**
    * The focus of a [relationship renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#focus)
    */
  var focus: js.UndefOr[String] = js.undefined
  
  /**
    * **Only applicable to renderer used in web scenes.** Indicates the unit used in real-world sizes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#lengthUnit)
    */
  var lengthUnit: js.UndefOr[
    inches | feet_ | yards | miles_ | `nautical-miles` | millimeters | centimeters | decimeters | meters_ | kilometers_ | `decimal-degrees`
  ] = js.undefined
  
  /**
    * Indicates the value of the upper handle if a slider was used to generate the dot value for dot density renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#maxSliderValue)
    */
  var maxSliderValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates the value of the lower handle if a slider was used to generate the dot value for dot density renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#minSliderValue)
    */
  var minSliderValue: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of classes used to classify each field of a [relationship renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#numClasses)
    */
  var numClasses: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates the standard deviation interval for each stop in a classed color or classed size renderer that was generated using the `standard-deviation` classification method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#standardDeviationInterval)
    */
  var standardDeviationInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * Only for renderers of type `univariate-color-size` with an `above-and-below` [univariateTheme](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#univariateTheme).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#statistics)
    */
  var statistics: js.UndefOr[AuthoringInfoStatistics] = js.undefined
  
  /**
    * Indicates the renderer type generated from one of the Smart Mapping functions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#type)
    */
  var `type`: js.UndefOr[
    `class-breaks-size` | `class-breaks-color` | `classed-color` | `classed-size` | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.flow | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.predominance | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.relationship | `univariate-color-size`
  ] = js.undefined
  
  /**
    * Only applicable to [univariateColorSize](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html) renderers with an `above-and-below` [univariateTheme](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#univariateTheme).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#univariateSymbolStyle)
    */
  var univariateSymbolStyle: js.UndefOr[
    caret | `circle-caret` | arrow | `circle-arrow` | `plus-minus` | `circle-plus-minus` | square_ | circle | triangle_ | `happy-sad` | thumb | custom_
  ] = js.undefined
  
  /**
    * Only applicable to [univariateColorSize](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html) renderers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#univariateTheme)
    */
  var univariateTheme: js.UndefOr[`high-to-low` | above | below | `above-and-below`] = js.undefined
  
  /**
    * Contains authoring properties of visual variables generated from one of the Smart Mapping methods or sliders.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#visualVariables)
    */
  var visualVariables: js.UndefOr[js.Array[AuthoringInfoVisualVariableProperties]] = js.undefined
}
object AuthoringInfoProperties {
  
  inline def apply(): AuthoringInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthoringInfoProperties]
  }
  
  extension [Self <: AuthoringInfoProperties](x: Self) {
    
    inline def setClassificationMethod(
      value: `equal-interval` | `defined-interval` | manual | `natural-breaks` | quantile | `standard-deviation`
    ): Self = StObject.set(x, "classificationMethod", value.asInstanceOf[js.Any])
    
    inline def setClassificationMethodUndefined: Self = StObject.set(x, "classificationMethod", js.undefined)
    
    inline def setColorRamp(value: ColorRampProperties): Self = StObject.set(x, "colorRamp", value.asInstanceOf[js.Any])
    
    inline def setColorRampUndefined: Self = StObject.set(x, "colorRamp", js.undefined)
    
    inline def setField1(value: AuthoringInfoField1): Self = StObject.set(x, "field1", value.asInstanceOf[js.Any])
    
    inline def setField1Undefined: Self = StObject.set(x, "field1", js.undefined)
    
    inline def setField2(value: AuthoringInfoField2): Self = StObject.set(x, "field2", value.asInstanceOf[js.Any])
    
    inline def setField2Undefined: Self = StObject.set(x, "field2", js.undefined)
    
    inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setFlowTheme(value: `flow-line` | `wave-front`): Self = StObject.set(x, "flowTheme", value.asInstanceOf[js.Any])
    
    inline def setFlowThemeUndefined: Self = StObject.set(x, "flowTheme", js.undefined)
    
    inline def setFocus(value: String): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setLengthUnit(
      value: inches | feet_ | yards | miles_ | `nautical-miles` | millimeters | centimeters | decimeters | meters_ | kilometers_ | `decimal-degrees`
    ): Self = StObject.set(x, "lengthUnit", value.asInstanceOf[js.Any])
    
    inline def setLengthUnitUndefined: Self = StObject.set(x, "lengthUnit", js.undefined)
    
    inline def setMaxSliderValue(value: Double): Self = StObject.set(x, "maxSliderValue", value.asInstanceOf[js.Any])
    
    inline def setMaxSliderValueUndefined: Self = StObject.set(x, "maxSliderValue", js.undefined)
    
    inline def setMinSliderValue(value: Double): Self = StObject.set(x, "minSliderValue", value.asInstanceOf[js.Any])
    
    inline def setMinSliderValueUndefined: Self = StObject.set(x, "minSliderValue", js.undefined)
    
    inline def setNumClasses(value: Double): Self = StObject.set(x, "numClasses", value.asInstanceOf[js.Any])
    
    inline def setNumClassesUndefined: Self = StObject.set(x, "numClasses", js.undefined)
    
    inline def setStandardDeviationInterval(value: Double): Self = StObject.set(x, "standardDeviationInterval", value.asInstanceOf[js.Any])
    
    inline def setStandardDeviationIntervalUndefined: Self = StObject.set(x, "standardDeviationInterval", js.undefined)
    
    inline def setStatistics(value: AuthoringInfoStatistics): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
    
    inline def setType(
      value: `class-breaks-size` | `class-breaks-color` | `classed-color` | `classed-size` | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.flow | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.predominance | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.relationship | `univariate-color-size`
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnivariateSymbolStyle(
      value: caret | `circle-caret` | arrow | `circle-arrow` | `plus-minus` | `circle-plus-minus` | square_ | circle | triangle_ | `happy-sad` | thumb | custom_
    ): Self = StObject.set(x, "univariateSymbolStyle", value.asInstanceOf[js.Any])
    
    inline def setUnivariateSymbolStyleUndefined: Self = StObject.set(x, "univariateSymbolStyle", js.undefined)
    
    inline def setUnivariateTheme(value: `high-to-low` | above | below | `above-and-below`): Self = StObject.set(x, "univariateTheme", value.asInstanceOf[js.Any])
    
    inline def setUnivariateThemeUndefined: Self = StObject.set(x, "univariateTheme", js.undefined)
    
    inline def setVisualVariables(value: js.Array[AuthoringInfoVisualVariableProperties]): Self = StObject.set(x, "visualVariables", value.asInstanceOf[js.Any])
    
    inline def setVisualVariablesUndefined: Self = StObject.set(x, "visualVariables", js.undefined)
    
    inline def setVisualVariablesVarargs(value: AuthoringInfoVisualVariableProperties*): Self = StObject.set(x, "visualVariables", js.Array(value*))
  }
}
