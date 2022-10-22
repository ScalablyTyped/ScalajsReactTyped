package typingsJapgolly.materializecssMaterialize.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@materializecss/materialize.M.Tabs, 'select'> */
trait PickTabsselect extends StObject {
  
  def select(tabId: String): Unit
  @JSName("select")
  var select_Original: js.Function1[/* tabId */ String, Unit]
}
object PickTabsselect {
  
  inline def apply(select: /* tabId */ String => Callback): PickTabsselect = {
    val __obj = js.Dynamic.literal(select = js.Any.fromFunction1((t0: /* tabId */ String) => select(t0).runNow()))
    __obj.asInstanceOf[PickTabsselect]
  }
  
  extension [Self <: PickTabsselect](x: Self) {
    
    inline def setSelect(value: /* tabId */ String => Callback): Self = StObject.set(x, "select", js.Any.fromFunction1((t0: /* tabId */ String) => value(t0).runNow()))
  }
}
