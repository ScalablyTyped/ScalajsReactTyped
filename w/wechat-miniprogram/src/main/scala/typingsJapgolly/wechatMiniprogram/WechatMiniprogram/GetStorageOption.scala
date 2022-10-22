package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStorageOption[T] extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[GetStorageCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[GetStorageFailCallback] = js.undefined
  
  /** 本地缓存中指定的 key */
  var key: String
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[GetStorageSuccessCallback[T]] = js.undefined
}
object GetStorageOption {
  
  inline def apply[T](key: String): GetStorageOption[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStorageOption[T]]
  }
  
  extension [Self <: GetStorageOption[?], T](x: Self & GetStorageOption[T]) {
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* result */ GetStorageSuccessCallbackResult[T] => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* result */ GetStorageSuccessCallbackResult[T]) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
