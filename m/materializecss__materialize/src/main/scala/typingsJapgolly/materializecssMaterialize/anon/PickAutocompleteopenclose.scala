package typingsJapgolly.materializecssMaterialize.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@materializecss/materialize.M.Autocomplete, 'open' | 'close' | 'destroy'> */
trait PickAutocompleteopenclose extends StObject {
  
  def close(): Unit
  @JSName("close")
  var close_Original: js.Function0[Unit]
  
  def destroy(): Unit
  @JSName("destroy")
  var destroy_Original: js.Function0[Unit]
  
  def open(): Unit
  @JSName("open")
  var open_Original: js.Function0[Unit]
}
object PickAutocompleteopenclose {
  
  inline def apply(close: Callback, destroy: Callback, open: Callback): PickAutocompleteopenclose = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, destroy = destroy.toJsFn, open = open.toJsFn)
    __obj.asInstanceOf[PickAutocompleteopenclose]
  }
  
  extension [Self <: PickAutocompleteopenclose](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setOpen(value: Callback): Self = StObject.set(x, "open", value.toJsFn)
  }
}
