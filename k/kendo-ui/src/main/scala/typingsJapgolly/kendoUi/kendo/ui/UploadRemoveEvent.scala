package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadRemoveEvent
  extends StObject
     with UploadEvent {
  
  var data: js.UndefOr[Any] = js.undefined
  
  var files: js.UndefOr[js.Array[Any]] = js.undefined
  
  var headers: js.UndefOr[Any] = js.undefined
}
object UploadRemoveEvent {
  
  inline def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: Upload): UploadRemoveEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented.toJsFn, preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadRemoveEvent]
  }
  
  extension [Self <: UploadRemoveEvent](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFiles(value: js.Array[Any]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: Any*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
  }
}
