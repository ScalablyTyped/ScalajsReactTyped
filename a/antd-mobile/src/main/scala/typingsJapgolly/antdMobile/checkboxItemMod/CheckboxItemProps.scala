package typingsJapgolly.antdMobile.checkboxItemMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antdMobile.checkboxCheckboxMod.CheckboxProps
import typingsJapgolly.antdMobile.checkboxPropsTypeMod.CheckboxItemPropsType
import typingsJapgolly.antdMobile.checkboxPropsTypeMod.OnChangeParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxItemProps extends CheckboxItemPropsType {
  var checkboxProps: js.UndefOr[CheckboxProps] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var listPrefixCls: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var wrapLabel: js.UndefOr[Boolean] = js.undefined
}

object CheckboxItemProps {
  @scala.inline
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
    wrapLabel: js.UndefOr[Boolean] = js.undefined
  ): CheckboxItemProps = {
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
    __obj.asInstanceOf[CheckboxItemProps]
  }
}

