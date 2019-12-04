package typingsJapgolly.antd.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.antdStrings.error
import typingsJapgolly.antd.antdStrings.success
import typingsJapgolly.antd.antdStrings.validating
import typingsJapgolly.antd.antdStrings.warning
import typingsJapgolly.antd.libFormFormItemMod.FormItemProps
import typingsJapgolly.antd.libFormFormItemMod.FormLabelAlign
import typingsJapgolly.antd.libFormFormItemMod.default
import typingsJapgolly.antd.libGridColMod.ColProps
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormItem {
  def apply(
    className: String = null,
    colon: js.UndefOr[Boolean] = js.undefined,
    extra: VdomNode = null,
    hasFeedback: js.UndefOr[Boolean] = js.undefined,
    help: VdomNode = null,
    htmlFor: String = null,
    id: String = null,
    label: VdomNode = null,
    labelAlign: FormLabelAlign = null,
    labelCol: ColProps = null,
    prefixCls: String = null,
    required: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    validateStatus: success | warning | error | validating | typingsJapgolly.antd.antdStrings.Empty = null,
    wrapperCol: ColProps = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[FormItemProps, default, Unit, FormItemProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(colon)) __obj.updateDynamic("colon")(colon.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(hasFeedback)) __obj.updateDynamic("hasFeedback")(hasFeedback.asInstanceOf[js.Any])
    if (help != null) __obj.updateDynamic("help")(help.rawNode.asInstanceOf[js.Any])
    if (htmlFor != null) __obj.updateDynamic("htmlFor")(htmlFor.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.rawNode.asInstanceOf[js.Any])
    if (labelAlign != null) __obj.updateDynamic("labelAlign")(labelAlign.asInstanceOf[js.Any])
    if (labelCol != null) __obj.updateDynamic("labelCol")(labelCol.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (validateStatus != null) __obj.updateDynamic("validateStatus")(validateStatus.asInstanceOf[js.Any])
    if (wrapperCol != null) __obj.updateDynamic("wrapperCol")(wrapperCol.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.libFormFormItemMod.FormItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.libFormFormItemMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.libFormFormItemMod.FormItemProps])(children: _*)
  }
  @JSImport("antd/lib/form/FormItem", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

