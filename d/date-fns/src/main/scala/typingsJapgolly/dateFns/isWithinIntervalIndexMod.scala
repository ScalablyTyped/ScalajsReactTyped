package typingsJapgolly.dateFns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isWithinIntervalIndexMod {
  
  object default {
    
    inline def apply(date: js.Date, interval: typingsJapgolly.dateFns.mod.Interval): Boolean = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def apply(date: Double, interval: typingsJapgolly.dateFns.mod.Interval): Boolean = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("date-fns/isWithinInterval/index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
