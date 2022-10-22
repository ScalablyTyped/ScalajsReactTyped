package typingsJapgolly.blueprintjsDatetime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmCommonMonthAndYearMod {
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/monthAndYear", "MonthAndYear")
  @js.native
  open class MonthAndYear () extends StObject {
    def this(month: Double) = this()
    def this(month: Double, year: Double) = this()
    def this(month: Unit, year: Double) = this()
    
    /* private */ var date: Any = js.native
    
    def getFullDate(): js.Date = js.native
    
    def getMonth(): Double = js.native
    
    def getNextMonth(): MonthAndYear = js.native
    
    def getPreviousMonth(): MonthAndYear = js.native
    
    def getYear(): Double = js.native
    
    def isAfter(monthAndYear: MonthAndYear): Boolean = js.native
    
    def isBefore(monthAndYear: MonthAndYear): Boolean = js.native
    
    def isSame(monthAndYear: MonthAndYear): Boolean = js.native
    
    def isSameMonth(monthAndYear: MonthAndYear): Boolean = js.native
  }
  /* static members */
  object MonthAndYear {
    
    @JSImport("@blueprintjs/datetime/lib/esm/common/monthAndYear", "MonthAndYear")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromDate(date: js.Date): MonthAndYear = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any]).asInstanceOf[MonthAndYear]
  }
}
