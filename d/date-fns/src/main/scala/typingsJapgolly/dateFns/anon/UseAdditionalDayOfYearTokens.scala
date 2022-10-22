package typingsJapgolly.dateFns.anon

import typingsJapgolly.dateFns.dateFnsInts.`2`
import typingsJapgolly.dateFns.dateFnsInts.`3`
import typingsJapgolly.dateFns.dateFnsInts.`4`
import typingsJapgolly.dateFns.dateFnsInts.`5`
import typingsJapgolly.dateFns.dateFnsInts.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseAdditionalDayOfYearTokens extends StObject {
  
  var firstWeekContainsDate: js.UndefOr[Double] = js.undefined
  
  var locale: js.UndefOr[typingsJapgolly.dateFns.Locale] = js.undefined
  
  var useAdditionalDayOfYearTokens: js.UndefOr[Boolean] = js.undefined
  
  var useAdditionalWeekYearTokens: js.UndefOr[Boolean] = js.undefined
  
  var weekStartsOn: js.UndefOr[
    typingsJapgolly.dateFns.dateFnsInts.`0` | typingsJapgolly.dateFns.dateFnsInts.`1` | `2` | `3` | `4` | `5` | `6`
  ] = js.undefined
}
object UseAdditionalDayOfYearTokens {
  
  inline def apply(): UseAdditionalDayOfYearTokens = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseAdditionalDayOfYearTokens]
  }
  
  extension [Self <: UseAdditionalDayOfYearTokens](x: Self) {
    
    inline def setFirstWeekContainsDate(value: Double): Self = StObject.set(x, "firstWeekContainsDate", value.asInstanceOf[js.Any])
    
    inline def setFirstWeekContainsDateUndefined: Self = StObject.set(x, "firstWeekContainsDate", js.undefined)
    
    inline def setLocale(value: typingsJapgolly.dateFns.Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setUseAdditionalDayOfYearTokens(value: Boolean): Self = StObject.set(x, "useAdditionalDayOfYearTokens", value.asInstanceOf[js.Any])
    
    inline def setUseAdditionalDayOfYearTokensUndefined: Self = StObject.set(x, "useAdditionalDayOfYearTokens", js.undefined)
    
    inline def setUseAdditionalWeekYearTokens(value: Boolean): Self = StObject.set(x, "useAdditionalWeekYearTokens", value.asInstanceOf[js.Any])
    
    inline def setUseAdditionalWeekYearTokensUndefined: Self = StObject.set(x, "useAdditionalWeekYearTokens", js.undefined)
    
    inline def setWeekStartsOn(
      value: typingsJapgolly.dateFns.dateFnsInts.`0` | typingsJapgolly.dateFns.dateFnsInts.`1` | `2` | `3` | `4` | `5` | `6`
    ): Self = StObject.set(x, "weekStartsOn", value.asInstanceOf[js.Any])
    
    inline def setWeekStartsOnUndefined: Self = StObject.set(x, "weekStartsOn", js.undefined)
  }
}
