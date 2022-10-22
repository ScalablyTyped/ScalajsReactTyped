package typingsJapgolly.rrule

import typingsJapgolly.rrule.distEsmTypesMod._ByWeekday
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmWeekdayMod {
  
  @JSImport("rrule/dist/esm/weekday", "ALL_WEEKDAYS")
  @js.native
  val ALL_WEEKDAYS: js.Array[WeekdayStr] = js.native
  
  @JSImport("rrule/dist/esm/weekday", "Weekday")
  @js.native
  open class Weekday protected ()
    extends StObject
       with _ByWeekday {
    def this(weekday: Double) = this()
    def this(weekday: Double, n: Double) = this()
    
    def equals(other: Weekday): Boolean = js.native
    
    def getJsWeekday(): Double = js.native
    
    val n: js.UndefOr[Double] = js.native
    
    def nth(n: Double): Weekday = js.native
    
    val weekday: Double = js.native
  }
  /* static members */
  object Weekday {
    
    @JSImport("rrule/dist/esm/weekday", "Weekday")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromStr(str: WeekdayStr): Weekday = ^.asInstanceOf[js.Dynamic].applyDynamic("fromStr")(str.asInstanceOf[js.Any]).asInstanceOf[Weekday]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rrule.rruleStrings.MO
    - typingsJapgolly.rrule.rruleStrings.TU
    - typingsJapgolly.rrule.rruleStrings.WE
    - typingsJapgolly.rrule.rruleStrings.TH
    - typingsJapgolly.rrule.rruleStrings.FR
    - typingsJapgolly.rrule.rruleStrings.SA
    - typingsJapgolly.rrule.rruleStrings.SU
  */
  trait WeekdayStr
    extends StObject
       with _ByWeekday
  object WeekdayStr {
    
    inline def FR: typingsJapgolly.rrule.rruleStrings.FR = "FR".asInstanceOf[typingsJapgolly.rrule.rruleStrings.FR]
    
    inline def MO: typingsJapgolly.rrule.rruleStrings.MO = "MO".asInstanceOf[typingsJapgolly.rrule.rruleStrings.MO]
    
    inline def SA: typingsJapgolly.rrule.rruleStrings.SA = "SA".asInstanceOf[typingsJapgolly.rrule.rruleStrings.SA]
    
    inline def SU: typingsJapgolly.rrule.rruleStrings.SU = "SU".asInstanceOf[typingsJapgolly.rrule.rruleStrings.SU]
    
    inline def TH: typingsJapgolly.rrule.rruleStrings.TH = "TH".asInstanceOf[typingsJapgolly.rrule.rruleStrings.TH]
    
    inline def TU: typingsJapgolly.rrule.rruleStrings.TU = "TU".asInstanceOf[typingsJapgolly.rrule.rruleStrings.TU]
    
    inline def WE: typingsJapgolly.rrule.rruleStrings.WE = "WE".asInstanceOf[typingsJapgolly.rrule.rruleStrings.WE]
  }
}
