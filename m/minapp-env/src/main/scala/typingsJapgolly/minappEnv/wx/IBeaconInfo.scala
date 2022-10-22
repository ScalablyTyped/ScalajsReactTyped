package typingsJapgolly.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBeaconInfo extends StObject {
  
  /** iBeacon 设备的距离 */
  var accuracy: Double
  
  /** iBeacon 设备的主 id */
  var major: String
  
  /** iBeacon 设备的次 id */
  var minor: String
  
  /** 表示设备距离的枚举值 */
  var proximity: Double
  
  /** 表示设备的信号强度 */
  var rssi: Double
  
  /** iBeacon 设备广播的 uuid */
  var uuid: String
}
object IBeaconInfo {
  
  inline def apply(accuracy: Double, major: String, minor: String, proximity: Double, rssi: Double, uuid: String): IBeaconInfo = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], proximity = proximity.asInstanceOf[js.Any], rssi = rssi.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBeaconInfo]
  }
  
  extension [Self <: IBeaconInfo](x: Self) {
    
    inline def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    inline def setMajor(value: String): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    inline def setMinor(value: String): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
    
    inline def setProximity(value: Double): Self = StObject.set(x, "proximity", value.asInstanceOf[js.Any])
    
    inline def setRssi(value: Double): Self = StObject.set(x, "rssi", value.asInstanceOf[js.Any])
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
