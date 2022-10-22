package typingsJapgolly.reactDatepicker

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.dateFns.mod.Locale
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactDatepicker.anon.Children
import typingsJapgolly.reactDatepicker.anon.Code
import typingsJapgolly.reactDatepicker.anon.End
import typingsJapgolly.reactDatepicker.reactDatepickerStrings.scroll
import typingsJapgolly.reactDatepicker.reactDatepickerStrings.select
import typingsJapgolly.reactPopper.mod.Modifier
import typingsJapgolly.reactPopper.mod.StrictModifierNames
import typingsJapgolly.std.ShadowRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-datepicker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-datepicker", JSImport.Default)
  @js.native
  open class default[CustomModifierNames /* <: String */, WithRange /* <: js.UndefOr[Boolean] */] protected () extends ReactDatePicker[CustomModifierNames, WithRange] {
    def this(props: ReactDatePickerProps[CustomModifierNames, WithRange]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ReactDatePickerProps[CustomModifierNames, WithRange], context: Any) = this()
  }
  
  inline def CalendarContainer(props: CalendarContainerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CalendarContainer")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-datepicker", "ReactDatePicker")
  @js.native
  open class ReactDatePicker[CustomModifierNames /* <: String */, WithRange /* <: js.UndefOr[Boolean] */] protected ()
    extends Component[ReactDatePickerProps[CustomModifierNames, WithRange], js.Object, Any] {
    def this(props: ReactDatePickerProps[CustomModifierNames, WithRange]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ReactDatePickerProps[CustomModifierNames, WithRange], context: Any) = this()
    
    def isCalendarOpen(): Boolean = js.native
    
    def setBlur(): Unit = js.native
    
    def setFocus(): Unit = js.native
    
    def setOpen(open: Boolean): Unit = js.native
    def setOpen(open: Boolean, skipSetBlur: Boolean): Unit = js.native
  }
  
  inline def getDefaultLocale(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultLocale")().asInstanceOf[String]
  
  inline def registerLocale(localeName: String, localeData: Locale): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLocale")(localeName.asInstanceOf[js.Any], localeData.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setDefaultLocale(localeName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultLocale")(localeName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait CalendarContainerProps extends StObject {
    
    var arrowProps: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var children: js.UndefOr[Node | js.Array[Node]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var showPopperArrow: js.UndefOr[Boolean] = js.undefined
  }
  object CalendarContainerProps {
    
    inline def apply(): CalendarContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalendarContainerProps]
    }
    
    extension [Self <: CalendarContainerProps](x: Self) {
      
      inline def setArrowProps(value: StringDictionary[Any]): Self = StObject.set(x, "arrowProps", value.asInstanceOf[js.Any])
      
      inline def setArrowPropsUndefined: Self = StObject.set(x, "arrowProps", js.undefined)
      
      inline def setChildren(value: Node | js.Array[Node]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Element | Empty | JsNumber | Node | String)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setShowPopperArrow(value: Boolean): Self = StObject.set(x, "showPopperArrow", value.asInstanceOf[js.Any])
      
      inline def setShowPopperArrowUndefined: Self = StObject.set(x, "showPopperArrow", js.undefined)
    }
  }
  
  type HighlightDates = StringDictionary[js.Array[js.Date]]
  
  trait ReactDatePickerCustomHeaderProps extends StObject {
    
    def changeMonth(month: Double): Unit
    
    def changeYear(year: Double): Unit
    
    var customHeaderCount: Double
    
    var date: js.Date
    
    def decreaseMonth(): Unit
    
    def decreaseYear(): Unit
    
    def increaseMonth(): Unit
    
    def increaseYear(): Unit
    
    var monthDate: js.Date
    
    var nextMonthButtonDisabled: Boolean
    
    var nextYearButtonDisabled: Boolean
    
    var prevMonthButtonDisabled: Boolean
    
    var prevYearButtonDisabled: Boolean
  }
  object ReactDatePickerCustomHeaderProps {
    
    inline def apply(
      changeMonth: Double => Callback,
      changeYear: Double => Callback,
      customHeaderCount: Double,
      date: js.Date,
      decreaseMonth: Callback,
      decreaseYear: Callback,
      increaseMonth: Callback,
      increaseYear: Callback,
      monthDate: js.Date,
      nextMonthButtonDisabled: Boolean,
      nextYearButtonDisabled: Boolean,
      prevMonthButtonDisabled: Boolean,
      prevYearButtonDisabled: Boolean
    ): ReactDatePickerCustomHeaderProps = {
      val __obj = js.Dynamic.literal(changeMonth = js.Any.fromFunction1((t0: Double) => changeMonth(t0).runNow()), changeYear = js.Any.fromFunction1((t0: Double) => changeYear(t0).runNow()), customHeaderCount = customHeaderCount.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], decreaseMonth = decreaseMonth.toJsFn, decreaseYear = decreaseYear.toJsFn, increaseMonth = increaseMonth.toJsFn, increaseYear = increaseYear.toJsFn, monthDate = monthDate.asInstanceOf[js.Any], nextMonthButtonDisabled = nextMonthButtonDisabled.asInstanceOf[js.Any], nextYearButtonDisabled = nextYearButtonDisabled.asInstanceOf[js.Any], prevMonthButtonDisabled = prevMonthButtonDisabled.asInstanceOf[js.Any], prevYearButtonDisabled = prevYearButtonDisabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactDatePickerCustomHeaderProps]
    }
    
    extension [Self <: ReactDatePickerCustomHeaderProps](x: Self) {
      
      inline def setChangeMonth(value: Double => Callback): Self = StObject.set(x, "changeMonth", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setChangeYear(value: Double => Callback): Self = StObject.set(x, "changeYear", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setCustomHeaderCount(value: Double): Self = StObject.set(x, "customHeaderCount", value.asInstanceOf[js.Any])
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDecreaseMonth(value: Callback): Self = StObject.set(x, "decreaseMonth", value.toJsFn)
      
      inline def setDecreaseYear(value: Callback): Self = StObject.set(x, "decreaseYear", value.toJsFn)
      
      inline def setIncreaseMonth(value: Callback): Self = StObject.set(x, "increaseMonth", value.toJsFn)
      
      inline def setIncreaseYear(value: Callback): Self = StObject.set(x, "increaseYear", value.toJsFn)
      
      inline def setMonthDate(value: js.Date): Self = StObject.set(x, "monthDate", value.asInstanceOf[js.Any])
      
      inline def setNextMonthButtonDisabled(value: Boolean): Self = StObject.set(x, "nextMonthButtonDisabled", value.asInstanceOf[js.Any])
      
      inline def setNextYearButtonDisabled(value: Boolean): Self = StObject.set(x, "nextYearButtonDisabled", value.asInstanceOf[js.Any])
      
      inline def setPrevMonthButtonDisabled(value: Boolean): Self = StObject.set(x, "prevMonthButtonDisabled", value.asInstanceOf[js.Any])
      
      inline def setPrevYearButtonDisabled(value: Boolean): Self = StObject.set(x, "prevYearButtonDisabled", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReactDatePickerProps[CustomModifierNames /* <: String */, WithRange /* <: js.UndefOr[Boolean] */] extends StObject {
    
    var adjustDateOnChange: js.UndefOr[Boolean] = js.native
    
    var allowSameDay: js.UndefOr[Boolean] = js.native
    
    var ariaDescribedBy: js.UndefOr[String] = js.native
    
    var ariaInvalid: js.UndefOr[String] = js.native
    
    var ariaLabelClose: js.UndefOr[String] = js.native
    
    var ariaLabelledBy: js.UndefOr[String] = js.native
    
    var ariaRequired: js.UndefOr[String] = js.native
    
    var autoComplete: js.UndefOr[String] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var calendarClassName: js.UndefOr[String] = js.native
    
    var calendarContainer: js.UndefOr[js.Function1[/* props */ CalendarContainerProps, Node]] = js.native
    
    var calendarStartDay: js.UndefOr[Double] = js.native
    
    var children: js.UndefOr[Node] = js.native
    
    var chooseDayAriaLabelPrefix: js.UndefOr[String] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var clearButtonClassName: js.UndefOr[String] = js.native
    
    var clearButtonTitle: js.UndefOr[String] = js.native
    
    var closeOnScroll: js.UndefOr[Boolean | (js.Function1[/* e */ Event, Boolean])] = js.native
    
    var customInput: js.UndefOr[Node] = js.native
    
    var customInputRef: js.UndefOr[String] = js.native
    
    var customTimeInput: js.UndefOr[Node] = js.native
    
    var dateFormat: js.UndefOr[String | js.Array[String]] = js.native
    
    var dateFormatCalendar: js.UndefOr[String] = js.native
    
    var dayClassName: js.UndefOr[js.Function1[/* date */ js.Date, String | Null]] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var disabledDayAriaLabelPrefix: js.UndefOr[String] = js.native
    
    var disabledKeyboardNavigation: js.UndefOr[Boolean] = js.native
    
    var dropdownMode: js.UndefOr[scroll | select] = js.native
    
    var enableTabLoop: js.UndefOr[Boolean] = js.native
    
    var endDate: js.UndefOr[js.Date | Null] = js.native
    
    var excludeDateIntervals: js.UndefOr[js.Array[End]] = js.native
    
    var excludeDates: js.UndefOr[js.Array[js.Date]] = js.native
    
    var excludeScrollbar: js.UndefOr[Boolean] = js.native
    
    var excludeTimes: js.UndefOr[js.Array[js.Date]] = js.native
    
    var filterDate: js.UndefOr[js.Function1[/* date */ js.Date, Boolean]] = js.native
    
    var filterTime: js.UndefOr[js.Function1[/* date */ js.Date, Boolean]] = js.native
    
    var fixedHeight: js.UndefOr[Boolean] = js.native
    
    var focusSelectedMonth: js.UndefOr[Boolean] = js.native
    
    var forceShowMonthNavigation: js.UndefOr[Boolean] = js.native
    
    var formatWeekDay: js.UndefOr[js.Function1[/* formattedDate */ String, Node]] = js.native
    
    var formatWeekNumber: js.UndefOr[js.Function1[/* date */ js.Date, String | Double]] = js.native
    
    var highlightDates: js.UndefOr[js.Array[HighlightDates | js.Date]] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var includeDateIntervals: js.UndefOr[js.Array[End]] = js.native
    
    var includeDates: js.UndefOr[js.Array[js.Date]] = js.native
    
    var includeTimes: js.UndefOr[js.Array[js.Date]] = js.native
    
    var injectTimes: js.UndefOr[js.Array[js.Date]] = js.native
    
    var `inline`: js.UndefOr[Boolean] = js.native
    
    var isClearable: js.UndefOr[Boolean] = js.native
    
    var locale: js.UndefOr[String | Locale] = js.native
    
    var maxDate: js.UndefOr[js.Date | Null] = js.native
    
    var maxTime: js.UndefOr[js.Date] = js.native
    
    var minDate: js.UndefOr[js.Date | Null] = js.native
    
    var minTime: js.UndefOr[js.Date] = js.native
    
    var monthClassName: js.UndefOr[js.Function1[/* date */ js.Date, String | Null]] = js.native
    
    var monthsShown: js.UndefOr[Double] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var nextMonthAriaLabel: js.UndefOr[String] = js.native
    
    var nextMonthButtonLabel: js.UndefOr[String | Node] = js.native
    
    var nextYearAriaLabel: js.UndefOr[String] = js.native
    
    var nextYearButtonLabel: js.UndefOr[String | Node] = js.native
    
    var onBlur: js.UndefOr[js.Function1[/* event */ ReactFocusEventFrom[HTMLInputElement], Unit]] = js.native
    
    var onCalendarClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onCalendarOpen: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onChangeRaw: js.UndefOr[js.Function1[/* event */ ReactFocusEventFrom[HTMLInputElement], Unit]] = js.native
    
    @JSName("onChange")
    def onChange_false(
      date: /* import warning: importer.ImportType#apply Failed type conversion: WithRange extends false | undefined ? std.Date | null : [std.Date | null, std.Date | null] */ js.Any
    ): Unit = js.native
    @JSName("onChange")
    def onChange_false(
      date: /* import warning: importer.ImportType#apply Failed type conversion: WithRange extends false | undefined ? std.Date | null : [std.Date | null, std.Date | null] */ js.Any,
      event: ReactEventFrom[Any & org.scalajs.dom.Element]
    ): Unit = js.native
    
    var onClickOutside: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLDivElement], Unit]] = js.native
    
    var onDayMouseEnter: js.UndefOr[js.Function1[/* date */ js.Date, Unit]] = js.native
    
    var onFocus: js.UndefOr[js.Function1[/* event */ ReactFocusEventFrom[HTMLInputElement], Unit]] = js.native
    
    var onInputClick: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onInputError: js.UndefOr[js.Function1[/* err */ Code, Unit]] = js.native
    
    var onKeyDown: js.UndefOr[js.Function1[/* event */ ReactKeyboardEventFrom[HTMLDivElement], Unit]] = js.native
    
    var onMonthChange: js.UndefOr[js.Function1[/* date */ js.Date, Unit]] = js.native
    
    var onMonthMouseLeave: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onSelect: js.UndefOr[
        js.Function2[
          /* date */ js.Date, 
          /* event */ js.UndefOr[ReactEventFrom[Any & org.scalajs.dom.Element]], 
          Unit
        ]
      ] = js.native
    
    var onWeekSelect: js.UndefOr[
        js.Function3[
          /* firstDayOfWeek */ js.Date, 
          /* weekNumber */ String | Double, 
          /* event */ js.UndefOr[ReactEventFrom[Any & org.scalajs.dom.Element]], 
          Unit
        ]
      ] = js.native
    
    var onYearChange: js.UndefOr[js.Function1[/* date */ js.Date, Unit]] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
    
    var openToDate: js.UndefOr[js.Date] = js.native
    
    var peekNextMonth: js.UndefOr[Boolean] = js.native
    
    var placeholderText: js.UndefOr[String] = js.native
    
    var popperClassName: js.UndefOr[String] = js.native
    
    var popperContainer: js.UndefOr[js.Function1[/* props */ Children, Node]] = js.native
    
    var popperModifiers: js.UndefOr[js.Array[Modifier[StrictModifierNames | CustomModifierNames, js.Object]]] = js.native
    
    var popperPlacement: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Placement */ Any
      ] = js.native
    
    var popperProps: js.UndefOr[js.Object] = js.native
    
    var portalHost: js.UndefOr[ShadowRoot] = js.native
    
    var portalId: js.UndefOr[String] = js.native
    
    var preventOpenOnFocus: js.UndefOr[Boolean] = js.native
    
    var previousMonthAriaLabel: js.UndefOr[String] = js.native
    
    var previousMonthButtonLabel: js.UndefOr[String | Node] = js.native
    
    var previousYearAriaLabel: js.UndefOr[String] = js.native
    
    var previousYearButtonLabel: js.UndefOr[String | Node] = js.native
    
    var readOnly: js.UndefOr[Boolean] = js.native
    
    var renderCustomHeader: js.UndefOr[js.Function1[/* params */ ReactDatePickerCustomHeaderProps, Node]] = js.native
    
    var renderDayContents: js.UndefOr[js.Function2[/* dayOfMonth */ Double, /* date */ js.UndefOr[js.Date], Node]] = js.native
    
    var required: js.UndefOr[Boolean] = js.native
    
    var scrollableMonthYearDropdown: js.UndefOr[Boolean] = js.native
    
    var scrollableYearDropdown: js.UndefOr[Boolean] = js.native
    
    var selected: js.UndefOr[js.Date | Null] = js.native
    
    var selectsEnd: js.UndefOr[Boolean] = js.native
    
    var selectsRange: js.UndefOr[WithRange] = js.native
    
    var selectsStart: js.UndefOr[Boolean] = js.native
    
    var shouldCloseOnSelect: js.UndefOr[Boolean] = js.native
    
    var showDisabledMonthNavigation: js.UndefOr[Boolean] = js.native
    
    var showFourColumnMonthYearPicker: js.UndefOr[Boolean] = js.native
    
    var showFullMonthYearPicker: js.UndefOr[Boolean] = js.native
    
    var showMonthDropdown: js.UndefOr[Boolean] = js.native
    
    var showMonthYearDropdown: js.UndefOr[Boolean] = js.native
    
    var showMonthYearPicker: js.UndefOr[Boolean] = js.native
    
    var showPopperArrow: js.UndefOr[Boolean] = js.native
    
    var showPreviousMonths: js.UndefOr[Boolean] = js.native
    
    var showQuarterYearPicker: js.UndefOr[Boolean] = js.native
    
    var showTimeInput: js.UndefOr[Boolean] = js.native
    
    var showTimeSelect: js.UndefOr[Boolean] = js.native
    
    var showTimeSelectOnly: js.UndefOr[Boolean] = js.native
    
    var showTwoColumnMonthYearPicker: js.UndefOr[Boolean] = js.native
    
    var showWeekNumbers: js.UndefOr[Boolean] = js.native
    
    var showYearDropdown: js.UndefOr[Boolean] = js.native
    
    var showYearPicker: js.UndefOr[Boolean] = js.native
    
    var startDate: js.UndefOr[js.Date | Null] = js.native
    
    var startOpen: js.UndefOr[Boolean] = js.native
    
    var strictParsing: js.UndefOr[Boolean] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var timeCaption: js.UndefOr[String] = js.native
    
    var timeClassName: js.UndefOr[js.Function1[/* date */ js.Date, String | Null]] = js.native
    
    var timeFormat: js.UndefOr[String] = js.native
    
    var timeInputLabel: js.UndefOr[String] = js.native
    
    var timeIntervals: js.UndefOr[Double] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var todayButton: js.UndefOr[Node] = js.native
    
    var useShortMonthInDropdown: js.UndefOr[Boolean] = js.native
    
    var useWeekdaysShort: js.UndefOr[Boolean] = js.native
    
    var value: js.UndefOr[String] = js.native
    
    var weekAriaLabelPrefix: js.UndefOr[String] = js.native
    
    var weekDayClassName: js.UndefOr[js.Function1[/* date */ js.Date, String | Null]] = js.native
    
    var weekLabel: js.UndefOr[String] = js.native
    
    var withPortal: js.UndefOr[Boolean] = js.native
    
    var wrapperClassName: js.UndefOr[String] = js.native
    
    var yearDropdownItemNumber: js.UndefOr[Double] = js.native
    
    var yearItemNumber: js.UndefOr[Double] = js.native
  }
}
