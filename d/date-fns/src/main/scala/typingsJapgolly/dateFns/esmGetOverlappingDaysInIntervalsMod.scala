package typingsJapgolly.dateFns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmGetOverlappingDaysInIntervalsMod {
  
  object default {
    
    inline def apply(
      intervalLeft: typingsJapgolly.dateFns.mod.Interval | Interval,
      intervalRight: typingsJapgolly.dateFns.mod.Interval | Interval
    ): Double = (^.asInstanceOf[js.Dynamic].apply(intervalLeft.asInstanceOf[js.Any], intervalRight.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSImport("date-fns/esm/getOverlappingDaysInIntervals", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
