package typingsJapgolly.dateFns

import typingsJapgolly.dateFns.anon.UseAdditionalDayOfYearTokensUseAdditionalWeekYearTokens
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseMod {
  
  object default {
    
    inline def apply(dateString: String, formatString: String, referenceDate: js.Date): js.Date = (^.asInstanceOf[js.Dynamic].apply(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], referenceDate.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    inline def apply(
      dateString: String,
      formatString: String,
      referenceDate: js.Date,
      options: UseAdditionalDayOfYearTokensUseAdditionalWeekYearTokens
    ): js.Date = (^.asInstanceOf[js.Dynamic].apply(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], referenceDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    inline def apply(dateString: String, formatString: String, referenceDate: Double): js.Date = (^.asInstanceOf[js.Dynamic].apply(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], referenceDate.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    inline def apply(
      dateString: String,
      formatString: String,
      referenceDate: Double,
      options: UseAdditionalDayOfYearTokensUseAdditionalWeekYearTokens
    ): js.Date = (^.asInstanceOf[js.Dynamic].apply(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], referenceDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    @JSImport("date-fns/parse", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
