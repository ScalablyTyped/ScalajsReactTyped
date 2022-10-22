package typingsJapgolly.blueprintjsDatetime.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsCore.libEsmComponentsFormsInputGroupMod.InputGroupProps2
import typingsJapgolly.blueprintjsDatetime.anon.PartialIPopoverProps
import typingsJapgolly.blueprintjsDatetime.blueprintjsDatetimeBooleans.`false`
import typingsJapgolly.blueprintjsDatetime.libEsmCommonDateRangeMod.DateRange
import typingsJapgolly.blueprintjsDatetime.libEsmDatePickerCoreMod.DatePickerModifiers
import typingsJapgolly.blueprintjsDatetime.libEsmDateRangeInputMod.IDateRangeInputProps
import typingsJapgolly.blueprintjsDatetime.libEsmShortcutsMod.DateRangeShortcut
import typingsJapgolly.blueprintjsDatetime.libEsmTimePickerMod.TimePickerProps
import typingsJapgolly.blueprintjsDatetime.libEsmTimePickerMod.TimePrecision
import typingsJapgolly.reactDayPicker.mod.DayPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DateRangeInput {
  
  inline def apply(
    formatDate: (js.Date, js.UndefOr[String]) => String,
    parseDate: (String, js.UndefOr[String]) => js.Date | Null | `false`
  ): Builder = {
    val __props = js.Dynamic.literal(formatDate = js.Any.fromFunction2(formatDate), parseDate = js.Any.fromFunction2(parseDate))
    new Builder(js.Array(this.component, __props.asInstanceOf[IDateRangeInputProps]))
  }
  
  @JSImport("@blueprintjs/datetime", "DateRangeInput")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsDatetime.mod.DateRangeInput] {
    
    inline def allowSingleDayRange(value: Boolean): this.type = set("allowSingleDayRange", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def closeOnSelection(value: Boolean): this.type = set("closeOnSelection", value.asInstanceOf[js.Any])
    
    inline def contiguousCalendarMonths(value: Boolean): this.type = set("contiguousCalendarMonths", value.asInstanceOf[js.Any])
    
    inline def dayPickerProps(value: DayPickerProps): this.type = set("dayPickerProps", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: DateRange): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def endInputProps(value: InputGroupProps2): this.type = set("endInputProps", value.asInstanceOf[js.Any])
    
    inline def footerElement(value: VdomElement): this.type = set("footerElement", value.rawElement.asInstanceOf[js.Any])
    
    inline def highlightCurrentDay(value: Boolean): this.type = set("highlightCurrentDay", value.asInstanceOf[js.Any])
    
    inline def initialMonth(value: js.Date): this.type = set("initialMonth", value.asInstanceOf[js.Any])
    
    inline def invalidDateMessage(value: String): this.type = set("invalidDateMessage", value.asInstanceOf[js.Any])
    
    inline def locale(value: String): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def localeUtils(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ Any): this.type = set("localeUtils", value.asInstanceOf[js.Any])
    
    inline def maxDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    
    inline def minDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    
    inline def modifiers(value: DatePickerModifiers): this.type = set("modifiers", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* selectedRange */ DateRange => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* selectedRange */ DateRange) => value(t0).runNow()))
    
    inline def onError(value: /* errorRange */ DateRange => Callback): this.type = set("onError", js.Any.fromFunction1((t0: /* errorRange */ DateRange) => value(t0).runNow()))
    
    inline def outOfRangeMessage(value: String): this.type = set("outOfRangeMessage", value.asInstanceOf[js.Any])
    
    inline def overlappingDatesMessage(value: String): this.type = set("overlappingDatesMessage", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def popoverProps(value: PartialIPopoverProps): this.type = set("popoverProps", value.asInstanceOf[js.Any])
    
    inline def reverseMonthAndYearMenus(value: Boolean): this.type = set("reverseMonthAndYearMenus", value.asInstanceOf[js.Any])
    
    inline def selectAllOnFocus(value: Boolean): this.type = set("selectAllOnFocus", value.asInstanceOf[js.Any])
    
    inline def shortcuts(value: Boolean | js.Array[DateRangeShortcut]): this.type = set("shortcuts", value.asInstanceOf[js.Any])
    
    inline def shortcutsVarargs(value: DateRangeShortcut*): this.type = set("shortcuts", js.Array(value*))
    
    inline def singleMonthOnly(value: Boolean): this.type = set("singleMonthOnly", value.asInstanceOf[js.Any])
    
    inline def startInputProps(value: InputGroupProps2): this.type = set("startInputProps", value.asInstanceOf[js.Any])
    
    inline def timePickerProps(value: TimePickerProps): this.type = set("timePickerProps", value.asInstanceOf[js.Any])
    
    inline def timePrecision(value: TimePrecision): this.type = set("timePrecision", value.asInstanceOf[js.Any])
    
    inline def value(value: DateRange): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IDateRangeInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
