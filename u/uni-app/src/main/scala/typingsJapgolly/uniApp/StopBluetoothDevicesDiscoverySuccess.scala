package typingsJapgolly.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopBluetoothDevicesDiscoverySuccess extends StObject {
  
  /**
    * 成功：ok，错误：详细信息
    */
  var errMsg: js.UndefOr[String] = js.undefined
}
object StopBluetoothDevicesDiscoverySuccess {
  
  inline def apply(): StopBluetoothDevicesDiscoverySuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopBluetoothDevicesDiscoverySuccess]
  }
  
  extension [Self <: StopBluetoothDevicesDiscoverySuccess](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setErrMsgUndefined: Self = StObject.set(x, "errMsg", js.undefined)
  }
}
