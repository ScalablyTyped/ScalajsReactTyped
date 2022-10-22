package typingsJapgolly.dateFns

import typingsJapgolly.dateFns.anon.WeekStartsOn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmStartOfWeekIndexMod {
  
  object default {
    
    inline def apply(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
    inline def apply(date: js.Date, options: WeekStartsOn): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    inline def apply(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
    inline def apply(date: Double, options: WeekStartsOn): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    @JSImport("date-fns/esm/startOfWeek/index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
