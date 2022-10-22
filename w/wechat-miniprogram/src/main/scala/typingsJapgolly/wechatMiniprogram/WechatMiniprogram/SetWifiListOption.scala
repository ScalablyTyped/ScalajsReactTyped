package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetWifiListOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[SetWifiListCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[SetWifiListFailCallback] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[SetWifiListSuccessCallback] = js.undefined
  
  /** 提供预设的 Wi-Fi 信息列表 */
  var wifiList: js.Array[WifiData]
}
object SetWifiListOption {
  
  inline def apply(wifiList: js.Array[WifiData]): SetWifiListOption = {
    val __obj = js.Dynamic.literal(wifiList = wifiList.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetWifiListOption]
  }
  
  extension [Self <: SetWifiListOption](x: Self) {
    
    inline def setComplete(value: /* res */ WifiError => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* res */ WifiError) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ WifiError => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* res */ WifiError) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: /* res */ WifiError => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ WifiError) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setWifiList(value: js.Array[WifiData]): Self = StObject.set(x, "wifiList", value.asInstanceOf[js.Any])
    
    inline def setWifiListVarargs(value: WifiData*): Self = StObject.set(x, "wifiList", js.Array(value*))
  }
}
