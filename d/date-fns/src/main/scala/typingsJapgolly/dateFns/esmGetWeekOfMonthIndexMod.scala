package typingsJapgolly.dateFns

import typingsJapgolly.dateFns.anon.WeekStartsOn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmGetWeekOfMonthIndexMod {
  
  object default {
    
    inline def apply(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def apply(date: js.Date, options: WeekStartsOn): Double = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def apply(date: Double): Double = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def apply(date: Double, options: WeekStartsOn): Double = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSImport("date-fns/esm/getWeekOfMonth/index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
