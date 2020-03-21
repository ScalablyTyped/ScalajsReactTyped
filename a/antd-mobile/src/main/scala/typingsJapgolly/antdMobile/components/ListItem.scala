package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.antdMobile.antdMobileStrings._empty
import typingsJapgolly.antdMobile.antdMobileStrings.android
import typingsJapgolly.antdMobile.antdMobileStrings.bottom
import typingsJapgolly.antdMobile.antdMobileStrings.down
import typingsJapgolly.antdMobile.antdMobileStrings.empty
import typingsJapgolly.antdMobile.antdMobileStrings.horizontal
import typingsJapgolly.antdMobile.antdMobileStrings.ios
import typingsJapgolly.antdMobile.antdMobileStrings.middle
import typingsJapgolly.antdMobile.antdMobileStrings.top
import typingsJapgolly.antdMobile.antdMobileStrings.up
import typingsJapgolly.antdMobile.listItemMod.ListItemProps
import typingsJapgolly.antdMobile.listItemMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListItem {
  def apply(
    activeStyle: CSSProperties = null,
    align: top | middle | bottom = null,
    arrow: horizontal | down | up | empty | _empty = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    extra: VdomNode = null,
    multipleLine: js.UndefOr[Boolean] = js.undefined,
    onClick: ReactMouseEventFrom[HTMLDivElement] => Callback = null,
    platform: android | ios = null,
    prefixCls: String = null,
    role: String = null,
    style: CSSProperties = null,
    thumb: VdomNode = null,
    wrap: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ListItemProps, default, Unit, ListItemProps] = {
    val __obj = js.Dynamic.literal()
  
      if (activeStyle != null) __obj.updateDynamic("activeStyle")(activeStyle.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (arrow != null) __obj.updateDynamic("arrow")(arrow.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleLine)) __obj.updateDynamic("multipleLine")(multipleLine.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onClick(t0).runNow()))
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobile.listItemMod.ListItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobile.listItemMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobile.listItemMod.ListItemProps])(children: _*)
  }
  @JSImport("antd-mobile/lib/list/ListItem", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

