package typingsJapgolly.reactTable.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  manualSortBy  :boolean,   disableSortBy  :boolean,   defaultCanSort  :boolean,   disableMultiSort  :boolean, isMultiSortEvent (e : react.react.MouseEvent<std.Element, react.react.NativeMouseEvent>): boolean,   maxMultiSortColCount  :number,   disableSortRemove  :boolean,   disabledMultiRemove  :boolean, orderByFn (rows : std.Array<react-table.react-table.Row<D>>, sortFns : std.Array<react-table.react-table.SortByFn<D>>, directions : std.Array<boolean>): std.Array<react-table.react-table.Row<D>>,   sortTypes  :std.Record<string, react-table.react-table.SortByFn<D>>,   autoResetSortBy ? :boolean}> */
trait UseSortByOptions[D /* <: js.Object */] extends js.Object {
  var autoResetSortBy: js.UndefOr[Boolean] = js.undefined
  var defaultCanSort: js.UndefOr[Boolean] = js.undefined
  var disableMultiSort: js.UndefOr[Boolean] = js.undefined
  var disableSortBy: js.UndefOr[Boolean] = js.undefined
  var disableSortRemove: js.UndefOr[Boolean] = js.undefined
  var disabledMultiRemove: js.UndefOr[Boolean] = js.undefined
  var isMultiSortEvent: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[Element], Boolean]] = js.undefined
  var manualSortBy: js.UndefOr[Boolean] = js.undefined
  var maxMultiSortColCount: js.UndefOr[Double] = js.undefined
  var orderByFn: js.UndefOr[
    js.Function3[
      /* rows */ js.Array[Row[D]], 
      /* sortFns */ js.Array[SortByFn[D]], 
      /* directions */ js.Array[Boolean], 
      js.Array[Row[D]]
    ]
  ] = js.undefined
  var sortTypes: js.UndefOr[Record[String, SortByFn[D]]] = js.undefined
}

object UseSortByOptions {
  @scala.inline
  def apply[D /* <: js.Object */](
    autoResetSortBy: js.UndefOr[Boolean] = js.undefined,
    defaultCanSort: js.UndefOr[Boolean] = js.undefined,
    disableMultiSort: js.UndefOr[Boolean] = js.undefined,
    disableSortBy: js.UndefOr[Boolean] = js.undefined,
    disableSortRemove: js.UndefOr[Boolean] = js.undefined,
    disabledMultiRemove: js.UndefOr[Boolean] = js.undefined,
    isMultiSortEvent: /* e */ ReactMouseEventFrom[Element] => CallbackTo[Boolean] = null,
    manualSortBy: js.UndefOr[Boolean] = js.undefined,
    maxMultiSortColCount: Int | Double = null,
    orderByFn: (/* rows */ js.Array[Row[D]], /* sortFns */ js.Array[SortByFn[D]], /* directions */ js.Array[Boolean]) => CallbackTo[js.Array[Row[D]]] = null,
    sortTypes: Record[String, SortByFn[D]] = null
  ): UseSortByOptions[D] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoResetSortBy)) __obj.updateDynamic("autoResetSortBy")(autoResetSortBy.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultCanSort)) __obj.updateDynamic("defaultCanSort")(defaultCanSort.asInstanceOf[js.Any])
    if (!js.isUndefined(disableMultiSort)) __obj.updateDynamic("disableMultiSort")(disableMultiSort.asInstanceOf[js.Any])
    if (!js.isUndefined(disableSortBy)) __obj.updateDynamic("disableSortBy")(disableSortBy.asInstanceOf[js.Any])
    if (!js.isUndefined(disableSortRemove)) __obj.updateDynamic("disableSortRemove")(disableSortRemove.asInstanceOf[js.Any])
    if (!js.isUndefined(disabledMultiRemove)) __obj.updateDynamic("disabledMultiRemove")(disabledMultiRemove.asInstanceOf[js.Any])
    if (isMultiSortEvent != null) __obj.updateDynamic("isMultiSortEvent")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => isMultiSortEvent(t0).runNow()))
    if (!js.isUndefined(manualSortBy)) __obj.updateDynamic("manualSortBy")(manualSortBy.asInstanceOf[js.Any])
    if (maxMultiSortColCount != null) __obj.updateDynamic("maxMultiSortColCount")(maxMultiSortColCount.asInstanceOf[js.Any])
    if (orderByFn != null) __obj.updateDynamic("orderByFn")(js.Any.fromFunction3((t0: /* rows */ js.Array[typingsJapgolly.reactTable.mod.Row[D]], t1: /* sortFns */ js.Array[typingsJapgolly.reactTable.mod.SortByFn[D]], t2: /* directions */ js.Array[scala.Boolean]) => orderByFn(t0, t1, t2).runNow()))
    if (sortTypes != null) __obj.updateDynamic("sortTypes")(sortTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseSortByOptions[D]]
  }
}

