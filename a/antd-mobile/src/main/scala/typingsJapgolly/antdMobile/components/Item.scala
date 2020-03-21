package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobile.itemMod.PopoverItemProps
import typingsJapgolly.antdMobile.itemMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Item {
  def apply(
    activeStyle: CSSProperties = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    firstItem: String = null,
    icon: VdomNode = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PopoverItemProps, default, Unit, PopoverItemProps] = {
    val __obj = js.Dynamic.literal()
  
      if (activeStyle != null) __obj.updateDynamic("activeStyle")(activeStyle.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (firstItem != null) __obj.updateDynamic("firstItem")(firstItem.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.rawNode.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobile.itemMod.PopoverItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobile.itemMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobile.itemMod.PopoverItemProps])(children: _*)
  }
  @JSImport("antd-mobile/lib/popover/Item", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

