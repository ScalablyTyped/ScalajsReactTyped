package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.`2g`
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.`3g`
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.`4g`
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.`5g`
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.none
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.unknown
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.wifi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNetworkTypeSuccessCallbackResult extends StObject {
  
  var errMsg: String
  
  /** 网络类型
    *
    * 可选值：
    * - 'wifi': wifi 网络;
    * - '2g': 2g 网络;
    * - '3g': 3g 网络;
    * - '4g': 4g 网络;
    * - '5g': 5g 网络;
    * - 'unknown': Android 下不常见的网络类型;
    * - 'none': 无网络; */
  var networkType: wifi | `2g` | `3g` | `4g` | `5g` | unknown | none
  
  /** 信号强弱，单位 dbm */
  var signalStrength: Double
}
object GetNetworkTypeSuccessCallbackResult {
  
  inline def apply(
    errMsg: String,
    networkType: wifi | `2g` | `3g` | `4g` | `5g` | unknown | none,
    signalStrength: Double
  ): GetNetworkTypeSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], networkType = networkType.asInstanceOf[js.Any], signalStrength = signalStrength.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNetworkTypeSuccessCallbackResult]
  }
  
  extension [Self <: GetNetworkTypeSuccessCallbackResult](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setNetworkType(value: wifi | `2g` | `3g` | `4g` | `5g` | unknown | none): Self = StObject.set(x, "networkType", value.asInstanceOf[js.Any])
    
    inline def setSignalStrength(value: Double): Self = StObject.set(x, "signalStrength", value.asInstanceOf[js.Any])
  }
}
