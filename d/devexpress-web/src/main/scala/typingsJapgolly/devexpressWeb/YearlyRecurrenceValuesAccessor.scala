package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object providing access to an ASPxClientYearlyRecurrenceControl's editor values.
  */
trait YearlyRecurrenceValuesAccessor
  extends StObject
     with DefaultRecurrenceRuleValuesAccessor
object YearlyRecurrenceValuesAccessor {
  
  inline def apply(
    GetDayNumber: CallbackTo[Double],
    GetMonth: CallbackTo[Double],
    GetPeriodicity: CallbackTo[Double],
    GetWeekDays: CallbackTo[ASPxClientWeekDays],
    GetWeekOfMonth: CallbackTo[ASPxClientWeekOfMonth]
  ): YearlyRecurrenceValuesAccessor = {
    val __obj = js.Dynamic.literal(GetDayNumber = GetDayNumber.toJsFn, GetMonth = GetMonth.toJsFn, GetPeriodicity = GetPeriodicity.toJsFn, GetWeekDays = GetWeekDays.toJsFn, GetWeekOfMonth = GetWeekOfMonth.toJsFn)
    __obj.asInstanceOf[YearlyRecurrenceValuesAccessor]
  }
}
