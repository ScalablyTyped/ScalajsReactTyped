package typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsPaginationPaginationItemMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLAnchorElement
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.ellipsisItem
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.firstItem
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.lastItem
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.nextItem
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.pageItem
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.prevItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationItemProps
  extends StrictPaginationItemProps
     with /* key */ StringDictionary[js.Any]

object PaginationItemProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onClick: (/* event */ ReactMouseEventFrom[HTMLAnchorElement], /* data */ PaginationItemProps) => Callback = null,
    onKeyDown: (/* event */ ReactMouseEventFrom[HTMLAnchorElement], /* data */ PaginationItemProps) => Callback = null,
    `type`: ellipsisItem | firstItem | prevItem | pageItem | nextItem | lastItem = null
  ): PaginationItemProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLAnchorElement], t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsPaginationPaginationItemMod.PaginationItemProps) => onClick(t0, t1).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLAnchorElement], t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsPaginationPaginationItemMod.PaginationItemProps) => onKeyDown(t0, t1).runNow()))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationItemProps]
  }
}

