package typingsJapgolly.rcPicker

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.rcPicker.esGenerateMod.GenerateConfig
import typingsJapgolly.rcPicker.esInterfaceMod.DisabledTime
import typingsJapgolly.rcPicker.esInterfaceMod.DisabledTimes
import typingsJapgolly.rcPicker.esInterfaceMod.Locale
import typingsJapgolly.rcPicker.esInterfaceMod.NullableDateType
import typingsJapgolly.rcPicker.esInterfaceMod.OnSelect
import typingsJapgolly.rcPicker.esInterfaceMod.PanelMode
import typingsJapgolly.rcPicker.esInterfaceMod.PanelRefProps
import typingsJapgolly.rcPicker.esPanelsDatePanelDateBodyMod.DateRender
import typingsJapgolly.rcPicker.esPanelsTimePanelMod.SharedTimeProps
import typingsJapgolly.rcPicker.esUtilsUiUtilMod.KeyboardConfig
import typingsJapgolly.rcPicker.rcPickerStrings.key
import typingsJapgolly.rcPicker.rcPickerStrings.mouse
import typingsJapgolly.rcPicker.rcPickerStrings.submit
import typingsJapgolly.react.mod.MutableRefObject
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPanelsDatetimePanelMod {
  
  @JSImport("rc-picker/es/panels/DatetimePanel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[DateType](props: DatetimePanelProps[DateType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Inlined {  disabledTime :rc-picker.rc-picker/es/interface.DisabledTime<DateType> | undefined,   showTime :boolean | rc-picker.rc-picker/es/panels/TimePanel.SharedTimeProps<DateType> | undefined,   defaultValue :DateType | undefined} & std.Omit<rc-picker.rc-picker/es/panels/DatePanel.DatePanelProps<DateType>, 'disabledHours' | 'disabledMinutes' | 'disabledSeconds'> */
  trait DatetimePanelProps[DateType] extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var dateRender: js.UndefOr[DateRender[DateType]] = js.undefined
    
    var defaultPickerValue: js.UndefOr[DateType] = js.undefined
    
    var defaultValue: js.UndefOr[DateType] = js.undefined
    
    var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.undefined
    
    var disabledTime: js.UndefOr[DisabledTime[DateType]] = js.undefined
    
    var generateConfig: GenerateConfig[DateType]
    
    var keyboardConfig: js.UndefOr[KeyboardConfig] = js.undefined
    
    var locale: Locale
    
    var nextIcon: js.UndefOr[Node] = js.undefined
    
    var onPanelChange: js.Function2[/* mode */ PanelMode | Null, /* viewValue */ DateType, Unit]
    
    var onSelect: OnSelect[DateType]
    
    var onViewDateChange: js.Function1[/* value */ DateType, Unit]
    
    var operationRef: MutableRefObject[PanelRefProps]
    
    var panelName: js.UndefOr[String] = js.undefined
    
    var prefixCls: String
    
    var prefixColumn: js.UndefOr[js.Function1[/* date */ DateType, Node]] = js.undefined
    
    var prevIcon: js.UndefOr[Node] = js.undefined
    
    var rowClassName: js.UndefOr[js.Function1[/* date */ DateType, String]] = js.undefined
    
    var showTime: js.UndefOr[Boolean | SharedTimeProps[DateType]] = js.undefined
    
    var superNextIcon: js.UndefOr[Node] = js.undefined
    
    var superPrevIcon: js.UndefOr[Node] = js.undefined
    
    var value: js.UndefOr[NullableDateType[DateType]] = js.undefined
    
    var viewDate: DateType
  }
  object DatetimePanelProps {
    
    inline def apply[DateType](
      generateConfig: GenerateConfig[DateType],
      locale: Locale,
      onPanelChange: (/* mode */ PanelMode | Null, /* viewValue */ DateType) => Callback,
      onSelect: (DateType, /* type */ key | mouse | submit) => Callback,
      onViewDateChange: /* value */ DateType => Callback,
      operationRef: MutableRefObject[PanelRefProps],
      prefixCls: String,
      viewDate: DateType
    ): DatetimePanelProps[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onPanelChange = js.Any.fromFunction2((t0: /* mode */ PanelMode | Null, t1: /* viewValue */ DateType) => (onPanelChange(t0, t1)).runNow()), onSelect = js.Any.fromFunction2((t0: DateType, t1: /* type */ key | mouse | submit) => (onSelect(t0, t1)).runNow()), onViewDateChange = js.Any.fromFunction1((t0: /* value */ DateType) => onViewDateChange(t0).runNow()), operationRef = operationRef.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatetimePanelProps[DateType]]
    }
    
    extension [Self <: DatetimePanelProps[?], DateType](x: Self & DatetimePanelProps[DateType]) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setDateRender(value: (DateType, DateType) => Node): Self = StObject.set(x, "dateRender", js.Any.fromFunction2(value))
      
      inline def setDateRenderUndefined: Self = StObject.set(x, "dateRender", js.undefined)
      
      inline def setDefaultPickerValue(value: DateType): Self = StObject.set(x, "defaultPickerValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultPickerValueUndefined: Self = StObject.set(x, "defaultPickerValue", js.undefined)
      
      inline def setDefaultValue(value: DateType): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisabledDate(value: /* date */ DateType => Boolean): Self = StObject.set(x, "disabledDate", js.Any.fromFunction1(value))
      
      inline def setDisabledDateUndefined: Self = StObject.set(x, "disabledDate", js.undefined)
      
      inline def setDisabledTime(value: /* date */ DateType | Null => DisabledTimes): Self = StObject.set(x, "disabledTime", js.Any.fromFunction1(value))
      
      inline def setDisabledTimeUndefined: Self = StObject.set(x, "disabledTime", js.undefined)
      
      inline def setGenerateConfig(value: GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      inline def setKeyboardConfig(value: KeyboardConfig): Self = StObject.set(x, "keyboardConfig", value.asInstanceOf[js.Any])
      
      inline def setKeyboardConfigUndefined: Self = StObject.set(x, "keyboardConfig", js.undefined)
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setNextIcon(value: VdomNode): Self = StObject.set(x, "nextIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setNextIconNull: Self = StObject.set(x, "nextIcon", null)
      
      inline def setNextIconUndefined: Self = StObject.set(x, "nextIcon", js.undefined)
      
      inline def setNextIconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "nextIcon", js.Array(value*))
      
      inline def setNextIconVdomElement(value: VdomElement): Self = StObject.set(x, "nextIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnPanelChange(value: (/* mode */ PanelMode | Null, /* viewValue */ DateType) => Callback): Self = StObject.set(x, "onPanelChange", js.Any.fromFunction2((t0: /* mode */ PanelMode | Null, t1: /* viewValue */ DateType) => (value(t0, t1)).runNow()))
      
      inline def setOnSelect(value: (DateType, /* type */ key | mouse | submit) => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction2((t0: DateType, t1: /* type */ key | mouse | submit) => (value(t0, t1)).runNow()))
      
      inline def setOnViewDateChange(value: /* value */ DateType => Callback): Self = StObject.set(x, "onViewDateChange", js.Any.fromFunction1((t0: /* value */ DateType) => value(t0).runNow()))
      
      inline def setOperationRef(value: MutableRefObject[PanelRefProps]): Self = StObject.set(x, "operationRef", value.asInstanceOf[js.Any])
      
      inline def setPanelName(value: String): Self = StObject.set(x, "panelName", value.asInstanceOf[js.Any])
      
      inline def setPanelNameUndefined: Self = StObject.set(x, "panelName", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixColumn(value: /* date */ DateType => Node): Self = StObject.set(x, "prefixColumn", js.Any.fromFunction1(value))
      
      inline def setPrefixColumnUndefined: Self = StObject.set(x, "prefixColumn", js.undefined)
      
      inline def setPrevIcon(value: VdomNode): Self = StObject.set(x, "prevIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setPrevIconNull: Self = StObject.set(x, "prevIcon", null)
      
      inline def setPrevIconUndefined: Self = StObject.set(x, "prevIcon", js.undefined)
      
      inline def setPrevIconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "prevIcon", js.Array(value*))
      
      inline def setPrevIconVdomElement(value: VdomElement): Self = StObject.set(x, "prevIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRowClassName(value: /* date */ DateType => String): Self = StObject.set(x, "rowClassName", js.Any.fromFunction1(value))
      
      inline def setRowClassNameUndefined: Self = StObject.set(x, "rowClassName", js.undefined)
      
      inline def setShowTime(value: Boolean | SharedTimeProps[DateType]): Self = StObject.set(x, "showTime", value.asInstanceOf[js.Any])
      
      inline def setShowTimeUndefined: Self = StObject.set(x, "showTime", js.undefined)
      
      inline def setSuperNextIcon(value: VdomNode): Self = StObject.set(x, "superNextIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSuperNextIconNull: Self = StObject.set(x, "superNextIcon", null)
      
      inline def setSuperNextIconUndefined: Self = StObject.set(x, "superNextIcon", js.undefined)
      
      inline def setSuperNextIconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "superNextIcon", js.Array(value*))
      
      inline def setSuperNextIconVdomElement(value: VdomElement): Self = StObject.set(x, "superNextIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSuperPrevIcon(value: VdomNode): Self = StObject.set(x, "superPrevIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSuperPrevIconNull: Self = StObject.set(x, "superPrevIcon", null)
      
      inline def setSuperPrevIconUndefined: Self = StObject.set(x, "superPrevIcon", js.undefined)
      
      inline def setSuperPrevIconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "superPrevIcon", js.Array(value*))
      
      inline def setSuperPrevIconVdomElement(value: VdomElement): Self = StObject.set(x, "superPrevIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setValue(value: NullableDateType[DateType]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setViewDate(value: DateType): Self = StObject.set(x, "viewDate", value.asInstanceOf[js.Any])
    }
  }
}
