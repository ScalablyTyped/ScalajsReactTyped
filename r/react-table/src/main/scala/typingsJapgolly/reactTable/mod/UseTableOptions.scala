package typingsJapgolly.reactTable.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  columns  :std.Array<react-table.react-table.Column<D>>,   data  :std.Array<D>} & std.Partial<{  initialState  :std.Partial<react-table.react-table.TableState<D>>, reducer (newState : react-table.react-table.TableState<D>, action : react-table.react-table.ActionType, previousState : react-table.react-table.TableState<D>): react-table.react-table.TableState<D>, useControlledState (state : react-table.react-table.TableState<D>, meta : react-table.react-table.Meta<D, never, react-table.react-table.MetaBase<D>>): react-table.react-table.TableState<D>,   defaultColumn  :std.Partial<react-table.react-table.Column<D>>,   initialRowStateKey  :react-table.react-table.IdType<D>, getSubRows (originalRow : D, relativeIndex : number): std.Array<D>, getRowId (originalRow : D, relativeIndex : number, parent ? : react-table.react-table.Row<D>): string}> */
trait UseTableOptions[D /* <: js.Object */] extends js.Object {
  var columns: js.Array[Column[D]]
  var data: js.Array[D]
  var defaultColumn: js.UndefOr[Partial[Column[D]]] = js.undefined
  var getRowId: js.UndefOr[
    js.Function3[
      /* originalRow */ D, 
      /* relativeIndex */ Double, 
      /* parent */ js.UndefOr[Row[D]], 
      String
    ]
  ] = js.undefined
  var getSubRows: js.UndefOr[js.Function2[/* originalRow */ D, /* relativeIndex */ Double, js.Array[D]]] = js.undefined
  var initialRowStateKey: js.UndefOr[IdType[D]] = js.undefined
  var initialState: js.UndefOr[Partial[TableState[D]]] = js.undefined
  var reducer: js.UndefOr[
    js.Function3[
      /* newState */ TableState[D], 
      /* action */ ActionType, 
      /* previousState */ TableState[D], 
      TableState[D]
    ]
  ] = js.undefined
  var useControlledState: js.UndefOr[
    js.Function2[
      /* state */ TableState[D], 
      /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
      TableState[D]
    ]
  ] = js.undefined
}

object UseTableOptions {
  @scala.inline
  def apply[D /* <: js.Object */](
    columns: js.Array[Column[D]],
    data: js.Array[D],
    defaultColumn: Partial[Column[D]] = null,
    getRowId: (/* originalRow */ D, /* relativeIndex */ Double, /* parent */ js.UndefOr[Row[D]]) => CallbackTo[String] = null,
    getSubRows: (/* originalRow */ D, /* relativeIndex */ Double) => CallbackTo[js.Array[D]] = null,
    initialRowStateKey: IdType[D] = null,
    initialState: Partial[TableState[D]] = null,
    reducer: (/* newState */ TableState[D], /* action */ ActionType, /* previousState */ TableState[D]) => CallbackTo[TableState[D]] = null,
    useControlledState: (/* state */ TableState[D], /* meta */ Meta[D, scala.Nothing, MetaBase[D]]) => CallbackTo[TableState[D]] = null
  ): UseTableOptions[D] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    if (defaultColumn != null) __obj.updateDynamic("defaultColumn")(defaultColumn.asInstanceOf[js.Any])
    if (getRowId != null) __obj.updateDynamic("getRowId")(js.Any.fromFunction3((t0: /* originalRow */ D, t1: /* relativeIndex */ scala.Double, t2: /* parent */ js.UndefOr[typingsJapgolly.reactTable.mod.Row[D]]) => getRowId(t0, t1, t2).runNow()))
    if (getSubRows != null) __obj.updateDynamic("getSubRows")(js.Any.fromFunction2((t0: /* originalRow */ D, t1: /* relativeIndex */ scala.Double) => getSubRows(t0, t1).runNow()))
    if (initialRowStateKey != null) __obj.updateDynamic("initialRowStateKey")(initialRowStateKey.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (reducer != null) __obj.updateDynamic("reducer")(js.Any.fromFunction3((t0: /* newState */ typingsJapgolly.reactTable.mod.TableState[D], t1: /* action */ typingsJapgolly.reactTable.mod.ActionType, t2: /* previousState */ typingsJapgolly.reactTable.mod.TableState[D]) => reducer(t0, t1, t2).runNow()))
    if (useControlledState != null) __obj.updateDynamic("useControlledState")(js.Any.fromFunction2((t0: /* state */ typingsJapgolly.reactTable.mod.TableState[D], t1: /* meta */ typingsJapgolly.reactTable.mod.Meta[D, scala.Nothing, typingsJapgolly.reactTable.mod.MetaBase[D]]) => useControlledState(t0, t1).runNow()))
    __obj.asInstanceOf[UseTableOptions[D]]
  }
}

