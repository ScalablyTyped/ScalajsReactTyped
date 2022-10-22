package typingsJapgolly.materializeCss.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.materializeCss.M.ChipData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Chips, 'addChip'> */
trait PickChipsaddChip extends StObject {
  
  def addChip(chip: ChipData): Unit
  @JSName("addChip")
  var addChip_Original: js.Function1[/* chip */ ChipData, Unit]
}
object PickChipsaddChip {
  
  inline def apply(addChip: /* chip */ ChipData => Callback): PickChipsaddChip = {
    val __obj = js.Dynamic.literal(addChip = js.Any.fromFunction1((t0: /* chip */ ChipData) => addChip(t0).runNow()))
    __obj.asInstanceOf[PickChipsaddChip]
  }
  
  extension [Self <: PickChipsaddChip](x: Self) {
    
    inline def setAddChip(value: /* chip */ ChipData => Callback): Self = StObject.set(x, "addChip", js.Any.fromFunction1((t0: /* chip */ ChipData) => value(t0).runNow()))
  }
}
