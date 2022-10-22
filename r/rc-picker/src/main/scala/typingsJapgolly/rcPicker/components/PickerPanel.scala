package typingsJapgolly.rcPicker.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcPicker.esGenerateMod.GenerateConfig
import typingsJapgolly.rcPicker.esInterfaceMod.Components
import typingsJapgolly.rcPicker.esInterfaceMod.DisabledTimes
import typingsJapgolly.rcPicker.esInterfaceMod.Locale
import typingsJapgolly.rcPicker.esInterfaceMod.PanelMode
import typingsJapgolly.rcPicker.esInterfaceMod.PickerMode
import typingsJapgolly.rcPicker.esPanelsTimePanelMod.SharedTimeProps
import typingsJapgolly.rcPicker.rcPickerStrings.date
import typingsJapgolly.rcPicker.rcPickerStrings.ltr
import typingsJapgolly.rcPicker.rcPickerStrings.rtl
import typingsJapgolly.rcPicker.rcPickerStrings.time
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PickerPanel {
  
  object PickerPanelBaseProps {
    
    inline def apply[DateType](generateConfig: GenerateConfig[DateType], locale: Locale, picker: Exclude[PickerMode, date | time]): Builder[DateType] = {
      val __props = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
      new Builder[DateType](js.Array(this.component, __props.asInstanceOf[typingsJapgolly.rcPicker.esPickerPanelMod.PickerPanelBaseProps[DateType]]))
    }
    
    @JSImport("rc-picker", "PickerPanel")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder[DateType] (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def components(value: Components): this.type = set("components", value.asInstanceOf[js.Any])
      
      inline def dateRender(value: (DateType, DateType) => Node): this.type = set("dateRender", js.Any.fromFunction2(value))
      
      inline def defaultPickerValue(value: DateType): this.type = set("defaultPickerValue", value.asInstanceOf[js.Any])
      
      inline def defaultValue(value: DateType): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      inline def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
      
      inline def disabledDate(value: DateType => Boolean): this.type = set("disabledDate", js.Any.fromFunction1(value))
      
      inline def hideHeader(value: Boolean): this.type = set("hideHeader", value.asInstanceOf[js.Any])
      
      inline def mode(value: PanelMode): this.type = set("mode", value.asInstanceOf[js.Any])
      
      inline def monthCellRender(value: (DateType, /* locale */ Locale) => Node): this.type = set("monthCellRender", js.Any.fromFunction2(value))
      
      inline def onChange(value: DateType => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: DateType) => value(t0).runNow()))
      
      inline def onMouseDown(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
      
      inline def onOk(value: DateType => Callback): this.type = set("onOk", js.Any.fromFunction1((t0: DateType) => value(t0).runNow()))
      
      inline def onPanelChange(value: (DateType, /* mode */ PanelMode) => Callback): this.type = set("onPanelChange", js.Any.fromFunction2((t0: DateType, t1: /* mode */ PanelMode) => (value(t0, t1)).runNow()))
      
      inline def onPickerValueChange(value: DateType => Callback): this.type = set("onPickerValueChange", js.Any.fromFunction1((t0: DateType) => value(t0).runNow()))
      
      inline def onSelect(value: DateType => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: DateType) => value(t0).runNow()))
      
      inline def pickerValue(value: DateType): this.type = set("pickerValue", value.asInstanceOf[js.Any])
      
      inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      inline def renderExtraFooter(value: /* mode */ PanelMode => Node): this.type = set("renderExtraFooter", js.Any.fromFunction1(value))
      
      inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
      
      inline def value(value: DateType): this.type = set("value", value.asInstanceOf[js.Any])
      
      inline def valueNull: this.type = set("value", null)
    }
    
    def withProps[DateType](p: typingsJapgolly.rcPicker.esPickerPanelMod.PickerPanelBaseProps[DateType]): Builder[DateType] = new Builder[DateType](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object PickerPanelDateProps {
    
    inline def apply[DateType](generateConfig: GenerateConfig[DateType], locale: Locale): Builder[DateType] = {
      val __props = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
      new Builder[DateType](js.Array(this.component, __props.asInstanceOf[typingsJapgolly.rcPicker.esPickerPanelMod.PickerPanelDateProps[DateType]]))
    }
    
    @JSImport("rc-picker", "PickerPanel")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder[DateType] (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def components(value: Components): this.type = set("components", value.asInstanceOf[js.Any])
      
      inline def dateRender(value: (DateType, DateType) => Node): this.type = set("dateRender", js.Any.fromFunction2(value))
      
      inline def defaultPickerValue(value: DateType): this.type = set("defaultPickerValue", value.asInstanceOf[js.Any])
      
      inline def defaultValue(value: DateType): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      inline def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
      
      inline def disabledDate(value: DateType => Boolean): this.type = set("disabledDate", js.Any.fromFunction1(value))
      
      inline def disabledTime(value: /* date */ DateType | Null => DisabledTimes): this.type = set("disabledTime", js.Any.fromFunction1(value))
      
      inline def hideHeader(value: Boolean): this.type = set("hideHeader", value.asInstanceOf[js.Any])
      
      inline def mode(value: PanelMode): this.type = set("mode", value.asInstanceOf[js.Any])
      
      inline def monthCellRender(value: (DateType, /* locale */ Locale) => Node): this.type = set("monthCellRender", js.Any.fromFunction2(value))
      
      inline def onChange(value: DateType => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: DateType) => value(t0).runNow()))
      
      inline def onMouseDown(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
      
      inline def onOk(value: DateType => Callback): this.type = set("onOk", js.Any.fromFunction1((t0: DateType) => value(t0).runNow()))
      
      inline def onPanelChange(value: (DateType, /* mode */ PanelMode) => Callback): this.type = set("onPanelChange", js.Any.fromFunction2((t0: DateType, t1: /* mode */ PanelMode) => (value(t0, t1)).runNow()))
      
      inline def onPickerValueChange(value: DateType => Callback): this.type = set("onPickerValueChange", js.Any.fromFunction1((t0: DateType) => value(t0).runNow()))
      
      inline def onSelect(value: DateType => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: DateType) => value(t0).runNow()))
      
      inline def picker(value: date): this.type = set("picker", value.asInstanceOf[js.Any])
      
      inline def pickerValue(value: DateType): this.type = set("pickerValue", value.asInstanceOf[js.Any])
      
      inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      inline def renderExtraFooter(value: /* mode */ PanelMode => Node): this.type = set("renderExtraFooter", js.Any.fromFunction1(value))
      
      inline def showNow(value: Boolean): this.type = set("showNow", value.asInstanceOf[js.Any])
      
      inline def showTime(value: Boolean | SharedTimeProps[DateType]): this.type = set("showTime", value.asInstanceOf[js.Any])
      
      inline def showToday(value: Boolean): this.type = set("showToday", value.asInstanceOf[js.Any])
      
      inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
      
      inline def value(value: DateType): this.type = set("value", value.asInstanceOf[js.Any])
      
      inline def valueNull: this.type = set("value", null)
    }
    
    def withProps[DateType](p: typingsJapgolly.rcPicker.esPickerPanelMod.PickerPanelDateProps[DateType]): Builder[DateType] = new Builder[DateType](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object PickerPanelTimeProps {
    
    inline def apply[DateType](generateConfig: GenerateConfig[DateType], locale: Locale): Builder[DateType] = {
      val __props = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = "time")
      new Builder[DateType](js.Array(this.component, __props.asInstanceOf[typingsJapgolly.rcPicker.esPickerPanelMod.PickerPanelTimeProps[DateType]]))
    }
    
    @JSImport("rc-picker", "PickerPanel")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder[DateType] (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def components(value: Components): this.type = set("components", value.asInstanceOf[js.Any])
      
      inline def dateRender(value: (DateType, DateType) => Node): this.type = set("dateRender", js.Any.fromFunction2(value))
      
      inline def defaultPickerValue(value: DateType): this.type = set("defaultPickerValue", value.asInstanceOf[js.Any])
      
      inline def defaultValue(value: DateType): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      inline def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
      
      inline def disabledDate(value: DateType => Boolean): this.type = set("disabledDate", js.Any.fromFunction1(value))
      
      inline def disabledHours(value: CallbackTo[js.Array[Double]]): this.type = set("disabledHours", value.toJsFn)
      
      inline def disabledMinutes(value: /* hour */ Double => js.Array[Double]): this.type = set("disabledMinutes", js.Any.fromFunction1(value))
      
      inline def disabledSeconds(value: (/* hour */ Double, /* minute */ Double) => js.Array[Double]): this.type = set("disabledSeconds", js.Any.fromFunction2(value))
      
      inline def disabledTime(value: DateType => DisabledTimes): this.type = set("disabledTime", js.Any.fromFunction1(value))
      
      inline def format(value: String): this.type = set("format", value.asInstanceOf[js.Any])
      
      inline def hideDisabledOptions(value: Boolean): this.type = set("hideDisabledOptions", value.asInstanceOf[js.Any])
      
      inline def hideHeader(value: Boolean): this.type = set("hideHeader", value.asInstanceOf[js.Any])
      
      inline def hourStep(value: Double): this.type = set("hourStep", value.asInstanceOf[js.Any])
      
      inline def minuteStep(value: Double): this.type = set("minuteStep", value.asInstanceOf[js.Any])
      
      inline def mode(value: PanelMode): this.type = set("mode", value.asInstanceOf[js.Any])
      
      inline def monthCellRender(value: (DateType, /* locale */ Locale) => Node): this.type = set("monthCellRender", js.Any.fromFunction2(value))
      
      inline def onChange(value: DateType => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: DateType) => value(t0).runNow()))
      
      inline def onMouseDown(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
      
      inline def onOk(value: DateType => Callback): this.type = set("onOk", js.Any.fromFunction1((t0: DateType) => value(t0).runNow()))
      
      inline def onPanelChange(value: (DateType, /* mode */ PanelMode) => Callback): this.type = set("onPanelChange", js.Any.fromFunction2((t0: DateType, t1: /* mode */ PanelMode) => (value(t0, t1)).runNow()))
      
      inline def onPickerValueChange(value: DateType => Callback): this.type = set("onPickerValueChange", js.Any.fromFunction1((t0: DateType) => value(t0).runNow()))
      
      inline def onSelect(value: DateType => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: DateType) => value(t0).runNow()))
      
      inline def pickerValue(value: DateType): this.type = set("pickerValue", value.asInstanceOf[js.Any])
      
      inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      inline def renderExtraFooter(value: /* mode */ PanelMode => Node): this.type = set("renderExtraFooter", js.Any.fromFunction1(value))
      
      inline def secondStep(value: Double): this.type = set("secondStep", value.asInstanceOf[js.Any])
      
      inline def showHour(value: Boolean): this.type = set("showHour", value.asInstanceOf[js.Any])
      
      inline def showMinute(value: Boolean): this.type = set("showMinute", value.asInstanceOf[js.Any])
      
      inline def showNow(value: Boolean): this.type = set("showNow", value.asInstanceOf[js.Any])
      
      inline def showSecond(value: Boolean): this.type = set("showSecond", value.asInstanceOf[js.Any])
      
      inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
      
      inline def use12Hours(value: Boolean): this.type = set("use12Hours", value.asInstanceOf[js.Any])
      
      inline def value(value: DateType): this.type = set("value", value.asInstanceOf[js.Any])
      
      inline def valueNull: this.type = set("value", null)
    }
    
    def withProps[DateType](p: typingsJapgolly.rcPicker.esPickerPanelMod.PickerPanelTimeProps[DateType]): Builder[DateType] = new Builder[DateType](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
