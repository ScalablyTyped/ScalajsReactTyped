package typingsJapgolly.materializecssMaterialize.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@materializecss/materialize.M.Datepicker, 'setDate'> */
trait PickDatepickersetDate extends StObject {
  
  def setDate(): Unit
  def setDate(date: String): Unit
  def setDate(date: String, preventOnSelect: Boolean): Unit
  def setDate(date: js.Date): Unit
  def setDate(date: js.Date, preventOnSelect: Boolean): Unit
  def setDate(date: Unit, preventOnSelect: Boolean): Unit
  @JSName("setDate")
  var setDate_Original: js.Function2[
    /* date */ js.UndefOr[js.Date | String], 
    /* preventOnSelect */ js.UndefOr[Boolean], 
    Unit
  ]
}
object PickDatepickersetDate {
  
  inline def apply(
    setDate: (/* date */ js.UndefOr[js.Date | String], /* preventOnSelect */ js.UndefOr[Boolean]) => Callback
  ): PickDatepickersetDate = {
    val __obj = js.Dynamic.literal(setDate = js.Any.fromFunction2((t0: /* date */ js.UndefOr[js.Date | String], t1: /* preventOnSelect */ js.UndefOr[Boolean]) => (setDate(t0, t1)).runNow()))
    __obj.asInstanceOf[PickDatepickersetDate]
  }
  
  extension [Self <: PickDatepickersetDate](x: Self) {
    
    inline def setSetDate(
      value: (/* date */ js.UndefOr[js.Date | String], /* preventOnSelect */ js.UndefOr[Boolean]) => Callback
    ): Self = StObject.set(x, "setDate", js.Any.fromFunction2((t0: /* date */ js.UndefOr[js.Date | String], t1: /* preventOnSelect */ js.UndefOr[Boolean]) => (value(t0, t1)).runNow()))
  }
}
