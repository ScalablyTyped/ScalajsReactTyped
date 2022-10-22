package typingsJapgolly.minappEnv.wx

import typingsJapgolly.minappEnv.minappEnvStrings.`2g`
import typingsJapgolly.minappEnv.minappEnvStrings.`3g`
import typingsJapgolly.minappEnv.minappEnvStrings.`4g`
import typingsJapgolly.minappEnv.minappEnvStrings.none
import typingsJapgolly.minappEnv.minappEnvStrings.unknown
import typingsJapgolly.minappEnv.minappEnvStrings.wifi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnNetworkStatusChangeCallbackResult extends StObject {
  
  /** 当前是否有网络链接 */
  var isConnected: Boolean
  
  /** 网络类型
    *
    * 可选值：
    * - 'wifi': wifi 网络;
    * - '2g': 2g 网络;
    * - '3g': 3g 网络;
    * - '4g': 4g 网络;
    * - 'unknown': Android 下不常见的网络类型;
    * - 'none': 无网络; */
  var networkType: wifi | `2g` | `3g` | `4g` | unknown | none
}
object OnNetworkStatusChangeCallbackResult {
  
  inline def apply(isConnected: Boolean, networkType: wifi | `2g` | `3g` | `4g` | unknown | none): OnNetworkStatusChangeCallbackResult = {
    val __obj = js.Dynamic.literal(isConnected = isConnected.asInstanceOf[js.Any], networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnNetworkStatusChangeCallbackResult]
  }
  
  extension [Self <: OnNetworkStatusChangeCallbackResult](x: Self) {
    
    inline def setIsConnected(value: Boolean): Self = StObject.set(x, "isConnected", value.asInstanceOf[js.Any])
    
    inline def setNetworkType(value: wifi | `2g` | `3g` | `4g` | unknown | none): Self = StObject.set(x, "networkType", value.asInstanceOf[js.Any])
  }
}
