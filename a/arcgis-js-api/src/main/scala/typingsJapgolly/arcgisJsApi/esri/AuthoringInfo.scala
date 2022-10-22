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

@js.native
trait AuthoringInfo
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * Indicates which classification method was used if a classed color or classed size renderer was generated using one of the Smart Mapping functions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#classificationMethod)
    */
  var classificationMethod: `equal-interval` | `defined-interval` | manual | `natural-breaks` | quantile | `standard-deviation` = js.native
  
  /**
    * Indicates the color ramp was used to create the symbols for Unique Value or Class Breaks renderer for Imagery Layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#colorRamp)
    */
  var colorRamp: ColorRamp = js.native
  
  /**
    * A numeric field used for generating a [relationship renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html) along with [field2](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field2).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field1)
    */
  var field1: AuthoringInfoField1 = js.native
  
  /**
    * A numeric field used for generating a [relationship renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html) along with [field1](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field1).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field2)
    */
  var field2: AuthoringInfoField2 = js.native
  
  /**
    * An array of string values representing field names used for creating a [predominance renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#fields)
    */
  var fields: js.Array[String] = js.native
  
  /**
    * Only applicable to flow renderers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#flowTheme)
    */
  var flowTheme: `flow-line` | `wave-front` = js.native
  
  /**
    * The focus of a [relationship renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#focus)
    */
  var focus: String = js.native
  
  /**
    * **Only applicable to renderer used in web scenes.** Indicates the unit used in real-world sizes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#lengthUnit)
    */
  var lengthUnit: inches | feet_ | yards | miles_ | `nautical-miles` | millimeters | centimeters | decimeters | meters_ | kilometers_ | `decimal-degrees` = js.native
  
  /**
    * Indicates the value of the upper handle if a slider was used to generate the dot value for dot density renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#maxSliderValue)
    */
  var maxSliderValue: Double = js.native
  
  /**
    * Indicates the value of the lower handle if a slider was used to generate the dot value for dot density renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#minSliderValue)
    */
  var minSliderValue: Double = js.native
  
  /**
    * The number of classes used to classify each field of a [relationship renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#numClasses)
    */
  var numClasses: Double = js.native
  
  /**
    * Indicates the standard deviation interval for each stop in a classed color or classed size renderer that was generated using the `standard-deviation` classification method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#standardDeviationInterval)
    */
  var standardDeviationInterval: Double = js.native
  
  /**
    * Only for renderers of type `univariate-color-size` with an `above-and-below` [univariateTheme](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#univariateTheme).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#statistics)
    */
  var statistics: AuthoringInfoStatistics = js.native
  
  /**
    * Indicates the renderer type generated from one of the Smart Mapping functions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#type)
    */
  var `type`: `class-breaks-size` | `class-breaks-color` | `classed-color` | `classed-size` | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.flow | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.predominance | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.relationship | `univariate-color-size` = js.native
  
  /**
    * Only applicable to [univariateColorSize](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html) renderers with an `above-and-below` [univariateTheme](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#univariateTheme).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#univariateSymbolStyle)
    */
  var univariateSymbolStyle: caret | `circle-caret` | arrow | `circle-arrow` | `plus-minus` | `circle-plus-minus` | square_ | circle | triangle_ | `happy-sad` | thumb | custom_ = js.native
  
  /**
    * Only applicable to [univariateColorSize](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html) renderers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#univariateTheme)
    */
  var univariateTheme: `high-to-low` | above | below | `above-and-below` = js.native
  
  /**
    * Contains authoring properties of visual variables generated from one of the Smart Mapping methods or sliders.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#visualVariables)
    */
  var visualVariables: js.Array[AuthoringInfoVisualVariable] = js.native
}
