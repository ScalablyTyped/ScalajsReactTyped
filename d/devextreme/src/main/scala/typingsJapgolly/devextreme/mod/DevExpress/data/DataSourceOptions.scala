package typingsJapgolly.devextreme.mod.DevExpress.data

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.AnonChanges
import typingsJapgolly.devextreme.AnonMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceOptions extends js.Object {
  /** Custom parameters that should be passed to an OData service with the load query. Available only for the ODataStore. */
  var customQueryParams: js.UndefOr[js.Any] = js.undefined
  /** Specifies the navigation properties to be loaded with the OData entity. Available only for the ODataStore. */
  var expand: js.UndefOr[js.Array[String] | String] = js.undefined
  /** Specifies data filtering conditions. */
  var filter: js.UndefOr[String | js.Array[_] | js.Function] = js.undefined
  /** Specifies data grouping options. */
  var group: js.UndefOr[String | js.Array[_] | js.Function] = js.undefined
  /** Specifies an item mapping function. */
  var map: js.UndefOr[js.Function1[/* dataItem */ js.Any, _]] = js.undefined
  /** A function that is executed after data is loaded. */
  var onChanged: js.UndefOr[js.Function1[/* e */ AnonChanges, _]] = js.undefined
  /** A function that is executed when data loading fails. */
  var onLoadError: js.UndefOr[js.Function1[/* error */ AnonMessage, _]] = js.undefined
  /** A function that is executed when the data loading status changes. */
  var onLoadingChanged: js.UndefOr[js.Function1[/* isLoading */ Boolean, _]] = js.undefined
  /** Specifies the maximum number of data items per page. Applies only if paginate is true. */
  var pageSize: js.UndefOr[Double] = js.undefined
  /** Specifies whether the DataSource loads data items by pages or all at once. Defaults to false if group is set; otherwise, true. */
  var paginate: js.UndefOr[Boolean] = js.undefined
  /** Specifies a post processing function. */
  var postProcess: js.UndefOr[js.Function1[/* data */ js.Array[_], js.Array[_]]] = js.undefined
  /** Specifies the period (in milliseconds) when changes are aggregated before pushing them to the DataSource. */
  var pushAggregationTimeout: js.UndefOr[Double] = js.undefined
  /** Specifies whether the DataSource requests the total count of data items in the storage. */
  var requireTotalCount: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether to reapply sorting, filtering, grouping, and other data processing operations after receiving a push. */
  var reshapeOnPush: js.UndefOr[Boolean] = js.undefined
  /** Specifies the fields to search. */
  var searchExpr: js.UndefOr[String | js.Function | (js.Array[String | js.Function])] = js.undefined
  /** Specifies the comparison operation used in searching. The following values are accepted: "=", "<>", ">", ">=", "<", "<=", "startswith", "endswith", "contains", "notcontains". */
  var searchOperation: js.UndefOr[String] = js.undefined
  /** Specifies the value to which the search expression is compared. */
  var searchValue: js.UndefOr[js.Any] = js.undefined
  /** Specifies the fields to select from data objects. */
  var select: js.UndefOr[String | js.Array[_] | js.Function] = js.undefined
  /** Specifies data sorting options. */
  var sort: js.UndefOr[String | js.Array[_] | js.Function] = js.undefined
  /** Configures the store underlying the DataSource. */
  var store: js.UndefOr[Store | StoreOptions[Store] | js.Array[_] | js.Any] = js.undefined
}

object DataSourceOptions {
  @scala.inline
  def apply(
    customQueryParams: js.Any = null,
    expand: js.Array[String] | String = null,
    filter: String | js.Array[_] | js.Function = null,
    group: String | js.Array[_] | js.Function = null,
    map: /* dataItem */ js.Any => CallbackTo[js.Any] = null,
    onChanged: /* e */ AnonChanges => CallbackTo[js.Any] = null,
    onLoadError: /* error */ AnonMessage => CallbackTo[js.Any] = null,
    onLoadingChanged: /* isLoading */ Boolean => CallbackTo[js.Any] = null,
    pageSize: Int | Double = null,
    paginate: js.UndefOr[Boolean] = js.undefined,
    postProcess: /* data */ js.Array[js.Any] => CallbackTo[js.Array[js.Any]] = null,
    pushAggregationTimeout: Int | Double = null,
    requireTotalCount: js.UndefOr[Boolean] = js.undefined,
    reshapeOnPush: js.UndefOr[Boolean] = js.undefined,
    searchExpr: String | js.Function | (js.Array[String | js.Function]) = null,
    searchOperation: String = null,
    searchValue: js.Any = null,
    select: String | js.Array[_] | js.Function = null,
    sort: String | js.Array[_] | js.Function = null,
    store: Store | StoreOptions[Store] | js.Array[_] | js.Any = null
  ): DataSourceOptions = {
    val __obj = js.Dynamic.literal()
    if (customQueryParams != null) __obj.updateDynamic("customQueryParams")(customQueryParams.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(js.Any.fromFunction1((t0: /* dataItem */ js.Any) => map(t0).runNow()))
    if (onChanged != null) __obj.updateDynamic("onChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonChanges) => onChanged(t0).runNow()))
    if (onLoadError != null) __obj.updateDynamic("onLoadError")(js.Any.fromFunction1((t0: /* error */ typingsJapgolly.devextreme.AnonMessage) => onLoadError(t0).runNow()))
    if (onLoadingChanged != null) __obj.updateDynamic("onLoadingChanged")(js.Any.fromFunction1((t0: /* isLoading */ scala.Boolean) => onLoadingChanged(t0).runNow()))
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(paginate)) __obj.updateDynamic("paginate")(paginate.asInstanceOf[js.Any])
    if (postProcess != null) __obj.updateDynamic("postProcess")(js.Any.fromFunction1((t0: /* data */ js.Array[js.Any]) => postProcess(t0).runNow()))
    if (pushAggregationTimeout != null) __obj.updateDynamic("pushAggregationTimeout")(pushAggregationTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(requireTotalCount)) __obj.updateDynamic("requireTotalCount")(requireTotalCount.asInstanceOf[js.Any])
    if (!js.isUndefined(reshapeOnPush)) __obj.updateDynamic("reshapeOnPush")(reshapeOnPush.asInstanceOf[js.Any])
    if (searchExpr != null) __obj.updateDynamic("searchExpr")(searchExpr.asInstanceOf[js.Any])
    if (searchOperation != null) __obj.updateDynamic("searchOperation")(searchOperation.asInstanceOf[js.Any])
    if (searchValue != null) __obj.updateDynamic("searchValue")(searchValue.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceOptions]
  }
}

