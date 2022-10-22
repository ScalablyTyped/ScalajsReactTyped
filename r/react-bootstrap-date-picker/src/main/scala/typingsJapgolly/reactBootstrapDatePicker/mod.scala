package typingsJapgolly.reactBootstrapDatePicker

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-bootstrap-date-picker", JSImport.Namespace)
  @js.native
  val ^ : DatePicker = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-bootstrap-date-picker", JSImport.Namespace)
  @js.native
  open class Class protected ()
    extends Component[DatePickerProps, js.Object, Any] {
    def this(props: DatePickerProps) = this()
    def this(props: DatePickerProps, context: Any) = this()
  }
  
  type ChangeCallback = js.Function2[/* value */ String, /* formattedValue */ String, Unit]
  
  type DatePicker = ComponentClassP[DatePickerProps & js.Object]
  
  trait DatePickerProps extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var calendarContainer: js.UndefOr[Any] = js.undefined
    
    var calendarPlacement: js.UndefOr[String] = js.undefined
    
    var cellPadding: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var clearButtonElement: js.UndefOr[Node] = js.undefined
    
    var customControl: js.UndefOr[FunctionComponent[Any] | (ComponentClassP[Any & js.Object])] = js.undefined
    
    var dateFormat: js.UndefOr[String] = js.undefined
    
    var dayLabels: js.UndefOr[js.Array[String]] = js.undefined
    
    var defaultValue: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var maxDate: js.UndefOr[String] = js.undefined
    
    var minDate: js.UndefOr[String] = js.undefined
    
    var monthLabels: js.UndefOr[js.Array[String]] = js.undefined
    
    var nextButtonElement: js.UndefOr[Node] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[Any]] = js.undefined
    
    var onChange: js.UndefOr[ChangeCallback] = js.undefined
    
    var onClear: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[Any]] = js.undefined
    
    var previousButtonElement: js.UndefOr[Node] = js.undefined
    
    var showClearButton: js.UndefOr[Boolean] = js.undefined
    
    var showTodayButton: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[Any] = js.undefined
    
    var todayButtonLabel: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
    
    var weekStartsOnMonday: js.UndefOr[Boolean] = js.undefined
  }
  object DatePickerProps {
    
    inline def apply(): DatePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatePickerProps]
    }
    
    extension [Self <: DatePickerProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setCalendarContainer(value: Any): Self = StObject.set(x, "calendarContainer", value.asInstanceOf[js.Any])
      
      inline def setCalendarContainerUndefined: Self = StObject.set(x, "calendarContainer", js.undefined)
      
      inline def setCalendarPlacement(value: String): Self = StObject.set(x, "calendarPlacement", value.asInstanceOf[js.Any])
      
      inline def setCalendarPlacementUndefined: Self = StObject.set(x, "calendarPlacement", js.undefined)
      
      inline def setCellPadding(value: String): Self = StObject.set(x, "cellPadding", value.asInstanceOf[js.Any])
      
      inline def setCellPaddingUndefined: Self = StObject.set(x, "cellPadding", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClearButtonElement(value: VdomNode): Self = StObject.set(x, "clearButtonElement", value.rawNode.asInstanceOf[js.Any])
      
      inline def setClearButtonElementNull: Self = StObject.set(x, "clearButtonElement", null)
      
      inline def setClearButtonElementUndefined: Self = StObject.set(x, "clearButtonElement", js.undefined)
      
      inline def setClearButtonElementVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "clearButtonElement", js.Array(value*))
      
      inline def setClearButtonElementVdomElement(value: VdomElement): Self = StObject.set(x, "clearButtonElement", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCustomControl(value: FunctionComponent[Any] | (ComponentClassP[Any & js.Object])): Self = StObject.set(x, "customControl", value.asInstanceOf[js.Any])
      
      inline def setCustomControlUndefined: Self = StObject.set(x, "customControl", js.undefined)
      
      inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      inline def setDayLabels(value: js.Array[String]): Self = StObject.set(x, "dayLabels", value.asInstanceOf[js.Any])
      
      inline def setDayLabelsUndefined: Self = StObject.set(x, "dayLabels", js.undefined)
      
      inline def setDayLabelsVarargs(value: String*): Self = StObject.set(x, "dayLabels", js.Array(value*))
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setMaxDate(value: String): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: String): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setMonthLabels(value: js.Array[String]): Self = StObject.set(x, "monthLabels", value.asInstanceOf[js.Any])
      
      inline def setMonthLabelsUndefined: Self = StObject.set(x, "monthLabels", js.undefined)
      
      inline def setMonthLabelsVarargs(value: String*): Self = StObject.set(x, "monthLabels", js.Array(value*))
      
      inline def setNextButtonElement(value: VdomNode): Self = StObject.set(x, "nextButtonElement", value.rawNode.asInstanceOf[js.Any])
      
      inline def setNextButtonElementNull: Self = StObject.set(x, "nextButtonElement", null)
      
      inline def setNextButtonElementUndefined: Self = StObject.set(x, "nextButtonElement", js.undefined)
      
      inline def setNextButtonElementVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "nextButtonElement", js.Array(value*))
      
      inline def setNextButtonElementVdomElement(value: VdomElement): Self = StObject.set(x, "nextButtonElement", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnBlur(value: ReactFocusEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: (/* value */ String, /* formattedValue */ String) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* value */ String, t1: /* formattedValue */ String) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClear(value: Callback): Self = StObject.set(x, "onClear", value.toJsFn)
      
      inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      inline def setOnFocus(value: ReactFocusEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setPreviousButtonElement(value: VdomNode): Self = StObject.set(x, "previousButtonElement", value.rawNode.asInstanceOf[js.Any])
      
      inline def setPreviousButtonElementNull: Self = StObject.set(x, "previousButtonElement", null)
      
      inline def setPreviousButtonElementUndefined: Self = StObject.set(x, "previousButtonElement", js.undefined)
      
      inline def setPreviousButtonElementVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "previousButtonElement", js.Array(value*))
      
      inline def setPreviousButtonElementVdomElement(value: VdomElement): Self = StObject.set(x, "previousButtonElement", value.rawElement.asInstanceOf[js.Any])
      
      inline def setShowClearButton(value: Boolean): Self = StObject.set(x, "showClearButton", value.asInstanceOf[js.Any])
      
      inline def setShowClearButtonUndefined: Self = StObject.set(x, "showClearButton", js.undefined)
      
      inline def setShowTodayButton(value: Boolean): Self = StObject.set(x, "showTodayButton", value.asInstanceOf[js.Any])
      
      inline def setShowTodayButtonUndefined: Self = StObject.set(x, "showTodayButton", js.undefined)
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTodayButtonLabel(value: String): Self = StObject.set(x, "todayButtonLabel", value.asInstanceOf[js.Any])
      
      inline def setTodayButtonLabelUndefined: Self = StObject.set(x, "todayButtonLabel", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWeekStartsOnMonday(value: Boolean): Self = StObject.set(x, "weekStartsOnMonday", value.asInstanceOf[js.Any])
      
      inline def setWeekStartsOnMondayUndefined: Self = StObject.set(x, "weekStartsOnMonday", js.undefined)
    }
  }
  
  type _To = DatePicker
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: DatePicker = ^
}
