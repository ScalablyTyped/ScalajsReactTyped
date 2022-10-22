package typingsJapgolly.dateFns

import typingsJapgolly.dateFns.anon.WeekStartsOn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmEachWeekOfIntervalMod {
  
  object default {
    
    inline def apply(interval: typingsJapgolly.dateFns.mod.Interval | Interval): js.Array[js.Date] = ^.asInstanceOf[js.Dynamic].apply(interval.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Date]]
    inline def apply(interval: Interval, options: WeekStartsOn): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].apply(interval.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
    inline def apply(interval: typingsJapgolly.dateFns.mod.Interval, options: typingsJapgolly.dateFns.anon.Locale): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].apply(interval.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
    
    @JSImport("date-fns/esm/eachWeekOfInterval", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
