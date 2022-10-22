package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import japgolly.scalajs.react.Callback
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.facial
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.fingerPrint
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.speech
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSoterAuthenticationOption extends StObject {
  
  /** 验证描述，即识别过程中显示在界面上的对话框提示内容 */
  var authContent: js.UndefOr[String] = js.undefined
  
  /** 挑战因子。挑战因子为调用者为此次生物鉴权准备的用于签名的字符串关键识别信息，将作为 `resultJSON` 的一部分，供调用者识别本次请求。例如：如果场景为请求用户对某订单进行授权确认，则可以将订单号填入此参数。 */
  var challenge: String
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[StartSoterAuthenticationCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[StartSoterAuthenticationFailCallback] = js.undefined
  
  /** 请求使用的可接受的生物认证方式
    *
    * 可选值：
    * - 'fingerPrint': 指纹识别;
    * - 'facial': 人脸识别;
    * - 'speech': 声纹识别（暂未支持）; */
  var requestAuthModes: js.Array[fingerPrint | facial | speech]
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[StartSoterAuthenticationSuccessCallback] = js.undefined
}
object StartSoterAuthenticationOption {
  
  inline def apply(challenge: String, requestAuthModes: js.Array[fingerPrint | facial | speech]): StartSoterAuthenticationOption = {
    val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any], requestAuthModes = requestAuthModes.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSoterAuthenticationOption]
  }
  
  extension [Self <: StartSoterAuthenticationOption](x: Self) {
    
    inline def setAuthContent(value: String): Self = StObject.set(x, "authContent", value.asInstanceOf[js.Any])
    
    inline def setAuthContentUndefined: Self = StObject.set(x, "authContent", js.undefined)
    
    inline def setChallenge(value: String): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setRequestAuthModes(value: js.Array[fingerPrint | facial | speech]): Self = StObject.set(x, "requestAuthModes", value.asInstanceOf[js.Any])
    
    inline def setRequestAuthModesVarargs(value: (fingerPrint | facial | speech)*): Self = StObject.set(x, "requestAuthModes", js.Array(value*))
    
    inline def setSuccess(value: /* result */ StartSoterAuthenticationSuccessCallbackResult => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* result */ StartSoterAuthenticationSuccessCallbackResult) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
