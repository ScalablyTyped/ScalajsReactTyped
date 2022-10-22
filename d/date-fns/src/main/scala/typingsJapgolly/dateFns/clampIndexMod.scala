package typingsJapgolly.dateFns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clampIndexMod {
  
  object default {
    
    inline def apply(date: js.Date, interval: typingsJapgolly.dateFns.mod.Interval): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    inline def apply(date: Double, interval: typingsJapgolly.dateFns.mod.Interval): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    @JSImport("date-fns/clamp/index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
