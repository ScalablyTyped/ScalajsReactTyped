package typingsJapgolly.xEditable

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XEditableSubmitOptions extends StObject {
  
  var ajaxOptions: js.UndefOr[Any] = js.undefined
  
  var data: js.UndefOr[Any] = js.undefined
  
  def error(obj: Any): Unit
  
  def success(obj: Any, config: Any): Unit
  
  var url: js.UndefOr[Any] = js.undefined
}
object XEditableSubmitOptions {
  
  inline def apply(error: Any => Callback, success: (Any, Any) => Callback): XEditableSubmitOptions = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1((t0: Any) => error(t0).runNow()), success = js.Any.fromFunction2((t0: Any, t1: Any) => (success(t0, t1)).runNow()))
    __obj.asInstanceOf[XEditableSubmitOptions]
  }
  
  extension [Self <: XEditableSubmitOptions](x: Self) {
    
    inline def setAjaxOptions(value: Any): Self = StObject.set(x, "ajaxOptions", value.asInstanceOf[js.Any])
    
    inline def setAjaxOptionsUndefined: Self = StObject.set(x, "ajaxOptions", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setError(value: Any => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSuccess(value: (Any, Any) => Callback): Self = StObject.set(x, "success", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setUrl(value: Any): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
