package typingsJapgolly.dateFns

import typingsJapgolly.dateFns.anon.FirstWeekContainsDate
import typingsJapgolly.dateFns.anon.UseAdditionalDayOfYearTokens
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmFormatMod {
  
  object default {
    
    inline def apply(date: js.Date, format: String): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: js.Date, format: String, options: FirstWeekContainsDate): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: js.Date, format: String, options: UseAdditionalDayOfYearTokens): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Double, format: String): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Double, format: String, options: FirstWeekContainsDate): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Double, format: String, options: UseAdditionalDayOfYearTokens): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("date-fns/esm/format", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
