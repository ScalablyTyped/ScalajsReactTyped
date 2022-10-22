package typingsJapgolly.weappApi.mod.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 设置
trait SettingOptions
  extends StObject
     with CommonCallbackOptions {
  
  @JSName("success")
  var success_SettingOptions: js.UndefOr[js.Function1[/* res */ AuthSetting, Unit]] = js.undefined
}
object SettingOptions {
  
  inline def apply(): SettingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingOptions]
  }
  
  extension [Self <: SettingOptions](x: Self) {
    
    inline def setSuccess(value: /* res */ AuthSetting => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ AuthSetting) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
