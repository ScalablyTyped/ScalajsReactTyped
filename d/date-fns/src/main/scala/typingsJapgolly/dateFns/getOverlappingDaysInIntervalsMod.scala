package typingsJapgolly.dateFns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getOverlappingDaysInIntervalsMod {
  
  object default {
    
    inline def apply(
      intervalLeft: typingsJapgolly.dateFns.mod.Interval,
      intervalRight: typingsJapgolly.dateFns.mod.Interval
    ): Double = (^.asInstanceOf[js.Dynamic].apply(intervalLeft.asInstanceOf[js.Any], intervalRight.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSImport("date-fns/getOverlappingDaysInIntervals", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
