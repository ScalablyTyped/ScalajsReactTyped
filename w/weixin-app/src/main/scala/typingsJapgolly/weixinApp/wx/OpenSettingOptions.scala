package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.weixinApp.anon.AuthSetting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenSettingOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  var success_OpenSettingOptions: js.UndefOr[js.Function1[/* res */ AuthSetting, Unit]] = js.undefined
}
object OpenSettingOptions {
  
  inline def apply(): OpenSettingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenSettingOptions]
  }
  
  extension [Self <: OpenSettingOptions](x: Self) {
    
    inline def setSuccess(value: /* res */ AuthSetting => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ AuthSetting) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
