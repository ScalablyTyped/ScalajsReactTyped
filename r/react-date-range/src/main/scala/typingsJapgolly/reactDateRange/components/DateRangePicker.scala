package typingsJapgolly.reactDateRange.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.dateFns.mod.Locale
import typingsJapgolly.reactDateRange.mod.AriaLabelsShape
import typingsJapgolly.reactDateRange.mod.CalendarProps
import typingsJapgolly.reactDateRange.mod.ClassNames
import typingsJapgolly.reactDateRange.mod.DateRangePickerProps
import typingsJapgolly.reactDateRange.mod.InputRange
import typingsJapgolly.reactDateRange.mod.Preview
import typingsJapgolly.reactDateRange.mod.Range
import typingsJapgolly.reactDateRange.mod.RangeFocus
import typingsJapgolly.reactDateRange.mod.RangeKeyDict
import typingsJapgolly.reactDateRange.mod.ScrollOptions
import typingsJapgolly.reactDateRange.mod.StaticRange
import typingsJapgolly.reactDateRange.reactDateRangeInts.`0`
import typingsJapgolly.reactDateRange.reactDateRangeInts.`1`
import typingsJapgolly.reactDateRange.reactDateRangeInts.`2`
import typingsJapgolly.reactDateRange.reactDateRangeInts.`3`
import typingsJapgolly.reactDateRange.reactDateRangeInts.`4`
import typingsJapgolly.reactDateRange.reactDateRangeInts.`5`
import typingsJapgolly.reactDateRange.reactDateRangeInts.`6`
import typingsJapgolly.reactDateRange.reactDateRangeStrings.backwards
import typingsJapgolly.reactDateRange.reactDateRangeStrings.date
import typingsJapgolly.reactDateRange.reactDateRangeStrings.dateRange
import typingsJapgolly.reactDateRange.reactDateRangeStrings.forwards
import typingsJapgolly.reactDateRange.reactDateRangeStrings.horizontal
import typingsJapgolly.reactDateRange.reactDateRangeStrings.monthOffset
import typingsJapgolly.reactDateRange.reactDateRangeStrings.set
import typingsJapgolly.reactDateRange.reactDateRangeStrings.setMonth
import typingsJapgolly.reactDateRange.reactDateRangeStrings.setYear
import typingsJapgolly.reactDateRange.reactDateRangeStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DateRangePicker {
  
  @JSImport("react-date-range", "DateRangePicker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactDateRange.mod.DateRangePicker] {
    
    inline def ariaLabels(value: AriaLabelsShape): this.type = set("ariaLabels", value.asInstanceOf[js.Any])
    
    inline def calendarFocus(value: forwards | backwards): this.type = set("calendarFocus", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def classNames(value: ClassNames): this.type = set("classNames", value.asInstanceOf[js.Any])
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def date(value: js.Date): this.type = set("date", value.asInstanceOf[js.Any])
    
    inline def dateDisplayFormat(value: String): this.type = set("dateDisplayFormat", value.asInstanceOf[js.Any])
    
    inline def dayContentRenderer(value: /* date */ js.Date => Node): this.type = set("dayContentRenderer", js.Any.fromFunction1(value))
    
    inline def dayDisplayFormat(value: String): this.type = set("dayDisplayFormat", value.asInstanceOf[js.Any])
    
    inline def direction(value: vertical | horizontal): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def disabledDates(value: js.Array[js.Date]): this.type = set("disabledDates", value.asInstanceOf[js.Any])
    
    inline def disabledDatesVarargs(value: js.Date*): this.type = set("disabledDates", js.Array(value*))
    
    inline def disabledDay(value: /* date */ js.Date => Boolean): this.type = set("disabledDay", js.Any.fromFunction1(value))
    
    inline def displayMode(value: dateRange | date): this.type = set("displayMode", value.asInstanceOf[js.Any])
    
    inline def dragSelectionEnabled(value: Boolean): this.type = set("dragSelectionEnabled", value.asInstanceOf[js.Any])
    
    inline def editableDateInputs(value: Boolean): this.type = set("editableDateInputs", value.asInstanceOf[js.Any])
    
    inline def endDatePlaceholder(value: String): this.type = set("endDatePlaceholder", value.asInstanceOf[js.Any])
    
    inline def fixedHeight(value: Boolean): this.type = set("fixedHeight", value.asInstanceOf[js.Any])
    
    inline def focusedRange(value: RangeFocus): this.type = set("focusedRange", value.asInstanceOf[js.Any])
    
    inline def footerContent(value: VdomNode): this.type = set("footerContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def footerContentNull: this.type = set("footerContent", null)
    
    inline def footerContentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("footerContent", js.Array(value*))
    
    inline def footerContentVdomElement(value: VdomElement): this.type = set("footerContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def headerContent(value: VdomNode): this.type = set("headerContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def headerContentNull: this.type = set("headerContent", null)
    
    inline def headerContentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("headerContent", js.Array(value*))
    
    inline def headerContentVdomElement(value: VdomElement): this.type = set("headerContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def initialFocusedRange(value: RangeFocus): this.type = set("initialFocusedRange", value.asInstanceOf[js.Any])
    
    inline def inputRanges(value: js.Array[InputRange]): this.type = set("inputRanges", value.asInstanceOf[js.Any])
    
    inline def inputRangesVarargs(value: InputRange*): this.type = set("inputRanges", js.Array(value*))
    
    inline def locale(value: Locale): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def maxDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    
    inline def minDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    
    inline def monthDisplayFormat(value: String): this.type = set("monthDisplayFormat", value.asInstanceOf[js.Any])
    
    inline def months(value: Double): this.type = set("months", value.asInstanceOf[js.Any])
    
    inline def moveRangeOnFirstSelection(value: Boolean): this.type = set("moveRangeOnFirstSelection", value.asInstanceOf[js.Any])
    
    inline def navigatorRenderer(
      value: (/* currFocusedDate */ js.Date, /* changeShownDate */ js.Function2[
          /* value */ js.Date | Double | String, 
          /* mode */ js.UndefOr[set | setYear | setMonth | monthOffset], 
          Unit
        ], /* props */ CalendarProps) => typingsJapgolly.react.mod.global.JSX.Element
    ): this.type = set("navigatorRenderer", js.Any.fromFunction3(value))
    
    inline def onChange(value: /* rangesByKey */ RangeKeyDict => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* rangesByKey */ RangeKeyDict) => value(t0).runNow()))
    
    inline def onPreviewChange(value: /* preview */ js.UndefOr[js.Date | Preview] => Callback): this.type = set("onPreviewChange", js.Any.fromFunction1((t0: /* preview */ js.UndefOr[js.Date | Preview]) => value(t0).runNow()))
    
    inline def onRangeFocusChange(value: /* newFocusedRange */ RangeFocus => Callback): this.type = set("onRangeFocusChange", js.Any.fromFunction1((t0: /* newFocusedRange */ RangeFocus) => value(t0).runNow()))
    
    inline def onShownDateChange(value: /* date */ js.Date => Callback): this.type = set("onShownDateChange", js.Any.fromFunction1((t0: /* date */ js.Date) => value(t0).runNow()))
    
    inline def preventSnapRefocus(value: Boolean): this.type = set("preventSnapRefocus", value.asInstanceOf[js.Any])
    
    inline def preview(value: Preview): this.type = set("preview", value.asInstanceOf[js.Any])
    
    inline def rangeColors(value: js.Array[String]): this.type = set("rangeColors", value.asInstanceOf[js.Any])
    
    inline def rangeColorsVarargs(value: String*): this.type = set("rangeColors", js.Array(value*))
    
    inline def ranges(value: js.Array[Range]): this.type = set("ranges", value.asInstanceOf[js.Any])
    
    inline def rangesVarargs(value: Range*): this.type = set("ranges", js.Array(value*))
    
    inline def renderStaticRangeLabel(value: /* staticRange */ StaticRange => Node): this.type = set("renderStaticRangeLabel", js.Any.fromFunction1(value))
    
    inline def retainEndDateOnFirstSelection(value: Boolean): this.type = set("retainEndDateOnFirstSelection", value.asInstanceOf[js.Any])
    
    inline def scroll(value: ScrollOptions): this.type = set("scroll", value.asInstanceOf[js.Any])
    
    inline def showDateDisplay(value: Boolean): this.type = set("showDateDisplay", value.asInstanceOf[js.Any])
    
    inline def showMonthAndYearPickers(value: Boolean): this.type = set("showMonthAndYearPickers", value.asInstanceOf[js.Any])
    
    inline def showMonthArrow(value: Boolean): this.type = set("showMonthArrow", value.asInstanceOf[js.Any])
    
    inline def showPreview(value: Boolean): this.type = set("showPreview", value.asInstanceOf[js.Any])
    
    inline def shownDate(value: js.Date): this.type = set("shownDate", value.asInstanceOf[js.Any])
    
    inline def startDatePlaceholder(value: String): this.type = set("startDatePlaceholder", value.asInstanceOf[js.Any])
    
    inline def staticRanges(value: js.Array[StaticRange]): this.type = set("staticRanges", value.asInstanceOf[js.Any])
    
    inline def staticRangesVarargs(value: StaticRange*): this.type = set("staticRanges", js.Array(value*))
    
    inline def updateRange(value: /* newRange */ Range => Callback): this.type = set("updateRange", js.Any.fromFunction1((t0: /* newRange */ Range) => value(t0).runNow()))
    
    inline def weekStartsOn(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): this.type = set("weekStartsOn", value.asInstanceOf[js.Any])
    
    inline def weekdayDisplayFormat(value: String): this.type = set("weekdayDisplayFormat", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DateRangePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DateRangePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
