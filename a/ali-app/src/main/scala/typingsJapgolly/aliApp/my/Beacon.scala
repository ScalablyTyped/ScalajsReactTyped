package typingsJapgolly.aliApp.my

import typingsJapgolly.aliApp.aliAppInts.`0`
import typingsJapgolly.aliApp.aliAppInts.`1`
import typingsJapgolly.aliApp.aliAppInts.`2`
import typingsJapgolly.aliApp.aliAppInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Beacon extends StObject {
  
  /** iBeacon 设备的距离 */
  var accuracy: Double
  
  /** iBeacon 设备的主 id */
  var major: String
  
  /** iBeacon 设备的次 id */
  var minor: String
  
  /** 表示设备距离的枚举值(0-3分别代表：未知、极近、近、远) */
  var proximity: `0` | `1` | `2` | `3`
  
  /** iBeacon 信号强度 */
  var rssi: Double
  
  /** iBeacon 设备广播的 uuid */
  var uuid: String
}
object Beacon {
  
  inline def apply(
    accuracy: Double,
    major: String,
    minor: String,
    proximity: `0` | `1` | `2` | `3`,
    rssi: Double,
    uuid: String
  ): Beacon = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], proximity = proximity.asInstanceOf[js.Any], rssi = rssi.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Beacon]
  }
  
  extension [Self <: Beacon](x: Self) {
    
    inline def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    inline def setMajor(value: String): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    inline def setMinor(value: String): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
    
    inline def setProximity(value: `0` | `1` | `2` | `3`): Self = StObject.set(x, "proximity", value.asInstanceOf[js.Any])
    
    inline def setRssi(value: Double): Self = StObject.set(x, "rssi", value.asInstanceOf[js.Any])
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
