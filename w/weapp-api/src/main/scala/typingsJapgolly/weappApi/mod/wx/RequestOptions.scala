package typingsJapgolly.weappApi.mod.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestOptions extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ResponseCallback] = js.undefined
  
  /** 请求的参数 */
  var data: js.UndefOr[String | Any] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ResponseCallback] = js.undefined
  
  /** 设置请求的 header , header 中不能设置 Referer */
  var header: js.UndefOr[RequestHeader] = js.undefined
  
  /** 默认为 GET，有效值：OPTIONS, GET, HEAD, POST, PUT, DELETE, TRACE, CONNECT */
  var method: js.UndefOr[String] = js.undefined
  
  /** 收到开发者服务成功返回的回调函数，res = {data: '开发者服务器返回的内容'} */
  var success: js.UndefOr[DataResponseCallback] = js.undefined
  
  /** 开发者服务器接口地址 */
  var url: String
}
object RequestOptions {
  
  inline def apply(url: String): RequestOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
  
  extension [Self <: RequestOptions](x: Self) {
    
    inline def setComplete(value: /* res */ Any => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* res */ Any) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setData(value: String | Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFail(value: /* res */ Any => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* res */ Any) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setHeader(value: RequestHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setSuccess(value: /* res */ DataResponse => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ DataResponse) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
