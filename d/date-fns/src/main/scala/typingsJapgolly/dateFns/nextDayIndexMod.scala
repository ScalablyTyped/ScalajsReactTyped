package typingsJapgolly.dateFns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nextDayIndexMod {
  
  object default {
    
    inline def apply(date: js.Date, day: typingsJapgolly.dateFns.mod.Day): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], day.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    inline def apply(date: Double, day: typingsJapgolly.dateFns.mod.Day): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], day.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    @JSImport("date-fns/nextDay/index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
