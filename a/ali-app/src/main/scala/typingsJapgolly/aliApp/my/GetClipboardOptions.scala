package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region 剪贴板 https://docs.alipay.com/mini/api/clipboard
trait GetClipboardOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  var success_GetClipboardOptions: js.UndefOr[js.Function1[/* res */ Text, Unit]] = js.undefined
}
object GetClipboardOptions {
  
  inline def apply(): GetClipboardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetClipboardOptions]
  }
  
  extension [Self <: GetClipboardOptions](x: Self) {
    
    inline def setSuccess(value: /* res */ Text => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ Text) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
