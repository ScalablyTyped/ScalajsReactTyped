package typingsJapgolly.semanticUiReact.paginationItemMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLAnchorElement
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.ellipsisItem
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.firstItem
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.lastItem
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.nextItem
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.pageItem
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.prevItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictPaginationItemProps extends js.Object {
  /** A pagination item can be active. */
  var active: js.UndefOr[Boolean] = js.undefined
  /** A pagination item can be disabled. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Called on click.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ ReactMouseEventFrom[HTMLAnchorElement], 
      /* data */ PaginationItemProps, 
      Unit
    ]
  ] = js.undefined
  /**
    * Called on key down.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onKeyDown: js.UndefOr[
    js.Function2[
      /* event */ ReactMouseEventFrom[HTMLAnchorElement], 
      /* data */ PaginationItemProps, 
      Unit
    ]
  ] = js.undefined
  /** A pagination should have a type. */
  var `type`: js.UndefOr[ellipsisItem | firstItem | prevItem | pageItem | nextItem | lastItem] = js.undefined
}

object StrictPaginationItemProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onClick: (/* event */ ReactMouseEventFrom[HTMLAnchorElement], /* data */ PaginationItemProps) => Callback = null,
    onKeyDown: (/* event */ ReactMouseEventFrom[HTMLAnchorElement], /* data */ PaginationItemProps) => Callback = null,
    `type`: ellipsisItem | firstItem | prevItem | pageItem | nextItem | lastItem = null
  ): StrictPaginationItemProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLAnchorElement], t1: /* data */ typingsJapgolly.semanticUiReact.paginationItemMod.PaginationItemProps) => onClick(t0, t1).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLAnchorElement], t1: /* data */ typingsJapgolly.semanticUiReact.paginationItemMod.PaginationItemProps) => onKeyDown(t0, t1).runNow()))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictPaginationItemProps]
  }
}

