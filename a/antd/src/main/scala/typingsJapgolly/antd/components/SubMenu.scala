package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.libMenuSubMenuMod.SubMenuProps
import typingsJapgolly.antd.libMenuSubMenuMod.TitleEventEntity
import typingsJapgolly.antd.libMenuSubMenuMod.default
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SubMenu {
  def apply(
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onTitleClick: /* e */ TitleEventEntity => Callback = null,
    onTitleMouseEnter: /* e */ TitleEventEntity => Callback = null,
    onTitleMouseLeave: /* e */ TitleEventEntity => Callback = null,
    popupClassName: String = null,
    popupOffset: js.Tuple2[Double, Double] = null,
    rootPrefixCls: String = null,
    style: CSSProperties = null,
    title: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SubMenuProps, default, Unit, SubMenuProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onTitleClick != null) __obj.updateDynamic("onTitleClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.antd.libMenuSubMenuMod.TitleEventEntity) => onTitleClick(t0).runNow()))
    if (onTitleMouseEnter != null) __obj.updateDynamic("onTitleMouseEnter")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.antd.libMenuSubMenuMod.TitleEventEntity) => onTitleMouseEnter(t0).runNow()))
    if (onTitleMouseLeave != null) __obj.updateDynamic("onTitleMouseLeave")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.antd.libMenuSubMenuMod.TitleEventEntity) => onTitleMouseLeave(t0).runNow()))
    if (popupClassName != null) __obj.updateDynamic("popupClassName")(popupClassName.asInstanceOf[js.Any])
    if (popupOffset != null) __obj.updateDynamic("popupOffset")(popupOffset.asInstanceOf[js.Any])
    if (rootPrefixCls != null) __obj.updateDynamic("rootPrefixCls")(rootPrefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.libMenuSubMenuMod.SubMenuProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.libMenuSubMenuMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.libMenuSubMenuMod.SubMenuProps])(children: _*)
  }
  @JSImport("antd/lib/menu/SubMenu", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

