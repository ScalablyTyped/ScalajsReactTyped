package typingsJapgolly.rmcCalendar.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rmcCalendar.libDateDataTypesMod.Models.CellData
import typingsJapgolly.rmcCalendar.libDateDataTypesMod.Models.ExtraData
import typingsJapgolly.rmcCalendar.libDateDataTypesMod.Models.Locale
import typingsJapgolly.rmcCalendar.libDateDataTypesMod.Models.MonthData
import typingsJapgolly.rmcCalendar.libDateSingleMonthMod.PropsType
import typingsJapgolly.rmcCalendar.libDateSingleMonthMod.default
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.normal
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.xl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SingleMonth {
  
  inline def apply(locale: Locale, monthData: MonthData): Builder = {
    val __props = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], monthData = monthData.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PropsType]))
  }
  
  @JSImport("rmc-calendar/lib/date/SingleMonth", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def getDateExtra(value: /* date */ js.Date => ExtraData): this.type = set("getDateExtra", js.Any.fromFunction1(value))
    
    inline def onCellClick(value: (/* data */ CellData, /* monthData */ MonthData) => Callback): this.type = set("onCellClick", js.Any.fromFunction2((t0: /* data */ CellData, t1: /* monthData */ MonthData) => (value(t0, t1)).runNow()))
    
    inline def rowSize(value: normal | xl): this.type = set("rowSize", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropsType): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
