package typingsJapgolly.uniApp

import typingsJapgolly.uniApp.uniAppStrings.oauth
import typingsJapgolly.uniApp.uniAppStrings.payment
import typingsJapgolly.uniApp.uniAppStrings.push
import typingsJapgolly.uniApp.uniAppStrings.share
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetProviderRes extends StObject {
  
  /**
    * 得到的服务供应商
    */
  var provider: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * 服务类型
    * - oauth: 授权登录
    * - share: 分享
    * - payment: 支付
    * - push: 推送
    */
  var service: js.UndefOr[oauth | share | payment | push] = js.undefined
}
object GetProviderRes {
  
  inline def apply(): GetProviderRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetProviderRes]
  }
  
  extension [Self <: GetProviderRes](x: Self) {
    
    inline def setProvider(value: js.Array[Any]): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setProviderVarargs(value: Any*): Self = StObject.set(x, "provider", js.Array(value*))
    
    inline def setService(value: oauth | share | payment | push): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
