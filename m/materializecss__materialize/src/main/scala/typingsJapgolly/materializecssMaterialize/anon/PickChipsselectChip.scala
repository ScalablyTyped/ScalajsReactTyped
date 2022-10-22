package typingsJapgolly.materializecssMaterialize.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@materializecss/materialize.M.Chips, 'selectChip'> */
trait PickChipsselectChip extends StObject {
  
  def selectChip(n: Double): Unit
  @JSName("selectChip")
  var selectChip_Original: js.Function1[/* n */ Double, Unit]
}
object PickChipsselectChip {
  
  inline def apply(selectChip: /* n */ Double => Callback): PickChipsselectChip = {
    val __obj = js.Dynamic.literal(selectChip = js.Any.fromFunction1((t0: /* n */ Double) => selectChip(t0).runNow()))
    __obj.asInstanceOf[PickChipsselectChip]
  }
  
  extension [Self <: PickChipsselectChip](x: Self) {
    
    inline def setSelectChip(value: /* n */ Double => Callback): Self = StObject.set(x, "selectChip", js.Any.fromFunction1((t0: /* n */ Double) => value(t0).runNow()))
  }
}
