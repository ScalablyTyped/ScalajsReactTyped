package typingsJapgolly.alipayjssdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Characteristic extends StObject {
  
  /** 设备特征值信息 */
  var characteristic: Value
}
object Characteristic {
  
  inline def apply(characteristic: Value): Characteristic = {
    val __obj = js.Dynamic.literal(characteristic = characteristic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Characteristic]
  }
  
  extension [Self <: Characteristic](x: Self) {
    
    inline def setCharacteristic(value: Value): Self = StObject.set(x, "characteristic", value.asInstanceOf[js.Any])
  }
}
