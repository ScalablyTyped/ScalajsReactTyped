package typingsJapgolly.baseui.anon

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.baseui.dataTableTypesMod.Row
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearSelection extends StObject {
  
  def clearSelection(): Any
  
  var event: ReactEventFrom[HTMLButtonElement]
  
  var selection: js.Array[Row]
}
object ClearSelection {
  
  inline def apply(
    clearSelection: CallbackTo[Any],
    event: ReactEventFrom[HTMLButtonElement],
    selection: js.Array[Row]
  ): ClearSelection = {
    val __obj = js.Dynamic.literal(clearSelection = clearSelection.toJsFn, event = event.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearSelection]
  }
  
  extension [Self <: ClearSelection](x: Self) {
    
    inline def setClearSelection(value: CallbackTo[Any]): Self = StObject.set(x, "clearSelection", value.toJsFn)
    
    inline def setEvent(value: ReactEventFrom[HTMLButtonElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setSelection(value: js.Array[Row]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionVarargs(value: Row*): Self = StObject.set(x, "selection", js.Array(value*))
  }
}
