package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.JQueryPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorPdfExportEvent
  extends StObject
     with EditorEvent {
  
  var promise: js.UndefOr[JQueryPromise[Any]] = js.undefined
}
object EditorPdfExportEvent {
  
  inline def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: Editor_): EditorPdfExportEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented.toJsFn, preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorPdfExportEvent]
  }
  
  extension [Self <: EditorPdfExportEvent](x: Self) {
    
    inline def setPromise(value: JQueryPromise[Any]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    
    inline def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
  }
}
