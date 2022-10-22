package typingsJapgolly.wxServerSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoWithinOptions extends StObject {
  
  var geometry: Polygon | MultiPolygon
}
object GeoWithinOptions {
  
  inline def apply(geometry: Polygon | MultiPolygon): GeoWithinOptions = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoWithinOptions]
  }
  
  extension [Self <: GeoWithinOptions](x: Self) {
    
    inline def setGeometry(value: Polygon | MultiPolygon): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
  }
}
