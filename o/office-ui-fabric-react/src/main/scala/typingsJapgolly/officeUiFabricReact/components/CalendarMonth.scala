package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.officeUiFabricReact.libComponentsCalendarCalendarDottypesMod.ICalendarFormatDateCallbacks
import typingsJapgolly.officeUiFabricReact.libComponentsCalendarCalendarDottypesMod.ICalendarIconStrings
import typingsJapgolly.officeUiFabricReact.libComponentsCalendarCalendarDottypesMod.ICalendarStrings
import typingsJapgolly.officeUiFabricReact.libComponentsCalendarCalendarMonthMod.ICalendarMonth
import typingsJapgolly.officeUiFabricReact.libComponentsCalendarCalendarMonthMod.ICalendarMonthProps
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CalendarMonth {
  
  inline def apply(
    dateTimeFormatter: ICalendarFormatDateCallbacks,
    highlightCurrentMonth: Boolean,
    highlightSelectedMonth: Boolean,
    navigatedDate: js.Date,
    navigationIcons: ICalendarIconStrings,
    onNavigateDate: (js.Date, Boolean) => Callback,
    selectedDate: js.Date,
    strings: ICalendarStrings
  ): Builder = {
    val __props = js.Dynamic.literal(dateTimeFormatter = dateTimeFormatter.asInstanceOf[js.Any], highlightCurrentMonth = highlightCurrentMonth.asInstanceOf[js.Any], highlightSelectedMonth = highlightSelectedMonth.asInstanceOf[js.Any], navigatedDate = navigatedDate.asInstanceOf[js.Any], navigationIcons = navigationIcons.asInstanceOf[js.Any], onNavigateDate = js.Any.fromFunction2((t0: js.Date, t1: Boolean) => (onNavigateDate(t0, t1)).runNow()), selectedDate = selectedDate.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ICalendarMonthProps]))
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Calendar/CalendarMonth", "CalendarMonth")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[
          typingsJapgolly.officeUiFabricReact.libComponentsCalendarCalendarMonthMod.CalendarMonth
        ] {
    
    inline def componentRef(value: IRefObject[ICalendarMonth]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ ICalendarMonth | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ ICalendarMonth | Null) => value(t0).runNow()))
    
    inline def maxDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    
    inline def minDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    
    inline def onHeaderSelect(value: /* focus */ Boolean => Callback): this.type = set("onHeaderSelect", js.Any.fromFunction1((t0: /* focus */ Boolean) => value(t0).runNow()))
    
    inline def today(value: js.Date): this.type = set("today", value.asInstanceOf[js.Any])
    
    inline def yearPickerHidden(value: Boolean): this.type = set("yearPickerHidden", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ICalendarMonthProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
