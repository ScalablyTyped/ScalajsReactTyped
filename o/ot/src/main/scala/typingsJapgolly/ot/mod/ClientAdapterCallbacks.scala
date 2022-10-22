package typingsJapgolly.ot.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientAdapterCallbacks extends StObject {
  
  def blur(): Unit
  
  def change(operation: TextOperation, inverse: TextOperation): Unit
  
  def selectionChange(): Unit
}
object ClientAdapterCallbacks {
  
  inline def apply(blur: Callback, change: (TextOperation, TextOperation) => Callback, selectionChange: Callback): ClientAdapterCallbacks = {
    val __obj = js.Dynamic.literal(blur = blur.toJsFn, change = js.Any.fromFunction2((t0: TextOperation, t1: TextOperation) => (change(t0, t1)).runNow()), selectionChange = selectionChange.toJsFn)
    __obj.asInstanceOf[ClientAdapterCallbacks]
  }
  
  extension [Self <: ClientAdapterCallbacks](x: Self) {
    
    inline def setBlur(value: Callback): Self = StObject.set(x, "blur", value.toJsFn)
    
    inline def setChange(value: (TextOperation, TextOperation) => Callback): Self = StObject.set(x, "change", js.Any.fromFunction2((t0: TextOperation, t1: TextOperation) => (value(t0, t1)).runNow()))
    
    inline def setSelectionChange(value: Callback): Self = StObject.set(x, "selectionChange", value.toJsFn)
  }
}
