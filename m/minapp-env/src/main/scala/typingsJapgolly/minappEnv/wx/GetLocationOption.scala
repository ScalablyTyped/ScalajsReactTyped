package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLocationOption extends StObject {
  
  /** 传入 true 会返回高度信息，由于获取高度需要较高精确度，会减慢接口返回速度
    *
    * 最低基础库： `1.6.0` */
  var altitude: js.UndefOr[String] = js.undefined
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[GetLocationCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[GetLocationFailCallback] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[GetLocationSuccessCallback] = js.undefined
  
  /** wgs84 返回 gps 坐标，gcj02 返回可用于 wx.openLocation 的坐标 */
  var `type`: js.UndefOr[String] = js.undefined
}
object GetLocationOption {
  
  inline def apply(): GetLocationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLocationOption]
  }
  
  extension [Self <: GetLocationOption](x: Self) {
    
    inline def setAltitude(value: String): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    inline def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: /* result */ GetLocationSuccessCallbackResult => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* result */ GetLocationSuccessCallbackResult) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
