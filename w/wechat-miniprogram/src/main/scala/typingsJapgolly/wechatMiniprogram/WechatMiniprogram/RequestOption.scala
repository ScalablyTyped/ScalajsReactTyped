package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import japgolly.scalajs.react.Callback
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.CONNECT
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.DELETE
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.GET
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.HEAD
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.OPTIONS
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.POST
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.PUT
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.TRACE
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.arraybuffer
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.json
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.text
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.其他
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestOption[T /* <: String | IAnyObject | js.typedarray.ArrayBuffer */] extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[RequestCompleteCallback] = js.undefined
  
  /** 请求的参数 */
  var data: js.UndefOr[String | IAnyObject | js.typedarray.ArrayBuffer] = js.undefined
  
  /** 返回的数据格式
    *
    * 可选值：
    * - 'json': 返回的数据为 JSON，返回后会对返回的数据进行一次 JSON.parse;
    * - '其他': 不对返回的内容进行 JSON.parse; */
  var dataType: js.UndefOr[json | 其他] = js.undefined
  
  /** 开启 cache
    *
    * 最低基础库： `2.10.4` */
  var enableCache: js.UndefOr[Boolean] = js.undefined
  
  /** 开启 http2
    *
    * 最低基础库： `2.10.4` */
  var enableHttp2: js.UndefOr[Boolean] = js.undefined
  
  /** 开启 quic
    *
    * 最低基础库： `2.10.4` */
  var enableQuic: js.UndefOr[Boolean] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[RequestFailCallback] = js.undefined
  
  /** 设置请求的 header，header 中不能设置 Referer。
    *
    * `content-type` 默认为 `application/json` */
  var header: js.UndefOr[IAnyObject] = js.undefined
  
  /** HTTP 请求方法
    *
    * 可选值：
    * - 'OPTIONS': HTTP 请求 OPTIONS;
    * - 'GET': HTTP 请求 GET;
    * - 'HEAD': HTTP 请求 HEAD;
    * - 'POST': HTTP 请求 POST;
    * - 'PUT': HTTP 请求 PUT;
    * - 'DELETE': HTTP 请求 DELETE;
    * - 'TRACE': HTTP 请求 TRACE;
    * - 'CONNECT': HTTP 请求 CONNECT; */
  var method: js.UndefOr[OPTIONS | GET | HEAD | POST | PUT | DELETE | TRACE | CONNECT] = js.undefined
  
  /** 响应的数据类型
    *
    * 可选值：
    * - 'text': 响应的数据为文本;
    * - 'arraybuffer': 响应的数据为 ArrayBuffer;
    *
    * 最低基础库： `1.7.0` */
  var responseType: js.UndefOr[text | arraybuffer] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[RequestSuccessCallback[T]] = js.undefined
  
  /** 超时时间，单位为毫秒
    *
    * 最低基础库： `2.10.0` */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /** 开发者服务器接口地址 */
  var url: String
}
object RequestOption {
  
  inline def apply[T /* <: String | IAnyObject | js.typedarray.ArrayBuffer */](url: String): RequestOption[T] = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOption[T]]
  }
  
  extension [Self <: RequestOption[?], T /* <: String | IAnyObject | js.typedarray.ArrayBuffer */](x: Self & RequestOption[T]) {
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setData(value: String | IAnyObject | js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataType(value: json | 其他): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setEnableCache(value: Boolean): Self = StObject.set(x, "enableCache", value.asInstanceOf[js.Any])
    
    inline def setEnableCacheUndefined: Self = StObject.set(x, "enableCache", js.undefined)
    
    inline def setEnableHttp2(value: Boolean): Self = StObject.set(x, "enableHttp2", value.asInstanceOf[js.Any])
    
    inline def setEnableHttp2Undefined: Self = StObject.set(x, "enableHttp2", js.undefined)
    
    inline def setEnableQuic(value: Boolean): Self = StObject.set(x, "enableQuic", value.asInstanceOf[js.Any])
    
    inline def setEnableQuicUndefined: Self = StObject.set(x, "enableQuic", js.undefined)
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setHeader(value: IAnyObject): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setMethod(value: OPTIONS | GET | HEAD | POST | PUT | DELETE | TRACE | CONNECT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setResponseType(value: text | arraybuffer): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    inline def setSuccess(value: /* result */ RequestSuccessCallbackResult[T] => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* result */ RequestSuccessCallbackResult[T]) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
