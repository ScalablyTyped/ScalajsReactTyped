package typingsJapgolly.antdMobile.radioRadioMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.antdMobile.AnonTarget
import typingsJapgolly.antdMobile.radioPropsTypeMod.RadioPropsType
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioProps extends RadioPropsType {
  var className: js.UndefOr[String] = js.undefined
  var listPrefixCls: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object RadioProps {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    listPrefixCls: String = null,
    name: String = null,
    onChange: /* e */ AnonTarget => Callback = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    wrapLabel: js.UndefOr[Boolean] = js.undefined
  ): RadioProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (listPrefixCls != null) __obj.updateDynamic("listPrefixCls")(listPrefixCls.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.antdMobile.AnonTarget) => onChange(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapLabel)) __obj.updateDynamic("wrapLabel")(wrapLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioProps]
  }
}

