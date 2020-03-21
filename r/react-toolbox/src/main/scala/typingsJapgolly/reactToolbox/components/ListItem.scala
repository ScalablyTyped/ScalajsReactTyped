package typingsJapgolly.reactToolbox.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ReactChild
import typingsJapgolly.reactToolbox.listListItemActionsMod.ListItemActionsTheme
import typingsJapgolly.reactToolbox.listListItemContentMod.ListItemContentTheme
import typingsJapgolly.reactToolbox.listListItemLayoutMod.ListItemLayoutProps
import typingsJapgolly.reactToolbox.listListItemLayoutMod.ListItemLayoutTheme
import typingsJapgolly.reactToolbox.listListItemMod.ListItemProps
import typingsJapgolly.reactToolbox.listListItemMod.ListItemTheme
import typingsJapgolly.reactToolbox.listListItemTextMod.ListItemTextTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListItem {
  def apply(
    avatar: String | Element = null,
    caption: String = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    itemContent: ReactChild = null,
    leftActions: js.Array[Node] = null,
    leftIcon: String | Element = null,
    legend: String = null,
    onClick: js.Function = null,
    onContextMenu: js.Function = null,
    onDoubleClick: js.Function = null,
    onDrag: js.Function = null,
    onDragEnd: js.Function = null,
    onDragEnter: js.Function = null,
    onDragExit: js.Function = null,
    onDragLeave: js.Function = null,
    onDragOver: js.Function = null,
    onDragStart: js.Function = null,
    onDrop: js.Function = null,
    onMouseDown: js.Function = null,
    onMouseEnter: js.Function = null,
    onMouseLeave: js.Function = null,
    onMouseMove: js.Function = null,
    onMouseOut: js.Function = null,
    onMouseOver: js.Function = null,
    onMouseUp: js.Function = null,
    onTouchCancel: js.Function = null,
    onTouchEnd: js.Function = null,
    onTouchMove: js.Function = null,
    onTouchStart: js.Function = null,
    rightActions: js.Array[Node] = null,
    rightIcon: String | Element = null,
    ripple: js.UndefOr[Boolean] = js.undefined,
    selectable: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    theme: ListItemTheme with ListItemActionsTheme with ListItemContentTheme with ListItemLayoutTheme with ListItemTextTheme = null,
    to: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ListItemProps with ListItemLayoutProps, 
    typingsJapgolly.reactToolbox.mod.ListItem, 
    Unit, 
    ListItemProps with ListItemLayoutProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (itemContent != null) __obj.updateDynamic("itemContent")(itemContent.asInstanceOf[js.Any])
    if (leftActions != null) __obj.updateDynamic("leftActions")(leftActions.asInstanceOf[js.Any])
    if (leftIcon != null) __obj.updateDynamic("leftIcon")(leftIcon.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(onContextMenu.asInstanceOf[js.Any])
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(onDoubleClick.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag.asInstanceOf[js.Any])
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd.asInstanceOf[js.Any])
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(onDragEnter.asInstanceOf[js.Any])
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(onDragExit.asInstanceOf[js.Any])
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(onDragLeave.asInstanceOf[js.Any])
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(onDragOver.asInstanceOf[js.Any])
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart.asInstanceOf[js.Any])
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop.asInstanceOf[js.Any])
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown.asInstanceOf[js.Any])
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter.asInstanceOf[js.Any])
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave.asInstanceOf[js.Any])
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove.asInstanceOf[js.Any])
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(onMouseOut.asInstanceOf[js.Any])
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(onMouseOver.asInstanceOf[js.Any])
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp.asInstanceOf[js.Any])
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel.asInstanceOf[js.Any])
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd.asInstanceOf[js.Any])
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove.asInstanceOf[js.Any])
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart.asInstanceOf[js.Any])
    if (rightActions != null) __obj.updateDynamic("rightActions")(rightActions.asInstanceOf[js.Any])
    if (rightIcon != null) __obj.updateDynamic("rightIcon")(rightIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(ripple)) __obj.updateDynamic("ripple")(ripple.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactToolbox.listListItemMod.ListItemProps with typingsJapgolly.reactToolbox.listListItemLayoutMod.ListItemLayoutProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactToolbox.mod.ListItem](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactToolbox.listListItemMod.ListItemProps with typingsJapgolly.reactToolbox.listListItemLayoutMod.ListItemLayoutProps])(children: _*)
  }
  @JSImport("react-toolbox", "ListItem")
  @js.native
  object componentImport extends js.Object
  
}

