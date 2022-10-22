package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 图片覆盖的经纬度范围 */
trait MapBounds extends StObject {
  
  /** 东北角经纬度 */
  var northeast: MapPostion
  
  /** 西南角经纬度 */
  var southwest: MapPostion
}
object MapBounds {
  
  inline def apply(northeast: MapPostion, southwest: MapPostion): MapBounds = {
    val __obj = js.Dynamic.literal(northeast = northeast.asInstanceOf[js.Any], southwest = southwest.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapBounds]
  }
  
  extension [Self <: MapBounds](x: Self) {
    
    inline def setNortheast(value: MapPostion): Self = StObject.set(x, "northeast", value.asInstanceOf[js.Any])
    
    inline def setSouthwest(value: MapPostion): Self = StObject.set(x, "southwest", value.asInstanceOf[js.Any])
  }
}
