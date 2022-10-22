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
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`wind-barb`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VectorFieldRendererProperties extends StObject {
  
  /**
    * Attribute field presenting the magnitude.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-VectorFieldRenderer.html#attributeField)
    */
  var attributeField: js.UndefOr[Magnitude] = js.undefined
  
  /**
    * Defines the flow direction of the data.
    *
    * @default "flow-from"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-VectorFieldRenderer.html#flowRepresentation)
    */
  var flowRepresentation: js.UndefOr[`flow-from` | `flow-to`] = js.undefined
  
  /**
    * Predefined symbol styles used to represent the vector flow.
    *
    * @default "single-arrow"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-VectorFieldRenderer.html#style)
    */
  var style: js.UndefOr[
    `beaufort-ft` | `beaufort-km` | `beaufort-kn` | `beaufort-m` | `beaufort-mi` | `classified-arrow` | `ocean-current-kn` | `ocean-current-m` | `simple-scalar` | `single-arrow` | `wind-barb`
  ] = js.undefined
  
  /**
    * Determines the density of the symbols.
    *
    * @default 50
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-VectorFieldRenderer.html#symbolTileSize)
    */
  var symbolTileSize: js.UndefOr[Double] = js.undefined
  
  /**
    * An array of [VisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html) objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-VectorFieldRenderer.html#visualVariables)
    */
  var visualVariables: js.UndefOr[js.Array[VisualVariableProperties]] = js.undefined
}
object VectorFieldRendererProperties {
  
  inline def apply(): VectorFieldRendererProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VectorFieldRendererProperties]
  }
  
  extension [Self <: VectorFieldRendererProperties](x: Self) {
    
    inline def setAttributeField(value: Magnitude): Self = StObject.set(x, "attributeField", value.asInstanceOf[js.Any])
    
    inline def setAttributeFieldUndefined: Self = StObject.set(x, "attributeField", js.undefined)
    
    inline def setFlowRepresentation(value: `flow-from` | `flow-to`): Self = StObject.set(x, "flowRepresentation", value.asInstanceOf[js.Any])
    
    inline def setFlowRepresentationUndefined: Self = StObject.set(x, "flowRepresentation", js.undefined)
    
    inline def setStyle(
      value: `beaufort-ft` | `beaufort-km` | `beaufort-kn` | `beaufort-m` | `beaufort-mi` | `classified-arrow` | `ocean-current-kn` | `ocean-current-m` | `simple-scalar` | `single-arrow` | `wind-barb`
    ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSymbolTileSize(value: Double): Self = StObject.set(x, "symbolTileSize", value.asInstanceOf[js.Any])
    
    inline def setSymbolTileSizeUndefined: Self = StObject.set(x, "symbolTileSize", js.undefined)
    
    inline def setVisualVariables(value: js.Array[VisualVariableProperties]): Self = StObject.set(x, "visualVariables", value.asInstanceOf[js.Any])
    
    inline def setVisualVariablesUndefined: Self = StObject.set(x, "visualVariables", js.undefined)
    
    inline def setVisualVariablesVarargs(value: VisualVariableProperties*): Self = StObject.set(x, "visualVariables", js.Array(value*))
  }
}
