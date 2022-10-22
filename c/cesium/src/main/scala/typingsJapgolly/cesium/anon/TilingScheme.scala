package typingsJapgolly.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TilingScheme extends StObject {
  
  var ellipsoid: js.UndefOr[typingsJapgolly.cesium.mod.Ellipsoid] = js.undefined
  
  var tilingScheme: js.UndefOr[typingsJapgolly.cesium.mod.TilingScheme] = js.undefined
}
object TilingScheme {
  
  inline def apply(): TilingScheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TilingScheme]
  }
  
  extension [Self <: TilingScheme](x: Self) {
    
    inline def setEllipsoid(value: typingsJapgolly.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    inline def setTilingScheme(value: typingsJapgolly.cesium.mod.TilingScheme): Self = StObject.set(x, "tilingScheme", value.asInstanceOf[js.Any])
    
    inline def setTilingSchemeUndefined: Self = StObject.set(x, "tilingScheme", js.undefined)
  }
}
