package typingsJapgolly.wegameApi.wx.types

import japgolly.scalajs.react.Callback
import typingsJapgolly.wegameApi.anon.EncryptedData
import typingsJapgolly.wegameApi.wegameApiStrings.en
import typingsJapgolly.wegameApi.wegameApiStrings.zh_CN
import typingsJapgolly.wegameApi.wegameApiStrings.zh_TW
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * wx.getUserInfo的旧版本API参数，随时会被删除，不推荐使用
  */
trait OldUserInfoParam extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 显示用户信息的语言
    */
  var lang: js.UndefOr[en | zh_CN | zh_TW] = js.undefined
  
  var success: js.UndefOr[js.Function1[/* res */ EncryptedData, Unit]] = js.undefined
  
  /**
    * 是否带上登录态信息。当 withCredentials 为 true 时，要求此前有调用过 wx.login 且登录态尚未过期，此时返回的数据会包含 encryptedData, iv 等敏感信息；当 withCredentials 为 false 时，不要求有登录态，返回的数据不包含 encryptedData, iv 等敏感信息。
    */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}
object OldUserInfoParam {
  
  inline def apply(): OldUserInfoParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OldUserInfoParam]
  }
  
  extension [Self <: OldUserInfoParam](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: Callback): Self = StObject.set(x, "fail", value.toJsFn)
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setLang(value: en | zh_CN | zh_TW): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setSuccess(value: /* res */ EncryptedData => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ EncryptedData) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
