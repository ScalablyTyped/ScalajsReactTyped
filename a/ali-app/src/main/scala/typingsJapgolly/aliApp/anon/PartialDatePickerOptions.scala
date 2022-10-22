package typingsJapgolly.aliApp.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.aliAppInts.`11`
import typingsJapgolly.aliApp.aliAppStrings.HHColonmm
import typingsJapgolly.aliApp.aliAppStrings.`yyyy-MM-dd HHColonmm`
import typingsJapgolly.aliApp.aliAppStrings.`yyyy-MM-dd`
import typingsJapgolly.aliApp.aliAppStrings.`yyyy-MM`
import typingsJapgolly.aliApp.aliAppStrings.yyyy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ali-app.my.DatePickerOptions> */
trait PartialDatePickerOptions extends StObject {
  
  var complete: js.UndefOr[js.Function1[/* res */ Any, Unit]] = js.undefined
  
  var currentDate: js.UndefOr[String] = js.undefined
  
  var endDate: js.UndefOr[String] = js.undefined
  
  var fail: js.UndefOr[js.Function1[`11`, Unit]] = js.undefined
  
  var format: js.UndefOr[`yyyy-MM-dd` | HHColonmm | (`yyyy-MM-dd HHColonmm`) | `yyyy-MM` | yyyy] = js.undefined
  
  var startDate: js.UndefOr[String] = js.undefined
  
  var success: js.UndefOr[js.Function1[/* result */ Date, Unit]] = js.undefined
}
object PartialDatePickerOptions {
  
  inline def apply(): PartialDatePickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDatePickerOptions]
  }
  
  extension [Self <: PartialDatePickerOptions](x: Self) {
    
    inline def setComplete(value: /* res */ Any => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* res */ Any) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setCurrentDate(value: String): Self = StObject.set(x, "currentDate", value.asInstanceOf[js.Any])
    
    inline def setCurrentDateUndefined: Self = StObject.set(x, "currentDate", js.undefined)
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setFail(value: `11` => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: `11`) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setFormat(value: `yyyy-MM-dd` | HHColonmm | (`yyyy-MM-dd HHColonmm`) | `yyyy-MM` | yyyy): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setSuccess(value: /* result */ Date => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* result */ Date) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
