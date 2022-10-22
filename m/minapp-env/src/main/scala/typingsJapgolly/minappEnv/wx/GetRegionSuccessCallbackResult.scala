package typingsJapgolly.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRegionSuccessCallbackResult extends StObject {
  
  /** 东北角经纬度 */
  var northeast: Double
  
  /** 西南角经纬度 */
  var southwest: Double
}
object GetRegionSuccessCallbackResult {
  
  inline def apply(northeast: Double, southwest: Double): GetRegionSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(northeast = northeast.asInstanceOf[js.Any], southwest = southwest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRegionSuccessCallbackResult]
  }
  
  extension [Self <: GetRegionSuccessCallbackResult](x: Self) {
    
    inline def setNortheast(value: Double): Self = StObject.set(x, "northeast", value.asInstanceOf[js.Any])
    
    inline def setSouthwest(value: Double): Self = StObject.set(x, "southwest", value.asInstanceOf[js.Any])
  }
}
