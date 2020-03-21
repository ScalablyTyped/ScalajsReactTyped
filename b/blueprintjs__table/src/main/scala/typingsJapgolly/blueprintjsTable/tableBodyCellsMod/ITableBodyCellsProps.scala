package typingsJapgolly.blueprintjsTable.tableBodyCellsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.blueprintjsCore.propsMod.IProps
import typingsJapgolly.blueprintjsTable.cellMod.ICellRenderer
import typingsJapgolly.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typingsJapgolly.blueprintjsTable.gridMod.Grid
import typingsJapgolly.blueprintjsTable.gridMod.IColumnIndices
import typingsJapgolly.blueprintjsTable.gridMod.IRowIndices
import typingsJapgolly.blueprintjsTable.rectMod.Rect
import typingsJapgolly.blueprintjsTable.renderModeMod.RenderMode.BATCH
import typingsJapgolly.blueprintjsTable.renderModeMod.RenderMode.NONE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITableBodyCellsProps
  extends IRowIndices
     with IColumnIndices
     with IProps {
  /**
    * A cell renderer for the cells in the body.
    */
  var cellRenderer: ICellRenderer
  /**
    * The coordinates of the currently focused cell, for setting the "isFocused" prop on cells.
    */
  var focusedCell: js.UndefOr[IFocusedCellCoordinates] = js.undefined
  /**
    * The grid computes sizes of cells, rows, or columns from the
    * configurable `columnWidths` and `rowHeights`.
    */
  var grid: Grid
  /**
    * If true, all `Cell`s render their loading state except for those who have
    * their `loading` prop explicitly set to false.
    */
  var loading: Boolean
  /**
    * An optional callback invoked when all cells in view have completely rendered.
    */
  var onCompleteRender: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Dictates how cells should be rendered. This component doesn't support
    * `RenderMode.BATCH_ON_UPDATE`, because there are actually multiple updates
    * that need to happen at higher levels before the table is considered fully
    * "mounted"; thus, we let higher components tell us when to switch modes.
    * @default RenderMode.BATCH
    */
  var renderMode: js.UndefOr[BATCH | NONE] = js.undefined
  /**
    * The `Rect` bounds of the visible viewport with respect to its parent
    * scrollable pane. While not directly used by the component, this prop is
    * necessary for shouldComponentUpdate logic to run properly.
    */
  var viewportRect: Rect
}

object ITableBodyCellsProps {
  @scala.inline
  def apply(
    cellRenderer: (/* rowIndex */ Double, /* columnIndex */ Double) => CallbackTo[Element],
    columnIndexEnd: Double,
    columnIndexStart: Double,
    grid: Grid,
    loading: Boolean,
    rowIndexEnd: Double,
    rowIndexStart: Double,
    viewportRect: Rect,
    className: String = null,
    focusedCell: IFocusedCellCoordinates = null,
    onCompleteRender: js.UndefOr[Callback] = js.undefined,
    renderMode: BATCH | NONE = null
  ): ITableBodyCellsProps = {
    val __obj = js.Dynamic.literal(columnIndexEnd = columnIndexEnd.asInstanceOf[js.Any], columnIndexStart = columnIndexStart.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], rowIndexEnd = rowIndexEnd.asInstanceOf[js.Any], rowIndexStart = rowIndexStart.asInstanceOf[js.Any], viewportRect = viewportRect.asInstanceOf[js.Any])
    __obj.updateDynamic("cellRenderer")(js.Any.fromFunction2((t0: /* rowIndex */ scala.Double, t1: /* columnIndex */ scala.Double) => cellRenderer(t0, t1).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (focusedCell != null) __obj.updateDynamic("focusedCell")(focusedCell.asInstanceOf[js.Any])
    onCompleteRender.foreach(p => __obj.updateDynamic("onCompleteRender")(p.toJsFn))
    if (renderMode != null) __obj.updateDynamic("renderMode")(renderMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableBodyCellsProps]
  }
}

