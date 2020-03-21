package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLAnchorElement
import typingsJapgolly.semanticUiReact.paginationItemMod.PaginationItemProps
import typingsJapgolly.semanticUiReact.paginationItemMod.default
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.ellipsisItem
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.firstItem
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.lastItem
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.nextItem
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.pageItem
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.prevItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PaginationItem {
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onClick: (/* event */ ReactMouseEventFrom[HTMLAnchorElement], /* data */ PaginationItemProps) => Callback = null,
    onKeyDown: (/* event */ ReactMouseEventFrom[HTMLAnchorElement], /* data */ PaginationItemProps) => Callback = null,
    `type`: ellipsisItem | firstItem | prevItem | pageItem | nextItem | lastItem = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PaginationItemProps, default, Unit, PaginationItemProps] = {
    val __obj = js.Dynamic.literal()
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLAnchorElement], t1: /* data */ typingsJapgolly.semanticUiReact.paginationItemMod.PaginationItemProps) => onClick(t0, t1).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLAnchorElement], t1: /* data */ typingsJapgolly.semanticUiReact.paginationItemMod.PaginationItemProps) => onKeyDown(t0, t1).runNow()))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.semanticUiReact.paginationItemMod.PaginationItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.semanticUiReact.paginationItemMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.semanticUiReact.paginationItemMod.PaginationItemProps])(children: _*)
  }
  @JSImport("semantic-ui-react/dist/commonjs/addons/Pagination/PaginationItem", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

