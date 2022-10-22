package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VectorTileLayerCapabilitiesExportMap
  extends StObject
     with Object {
  
  /**
    * Specifies the maximum number of tiles that can be exported to a cache dataset or a tile package.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#capabilities)
    */
  var maxExportTilesCount: Double
}
object VectorTileLayerCapabilitiesExportMap {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    maxExportTilesCount: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): VectorTileLayerCapabilitiesExportMap = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), maxExportTilesCount = maxExportTilesCount.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[VectorTileLayerCapabilitiesExportMap]
  }
  
  extension [Self <: VectorTileLayerCapabilitiesExportMap](x: Self) {
    
    inline def setMaxExportTilesCount(value: Double): Self = StObject.set(x, "maxExportTilesCount", value.asInstanceOf[js.Any])
  }
}
