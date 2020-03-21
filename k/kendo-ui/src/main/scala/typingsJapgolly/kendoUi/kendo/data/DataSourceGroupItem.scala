package typingsJapgolly.kendoUi.kendo.data

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceGroupItem extends js.Object {
  var aggregates: js.UndefOr[js.Array[DataSourceGroupItemAggregate]] = js.undefined
  var compare: js.UndefOr[
    js.Function2[/* a */ DataSourceGroupCompareItem, /* b */ DataSourceGroupCompareItem, Double]
  ] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var field: js.UndefOr[String] = js.undefined
}

object DataSourceGroupItem {
  @scala.inline
  def apply(
    aggregates: js.Array[DataSourceGroupItemAggregate] = null,
    compare: (/* a */ DataSourceGroupCompareItem, /* b */ DataSourceGroupCompareItem) => CallbackTo[Double] = null,
    dir: String = null,
    field: String = null
  ): DataSourceGroupItem = {
    val __obj = js.Dynamic.literal()
    if (aggregates != null) __obj.updateDynamic("aggregates")(aggregates.asInstanceOf[js.Any])
    if (compare != null) __obj.updateDynamic("compare")(js.Any.fromFunction2((t0: /* a */ typingsJapgolly.kendoUi.kendo.data.DataSourceGroupCompareItem, t1: /* b */ typingsJapgolly.kendoUi.kendo.data.DataSourceGroupCompareItem) => compare(t0, t1).runNow()))
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceGroupItem]
  }
}

