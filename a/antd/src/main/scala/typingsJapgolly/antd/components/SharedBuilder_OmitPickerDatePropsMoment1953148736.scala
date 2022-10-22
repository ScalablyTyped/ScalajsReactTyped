package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.antdStrings.`additions removals`
import typingsJapgolly.antd.antdStrings.`additions text`
import typingsJapgolly.antd.antdStrings.`inline`
import typingsJapgolly.antd.antdStrings.`removals additions`
import typingsJapgolly.antd.antdStrings.`removals text`
import typingsJapgolly.antd.antdStrings.`text additions`
import typingsJapgolly.antd.antdStrings.`text removals`
import typingsJapgolly.antd.antdStrings.additions
import typingsJapgolly.antd.antdStrings.all
import typingsJapgolly.antd.antdStrings.ascending
import typingsJapgolly.antd.antdStrings.assertive
import typingsJapgolly.antd.antdStrings.both
import typingsJapgolly.antd.antdStrings.copy
import typingsJapgolly.antd.antdStrings.date
import typingsJapgolly.antd.antdStrings.descending
import typingsJapgolly.antd.antdStrings.dialog
import typingsJapgolly.antd.antdStrings.execute
import typingsJapgolly.antd.antdStrings.grammar
import typingsJapgolly.antd.antdStrings.grid
import typingsJapgolly.antd.antdStrings.horizontal
import typingsJapgolly.antd.antdStrings.link
import typingsJapgolly.antd.antdStrings.list
import typingsJapgolly.antd.antdStrings.listbox
import typingsJapgolly.antd.antdStrings.location
import typingsJapgolly.antd.antdStrings.ltr
import typingsJapgolly.antd.antdStrings.menu
import typingsJapgolly.antd.antdStrings.mixed
import typingsJapgolly.antd.antdStrings.move
import typingsJapgolly.antd.antdStrings.none
import typingsJapgolly.antd.antdStrings.off
import typingsJapgolly.antd.antdStrings.other
import typingsJapgolly.antd.antdStrings.page
import typingsJapgolly.antd.antdStrings.polite
import typingsJapgolly.antd.antdStrings.popup
import typingsJapgolly.antd.antdStrings.removals
import typingsJapgolly.antd.antdStrings.rtl
import typingsJapgolly.antd.antdStrings.spelling
import typingsJapgolly.antd.antdStrings.step
import typingsJapgolly.antd.antdStrings.text_
import typingsJapgolly.antd.antdStrings.time
import typingsJapgolly.antd.antdStrings.tree
import typingsJapgolly.antd.antdStrings.vertical
import typingsJapgolly.antd.libConfigProviderSizeContextMod.SizeType
import typingsJapgolly.antd.libDatePickerGeneratePickerMod.DataPickerPlacement
import typingsJapgolly.antd.libDatePickerGeneratePickerMod.PickerLocale
import typingsJapgolly.antd.libUtilStatusUtilsMod.InputStatus
import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.rcPicker.esInterfaceMod.CustomFormat
import typingsJapgolly.rcPicker.esInterfaceMod.DisabledTimes
import typingsJapgolly.rcPicker.esInterfaceMod.Locale
import typingsJapgolly.rcPicker.esInterfaceMod.PanelMode
import typingsJapgolly.rcPicker.esPanelsTimePanelMod.SharedTimeProps
import typingsJapgolly.rcPicker.esPickerMod.PickerRefConfig
import typingsJapgolly.rcTrigger.esInterfaceMod.AlignType
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.InputHTMLAttributes
import typingsJapgolly.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_OmitPickerDatePropsMoment1953148736[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def allowClear(value: Boolean): this.type = set("allowClear", value.asInstanceOf[js.Any])
  
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
    value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text_ | (`text additions`) | (`text removals`)
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
  
  inline def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def clearIcon(value: VdomNode): this.type = set("clearIcon", value.rawNode.asInstanceOf[js.Any])
  
  inline def clearIconNull: this.type = set("clearIcon", null)
  
  inline def clearIconVarargs(
    value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
  ): this.type = set("clearIcon", js.Array(value*))
  
  inline def clearIconVdomElement(value: VdomElement): this.type = set("clearIcon", value.rawElement.asInstanceOf[js.Any])
  
  inline def dateRender(value: (Moment, Moment) => japgolly.scalajs.react.facade.React.Node): this.type = set("dateRender", js.Any.fromFunction2(value))
  
  inline def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
  
  inline def defaultPickerValue(value: Moment): this.type = set("defaultPickerValue", value.asInstanceOf[js.Any])
  
  inline def defaultValue(value: Moment): this.type = set("defaultValue", value.asInstanceOf[js.Any])
  
  inline def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def disabledDate(value: /* date */ Moment => Boolean): this.type = set("disabledDate", js.Any.fromFunction1(value))
  
  inline def disabledTime(value: /* date */ Moment | Null => DisabledTimes): this.type = set("disabledTime", js.Any.fromFunction1(value))
  
  inline def dropdownAlign(value: AlignType): this.type = set("dropdownAlign", value.asInstanceOf[js.Any])
  
  inline def dropdownClassName(value: String): this.type = set("dropdownClassName", value.asInstanceOf[js.Any])
  
  inline def format(value: String | CustomFormat[Moment] | (js.Array[String | CustomFormat[Moment]])): this.type = set("format", value.asInstanceOf[js.Any])
  
  inline def formatFunction1(value: Moment => String): this.type = set("format", js.Any.fromFunction1(value))
  
  inline def formatVarargs(value: (String | CustomFormat[Moment])*): this.type = set("format", js.Array(value*))
  
  inline def getPopupContainer(value: /* node */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
  
  inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  
  inline def inputReadOnly(value: Boolean): this.type = set("inputReadOnly", value.asInstanceOf[js.Any])
  
  inline def inputRender(
    value: /* props */ InputHTMLAttributes[HTMLInputElement] => japgolly.scalajs.react.facade.React.Node
  ): this.type = set("inputRender", js.Any.fromFunction1(value))
  
  inline def locale(value: PickerLocale): this.type = set("locale", value.asInstanceOf[js.Any])
  
  inline def mode(value: PanelMode): this.type = set("mode", value.asInstanceOf[js.Any])
  
  inline def monthCellRender(value: (Moment, /* locale */ Locale) => japgolly.scalajs.react.facade.React.Node): this.type = set("monthCellRender", js.Any.fromFunction2(value))
  
  inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
  
  inline def nextIcon(value: VdomNode): this.type = set("nextIcon", value.rawNode.asInstanceOf[js.Any])
  
  inline def nextIconNull: this.type = set("nextIcon", null)
  
  inline def nextIconVarargs(
    value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
  ): this.type = set("nextIcon", js.Array(value*))
  
  inline def nextIconVdomElement(value: VdomElement): this.type = set("nextIcon", value.rawElement.asInstanceOf[js.Any])
  
  inline def onBlur(value: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onChange(value: (/* value */ Moment | Null, /* dateString */ String) => Callback): this.type = set("onChange", js.Any.fromFunction2((t0: /* value */ Moment | Null, t1: /* dateString */ String) => (value(t0, t1)).runNow()))
  
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
  
  inline def onOk(value: /* date */ Moment => Callback): this.type = set("onOk", js.Any.fromFunction1((t0: /* date */ Moment) => value(t0).runNow()))
  
  inline def onOpenChange(value: /* open */ Boolean => Callback): this.type = set("onOpenChange", js.Any.fromFunction1((t0: /* open */ Boolean) => value(t0).runNow()))
  
  inline def onPanelChange(value: (Moment, /* mode */ PanelMode) => Callback): this.type = set("onPanelChange", js.Any.fromFunction2((t0: Moment, t1: /* mode */ PanelMode) => (value(t0, t1)).runNow()))
  
  inline def onSelect(value: /* value */ Moment => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: /* value */ Moment) => value(t0).runNow()))
  
  inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
  
  inline def panelRender(
    value: /* originPanel */ japgolly.scalajs.react.facade.React.Node => japgolly.scalajs.react.facade.React.Node
  ): this.type = set("panelRender", js.Any.fromFunction1(value))
  
  inline def pickerRef(value: MutableRefObject[PickerRefConfig]): this.type = set("pickerRef", value.asInstanceOf[js.Any])
  
  inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
  
  inline def placement(value: DataPickerPlacement): this.type = set("placement", value.asInstanceOf[js.Any])
  
  inline def popupStyle(value: CSSProperties): this.type = set("popupStyle", value.asInstanceOf[js.Any])
  
  inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  inline def prevIcon(value: VdomNode): this.type = set("prevIcon", value.rawNode.asInstanceOf[js.Any])
  
  inline def prevIconNull: this.type = set("prevIcon", null)
  
  inline def prevIconVarargs(
    value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
  ): this.type = set("prevIcon", js.Array(value*))
  
  inline def prevIconVdomElement(value: VdomElement): this.type = set("prevIcon", value.rawElement.asInstanceOf[js.Any])
  
  inline def renderExtraFooter(value: /* mode */ PanelMode => japgolly.scalajs.react.facade.React.Node): this.type = set("renderExtraFooter", js.Any.fromFunction1(value))
  
  inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
  
  inline def showNow(value: Boolean): this.type = set("showNow", value.asInstanceOf[js.Any])
  
  inline def showTime(value: Boolean | SharedTimeProps[Moment]): this.type = set("showTime", value.asInstanceOf[js.Any])
  
  inline def showToday(value: Boolean): this.type = set("showToday", value.asInstanceOf[js.Any])
  
  inline def size(value: SizeType): this.type = set("size", value.asInstanceOf[js.Any])
  
  inline def status(value: InputStatus): this.type = set("status", value.asInstanceOf[js.Any])
  
  inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def suffixIcon(value: VdomNode): this.type = set("suffixIcon", value.rawNode.asInstanceOf[js.Any])
  
  inline def suffixIconNull: this.type = set("suffixIcon", null)
  
  inline def suffixIconVarargs(
    value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
  ): this.type = set("suffixIcon", js.Array(value*))
  
  inline def suffixIconVdomElement(value: VdomElement): this.type = set("suffixIcon", value.rawElement.asInstanceOf[js.Any])
  
  inline def superNextIcon(value: VdomNode): this.type = set("superNextIcon", value.rawNode.asInstanceOf[js.Any])
  
  inline def superNextIconNull: this.type = set("superNextIcon", null)
  
  inline def superNextIconVarargs(
    value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
  ): this.type = set("superNextIcon", js.Array(value*))
  
  inline def superNextIconVdomElement(value: VdomElement): this.type = set("superNextIcon", value.rawElement.asInstanceOf[js.Any])
  
  inline def superPrevIcon(value: VdomNode): this.type = set("superPrevIcon", value.rawNode.asInstanceOf[js.Any])
  
  inline def superPrevIconNull: this.type = set("superPrevIcon", null)
  
  inline def superPrevIconVarargs(
    value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
  ): this.type = set("superPrevIcon", js.Array(value*))
  
  inline def superPrevIconVdomElement(value: VdomElement): this.type = set("superPrevIcon", value.rawElement.asInstanceOf[js.Any])
  
  inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
  
  inline def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
  
  inline def value(value: Moment): this.type = set("value", value.asInstanceOf[js.Any])
  
  inline def valueNull: this.type = set("value", null)
}
