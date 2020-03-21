package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobile.antdMobileNumbers.`1`
import typingsJapgolly.antdMobile.antdMobileNumbers.`2`
import typingsJapgolly.antdMobile.menuMod.default
import typingsJapgolly.antdMobile.menuPropsTypeMod.DataItem
import typingsJapgolly.antdMobile.menuPropsTypeMod.MenuProps
import typingsJapgolly.antdMobile.menuPropsTypeMod.ValueType
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Menu {
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
    value: ValueType = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[MenuProps, default, Unit, MenuProps] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobile.menuPropsTypeMod.MenuProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobile.menuMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobile.menuPropsTypeMod.MenuProps])(children: _*)
  }
  @JSImport("antd-mobile/lib/menu", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

