package typingsJapgolly.agGrid.iRowModelMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRowModel extends js.Object {
  /** Iterate through each node. What this does depends on the model type. For clientSide, goes through
    * all nodes. For pagination, goes through current page. For virtualPage, goes through what's loaded in memory. */
  def forEachNode(callback: js.Function1[/* rowNode */ RowNode, Unit]): Unit
  /** Returns total height of all the rows - used to size the height of the grid div that contains the rows */
  def getCurrentPageHeight(): Double
  /** Returns all rows in range that should be selected. If there is a gap in range (non ClientSideRowModel) then
    *  then no rows should be returned  */
  def getNodesInRangeForSelection(first: RowNode, last: RowNode): js.Array[RowNode]
  /** Returns the first and last rows to render. */
  def getPageFirstRow(): Double
  def getPageLastRow(): Double
  /** Returns the rowNode at the given index. */
  def getRow(index: Double): RowNode
  /** Returns row top and bottom for a given row */
  def getRowBounds(index: Double): RowBounds
  /** This is legacy, not used by ag-Grid, but keeping for backward compatibility */
  def getRowCount(): Double
  /** Returns the row index at the given pixel */
  def getRowIndexAtPixel(pixel: Double): Double
  /** Returns the rowNode for given id. */
  def getRowNode(id: String): RowNode
  /** The base class returns the type. We use this instead of 'instanceof' as the client might provide
    * their own implementation of the models in the future. */
  def getType(): String
  /** Returns true if this model has no rows, regardless of model filter. EG if rows present, but filtered
    * out, this still returns false. If it returns true, then the grid shows the 'no rows' overlay - but we
    * don't show that overlay if the rows are just filtered out. */
  def isEmpty(): Boolean
  /**
    * It tells us if this row model knows about the last row that it can produce. This is used by the
    * PaginationPanel, if last row is not found, then the 'last' button is disabled and the last page is
    * not shown. This is always true for ClientSideRowModel. It toggles for InfiniteRowModel.
    */
  def isLastRowFound(): Boolean
  /** Returns true if the provided rowNode is in the list of rows to render */
  def isRowPresent(rowNode: RowNode): Boolean
  /** Returns true if no rows (either no rows at all, or the rows are filtered out). This is what the grid
    * uses to know if there are rows to render or not. */
  def isRowsToRender(): Boolean
}

object IRowModel {
  @scala.inline
  def apply(
    forEachNode: js.Function1[/* rowNode */ RowNode, Unit] => Callback,
    getCurrentPageHeight: CallbackTo[Double],
    getNodesInRangeForSelection: (RowNode, RowNode) => CallbackTo[js.Array[RowNode]],
    getPageFirstRow: CallbackTo[Double],
    getPageLastRow: CallbackTo[Double],
    getRow: Double => CallbackTo[RowNode],
    getRowBounds: Double => CallbackTo[RowBounds],
    getRowCount: CallbackTo[Double],
    getRowIndexAtPixel: Double => CallbackTo[Double],
    getRowNode: String => CallbackTo[RowNode],
    getType: CallbackTo[String],
    isEmpty: CallbackTo[Boolean],
    isLastRowFound: CallbackTo[Boolean],
    isRowPresent: RowNode => CallbackTo[Boolean],
    isRowsToRender: CallbackTo[Boolean]
  ): IRowModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("forEachNode")(js.Any.fromFunction1((t0: js.Function1[/* rowNode */ typingsJapgolly.agGrid.rowNodeMod.RowNode, scala.Unit]) => forEachNode(t0).runNow()))
    __obj.updateDynamic("getCurrentPageHeight")(getCurrentPageHeight.toJsFn)
    __obj.updateDynamic("getNodesInRangeForSelection")(js.Any.fromFunction2((t0: typingsJapgolly.agGrid.rowNodeMod.RowNode, t1: typingsJapgolly.agGrid.rowNodeMod.RowNode) => getNodesInRangeForSelection(t0, t1).runNow()))
    __obj.updateDynamic("getPageFirstRow")(getPageFirstRow.toJsFn)
    __obj.updateDynamic("getPageLastRow")(getPageLastRow.toJsFn)
    __obj.updateDynamic("getRow")(js.Any.fromFunction1((t0: scala.Double) => getRow(t0).runNow()))
    __obj.updateDynamic("getRowBounds")(js.Any.fromFunction1((t0: scala.Double) => getRowBounds(t0).runNow()))
    __obj.updateDynamic("getRowCount")(getRowCount.toJsFn)
    __obj.updateDynamic("getRowIndexAtPixel")(js.Any.fromFunction1((t0: scala.Double) => getRowIndexAtPixel(t0).runNow()))
    __obj.updateDynamic("getRowNode")(js.Any.fromFunction1((t0: java.lang.String) => getRowNode(t0).runNow()))
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("isEmpty")(isEmpty.toJsFn)
    __obj.updateDynamic("isLastRowFound")(isLastRowFound.toJsFn)
    __obj.updateDynamic("isRowPresent")(js.Any.fromFunction1((t0: typingsJapgolly.agGrid.rowNodeMod.RowNode) => isRowPresent(t0).runNow()))
    __obj.updateDynamic("isRowsToRender")(isRowsToRender.toJsFn)
    __obj.asInstanceOf[IRowModel]
  }
}

