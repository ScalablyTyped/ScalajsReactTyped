package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object providing access to an ASPxClientMonthlyRecurrenceControl's editor values.
  */
trait MonthlyRecurrenceValuesAccessor
  extends StObject
     with DefaultRecurrenceRuleValuesAccessor
object MonthlyRecurrenceValuesAccessor {
  
  inline def apply(
    GetDayNumber: CallbackTo[Double],
    GetMonth: CallbackTo[Double],
    GetPeriodicity: CallbackTo[Double],
    GetWeekDays: CallbackTo[ASPxClientWeekDays],
    GetWeekOfMonth: CallbackTo[ASPxClientWeekOfMonth]
  ): MonthlyRecurrenceValuesAccessor = {
    val __obj = js.Dynamic.literal(GetDayNumber = GetDayNumber.toJsFn, GetMonth = GetMonth.toJsFn, GetPeriodicity = GetPeriodicity.toJsFn, GetWeekDays = GetWeekDays.toJsFn, GetWeekOfMonth = GetWeekOfMonth.toJsFn)
    __obj.asInstanceOf[MonthlyRecurrenceValuesAccessor]
  }
}
