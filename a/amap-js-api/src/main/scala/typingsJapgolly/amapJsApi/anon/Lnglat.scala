package typingsJapgolly.amapJsApi.anon

import typingsJapgolly.amapJsApi.AMap.LngLat
import typingsJapgolly.amapJsApi.AMap.Pixel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lnglat[I] extends StObject {
  
  /**
    * 经纬度坐标
    */
  var lnglat: LngLat
  
  /**
    * 像素坐标
    */
  var pixel: Pixel
  
  /**
    * 触发对象
    */
  var target: I
}
object Lnglat {
  
  inline def apply[I](lnglat: LngLat, pixel: Pixel, target: I): Lnglat[I] = {
    val __obj = js.Dynamic.literal(lnglat = lnglat.asInstanceOf[js.Any], pixel = pixel.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lnglat[I]]
  }
  
  extension [Self <: Lnglat[?], I](x: Self & Lnglat[I]) {
    
    inline def setLnglat(value: LngLat): Self = StObject.set(x, "lnglat", value.asInstanceOf[js.Any])
    
    inline def setPixel(value: Pixel): Self = StObject.set(x, "pixel", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: I): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
