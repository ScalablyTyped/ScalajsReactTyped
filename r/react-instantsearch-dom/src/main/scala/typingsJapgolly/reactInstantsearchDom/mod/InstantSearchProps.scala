package typingsJapgolly.reactInstantsearchDom.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactInstantsearchDom.AnonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactInstantsearchDom.mod.UsingSearchClientProps
  - typingsJapgolly.reactInstantsearchDom.mod.UsingManualInfoProps
*/
trait InstantSearchProps extends js.Object

object InstantSearchProps {
  @scala.inline
  def UsingSearchClientProps(
    indexName: String,
    searchClient: js.Any,
    createURL: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    onSearchParameters: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    onSearchStateChange: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    refresh: js.UndefOr[Boolean] = js.undefined,
    resultsState: js.Any = null,
    root: AnonProps = null,
    searchState: js.Any = null,
    stalledSearchDelay: Int | Double = null
  ): InstantSearchProps = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any], searchClient = searchClient.asInstanceOf[js.Any])
    if (createURL != null) __obj.updateDynamic("createURL")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => createURL(t0).runNow()))
    if (onSearchParameters != null) __obj.updateDynamic("onSearchParameters")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onSearchParameters(t0).runNow()))
    if (onSearchStateChange != null) __obj.updateDynamic("onSearchStateChange")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onSearchStateChange(t0).runNow()))
    if (!js.isUndefined(refresh)) __obj.updateDynamic("refresh")(refresh.asInstanceOf[js.Any])
    if (resultsState != null) __obj.updateDynamic("resultsState")(resultsState.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (searchState != null) __obj.updateDynamic("searchState")(searchState.asInstanceOf[js.Any])
    if (stalledSearchDelay != null) __obj.updateDynamic("stalledSearchDelay")(stalledSearchDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstantSearchProps]
  }
  @scala.inline
  def UsingManualInfoProps(
    apiKey: String,
    appId: String,
    indexName: String,
    algoliaClient: js.Any = null,
    createURL: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    onSearchParameters: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    onSearchStateChange: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    refresh: js.UndefOr[Boolean] = js.undefined,
    resultsState: js.Any = null,
    root: AnonProps = null,
    searchState: js.Any = null,
    stalledSearchDelay: Int | Double = null
  ): InstantSearchProps = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any], indexName = indexName.asInstanceOf[js.Any])
    if (algoliaClient != null) __obj.updateDynamic("algoliaClient")(algoliaClient.asInstanceOf[js.Any])
    if (createURL != null) __obj.updateDynamic("createURL")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => createURL(t0).runNow()))
    if (onSearchParameters != null) __obj.updateDynamic("onSearchParameters")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onSearchParameters(t0).runNow()))
    if (onSearchStateChange != null) __obj.updateDynamic("onSearchStateChange")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onSearchStateChange(t0).runNow()))
    if (!js.isUndefined(refresh)) __obj.updateDynamic("refresh")(refresh.asInstanceOf[js.Any])
    if (resultsState != null) __obj.updateDynamic("resultsState")(resultsState.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (searchState != null) __obj.updateDynamic("searchState")(searchState.asInstanceOf[js.Any])
    if (stalledSearchDelay != null) __obj.updateDynamic("stalledSearchDelay")(stalledSearchDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstantSearchProps]
  }
}

