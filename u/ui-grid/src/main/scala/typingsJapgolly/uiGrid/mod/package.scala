package typingsJapgolly.uiGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ICellClassGetter[TEntity] = js.Function5[
    /* grid */ js.UndefOr[typingsJapgolly.uiGrid.mod.IGridInstanceOf[TEntity]], 
    /* gridRow */ js.UndefOr[typingsJapgolly.uiGrid.mod.IGridRowOf[TEntity]], 
    /* gridCol */ js.UndefOr[typingsJapgolly.uiGrid.mod.IGridColumnOf[TEntity]], 
    /* rowRenderIndex */ js.UndefOr[scala.Double], 
    /* colRenderIndex */ js.UndefOr[scala.Double], 
    java.lang.String
  ]
  type ICellTooltipGetter[TEntity] = js.Function2[
    /* gridRow */ typingsJapgolly.uiGrid.mod.IGridRowOf[TEntity], 
    /* gridCol */ typingsJapgolly.uiGrid.mod.IGridColumnOf[TEntity], 
    java.lang.String
  ]
  type IColumnBuilder[TEntity] = js.Function3[
    /* colDef */ typingsJapgolly.uiGrid.mod.IColumnDefOf[TEntity], 
    /* col */ typingsJapgolly.uiGrid.mod.IGridColumnOf[TEntity], 
    /* gridOptions */ typingsJapgolly.uiGrid.mod.IGridOptionsOf[TEntity], 
    scala.Unit
  ]
  type IColumnDef = typingsJapgolly.uiGrid.mod.IColumnDefOf[js.Any]
  type IColumnProcessor[TEntity] = js.Function2[
    /* renderedColumnsToProcess */ js.Array[typingsJapgolly.uiGrid.mod.IGridColumnOf[TEntity]], 
    /* rows */ js.Array[typingsJapgolly.uiGrid.mod.IGridRowOf[TEntity]], 
    js.Array[typingsJapgolly.uiGrid.mod.IGridColumnOf[TEntity]]
  ]
  type IGridApi = typingsJapgolly.uiGrid.mod.IGridApiOf[js.Any]
  type IGridColumn = typingsJapgolly.uiGrid.mod.IGridColumnOf[js.Any]
  type IGridInstance = typingsJapgolly.uiGrid.mod.IGridInstanceOf[js.Any]
  type IGridOptions = typingsJapgolly.uiGrid.mod.IGridOptionsOf[js.Any]
  type IGridRow = typingsJapgolly.uiGrid.mod.IGridRowOf[js.Any]
  type IHeaderFooterCellClassGetter[TEntity] = js.Function5[
    /* grid */ typingsJapgolly.uiGrid.mod.IGridInstanceOf[TEntity], 
    /* gridRow */ typingsJapgolly.uiGrid.mod.IGridRowOf[TEntity], 
    /* gridCol */ typingsJapgolly.uiGrid.mod.IGridColumnOf[TEntity], 
    /* rowRenderIndex */ scala.Double, 
    /* colRenderIndex */ scala.Double, 
    java.lang.String
  ]
  type IHeaderTooltipGetter[TEntity] = js.Function1[/* gridCol */ typingsJapgolly.uiGrid.mod.IGridColumnOf[TEntity], java.lang.String]
  type IRowBuilder[TEntity] = js.Function2[
    /* row */ typingsJapgolly.uiGrid.mod.IGridRowOf[TEntity], 
    /* gridOptions */ typingsJapgolly.uiGrid.mod.IGridOptionsOf[TEntity], 
    scala.Unit
  ]
  type IRowProcessor[TEntity] = js.Function2[
    /* renderedRowsToProcess */ js.Array[typingsJapgolly.uiGrid.mod.IGridRowOf[TEntity]], 
    /* columns */ js.Array[typingsJapgolly.uiGrid.mod.IGridColumnOf[TEntity]], 
    js.Array[typingsJapgolly.uiGrid.mod.IGridRowOf[TEntity]]
  ]
  type IStyleComputation = js.Function1[/* $scope */ typingsJapgolly.angular.mod.IScope, java.lang.String]
  type canvasHeightChangedHandler = js.Function2[/* oldHeight */ scala.Double, /* newHeight */ scala.Double, scala.Unit]
  type columnVisibilityChangedHandler[TEntity] = js.Function1[/* column */ typingsJapgolly.uiGrid.mod.IGridColumnOf[TEntity], scala.Unit]
  type filterChangedHandler[TEntity] = js.Function1[/* gridApi */ typingsJapgolly.uiGrid.mod.IGridApiOf[TEntity], scala.Unit]
  type rowsRenderedHandler[TEntity] = js.Function1[/* gridApi */ typingsJapgolly.uiGrid.mod.IGridApiOf[TEntity], scala.Unit]
  type rowsVisibleChangedHandler[TEntity] = js.Function1[/* gridApi */ typingsJapgolly.uiGrid.mod.IGridApiOf[TEntity], scala.Unit]
  type scrollBeginHandler = js.Function1[/* scrollEvent */ typingsJapgolly.angular.JQueryMouseEventObject, scala.Unit]
  type scrollEndHandler = js.Function1[/* scrollEvent */ typingsJapgolly.angular.JQueryMouseEventObject, scala.Unit]
  type sortChangedHandler[TEntity] = js.Function2[
    /* grid */ typingsJapgolly.uiGrid.mod.IGridInstanceOf[TEntity], 
    /* columns */ js.Array[typingsJapgolly.uiGrid.mod.IGridColumnOf[TEntity]], 
    scala.Unit
  ]
}
