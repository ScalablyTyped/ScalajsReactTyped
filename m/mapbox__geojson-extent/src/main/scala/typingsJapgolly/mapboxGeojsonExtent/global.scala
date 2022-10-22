package typingsJapgolly.mapboxGeojsonExtent

import typingsJapgolly.geojson.mod.BBox
import typingsJapgolly.geojson.mod.GeoJSON
import typingsJapgolly.geojson.mod.Polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object bbox {
    
    inline def apply(geoJson: GeoJSON): BBox = ^.asInstanceOf[js.Dynamic].apply(geoJson.asInstanceOf[js.Any]).asInstanceOf[BBox]
    
    @JSGlobal("bbox")
    @js.native
    val ^ : js.Any = js.native
    
    inline def bboxify(geoJson: GeoJSON): GeoJSON = ^.asInstanceOf[js.Dynamic].applyDynamic("bboxify")(geoJson.asInstanceOf[js.Any]).asInstanceOf[GeoJSON]
    
    inline def polygon(geoJson: GeoJSON): Polygon | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("polygon")(geoJson.asInstanceOf[js.Any]).asInstanceOf[Polygon | Null]
  }
}
