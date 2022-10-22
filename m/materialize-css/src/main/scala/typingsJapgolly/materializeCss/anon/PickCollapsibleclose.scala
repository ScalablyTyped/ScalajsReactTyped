package typingsJapgolly.materializeCss.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Collapsible, 'close'> */
trait PickCollapsibleclose extends StObject {
  
  def close(n: Double): Unit
  @JSName("close")
  var close_Original: js.Function1[/* n */ Double, Unit]
}
object PickCollapsibleclose {
  
  inline def apply(close: /* n */ Double => Callback): PickCollapsibleclose = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1((t0: /* n */ Double) => close(t0).runNow()))
    __obj.asInstanceOf[PickCollapsibleclose]
  }
  
  extension [Self <: PickCollapsibleclose](x: Self) {
    
    inline def setClose(value: /* n */ Double => Callback): Self = StObject.set(x, "close", js.Any.fromFunction1((t0: /* n */ Double) => value(t0).runNow()))
  }
}
