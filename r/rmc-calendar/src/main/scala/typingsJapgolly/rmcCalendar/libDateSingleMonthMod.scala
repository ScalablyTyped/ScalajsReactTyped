package typingsJapgolly.rmcCalendar

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.rmcCalendar.anon.WeekComponents
import typingsJapgolly.rmcCalendar.libDateDataTypesMod.Models.CellData
import typingsJapgolly.rmcCalendar.libDateDataTypesMod.Models.ExtraData
import typingsJapgolly.rmcCalendar.libDateDataTypesMod.Models.Locale
import typingsJapgolly.rmcCalendar.libDateDataTypesMod.Models.MonthData
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.normal
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.xl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDateSingleMonthMod {
  
  @JSImport("rmc-calendar/lib/date/SingleMonth", JSImport.Default)
  @js.native
  open class default protected () extends SingleMonth {
    def this(props: PropsType) = this()
  }
  /* static members */
  object default {
    
    @JSImport("rmc-calendar/lib/date/SingleMonth", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-calendar/lib/date/SingleMonth", "default.defaultProps")
    @js.native
    def defaultProps: PropsType = js.native
    inline def defaultProps_=(x: PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait PropsType extends StObject {
    
    var getDateExtra: js.UndefOr[js.Function1[/* date */ js.Date, ExtraData]] = js.undefined
    
    var locale: Locale
    
    var monthData: MonthData
    
    var onCellClick: js.UndefOr[js.Function2[/* data */ CellData, /* monthData */ MonthData, Unit]] = js.undefined
    
    var rowSize: js.UndefOr[normal | xl] = js.undefined
  }
  object PropsType {
    
    inline def apply(locale: Locale, monthData: MonthData): PropsType = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], monthData = monthData.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsType]
    }
    
    extension [Self <: PropsType](x: Self) {
      
      inline def setGetDateExtra(value: /* date */ js.Date => ExtraData): Self = StObject.set(x, "getDateExtra", js.Any.fromFunction1(value))
      
      inline def setGetDateExtraUndefined: Self = StObject.set(x, "getDateExtra", js.undefined)
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setMonthData(value: MonthData): Self = StObject.set(x, "monthData", value.asInstanceOf[js.Any])
      
      inline def setOnCellClick(value: (/* data */ CellData, /* monthData */ MonthData) => Callback): Self = StObject.set(x, "onCellClick", js.Any.fromFunction2((t0: /* data */ CellData, t1: /* monthData */ MonthData) => (value(t0, t1)).runNow()))
      
      inline def setOnCellClickUndefined: Self = StObject.set(x, "onCellClick", js.undefined)
      
      inline def setRowSize(value: normal | xl): Self = StObject.set(x, "rowSize", value.asInstanceOf[js.Any])
      
      inline def setRowSizeUndefined: Self = StObject.set(x, "rowSize", js.undefined)
    }
  }
  
  @js.native
  trait SingleMonth extends PureComponent[PropsType, WeekComponents, Any] {
    
    @JSName("componentWillMount")
    def componentWillMount_MSingleMonth(): Unit = js.native
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MSingleMonth(nextProps: PropsType): Unit = js.native
    
    def genWeek(weeksData: js.Array[CellData], index: Double): Unit = js.native
    
    def setWarpper(dom: HTMLDivElement): Unit = js.native
    
    def updateWeeks(): Unit = js.native
    def updateWeeks(monthData: MonthData): Unit = js.native
    
    var wrapperDivDOM: HTMLDivElement | Null = js.native
  }
}
