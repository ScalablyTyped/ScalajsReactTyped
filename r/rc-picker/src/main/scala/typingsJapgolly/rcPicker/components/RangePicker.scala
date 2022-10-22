package typingsJapgolly.rcPicker.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcPicker.esGenerateMod.GenerateConfig
import typingsJapgolly.rcPicker.esInterfaceMod.Components
import typingsJapgolly.rcPicker.esInterfaceMod.CustomFormat
import typingsJapgolly.rcPicker.esInterfaceMod.DisabledTimes
import typingsJapgolly.rcPicker.esInterfaceMod.EventValue
import typingsJapgolly.rcPicker.esInterfaceMod.Locale
import typingsJapgolly.rcPicker.esInterfaceMod.PanelMode
import typingsJapgolly.rcPicker.esInterfaceMod.PickerMode
import typingsJapgolly.rcPicker.esInterfaceMod.RangeValue
import typingsJapgolly.rcPicker.esPickerMod.PickerRefConfig
import typingsJapgolly.rcPicker.esRangePickerMod.RangeInfo
import typingsJapgolly.rcPicker.esRangePickerMod.RangeShowTimeObject
import typingsJapgolly.rcPicker.esRangePickerMod.RangeType
import typingsJapgolly.rcPicker.rcPickerInts.`0`
import typingsJapgolly.rcPicker.rcPickerInts.`1`
import typingsJapgolly.rcPicker.rcPickerStrings.`additions removals`
import typingsJapgolly.rcPicker.rcPickerStrings.`additions text`
import typingsJapgolly.rcPicker.rcPickerStrings.`inline`
import typingsJapgolly.rcPicker.rcPickerStrings.`removals additions`
import typingsJapgolly.rcPicker.rcPickerStrings.`removals text`
import typingsJapgolly.rcPicker.rcPickerStrings.`text additions`
import typingsJapgolly.rcPicker.rcPickerStrings.`text removals`
import typingsJapgolly.rcPicker.rcPickerStrings.additions
import typingsJapgolly.rcPicker.rcPickerStrings.all
import typingsJapgolly.rcPicker.rcPickerStrings.ascending
import typingsJapgolly.rcPicker.rcPickerStrings.assertive
import typingsJapgolly.rcPicker.rcPickerStrings.both
import typingsJapgolly.rcPicker.rcPickerStrings.copy
import typingsJapgolly.rcPicker.rcPickerStrings.date
import typingsJapgolly.rcPicker.rcPickerStrings.descending
import typingsJapgolly.rcPicker.rcPickerStrings.dialog
import typingsJapgolly.rcPicker.rcPickerStrings.execute
import typingsJapgolly.rcPicker.rcPickerStrings.grammar
import typingsJapgolly.rcPicker.rcPickerStrings.grid
import typingsJapgolly.rcPicker.rcPickerStrings.horizontal
import typingsJapgolly.rcPicker.rcPickerStrings.link
import typingsJapgolly.rcPicker.rcPickerStrings.list
import typingsJapgolly.rcPicker.rcPickerStrings.listbox
import typingsJapgolly.rcPicker.rcPickerStrings.location
import typingsJapgolly.rcPicker.rcPickerStrings.ltr
import typingsJapgolly.rcPicker.rcPickerStrings.menu
import typingsJapgolly.rcPicker.rcPickerStrings.mixed
import typingsJapgolly.rcPicker.rcPickerStrings.move
import typingsJapgolly.rcPicker.rcPickerStrings.none
import typingsJapgolly.rcPicker.rcPickerStrings.off
import typingsJapgolly.rcPicker.rcPickerStrings.other
import typingsJapgolly.rcPicker.rcPickerStrings.page
import typingsJapgolly.rcPicker.rcPickerStrings.polite
import typingsJapgolly.rcPicker.rcPickerStrings.popup
import typingsJapgolly.rcPicker.rcPickerStrings.removals
import typingsJapgolly.rcPicker.rcPickerStrings.rtl
import typingsJapgolly.rcPicker.rcPickerStrings.spelling
import typingsJapgolly.rcPicker.rcPickerStrings.step
import typingsJapgolly.rcPicker.rcPickerStrings.text
import typingsJapgolly.rcPicker.rcPickerStrings.time
import typingsJapgolly.rcPicker.rcPickerStrings.tree
import typingsJapgolly.rcPicker.rcPickerStrings.vertical
import typingsJapgolly.rcTrigger.esInterfaceMod.AlignType
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.InputHTMLAttributes
import typingsJapgolly.react.mod.MutableRefObject
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RangePicker {
  
  object RangePickerBaseProps {
    
    inline def apply[DateType](generateConfig: GenerateConfig[DateType], locale: Locale, picker: Exclude[PickerMode, date | time]): Builder[DateType] = {
      val __props = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
      new Builder[DateType](js.Array(this.component, __props.asInstanceOf[typingsJapgolly.rcPicker.esRangePickerMod.RangePickerBaseProps[DateType]]))
    }
    
    @JSImport("rc-picker", "RangePicker")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder[DateType] (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[typingsJapgolly.rcPicker.mod.RangePicker[DateType]] {
      
      inline def activePickerIndex(value: `0` | `1`): this.type = set("activePickerIndex", value.asInstanceOf[js.Any])
      
      inline def allowClear(value: Boolean): this.type = set("allowClear", value.asInstanceOf[js.Any])
      
      inline def allowEmpty(value: js.Tuple2[Boolean, Boolean]): this.type = set("allowEmpty", value.asInstanceOf[js.Any])
      
      inline def `aria-activedescendant`(value: String): this.type = set("aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `aria-atomic`(value: Booleanish): this.type = set("aria-atomic", value.asInstanceOf[js.Any])
      
      inline def `aria-autocomplete`(value: none | `inline` | list | both): this.type = set("aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `aria-busy`(value: Booleanish): this.type = set("aria-busy", value.asInstanceOf[js.Any])
      
      inline def `aria-checked`(value: Boolean | mixed): this.type = set("aria-checked", value.asInstanceOf[js.Any])
      
      inline def `aria-colcount`(value: Double): this.type = set("aria-colcount", value.asInstanceOf[js.Any])
      
      inline def `aria-colindex`(value: Double): this.type = set("aria-colindex", value.asInstanceOf[js.Any])
      
      inline def `aria-colspan`(value: Double): this.type = set("aria-colspan", value.asInstanceOf[js.Any])
      
      inline def `aria-controls`(value: String): this.type = set("aria-controls", value.asInstanceOf[js.Any])
      
      inline def `aria-current`(value: Boolean | page | step | location | date | time): this.type = set("aria-current", value.asInstanceOf[js.Any])
      
      inline def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `aria-details`(value: String): this.type = set("aria-details", value.asInstanceOf[js.Any])
      
      inline def `aria-disabled`(value: Booleanish): this.type = set("aria-disabled", value.asInstanceOf[js.Any])
      
      inline def `aria-dropeffect`(value: none | copy | execute | link | move | popup): this.type = set("aria-dropeffect", value.asInstanceOf[js.Any])
      
      inline def `aria-errormessage`(value: String): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `aria-expanded`(value: Booleanish): this.type = set("aria-expanded", value.asInstanceOf[js.Any])
      
      inline def `aria-flowto`(value: String): this.type = set("aria-flowto", value.asInstanceOf[js.Any])
      
      inline def `aria-grabbed`(value: Booleanish): this.type = set("aria-grabbed", value.asInstanceOf[js.Any])
      
      inline def `aria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): this.type = set("aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `aria-hidden`(value: Booleanish): this.type = set("aria-hidden", value.asInstanceOf[js.Any])
      
      inline def `aria-invalid`(value: Boolean | grammar | spelling): this.type = set("aria-invalid", value.asInstanceOf[js.Any])
      
      inline def `aria-keyshortcuts`(value: String): this.type = set("aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
      
      inline def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `aria-level`(value: Double): this.type = set("aria-level", value.asInstanceOf[js.Any])
      
      inline def `aria-live`(value: off | assertive | polite): this.type = set("aria-live", value.asInstanceOf[js.Any])
      
      inline def `aria-modal`(value: Booleanish): this.type = set("aria-modal", value.asInstanceOf[js.Any])
      
      inline def `aria-multiline`(value: Booleanish): this.type = set("aria-multiline", value.asInstanceOf[js.Any])
      
      inline def `aria-multiselectable`(value: Booleanish): this.type = set("aria-multiselectable", value.asInstanceOf[js.Any])
      
      inline def `aria-orientation`(value: horizontal | vertical): this.type = set("aria-orientation", value.asInstanceOf[js.Any])
      
      inline def `aria-owns`(value: String): this.type = set("aria-owns", value.asInstanceOf[js.Any])
      
      inline def `aria-placeholder`(value: String): this.type = set("aria-placeholder", value.asInstanceOf[js.Any])
      
      inline def `aria-posinset`(value: Double): this.type = set("aria-posinset", value.asInstanceOf[js.Any])
      
      inline def `aria-pressed`(value: Boolean | mixed): this.type = set("aria-pressed", value.asInstanceOf[js.Any])
      
      inline def `aria-readonly`(value: Booleanish): this.type = set("aria-readonly", value.asInstanceOf[js.Any])
      
      inline def `aria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): this.type = set("aria-relevant", value.asInstanceOf[js.Any])
      
      inline def `aria-required`(value: Booleanish): this.type = set("aria-required", value.asInstanceOf[js.Any])
      
      inline def `aria-roledescription`(value: String): this.type = set("aria-roledescription", value.asInstanceOf[js.Any])
      
      inline def `aria-rowcount`(value: Double): this.type = set("aria-rowcount", value.asInstanceOf[js.Any])
      
      inline def `aria-rowindex`(value: Double): this.type = set("aria-rowindex", value.asInstanceOf[js.Any])
      
      inline def `aria-rowspan`(value: Double): this.type = set("aria-rowspan", value.asInstanceOf[js.Any])
      
      inline def `aria-selected`(value: Booleanish): this.type = set("aria-selected", value.asInstanceOf[js.Any])
      
      inline def `aria-setsize`(value: Double): this.type = set("aria-setsize", value.asInstanceOf[js.Any])
      
      inline def `aria-sort`(value: none | ascending | descending | other): this.type = set("aria-sort", value.asInstanceOf[js.Any])
      
      inline def `aria-valuemax`(value: Double): this.type = set("aria-valuemax", value.asInstanceOf[js.Any])
      
      inline def `aria-valuemin`(value: Double): this.type = set("aria-valuemin", value.asInstanceOf[js.Any])
      
      inline def `aria-valuenow`(value: Double): this.type = set("aria-valuenow", value.asInstanceOf[js.Any])
      
      inline def `aria-valuetext`(value: String): this.type = set("aria-valuetext", value.asInstanceOf[js.Any])
      
      inline def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
      
      inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def clearIcon(value: VdomNode): this.type = set("clearIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def clearIconNull: this.type = set("clearIcon", null)
      
      inline def clearIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("clearIcon", js.Array(value*))
      
      inline def clearIconVdomElement(value: VdomElement): this.type = set("clearIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def components(value: Components): this.type = set("components", value.asInstanceOf[js.Any])
      
      inline def dateRender(value: (DateType, DateType, /* info */ RangeInfo) => Node): this.type = set("dateRender", js.Any.fromFunction3(value))
      
      inline def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
      
      inline def defaultPickerValue(value: js.Tuple2[DateType, DateType]): this.type = set("defaultPickerValue", value.asInstanceOf[js.Any])
      
      inline def defaultValue(value: RangeValue[DateType]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      inline def defaultValueNull: this.type = set("defaultValue", null)
      
      inline def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
      
      inline def disabled(value: Boolean | (js.Tuple2[Boolean, Boolean])): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      inline def disabledDate(value: DateType => Boolean): this.type = set("disabledDate", js.Any.fromFunction1(value))
      
      inline def disabledTime(value: (/* date */ EventValue[DateType], /* type */ RangeType) => DisabledTimes): this.type = set("disabledTime", js.Any.fromFunction2(value))
      
      inline def dropdownAlign(value: AlignType): this.type = set("dropdownAlign", value.asInstanceOf[js.Any])
      
      inline def dropdownClassName(value: String): this.type = set("dropdownClassName", value.asInstanceOf[js.Any])
      
      inline def format(value: String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])): this.type = set("format", value.asInstanceOf[js.Any])
      
      inline def formatFunction1(value: DateType => String): this.type = set("format", js.Any.fromFunction1(value))
      
      inline def formatVarargs(value: (String | CustomFormat[DateType])*): this.type = set("format", js.Array(value*))
      
      inline def getPopupContainer(value: /* node */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
      
      inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      
      inline def inputReadOnly(value: Boolean): this.type = set("inputReadOnly", value.asInstanceOf[js.Any])
      
      inline def inputRender(value: /* props */ InputHTMLAttributes[HTMLInputElement] => Node): this.type = set("inputRender", js.Any.fromFunction1(value))
      
      inline def mode(value: js.Tuple2[PanelMode, PanelMode]): this.type = set("mode", value.asInstanceOf[js.Any])
      
      inline def monthCellRender(value: (DateType, /* locale */ Locale) => Node): this.type = set("monthCellRender", js.Any.fromFunction2(value))
      
      inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
      
      inline def nextIcon(value: VdomNode): this.type = set("nextIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def nextIconNull: this.type = set("nextIcon", null)
      
      inline def nextIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("nextIcon", js.Array(value*))
      
      inline def nextIconVdomElement(value: VdomElement): this.type = set("nextIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def onBlur(value: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCalendarChange(
        value: (/* values */ RangeValue[DateType], /* formatString */ js.Tuple2[String, String], /* info */ RangeInfo) => Callback
      ): this.type = set("onCalendarChange", js.Any.fromFunction3((t0: /* values */ RangeValue[DateType], t1: /* formatString */ js.Tuple2[String, String], t2: /* info */ RangeInfo) => (value(t0, t1, t2)).runNow()))
      
      inline def onChange(
        value: (/* values */ RangeValue[DateType], /* formatString */ js.Tuple2[String, String]) => Callback
      ): this.type = set("onChange", js.Any.fromFunction2((t0: /* values */ RangeValue[DateType], t1: /* formatString */ js.Tuple2[String, String]) => (value(t0, t1)).runNow()))
      
      inline def onClick(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onContextMenu(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onFocus(value: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onKeyDown(
        value: (/* event */ ReactKeyboardEventFrom[HTMLInputElement], /* preventDefault */ js.Function0[Unit]) => Callback
      ): this.type = set("onKeyDown", js.Any.fromFunction2((t0: /* event */ ReactKeyboardEventFrom[HTMLInputElement], t1: /* preventDefault */ js.Function0[Unit]) => (value(t0, t1)).runNow()))
      
      inline def onMouseDown(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseEnter(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseLeave(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseUp(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onOk(value: /* dates */ RangeValue[DateType] => Callback): this.type = set("onOk", js.Any.fromFunction1((t0: /* dates */ RangeValue[DateType]) => value(t0).runNow()))
      
      inline def onOpenChange(value: /* open */ Boolean => Callback): this.type = set("onOpenChange", js.Any.fromFunction1((t0: /* open */ Boolean) => value(t0).runNow()))
      
      inline def onPanelChange(
        value: (/* values */ RangeValue[DateType], /* modes */ js.Tuple2[PanelMode, PanelMode]) => Callback
      ): this.type = set("onPanelChange", js.Any.fromFunction2((t0: /* values */ RangeValue[DateType], t1: /* modes */ js.Tuple2[PanelMode, PanelMode]) => (value(t0, t1)).runNow()))
      
      inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
      
      inline def panelRender(value: /* originPanel */ Node => Node): this.type = set("panelRender", js.Any.fromFunction1(value))
      
      inline def pickerRef(value: MutableRefObject[PickerRefConfig]): this.type = set("pickerRef", value.asInstanceOf[js.Any])
      
      inline def placeholder(value: js.Tuple2[String, String]): this.type = set("placeholder", value.asInstanceOf[js.Any])
      
      inline def popupStyle(value: CSSProperties): this.type = set("popupStyle", value.asInstanceOf[js.Any])
      
      inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      inline def prevIcon(value: VdomNode): this.type = set("prevIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def prevIconNull: this.type = set("prevIcon", null)
      
      inline def prevIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("prevIcon", js.Array(value*))
      
      inline def prevIconVdomElement(value: VdomElement): this.type = set("prevIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def ranges(
        value: Record[
              String, 
              (Exclude[RangeValue[DateType], Null]) | (js.Function0[Exclude[RangeValue[DateType], Null]])
            ]
      ): this.type = set("ranges", value.asInstanceOf[js.Any])
      
      inline def renderExtraFooter(value: /* mode */ PanelMode => Node): this.type = set("renderExtraFooter", js.Any.fromFunction1(value))
      
      inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
      
      inline def separator(value: VdomNode): this.type = set("separator", value.rawNode.asInstanceOf[js.Any])
      
      inline def separatorNull: this.type = set("separator", null)
      
      inline def separatorVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("separator", js.Array(value*))
      
      inline def separatorVdomElement(value: VdomElement): this.type = set("separator", value.rawElement.asInstanceOf[js.Any])
      
      inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      inline def suffixIcon(value: VdomNode): this.type = set("suffixIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def suffixIconNull: this.type = set("suffixIcon", null)
      
      inline def suffixIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("suffixIcon", js.Array(value*))
      
      inline def suffixIconVdomElement(value: VdomElement): this.type = set("suffixIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def superNextIcon(value: VdomNode): this.type = set("superNextIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def superNextIconNull: this.type = set("superNextIcon", null)
      
      inline def superNextIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("superNextIcon", js.Array(value*))
      
      inline def superNextIconVdomElement(value: VdomElement): this.type = set("superNextIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def superPrevIcon(value: VdomNode): this.type = set("superPrevIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def superPrevIconNull: this.type = set("superPrevIcon", null)
      
      inline def superPrevIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("superPrevIcon", js.Array(value*))
      
      inline def superPrevIconVdomElement(value: VdomElement): this.type = set("superPrevIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
      
      inline def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
      
      inline def value(value: RangeValue[DateType]): this.type = set("value", value.asInstanceOf[js.Any])
      
      inline def valueNull: this.type = set("value", null)
    }
    
    def withProps[DateType](p: typingsJapgolly.rcPicker.esRangePickerMod.RangePickerBaseProps[DateType]): Builder[DateType] = new Builder[DateType](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object RangePickerDateProps {
    
    inline def apply[DateType](generateConfig: GenerateConfig[DateType], locale: Locale): Builder[DateType] = {
      val __props = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
      new Builder[DateType](js.Array(this.component, __props.asInstanceOf[typingsJapgolly.rcPicker.esRangePickerMod.RangePickerDateProps[DateType]]))
    }
    
    @JSImport("rc-picker", "RangePicker")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder[DateType] (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[typingsJapgolly.rcPicker.mod.RangePicker[DateType]] {
      
      inline def activePickerIndex(value: `0` | `1`): this.type = set("activePickerIndex", value.asInstanceOf[js.Any])
      
      inline def allowClear(value: Boolean): this.type = set("allowClear", value.asInstanceOf[js.Any])
      
      inline def allowEmpty(value: js.Tuple2[Boolean, Boolean]): this.type = set("allowEmpty", value.asInstanceOf[js.Any])
      
      inline def `aria-activedescendant`(value: String): this.type = set("aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `aria-atomic`(value: Booleanish): this.type = set("aria-atomic", value.asInstanceOf[js.Any])
      
      inline def `aria-autocomplete`(value: none | `inline` | list | both): this.type = set("aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `aria-busy`(value: Booleanish): this.type = set("aria-busy", value.asInstanceOf[js.Any])
      
      inline def `aria-checked`(value: Boolean | mixed): this.type = set("aria-checked", value.asInstanceOf[js.Any])
      
      inline def `aria-colcount`(value: Double): this.type = set("aria-colcount", value.asInstanceOf[js.Any])
      
      inline def `aria-colindex`(value: Double): this.type = set("aria-colindex", value.asInstanceOf[js.Any])
      
      inline def `aria-colspan`(value: Double): this.type = set("aria-colspan", value.asInstanceOf[js.Any])
      
      inline def `aria-controls`(value: String): this.type = set("aria-controls", value.asInstanceOf[js.Any])
      
      inline def `aria-current`(value: Boolean | page | step | location | date | time): this.type = set("aria-current", value.asInstanceOf[js.Any])
      
      inline def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `aria-details`(value: String): this.type = set("aria-details", value.asInstanceOf[js.Any])
      
      inline def `aria-disabled`(value: Booleanish): this.type = set("aria-disabled", value.asInstanceOf[js.Any])
      
      inline def `aria-dropeffect`(value: none | copy | execute | link | move | popup): this.type = set("aria-dropeffect", value.asInstanceOf[js.Any])
      
      inline def `aria-errormessage`(value: String): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `aria-expanded`(value: Booleanish): this.type = set("aria-expanded", value.asInstanceOf[js.Any])
      
      inline def `aria-flowto`(value: String): this.type = set("aria-flowto", value.asInstanceOf[js.Any])
      
      inline def `aria-grabbed`(value: Booleanish): this.type = set("aria-grabbed", value.asInstanceOf[js.Any])
      
      inline def `aria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): this.type = set("aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `aria-hidden`(value: Booleanish): this.type = set("aria-hidden", value.asInstanceOf[js.Any])
      
      inline def `aria-invalid`(value: Boolean | grammar | spelling): this.type = set("aria-invalid", value.asInstanceOf[js.Any])
      
      inline def `aria-keyshortcuts`(value: String): this.type = set("aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
      
      inline def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `aria-level`(value: Double): this.type = set("aria-level", value.asInstanceOf[js.Any])
      
      inline def `aria-live`(value: off | assertive | polite): this.type = set("aria-live", value.asInstanceOf[js.Any])
      
      inline def `aria-modal`(value: Booleanish): this.type = set("aria-modal", value.asInstanceOf[js.Any])
      
      inline def `aria-multiline`(value: Booleanish): this.type = set("aria-multiline", value.asInstanceOf[js.Any])
      
      inline def `aria-multiselectable`(value: Booleanish): this.type = set("aria-multiselectable", value.asInstanceOf[js.Any])
      
      inline def `aria-orientation`(value: horizontal | vertical): this.type = set("aria-orientation", value.asInstanceOf[js.Any])
      
      inline def `aria-owns`(value: String): this.type = set("aria-owns", value.asInstanceOf[js.Any])
      
      inline def `aria-placeholder`(value: String): this.type = set("aria-placeholder", value.asInstanceOf[js.Any])
      
      inline def `aria-posinset`(value: Double): this.type = set("aria-posinset", value.asInstanceOf[js.Any])
      
      inline def `aria-pressed`(value: Boolean | mixed): this.type = set("aria-pressed", value.asInstanceOf[js.Any])
      
      inline def `aria-readonly`(value: Booleanish): this.type = set("aria-readonly", value.asInstanceOf[js.Any])
      
      inline def `aria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): this.type = set("aria-relevant", value.asInstanceOf[js.Any])
      
      inline def `aria-required`(value: Booleanish): this.type = set("aria-required", value.asInstanceOf[js.Any])
      
      inline def `aria-roledescription`(value: String): this.type = set("aria-roledescription", value.asInstanceOf[js.Any])
      
      inline def `aria-rowcount`(value: Double): this.type = set("aria-rowcount", value.asInstanceOf[js.Any])
      
      inline def `aria-rowindex`(value: Double): this.type = set("aria-rowindex", value.asInstanceOf[js.Any])
      
      inline def `aria-rowspan`(value: Double): this.type = set("aria-rowspan", value.asInstanceOf[js.Any])
      
      inline def `aria-selected`(value: Booleanish): this.type = set("aria-selected", value.asInstanceOf[js.Any])
      
      inline def `aria-setsize`(value: Double): this.type = set("aria-setsize", value.asInstanceOf[js.Any])
      
      inline def `aria-sort`(value: none | ascending | descending | other): this.type = set("aria-sort", value.asInstanceOf[js.Any])
      
      inline def `aria-valuemax`(value: Double): this.type = set("aria-valuemax", value.asInstanceOf[js.Any])
      
      inline def `aria-valuemin`(value: Double): this.type = set("aria-valuemin", value.asInstanceOf[js.Any])
      
      inline def `aria-valuenow`(value: Double): this.type = set("aria-valuenow", value.asInstanceOf[js.Any])
      
      inline def `aria-valuetext`(value: String): this.type = set("aria-valuetext", value.asInstanceOf[js.Any])
      
      inline def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
      
      inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def clearIcon(value: VdomNode): this.type = set("clearIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def clearIconNull: this.type = set("clearIcon", null)
      
      inline def clearIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("clearIcon", js.Array(value*))
      
      inline def clearIconVdomElement(value: VdomElement): this.type = set("clearIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def components(value: Components): this.type = set("components", value.asInstanceOf[js.Any])
      
      inline def dateRender(value: (DateType, DateType, /* info */ RangeInfo) => Node): this.type = set("dateRender", js.Any.fromFunction3(value))
      
      inline def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
      
      inline def defaultPickerValue(value: js.Tuple2[DateType, DateType]): this.type = set("defaultPickerValue", value.asInstanceOf[js.Any])
      
      inline def defaultValue(value: RangeValue[DateType]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      inline def defaultValueNull: this.type = set("defaultValue", null)
      
      inline def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
      
      inline def disabled(value: Boolean | (js.Tuple2[Boolean, Boolean])): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      inline def disabledDate(value: DateType => Boolean): this.type = set("disabledDate", js.Any.fromFunction1(value))
      
      inline def disabledTime(value: (/* date */ EventValue[DateType], /* type */ RangeType) => DisabledTimes): this.type = set("disabledTime", js.Any.fromFunction2(value))
      
      inline def dropdownAlign(value: AlignType): this.type = set("dropdownAlign", value.asInstanceOf[js.Any])
      
      inline def dropdownClassName(value: String): this.type = set("dropdownClassName", value.asInstanceOf[js.Any])
      
      inline def format(value: String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])): this.type = set("format", value.asInstanceOf[js.Any])
      
      inline def formatFunction1(value: DateType => String): this.type = set("format", js.Any.fromFunction1(value))
      
      inline def formatVarargs(value: (String | CustomFormat[DateType])*): this.type = set("format", js.Array(value*))
      
      inline def getPopupContainer(value: /* node */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
      
      inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      
      inline def inputReadOnly(value: Boolean): this.type = set("inputReadOnly", value.asInstanceOf[js.Any])
      
      inline def inputRender(value: /* props */ InputHTMLAttributes[HTMLInputElement] => Node): this.type = set("inputRender", js.Any.fromFunction1(value))
      
      inline def mode(value: js.Tuple2[PanelMode, PanelMode]): this.type = set("mode", value.asInstanceOf[js.Any])
      
      inline def monthCellRender(value: (DateType, /* locale */ Locale) => Node): this.type = set("monthCellRender", js.Any.fromFunction2(value))
      
      inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
      
      inline def nextIcon(value: VdomNode): this.type = set("nextIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def nextIconNull: this.type = set("nextIcon", null)
      
      inline def nextIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("nextIcon", js.Array(value*))
      
      inline def nextIconVdomElement(value: VdomElement): this.type = set("nextIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def onBlur(value: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCalendarChange(
        value: (/* values */ RangeValue[DateType], /* formatString */ js.Tuple2[String, String], /* info */ RangeInfo) => Callback
      ): this.type = set("onCalendarChange", js.Any.fromFunction3((t0: /* values */ RangeValue[DateType], t1: /* formatString */ js.Tuple2[String, String], t2: /* info */ RangeInfo) => (value(t0, t1, t2)).runNow()))
      
      inline def onChange(
        value: (/* values */ RangeValue[DateType], /* formatString */ js.Tuple2[String, String]) => Callback
      ): this.type = set("onChange", js.Any.fromFunction2((t0: /* values */ RangeValue[DateType], t1: /* formatString */ js.Tuple2[String, String]) => (value(t0, t1)).runNow()))
      
      inline def onClick(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onContextMenu(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onFocus(value: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onKeyDown(
        value: (/* event */ ReactKeyboardEventFrom[HTMLInputElement], /* preventDefault */ js.Function0[Unit]) => Callback
      ): this.type = set("onKeyDown", js.Any.fromFunction2((t0: /* event */ ReactKeyboardEventFrom[HTMLInputElement], t1: /* preventDefault */ js.Function0[Unit]) => (value(t0, t1)).runNow()))
      
      inline def onMouseDown(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseEnter(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseLeave(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseUp(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onOk(value: /* dates */ RangeValue[DateType] => Callback): this.type = set("onOk", js.Any.fromFunction1((t0: /* dates */ RangeValue[DateType]) => value(t0).runNow()))
      
      inline def onOpenChange(value: /* open */ Boolean => Callback): this.type = set("onOpenChange", js.Any.fromFunction1((t0: /* open */ Boolean) => value(t0).runNow()))
      
      inline def onPanelChange(
        value: (/* values */ RangeValue[DateType], /* modes */ js.Tuple2[PanelMode, PanelMode]) => Callback
      ): this.type = set("onPanelChange", js.Any.fromFunction2((t0: /* values */ RangeValue[DateType], t1: /* modes */ js.Tuple2[PanelMode, PanelMode]) => (value(t0, t1)).runNow()))
      
      inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
      
      inline def panelRender(value: /* originPanel */ Node => Node): this.type = set("panelRender", js.Any.fromFunction1(value))
      
      inline def picker(value: date): this.type = set("picker", value.asInstanceOf[js.Any])
      
      inline def pickerRef(value: MutableRefObject[PickerRefConfig]): this.type = set("pickerRef", value.asInstanceOf[js.Any])
      
      inline def placeholder(value: js.Tuple2[String, String]): this.type = set("placeholder", value.asInstanceOf[js.Any])
      
      inline def popupStyle(value: CSSProperties): this.type = set("popupStyle", value.asInstanceOf[js.Any])
      
      inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      inline def prevIcon(value: VdomNode): this.type = set("prevIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def prevIconNull: this.type = set("prevIcon", null)
      
      inline def prevIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("prevIcon", js.Array(value*))
      
      inline def prevIconVdomElement(value: VdomElement): this.type = set("prevIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def ranges(
        value: Record[
              String, 
              (Exclude[RangeValue[DateType], Null]) | (js.Function0[Exclude[RangeValue[DateType], Null]])
            ]
      ): this.type = set("ranges", value.asInstanceOf[js.Any])
      
      inline def renderExtraFooter(value: /* mode */ PanelMode => Node): this.type = set("renderExtraFooter", js.Any.fromFunction1(value))
      
      inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
      
      inline def separator(value: VdomNode): this.type = set("separator", value.rawNode.asInstanceOf[js.Any])
      
      inline def separatorNull: this.type = set("separator", null)
      
      inline def separatorVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("separator", js.Array(value*))
      
      inline def separatorVdomElement(value: VdomElement): this.type = set("separator", value.rawElement.asInstanceOf[js.Any])
      
      inline def showNow(value: Boolean): this.type = set("showNow", value.asInstanceOf[js.Any])
      
      inline def showTime(value: Boolean | RangeShowTimeObject[DateType]): this.type = set("showTime", value.asInstanceOf[js.Any])
      
      inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      inline def suffixIcon(value: VdomNode): this.type = set("suffixIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def suffixIconNull: this.type = set("suffixIcon", null)
      
      inline def suffixIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("suffixIcon", js.Array(value*))
      
      inline def suffixIconVdomElement(value: VdomElement): this.type = set("suffixIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def superNextIcon(value: VdomNode): this.type = set("superNextIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def superNextIconNull: this.type = set("superNextIcon", null)
      
      inline def superNextIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("superNextIcon", js.Array(value*))
      
      inline def superNextIconVdomElement(value: VdomElement): this.type = set("superNextIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def superPrevIcon(value: VdomNode): this.type = set("superPrevIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def superPrevIconNull: this.type = set("superPrevIcon", null)
      
      inline def superPrevIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("superPrevIcon", js.Array(value*))
      
      inline def superPrevIconVdomElement(value: VdomElement): this.type = set("superPrevIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
      
      inline def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
      
      inline def value(value: RangeValue[DateType]): this.type = set("value", value.asInstanceOf[js.Any])
      
      inline def valueNull: this.type = set("value", null)
    }
    
    def withProps[DateType](p: typingsJapgolly.rcPicker.esRangePickerMod.RangePickerDateProps[DateType]): Builder[DateType] = new Builder[DateType](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object RangePickerTimeProps {
    
    inline def apply[DateType](generateConfig: GenerateConfig[DateType], locale: Locale): Builder[DateType] = {
      val __props = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = "time")
      new Builder[DateType](js.Array(this.component, __props.asInstanceOf[typingsJapgolly.rcPicker.esRangePickerMod.RangePickerTimeProps[DateType]]))
    }
    
    @JSImport("rc-picker", "RangePicker")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder[DateType] (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[typingsJapgolly.rcPicker.mod.RangePicker[DateType]] {
      
      inline def activePickerIndex(value: `0` | `1`): this.type = set("activePickerIndex", value.asInstanceOf[js.Any])
      
      inline def allowClear(value: Boolean): this.type = set("allowClear", value.asInstanceOf[js.Any])
      
      inline def allowEmpty(value: js.Tuple2[Boolean, Boolean]): this.type = set("allowEmpty", value.asInstanceOf[js.Any])
      
      inline def `aria-activedescendant`(value: String): this.type = set("aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `aria-atomic`(value: Booleanish): this.type = set("aria-atomic", value.asInstanceOf[js.Any])
      
      inline def `aria-autocomplete`(value: none | `inline` | list | both): this.type = set("aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `aria-busy`(value: Booleanish): this.type = set("aria-busy", value.asInstanceOf[js.Any])
      
      inline def `aria-checked`(value: Boolean | mixed): this.type = set("aria-checked", value.asInstanceOf[js.Any])
      
      inline def `aria-colcount`(value: Double): this.type = set("aria-colcount", value.asInstanceOf[js.Any])
      
      inline def `aria-colindex`(value: Double): this.type = set("aria-colindex", value.asInstanceOf[js.Any])
      
      inline def `aria-colspan`(value: Double): this.type = set("aria-colspan", value.asInstanceOf[js.Any])
      
      inline def `aria-controls`(value: String): this.type = set("aria-controls", value.asInstanceOf[js.Any])
      
      inline def `aria-current`(value: Boolean | page | step | location | date | time): this.type = set("aria-current", value.asInstanceOf[js.Any])
      
      inline def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `aria-details`(value: String): this.type = set("aria-details", value.asInstanceOf[js.Any])
      
      inline def `aria-disabled`(value: Booleanish): this.type = set("aria-disabled", value.asInstanceOf[js.Any])
      
      inline def `aria-dropeffect`(value: none | copy | execute | link | move | popup): this.type = set("aria-dropeffect", value.asInstanceOf[js.Any])
      
      inline def `aria-errormessage`(value: String): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `aria-expanded`(value: Booleanish): this.type = set("aria-expanded", value.asInstanceOf[js.Any])
      
      inline def `aria-flowto`(value: String): this.type = set("aria-flowto", value.asInstanceOf[js.Any])
      
      inline def `aria-grabbed`(value: Booleanish): this.type = set("aria-grabbed", value.asInstanceOf[js.Any])
      
      inline def `aria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): this.type = set("aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `aria-hidden`(value: Booleanish): this.type = set("aria-hidden", value.asInstanceOf[js.Any])
      
      inline def `aria-invalid`(value: Boolean | grammar | spelling): this.type = set("aria-invalid", value.asInstanceOf[js.Any])
      
      inline def `aria-keyshortcuts`(value: String): this.type = set("aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
      
      inline def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `aria-level`(value: Double): this.type = set("aria-level", value.asInstanceOf[js.Any])
      
      inline def `aria-live`(value: off | assertive | polite): this.type = set("aria-live", value.asInstanceOf[js.Any])
      
      inline def `aria-modal`(value: Booleanish): this.type = set("aria-modal", value.asInstanceOf[js.Any])
      
      inline def `aria-multiline`(value: Booleanish): this.type = set("aria-multiline", value.asInstanceOf[js.Any])
      
      inline def `aria-multiselectable`(value: Booleanish): this.type = set("aria-multiselectable", value.asInstanceOf[js.Any])
      
      inline def `aria-orientation`(value: horizontal | vertical): this.type = set("aria-orientation", value.asInstanceOf[js.Any])
      
      inline def `aria-owns`(value: String): this.type = set("aria-owns", value.asInstanceOf[js.Any])
      
      inline def `aria-placeholder`(value: String): this.type = set("aria-placeholder", value.asInstanceOf[js.Any])
      
      inline def `aria-posinset`(value: Double): this.type = set("aria-posinset", value.asInstanceOf[js.Any])
      
      inline def `aria-pressed`(value: Boolean | mixed): this.type = set("aria-pressed", value.asInstanceOf[js.Any])
      
      inline def `aria-readonly`(value: Booleanish): this.type = set("aria-readonly", value.asInstanceOf[js.Any])
      
      inline def `aria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): this.type = set("aria-relevant", value.asInstanceOf[js.Any])
      
      inline def `aria-required`(value: Booleanish): this.type = set("aria-required", value.asInstanceOf[js.Any])
      
      inline def `aria-roledescription`(value: String): this.type = set("aria-roledescription", value.asInstanceOf[js.Any])
      
      inline def `aria-rowcount`(value: Double): this.type = set("aria-rowcount", value.asInstanceOf[js.Any])
      
      inline def `aria-rowindex`(value: Double): this.type = set("aria-rowindex", value.asInstanceOf[js.Any])
      
      inline def `aria-rowspan`(value: Double): this.type = set("aria-rowspan", value.asInstanceOf[js.Any])
      
      inline def `aria-selected`(value: Booleanish): this.type = set("aria-selected", value.asInstanceOf[js.Any])
      
      inline def `aria-setsize`(value: Double): this.type = set("aria-setsize", value.asInstanceOf[js.Any])
      
      inline def `aria-sort`(value: none | ascending | descending | other): this.type = set("aria-sort", value.asInstanceOf[js.Any])
      
      inline def `aria-valuemax`(value: Double): this.type = set("aria-valuemax", value.asInstanceOf[js.Any])
      
      inline def `aria-valuemin`(value: Double): this.type = set("aria-valuemin", value.asInstanceOf[js.Any])
      
      inline def `aria-valuenow`(value: Double): this.type = set("aria-valuenow", value.asInstanceOf[js.Any])
      
      inline def `aria-valuetext`(value: String): this.type = set("aria-valuetext", value.asInstanceOf[js.Any])
      
      inline def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
      
      inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def clearIcon(value: VdomNode): this.type = set("clearIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def clearIconNull: this.type = set("clearIcon", null)
      
      inline def clearIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("clearIcon", js.Array(value*))
      
      inline def clearIconVdomElement(value: VdomElement): this.type = set("clearIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def components(value: Components): this.type = set("components", value.asInstanceOf[js.Any])
      
      inline def dateRender(value: (DateType, DateType, /* info */ RangeInfo) => Node): this.type = set("dateRender", js.Any.fromFunction3(value))
      
      inline def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
      
      inline def defaultOpenValue(value: DateType): this.type = set("defaultOpenValue", value.asInstanceOf[js.Any])
      
      inline def defaultPickerValue(value: js.Tuple2[DateType, DateType]): this.type = set("defaultPickerValue", value.asInstanceOf[js.Any])
      
      inline def defaultValue(value: RangeValue[DateType]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      inline def defaultValueNull: this.type = set("defaultValue", null)
      
      inline def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
      
      inline def disabled(value: Boolean | (js.Tuple2[Boolean, Boolean])): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      inline def disabledDate(value: DateType => Boolean): this.type = set("disabledDate", js.Any.fromFunction1(value))
      
      inline def disabledHours(value: CallbackTo[js.Array[Double]]): this.type = set("disabledHours", value.toJsFn)
      
      inline def disabledMinutes(value: /* hour */ Double => js.Array[Double]): this.type = set("disabledMinutes", js.Any.fromFunction1(value))
      
      inline def disabledSeconds(value: (/* hour */ Double, /* minute */ Double) => js.Array[Double]): this.type = set("disabledSeconds", js.Any.fromFunction2(value))
      
      inline def disabledTime(value: (/* date */ EventValue[DateType], /* type */ RangeType) => DisabledTimes): this.type = set("disabledTime", js.Any.fromFunction2(value))
      
      inline def dropdownAlign(value: AlignType): this.type = set("dropdownAlign", value.asInstanceOf[js.Any])
      
      inline def dropdownClassName(value: String): this.type = set("dropdownClassName", value.asInstanceOf[js.Any])
      
      inline def format(value: String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])): this.type = set("format", value.asInstanceOf[js.Any])
      
      inline def formatFunction1(value: DateType => String): this.type = set("format", js.Any.fromFunction1(value))
      
      inline def formatVarargs(value: (String | CustomFormat[DateType])*): this.type = set("format", js.Array(value*))
      
      inline def getPopupContainer(value: /* node */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
      
      inline def hideDisabledOptions(value: Boolean): this.type = set("hideDisabledOptions", value.asInstanceOf[js.Any])
      
      inline def hourStep(value: Double): this.type = set("hourStep", value.asInstanceOf[js.Any])
      
      inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      
      inline def inputReadOnly(value: Boolean): this.type = set("inputReadOnly", value.asInstanceOf[js.Any])
      
      inline def inputRender(value: /* props */ InputHTMLAttributes[HTMLInputElement] => Node): this.type = set("inputRender", js.Any.fromFunction1(value))
      
      inline def minuteStep(value: Double): this.type = set("minuteStep", value.asInstanceOf[js.Any])
      
      inline def mode(value: js.Tuple2[PanelMode, PanelMode]): this.type = set("mode", value.asInstanceOf[js.Any])
      
      inline def monthCellRender(value: (DateType, /* locale */ Locale) => Node): this.type = set("monthCellRender", js.Any.fromFunction2(value))
      
      inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
      
      inline def nextIcon(value: VdomNode): this.type = set("nextIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def nextIconNull: this.type = set("nextIcon", null)
      
      inline def nextIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("nextIcon", js.Array(value*))
      
      inline def nextIconVdomElement(value: VdomElement): this.type = set("nextIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def onBlur(value: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCalendarChange(
        value: (/* values */ RangeValue[DateType], /* formatString */ js.Tuple2[String, String], /* info */ RangeInfo) => Callback
      ): this.type = set("onCalendarChange", js.Any.fromFunction3((t0: /* values */ RangeValue[DateType], t1: /* formatString */ js.Tuple2[String, String], t2: /* info */ RangeInfo) => (value(t0, t1, t2)).runNow()))
      
      inline def onChange(
        value: (/* values */ RangeValue[DateType], /* formatString */ js.Tuple2[String, String]) => Callback
      ): this.type = set("onChange", js.Any.fromFunction2((t0: /* values */ RangeValue[DateType], t1: /* formatString */ js.Tuple2[String, String]) => (value(t0, t1)).runNow()))
      
      inline def onClick(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onContextMenu(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onFocus(value: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onKeyDown(
        value: (/* event */ ReactKeyboardEventFrom[HTMLInputElement], /* preventDefault */ js.Function0[Unit]) => Callback
      ): this.type = set("onKeyDown", js.Any.fromFunction2((t0: /* event */ ReactKeyboardEventFrom[HTMLInputElement], t1: /* preventDefault */ js.Function0[Unit]) => (value(t0, t1)).runNow()))
      
      inline def onMouseDown(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseEnter(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseLeave(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseUp(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onOk(value: /* dates */ RangeValue[DateType] => Callback): this.type = set("onOk", js.Any.fromFunction1((t0: /* dates */ RangeValue[DateType]) => value(t0).runNow()))
      
      inline def onOpenChange(value: /* open */ Boolean => Callback): this.type = set("onOpenChange", js.Any.fromFunction1((t0: /* open */ Boolean) => value(t0).runNow()))
      
      inline def onPanelChange(
        value: (/* values */ RangeValue[DateType], /* modes */ js.Tuple2[PanelMode, PanelMode]) => Callback
      ): this.type = set("onPanelChange", js.Any.fromFunction2((t0: /* values */ RangeValue[DateType], t1: /* modes */ js.Tuple2[PanelMode, PanelMode]) => (value(t0, t1)).runNow()))
      
      inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
      
      inline def order(value: Boolean): this.type = set("order", value.asInstanceOf[js.Any])
      
      inline def panelRender(value: /* originPanel */ Node => Node): this.type = set("panelRender", js.Any.fromFunction1(value))
      
      inline def pickerRef(value: MutableRefObject[PickerRefConfig]): this.type = set("pickerRef", value.asInstanceOf[js.Any])
      
      inline def placeholder(value: js.Tuple2[String, String]): this.type = set("placeholder", value.asInstanceOf[js.Any])
      
      inline def popupStyle(value: CSSProperties): this.type = set("popupStyle", value.asInstanceOf[js.Any])
      
      inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      inline def prevIcon(value: VdomNode): this.type = set("prevIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def prevIconNull: this.type = set("prevIcon", null)
      
      inline def prevIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("prevIcon", js.Array(value*))
      
      inline def prevIconVdomElement(value: VdomElement): this.type = set("prevIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def ranges(
        value: Record[
              String, 
              (Exclude[RangeValue[DateType], Null]) | (js.Function0[Exclude[RangeValue[DateType], Null]])
            ]
      ): this.type = set("ranges", value.asInstanceOf[js.Any])
      
      inline def renderExtraFooter(value: /* mode */ PanelMode => Node): this.type = set("renderExtraFooter", js.Any.fromFunction1(value))
      
      inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
      
      inline def secondStep(value: Double): this.type = set("secondStep", value.asInstanceOf[js.Any])
      
      inline def separator(value: VdomNode): this.type = set("separator", value.rawNode.asInstanceOf[js.Any])
      
      inline def separatorNull: this.type = set("separator", null)
      
      inline def separatorVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("separator", js.Array(value*))
      
      inline def separatorVdomElement(value: VdomElement): this.type = set("separator", value.rawElement.asInstanceOf[js.Any])
      
      inline def showHour(value: Boolean): this.type = set("showHour", value.asInstanceOf[js.Any])
      
      inline def showMinute(value: Boolean): this.type = set("showMinute", value.asInstanceOf[js.Any])
      
      inline def showNow(value: Boolean): this.type = set("showNow", value.asInstanceOf[js.Any])
      
      inline def showSecond(value: Boolean): this.type = set("showSecond", value.asInstanceOf[js.Any])
      
      inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      inline def suffixIcon(value: VdomNode): this.type = set("suffixIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def suffixIconNull: this.type = set("suffixIcon", null)
      
      inline def suffixIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("suffixIcon", js.Array(value*))
      
      inline def suffixIconVdomElement(value: VdomElement): this.type = set("suffixIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def superNextIcon(value: VdomNode): this.type = set("superNextIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def superNextIconNull: this.type = set("superNextIcon", null)
      
      inline def superNextIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("superNextIcon", js.Array(value*))
      
      inline def superNextIconVdomElement(value: VdomElement): this.type = set("superNextIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def superPrevIcon(value: VdomNode): this.type = set("superPrevIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def superPrevIconNull: this.type = set("superPrevIcon", null)
      
      inline def superPrevIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("superPrevIcon", js.Array(value*))
      
      inline def superPrevIconVdomElement(value: VdomElement): this.type = set("superPrevIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
      
      inline def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
      
      inline def use12Hours(value: Boolean): this.type = set("use12Hours", value.asInstanceOf[js.Any])
      
      inline def value(value: RangeValue[DateType]): this.type = set("value", value.asInstanceOf[js.Any])
      
      inline def valueNull: this.type = set("value", null)
    }
    
    def withProps[DateType](p: typingsJapgolly.rcPicker.esRangePickerMod.RangePickerTimeProps[DateType]): Builder[DateType] = new Builder[DateType](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
