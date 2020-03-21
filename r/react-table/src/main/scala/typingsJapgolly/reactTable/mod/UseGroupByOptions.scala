package typingsJapgolly.reactTable.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  manualGroupBy  :boolean,   disableGroupBy  :boolean,   defaultCanGroupBy  :boolean,   aggregations  :std.Record<string, react-table.react-table.AggregatorFn<D>>, groupByFn (rows : std.Array<react-table.react-table.Row<D>>, columnId : react-table.react-table.IdType<D>): std.Record<string, react-table.react-table.Row<D>>,   autoResetGroupBy ? :boolean}> */
trait UseGroupByOptions[D /* <: js.Object */] extends js.Object {
  var aggregations: js.UndefOr[Record[String, AggregatorFn[D]]] = js.undefined
  var autoResetGroupBy: js.UndefOr[Boolean] = js.undefined
  var defaultCanGroupBy: js.UndefOr[Boolean] = js.undefined
  var disableGroupBy: js.UndefOr[Boolean] = js.undefined
  var groupByFn: js.UndefOr[
    js.Function2[/* rows */ js.Array[Row[D]], /* columnId */ IdType[D], Record[String, Row[D]]]
  ] = js.undefined
  var manualGroupBy: js.UndefOr[Boolean] = js.undefined
}

object UseGroupByOptions {
  @scala.inline
  def apply[D /* <: js.Object */](
    aggregations: Record[String, AggregatorFn[D]] = null,
    autoResetGroupBy: js.UndefOr[Boolean] = js.undefined,
    defaultCanGroupBy: js.UndefOr[Boolean] = js.undefined,
    disableGroupBy: js.UndefOr[Boolean] = js.undefined,
    groupByFn: (/* rows */ js.Array[Row[D]], /* columnId */ IdType[D]) => CallbackTo[Record[String, Row[D]]] = null,
    manualGroupBy: js.UndefOr[Boolean] = js.undefined
  ): UseGroupByOptions[D] = {
    val __obj = js.Dynamic.literal()
    if (aggregations != null) __obj.updateDynamic("aggregations")(aggregations.asInstanceOf[js.Any])
    if (!js.isUndefined(autoResetGroupBy)) __obj.updateDynamic("autoResetGroupBy")(autoResetGroupBy.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultCanGroupBy)) __obj.updateDynamic("defaultCanGroupBy")(defaultCanGroupBy.asInstanceOf[js.Any])
    if (!js.isUndefined(disableGroupBy)) __obj.updateDynamic("disableGroupBy")(disableGroupBy.asInstanceOf[js.Any])
    if (groupByFn != null) __obj.updateDynamic("groupByFn")(js.Any.fromFunction2((t0: /* rows */ js.Array[typingsJapgolly.reactTable.mod.Row[D]], t1: /* columnId */ typingsJapgolly.reactTable.mod.IdType[D]) => groupByFn(t0, t1).runNow()))
    if (!js.isUndefined(manualGroupBy)) __obj.updateDynamic("manualGroupBy")(manualGroupBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseGroupByOptions[D]]
  }
}

