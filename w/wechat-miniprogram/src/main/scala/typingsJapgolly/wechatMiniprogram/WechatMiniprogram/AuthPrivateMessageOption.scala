package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthPrivateMessageOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[AuthPrivateMessageCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[AuthPrivateMessageFailCallback] = js.undefined
  
  /** shareTicket。可以从 wx.onShow 中获取。详情 [shareTicket](https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/share.html) */
  var shareTicket: String
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[AuthPrivateMessageSuccessCallback] = js.undefined
}
object AuthPrivateMessageOption {
  
  inline def apply(shareTicket: String): AuthPrivateMessageOption = {
    val __obj = js.Dynamic.literal(shareTicket = shareTicket.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthPrivateMessageOption]
  }
  
  extension [Self <: AuthPrivateMessageOption](x: Self) {
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setShareTicket(value: String): Self = StObject.set(x, "shareTicket", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* result */ AuthPrivateMessageSuccessCallbackResult => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* result */ AuthPrivateMessageSuccessCallbackResult) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
