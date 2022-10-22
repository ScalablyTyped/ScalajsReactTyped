package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFViewerErrorEvent
  extends StObject
     with PDFViewerEvent {
  
  var dialog: js.UndefOr[Dialog] = js.undefined
  
  var error: js.UndefOr[Any] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
}
object PDFViewerErrorEvent {
  
  inline def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: PDFViewer): PDFViewerErrorEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented.toJsFn, preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFViewerErrorEvent]
  }
  
  extension [Self <: PDFViewerErrorEvent](x: Self) {
    
    inline def setDialog(value: Dialog): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
    
    inline def setDialogUndefined: Self = StObject.set(x, "dialog", js.undefined)
    
    inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
