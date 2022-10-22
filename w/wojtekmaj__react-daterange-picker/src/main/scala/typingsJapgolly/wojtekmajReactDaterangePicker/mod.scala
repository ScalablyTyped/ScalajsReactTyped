package typingsJapgolly.wojtekmajReactDaterangePicker

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.FocusEvent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wojtekmajReactDaterangePicker.wojtekmajReactDaterangePickerStrings.century
import typingsJapgolly.wojtekmajReactDaterangePicker.wojtekmajReactDaterangePickerStrings.decade
import typingsJapgolly.wojtekmajReactDaterangePicker.wojtekmajReactDaterangePickerStrings.month
import typingsJapgolly.wojtekmajReactDaterangePicker.wojtekmajReactDaterangePickerStrings.year
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wojtekmaj/react-daterange-picker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: DateRangePickerProps[String | js.Date]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait DateRangePickerProps[TValue /* <: String | js.Date */] extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var calendarAriaLabel: js.UndefOr[String] = js.undefined
    
    var calendarClassName: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var calendarIcon: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var clearAriaLabel: js.UndefOr[String] = js.undefined
    
    var clearIcon: js.UndefOr[Node] = js.undefined
    
    var closeCalendar: js.UndefOr[Boolean] = js.undefined
    
    var dayAriaLabel: js.UndefOr[String] = js.undefined
    
    var dayPlaceholder: js.UndefOr[String] = js.undefined
    
    var disableCalendar: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var maxDate: js.UndefOr[js.Date] = js.undefined
    
    var maxDetail: js.UndefOr[century | decade | year | month] = js.undefined
    
    var minDate: js.UndefOr[js.Date] = js.undefined
    
    var minDetail: js.UndefOr[century | decade | year | month] = js.undefined
    
    var monthAriaLabel: js.UndefOr[String] = js.undefined
    
    var monthPlaceholder: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var nativeInputAriaLabel: js.UndefOr[String] = js.undefined
    
    var onCalendarClose: js.UndefOr[js.Function0[js.UndefOr[Unit]]] = js.undefined
    
    var onCalendarOpen: js.UndefOr[js.Function0[js.UndefOr[Unit]]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ TValue, js.UndefOr[Unit]]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* event */ FocusEvent, js.UndefOr[Unit]]] = js.undefined
    
    var openCalendarOnFocus: js.UndefOr[Boolean] = js.undefined
    
    var rangeDivider: js.UndefOr[Node] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var showLeadingZeros: js.UndefOr[Boolean] = js.undefined
    
    var value: TValue | js.Array[TValue]
    
    var yearAriaLabel: js.UndefOr[String] = js.undefined
    
    var yearPlaceholder: js.UndefOr[String] = js.undefined
  }
  object DateRangePickerProps {
    
    inline def apply[TValue /* <: String | js.Date */](value: TValue | js.Array[TValue]): DateRangePickerProps[TValue] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateRangePickerProps[TValue]]
    }
    
    extension [Self <: DateRangePickerProps[?], TValue /* <: String | js.Date */](x: Self & DateRangePickerProps[TValue]) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setCalendarAriaLabel(value: String): Self = StObject.set(x, "calendarAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setCalendarAriaLabelUndefined: Self = StObject.set(x, "calendarAriaLabel", js.undefined)
      
      inline def setCalendarClassName(value: String | js.Array[String]): Self = StObject.set(x, "calendarClassName", value.asInstanceOf[js.Any])
      
      inline def setCalendarClassNameUndefined: Self = StObject.set(x, "calendarClassName", js.undefined)
      
      inline def setCalendarClassNameVarargs(value: String*): Self = StObject.set(x, "calendarClassName", js.Array(value*))
      
      inline def setCalendarIcon(value: VdomNode): Self = StObject.set(x, "calendarIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setCalendarIconNull: Self = StObject.set(x, "calendarIcon", null)
      
      inline def setCalendarIconUndefined: Self = StObject.set(x, "calendarIcon", js.undefined)
      
      inline def setCalendarIconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "calendarIcon", js.Array(value*))
      
      inline def setCalendarIconVdomElement(value: VdomElement): Self = StObject.set(x, "calendarIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String | js.Array[String]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClassNameVarargs(value: String*): Self = StObject.set(x, "className", js.Array(value*))
      
      inline def setClearAriaLabel(value: String): Self = StObject.set(x, "clearAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setClearAriaLabelUndefined: Self = StObject.set(x, "clearAriaLabel", js.undefined)
      
      inline def setClearIcon(value: VdomNode): Self = StObject.set(x, "clearIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setClearIconNull: Self = StObject.set(x, "clearIcon", null)
      
      inline def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
      
      inline def setClearIconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "clearIcon", js.Array(value*))
      
      inline def setClearIconVdomElement(value: VdomElement): Self = StObject.set(x, "clearIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCloseCalendar(value: Boolean): Self = StObject.set(x, "closeCalendar", value.asInstanceOf[js.Any])
      
      inline def setCloseCalendarUndefined: Self = StObject.set(x, "closeCalendar", js.undefined)
      
      inline def setDayAriaLabel(value: String): Self = StObject.set(x, "dayAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setDayAriaLabelUndefined: Self = StObject.set(x, "dayAriaLabel", js.undefined)
      
      inline def setDayPlaceholder(value: String): Self = StObject.set(x, "dayPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setDayPlaceholderUndefined: Self = StObject.set(x, "dayPlaceholder", js.undefined)
      
      inline def setDisableCalendar(value: Boolean): Self = StObject.set(x, "disableCalendar", value.asInstanceOf[js.Any])
      
      inline def setDisableCalendarUndefined: Self = StObject.set(x, "disableCalendar", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMaxDetail(value: century | decade | year | month): Self = StObject.set(x, "maxDetail", value.asInstanceOf[js.Any])
      
      inline def setMaxDetailUndefined: Self = StObject.set(x, "maxDetail", js.undefined)
      
      inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setMinDetail(value: century | decade | year | month): Self = StObject.set(x, "minDetail", value.asInstanceOf[js.Any])
      
      inline def setMinDetailUndefined: Self = StObject.set(x, "minDetail", js.undefined)
      
      inline def setMonthAriaLabel(value: String): Self = StObject.set(x, "monthAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setMonthAriaLabelUndefined: Self = StObject.set(x, "monthAriaLabel", js.undefined)
      
      inline def setMonthPlaceholder(value: String): Self = StObject.set(x, "monthPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setMonthPlaceholderUndefined: Self = StObject.set(x, "monthPlaceholder", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNativeInputAriaLabel(value: String): Self = StObject.set(x, "nativeInputAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setNativeInputAriaLabelUndefined: Self = StObject.set(x, "nativeInputAriaLabel", js.undefined)
      
      inline def setOnCalendarClose(value: CallbackTo[js.UndefOr[Unit]]): Self = StObject.set(x, "onCalendarClose", value.toJsFn)
      
      inline def setOnCalendarCloseUndefined: Self = StObject.set(x, "onCalendarClose", js.undefined)
      
      inline def setOnCalendarOpen(value: CallbackTo[js.UndefOr[Unit]]): Self = StObject.set(x, "onCalendarOpen", value.toJsFn)
      
      inline def setOnCalendarOpenUndefined: Self = StObject.set(x, "onCalendarOpen", js.undefined)
      
      inline def setOnChange(value: /* value */ TValue => js.UndefOr[Unit]): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: /* event */ FocusEvent => js.UndefOr[Unit]): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOpenCalendarOnFocus(value: Boolean): Self = StObject.set(x, "openCalendarOnFocus", value.asInstanceOf[js.Any])
      
      inline def setOpenCalendarOnFocusUndefined: Self = StObject.set(x, "openCalendarOnFocus", js.undefined)
      
      inline def setRangeDivider(value: VdomNode): Self = StObject.set(x, "rangeDivider", value.rawNode.asInstanceOf[js.Any])
      
      inline def setRangeDividerNull: Self = StObject.set(x, "rangeDivider", null)
      
      inline def setRangeDividerUndefined: Self = StObject.set(x, "rangeDivider", js.undefined)
      
      inline def setRangeDividerVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "rangeDivider", js.Array(value*))
      
      inline def setRangeDividerVdomElement(value: VdomElement): Self = StObject.set(x, "rangeDivider", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setShowLeadingZeros(value: Boolean): Self = StObject.set(x, "showLeadingZeros", value.asInstanceOf[js.Any])
      
      inline def setShowLeadingZerosUndefined: Self = StObject.set(x, "showLeadingZeros", js.undefined)
      
      inline def setValue(value: TValue | js.Array[TValue]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: TValue*): Self = StObject.set(x, "value", js.Array(value*))
      
      inline def setYearAriaLabel(value: String): Self = StObject.set(x, "yearAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setYearAriaLabelUndefined: Self = StObject.set(x, "yearAriaLabel", js.undefined)
      
      inline def setYearPlaceholder(value: String): Self = StObject.set(x, "yearPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setYearPlaceholderUndefined: Self = StObject.set(x, "yearPlaceholder", js.undefined)
    }
  }
}
