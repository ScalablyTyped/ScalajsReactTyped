package typingsJapgolly.semanticDashUiDashReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLAnchorElement
import typingsJapgolly.semanticDashUiDashReact.distCommonjsCollectionsMenuMenuItemMod.MenuItemProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsCollectionsMenuMenuItemMod.default
import typingsJapgolly.semanticDashUiDashReact.distCommonjsElementsIconIconMod.IconProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticCOLORS
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.horizontally
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.left
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.right
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.vertically
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MenuItem {
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    as: js.Any = null,
    className: String = null,
    color: SemanticCOLORS = null,
    content: SemanticShorthandContent = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    fitted: Boolean | horizontally | vertically = null,
    header: js.UndefOr[Boolean] = js.undefined,
    icon: Boolean | SemanticShorthandItem[IconProps] = null,
    index: Int | Double = null,
    link: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onClick: (/* event */ ReactMouseEventFrom[HTMLAnchorElement], /* data */ MenuItemProps) => Callback = null,
    position: left | right = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[MenuItemProps, default, Unit, MenuItemProps] = {
    val __obj = js.Dynamic.literal()
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (fitted != null) __obj.updateDynamic("fitted")(fitted.asInstanceOf[js.Any])
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(link)) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLAnchorElement], t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsCollectionsMenuMenuItemMod.MenuItemProps) => onClick(t0, t1).runNow()))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.semanticDashUiDashReact.distCommonjsCollectionsMenuMenuItemMod.MenuItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.semanticDashUiDashReact.distCommonjsCollectionsMenuMenuItemMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.semanticDashUiDashReact.distCommonjsCollectionsMenuMenuItemMod.MenuItemProps])(children: _*)
  }
  @JSImport("semantic-ui-react/dist/commonjs/collections/Menu/MenuItem", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

