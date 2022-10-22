package typingsJapgolly.materializecssMaterialize.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@materializecss/materialize.M.Chips, 'deleteChip'> */
trait PickChipsdeleteChip extends StObject {
  
  def deleteChip(): Unit
  def deleteChip(n: Double): Unit
  @JSName("deleteChip")
  var deleteChip_Original: js.Function1[/* n */ js.UndefOr[Double], Unit]
}
object PickChipsdeleteChip {
  
  inline def apply(deleteChip: /* n */ js.UndefOr[Double] => Callback): PickChipsdeleteChip = {
    val __obj = js.Dynamic.literal(deleteChip = js.Any.fromFunction1((t0: /* n */ js.UndefOr[Double]) => deleteChip(t0).runNow()))
    __obj.asInstanceOf[PickChipsdeleteChip]
  }
  
  extension [Self <: PickChipsdeleteChip](x: Self) {
    
    inline def setDeleteChip(value: /* n */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "deleteChip", js.Any.fromFunction1((t0: /* n */ js.UndefOr[Double]) => value(t0).runNow()))
  }
}
