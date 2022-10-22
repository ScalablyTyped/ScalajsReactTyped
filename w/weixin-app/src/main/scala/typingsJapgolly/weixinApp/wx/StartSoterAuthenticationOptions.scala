package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.weixinApp.anon.AuthMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSoterAuthenticationOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  // 挑战因子。挑战因子为调用者为此次生物鉴权准备的用于签名的字符串关键是别信息，将作为result_json的一部分，供调用者识别本次请求。例如：如果场景为请求用户对某订单进行授权确认，则可以将订单号填入此参数。
  var authContent: js.UndefOr[String] = js.undefined
  
  // 请求使用的可接受的生物认证方式
  var challenge: String
  
  var requestAuthModes: js.Array[AuthModes]
  
  // 验证描述，即识别过程中显示在界面上的对话框提示内容
  @JSName("success")
  var success_StartSoterAuthenticationOptions: js.UndefOr[js.Function1[/* res */ AuthMode, Unit]] = js.undefined
}
object StartSoterAuthenticationOptions {
  
  inline def apply(challenge: String, requestAuthModes: js.Array[AuthModes]): StartSoterAuthenticationOptions = {
    val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any], requestAuthModes = requestAuthModes.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSoterAuthenticationOptions]
  }
  
  extension [Self <: StartSoterAuthenticationOptions](x: Self) {
    
    inline def setAuthContent(value: String): Self = StObject.set(x, "authContent", value.asInstanceOf[js.Any])
    
    inline def setAuthContentUndefined: Self = StObject.set(x, "authContent", js.undefined)
    
    inline def setChallenge(value: String): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
    
    inline def setRequestAuthModes(value: js.Array[AuthModes]): Self = StObject.set(x, "requestAuthModes", value.asInstanceOf[js.Any])
    
    inline def setRequestAuthModesVarargs(value: AuthModes*): Self = StObject.set(x, "requestAuthModes", js.Array(value*))
    
    inline def setSuccess(value: /* res */ AuthMode => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ AuthMode) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
