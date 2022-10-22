package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import typingsJapgolly.uniApp.uniAppStrings.oauth
import typingsJapgolly.uniApp.uniAppStrings.payment
import typingsJapgolly.uniApp.uniAppStrings.push
import typingsJapgolly.uniApp.uniAppStrings.share
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetProviderOptions extends StObject {
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 服务类型，可取值“oauth”、“share”、“payment”、“push”
    * - oauth: 授权登录
    * - share: 分享
    * - payment: 支付
    * - push: 推送
    */
  var service: js.UndefOr[oauth | share | payment | push] = js.undefined
  
  /**
    * 接口调用成功的回调
    */
  var success: js.UndefOr[js.Function1[/* result */ GetProviderRes, Unit]] = js.undefined
}
object GetProviderOptions {
  
  inline def apply(): GetProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetProviderOptions]
  }
  
  extension [Self <: GetProviderOptions](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: Callback): Self = StObject.set(x, "fail", value.toJsFn)
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setService(value: oauth | share | payment | push): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    inline def setSuccess(value: /* result */ GetProviderRes => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* result */ GetProviderRes) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
