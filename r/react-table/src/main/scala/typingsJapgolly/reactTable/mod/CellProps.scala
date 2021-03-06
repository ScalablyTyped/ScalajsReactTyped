package typingsJapgolly.reactTable.mod

import typingsJapgolly.reactTable.PartialTableToggleHideAll
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-table.react-table.TableInstance<D> & {  column  :react-table.react-table.ColumnInstance<D>,   row  :react-table.react-table.Row<D>,   cell  :react-table.react-table.Cell<D>} */
@js.native
trait CellProps[D /* <: js.Object */] extends js.Object {
  var cell: Cell[D] = js.native
  var column: ColumnInstance[D] = js.native
  var columns: js.Array[ColumnInstance[D]] = js.native
  var data: js.Array[D] = js.native
  var defaultColumn: js.UndefOr[Partial[Column[D]]] = js.native
  var dispatch: TableDispatch[_] = js.native
  var flatColumns: js.Array[ColumnInstance[D]] = js.native
  var flatHeaders: js.Array[ColumnInstance[D]] = js.native
  var flatRows: js.Array[Row[D]] = js.native
  var footerGroups: js.Array[HeaderGroup[D]] = js.native
  var getRowId: js.UndefOr[
    js.Function3[
      /* originalRow */ D, 
      /* relativeIndex */ Double, 
      /* parent */ js.UndefOr[Row[D]], 
      String
    ]
  ] = js.native
  var getSubRows: js.UndefOr[js.Function2[/* originalRow */ D, /* relativeIndex */ Double, js.Array[D]]] = js.native
  var headerGroups: js.Array[HeaderGroup[D]] = js.native
  var headers: js.Array[ColumnInstance[D]] = js.native
  var hooks: Hooks[D] = js.native
  var initialRowStateKey: js.UndefOr[IdType[D]] = js.native
  var initialState: js.UndefOr[Partial[TableState[D]]] = js.native
  var plugins: js.Array[PluginHook[D]] = js.native
  var reducer: js.UndefOr[
    js.Function3[
      /* newState */ TableState[D], 
      /* action */ ActionType, 
      /* previousState */ TableState[D], 
      TableState[D]
    ]
  ] = js.native
  var row: Row[D] = js.native
  var rows: js.Array[Row[D]] = js.native
  var state: TableState[D] = js.native
  var totalColumnsWidth: Double = js.native
  var useControlledState: js.UndefOr[
    js.Function2[
      /* state */ TableState[D], 
      /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
      TableState[D]
    ]
  ] = js.native
  def getTableBodyProps(): TableBodyProps = js.native
  def getTableBodyProps(propGetter: TableBodyPropGetter[D]): TableBodyProps = js.native
  def getTableProps(): TableProps = js.native
  def getTableProps(propGetter: TablePropGetter[D]): TableProps = js.native
  def getToggleHideAllColumnsProps(): TableToggleHideAllColumnProps = js.native
  def getToggleHideAllColumnsProps(props: PartialTableToggleHideAll): TableToggleHideAllColumnProps = js.native
  def prepareRow(row: Row[D]): Unit = js.native
  def setHiddenColumns(param: js.Array[IdType[D]]): Unit = js.native
  def setHiddenColumns(param: UpdateHiddenColumns[D]): Unit = js.native
  def toggleHideAllColumns(): Unit = js.native
  def toggleHideAllColumns(value: Boolean): Unit = js.native
  def toggleHideColumn(columnId: IdType[D]): Unit = js.native
  def toggleHideColumn(columnId: IdType[D], value: Boolean): Unit = js.native
}

