package typingsJapgolly.aliApp.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ali-app.my.AlertOptions> */
trait PartialAlertOptions extends StObject {
  
  var buttonText: js.UndefOr[String] = js.undefined
  
  var complete: js.UndefOr[js.Function1[/* res */ Any, Unit]] = js.undefined
  
  var content: js.UndefOr[String] = js.undefined
  
  var fail: js.UndefOr[js.Function1[/* res */ Any, Unit]] = js.undefined
  
  var success: js.UndefOr[js.Function1[/* res */ Any, Unit]] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object PartialAlertOptions {
  
  inline def apply(): PartialAlertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAlertOptions]
  }
  
  extension [Self <: PartialAlertOptions](x: Self) {
    
    inline def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
    
    inline def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
    
    inline def setComplete(value: /* res */ Any => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* res */ Any) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setFail(value: /* res */ Any => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* res */ Any) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: /* res */ Any => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ Any) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
