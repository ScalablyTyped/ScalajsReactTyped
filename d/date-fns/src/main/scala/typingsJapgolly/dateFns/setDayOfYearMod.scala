package typingsJapgolly.dateFns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setDayOfYearMod {
  
  object default {
    
    inline def apply(date: js.Date, dayOfYear: Double): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], dayOfYear.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    inline def apply(date: Double, dayOfYear: Double): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], dayOfYear.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    @JSImport("date-fns/setDayOfYear", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
