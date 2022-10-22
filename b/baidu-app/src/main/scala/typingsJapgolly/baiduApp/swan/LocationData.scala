package typingsJapgolly.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region 位置API列表
// 位置-----获取位置
trait LocationData extends StObject {
  
  /** 位置的精确度 */
  var accuracy: Double
  
  /** 纬度，浮点数，范围为-90~90，负数表示南纬 */
  var latitude: Double
  
  /** 经度，浮点数，范围为-180~180，负数表示西经 */
  var longitude: Double
  
  /** 速度，浮点数，单位m/s */
  var speed: Double
}
object LocationData {
  
  inline def apply(accuracy: Double, latitude: Double, longitude: Double, speed: Double): LocationData = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationData]
  }
  
  extension [Self <: LocationData](x: Self) {
    
    inline def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
  }
}
