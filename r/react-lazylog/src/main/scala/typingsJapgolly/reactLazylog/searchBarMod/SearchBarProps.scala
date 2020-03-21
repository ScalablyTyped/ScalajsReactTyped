package typingsJapgolly.reactLazylog.searchBarMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchBarProps extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var filterActive: js.UndefOr[Boolean] = js.undefined
  var onClearSearch: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onFilterLinesWithMatches: js.UndefOr[js.Function1[/* isFiltered */ Boolean, Unit]] = js.undefined
  var onSearch: js.UndefOr[js.Function1[/* keyword */ String, Unit]] = js.undefined
  var resultsCount: js.UndefOr[Double] = js.undefined
}

object SearchBarProps {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    filterActive: js.UndefOr[Boolean] = js.undefined,
    onClearSearch: js.UndefOr[Callback] = js.undefined,
    onFilterLinesWithMatches: /* isFiltered */ Boolean => Callback = null,
    onSearch: /* keyword */ String => Callback = null,
    resultsCount: Int | Double = null
  ): SearchBarProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(filterActive)) __obj.updateDynamic("filterActive")(filterActive.asInstanceOf[js.Any])
    onClearSearch.foreach(p => __obj.updateDynamic("onClearSearch")(p.toJsFn))
    if (onFilterLinesWithMatches != null) __obj.updateDynamic("onFilterLinesWithMatches")(js.Any.fromFunction1((t0: /* isFiltered */ scala.Boolean) => onFilterLinesWithMatches(t0).runNow()))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction1((t0: /* keyword */ java.lang.String) => onSearch(t0).runNow()))
    if (resultsCount != null) __obj.updateDynamic("resultsCount")(resultsCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBarProps]
  }
}

