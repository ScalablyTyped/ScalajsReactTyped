package typingsJapgolly.wxJsSdkDt.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * openAddress的调用参数
  */
trait OpenAddressConfig
  extends StObject
     with WxBaseRequestConfig {
  
  /**
    * 成功回调
    */
  @JSName("success")
  var success_OpenAddressConfig: js.UndefOr[js.Function1[/* res */ OpenAddressResponse, Unit]] = js.undefined
}
object OpenAddressConfig {
  
  inline def apply(): OpenAddressConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenAddressConfig]
  }
  
  extension [Self <: OpenAddressConfig](x: Self) {
    
    inline def setSuccess(value: /* res */ OpenAddressResponse => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ OpenAddressResponse) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
