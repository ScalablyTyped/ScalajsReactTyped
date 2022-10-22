package typingsJapgolly.phonon.Phonon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhononIndicatorComponent
  extends StObject
     with PhononDialogComponent {
  
  def close(): Unit
  
  def open(): Unit
}
object PhononIndicatorComponent {
  
  inline def apply(
    close: Callback,
    on: (String, js.Function1[/* value */ js.UndefOr[Any], Unit]) => PhononDialogComponent,
    open: Callback
  ): PhononIndicatorComponent = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, on = js.Any.fromFunction2(on), open = open.toJsFn)
    __obj.asInstanceOf[PhononIndicatorComponent]
  }
  
  extension [Self <: PhononIndicatorComponent](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setOpen(value: Callback): Self = StObject.set(x, "open", value.toJsFn)
  }
}
