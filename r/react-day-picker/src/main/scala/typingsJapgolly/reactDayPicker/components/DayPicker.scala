package typingsJapgolly.reactDayPicker.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.dateFns.mod.Locale
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactDayPicker.anon.PartialFormatters
import typingsJapgolly.reactDayPicker.anon.PartialLabels
import typingsJapgolly.reactDayPicker.mod.ActiveModifiers
import typingsJapgolly.reactDayPicker.mod.CaptionLayout
import typingsJapgolly.reactDayPicker.mod.ClassNames
import typingsJapgolly.reactDayPicker.mod.CustomComponents
import typingsJapgolly.reactDayPicker.mod.DayModifiers
import typingsJapgolly.reactDayPicker.mod.DayPickerSingleProps
import typingsJapgolly.reactDayPicker.mod.Matcher
import typingsJapgolly.reactDayPicker.mod.ModifiersClassNames
import typingsJapgolly.reactDayPicker.mod.ModifiersStyles
import typingsJapgolly.reactDayPicker.mod.Styles
import typingsJapgolly.reactDayPicker.reactDayPickerInts.`0`
import typingsJapgolly.reactDayPicker.reactDayPickerInts.`1`
import typingsJapgolly.reactDayPicker.reactDayPickerInts.`2`
import typingsJapgolly.reactDayPicker.reactDayPickerInts.`3`
import typingsJapgolly.reactDayPicker.reactDayPickerInts.`4`
import typingsJapgolly.reactDayPicker.reactDayPickerInts.`5`
import typingsJapgolly.reactDayPicker.reactDayPickerInts.`6`
import typingsJapgolly.reactDayPicker.reactDayPickerInts.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DayPicker {
  
  inline def apply(): Builder = {
    val __props = js.Dynamic.literal(mode = "single")
    new Builder(js.Array(this.component, __props.asInstanceOf[DayPickerSingleProps]))
  }
  
  @JSImport("react-day-picker", "DayPicker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def ISOWeek(value: Boolean): this.type = set("ISOWeek", value.asInstanceOf[js.Any])
    
    inline def captionLayout(value: CaptionLayout): this.type = set("captionLayout", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def classNames(value: ClassNames): this.type = set("classNames", value.asInstanceOf[js.Any])
    
    inline def components(value: CustomComponents): this.type = set("components", value.asInstanceOf[js.Any])
    
    inline def defaultMonth(value: js.Date): this.type = set("defaultMonth", value.asInstanceOf[js.Any])
    
    inline def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
    
    inline def disableNavigation(value: Boolean): this.type = set("disableNavigation", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Matcher | js.Array[Matcher]): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def disabledFunction1(value: /* date */ js.Date => Boolean): this.type = set("disabled", js.Any.fromFunction1(value))
    
    inline def disabledVarargs(value: (js.Date | Matcher)*): this.type = set("disabled", js.Array(value*))
    
    inline def firstWeekContainsDate(value: `1` | `2` | `3` | `4` | `5` | `6` | `7`): this.type = set("firstWeekContainsDate", value.asInstanceOf[js.Any])
    
    inline def fixedWeeks(value: Boolean): this.type = set("fixedWeeks", value.asInstanceOf[js.Any])
    
    inline def footer(value: VdomNode): this.type = set("footer", value.rawNode.asInstanceOf[js.Any])
    
    inline def footerNull: this.type = set("footer", null)
    
    inline def footerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("footer", js.Array(value*))
    
    inline def footerVdomElement(value: VdomElement): this.type = set("footer", value.rawElement.asInstanceOf[js.Any])
    
    inline def formatters(value: PartialFormatters): this.type = set("formatters", value.asInstanceOf[js.Any])
    
    inline def fromDate(value: js.Date): this.type = set("fromDate", value.asInstanceOf[js.Any])
    
    inline def fromMonth(value: js.Date): this.type = set("fromMonth", value.asInstanceOf[js.Any])
    
    inline def fromYear(value: Double): this.type = set("fromYear", value.asInstanceOf[js.Any])
    
    inline def hidden(value: Matcher | js.Array[Matcher]): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    inline def hiddenFunction1(value: /* date */ js.Date => Boolean): this.type = set("hidden", js.Any.fromFunction1(value))
    
    inline def hiddenVarargs(value: (js.Date | Matcher)*): this.type = set("hidden", js.Array(value*))
    
    inline def hideHead(value: Boolean): this.type = set("hideHead", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def initialFocus(value: Boolean): this.type = set("initialFocus", value.asInstanceOf[js.Any])
    
    inline def labels(value: PartialLabels): this.type = set("labels", value.asInstanceOf[js.Any])
    
    inline def locale(value: Locale): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def modifiers(value: DayModifiers): this.type = set("modifiers", value.asInstanceOf[js.Any])
    
    inline def modifiersClassNames(value: ModifiersClassNames): this.type = set("modifiersClassNames", value.asInstanceOf[js.Any])
    
    inline def modifiersStyles(value: ModifiersStyles): this.type = set("modifiersStyles", value.asInstanceOf[js.Any])
    
    inline def month(value: js.Date): this.type = set("month", value.asInstanceOf[js.Any])
    
    inline def numberOfMonths(value: Double): this.type = set("numberOfMonths", value.asInstanceOf[js.Any])
    
    inline def onDayBlur(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ ReactFocusEventFrom[org.scalajs.dom.Element] | ReactKeyboardEventFrom[org.scalajs.dom.Element]) => Callback
    ): this.type = set("onDayBlur", js.Any.fromFunction3((t0: /* day */ js.Date, t1: /* activeModifiers */ ActiveModifiers, t2: /* e */ ReactFocusEventFrom[org.scalajs.dom.Element] | ReactKeyboardEventFrom[org.scalajs.dom.Element]) => (value(t0, t1, t2)).runNow()))
    
    inline def onDayClick(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ ReactMouseEventFrom[org.scalajs.dom.Element]) => Callback
    ): this.type = set("onDayClick", js.Any.fromFunction3((t0: /* day */ js.Date, t1: /* activeModifiers */ ActiveModifiers, t2: /* e */ ReactMouseEventFrom[org.scalajs.dom.Element]) => (value(t0, t1, t2)).runNow()))
    
    inline def onDayFocus(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ ReactFocusEventFrom[org.scalajs.dom.Element] | ReactKeyboardEventFrom[org.scalajs.dom.Element]) => Callback
    ): this.type = set("onDayFocus", js.Any.fromFunction3((t0: /* day */ js.Date, t1: /* activeModifiers */ ActiveModifiers, t2: /* e */ ReactFocusEventFrom[org.scalajs.dom.Element] | ReactKeyboardEventFrom[org.scalajs.dom.Element]) => (value(t0, t1, t2)).runNow()))
    
    inline def onDayKeyDown(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ ReactKeyboardEventFrom[org.scalajs.dom.Element]) => Callback
    ): this.type = set("onDayKeyDown", js.Any.fromFunction3((t0: /* day */ js.Date, t1: /* activeModifiers */ ActiveModifiers, t2: /* e */ ReactKeyboardEventFrom[org.scalajs.dom.Element]) => (value(t0, t1, t2)).runNow()))
    
    inline def onDayKeyPress(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ ReactKeyboardEventFrom[org.scalajs.dom.Element]) => Callback
    ): this.type = set("onDayKeyPress", js.Any.fromFunction3((t0: /* day */ js.Date, t1: /* activeModifiers */ ActiveModifiers, t2: /* e */ ReactKeyboardEventFrom[org.scalajs.dom.Element]) => (value(t0, t1, t2)).runNow()))
    
    inline def onDayKeyUp(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ ReactKeyboardEventFrom[org.scalajs.dom.Element]) => Callback
    ): this.type = set("onDayKeyUp", js.Any.fromFunction3((t0: /* day */ js.Date, t1: /* activeModifiers */ ActiveModifiers, t2: /* e */ ReactKeyboardEventFrom[org.scalajs.dom.Element]) => (value(t0, t1, t2)).runNow()))
    
    inline def onDayMouseEnter(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ ReactMouseEventFrom[org.scalajs.dom.Element]) => Callback
    ): this.type = set("onDayMouseEnter", js.Any.fromFunction3((t0: /* day */ js.Date, t1: /* activeModifiers */ ActiveModifiers, t2: /* e */ ReactMouseEventFrom[org.scalajs.dom.Element]) => (value(t0, t1, t2)).runNow()))
    
    inline def onDayMouseLeave(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ ReactMouseEventFrom[org.scalajs.dom.Element]) => Callback
    ): this.type = set("onDayMouseLeave", js.Any.fromFunction3((t0: /* day */ js.Date, t1: /* activeModifiers */ ActiveModifiers, t2: /* e */ ReactMouseEventFrom[org.scalajs.dom.Element]) => (value(t0, t1, t2)).runNow()))
    
    inline def onDayTouchCancel(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ ReactTouchEventFrom[org.scalajs.dom.Element]) => Callback
    ): this.type = set("onDayTouchCancel", js.Any.fromFunction3((t0: /* day */ js.Date, t1: /* activeModifiers */ ActiveModifiers, t2: /* e */ ReactTouchEventFrom[org.scalajs.dom.Element]) => (value(t0, t1, t2)).runNow()))
    
    inline def onDayTouchEnd(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ ReactTouchEventFrom[org.scalajs.dom.Element]) => Callback
    ): this.type = set("onDayTouchEnd", js.Any.fromFunction3((t0: /* day */ js.Date, t1: /* activeModifiers */ ActiveModifiers, t2: /* e */ ReactTouchEventFrom[org.scalajs.dom.Element]) => (value(t0, t1, t2)).runNow()))
    
    inline def onDayTouchMove(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ ReactTouchEventFrom[org.scalajs.dom.Element]) => Callback
    ): this.type = set("onDayTouchMove", js.Any.fromFunction3((t0: /* day */ js.Date, t1: /* activeModifiers */ ActiveModifiers, t2: /* e */ ReactTouchEventFrom[org.scalajs.dom.Element]) => (value(t0, t1, t2)).runNow()))
    
    inline def onDayTouchStart(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ ReactTouchEventFrom[org.scalajs.dom.Element]) => Callback
    ): this.type = set("onDayTouchStart", js.Any.fromFunction3((t0: /* day */ js.Date, t1: /* activeModifiers */ ActiveModifiers, t2: /* e */ ReactTouchEventFrom[org.scalajs.dom.Element]) => (value(t0, t1, t2)).runNow()))
    
    inline def onMonthChange(value: /* month */ js.Date => Callback): this.type = set("onMonthChange", js.Any.fromFunction1((t0: /* month */ js.Date) => value(t0).runNow()))
    
    inline def onNextClick(value: /* month */ js.Date => Callback): this.type = set("onNextClick", js.Any.fromFunction1((t0: /* month */ js.Date) => value(t0).runNow()))
    
    inline def onPrevClick(value: /* month */ js.Date => Callback): this.type = set("onPrevClick", js.Any.fromFunction1((t0: /* month */ js.Date) => value(t0).runNow()))
    
    inline def onSelect(
      value: (/* day */ js.UndefOr[js.Date], /* selectedDay */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ ReactMouseEventFrom[org.scalajs.dom.Element]) => Callback
    ): this.type = set("onSelect", js.Any.fromFunction4((t0: /* day */ js.UndefOr[js.Date], t1: /* selectedDay */ js.Date, t2: /* activeModifiers */ ActiveModifiers, t3: /* e */ ReactMouseEventFrom[org.scalajs.dom.Element]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def onWeekNumberClick(
      value: (/* weekNumber */ Double, /* dates */ js.Array[js.Date], /* e */ ReactMouseEventFrom[org.scalajs.dom.Element]) => Callback
    ): this.type = set("onWeekNumberClick", js.Any.fromFunction3((t0: /* weekNumber */ Double, t1: /* dates */ js.Array[js.Date], t2: /* e */ ReactMouseEventFrom[org.scalajs.dom.Element]) => (value(t0, t1, t2)).runNow()))
    
    inline def pagedNavigation(value: Boolean): this.type = set("pagedNavigation", value.asInstanceOf[js.Any])
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def reverseMonths(value: Boolean): this.type = set("reverseMonths", value.asInstanceOf[js.Any])
    
    inline def selected(value: js.Date): this.type = set("selected", value.asInstanceOf[js.Any])
    
    inline def showOutsideDays(value: Boolean): this.type = set("showOutsideDays", value.asInstanceOf[js.Any])
    
    inline def showWeekNumber(value: Boolean): this.type = set("showWeekNumber", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styles(value: Styles): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def toDate(value: js.Date): this.type = set("toDate", value.asInstanceOf[js.Any])
    
    inline def toMonth(value: js.Date): this.type = set("toMonth", value.asInstanceOf[js.Any])
    
    inline def toYear(value: Double): this.type = set("toYear", value.asInstanceOf[js.Any])
    
    inline def today(value: js.Date): this.type = set("today", value.asInstanceOf[js.Any])
    
    inline def weekStartsOn(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): this.type = set("weekStartsOn", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DayPickerSingleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
