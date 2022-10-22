package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DateRangeType
import typingsJapgolly.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DayOfWeek
import typingsJapgolly.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.FirstWeekOfYear
import typingsJapgolly.officeUiFabricReact.libComponentsCalendarCalendarDayMod.ICalendarDay
import typingsJapgolly.officeUiFabricReact.libComponentsCalendarCalendarDayMod.ICalendarDayProps
import typingsJapgolly.officeUiFabricReact.libComponentsCalendarCalendarDottypesMod.ICalendarFormatDateCallbacks
import typingsJapgolly.officeUiFabricReact.libComponentsCalendarCalendarDottypesMod.ICalendarIconStrings
import typingsJapgolly.officeUiFabricReact.libComponentsCalendarCalendarDottypesMod.ICalendarStrings
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CalendarDay {
  
  inline def apply(
    autoNavigateOnSelection: Boolean,
    dateRangeType: DateRangeType,
    dateTimeFormatter: ICalendarFormatDateCallbacks,
    firstDayOfWeek: DayOfWeek,
    firstWeekOfYear: FirstWeekOfYear,
    navigatedDate: js.Date,
    navigationIcons: ICalendarIconStrings,
    onNavigateDate: (js.Date, Boolean) => Callback,
    onSelectDate: (js.Date, js.UndefOr[js.Array[js.Date]]) => Callback,
    selectedDate: js.Date,
    strings: ICalendarStrings
  ): Builder = {
    val __props = js.Dynamic.literal(autoNavigateOnSelection = autoNavigateOnSelection.asInstanceOf[js.Any], dateRangeType = dateRangeType.asInstanceOf[js.Any], dateTimeFormatter = dateTimeFormatter.asInstanceOf[js.Any], firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], firstWeekOfYear = firstWeekOfYear.asInstanceOf[js.Any], navigatedDate = navigatedDate.asInstanceOf[js.Any], navigationIcons = navigationIcons.asInstanceOf[js.Any], onNavigateDate = js.Any.fromFunction2((t0: js.Date, t1: Boolean) => (onNavigateDate(t0, t1)).runNow()), onSelectDate = js.Any.fromFunction2((t0: js.Date, t1: js.UndefOr[js.Array[js.Date]]) => (onSelectDate(t0, t1)).runNow()), selectedDate = selectedDate.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ICalendarDayProps]))
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Calendar/CalendarDay", "CalendarDay")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[
          typingsJapgolly.officeUiFabricReact.libComponentsCalendarCalendarDayMod.CalendarDay
        ] {
    
    inline def allFocusable(value: Boolean): this.type = set("allFocusable", value.asInstanceOf[js.Any])
    
    inline def componentRef(value: IRefObject[ICalendarDay]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ ICalendarDay | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ ICalendarDay | Null) => value(t0).runNow()))
    
    inline def maxDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    
    inline def minDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    
    inline def onDismiss(value: Callback): this.type = set("onDismiss", value.toJsFn)
    
    inline def onHeaderSelect(value: /* focus */ Boolean => Callback): this.type = set("onHeaderSelect", js.Any.fromFunction1((t0: /* focus */ Boolean) => value(t0).runNow()))
    
    inline def restrictedDates(value: js.Array[js.Date]): this.type = set("restrictedDates", value.asInstanceOf[js.Any])
    
    inline def restrictedDatesVarargs(value: js.Date*): this.type = set("restrictedDates", js.Array(value*))
    
    inline def showCloseButton(value: Boolean): this.type = set("showCloseButton", value.asInstanceOf[js.Any])
    
    inline def showSixWeeksByDefault(value: Boolean): this.type = set("showSixWeeksByDefault", value.asInstanceOf[js.Any])
    
    inline def showWeekNumbers(value: Boolean): this.type = set("showWeekNumbers", value.asInstanceOf[js.Any])
    
    inline def today(value: js.Date): this.type = set("today", value.asInstanceOf[js.Any])
    
    inline def workWeekDays(value: js.Array[DayOfWeek]): this.type = set("workWeekDays", value.asInstanceOf[js.Any])
    
    inline def workWeekDaysVarargs(value: DayOfWeek*): this.type = set("workWeekDays", js.Array(value*))
  }
  
  def withProps(p: ICalendarDayProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
