package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobile.checkboxCheckboxMod.CheckboxProps
import typingsJapgolly.antdMobile.checkboxItemMod.CheckboxItemProps
import typingsJapgolly.antdMobile.checkboxItemMod.default
import typingsJapgolly.antdMobile.checkboxPropsTypeMod.OnChangeParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CheckboxItem {
  def apply(
    checkboxProps: CheckboxProps = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    extra: VdomNode = null,
    listPrefixCls: String = null,
    name: String = null,
    onChange: /* params */ OnChangeParams => Callback = null,
    onClick: /* e */ js.UndefOr[js.Any] => Callback = null,
    prefixCls: String = null,
    wrapLabel: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CheckboxItemProps, default, Unit, CheckboxItemProps] = {
    val __obj = js.Dynamic.literal()
  
      if (checkboxProps != null) __obj.updateDynamic("checkboxProps")(checkboxProps.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.rawNode.asInstanceOf[js.Any])
    if (listPrefixCls != null) __obj.updateDynamic("listPrefixCls")(listPrefixCls.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.antdMobile.checkboxPropsTypeMod.OnChangeParams) => onChange(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[js.Any]) => onClick(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapLabel)) __obj.updateDynamic("wrapLabel")(wrapLabel.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobile.checkboxItemMod.CheckboxItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobile.checkboxItemMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobile.checkboxItemMod.CheckboxItemProps])(children: _*)
  }
  @JSImport("antd-mobile/lib/checkbox/CheckboxItem", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

