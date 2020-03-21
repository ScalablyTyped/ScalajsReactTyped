package typingsJapgolly.tabulatorTables.Tabulator

import japgolly.scalajs.react.Callback
import typingsJapgolly.tabulatorTables.PickFilterfieldvalue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsFiltering extends js.Object {
  /** The dataFiltered callback is triggered after the table dataset is filtered. */
  var dataFiltered: js.UndefOr[
    js.Function2[/* filters */ js.Array[Filter], /* rows */ js.Array[RowComponent], Unit]
  ] = js.undefined
  /** The dataFiltering callback is triggered whenever a filter event occurs, before the filter happens. */
  var dataFiltering: js.UndefOr[js.Function1[/* filters */ js.Array[Filter], Unit]] = js.undefined
  /** Array of filters to be applied on load.	 */
  var initialFilter: js.UndefOr[js.Array[Filter]] = js.undefined
  /** array of initial values for header filters.	 */
  var initialHeaderFilter: js.UndefOr[js.Array[PickFilterfieldvalue]] = js.undefined
}

object OptionsFiltering {
  @scala.inline
  def apply(
    dataFiltered: (/* filters */ js.Array[Filter], /* rows */ js.Array[RowComponent]) => Callback = null,
    dataFiltering: /* filters */ js.Array[Filter] => Callback = null,
    initialFilter: js.Array[Filter] = null,
    initialHeaderFilter: js.Array[PickFilterfieldvalue] = null
  ): OptionsFiltering = {
    val __obj = js.Dynamic.literal()
    if (dataFiltered != null) __obj.updateDynamic("dataFiltered")(js.Any.fromFunction2((t0: /* filters */ js.Array[typingsJapgolly.tabulatorTables.Tabulator.Filter], t1: /* rows */ js.Array[typingsJapgolly.tabulatorTables.Tabulator.RowComponent]) => dataFiltered(t0, t1).runNow()))
    if (dataFiltering != null) __obj.updateDynamic("dataFiltering")(js.Any.fromFunction1((t0: /* filters */ js.Array[typingsJapgolly.tabulatorTables.Tabulator.Filter]) => dataFiltering(t0).runNow()))
    if (initialFilter != null) __obj.updateDynamic("initialFilter")(initialFilter.asInstanceOf[js.Any])
    if (initialHeaderFilter != null) __obj.updateDynamic("initialHeaderFilter")(initialHeaderFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsFiltering]
  }
}

