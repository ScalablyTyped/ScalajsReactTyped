package typingsJapgolly.maplibreGl.mod

import typingsJapgolly.maplibreGl.maplibreGlStrings.`raster-dem`
import typingsJapgolly.maplibreGl.maplibreGlStrings.mapbox
import typingsJapgolly.maplibreGl.maplibreGlStrings.terrarium
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterDEMSourceSpecification
  extends StObject
     with SourceSpecification {
  
  var attribution: js.UndefOr[String] = js.undefined
  
  var bounds: js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.undefined
  
  var encoding: js.UndefOr[terrarium | mapbox] = js.undefined
  
  var maxzoom: js.UndefOr[Double] = js.undefined
  
  var minzoom: js.UndefOr[Double] = js.undefined
  
  var tileSize: js.UndefOr[Double] = js.undefined
  
  var tiles: js.UndefOr[js.Array[String]] = js.undefined
  
  var `type`: `raster-dem`
  
  var url: js.UndefOr[String] = js.undefined
  
  var volatile: js.UndefOr[Boolean] = js.undefined
}
object RasterDEMSourceSpecification {
  
  inline def apply(): RasterDEMSourceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("raster-dem")
    __obj.asInstanceOf[RasterDEMSourceSpecification]
  }
  
  extension [Self <: RasterDEMSourceSpecification](x: Self) {
    
    inline def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    inline def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    inline def setBounds(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setEncoding(value: terrarium | mapbox): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setMaxzoom(value: Double): Self = StObject.set(x, "maxzoom", value.asInstanceOf[js.Any])
    
    inline def setMaxzoomUndefined: Self = StObject.set(x, "maxzoom", js.undefined)
    
    inline def setMinzoom(value: Double): Self = StObject.set(x, "minzoom", value.asInstanceOf[js.Any])
    
    inline def setMinzoomUndefined: Self = StObject.set(x, "minzoom", js.undefined)
    
    inline def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
    
    inline def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
    
    inline def setTiles(value: js.Array[String]): Self = StObject.set(x, "tiles", value.asInstanceOf[js.Any])
    
    inline def setTilesUndefined: Self = StObject.set(x, "tiles", js.undefined)
    
    inline def setTilesVarargs(value: String*): Self = StObject.set(x, "tiles", js.Array(value*))
    
    inline def setType(value: `raster-dem`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setVolatile(value: Boolean): Self = StObject.set(x, "volatile", value.asInstanceOf[js.Any])
    
    inline def setVolatileUndefined: Self = StObject.set(x, "volatile", js.undefined)
  }
}
