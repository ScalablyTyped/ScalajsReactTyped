package typingsJapgolly.reactInstantsearchDom.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactInstantsearchDom.AnonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstantSearchBaseProps extends js.Object {
  var createURL: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var indexName: String
  var onSearchParameters: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onSearchStateChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var refresh: js.UndefOr[Boolean] = js.undefined
  var resultsState: js.UndefOr[js.Any] = js.undefined
  var root: js.UndefOr[AnonProps] = js.undefined
  var searchState: js.UndefOr[js.Any] = js.undefined
  var stalledSearchDelay: js.UndefOr[Double] = js.undefined
}

object InstantSearchBaseProps {
  @scala.inline
  def apply(
    indexName: String,
    createURL: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    onSearchParameters: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    onSearchStateChange: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    refresh: js.UndefOr[Boolean] = js.undefined,
    resultsState: js.Any = null,
    root: AnonProps = null,
    searchState: js.Any = null,
    stalledSearchDelay: Int | Double = null
  ): InstantSearchBaseProps = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any])
    if (createURL != null) __obj.updateDynamic("createURL")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => createURL(t0).runNow()))
    if (onSearchParameters != null) __obj.updateDynamic("onSearchParameters")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onSearchParameters(t0).runNow()))
    if (onSearchStateChange != null) __obj.updateDynamic("onSearchStateChange")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onSearchStateChange(t0).runNow()))
    if (!js.isUndefined(refresh)) __obj.updateDynamic("refresh")(refresh.asInstanceOf[js.Any])
    if (resultsState != null) __obj.updateDynamic("resultsState")(resultsState.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (searchState != null) __obj.updateDynamic("searchState")(searchState.asInstanceOf[js.Any])
    if (stalledSearchDelay != null) __obj.updateDynamic("stalledSearchDelay")(stalledSearchDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstantSearchBaseProps]
  }
}

