package typingsJapgolly.kendoUi.kendo.data

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HierarchicalDataSourceOptions extends DataSourceOptions {
  @JSName("schema")
  var schema_HierarchicalDataSourceOptions: js.UndefOr[HierarchicalDataSourceSchema] = js.undefined
}

object HierarchicalDataSourceOptions {
  @scala.inline
  def apply(
    aggregate: js.Array[DataSourceAggregateItem] = null,
    autoSync: js.UndefOr[Boolean] = js.undefined,
    batch: js.UndefOr[Boolean] = js.undefined,
    change: /* e */ DataSourceChangeEvent => Callback = null,
    data: js.Any = null,
    error: /* e */ DataSourceErrorEvent => Callback = null,
    filter: js.Any = null,
    group: DataSourceGroupItem | js.Array[DataSourceGroupItem] = null,
    inPlaceSort: js.UndefOr[Boolean] = js.undefined,
    offlineStorage: js.Any = null,
    page: Int | Double = null,
    pageSize: Int | Double = null,
    push: /* e */ DataSourcePushEvent => Callback = null,
    requestEnd: /* e */ DataSourceRequestEndEvent => Callback = null,
    requestStart: /* e */ DataSourceRequestStartEvent => Callback = null,
    schema: HierarchicalDataSourceSchema = null,
    serverAggregates: js.UndefOr[Boolean] = js.undefined,
    serverFiltering: js.UndefOr[Boolean] = js.undefined,
    serverGrouping: js.UndefOr[Boolean] = js.undefined,
    serverPaging: js.UndefOr[Boolean] = js.undefined,
    serverSorting: js.UndefOr[Boolean] = js.undefined,
    sort: js.Any = null,
    sync: /* e */ DataSourceEvent => Callback = null,
    transport: DataSourceTransport = null,
    `type`: String = null
  ): HierarchicalDataSourceOptions = {
    val __obj = js.Dynamic.literal()
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate.asInstanceOf[js.Any])
    if (!js.isUndefined(autoSync)) __obj.updateDynamic("autoSync")(autoSync.asInstanceOf[js.Any])
    if (!js.isUndefined(batch)) __obj.updateDynamic("batch")(batch.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.data.DataSourceChangeEvent) => change(t0).runNow()))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.data.DataSourceErrorEvent) => error(t0).runNow()))
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (!js.isUndefined(inPlaceSort)) __obj.updateDynamic("inPlaceSort")(inPlaceSort.asInstanceOf[js.Any])
    if (offlineStorage != null) __obj.updateDynamic("offlineStorage")(offlineStorage.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (push != null) __obj.updateDynamic("push")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.data.DataSourcePushEvent) => push(t0).runNow()))
    if (requestEnd != null) __obj.updateDynamic("requestEnd")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.data.DataSourceRequestEndEvent) => requestEnd(t0).runNow()))
    if (requestStart != null) __obj.updateDynamic("requestStart")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.data.DataSourceRequestStartEvent) => requestStart(t0).runNow()))
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (!js.isUndefined(serverAggregates)) __obj.updateDynamic("serverAggregates")(serverAggregates.asInstanceOf[js.Any])
    if (!js.isUndefined(serverFiltering)) __obj.updateDynamic("serverFiltering")(serverFiltering.asInstanceOf[js.Any])
    if (!js.isUndefined(serverGrouping)) __obj.updateDynamic("serverGrouping")(serverGrouping.asInstanceOf[js.Any])
    if (!js.isUndefined(serverPaging)) __obj.updateDynamic("serverPaging")(serverPaging.asInstanceOf[js.Any])
    if (!js.isUndefined(serverSorting)) __obj.updateDynamic("serverSorting")(serverSorting.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (sync != null) __obj.updateDynamic("sync")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.data.DataSourceEvent) => sync(t0).runNow()))
    if (transport != null) __obj.updateDynamic("transport")(transport.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HierarchicalDataSourceOptions]
  }
}

