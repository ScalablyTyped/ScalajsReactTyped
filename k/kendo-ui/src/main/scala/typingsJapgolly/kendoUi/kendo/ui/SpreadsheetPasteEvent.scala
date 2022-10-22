package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.kendo.spreadsheet.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpreadsheetPasteEvent
  extends StObject
     with SpreadsheetEvent {
  
  var clipboardContent: js.UndefOr[Any] = js.undefined
  
  var range: js.UndefOr[Range] = js.undefined
}
object SpreadsheetPasteEvent {
  
  inline def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: Spreadsheet): SpreadsheetPasteEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented.toJsFn, preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetPasteEvent]
  }
  
  extension [Self <: SpreadsheetPasteEvent](x: Self) {
    
    inline def setClipboardContent(value: Any): Self = StObject.set(x, "clipboardContent", value.asInstanceOf[js.Any])
    
    inline def setClipboardContentUndefined: Self = StObject.set(x, "clipboardContent", js.undefined)
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
