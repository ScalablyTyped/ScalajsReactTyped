package typingsJapgolly.dateFns

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.dateFns.anon.Inclusive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmFpAreIntervalsOverlappingWithOptionsMod {
  
  object default extends Shortcut {
    
    @JSImport("date-fns/esm/fp/areIntervalsOverlappingWithOptions", JSImport.Default)
    @js.native
    val ^ : CurriedFn3[Inclusive, Interval, Interval, Boolean] = js.native
    
    type _To = CurriedFn3[Inclusive, Interval, Interval, Boolean]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn3[Inclusive, Interval, Interval, Boolean] = ^
  }
}
