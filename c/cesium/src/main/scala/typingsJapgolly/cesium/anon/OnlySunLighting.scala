package typingsJapgolly.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnlySunLighting extends StObject {
  
  var ellipsoid: js.UndefOr[typingsJapgolly.cesium.mod.Ellipsoid] = js.undefined
  
  var onlySunLighting: js.UndefOr[Boolean] = js.undefined
  
  var show: js.UndefOr[Boolean] = js.undefined
  
  var textureUrl: js.UndefOr[String] = js.undefined
}
object OnlySunLighting {
  
  inline def apply(): OnlySunLighting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnlySunLighting]
  }
  
  extension [Self <: OnlySunLighting](x: Self) {
    
    inline def setEllipsoid(value: typingsJapgolly.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    inline def setOnlySunLighting(value: Boolean): Self = StObject.set(x, "onlySunLighting", value.asInstanceOf[js.Any])
    
    inline def setOnlySunLightingUndefined: Self = StObject.set(x, "onlySunLighting", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setTextureUrl(value: String): Self = StObject.set(x, "textureUrl", value.asInstanceOf[js.Any])
    
    inline def setTextureUrlUndefined: Self = StObject.set(x, "textureUrl", js.undefined)
  }
}
