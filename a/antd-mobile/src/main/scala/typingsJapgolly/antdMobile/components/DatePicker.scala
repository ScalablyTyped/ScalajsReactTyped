package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobile.anon.CSSPropertiesPartialRecorAlignSelf
import typingsJapgolly.antdMobile.anon.PartialRecordPrecisionval
import typingsJapgolly.antdMobile.anon.valueDatenullundefineddef
import typingsJapgolly.antdMobile.antdMobileStrings.`additions removals`
import typingsJapgolly.antdMobile.antdMobileStrings.`additions text`
import typingsJapgolly.antdMobile.antdMobileStrings.`inline`
import typingsJapgolly.antdMobile.antdMobileStrings.`removals additions`
import typingsJapgolly.antdMobile.antdMobileStrings.`removals text`
import typingsJapgolly.antdMobile.antdMobileStrings.`text additions`
import typingsJapgolly.antdMobile.antdMobileStrings.`text removals`
import typingsJapgolly.antdMobile.antdMobileStrings.additions
import typingsJapgolly.antdMobile.antdMobileStrings.all
import typingsJapgolly.antdMobile.antdMobileStrings.ascending
import typingsJapgolly.antdMobile.antdMobileStrings.assertive
import typingsJapgolly.antdMobile.antdMobileStrings.both
import typingsJapgolly.antdMobile.antdMobileStrings.copy
import typingsJapgolly.antdMobile.antdMobileStrings.date
import typingsJapgolly.antdMobile.antdMobileStrings.descending
import typingsJapgolly.antdMobile.antdMobileStrings.dialog
import typingsJapgolly.antdMobile.antdMobileStrings.execute
import typingsJapgolly.antdMobile.antdMobileStrings.grammar
import typingsJapgolly.antdMobile.antdMobileStrings.grid
import typingsJapgolly.antdMobile.antdMobileStrings.horizontal
import typingsJapgolly.antdMobile.antdMobileStrings.link
import typingsJapgolly.antdMobile.antdMobileStrings.list
import typingsJapgolly.antdMobile.antdMobileStrings.listbox
import typingsJapgolly.antdMobile.antdMobileStrings.location
import typingsJapgolly.antdMobile.antdMobileStrings.menu
import typingsJapgolly.antdMobile.antdMobileStrings.mixed
import typingsJapgolly.antdMobile.antdMobileStrings.move
import typingsJapgolly.antdMobile.antdMobileStrings.none
import typingsJapgolly.antdMobile.antdMobileStrings.off
import typingsJapgolly.antdMobile.antdMobileStrings.other
import typingsJapgolly.antdMobile.antdMobileStrings.page
import typingsJapgolly.antdMobile.antdMobileStrings.polite
import typingsJapgolly.antdMobile.antdMobileStrings.popup
import typingsJapgolly.antdMobile.antdMobileStrings.removals
import typingsJapgolly.antdMobile.antdMobileStrings.spelling
import typingsJapgolly.antdMobile.antdMobileStrings.step
import typingsJapgolly.antdMobile.antdMobileStrings.text
import typingsJapgolly.antdMobile.antdMobileStrings.time
import typingsJapgolly.antdMobile.antdMobileStrings.tree
import typingsJapgolly.antdMobile.antdMobileStrings.vertical
import typingsJapgolly.antdMobile.esComponentsDatePickerDatePickerUtilsMod.Precision
import typingsJapgolly.antdMobile.esComponentsPickerPickerMod.PickerActions
import typingsJapgolly.antdMobile.esUtilsRenderToContainerMod.GetContainer
import typingsJapgolly.antdMobile.esUtilsWithStopPropagationMod.PropagationEvent
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DatePicker {
  
  inline def apply(
    style: (js.UndefOr[CSSProperties & (Partial[Record[scala.Nothing, String]])]) & js.UndefOr[CSSPropertiesPartialRecorAlignSelf]
  ): Builder = {
    val __props = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[valueDatenullundefineddef]))
  }
  
  @JSImport("antd-mobile", "DatePicker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[PickerActions] {
    
    inline def afterClose(value: Callback): this.type = set("afterClose", value.toJsFn)
    
    inline def afterShow(value: Callback): this.type = set("afterShow", value.toJsFn)
    
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
    
    inline def cancelText(value: VdomNode): this.type = set("cancelText", value.rawNode.asInstanceOf[js.Any])
    
    inline def cancelTextNull: this.type = set("cancelText", null)
    
    inline def cancelTextVarargs(value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | Element)*): this.type = set("cancelText", js.Array(value*))
    
    inline def cancelTextVdomElement(value: VdomElement): this.type = set("cancelText", value.rawElement.asInstanceOf[js.Any])
    
    inline def children(value: (/* value */ js.Date | Null, /* actions */ PickerActions) => Node): this.type = set("children", js.Any.fromFunction2(value))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def closeOnMaskClick(value: Boolean): this.type = set("closeOnMaskClick", value.asInstanceOf[js.Any])
    
    inline def confirmText(value: VdomNode): this.type = set("confirmText", value.rawNode.asInstanceOf[js.Any])
    
    inline def confirmTextNull: this.type = set("confirmText", null)
    
    inline def confirmTextVarargs(value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | Element)*): this.type = set("confirmText", js.Array(value*))
    
    inline def confirmTextVdomElement(value: VdomElement): this.type = set("confirmText", value.rawElement.asInstanceOf[js.Any])
    
    inline def defaultValue(value: js.Date): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def defaultValueNull: this.type = set("defaultValue", null)
    
    inline def destroyOnClose(value: Boolean): this.type = set("destroyOnClose", value.asInstanceOf[js.Any])
    
    inline def filter(value: PartialRecordPrecisionval): this.type = set("filter", value.asInstanceOf[js.Any])
    
    inline def forceRender(value: Boolean): this.type = set("forceRender", value.asInstanceOf[js.Any])
    
    inline def getContainer(value: GetContainer): this.type = set("getContainer", value.asInstanceOf[js.Any])
    
    inline def getContainerCallbackTo(value: CallbackTo[HTMLElement]): this.type = set("getContainer", value.toJsFn)
    
    inline def getContainerNull: this.type = set("getContainer", null)
    
    inline def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    inline def loadingContent(value: VdomNode): this.type = set("loadingContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def loadingContentNull: this.type = set("loadingContent", null)
    
    inline def loadingContentVarargs(value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | Element)*): this.type = set("loadingContent", js.Array(value*))
    
    inline def loadingContentVdomElement(value: VdomElement): this.type = set("loadingContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def max(value: js.Date): this.type = set("max", value.asInstanceOf[js.Any])
    
    inline def min(value: js.Date): this.type = set("min", value.asInstanceOf[js.Any])
    
    inline def mouseWheel(value: Boolean): this.type = set("mouseWheel", value.asInstanceOf[js.Any])
    
    inline def onCancel(value: Callback): this.type = set("onCancel", value.toJsFn)
    
    inline def onClick(value: /* event */ ReactMouseEventFrom[HTMLDivElement] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLDivElement]) => value(t0).runNow()))
    
    inline def onClose(value: Callback): this.type = set("onClose", value.toJsFn)
    
    inline def onConfirm(value: /* value */ js.Date => Callback): this.type = set("onConfirm", js.Any.fromFunction1((t0: /* value */ js.Date) => value(t0).runNow()))
    
    inline def onSelect(value: /* value */ js.Date => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: /* value */ js.Date) => value(t0).runNow()))
    
    inline def precision(value: Precision): this.type = set("precision", value.asInstanceOf[js.Any])
    
    inline def renderLabel(value: (/* type */ Precision, /* data */ Double) => Node): this.type = set("renderLabel", js.Any.fromFunction2(value))
    
    inline def stopPropagation(value: js.Array[PropagationEvent]): this.type = set("stopPropagation", value.asInstanceOf[js.Any])
    
    inline def stopPropagationVarargs(value: PropagationEvent*): this.type = set("stopPropagation", js.Array(value*))
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
    
    inline def value(value: js.Date): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueNull: this.type = set("value", null)
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: valueDatenullundefineddef): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
