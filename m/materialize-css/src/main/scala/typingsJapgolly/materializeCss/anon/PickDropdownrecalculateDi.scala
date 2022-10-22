package typingsJapgolly.materializeCss.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Dropdown, 'recalculateDimensions' | 'open' | 'close' | 'destroy'> */
trait PickDropdownrecalculateDi extends StObject {
  
  def close(): Unit
  @JSName("close")
  var close_Original: js.Function0[Unit]
  
  def destroy(): Unit
  @JSName("destroy")
  var destroy_Original: js.Function0[Unit]
  
  def open(): Unit
  @JSName("open")
  var open_Original: js.Function0[Unit]
  
  def recalculateDimensions(): Unit
  @JSName("recalculateDimensions")
  var recalculateDimensions_Original: js.Function0[Unit]
}
object PickDropdownrecalculateDi {
  
  inline def apply(close: Callback, destroy: Callback, open: Callback, recalculateDimensions: Callback): PickDropdownrecalculateDi = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, destroy = destroy.toJsFn, open = open.toJsFn, recalculateDimensions = recalculateDimensions.toJsFn)
    __obj.asInstanceOf[PickDropdownrecalculateDi]
  }
  
  extension [Self <: PickDropdownrecalculateDi](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setOpen(value: Callback): Self = StObject.set(x, "open", value.toJsFn)
    
    inline def setRecalculateDimensions(value: Callback): Self = StObject.set(x, "recalculateDimensions", value.toJsFn)
  }
}
