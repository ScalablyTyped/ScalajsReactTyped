package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.antdBooleans.`false`
import typingsJapgolly.antd.formItemMod.ChildrenType
import typingsJapgolly.antd.formItemMod.FormItemProps
import typingsJapgolly.antd.formItemMod.ValidateStatus
import typingsJapgolly.antd.gridColMod.ColProps
import typingsJapgolly.antd.interfaceMod.FormLabelAlign
import typingsJapgolly.rcFieldForm.fieldMod.ShouldUpdate
import typingsJapgolly.rcFieldForm.interfaceMod.EventArgs
import typingsJapgolly.rcFieldForm.interfaceMod.NamePath
import typingsJapgolly.rcFieldForm.interfaceMod.Rule
import typingsJapgolly.rcFieldForm.interfaceMod.Store
import typingsJapgolly.rcFieldForm.interfaceMod.StoreValue
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormItem {
  def apply(
    className: String = null,
    colon: js.UndefOr[Boolean] = js.undefined,
    dependencies: js.Array[NamePath] = null,
    extra: VdomNode = null,
    fieldKey: Int | Double = null,
    getValueFromEvent: /* args */ EventArgs => CallbackTo[StoreValue] = null,
    hasFeedback: js.UndefOr[Boolean] = js.undefined,
    help: VdomNode = null,
    htmlFor: String = null,
    id: String = null,
    label: VdomNode = null,
    labelAlign: FormLabelAlign = null,
    labelCol: ColProps = null,
    name: NamePath = null,
    noStyle: js.UndefOr[Boolean] = js.undefined,
    normalize: (/* value */ StoreValue, /* prevValue */ StoreValue, /* allValues */ Store) => CallbackTo[StoreValue] = null,
    onReset: js.UndefOr[Callback] = js.undefined,
    prefixCls: String = null,
    required: js.UndefOr[Boolean] = js.undefined,
    rules: js.Array[Rule] = null,
    shouldUpdate: ShouldUpdate = null,
    style: CSSProperties = null,
    trigger: String = null,
    validateFirst: js.UndefOr[Boolean] = js.undefined,
    validateStatus: ValidateStatus = null,
    validateTrigger: String | js.Array[String] | `false` = null,
    valuePropName: String = null,
    wrapperCol: ColProps = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildrenType = null
  ): UnmountedSimple[
    FormItemProps, 
    MountedWithRawType[FormItemProps, js.Object, RawMounted[FormItemProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(colon)) __obj.updateDynamic("colon")(colon.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.rawNode.asInstanceOf[js.Any])
    if (fieldKey != null) __obj.updateDynamic("fieldKey")(fieldKey.asInstanceOf[js.Any])
    if (getValueFromEvent != null) __obj.updateDynamic("getValueFromEvent")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.rcFieldForm.interfaceMod.EventArgs) => getValueFromEvent(t0).runNow()))
    if (!js.isUndefined(hasFeedback)) __obj.updateDynamic("hasFeedback")(hasFeedback.asInstanceOf[js.Any])
    if (help != null) __obj.updateDynamic("help")(help.rawNode.asInstanceOf[js.Any])
    if (htmlFor != null) __obj.updateDynamic("htmlFor")(htmlFor.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.rawNode.asInstanceOf[js.Any])
    if (labelAlign != null) __obj.updateDynamic("labelAlign")(labelAlign.asInstanceOf[js.Any])
    if (labelCol != null) __obj.updateDynamic("labelCol")(labelCol.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(noStyle)) __obj.updateDynamic("noStyle")(noStyle.asInstanceOf[js.Any])
    if (normalize != null) __obj.updateDynamic("normalize")(js.Any.fromFunction3((t0: /* value */ typingsJapgolly.rcFieldForm.interfaceMod.StoreValue, t1: /* prevValue */ typingsJapgolly.rcFieldForm.interfaceMod.StoreValue, t2: /* allValues */ typingsJapgolly.rcFieldForm.interfaceMod.Store) => normalize(t0, t1, t2).runNow()))
    onReset.foreach(p => __obj.updateDynamic("onReset")(p.toJsFn))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (shouldUpdate != null) __obj.updateDynamic("shouldUpdate")(shouldUpdate.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (!js.isUndefined(validateFirst)) __obj.updateDynamic("validateFirst")(validateFirst.asInstanceOf[js.Any])
    if (validateStatus != null) __obj.updateDynamic("validateStatus")(validateStatus.asInstanceOf[js.Any])
    if (validateTrigger != null) __obj.updateDynamic("validateTrigger")(validateTrigger.asInstanceOf[js.Any])
    if (valuePropName != null) __obj.updateDynamic("valuePropName")(valuePropName.asInstanceOf[js.Any])
    if (wrapperCol != null) __obj.updateDynamic("wrapperCol")(wrapperCol.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.antd.formItemMod.FormItemProps, 
  japgolly.scalajs.react.Children.None, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.formItemMod.FormItemProps])
  }
  @JSImport("antd/lib/form/FormItem", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

