package typingsJapgolly.dateFns

import typingsJapgolly.dateFns.anon.Inclusive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object areIntervalsOverlappingMod {
  
  object default {
    
    inline def apply(
      intervalLeft: typingsJapgolly.dateFns.mod.Interval,
      intervalRight: typingsJapgolly.dateFns.mod.Interval
    ): Boolean = (^.asInstanceOf[js.Dynamic].apply(intervalLeft.asInstanceOf[js.Any], intervalRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def apply(
      intervalLeft: typingsJapgolly.dateFns.mod.Interval,
      intervalRight: typingsJapgolly.dateFns.mod.Interval,
      options: Inclusive
    ): Boolean = (^.asInstanceOf[js.Dynamic].apply(intervalLeft.asInstanceOf[js.Any], intervalRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("date-fns/areIntervalsOverlapping", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
