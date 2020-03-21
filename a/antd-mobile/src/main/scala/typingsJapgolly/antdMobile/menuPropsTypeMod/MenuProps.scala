package typingsJapgolly.antdMobile.menuPropsTypeMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.antdMobile.antdMobileNumbers.`1`
import typingsJapgolly.antdMobile.antdMobileNumbers.`2`
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuProps extends js.Object {
  var MenuSelectContanerPrefixCls: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Array[DataItem]] = js.undefined
  var defaultValue: js.UndefOr[ValueType] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var level: js.UndefOr[`1` | `2`] = js.undefined
  var multiSelect: js.UndefOr[Boolean] = js.undefined
  var multiSelectMenuBtnsCls: js.UndefOr[String] = js.undefined
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[ValueType], Unit]] = js.undefined
  var onOk: js.UndefOr[js.Function1[/* value */ js.UndefOr[ValueType], Unit]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var radioPrefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var subMenuPrefixCls: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[ValueType] = js.undefined
}

object MenuProps {
  @scala.inline
  def apply(
    MenuSelectContanerPrefixCls: String = null,
    className: String = null,
    data: js.Array[DataItem] = null,
    defaultValue: ValueType = null,
    height: Int | Double = null,
    level: `1` | `2` = null,
    multiSelect: js.UndefOr[Boolean] = js.undefined,
    multiSelectMenuBtnsCls: String = null,
    onCancel: js.UndefOr[Callback] = js.undefined,
    onChange: /* value */ js.UndefOr[ValueType] => Callback = null,
    onOk: /* value */ js.UndefOr[ValueType] => Callback = null,
    prefixCls: String = null,
    radioPrefixCls: String = null,
    style: CSSProperties = null,
    subMenuPrefixCls: String = null,
    value: ValueType = null
  ): MenuProps = {
    val __obj = js.Dynamic.literal()
    if (MenuSelectContanerPrefixCls != null) __obj.updateDynamic("MenuSelectContanerPrefixCls")(MenuSelectContanerPrefixCls.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(multiSelect)) __obj.updateDynamic("multiSelect")(multiSelect.asInstanceOf[js.Any])
    if (multiSelectMenuBtnsCls != null) __obj.updateDynamic("multiSelectMenuBtnsCls")(multiSelectMenuBtnsCls.asInstanceOf[js.Any])
    onCancel.foreach(p => __obj.updateDynamic("onCancel")(p.toJsFn))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[typingsJapgolly.antdMobile.menuPropsTypeMod.ValueType]) => onChange(t0).runNow()))
    if (onOk != null) __obj.updateDynamic("onOk")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[typingsJapgolly.antdMobile.menuPropsTypeMod.ValueType]) => onOk(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (radioPrefixCls != null) __obj.updateDynamic("radioPrefixCls")(radioPrefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subMenuPrefixCls != null) __obj.updateDynamic("subMenuPrefixCls")(subMenuPrefixCls.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuProps]
  }
}

