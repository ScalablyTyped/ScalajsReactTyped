package typingsJapgolly.reactNativeCalendars.mod

import typingsJapgolly.reactNativeCalendars.anon.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactNativeCalendars.mod.CustomMarking
  - typingsJapgolly.reactNativeCalendars.mod.DotMarking
  - typingsJapgolly.reactNativeCalendars.mod.MultiDotMarking
  - typingsJapgolly.reactNativeCalendars.mod.MultiPeriodMarking
  - typingsJapgolly.reactNativeCalendars.mod.PeriodMarking
*/
trait Marking extends StObject
object Marking {
  
  inline def CustomMarking(customStyles: MarkedDateCustomStyles): typingsJapgolly.reactNativeCalendars.mod.CustomMarking = {
    val __obj = js.Dynamic.literal(customStyles = customStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactNativeCalendars.mod.CustomMarking]
  }
  
  inline def DotMarking(): typingsJapgolly.reactNativeCalendars.mod.DotMarking = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsJapgolly.reactNativeCalendars.mod.DotMarking]
  }
  
  inline def MultiDotMarking(dots: js.Array[CalendarDot]): typingsJapgolly.reactNativeCalendars.mod.MultiDotMarking = {
    val __obj = js.Dynamic.literal(dots = dots.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactNativeCalendars.mod.MultiDotMarking]
  }
  
  inline def MultiPeriodMarking(periods: js.Array[Color]): typingsJapgolly.reactNativeCalendars.mod.MultiPeriodMarking = {
    val __obj = js.Dynamic.literal(periods = periods.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactNativeCalendars.mod.MultiPeriodMarking]
  }
  
  inline def PeriodMarking(): typingsJapgolly.reactNativeCalendars.mod.PeriodMarking = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsJapgolly.reactNativeCalendars.mod.PeriodMarking]
  }
}
