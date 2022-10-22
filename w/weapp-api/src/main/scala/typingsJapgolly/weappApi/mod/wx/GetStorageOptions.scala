package typingsJapgolly.weappApi.mod.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStorageOptions extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ResponseCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ResponseCallback] = js.undefined
  
  /** 本地缓存中的指定的 key */
  var key: String
  
  /** 接口调用的回调函数,res = {data: key对应的内容} */
  def success(res: DataResponse): Unit
  /** 接口调用的回调函数,res = {data: key对应的内容} */
  @JSName("success")
  var success_Original: DataResponseCallback
}
object GetStorageOptions {
  
  inline def apply(key: String, success: /* res */ DataResponse => Callback): GetStorageOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], success = js.Any.fromFunction1((t0: /* res */ DataResponse) => success(t0).runNow()))
    __obj.asInstanceOf[GetStorageOptions]
  }
  
  extension [Self <: GetStorageOptions](x: Self) {
    
    inline def setComplete(value: /* res */ Any => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* res */ Any) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ Any => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* res */ Any) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ DataResponse => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ DataResponse) => value(t0).runNow()))
  }
}
