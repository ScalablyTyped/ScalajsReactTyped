package typingsJapgolly.primereact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.primereact.primereactStrings.self
import typingsJapgolly.primereact.tooltipTooltipoptionsMod.TooltipOptions
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calendarCalendarMod {
  
  @JSImport("primereact/calendar/calendar", "Calendar")
  @js.native
  open class Calendar protected () extends Component[CalendarProps, Any, Any] {
    def this(props: CalendarProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CalendarProps, context: Any) = this()
    
    def getCurrentDateTime(): js.Date | js.Array[js.Date] = js.native
    
    def getElement(): HTMLSpanElement = js.native
    
    def getInput(): HTMLInputElement = js.native
    
    def getOverlay(): HTMLElement = js.native
    
    def getViewDate(): js.Date | js.Array[js.Date] = js.native
    
    def hide(): Unit = js.native
    
    def show(): Unit = js.native
    
    def updateViewDate(event: CalendarEventType, value: js.Array[js.Date]): Unit = js.native
    def updateViewDate(event: CalendarEventType, value: js.Date): Unit = js.native
  }
  
  type CalendarAppendToType = js.UndefOr[self | HTMLElement | Null]
  
  trait CalendarChangeParams extends StObject {
    
    var originalEvent: ReactEventFrom[Element]
    
    def preventDefault(): Unit
    
    def stopPropagation(): Unit
    
    var target: CalendarChangeTargetOptions
    
    var value: js.UndefOr[js.Date | js.Array[js.Date]] = js.undefined
  }
  object CalendarChangeParams {
    
    inline def apply(
      originalEvent: ReactEventFrom[Element],
      preventDefault: Callback,
      stopPropagation: Callback,
      target: CalendarChangeTargetOptions
    ): CalendarChangeParams = {
      val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], preventDefault = preventDefault.toJsFn, stopPropagation = stopPropagation.toJsFn, target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalendarChangeParams]
    }
    
    extension [Self <: CalendarChangeParams](x: Self) {
      
      inline def setOriginalEvent(value: ReactEventFrom[Element]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setPreventDefault(value: Callback): Self = StObject.set(x, "preventDefault", value.toJsFn)
      
      inline def setStopPropagation(value: Callback): Self = StObject.set(x, "stopPropagation", value.toJsFn)
      
      inline def setTarget(value: CalendarChangeTargetOptions): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Date | js.Array[js.Date]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: js.Date*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  trait CalendarChangeTargetOptions extends StObject {
    
    var id: String
    
    var name: String
    
    var value: js.UndefOr[js.Date | js.Array[js.Date] | Null] = js.undefined
  }
  object CalendarChangeTargetOptions {
    
    inline def apply(id: String, name: String): CalendarChangeTargetOptions = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalendarChangeTargetOptions]
    }
    
    extension [Self <: CalendarChangeTargetOptions](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Date | js.Array[js.Date]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: js.Date*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  trait CalendarDateTemplateParams extends StObject {
    
    var day: Double
    
    var month: Double
    
    var otherMonth: Boolean
    
    var selectable: Boolean
    
    var today: Boolean
    
    var year: Double
  }
  object CalendarDateTemplateParams {
    
    inline def apply(day: Double, month: Double, otherMonth: Boolean, selectable: Boolean, today: Boolean, year: Double): CalendarDateTemplateParams = {
      val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], otherMonth = otherMonth.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any], today = today.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalendarDateTemplateParams]
    }
    
    extension [Self <: CalendarDateTemplateParams](x: Self) {
      
      inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setOtherMonth(value: Boolean): Self = StObject.set(x, "otherMonth", value.asInstanceOf[js.Any])
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setToday(value: Boolean): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
      
      inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  type CalendarEventType = js.UndefOr[ReactEventFrom[Element] | Null]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.primereact.primereactStrings.left
    - typingsJapgolly.primereact.primereactStrings.right
  */
  trait CalendarIconPosType extends StObject
  object CalendarIconPosType {
    
    inline def left: typingsJapgolly.primereact.primereactStrings.left = "left".asInstanceOf[typingsJapgolly.primereact.primereactStrings.left]
    
    inline def right: typingsJapgolly.primereact.primereactStrings.right = "right".asInstanceOf[typingsJapgolly.primereact.primereactStrings.right]
  }
  
  trait CalendarMonthChangeParams extends StObject {
    
    var month: Double
    
    var year: Double
  }
  object CalendarMonthChangeParams {
    
    inline def apply(month: Double, year: Double): CalendarMonthChangeParams = {
      val __obj = js.Dynamic.literal(month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalendarMonthChangeParams]
    }
    
    extension [Self <: CalendarMonthChangeParams](x: Self) {
      
      inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  type CalendarMonthNavigatorTemplateParams = CalendarNavigatorTemplateParams
  
  type CalendarNavigatorTemplateChangeCallback = js.Function2[
    /* event */ ReactEventFrom[Element], 
    /* value */ js.UndefOr[String | Double | Null], 
    Unit
  ]
  
  trait CalendarNavigatorTemplateParams extends StObject {
    
    var className: String
    
    var element: Node
    
    var names: js.Array[Any]
    
    var onChange: CalendarNavigatorTemplateChangeCallback
    
    var options: js.Array[Any]
    
    var props: Any
    
    var value: js.UndefOr[String | Double | Null] = js.undefined
  }
  object CalendarNavigatorTemplateParams {
    
    inline def apply(
      className: String,
      names: js.Array[Any],
      onChange: (/* event */ ReactEventFrom[Element], /* value */ js.UndefOr[String | Double | Null]) => Callback,
      options: js.Array[Any],
      props: Any
    ): CalendarNavigatorTemplateParams = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], onChange = js.Any.fromFunction2((t0: /* event */ ReactEventFrom[Element], t1: /* value */ js.UndefOr[String | Double | Null]) => (onChange(t0, t1)).runNow()), options = options.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], element = null)
      __obj.asInstanceOf[CalendarNavigatorTemplateParams]
    }
    
    extension [Self <: CalendarNavigatorTemplateParams](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setElement(value: VdomNode): Self = StObject.set(x, "element", value.rawNode.asInstanceOf[js.Any])
      
      inline def setElementNull: Self = StObject.set(x, "element", null)
      
      inline def setElementVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "element", js.Array(value*))
      
      inline def setElementVdomElement(value: VdomElement): Self = StObject.set(x, "element", value.rawElement.asInstanceOf[js.Any])
      
      inline def setNames(value: js.Array[Any]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesVarargs(value: Any*): Self = StObject.set(x, "names", js.Array(value*))
      
      inline def setOnChange(
        value: (/* event */ ReactEventFrom[Element], /* value */ js.UndefOr[String | Double | Null]) => Callback
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[Element], t1: /* value */ js.UndefOr[String | Double | Null]) => (value(t0, t1)).runNow()))
      
      inline def setOptions(value: js.Array[Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: Any*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setProps(value: Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait CalendarProps extends StObject {
    
    var appendTo: js.UndefOr[CalendarAppendToType] = js.undefined
    
    var ariaLabelledBy: js.UndefOr[String] = js.undefined
    
    var autoZIndex: js.UndefOr[Boolean] = js.undefined
    
    var baseZIndex: js.UndefOr[Double] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var clearButtonClassName: js.UndefOr[String] = js.undefined
    
    var dateFormat: js.UndefOr[String] = js.undefined
    
    var dateTemplate: js.UndefOr[js.Function1[/* e */ CalendarDateTemplateParams, Node]] = js.undefined
    
    var decadeTempate: js.UndefOr[js.Function1[/* yearValues */ js.Array[Double], Node]] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var disabledDates: js.UndefOr[js.Array[js.Date]] = js.undefined
    
    var disabledDays: js.UndefOr[js.Array[Double]] = js.undefined
    
    var footerTemplate: js.UndefOr[js.Function0[Node]] = js.undefined
    
    var headerTemplate: js.UndefOr[js.Function0[Node]] = js.undefined
    
    var hideOnDateTimeSelect: js.UndefOr[Boolean] = js.undefined
    
    var hourFormat: js.UndefOr[String] = js.undefined
    
    var icon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<CalendarProps> */ Any
      ] = js.undefined
    
    var iconPos: js.UndefOr[CalendarIconPosType] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    var inputClassName: js.UndefOr[String] = js.undefined
    
    var inputId: js.UndefOr[String] = js.undefined
    
    var inputRef: js.UndefOr[Ref[HTMLInputElement]] = js.undefined
    
    var inputStyle: js.UndefOr[js.Object] = js.undefined
    
    var keepInvalid: js.UndefOr[Boolean] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var mask: js.UndefOr[String] = js.undefined
    
    var maxDate: js.UndefOr[js.Date] = js.undefined
    
    var maxDateCount: js.UndefOr[Double] = js.undefined
    
    var minDate: js.UndefOr[js.Date] = js.undefined
    
    var monthNavigator: js.UndefOr[Boolean] = js.undefined
    
    var monthNavigatorTemplate: js.UndefOr[js.Function1[/* e */ CalendarMonthNavigatorTemplateParams, Node]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var numberOfMonths: js.UndefOr[Double] = js.undefined
    
    var onBlur: js.UndefOr[js.Function1[/* event */ ReactFocusEventFrom[HTMLInputElement], Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* e */ CalendarChangeParams, Unit]] = js.undefined
    
    var onClearButtonClick: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLButtonElement], Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* event */ ReactFocusEventFrom[HTMLInputElement], Unit]] = js.undefined
    
    var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onInput: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLInputElement], Unit]] = js.undefined
    
    var onMonthChange: js.UndefOr[js.Function1[/* e */ CalendarMonthChangeParams, Unit]] = js.undefined
    
    var onSelect: js.UndefOr[js.Function1[/* e */ CalendarSelectParams, Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onTodayButtonClick: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLButtonElement], Unit]] = js.undefined
    
    var onViewDateChange: js.UndefOr[js.Function1[/* e */ CalendarViewChangeParams, Unit]] = js.undefined
    
    var onVisibleChange: js.UndefOr[js.Function1[/* e */ CalendarVisibleChangeParams, Unit]] = js.undefined
    
    var panelClassName: js.UndefOr[String] = js.undefined
    
    var panelStyle: js.UndefOr[js.Object] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var readOnlyInput: js.UndefOr[Boolean] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var selectOtherMonths: js.UndefOr[Boolean] = js.undefined
    
    var selectionMode: js.UndefOr[String] = js.undefined
    
    var shortYearCutoff: js.UndefOr[String] = js.undefined
    
    var showButtonBar: js.UndefOr[Boolean] = js.undefined
    
    var showIcon: js.UndefOr[Boolean] = js.undefined
    
    var showMillisec: js.UndefOr[Boolean] = js.undefined
    
    var showMinMaxRange: js.UndefOr[Boolean] = js.undefined
    
    var showOnFocus: js.UndefOr[Boolean] = js.undefined
    
    var showOtherMonths: js.UndefOr[Boolean] = js.undefined
    
    var showSeconds: js.UndefOr[Boolean] = js.undefined
    
    var showTime: js.UndefOr[Boolean] = js.undefined
    
    var showWeek: js.UndefOr[Boolean] = js.undefined
    
    var stepHour: js.UndefOr[Double] = js.undefined
    
    var stepMillisec: js.UndefOr[Double] = js.undefined
    
    var stepMinute: js.UndefOr[Double] = js.undefined
    
    var stepSecond: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var timeOnly: js.UndefOr[Boolean] = js.undefined
    
    var todayButtonClassName: js.UndefOr[String] = js.undefined
    
    var tooltip: js.UndefOr[String] = js.undefined
    
    var tooltipOptions: js.UndefOr[TooltipOptions] = js.undefined
    
    var touchUI: js.UndefOr[Boolean] = js.undefined
    
    var transitionOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSTransitionProps */ Any
      ] = js.undefined
    
    var value: js.UndefOr[js.Date | js.Array[js.Date]] = js.undefined
    
    var view: js.UndefOr[String] = js.undefined
    
    var viewDate: js.UndefOr[js.Date] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var yearNavigator: js.UndefOr[Boolean] = js.undefined
    
    var yearNavigatorTemplate: js.UndefOr[js.Function1[/* e */ CalendarYearNavigatorTemplateParams, Node]] = js.undefined
    
    var yearRange: js.UndefOr[String] = js.undefined
  }
  object CalendarProps {
    
    inline def apply(): CalendarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalendarProps]
    }
    
    extension [Self <: CalendarProps](x: Self) {
      
      inline def setAppendTo(value: CalendarAppendToType): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToNull: Self = StObject.set(x, "appendTo", null)
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAutoZIndex(value: Boolean): Self = StObject.set(x, "autoZIndex", value.asInstanceOf[js.Any])
      
      inline def setAutoZIndexUndefined: Self = StObject.set(x, "autoZIndex", js.undefined)
      
      inline def setBaseZIndex(value: Double): Self = StObject.set(x, "baseZIndex", value.asInstanceOf[js.Any])
      
      inline def setBaseZIndexUndefined: Self = StObject.set(x, "baseZIndex", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClearButtonClassName(value: String): Self = StObject.set(x, "clearButtonClassName", value.asInstanceOf[js.Any])
      
      inline def setClearButtonClassNameUndefined: Self = StObject.set(x, "clearButtonClassName", js.undefined)
      
      inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      inline def setDateTemplate(value: /* e */ CalendarDateTemplateParams => Node): Self = StObject.set(x, "dateTemplate", js.Any.fromFunction1(value))
      
      inline def setDateTemplateUndefined: Self = StObject.set(x, "dateTemplate", js.undefined)
      
      inline def setDecadeTempate(value: /* yearValues */ js.Array[Double] => Node): Self = StObject.set(x, "decadeTempate", js.Any.fromFunction1(value))
      
      inline def setDecadeTempateUndefined: Self = StObject.set(x, "decadeTempate", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledDates(value: js.Array[js.Date]): Self = StObject.set(x, "disabledDates", value.asInstanceOf[js.Any])
      
      inline def setDisabledDatesUndefined: Self = StObject.set(x, "disabledDates", js.undefined)
      
      inline def setDisabledDatesVarargs(value: js.Date*): Self = StObject.set(x, "disabledDates", js.Array(value*))
      
      inline def setDisabledDays(value: js.Array[Double]): Self = StObject.set(x, "disabledDays", value.asInstanceOf[js.Any])
      
      inline def setDisabledDaysUndefined: Self = StObject.set(x, "disabledDays", js.undefined)
      
      inline def setDisabledDaysVarargs(value: Double*): Self = StObject.set(x, "disabledDays", js.Array(value*))
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFooterTemplate(value: CallbackTo[Node]): Self = StObject.set(x, "footerTemplate", value.toJsFn)
      
      inline def setFooterTemplateUndefined: Self = StObject.set(x, "footerTemplate", js.undefined)
      
      inline def setHeaderTemplate(value: CallbackTo[Node]): Self = StObject.set(x, "headerTemplate", value.toJsFn)
      
      inline def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
      
      inline def setHideOnDateTimeSelect(value: Boolean): Self = StObject.set(x, "hideOnDateTimeSelect", value.asInstanceOf[js.Any])
      
      inline def setHideOnDateTimeSelectUndefined: Self = StObject.set(x, "hideOnDateTimeSelect", js.undefined)
      
      inline def setHourFormat(value: String): Self = StObject.set(x, "hourFormat", value.asInstanceOf[js.Any])
      
      inline def setHourFormatUndefined: Self = StObject.set(x, "hourFormat", js.undefined)
      
      inline def setIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<CalendarProps> */ Any
      ): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconPos(value: CalendarIconPosType): Self = StObject.set(x, "iconPos", value.asInstanceOf[js.Any])
      
      inline def setIconPosUndefined: Self = StObject.set(x, "iconPos", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setInputClassName(value: String): Self = StObject.set(x, "inputClassName", value.asInstanceOf[js.Any])
      
      inline def setInputClassNameUndefined: Self = StObject.set(x, "inputClassName", js.undefined)
      
      inline def setInputId(value: String): Self = StObject.set(x, "inputId", value.asInstanceOf[js.Any])
      
      inline def setInputIdUndefined: Self = StObject.set(x, "inputId", js.undefined)
      
      inline def setInputRef(value: Ref[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setInputRefFunction1(value: HTMLInputElement | Null => Callback): Self = StObject.set(x, "inputRef", js.Any.fromFunction1((t0: HTMLInputElement | Null) => value(t0).runNow()))
      
      inline def setInputRefNull: Self = StObject.set(x, "inputRef", null)
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setInputStyle(value: js.Object): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
      
      inline def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
      
      inline def setKeepInvalid(value: Boolean): Self = StObject.set(x, "keepInvalid", value.asInstanceOf[js.Any])
      
      inline def setKeepInvalidUndefined: Self = StObject.set(x, "keepInvalid", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateCount(value: Double): Self = StObject.set(x, "maxDateCount", value.asInstanceOf[js.Any])
      
      inline def setMaxDateCountUndefined: Self = StObject.set(x, "maxDateCount", js.undefined)
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setMonthNavigator(value: Boolean): Self = StObject.set(x, "monthNavigator", value.asInstanceOf[js.Any])
      
      inline def setMonthNavigatorTemplate(value: /* e */ CalendarMonthNavigatorTemplateParams => Node): Self = StObject.set(x, "monthNavigatorTemplate", js.Any.fromFunction1(value))
      
      inline def setMonthNavigatorTemplateUndefined: Self = StObject.set(x, "monthNavigatorTemplate", js.undefined)
      
      inline def setMonthNavigatorUndefined: Self = StObject.set(x, "monthNavigator", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNumberOfMonths(value: Double): Self = StObject.set(x, "numberOfMonths", value.asInstanceOf[js.Any])
      
      inline def setNumberOfMonthsUndefined: Self = StObject.set(x, "numberOfMonths", js.undefined)
      
      inline def setOnBlur(value: /* event */ ReactFocusEventFrom[HTMLInputElement] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: /* event */ ReactFocusEventFrom[HTMLInputElement]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* e */ CalendarChangeParams => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* e */ CalendarChangeParams) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClearButtonClick(value: /* event */ ReactMouseEventFrom[HTMLButtonElement] => Callback): Self = StObject.set(x, "onClearButtonClick", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLButtonElement]) => value(t0).runNow()))
      
      inline def setOnClearButtonClickUndefined: Self = StObject.set(x, "onClearButtonClick", js.undefined)
      
      inline def setOnFocus(value: /* event */ ReactFocusEventFrom[HTMLInputElement] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: /* event */ ReactFocusEventFrom[HTMLInputElement]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnHide(value: Callback): Self = StObject.set(x, "onHide", value.toJsFn)
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnInput(value: /* event */ ReactEventFrom[HTMLInputElement] => Callback): Self = StObject.set(x, "onInput", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLInputElement]) => value(t0).runNow()))
      
      inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      inline def setOnMonthChange(value: /* e */ CalendarMonthChangeParams => Callback): Self = StObject.set(x, "onMonthChange", js.Any.fromFunction1((t0: /* e */ CalendarMonthChangeParams) => value(t0).runNow()))
      
      inline def setOnMonthChangeUndefined: Self = StObject.set(x, "onMonthChange", js.undefined)
      
      inline def setOnSelect(value: /* e */ CalendarSelectParams => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: /* e */ CalendarSelectParams) => value(t0).runNow()))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnShow(value: Callback): Self = StObject.set(x, "onShow", value.toJsFn)
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setOnTodayButtonClick(value: /* event */ ReactMouseEventFrom[HTMLButtonElement] => Callback): Self = StObject.set(x, "onTodayButtonClick", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLButtonElement]) => value(t0).runNow()))
      
      inline def setOnTodayButtonClickUndefined: Self = StObject.set(x, "onTodayButtonClick", js.undefined)
      
      inline def setOnViewDateChange(value: /* e */ CalendarViewChangeParams => Callback): Self = StObject.set(x, "onViewDateChange", js.Any.fromFunction1((t0: /* e */ CalendarViewChangeParams) => value(t0).runNow()))
      
      inline def setOnViewDateChangeUndefined: Self = StObject.set(x, "onViewDateChange", js.undefined)
      
      inline def setOnVisibleChange(value: /* e */ CalendarVisibleChangeParams => Callback): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1((t0: /* e */ CalendarVisibleChangeParams) => value(t0).runNow()))
      
      inline def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      inline def setPanelClassName(value: String): Self = StObject.set(x, "panelClassName", value.asInstanceOf[js.Any])
      
      inline def setPanelClassNameUndefined: Self = StObject.set(x, "panelClassName", js.undefined)
      
      inline def setPanelStyle(value: js.Object): Self = StObject.set(x, "panelStyle", value.asInstanceOf[js.Any])
      
      inline def setPanelStyleUndefined: Self = StObject.set(x, "panelStyle", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setReadOnlyInput(value: Boolean): Self = StObject.set(x, "readOnlyInput", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyInputUndefined: Self = StObject.set(x, "readOnlyInput", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setSelectOtherMonths(value: Boolean): Self = StObject.set(x, "selectOtherMonths", value.asInstanceOf[js.Any])
      
      inline def setSelectOtherMonthsUndefined: Self = StObject.set(x, "selectOtherMonths", js.undefined)
      
      inline def setSelectionMode(value: String): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      inline def setShortYearCutoff(value: String): Self = StObject.set(x, "shortYearCutoff", value.asInstanceOf[js.Any])
      
      inline def setShortYearCutoffUndefined: Self = StObject.set(x, "shortYearCutoff", js.undefined)
      
      inline def setShowButtonBar(value: Boolean): Self = StObject.set(x, "showButtonBar", value.asInstanceOf[js.Any])
      
      inline def setShowButtonBarUndefined: Self = StObject.set(x, "showButtonBar", js.undefined)
      
      inline def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
      
      inline def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
      
      inline def setShowMillisec(value: Boolean): Self = StObject.set(x, "showMillisec", value.asInstanceOf[js.Any])
      
      inline def setShowMillisecUndefined: Self = StObject.set(x, "showMillisec", js.undefined)
      
      inline def setShowMinMaxRange(value: Boolean): Self = StObject.set(x, "showMinMaxRange", value.asInstanceOf[js.Any])
      
      inline def setShowMinMaxRangeUndefined: Self = StObject.set(x, "showMinMaxRange", js.undefined)
      
      inline def setShowOnFocus(value: Boolean): Self = StObject.set(x, "showOnFocus", value.asInstanceOf[js.Any])
      
      inline def setShowOnFocusUndefined: Self = StObject.set(x, "showOnFocus", js.undefined)
      
      inline def setShowOtherMonths(value: Boolean): Self = StObject.set(x, "showOtherMonths", value.asInstanceOf[js.Any])
      
      inline def setShowOtherMonthsUndefined: Self = StObject.set(x, "showOtherMonths", js.undefined)
      
      inline def setShowSeconds(value: Boolean): Self = StObject.set(x, "showSeconds", value.asInstanceOf[js.Any])
      
      inline def setShowSecondsUndefined: Self = StObject.set(x, "showSeconds", js.undefined)
      
      inline def setShowTime(value: Boolean): Self = StObject.set(x, "showTime", value.asInstanceOf[js.Any])
      
      inline def setShowTimeUndefined: Self = StObject.set(x, "showTime", js.undefined)
      
      inline def setShowWeek(value: Boolean): Self = StObject.set(x, "showWeek", value.asInstanceOf[js.Any])
      
      inline def setShowWeekUndefined: Self = StObject.set(x, "showWeek", js.undefined)
      
      inline def setStepHour(value: Double): Self = StObject.set(x, "stepHour", value.asInstanceOf[js.Any])
      
      inline def setStepHourUndefined: Self = StObject.set(x, "stepHour", js.undefined)
      
      inline def setStepMillisec(value: Double): Self = StObject.set(x, "stepMillisec", value.asInstanceOf[js.Any])
      
      inline def setStepMillisecUndefined: Self = StObject.set(x, "stepMillisec", js.undefined)
      
      inline def setStepMinute(value: Double): Self = StObject.set(x, "stepMinute", value.asInstanceOf[js.Any])
      
      inline def setStepMinuteUndefined: Self = StObject.set(x, "stepMinute", js.undefined)
      
      inline def setStepSecond(value: Double): Self = StObject.set(x, "stepSecond", value.asInstanceOf[js.Any])
      
      inline def setStepSecondUndefined: Self = StObject.set(x, "stepSecond", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTimeOnly(value: Boolean): Self = StObject.set(x, "timeOnly", value.asInstanceOf[js.Any])
      
      inline def setTimeOnlyUndefined: Self = StObject.set(x, "timeOnly", js.undefined)
      
      inline def setTodayButtonClassName(value: String): Self = StObject.set(x, "todayButtonClassName", value.asInstanceOf[js.Any])
      
      inline def setTodayButtonClassNameUndefined: Self = StObject.set(x, "todayButtonClassName", js.undefined)
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipOptions(value: TooltipOptions): Self = StObject.set(x, "tooltipOptions", value.asInstanceOf[js.Any])
      
      inline def setTooltipOptionsUndefined: Self = StObject.set(x, "tooltipOptions", js.undefined)
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setTouchUI(value: Boolean): Self = StObject.set(x, "touchUI", value.asInstanceOf[js.Any])
      
      inline def setTouchUIUndefined: Self = StObject.set(x, "touchUI", js.undefined)
      
      inline def setTransitionOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSTransitionProps */ Any
      ): Self = StObject.set(x, "transitionOptions", value.asInstanceOf[js.Any])
      
      inline def setTransitionOptionsUndefined: Self = StObject.set(x, "transitionOptions", js.undefined)
      
      inline def setValue(value: js.Date | js.Array[js.Date]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: js.Date*): Self = StObject.set(x, "value", js.Array(value*))
      
      inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setViewDate(value: js.Date): Self = StObject.set(x, "viewDate", value.asInstanceOf[js.Any])
      
      inline def setViewDateUndefined: Self = StObject.set(x, "viewDate", js.undefined)
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setYearNavigator(value: Boolean): Self = StObject.set(x, "yearNavigator", value.asInstanceOf[js.Any])
      
      inline def setYearNavigatorTemplate(value: /* e */ CalendarYearNavigatorTemplateParams => Node): Self = StObject.set(x, "yearNavigatorTemplate", js.Any.fromFunction1(value))
      
      inline def setYearNavigatorTemplateUndefined: Self = StObject.set(x, "yearNavigatorTemplate", js.undefined)
      
      inline def setYearNavigatorUndefined: Self = StObject.set(x, "yearNavigator", js.undefined)
      
      inline def setYearRange(value: String): Self = StObject.set(x, "yearRange", value.asInstanceOf[js.Any])
      
      inline def setYearRangeUndefined: Self = StObject.set(x, "yearRange", js.undefined)
    }
  }
  
  trait CalendarSelectParams extends StObject {
    
    var originalEvent: ReactEventFrom[Element]
    
    var value: js.Date | js.Array[js.Date]
  }
  object CalendarSelectParams {
    
    inline def apply(originalEvent: ReactEventFrom[Element], value: js.Date | js.Array[js.Date]): CalendarSelectParams = {
      val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalendarSelectParams]
    }
    
    extension [Self <: CalendarSelectParams](x: Self) {
      
      inline def setOriginalEvent(value: ReactEventFrom[Element]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Date | js.Array[js.Date]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: js.Date*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  trait CalendarViewChangeParams extends StObject {
    
    var originalEvent: ReactEventFrom[Element]
    
    var value: js.Date
  }
  object CalendarViewChangeParams {
    
    inline def apply(originalEvent: ReactEventFrom[Element], value: js.Date): CalendarViewChangeParams = {
      val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalendarViewChangeParams]
    }
    
    extension [Self <: CalendarViewChangeParams](x: Self) {
      
      inline def setOriginalEvent(value: ReactEventFrom[Element]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait CalendarVisibleChangeParams extends StObject {
    
    var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var `type`: CalendarVisibleType
    
    var visible: Boolean
  }
  object CalendarVisibleChangeParams {
    
    inline def apply(visible: Boolean): CalendarVisibleChangeParams = {
      val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalendarVisibleChangeParams]
    }
    
    extension [Self <: CalendarVisibleChangeParams](x: Self) {
      
      inline def setCallback(value: Callback): Self = StObject.set(x, "callback", value.toJsFn)
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setType(value: CalendarVisibleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.primereact.primereactStrings.outside
    - typingsJapgolly.primereact.primereactStrings.dateselect
    - scala.Unit
    - scala.Null
  */
  type CalendarVisibleType = js.UndefOr[_CalendarVisibleType | Null]
  
  type CalendarYearNavigatorTemplateParams = CalendarNavigatorTemplateParams
  
  trait _CalendarVisibleType extends StObject
}
