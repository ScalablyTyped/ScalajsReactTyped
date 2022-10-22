package typingsJapgolly.rmcCalendar.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.rmcCalendar.libCalendarPropsMod.PropsType
import typingsJapgolly.rmcCalendar.libCalendarPropsMod.SelectDateType
import typingsJapgolly.rmcCalendar.libDateDataTypesMod.Models.ExtraData
import typingsJapgolly.rmcCalendar.libDateDataTypesMod.Models.Locale
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.horizontal
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.normal
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.one
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.range
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.vertical
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.xl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Calendar {
  
  @JSImport("rmc-calendar", "Calendar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.rmcCalendar.mod.Calendar] {
    
    inline def defaultDate(value: js.Date): this.type = set("defaultDate", value.asInstanceOf[js.Any])
    
    inline def defaultTimeValue(value: js.Date): this.type = set("defaultTimeValue", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: SelectDateType): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def defaultValueVarargs(value: js.Date*): this.type = set("defaultValue", js.Array(value*))
    
    inline def enterDirection(value: horizontal | vertical): this.type = set("enterDirection", value.asInstanceOf[js.Any])
    
    inline def getDateExtra(value: /* date */ js.Date => ExtraData): this.type = set("getDateExtra", js.Any.fromFunction1(value))
    
    inline def infiniteOpt(value: Boolean): this.type = set("infiniteOpt", value.asInstanceOf[js.Any])
    
    inline def initalMonths(value: Double): this.type = set("initalMonths", value.asInstanceOf[js.Any])
    
    inline def locale(value: Locale): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def maxDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    
    inline def minDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    
    inline def onCancel(value: Callback): this.type = set("onCancel", value.toJsFn)
    
    inline def onClear(value: Callback): this.type = set("onClear", value.toJsFn)
    
    inline def onConfirm(
      value: (/* startDateTime */ js.UndefOr[js.Date], /* endDateTime */ js.UndefOr[js.Date]) => Callback
    ): this.type = set("onConfirm", js.Any.fromFunction2((t0: /* startDateTime */ js.UndefOr[js.Date], t1: /* endDateTime */ js.UndefOr[js.Date]) => (value(t0, t1)).runNow()))
    
    inline def onSelect(
      value: (/* date */ js.Date, /* state */ js.UndefOr[js.Tuple2[js.UndefOr[js.Date], js.UndefOr[js.Date]]]) => SelectDateType | Unit
    ): this.type = set("onSelect", js.Any.fromFunction2(value))
    
    inline def onSelectHasDisableDate(value: /* date */ js.Array[js.Date] => Callback): this.type = set("onSelectHasDisableDate", js.Any.fromFunction1((t0: /* date */ js.Array[js.Date]) => value(t0).runNow()))
    
    inline def pickTime(value: Boolean): this.type = set("pickTime", value.asInstanceOf[js.Any])
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def renderHeader(value: PropsType => Node): this.type = set("renderHeader", js.Any.fromFunction1(value))
    
    inline def renderShortcut(
      value: /* select */ js.Function2[/* startDate */ js.UndefOr[js.Date], /* endDate */ js.UndefOr[js.Date], Unit] => Node
    ): this.type = set("renderShortcut", js.Any.fromFunction1(value))
    
    inline def rowSize(value: normal | xl): this.type = set("rowSize", value.asInstanceOf[js.Any])
    
    inline def showShortcut(value: Boolean): this.type = set("showShortcut", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def timePickerPickerPrefixCls(value: String): this.type = set("timePickerPickerPrefixCls", value.asInstanceOf[js.Any])
    
    inline def timePickerPrefixCls(value: String): this.type = set("timePickerPrefixCls", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def `type`(value: one | range): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Calendar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsType): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
