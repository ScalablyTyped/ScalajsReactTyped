package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobile.antdMobileBooleans.`false`
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
import typingsJapgolly.antdMobile.antdMobileStrings.normal
import typingsJapgolly.antdMobile.antdMobileStrings.off
import typingsJapgolly.antdMobile.antdMobileStrings.other
import typingsJapgolly.antdMobile.antdMobileStrings.page
import typingsJapgolly.antdMobile.antdMobileStrings.parallel
import typingsJapgolly.antdMobile.antdMobileStrings.polite
import typingsJapgolly.antdMobile.antdMobileStrings.popup
import typingsJapgolly.antdMobile.antdMobileStrings.removals
import typingsJapgolly.antdMobile.antdMobileStrings.right
import typingsJapgolly.antdMobile.antdMobileStrings.spelling
import typingsJapgolly.antdMobile.antdMobileStrings.step
import typingsJapgolly.antdMobile.antdMobileStrings.text
import typingsJapgolly.antdMobile.antdMobileStrings.time
import typingsJapgolly.antdMobile.antdMobileStrings.tree
import typingsJapgolly.antdMobile.antdMobileStrings.vertical
import typingsJapgolly.antdMobile.esComponentsFormFormItemMod.ChildrenType
import typingsJapgolly.antdMobile.esComponentsFormMod.FormLayout
import typingsJapgolly.rcFieldForm.anon.Source
import typingsJapgolly.rcFieldForm.esFieldMod.ShouldUpdate
import typingsJapgolly.rcFieldForm.esInterfaceMod.EventArgs
import typingsJapgolly.rcFieldForm.esInterfaceMod.FormInstance
import typingsJapgolly.rcFieldForm.esInterfaceMod.NamePath
import typingsJapgolly.rcFieldForm.esInterfaceMod.Rule
import typingsJapgolly.rcFieldForm.esInterfaceMod.Store
import typingsJapgolly.rcFieldForm.esInterfaceMod.StoreValue
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.react.mod.MutableRefObject
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_FormItemProps868188908 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
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
  
  inline def arrow(value: Boolean | Node): this.type = set("arrow", value.asInstanceOf[js.Any])
  
  inline def arrowNull: this.type = set("arrow", null)
  
  inline def arrowVarargs(value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | Element)*): this.type = set("arrow", js.Array(value*))
  
  inline def arrowVdomElement(value: VdomElement): this.type = set("arrow", value.rawElement.asInstanceOf[js.Any])
  
  inline def childElementPosition(value: normal | right): this.type = set("childElementPosition", value.asInstanceOf[js.Any])
  
  inline def children(value: ChildrenType[Any]): this.type = set("children", value.asInstanceOf[js.Any])
  
  inline def childrenFunction1(value: /* form */ FormInstance[Any] => Node): this.type = set("children", js.Any.fromFunction1(value))
  
  inline def childrenNull: this.type = set("children", null)
  
  inline def childrenVarargs(value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
  
  inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def clickable(value: Boolean): this.type = set("clickable", value.asInstanceOf[js.Any])
  
  inline def dependencies(value: js.Array[NamePath]): this.type = set("dependencies", value.asInstanceOf[js.Any])
  
  inline def dependenciesVarargs(value: NamePath*): this.type = set("dependencies", js.Array(value*))
  
  inline def description(value: VdomNode): this.type = set("description", value.rawNode.asInstanceOf[js.Any])
  
  inline def descriptionNull: this.type = set("description", null)
  
  inline def descriptionVarargs(value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | Element)*): this.type = set("description", js.Array(value*))
  
  inline def descriptionVdomElement(value: VdomElement): this.type = set("description", value.rawElement.asInstanceOf[js.Any])
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def extra(value: VdomNode): this.type = set("extra", value.rawNode.asInstanceOf[js.Any])
  
  inline def extraNull: this.type = set("extra", null)
  
  inline def extraVarargs(value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | Element)*): this.type = set("extra", js.Array(value*))
  
  inline def extraVdomElement(value: VdomElement): this.type = set("extra", value.rawElement.asInstanceOf[js.Any])
  
  inline def getValueFromEvent(value: /* args */ EventArgs => StoreValue): this.type = set("getValueFromEvent", js.Any.fromFunction1(value))
  
  inline def getValueProps(value: /* value */ StoreValue => Record[String, Any]): this.type = set("getValueProps", js.Any.fromFunction1(value))
  
  inline def hasFeedback(value: Boolean): this.type = set("hasFeedback", value.asInstanceOf[js.Any])
  
  inline def help(value: VdomNode): this.type = set("help", value.rawNode.asInstanceOf[js.Any])
  
  inline def helpNull: this.type = set("help", null)
  
  inline def helpVarargs(value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | Element)*): this.type = set("help", js.Array(value*))
  
  inline def helpVdomElement(value: VdomElement): this.type = set("help", value.rawElement.asInstanceOf[js.Any])
  
  inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
  
  inline def initialValue(value: Any): this.type = set("initialValue", value.asInstanceOf[js.Any])
  
  inline def label(value: VdomNode): this.type = set("label", value.rawNode.asInstanceOf[js.Any])
  
  inline def labelNull: this.type = set("label", null)
  
  inline def labelVarargs(value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | Element)*): this.type = set("label", js.Array(value*))
  
  inline def labelVdomElement(value: VdomElement): this.type = set("label", value.rawElement.asInstanceOf[js.Any])
  
  inline def layout(value: FormLayout): this.type = set("layout", value.asInstanceOf[js.Any])
  
  inline def messageVariables(value: Record[String, String]): this.type = set("messageVariables", value.asInstanceOf[js.Any])
  
  inline def name(value: NamePath): this.type = set("name", value.asInstanceOf[js.Any])
  
  inline def nameVarargs(value: (String | Double)*): this.type = set("name", js.Array(value*))
  
  inline def noStyle(value: Boolean): this.type = set("noStyle", value.asInstanceOf[js.Any])
  
  inline def normalize(value: (/* value */ StoreValue, /* prevValue */ StoreValue, /* allValues */ Store) => StoreValue): this.type = set("normalize", js.Any.fromFunction3(value))
  
  inline def onClick(
    value: (/* e */ ReactMouseEventFrom[org.scalajs.dom.Element], /* widgetRef */ MutableRefObject[Any]) => Callback
  ): this.type = set("onClick", js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[org.scalajs.dom.Element], t1: /* widgetRef */ MutableRefObject[Any]) => (value(t0, t1)).runNow()))
  
  inline def preserve(value: Boolean): this.type = set("preserve", value.asInstanceOf[js.Any])
  
  inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
  
  inline def rules(value: js.Array[Rule]): this.type = set("rules", value.asInstanceOf[js.Any])
  
  inline def rulesVarargs(value: Rule*): this.type = set("rules", js.Array(value*))
  
  inline def shouldUpdate(value: ShouldUpdate[Any]): this.type = set("shouldUpdate", value.asInstanceOf[js.Any])
  
  inline def shouldUpdateFunction3(value: (Any, Any, /* info */ Source) => Boolean): this.type = set("shouldUpdate", js.Any.fromFunction3(value))
  
  inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
  
  inline def trigger(value: String): this.type = set("trigger", value.asInstanceOf[js.Any])
  
  inline def validateFirst(value: Boolean | parallel): this.type = set("validateFirst", value.asInstanceOf[js.Any])
  
  inline def validateTrigger(value: String | js.Array[String] | `false`): this.type = set("validateTrigger", value.asInstanceOf[js.Any])
  
  inline def validateTriggerVarargs(value: String*): this.type = set("validateTrigger", js.Array(value*))
  
  inline def valuePropName(value: String): this.type = set("valuePropName", value.asInstanceOf[js.Any])
}
