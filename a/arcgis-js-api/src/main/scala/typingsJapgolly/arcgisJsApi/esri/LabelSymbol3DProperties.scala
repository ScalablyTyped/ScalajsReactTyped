package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelSymbol3DProperties
  extends StObject
     with Symbol3DProperties {
  
  /**
    * Settings for adding a callout visualization to the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html#callout)
    */
  var callout: js.UndefOr[Callout3DProperties] = js.undefined
  
  /**
    * A Collection of [Symbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3DLayer.html) objects used to visualize the graphic or feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html#symbolLayers)
    */
  @JSName("symbolLayers")
  var symbolLayers_LabelSymbol3DProperties: js.UndefOr[CollectionProperties[TextSymbol3DLayerProperties]] = js.undefined
  
  /**
    * Shifts the symbol along the vertical world axis by a given height.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html#verticalOffset)
    */
  var verticalOffset: js.UndefOr[LabelSymbol3DVerticalOffsetProperties] = js.undefined
}
object LabelSymbol3DProperties {
  
  inline def apply(): LabelSymbol3DProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelSymbol3DProperties]
  }
  
  extension [Self <: LabelSymbol3DProperties](x: Self) {
    
    inline def setCallout(value: Callout3DProperties): Self = StObject.set(x, "callout", value.asInstanceOf[js.Any])
    
    inline def setCalloutUndefined: Self = StObject.set(x, "callout", js.undefined)
    
    inline def setSymbolLayers(value: CollectionProperties[TextSymbol3DLayerProperties]): Self = StObject.set(x, "symbolLayers", value.asInstanceOf[js.Any])
    
    inline def setSymbolLayersUndefined: Self = StObject.set(x, "symbolLayers", js.undefined)
    
    inline def setSymbolLayersVarargs(value: TextSymbol3DLayerProperties*): Self = StObject.set(x, "symbolLayers", js.Array(value*))
    
    inline def setVerticalOffset(value: LabelSymbol3DVerticalOffsetProperties): Self = StObject.set(x, "verticalOffset", value.asInstanceOf[js.Any])
    
    inline def setVerticalOffsetUndefined: Self = StObject.set(x, "verticalOffset", js.undefined)
  }
}
