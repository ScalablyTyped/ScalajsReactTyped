package typingsJapgolly.materializecssMaterialize.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@materializecss/materialize.M.Datepicker, 'gotoDate'> */
trait PickDatepickergotoDate extends StObject {
  
  def gotoDate(date: js.Date): Unit
  @JSName("gotoDate")
  var gotoDate_Original: js.Function1[/* date */ js.Date, Unit]
}
object PickDatepickergotoDate {
  
  inline def apply(gotoDate: /* date */ js.Date => Callback): PickDatepickergotoDate = {
    val __obj = js.Dynamic.literal(gotoDate = js.Any.fromFunction1((t0: /* date */ js.Date) => gotoDate(t0).runNow()))
    __obj.asInstanceOf[PickDatepickergotoDate]
  }
  
  extension [Self <: PickDatepickergotoDate](x: Self) {
    
    inline def setGotoDate(value: /* date */ js.Date => Callback): Self = StObject.set(x, "gotoDate", js.Any.fromFunction1((t0: /* date */ js.Date) => value(t0).runNow()))
  }
}
