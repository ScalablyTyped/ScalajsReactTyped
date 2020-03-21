package typingsJapgolly.semanticUiReact.paginationPaginationMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLAnchorElement
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.paginationItemMod.PaginationItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationProps
  extends StrictPaginationProps
     with /* key */ StringDictionary[js.Any]

object PaginationProps {
  @scala.inline
  def apply(
    totalPages: Double | String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    activePage: Double | String = null,
    `aria-label`: String = null,
    boundaryRange: Double | String = null,
    defaultActivePage: Double | String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    ellipsisItem: SemanticShorthandItem[PaginationItemProps] = null,
    firstItem: SemanticShorthandItem[PaginationItemProps] = null,
    lastItem: SemanticShorthandItem[PaginationItemProps] = null,
    nextItem: SemanticShorthandItem[PaginationItemProps] = null,
    onPageChange: (/* event */ ReactMouseEventFrom[HTMLAnchorElement], /* data */ PaginationProps) => Callback = null,
    pageItem: SemanticShorthandItem[PaginationItemProps] = null,
    prevItem: SemanticShorthandItem[PaginationItemProps] = null,
    siblingRange: Double | String = null
  ): PaginationProps = {
    val __obj = js.Dynamic.literal(totalPages = totalPages.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (activePage != null) __obj.updateDynamic("activePage")(activePage.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (boundaryRange != null) __obj.updateDynamic("boundaryRange")(boundaryRange.asInstanceOf[js.Any])
    if (defaultActivePage != null) __obj.updateDynamic("defaultActivePage")(defaultActivePage.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (ellipsisItem != null) __obj.updateDynamic("ellipsisItem")(ellipsisItem.asInstanceOf[js.Any])
    if (firstItem != null) __obj.updateDynamic("firstItem")(firstItem.asInstanceOf[js.Any])
    if (lastItem != null) __obj.updateDynamic("lastItem")(lastItem.asInstanceOf[js.Any])
    if (nextItem != null) __obj.updateDynamic("nextItem")(nextItem.asInstanceOf[js.Any])
    if (onPageChange != null) __obj.updateDynamic("onPageChange")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLAnchorElement], t1: /* data */ typingsJapgolly.semanticUiReact.paginationPaginationMod.PaginationProps) => onPageChange(t0, t1).runNow()))
    if (pageItem != null) __obj.updateDynamic("pageItem")(pageItem.asInstanceOf[js.Any])
    if (prevItem != null) __obj.updateDynamic("prevItem")(prevItem.asInstanceOf[js.Any])
    if (siblingRange != null) __obj.updateDynamic("siblingRange")(siblingRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationProps]
  }
}

