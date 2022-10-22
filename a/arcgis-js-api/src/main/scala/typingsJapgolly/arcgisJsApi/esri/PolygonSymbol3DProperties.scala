package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.anon.ExtrudeSymbol3DLayerPrope
import typingsJapgolly.arcgisJsApi.anon.FillSymbol3DLayerProperti
import typingsJapgolly.arcgisJsApi.anon.IconSymbol3DLayerProperti
import typingsJapgolly.arcgisJsApi.anon.LineSymbol3DLayerProperti
import typingsJapgolly.arcgisJsApi.anon.ObjectSymbol3DLayerProper
import typingsJapgolly.arcgisJsApi.anon.TextSymbol3DLayerProperti
import typingsJapgolly.arcgisJsApi.anon.WaterSymbol3DLayerPropert
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolygonSymbol3DProperties
  extends StObject
     with Symbol3DProperties {
  
  /**
    * A Collection of [Symbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3DLayer.html) objects used to visualize the graphic or feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PolygonSymbol3D.html#symbolLayers)
    */
  @JSName("symbolLayers")
  var symbolLayers_PolygonSymbol3DProperties: js.UndefOr[
    CollectionProperties[
      ExtrudeSymbol3DLayerPrope | FillSymbol3DLayerProperti | IconSymbol3DLayerProperti | LineSymbol3DLayerProperti | ObjectSymbol3DLayerProper | TextSymbol3DLayerProperti | WaterSymbol3DLayerPropert
    ]
  ] = js.undefined
}
object PolygonSymbol3DProperties {
  
  inline def apply(): PolygonSymbol3DProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolygonSymbol3DProperties]
  }
  
  extension [Self <: PolygonSymbol3DProperties](x: Self) {
    
    inline def setSymbolLayers(
      value: CollectionProperties[
          ExtrudeSymbol3DLayerPrope | FillSymbol3DLayerProperti | IconSymbol3DLayerProperti | LineSymbol3DLayerProperti | ObjectSymbol3DLayerProper | TextSymbol3DLayerProperti | WaterSymbol3DLayerPropert
        ]
    ): Self = StObject.set(x, "symbolLayers", value.asInstanceOf[js.Any])
    
    inline def setSymbolLayersUndefined: Self = StObject.set(x, "symbolLayers", js.undefined)
    
    inline def setSymbolLayersVarargs(
      value: (ExtrudeSymbol3DLayerPrope | FillSymbol3DLayerProperti | IconSymbol3DLayerProperti | LineSymbol3DLayerProperti | ObjectSymbol3DLayerProper | TextSymbol3DLayerProperti | WaterSymbol3DLayerPropert)*
    ): Self = StObject.set(x, "symbolLayers", js.Array(value*))
  }
}
