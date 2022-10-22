package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcGISMapServiceCapabilitiesOperations
  extends StObject
     with Object {
  
  /**
    * Indicates if the service can generate images.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  var supportsExportMap: Boolean
  
  /**
    * Indicates if the tiles from the service can be exported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  var supportsExportTiles: Boolean
  
  /**
    * Indicates if the service supports the [identify operation](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-identify.html#identify).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  var supportsIdentify: Boolean
  
  /**
    * Indicates if features in the sublayers can be [queried](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#queryFeatures).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  var supportsQuery: Boolean
  
  /**
    * Indicates if the service exposes a tile map that describes the presence of tiles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  var supportsTileMap: Boolean
}
object ArcGISMapServiceCapabilitiesOperations {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    supportsExportMap: Boolean,
    supportsExportTiles: Boolean,
    supportsIdentify: Boolean,
    supportsQuery: Boolean,
    supportsTileMap: Boolean
  ): ArcGISMapServiceCapabilitiesOperations = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportsExportMap = supportsExportMap.asInstanceOf[js.Any], supportsExportTiles = supportsExportTiles.asInstanceOf[js.Any], supportsIdentify = supportsIdentify.asInstanceOf[js.Any], supportsQuery = supportsQuery.asInstanceOf[js.Any], supportsTileMap = supportsTileMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcGISMapServiceCapabilitiesOperations]
  }
  
  extension [Self <: ArcGISMapServiceCapabilitiesOperations](x: Self) {
    
    inline def setSupportsExportMap(value: Boolean): Self = StObject.set(x, "supportsExportMap", value.asInstanceOf[js.Any])
    
    inline def setSupportsExportTiles(value: Boolean): Self = StObject.set(x, "supportsExportTiles", value.asInstanceOf[js.Any])
    
    inline def setSupportsIdentify(value: Boolean): Self = StObject.set(x, "supportsIdentify", value.asInstanceOf[js.Any])
    
    inline def setSupportsQuery(value: Boolean): Self = StObject.set(x, "supportsQuery", value.asInstanceOf[js.Any])
    
    inline def setSupportsTileMap(value: Boolean): Self = StObject.set(x, "supportsTileMap", value.asInstanceOf[js.Any])
  }
}
