package typingsJapgolly.antd.formItemMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antd.antdBooleans.`false`
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

/* Inlined parent antd.antd/lib/form/FormItemLabel.FormItemLabelProps */
/* Inlined parent antd.antd/lib/form/FormItemInput.FormItemInputProps */
/* Inlined parent std.Omit<antd.antd/lib/form/FormItem.RcFieldProps, 'children'> */
trait FormItemProps extends js.Object {
  var children: ChildrenType
  var className: js.UndefOr[String] = js.undefined
  var colon: js.UndefOr[Boolean] = js.undefined
  var dependencies: js.UndefOr[js.Array[NamePath]] = js.undefined
  var extra: js.UndefOr[Node] = js.undefined
  /** Auto passed by List render props. User should not use this. */
  var fieldKey: js.UndefOr[Double] = js.undefined
  var getValueFromEvent: js.UndefOr[js.Function1[/* args */ EventArgs, StoreValue]] = js.undefined
  var hasFeedback: js.UndefOr[Boolean] = js.undefined
  var help: js.UndefOr[Node] = js.undefined
  var htmlFor: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[Node] = js.undefined
  var labelAlign: js.UndefOr[FormLabelAlign] = js.undefined
  var labelCol: js.UndefOr[ColProps] = js.undefined
  var name: js.UndefOr[NamePath] = js.undefined
  var noStyle: js.UndefOr[Boolean] = js.undefined
  var normalize: js.UndefOr[
    js.Function3[/* value */ StoreValue, /* prevValue */ StoreValue, /* allValues */ Store, StoreValue]
  ] = js.undefined
  var onReset: js.UndefOr[js.Function0[Unit]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var rules: js.UndefOr[js.Array[Rule]] = js.undefined
  var shouldUpdate: js.UndefOr[ShouldUpdate] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var trigger: js.UndefOr[String] = js.undefined
  var validateFirst: js.UndefOr[Boolean] = js.undefined
  var validateStatus: js.UndefOr[ValidateStatus] = js.undefined
  var validateTrigger: js.UndefOr[String | js.Array[String] | `false`] = js.undefined
  var valuePropName: js.UndefOr[String] = js.undefined
  var wrapperCol: js.UndefOr[ColProps] = js.undefined
}

object FormItemProps {
  @scala.inline
  def apply(
    children: ChildrenType = null,
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
    wrapperCol: ColProps = null
  ): FormItemProps = {
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
    __obj.asInstanceOf[FormItemProps]
  }
}

