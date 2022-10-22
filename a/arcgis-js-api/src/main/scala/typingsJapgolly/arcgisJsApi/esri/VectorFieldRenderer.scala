package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.Magnitude
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`beaufort-ft`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`beaufort-km`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`beaufort-kn`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`beaufort-m`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`beaufort-mi`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`classified-arrow`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`flow-from`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`flow-to`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`ocean-current-kn`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`ocean-current-m`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`simple-scalar`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`single-arrow`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`vector-field`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`wind-barb`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VectorFieldRenderer
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * Attribute field presenting the magnitude.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-VectorFieldRenderer.html#attributeField)
    */
  var attributeField: Magnitude = js.native
  
  /**
    * Defines the flow direction of the data.
    *
    * @default "flow-from"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-VectorFieldRenderer.html#flowRepresentation)
    */
  var flowRepresentation: `flow-from` | `flow-to` = js.native
  
  /**
    * Predefined symbol styles used to represent the vector flow.
    *
    * @default "single-arrow"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-VectorFieldRenderer.html#style)
    */
  var style: `beaufort-ft` | `beaufort-km` | `beaufort-kn` | `beaufort-m` | `beaufort-mi` | `classified-arrow` | `ocean-current-kn` | `ocean-current-m` | `simple-scalar` | `single-arrow` | `wind-barb` = js.native
  
  /**
    * Determines the density of the symbols.
    *
    * @default 50
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-VectorFieldRenderer.html#symbolTileSize)
    */
  var symbolTileSize: Double = js.native
  
  /**
    * The type of Renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-VectorFieldRenderer.html#type)
    */
  val `type`: `vector-field` = js.native
  
  /**
    * An array of [VisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html) objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-VectorFieldRenderer.html#visualVariables)
    */
  var visualVariables: js.Array[VisualVariable] = js.native
}
