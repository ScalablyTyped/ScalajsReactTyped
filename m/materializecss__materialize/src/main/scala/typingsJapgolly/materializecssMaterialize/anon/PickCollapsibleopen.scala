package typingsJapgolly.materializecssMaterialize.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@materializecss/materialize.M.Collapsible, 'open'> */
trait PickCollapsibleopen extends StObject {
  
  def open(n: Double): Unit
  @JSName("open")
  var open_Original: js.Function1[/* n */ Double, Unit]
}
object PickCollapsibleopen {
  
  inline def apply(open: /* n */ Double => Callback): PickCollapsibleopen = {
    val __obj = js.Dynamic.literal(open = js.Any.fromFunction1((t0: /* n */ Double) => open(t0).runNow()))
    __obj.asInstanceOf[PickCollapsibleopen]
  }
  
  extension [Self <: PickCollapsibleopen](x: Self) {
    
    inline def setOpen(value: /* n */ Double => Callback): Self = StObject.set(x, "open", js.Any.fromFunction1((t0: /* n */ Double) => value(t0).runNow()))
  }
}
