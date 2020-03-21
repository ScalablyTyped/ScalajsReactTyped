package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.AnonItemAny
import typingsJapgolly.baseui.sideNavigationMod.Item
import typingsJapgolly.baseui.sideNavigationMod.NavItemOverrides
import typingsJapgolly.baseui.sideNavigationMod.NavItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NavItem {
  def apply(
    item: Item,
    $active: js.UndefOr[Boolean] = js.undefined,
    $level: Int | Double = null,
    $selectable: js.UndefOr[Boolean] = js.undefined,
    onSelect: /* args */ AnonItemAny => CallbackTo[js.Any] = null,
    overrides: NavItemOverrides = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[NavItemProps, typingsJapgolly.baseui.sideNavigationMod.NavItem, Unit, NavItemProps] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
  
      if (!js.isUndefined($active)) __obj.updateDynamic("$active")($active.asInstanceOf[js.Any])
    if ($level != null) __obj.updateDynamic("$level")($level.asInstanceOf[js.Any])
    if (!js.isUndefined($selectable)) __obj.updateDynamic("$selectable")($selectable.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonItemAny) => onSelect(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.baseui.sideNavigationMod.NavItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.baseui.sideNavigationMod.NavItem](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.sideNavigationMod.NavItemProps])(children: _*)
  }
  @JSImport("baseui/side-navigation", "NavItem")
  @js.native
  object componentImport extends js.Object
  
}

