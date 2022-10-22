package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.antdMobile.anon.CSSPropertiesPartialRecorActivebackgroundcolor
import typingsJapgolly.antdMobile.anon.CSSPropertiesPartialRecorAnimationName
import typingsJapgolly.antdMobile.anon.Children
import typingsJapgolly.antdMobile.anon.classNamestringundefinedsAriaactivedescendant
import typingsJapgolly.antdMobile.antdMobileBooleans.`false`
import typingsJapgolly.antdMobile.antdMobileStrings.`additions removals`
import typingsJapgolly.antdMobile.antdMobileStrings.`additions text`
import typingsJapgolly.antdMobile.antdMobileStrings.`inline`
import typingsJapgolly.antdMobile.antdMobileStrings.`removals additions`
import typingsJapgolly.antdMobile.antdMobileStrings.`removals text`
import typingsJapgolly.antdMobile.antdMobileStrings.`text additions`
import typingsJapgolly.antdMobile.antdMobileStrings.`text removals`
import typingsJapgolly.antdMobile.antdMobileStrings.`text-optional`
import typingsJapgolly.antdMobile.antdMobileStrings.`text-required`
import typingsJapgolly.antdMobile.antdMobileStrings.additions
import typingsJapgolly.antdMobile.antdMobileStrings.all
import typingsJapgolly.antdMobile.antdMobileStrings.ascending
import typingsJapgolly.antdMobile.antdMobileStrings.assertive
import typingsJapgolly.antdMobile.antdMobileStrings.asterisk
import typingsJapgolly.antdMobile.antdMobileStrings.both
import typingsJapgolly.antdMobile.antdMobileStrings.card
import typingsJapgolly.antdMobile.antdMobileStrings.copy
import typingsJapgolly.antdMobile.antdMobileStrings.date
import typingsJapgolly.antdMobile.antdMobileStrings.default
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
import typingsJapgolly.antdMobile.esComponentsFormFormArrayMod.FormArrayField
import typingsJapgolly.antdMobile.esComponentsFormFormArrayMod.FormArrayOperation
import typingsJapgolly.antdMobile.esComponentsFormFormArrayMod.FormArrayProps
import typingsJapgolly.antdMobile.esComponentsFormFormItemMod.FormItemProps
import typingsJapgolly.antdMobile.esComponentsFormFormSubscribeMod.FormSubscribeProps
import typingsJapgolly.antdMobile.esComponentsFormMod.FormLayout
import typingsJapgolly.rcFieldForm.esFormMod.RenderProps
import typingsJapgolly.rcFieldForm.esInterfaceMod.FieldData
import typingsJapgolly.rcFieldForm.esInterfaceMod.FormInstance
import typingsJapgolly.rcFieldForm.esInterfaceMod.NamePath
import typingsJapgolly.rcFieldForm.esInterfaceMod.Store
import typingsJapgolly.rcFieldForm.esInterfaceMod.ValidateErrorEntity
import typingsJapgolly.rcFieldForm.esInterfaceMod.ValidateMessages
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Form {
  
  object Array {
    
    inline def apply(
      children: (js.Array[FormArrayField], FormArrayOperation) => js.Array[Element],
      name: String | Double | (js.Array[String | Double])
    ): SharedBuilder_FormArrayProps_2130765192 = {
      val __props = js.Dynamic.literal(children = js.Any.fromFunction2(children), name = name.asInstanceOf[js.Any])
      new SharedBuilder_FormArrayProps_2130765192(js.Array(this.component, __props.asInstanceOf[FormArrayProps]))
    }
    
    @JSImport("antd-mobile", "Form.Array")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: FormArrayProps): SharedBuilder_FormArrayProps_2130765192 = new SharedBuilder_FormArrayProps_2130765192(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Header {
    
    @JSImport("antd-mobile", "Form.Header")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Header.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: Children): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Item {
    
    inline def apply(
      style: js.UndefOr[CSSPropertiesPartialRecorActivebackgroundcolor] & (js.UndefOr[CSSProperties & (Partial[Record[scala.Nothing, String]])])
    ): SharedBuilder_FormItemProps868188908 = {
      val __props = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
      new SharedBuilder_FormItemProps868188908(js.Array(this.component, __props.asInstanceOf[FormItemProps]))
    }
    
    @JSImport("antd-mobile", "Form.Item")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: FormItemProps): SharedBuilder_FormItemProps868188908 = new SharedBuilder_FormItemProps868188908(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Subscribe {
    
    inline def apply(
      children: (/* changedValues */ Record[String, Any], /* form */ FormInstance[Any]) => Node,
      to: js.Array[NamePath]
    ): Default[js.Object] = {
      val __props = js.Dynamic.literal(children = js.Any.fromFunction2(children), to = to.asInstanceOf[js.Any])
      new Default[js.Object](js.Array(this.component, __props.asInstanceOf[FormSubscribeProps]))
    }
    
    @JSImport("antd-mobile", "Form.Subscribe")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: FormSubscribeProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd-mobile", "Form")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antdMobile.esComponentsFormFormMod.FormInstance] {
    
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
    
    inline def children(value: RenderProps | Node): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenFunction2(
      value: (/* values */ Store, /* form */ FormInstance[Any]) => typingsJapgolly.react.mod.global.JSX.Element | Node
    ): this.type = set("children", js.Any.fromFunction2(value))
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def footer(value: VdomNode): this.type = set("footer", value.rawNode.asInstanceOf[js.Any])
    
    inline def footerNull: this.type = set("footer", null)
    
    inline def footerVarargs(value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | Element)*): this.type = set("footer", js.Array(value*))
    
    inline def footerVdomElement(value: VdomElement): this.type = set("footer", value.rawElement.asInstanceOf[js.Any])
    
    inline def form(value: FormInstance[Any]): this.type = set("form", value.asInstanceOf[js.Any])
    
    inline def hasFeedback(value: Boolean): this.type = set("hasFeedback", value.asInstanceOf[js.Any])
    
    inline def initialValues(value: Store): this.type = set("initialValues", value.asInstanceOf[js.Any])
    
    inline def layout(value: FormLayout): this.type = set("layout", value.asInstanceOf[js.Any])
    
    inline def mode(value: default | card): this.type = set("mode", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onFieldsChange(value: (/* changedFields */ js.Array[FieldData], /* allFields */ js.Array[FieldData]) => Callback): this.type = set("onFieldsChange", js.Any.fromFunction2((t0: /* changedFields */ js.Array[FieldData], t1: /* allFields */ js.Array[FieldData]) => (value(t0, t1)).runNow()))
    
    inline def onFinish(value: /* values */ Any => Callback): this.type = set("onFinish", js.Any.fromFunction1((t0: /* values */ Any) => value(t0).runNow()))
    
    inline def onFinishFailed(value: /* errorInfo */ ValidateErrorEntity[Any] => Callback): this.type = set("onFinishFailed", js.Any.fromFunction1((t0: /* errorInfo */ ValidateErrorEntity[Any]) => value(t0).runNow()))
    
    inline def onValuesChange(value: (/* changedValues */ Any, /* values */ Any) => Callback): this.type = set("onValuesChange", js.Any.fromFunction2((t0: /* changedValues */ Any, t1: /* values */ Any) => (value(t0, t1)).runNow()))
    
    inline def preserve(value: Boolean): this.type = set("preserve", value.asInstanceOf[js.Any])
    
    inline def requiredMarkStyle(value: asterisk | `text-required` | `text-optional` | none): this.type = set("requiredMarkStyle", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSPropertiesPartialRecorAnimationName): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def validateMessages(value: ValidateMessages): this.type = set("validateMessages", value.asInstanceOf[js.Any])
    
    inline def validateTrigger(value: String | js.Array[String] | `false`): this.type = set("validateTrigger", value.asInstanceOf[js.Any])
    
    inline def validateTriggerVarargs(value: String*): this.type = set("validateTrigger", js.Array(value*))
  }
  
  implicit def make(companion: Form.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: classNamestringundefinedsAriaactivedescendant): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
