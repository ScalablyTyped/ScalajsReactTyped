package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.antd.anon.Locale
import typingsJapgolly.antd.anon.OnChange
import typingsJapgolly.antd.antdStrings.date
import typingsJapgolly.antd.antdStrings.default
import typingsJapgolly.antd.antdStrings.generateConfig
import typingsJapgolly.antd.antdStrings.large
import typingsJapgolly.antd.antdStrings.locale
import typingsJapgolly.antd.antdStrings.ltr
import typingsJapgolly.antd.antdStrings.nextIcon
import typingsJapgolly.antd.antdStrings.prevIcon
import typingsJapgolly.antd.antdStrings.rtl
import typingsJapgolly.antd.antdStrings.small
import typingsJapgolly.antd.antdStrings.superNextIcon
import typingsJapgolly.antd.antdStrings.superPrevIcon
import typingsJapgolly.antd.antdStrings.time
import typingsJapgolly.antd.libDatePickerGeneratePickerMod.PickerLocale
import typingsJapgolly.rcPicker.esGenerateMod.GenerateConfig
import typingsJapgolly.rcPicker.esInterfaceMod.Components
import typingsJapgolly.rcPicker.esInterfaceMod.DisabledTime
import typingsJapgolly.rcPicker.esInterfaceMod.DisabledTimes
import typingsJapgolly.rcPicker.esInterfaceMod.OnPanelChange
import typingsJapgolly.rcPicker.esInterfaceMod.PanelMode
import typingsJapgolly.rcPicker.esInterfaceMod.PickerMode
import typingsJapgolly.rcPicker.esPanelsDatePanelDateBodyMod.DateRender
import typingsJapgolly.rcPicker.esPanelsMonthPanelMonthBodyMod.MonthCellRender
import typingsJapgolly.rcPicker.esPanelsTimePanelMod.SharedTimeProps
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCalendarGenerateCalendarMod {
  
  @JSImport("antd/lib/calendar/generateCalendar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[DateType](generateConfig: GenerateConfig[DateType]): js.Function1[/* props */ CalendarProps[DateType], Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(generateConfig.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ CalendarProps[DateType], Element]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antd.antdStrings.year
    - typingsJapgolly.antd.antdStrings.month
  */
  trait CalendarMode extends StObject
  object CalendarMode {
    
    inline def month: typingsJapgolly.antd.antdStrings.month = "month".asInstanceOf[typingsJapgolly.antd.antdStrings.month]
    
    inline def year: typingsJapgolly.antd.antdStrings.year = "year".asInstanceOf[typingsJapgolly.antd.antdStrings.year]
  }
  
  trait CalendarProps[DateType] extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dateCellRender: js.UndefOr[js.Function1[/* date */ DateType, Node]] = js.undefined
    
    var dateFullCellRender: js.UndefOr[js.Function1[/* date */ DateType, Node]] = js.undefined
    
    var defaultValue: js.UndefOr[DateType] = js.undefined
    
    var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.undefined
    
    var fullscreen: js.UndefOr[Boolean] = js.undefined
    
    var headerRender: js.UndefOr[HeaderRender[DateType]] = js.undefined
    
    var locale: js.UndefOr[PickerLocale] = js.undefined
    
    var mode: js.UndefOr[CalendarMode] = js.undefined
    
    var monthCellRender: js.UndefOr[js.Function1[/* date */ DateType, Node]] = js.undefined
    
    var monthFullCellRender: js.UndefOr[js.Function1[/* date */ DateType, Node]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* date */ DateType, Unit]] = js.undefined
    
    var onPanelChange: js.UndefOr[js.Function2[/* date */ DateType, /* mode */ CalendarMode, Unit]] = js.undefined
    
    var onSelect: js.UndefOr[js.Function1[/* date */ DateType, Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var validRange: js.UndefOr[js.Tuple2[DateType, DateType]] = js.undefined
    
    var value: js.UndefOr[DateType] = js.undefined
  }
  object CalendarProps {
    
    inline def apply[DateType](): CalendarProps[DateType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalendarProps[DateType]]
    }
    
    extension [Self <: CalendarProps[?], DateType](x: Self & CalendarProps[DateType]) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDateCellRender(value: /* date */ DateType => Node): Self = StObject.set(x, "dateCellRender", js.Any.fromFunction1(value))
      
      inline def setDateCellRenderUndefined: Self = StObject.set(x, "dateCellRender", js.undefined)
      
      inline def setDateFullCellRender(value: /* date */ DateType => Node): Self = StObject.set(x, "dateFullCellRender", js.Any.fromFunction1(value))
      
      inline def setDateFullCellRenderUndefined: Self = StObject.set(x, "dateFullCellRender", js.undefined)
      
      inline def setDefaultValue(value: DateType): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisabledDate(value: /* date */ DateType => Boolean): Self = StObject.set(x, "disabledDate", js.Any.fromFunction1(value))
      
      inline def setDisabledDateUndefined: Self = StObject.set(x, "disabledDate", js.undefined)
      
      inline def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
      
      inline def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
      
      inline def setHeaderRender(value: /* config */ OnChange[DateType] => Node): Self = StObject.set(x, "headerRender", js.Any.fromFunction1(value))
      
      inline def setHeaderRenderUndefined: Self = StObject.set(x, "headerRender", js.undefined)
      
      inline def setLocale(value: PickerLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMode(value: CalendarMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMonthCellRender(value: /* date */ DateType => Node): Self = StObject.set(x, "monthCellRender", js.Any.fromFunction1(value))
      
      inline def setMonthCellRenderUndefined: Self = StObject.set(x, "monthCellRender", js.undefined)
      
      inline def setMonthFullCellRender(value: /* date */ DateType => Node): Self = StObject.set(x, "monthFullCellRender", js.Any.fromFunction1(value))
      
      inline def setMonthFullCellRenderUndefined: Self = StObject.set(x, "monthFullCellRender", js.undefined)
      
      inline def setOnChange(value: /* date */ DateType => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* date */ DateType) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnPanelChange(value: (/* date */ DateType, /* mode */ CalendarMode) => Callback): Self = StObject.set(x, "onPanelChange", js.Any.fromFunction2((t0: /* date */ DateType, t1: /* mode */ CalendarMode) => (value(t0, t1)).runNow()))
      
      inline def setOnPanelChangeUndefined: Self = StObject.set(x, "onPanelChange", js.undefined)
      
      inline def setOnSelect(value: /* date */ DateType => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: /* date */ DateType) => value(t0).runNow()))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValidRange(value: js.Tuple2[DateType, DateType]): Self = StObject.set(x, "validRange", value.asInstanceOf[js.Any])
      
      inline def setValidRangeUndefined: Self = StObject.set(x, "validRange", js.undefined)
      
      inline def setValue(value: DateType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type HeaderRender[DateType] = js.Function1[/* config */ OnChange[DateType], Node]
  
  type InjectDefaultProps[Props] = (Omit[
    Props, 
    locale | generateConfig | prevIcon | nextIcon | superPrevIcon | superNextIcon
  ]) & Locale
  
  /* Inlined antd.antd/lib/calendar/generateCalendar.InjectDefaultProps<rc-picker.rc-picker/es/PickerPanel.PickerPanelBaseProps<DateType>> */
  trait PickerPanelBaseProps[DateType]
    extends StObject
       with PickerProps[DateType] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var components: js.UndefOr[Components] = js.undefined
    
    var dateRender: js.UndefOr[DateRender[DateType]] = js.undefined
    
    var defaultPickerValue: js.UndefOr[DateType] = js.undefined
    
    var defaultValue: js.UndefOr[DateType] = js.undefined
    
    var direction: js.UndefOr[ltr | rtl] = js.undefined
    
    var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.undefined
    
    var hideHeader: js.UndefOr[Boolean] = js.undefined
    
    var locale: js.UndefOr[PickerLocale] = js.undefined
    
    var mode: js.UndefOr[PanelMode] = js.undefined
    
    var monthCellRender: js.UndefOr[MonthCellRender[DateType]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ DateType, Unit]] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onOk: js.UndefOr[js.Function1[/* date */ DateType, Unit]] = js.undefined
    
    var onPanelChange: js.UndefOr[OnPanelChange[DateType]] = js.undefined
    
    var onPickerValueChange: js.UndefOr[js.Function1[/* date */ DateType, Unit]] = js.undefined
    
    var onSelect: js.UndefOr[js.Function1[/* value */ DateType, Unit]] = js.undefined
    
    var picker: Exclude[PickerMode, date | time]
    
    var pickerValue: js.UndefOr[DateType] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var renderExtraFooter: js.UndefOr[js.Function1[/* mode */ PanelMode, Node]] = js.undefined
    
    var size: js.UndefOr[large | default | small] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var value: js.UndefOr[DateType | Null] = js.undefined
  }
  object PickerPanelBaseProps {
    
    inline def apply[DateType](picker: Exclude[PickerMode, date | time]): PickerPanelBaseProps[DateType] = {
      val __obj = js.Dynamic.literal(picker = picker.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickerPanelBaseProps[DateType]]
    }
    
    extension [Self <: PickerPanelBaseProps[?], DateType](x: Self & PickerPanelBaseProps[DateType]) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComponents(value: Components): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setDateRender(value: (DateType, DateType) => Node): Self = StObject.set(x, "dateRender", js.Any.fromFunction2(value))
      
      inline def setDateRenderUndefined: Self = StObject.set(x, "dateRender", js.undefined)
      
      inline def setDefaultPickerValue(value: DateType): Self = StObject.set(x, "defaultPickerValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultPickerValueUndefined: Self = StObject.set(x, "defaultPickerValue", js.undefined)
      
      inline def setDefaultValue(value: DateType): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisabledDate(value: /* date */ DateType => Boolean): Self = StObject.set(x, "disabledDate", js.Any.fromFunction1(value))
      
      inline def setDisabledDateUndefined: Self = StObject.set(x, "disabledDate", js.undefined)
      
      inline def setHideHeader(value: Boolean): Self = StObject.set(x, "hideHeader", value.asInstanceOf[js.Any])
      
      inline def setHideHeaderUndefined: Self = StObject.set(x, "hideHeader", js.undefined)
      
      inline def setLocale(value: PickerLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMode(value: PanelMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMonthCellRender(value: (DateType, /* locale */ typingsJapgolly.rcPicker.esInterfaceMod.Locale) => Node): Self = StObject.set(x, "monthCellRender", js.Any.fromFunction2(value))
      
      inline def setMonthCellRenderUndefined: Self = StObject.set(x, "monthCellRender", js.undefined)
      
      inline def setOnChange(value: /* value */ DateType => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* value */ DateType) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnMouseDown(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnOk(value: /* date */ DateType => Callback): Self = StObject.set(x, "onOk", js.Any.fromFunction1((t0: /* date */ DateType) => value(t0).runNow()))
      
      inline def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      inline def setOnPanelChange(value: (DateType, /* mode */ PanelMode) => Callback): Self = StObject.set(x, "onPanelChange", js.Any.fromFunction2((t0: DateType, t1: /* mode */ PanelMode) => (value(t0, t1)).runNow()))
      
      inline def setOnPanelChangeUndefined: Self = StObject.set(x, "onPanelChange", js.undefined)
      
      inline def setOnPickerValueChange(value: /* date */ DateType => Callback): Self = StObject.set(x, "onPickerValueChange", js.Any.fromFunction1((t0: /* date */ DateType) => value(t0).runNow()))
      
      inline def setOnPickerValueChangeUndefined: Self = StObject.set(x, "onPickerValueChange", js.undefined)
      
      inline def setOnSelect(value: /* value */ DateType => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: /* value */ DateType) => value(t0).runNow()))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setPicker(value: Exclude[PickerMode, date | time]): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
      
      inline def setPickerValue(value: DateType): Self = StObject.set(x, "pickerValue", value.asInstanceOf[js.Any])
      
      inline def setPickerValueUndefined: Self = StObject.set(x, "pickerValue", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRenderExtraFooter(value: /* mode */ PanelMode => Node): Self = StObject.set(x, "renderExtraFooter", js.Any.fromFunction1(value))
      
      inline def setRenderExtraFooterUndefined: Self = StObject.set(x, "renderExtraFooter", js.undefined)
      
      inline def setSize(value: large | default | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setValue(value: DateType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined antd.antd/lib/calendar/generateCalendar.InjectDefaultProps<rc-picker.rc-picker/es/PickerPanel.PickerPanelDateProps<DateType>> */
  trait PickerPanelDateProps[DateType]
    extends StObject
       with PickerProps[DateType] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var components: js.UndefOr[Components] = js.undefined
    
    var dateRender: js.UndefOr[DateRender[DateType]] = js.undefined
    
    var defaultPickerValue: js.UndefOr[DateType] = js.undefined
    
    var defaultValue: js.UndefOr[DateType] = js.undefined
    
    var direction: js.UndefOr[ltr | rtl] = js.undefined
    
    var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.undefined
    
    var disabledTime: js.UndefOr[DisabledTime[DateType]] = js.undefined
    
    var hideHeader: js.UndefOr[Boolean] = js.undefined
    
    var locale: js.UndefOr[PickerLocale] = js.undefined
    
    var mode: js.UndefOr[PanelMode] = js.undefined
    
    var monthCellRender: js.UndefOr[MonthCellRender[DateType]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ DateType, Unit]] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onOk: js.UndefOr[js.Function1[/* date */ DateType, Unit]] = js.undefined
    
    var onPanelChange: js.UndefOr[OnPanelChange[DateType]] = js.undefined
    
    var onPickerValueChange: js.UndefOr[js.Function1[/* date */ DateType, Unit]] = js.undefined
    
    var onSelect: js.UndefOr[js.Function1[/* value */ DateType, Unit]] = js.undefined
    
    var picker: js.UndefOr[date] = js.undefined
    
    var pickerValue: js.UndefOr[DateType] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var renderExtraFooter: js.UndefOr[js.Function1[/* mode */ PanelMode, Node]] = js.undefined
    
    var showNow: js.UndefOr[Boolean] = js.undefined
    
    var showTime: js.UndefOr[Boolean | SharedTimeProps[DateType]] = js.undefined
    
    var showToday: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[large | default | small] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var value: js.UndefOr[DateType | Null] = js.undefined
  }
  object PickerPanelDateProps {
    
    inline def apply[DateType](): PickerPanelDateProps[DateType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickerPanelDateProps[DateType]]
    }
    
    extension [Self <: PickerPanelDateProps[?], DateType](x: Self & PickerPanelDateProps[DateType]) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComponents(value: Components): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setDateRender(value: (DateType, DateType) => Node): Self = StObject.set(x, "dateRender", js.Any.fromFunction2(value))
      
      inline def setDateRenderUndefined: Self = StObject.set(x, "dateRender", js.undefined)
      
      inline def setDefaultPickerValue(value: DateType): Self = StObject.set(x, "defaultPickerValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultPickerValueUndefined: Self = StObject.set(x, "defaultPickerValue", js.undefined)
      
      inline def setDefaultValue(value: DateType): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisabledDate(value: /* date */ DateType => Boolean): Self = StObject.set(x, "disabledDate", js.Any.fromFunction1(value))
      
      inline def setDisabledDateUndefined: Self = StObject.set(x, "disabledDate", js.undefined)
      
      inline def setDisabledTime(value: /* date */ DateType | Null => DisabledTimes): Self = StObject.set(x, "disabledTime", js.Any.fromFunction1(value))
      
      inline def setDisabledTimeUndefined: Self = StObject.set(x, "disabledTime", js.undefined)
      
      inline def setHideHeader(value: Boolean): Self = StObject.set(x, "hideHeader", value.asInstanceOf[js.Any])
      
      inline def setHideHeaderUndefined: Self = StObject.set(x, "hideHeader", js.undefined)
      
      inline def setLocale(value: PickerLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMode(value: PanelMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMonthCellRender(value: (DateType, /* locale */ typingsJapgolly.rcPicker.esInterfaceMod.Locale) => Node): Self = StObject.set(x, "monthCellRender", js.Any.fromFunction2(value))
      
      inline def setMonthCellRenderUndefined: Self = StObject.set(x, "monthCellRender", js.undefined)
      
      inline def setOnChange(value: /* value */ DateType => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* value */ DateType) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnMouseDown(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnOk(value: /* date */ DateType => Callback): Self = StObject.set(x, "onOk", js.Any.fromFunction1((t0: /* date */ DateType) => value(t0).runNow()))
      
      inline def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      inline def setOnPanelChange(value: (DateType, /* mode */ PanelMode) => Callback): Self = StObject.set(x, "onPanelChange", js.Any.fromFunction2((t0: DateType, t1: /* mode */ PanelMode) => (value(t0, t1)).runNow()))
      
      inline def setOnPanelChangeUndefined: Self = StObject.set(x, "onPanelChange", js.undefined)
      
      inline def setOnPickerValueChange(value: /* date */ DateType => Callback): Self = StObject.set(x, "onPickerValueChange", js.Any.fromFunction1((t0: /* date */ DateType) => value(t0).runNow()))
      
      inline def setOnPickerValueChangeUndefined: Self = StObject.set(x, "onPickerValueChange", js.undefined)
      
      inline def setOnSelect(value: /* value */ DateType => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: /* value */ DateType) => value(t0).runNow()))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setPicker(value: date): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
      
      inline def setPickerUndefined: Self = StObject.set(x, "picker", js.undefined)
      
      inline def setPickerValue(value: DateType): Self = StObject.set(x, "pickerValue", value.asInstanceOf[js.Any])
      
      inline def setPickerValueUndefined: Self = StObject.set(x, "pickerValue", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRenderExtraFooter(value: /* mode */ PanelMode => Node): Self = StObject.set(x, "renderExtraFooter", js.Any.fromFunction1(value))
      
      inline def setRenderExtraFooterUndefined: Self = StObject.set(x, "renderExtraFooter", js.undefined)
      
      inline def setShowNow(value: Boolean): Self = StObject.set(x, "showNow", value.asInstanceOf[js.Any])
      
      inline def setShowNowUndefined: Self = StObject.set(x, "showNow", js.undefined)
      
      inline def setShowTime(value: Boolean | SharedTimeProps[DateType]): Self = StObject.set(x, "showTime", value.asInstanceOf[js.Any])
      
      inline def setShowTimeUndefined: Self = StObject.set(x, "showTime", js.undefined)
      
      inline def setShowToday(value: Boolean): Self = StObject.set(x, "showToday", value.asInstanceOf[js.Any])
      
      inline def setShowTodayUndefined: Self = StObject.set(x, "showToday", js.undefined)
      
      inline def setSize(value: large | default | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setValue(value: DateType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined antd.antd/lib/calendar/generateCalendar.InjectDefaultProps<rc-picker.rc-picker/es/PickerPanel.PickerPanelTimeProps<DateType>> */
  trait PickerPanelTimeProps[DateType]
    extends StObject
       with PickerProps[DateType] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var components: js.UndefOr[Components] = js.undefined
    
    var dateRender: js.UndefOr[DateRender[DateType]] = js.undefined
    
    var defaultPickerValue: js.UndefOr[DateType] = js.undefined
    
    var defaultValue: js.UndefOr[DateType] = js.undefined
    
    var direction: js.UndefOr[ltr | rtl] = js.undefined
    
    var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.undefined
    
    var disabledHours: js.UndefOr[js.Function0[js.Array[Double]]] = js.undefined
    
    var disabledMinutes: js.UndefOr[js.Function1[/* hour */ Double, js.Array[Double]]] = js.undefined
    
    var disabledSeconds: js.UndefOr[js.Function2[/* hour */ Double, /* minute */ Double, js.Array[Double]]] = js.undefined
    
    var disabledTime: js.UndefOr[js.Function1[/* date */ DateType, DisabledTimes]] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var hideDisabledOptions: js.UndefOr[Boolean] = js.undefined
    
    var hideHeader: js.UndefOr[Boolean] = js.undefined
    
    var hourStep: js.UndefOr[Double] = js.undefined
    
    var locale: js.UndefOr[PickerLocale] = js.undefined
    
    var minuteStep: js.UndefOr[Double] = js.undefined
    
    var mode: js.UndefOr[PanelMode] = js.undefined
    
    var monthCellRender: js.UndefOr[MonthCellRender[DateType]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ DateType, Unit]] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onOk: js.UndefOr[js.Function1[/* date */ DateType, Unit]] = js.undefined
    
    var onPanelChange: js.UndefOr[OnPanelChange[DateType]] = js.undefined
    
    var onPickerValueChange: js.UndefOr[js.Function1[/* date */ DateType, Unit]] = js.undefined
    
    var onSelect: js.UndefOr[js.Function1[/* value */ DateType, Unit]] = js.undefined
    
    var picker: time
    
    var pickerValue: js.UndefOr[DateType] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var renderExtraFooter: js.UndefOr[js.Function1[/* mode */ PanelMode, Node]] = js.undefined
    
    var secondStep: js.UndefOr[Double] = js.undefined
    
    var showHour: js.UndefOr[Boolean] = js.undefined
    
    var showMinute: js.UndefOr[Boolean] = js.undefined
    
    var showNow: js.UndefOr[Boolean] = js.undefined
    
    var showSecond: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[large | default | small] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var use12Hours: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[DateType | Null] = js.undefined
  }
  object PickerPanelTimeProps {
    
    inline def apply[DateType](): PickerPanelTimeProps[DateType] = {
      val __obj = js.Dynamic.literal(picker = "time")
      __obj.asInstanceOf[PickerPanelTimeProps[DateType]]
    }
    
    extension [Self <: PickerPanelTimeProps[?], DateType](x: Self & PickerPanelTimeProps[DateType]) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComponents(value: Components): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setDateRender(value: (DateType, DateType) => Node): Self = StObject.set(x, "dateRender", js.Any.fromFunction2(value))
      
      inline def setDateRenderUndefined: Self = StObject.set(x, "dateRender", js.undefined)
      
      inline def setDefaultPickerValue(value: DateType): Self = StObject.set(x, "defaultPickerValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultPickerValueUndefined: Self = StObject.set(x, "defaultPickerValue", js.undefined)
      
      inline def setDefaultValue(value: DateType): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisabledDate(value: /* date */ DateType => Boolean): Self = StObject.set(x, "disabledDate", js.Any.fromFunction1(value))
      
      inline def setDisabledDateUndefined: Self = StObject.set(x, "disabledDate", js.undefined)
      
      inline def setDisabledHours(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "disabledHours", value.toJsFn)
      
      inline def setDisabledHoursUndefined: Self = StObject.set(x, "disabledHours", js.undefined)
      
      inline def setDisabledMinutes(value: /* hour */ Double => js.Array[Double]): Self = StObject.set(x, "disabledMinutes", js.Any.fromFunction1(value))
      
      inline def setDisabledMinutesUndefined: Self = StObject.set(x, "disabledMinutes", js.undefined)
      
      inline def setDisabledSeconds(value: (/* hour */ Double, /* minute */ Double) => js.Array[Double]): Self = StObject.set(x, "disabledSeconds", js.Any.fromFunction2(value))
      
      inline def setDisabledSecondsUndefined: Self = StObject.set(x, "disabledSeconds", js.undefined)
      
      inline def setDisabledTime(value: /* date */ DateType => DisabledTimes): Self = StObject.set(x, "disabledTime", js.Any.fromFunction1(value))
      
      inline def setDisabledTimeUndefined: Self = StObject.set(x, "disabledTime", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHideDisabledOptions(value: Boolean): Self = StObject.set(x, "hideDisabledOptions", value.asInstanceOf[js.Any])
      
      inline def setHideDisabledOptionsUndefined: Self = StObject.set(x, "hideDisabledOptions", js.undefined)
      
      inline def setHideHeader(value: Boolean): Self = StObject.set(x, "hideHeader", value.asInstanceOf[js.Any])
      
      inline def setHideHeaderUndefined: Self = StObject.set(x, "hideHeader", js.undefined)
      
      inline def setHourStep(value: Double): Self = StObject.set(x, "hourStep", value.asInstanceOf[js.Any])
      
      inline def setHourStepUndefined: Self = StObject.set(x, "hourStep", js.undefined)
      
      inline def setLocale(value: PickerLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMinuteStep(value: Double): Self = StObject.set(x, "minuteStep", value.asInstanceOf[js.Any])
      
      inline def setMinuteStepUndefined: Self = StObject.set(x, "minuteStep", js.undefined)
      
      inline def setMode(value: PanelMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMonthCellRender(value: (DateType, /* locale */ typingsJapgolly.rcPicker.esInterfaceMod.Locale) => Node): Self = StObject.set(x, "monthCellRender", js.Any.fromFunction2(value))
      
      inline def setMonthCellRenderUndefined: Self = StObject.set(x, "monthCellRender", js.undefined)
      
      inline def setOnChange(value: /* value */ DateType => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* value */ DateType) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnMouseDown(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnOk(value: /* date */ DateType => Callback): Self = StObject.set(x, "onOk", js.Any.fromFunction1((t0: /* date */ DateType) => value(t0).runNow()))
      
      inline def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      inline def setOnPanelChange(value: (DateType, /* mode */ PanelMode) => Callback): Self = StObject.set(x, "onPanelChange", js.Any.fromFunction2((t0: DateType, t1: /* mode */ PanelMode) => (value(t0, t1)).runNow()))
      
      inline def setOnPanelChangeUndefined: Self = StObject.set(x, "onPanelChange", js.undefined)
      
      inline def setOnPickerValueChange(value: /* date */ DateType => Callback): Self = StObject.set(x, "onPickerValueChange", js.Any.fromFunction1((t0: /* date */ DateType) => value(t0).runNow()))
      
      inline def setOnPickerValueChangeUndefined: Self = StObject.set(x, "onPickerValueChange", js.undefined)
      
      inline def setOnSelect(value: /* value */ DateType => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: /* value */ DateType) => value(t0).runNow()))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setPicker(value: time): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
      
      inline def setPickerValue(value: DateType): Self = StObject.set(x, "pickerValue", value.asInstanceOf[js.Any])
      
      inline def setPickerValueUndefined: Self = StObject.set(x, "pickerValue", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRenderExtraFooter(value: /* mode */ PanelMode => Node): Self = StObject.set(x, "renderExtraFooter", js.Any.fromFunction1(value))
      
      inline def setRenderExtraFooterUndefined: Self = StObject.set(x, "renderExtraFooter", js.undefined)
      
      inline def setSecondStep(value: Double): Self = StObject.set(x, "secondStep", value.asInstanceOf[js.Any])
      
      inline def setSecondStepUndefined: Self = StObject.set(x, "secondStep", js.undefined)
      
      inline def setShowHour(value: Boolean): Self = StObject.set(x, "showHour", value.asInstanceOf[js.Any])
      
      inline def setShowHourUndefined: Self = StObject.set(x, "showHour", js.undefined)
      
      inline def setShowMinute(value: Boolean): Self = StObject.set(x, "showMinute", value.asInstanceOf[js.Any])
      
      inline def setShowMinuteUndefined: Self = StObject.set(x, "showMinute", js.undefined)
      
      inline def setShowNow(value: Boolean): Self = StObject.set(x, "showNow", value.asInstanceOf[js.Any])
      
      inline def setShowNowUndefined: Self = StObject.set(x, "showNow", js.undefined)
      
      inline def setShowSecond(value: Boolean): Self = StObject.set(x, "showSecond", value.asInstanceOf[js.Any])
      
      inline def setShowSecondUndefined: Self = StObject.set(x, "showSecond", js.undefined)
      
      inline def setSize(value: large | default | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setUse12Hours(value: Boolean): Self = StObject.set(x, "use12Hours", value.asInstanceOf[js.Any])
      
      inline def setUse12HoursUndefined: Self = StObject.set(x, "use12Hours", js.undefined)
      
      inline def setValue(value: DateType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antd.libCalendarGenerateCalendarMod.PickerPanelBaseProps[DateType]
    - typingsJapgolly.antd.libCalendarGenerateCalendarMod.PickerPanelDateProps[DateType]
    - typingsJapgolly.antd.libCalendarGenerateCalendarMod.PickerPanelTimeProps[DateType]
  */
  trait PickerProps[DateType] extends StObject
  object PickerProps {
    
    inline def PickerPanelBaseProps[DateType](picker: Exclude[PickerMode, date | time]): typingsJapgolly.antd.libCalendarGenerateCalendarMod.PickerPanelBaseProps[DateType] = {
      val __obj = js.Dynamic.literal(picker = picker.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.antd.libCalendarGenerateCalendarMod.PickerPanelBaseProps[DateType]]
    }
    
    inline def PickerPanelDateProps[DateType](): typingsJapgolly.antd.libCalendarGenerateCalendarMod.PickerPanelDateProps[DateType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.antd.libCalendarGenerateCalendarMod.PickerPanelDateProps[DateType]]
    }
    
    inline def PickerPanelTimeProps[DateType](): typingsJapgolly.antd.libCalendarGenerateCalendarMod.PickerPanelTimeProps[DateType] = {
      val __obj = js.Dynamic.literal(picker = "time")
      __obj.asInstanceOf[typingsJapgolly.antd.libCalendarGenerateCalendarMod.PickerPanelTimeProps[DateType]]
    }
  }
}
