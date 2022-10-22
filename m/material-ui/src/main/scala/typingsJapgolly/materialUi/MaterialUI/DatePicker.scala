package typingsJapgolly.materialUi.MaterialUI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.materialUi.MaterialUI.Popover.PopoverAnimationProps
import typingsJapgolly.materialUi.MaterialUI.propTypes.utils
import typingsJapgolly.materialUi.anon.TypeofDateTimeFormat
import typingsJapgolly.materialUi.materialUiStrings.`inline`
import typingsJapgolly.materialUi.materialUiStrings.dialog
import typingsJapgolly.materialUi.materialUiStrings.landscape
import typingsJapgolly.materialUi.materialUiStrings.portrait
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.TouchEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DatePicker {
  
  @js.native
  trait DatePicker
    extends Component[DatePickerProps, js.Object, Any] {
    
    def focus(): Unit = js.native
    
    def openDialog(): Unit = js.native
  }
  
  @js.native
  trait DatePickerDialog
    extends Component[DatePickerDialogProps, js.Object, Any] {
    
    def dismiss(): Unit = js.native
    
    def show(): Unit = js.native
  }
  
  trait DatePickerDialogProps extends StObject {
    
    // <Container/> is the element that get the 'other' properties
    var DateTimeFormat: js.UndefOr[TypeofDateTimeFormat] = js.undefined
    
    var animation: js.UndefOr[ComponentClassP[PopoverAnimationProps & js.Object]] = js.undefined
    
    var autoOk: js.UndefOr[Boolean] = js.undefined
    
    var cancelLabel: js.UndefOr[Node] = js.undefined
    
    var container: js.UndefOr[dialog | `inline`] = js.undefined
    
    var disableYearSelection: js.UndefOr[Boolean] = js.undefined
    
    var firstDayOfWeek: js.UndefOr[Double] = js.undefined
    
    var initialDate: js.UndefOr[js.Date] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var maxDate: js.UndefOr[js.Date] = js.undefined
    
    var minDate: js.UndefOr[js.Date] = js.undefined
    
    var mode: js.UndefOr[portrait | landscape] = js.undefined
    
    var okLabel: js.UndefOr[Node] = js.undefined
    
    var onAccept: js.UndefOr[js.Function1[/* d */ js.Date, Unit]] = js.undefined
    
    var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var shouldDisableDate: js.UndefOr[js.Function1[/* day */ js.Date, Boolean]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var utils: js.UndefOr[typingsJapgolly.materialUi.MaterialUI.propTypes.utils] = js.undefined
  }
  object DatePickerDialogProps {
    
    inline def apply(): DatePickerDialogProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatePickerDialogProps]
    }
    
    extension [Self <: DatePickerDialogProps](x: Self) {
      
      inline def setAnimation(value: ComponentClassP[PopoverAnimationProps & js.Object]): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setAutoOk(value: Boolean): Self = StObject.set(x, "autoOk", value.asInstanceOf[js.Any])
      
      inline def setAutoOkUndefined: Self = StObject.set(x, "autoOk", js.undefined)
      
      inline def setCancelLabel(value: VdomNode): Self = StObject.set(x, "cancelLabel", value.rawNode.asInstanceOf[js.Any])
      
      inline def setCancelLabelNull: Self = StObject.set(x, "cancelLabel", null)
      
      inline def setCancelLabelUndefined: Self = StObject.set(x, "cancelLabel", js.undefined)
      
      inline def setCancelLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "cancelLabel", js.Array(value*))
      
      inline def setCancelLabelVdomElement(value: VdomElement): Self = StObject.set(x, "cancelLabel", value.rawElement.asInstanceOf[js.Any])
      
      inline def setContainer(value: dialog | `inline`): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setDateTimeFormat(value: TypeofDateTimeFormat): Self = StObject.set(x, "DateTimeFormat", value.asInstanceOf[js.Any])
      
      inline def setDateTimeFormatUndefined: Self = StObject.set(x, "DateTimeFormat", js.undefined)
      
      inline def setDisableYearSelection(value: Boolean): Self = StObject.set(x, "disableYearSelection", value.asInstanceOf[js.Any])
      
      inline def setDisableYearSelectionUndefined: Self = StObject.set(x, "disableYearSelection", js.undefined)
      
      inline def setFirstDayOfWeek(value: Double): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
      
      inline def setInitialDate(value: js.Date): Self = StObject.set(x, "initialDate", value.asInstanceOf[js.Any])
      
      inline def setInitialDateUndefined: Self = StObject.set(x, "initialDate", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setMode(value: portrait | landscape): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOkLabel(value: VdomNode): Self = StObject.set(x, "okLabel", value.rawNode.asInstanceOf[js.Any])
      
      inline def setOkLabelNull: Self = StObject.set(x, "okLabel", null)
      
      inline def setOkLabelUndefined: Self = StObject.set(x, "okLabel", js.undefined)
      
      inline def setOkLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "okLabel", js.Array(value*))
      
      inline def setOkLabelVdomElement(value: VdomElement): Self = StObject.set(x, "okLabel", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnAccept(value: /* d */ js.Date => Callback): Self = StObject.set(x, "onAccept", js.Any.fromFunction1((t0: /* d */ js.Date) => value(t0).runNow()))
      
      inline def setOnAcceptUndefined: Self = StObject.set(x, "onAccept", js.undefined)
      
      inline def setOnDismiss(value: Callback): Self = StObject.set(x, "onDismiss", value.toJsFn)
      
      inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      inline def setOnShow(value: Callback): Self = StObject.set(x, "onShow", value.toJsFn)
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setShouldDisableDate(value: /* day */ js.Date => Boolean): Self = StObject.set(x, "shouldDisableDate", js.Any.fromFunction1(value))
      
      inline def setShouldDisableDateUndefined: Self = StObject.set(x, "shouldDisableDate", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setUtils(value: utils): Self = StObject.set(x, "utils", value.asInstanceOf[js.Any])
      
      inline def setUtilsUndefined: Self = StObject.set(x, "utils", js.undefined)
    }
  }
  
  trait DatePickerProps extends StObject {
    
    // <TextField/> is the element that get the 'other' properties
    var DateTimeFormat: js.UndefOr[TypeofDateTimeFormat] = js.undefined
    
    var autoOk: js.UndefOr[Boolean] = js.undefined
    
    var cancelLabel: js.UndefOr[Node] = js.undefined
    
    // From <TextField />
    var className: js.UndefOr[String] = js.undefined
    
    var container: js.UndefOr[dialog | `inline`] = js.undefined
    
    var defaultDate: js.UndefOr[js.Date] = js.undefined
    
    var defaultValue: js.UndefOr[String] = js.undefined
    
    var dialogContainerStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var disableYearSelection: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var errorStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var errorText: js.UndefOr[Node] = js.undefined
    
    var firstDayOfWeek: js.UndefOr[Double] = js.undefined
    
    var floatingLabelStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var floatingLabelText: js.UndefOr[Node] = js.undefined
    
    var formatDate: js.UndefOr[js.Function1[/* date */ js.Date, String]] = js.undefined
    
    var fullWidth: js.UndefOr[Boolean] = js.undefined
    
    var hideCalendarDate: js.UndefOr[Boolean] = js.undefined
    
    var hintStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var hintText: js.UndefOr[Node] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inputStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var maxDate: js.UndefOr[js.Date] = js.undefined
    
    var minDate: js.UndefOr[js.Date] = js.undefined
    
    var mode: js.UndefOr[portrait | landscape] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var okLabel: js.UndefOr[Node] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[js.Object]] = js.undefined
    
    var onChange: js.UndefOr[js.Function2[/* e */ Any, /* date */ js.Date, Unit]] = js.undefined
    
    var onClick: js.UndefOr[TouchEventHandler[js.Object]] = js.undefined
    
    // e is always null
    var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[js.Object]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[js.Object]] = js.undefined
    
    var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var openToYearSelection: js.UndefOr[Boolean] = js.undefined
    
    var rows: js.UndefOr[Double] = js.undefined
    
    var rowsMax: js.UndefOr[Double] = js.undefined
    
    var shouldDisableDate: js.UndefOr[js.Function1[/* day */ js.Date, Boolean]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var textFieldStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var underlineDisabledStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var underlineFocusStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var underlineShow: js.UndefOr[Boolean] = js.undefined
    
    var underlineStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var utils: js.UndefOr[typingsJapgolly.materialUi.MaterialUI.propTypes.utils] = js.undefined
    
    var value: js.UndefOr[js.Date] = js.undefined
  }
  object DatePickerProps {
    
    inline def apply(): DatePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatePickerProps]
    }
    
    extension [Self <: DatePickerProps](x: Self) {
      
      inline def setAutoOk(value: Boolean): Self = StObject.set(x, "autoOk", value.asInstanceOf[js.Any])
      
      inline def setAutoOkUndefined: Self = StObject.set(x, "autoOk", js.undefined)
      
      inline def setCancelLabel(value: VdomNode): Self = StObject.set(x, "cancelLabel", value.rawNode.asInstanceOf[js.Any])
      
      inline def setCancelLabelNull: Self = StObject.set(x, "cancelLabel", null)
      
      inline def setCancelLabelUndefined: Self = StObject.set(x, "cancelLabel", js.undefined)
      
      inline def setCancelLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "cancelLabel", js.Array(value*))
      
      inline def setCancelLabelVdomElement(value: VdomElement): Self = StObject.set(x, "cancelLabel", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContainer(value: dialog | `inline`): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setDateTimeFormat(value: TypeofDateTimeFormat): Self = StObject.set(x, "DateTimeFormat", value.asInstanceOf[js.Any])
      
      inline def setDateTimeFormatUndefined: Self = StObject.set(x, "DateTimeFormat", js.undefined)
      
      inline def setDefaultDate(value: js.Date): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
      
      inline def setDefaultDateUndefined: Self = StObject.set(x, "defaultDate", js.undefined)
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDialogContainerStyle(value: CSSProperties): Self = StObject.set(x, "dialogContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setDialogContainerStyleUndefined: Self = StObject.set(x, "dialogContainerStyle", js.undefined)
      
      inline def setDisableYearSelection(value: Boolean): Self = StObject.set(x, "disableYearSelection", value.asInstanceOf[js.Any])
      
      inline def setDisableYearSelectionUndefined: Self = StObject.set(x, "disableYearSelection", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setErrorStyle(value: CSSProperties): Self = StObject.set(x, "errorStyle", value.asInstanceOf[js.Any])
      
      inline def setErrorStyleUndefined: Self = StObject.set(x, "errorStyle", js.undefined)
      
      inline def setErrorText(value: VdomNode): Self = StObject.set(x, "errorText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setErrorTextNull: Self = StObject.set(x, "errorText", null)
      
      inline def setErrorTextUndefined: Self = StObject.set(x, "errorText", js.undefined)
      
      inline def setErrorTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "errorText", js.Array(value*))
      
      inline def setErrorTextVdomElement(value: VdomElement): Self = StObject.set(x, "errorText", value.rawElement.asInstanceOf[js.Any])
      
      inline def setFirstDayOfWeek(value: Double): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
      
      inline def setFloatingLabelStyle(value: CSSProperties): Self = StObject.set(x, "floatingLabelStyle", value.asInstanceOf[js.Any])
      
      inline def setFloatingLabelStyleUndefined: Self = StObject.set(x, "floatingLabelStyle", js.undefined)
      
      inline def setFloatingLabelText(value: VdomNode): Self = StObject.set(x, "floatingLabelText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setFloatingLabelTextNull: Self = StObject.set(x, "floatingLabelText", null)
      
      inline def setFloatingLabelTextUndefined: Self = StObject.set(x, "floatingLabelText", js.undefined)
      
      inline def setFloatingLabelTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "floatingLabelText", js.Array(value*))
      
      inline def setFloatingLabelTextVdomElement(value: VdomElement): Self = StObject.set(x, "floatingLabelText", value.rawElement.asInstanceOf[js.Any])
      
      inline def setFormatDate(value: /* date */ js.Date => String): Self = StObject.set(x, "formatDate", js.Any.fromFunction1(value))
      
      inline def setFormatDateUndefined: Self = StObject.set(x, "formatDate", js.undefined)
      
      inline def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      inline def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
      
      inline def setHideCalendarDate(value: Boolean): Self = StObject.set(x, "hideCalendarDate", value.asInstanceOf[js.Any])
      
      inline def setHideCalendarDateUndefined: Self = StObject.set(x, "hideCalendarDate", js.undefined)
      
      inline def setHintStyle(value: CSSProperties): Self = StObject.set(x, "hintStyle", value.asInstanceOf[js.Any])
      
      inline def setHintStyleUndefined: Self = StObject.set(x, "hintStyle", js.undefined)
      
      inline def setHintText(value: VdomNode): Self = StObject.set(x, "hintText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setHintTextNull: Self = StObject.set(x, "hintText", null)
      
      inline def setHintTextUndefined: Self = StObject.set(x, "hintText", js.undefined)
      
      inline def setHintTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "hintText", js.Array(value*))
      
      inline def setHintTextVdomElement(value: VdomElement): Self = StObject.set(x, "hintText", value.rawElement.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInputStyle(value: CSSProperties): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
      
      inline def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setMode(value: portrait | landscape): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOkLabel(value: VdomNode): Self = StObject.set(x, "okLabel", value.rawNode.asInstanceOf[js.Any])
      
      inline def setOkLabelNull: Self = StObject.set(x, "okLabel", null)
      
      inline def setOkLabelUndefined: Self = StObject.set(x, "okLabel", js.undefined)
      
      inline def setOkLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "okLabel", js.Array(value*))
      
      inline def setOkLabelVdomElement(value: VdomElement): Self = StObject.set(x, "okLabel", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnBlur(value: ReactFocusEventFrom[js.Object & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[js.Object & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: (/* e */ Any, /* date */ js.Date) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* e */ Any, t1: /* date */ js.Date) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: ReactTouchEventFrom[js.Object & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactTouchEventFrom[js.Object & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnDismiss(value: Callback): Self = StObject.set(x, "onDismiss", value.toJsFn)
      
      inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      inline def setOnFocus(value: ReactFocusEventFrom[js.Object & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[js.Object & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(value: ReactKeyboardEventFrom[js.Object & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[js.Object & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnShow(value: Callback): Self = StObject.set(x, "onShow", value.toJsFn)
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setOpenToYearSelection(value: Boolean): Self = StObject.set(x, "openToYearSelection", value.asInstanceOf[js.Any])
      
      inline def setOpenToYearSelectionUndefined: Self = StObject.set(x, "openToYearSelection", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsMax(value: Double): Self = StObject.set(x, "rowsMax", value.asInstanceOf[js.Any])
      
      inline def setRowsMaxUndefined: Self = StObject.set(x, "rowsMax", js.undefined)
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setShouldDisableDate(value: /* day */ js.Date => Boolean): Self = StObject.set(x, "shouldDisableDate", js.Any.fromFunction1(value))
      
      inline def setShouldDisableDateUndefined: Self = StObject.set(x, "shouldDisableDate", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTextFieldStyle(value: CSSProperties): Self = StObject.set(x, "textFieldStyle", value.asInstanceOf[js.Any])
      
      inline def setTextFieldStyleUndefined: Self = StObject.set(x, "textFieldStyle", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUnderlineDisabledStyle(value: CSSProperties): Self = StObject.set(x, "underlineDisabledStyle", value.asInstanceOf[js.Any])
      
      inline def setUnderlineDisabledStyleUndefined: Self = StObject.set(x, "underlineDisabledStyle", js.undefined)
      
      inline def setUnderlineFocusStyle(value: CSSProperties): Self = StObject.set(x, "underlineFocusStyle", value.asInstanceOf[js.Any])
      
      inline def setUnderlineFocusStyleUndefined: Self = StObject.set(x, "underlineFocusStyle", js.undefined)
      
      inline def setUnderlineShow(value: Boolean): Self = StObject.set(x, "underlineShow", value.asInstanceOf[js.Any])
      
      inline def setUnderlineShowUndefined: Self = StObject.set(x, "underlineShow", js.undefined)
      
      inline def setUnderlineStyle(value: CSSProperties): Self = StObject.set(x, "underlineStyle", value.asInstanceOf[js.Any])
      
      inline def setUnderlineStyleUndefined: Self = StObject.set(x, "underlineStyle", js.undefined)
      
      inline def setUtils(value: utils): Self = StObject.set(x, "utils", value.asInstanceOf[js.Any])
      
      inline def setUtilsUndefined: Self = StObject.set(x, "utils", js.undefined)
      
      inline def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
