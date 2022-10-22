package typingsJapgolly.blueprintjsTable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLElement
import typingsJapgolly.blueprintjsCore.libEsmCommonPropsMod.IProps
import typingsJapgolly.blueprintjsCore.mod.AbstractComponent2
import typingsJapgolly.blueprintjsTable.anon.Loading
import typingsJapgolly.blueprintjsTable.libEsmCellCellMod.CellRenderer
import typingsJapgolly.blueprintjsTable.libEsmCommonCellTypesMod.FocusedCellCoordinates
import typingsJapgolly.blueprintjsTable.libEsmCommonGridMod.ColumnIndices
import typingsJapgolly.blueprintjsTable.libEsmCommonGridMod.Grid
import typingsJapgolly.blueprintjsTable.libEsmCommonGridMod.RowIndices
import typingsJapgolly.blueprintjsTable.libEsmCommonRectMod.Rect
import typingsJapgolly.blueprintjsTable.libEsmCommonRenderModeMod.RenderMode.BATCH
import typingsJapgolly.blueprintjsTable.libEsmCommonRenderModeMod.RenderMode.NONE
import typingsJapgolly.blueprintjsTable.libEsmInteractionsMenusMenuContextMod.IContextMenuRenderer
import typingsJapgolly.blueprintjsTable.libEsmInteractionsMenusMenuContextMod.IMenuContext
import typingsJapgolly.blueprintjsTable.libEsmInteractionsSelectableMod.ISelectableProps
import typingsJapgolly.blueprintjsTable.libEsmLocatorMod.ILocator
import typingsJapgolly.blueprintjsTable.libEsmRegionsMod.Region
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmTableBodyMod {
  
  @JSImport("@blueprintjs/table/lib/esm/tableBody", "TableBody")
  @js.native
  open class TableBody protected ()
    extends AbstractComponent2[TableBodyProps, js.Object, js.Object] {
    def this(props: TableBodyProps) = this()
    def this(props: TableBodyProps, context: Any) = this()
    
    /* private */ var activationCell: Any = js.native
    
    /* private */ var handleSelectionEnd: Any = js.native
    
    /* private */ var locateClick: Any = js.native
    
    /* private */ var locateDrag: Any = js.native
    
    def renderContextMenu(e: ReactMouseEventFrom[HTMLElement]): js.UndefOr[Element] = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MTableBody(nextProps: ITableBodyProps): Boolean = js.native
  }
  /* static members */
  object TableBody {
    
    @JSImport("@blueprintjs/table/lib/esm/tableBody", "TableBody")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @deprecated, will be removed from public API in the next major version
      */
    inline def cellClassNames(rowIndex: Double, columnIndex: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("cellClassNames")(rowIndex.asInstanceOf[js.Any], columnIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    @JSImport("@blueprintjs/table/lib/esm/tableBody", "TableBody.defaultProps")
    @js.native
    def defaultProps: Loading = js.native
    inline def defaultProps_=(x: Loading): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.blueprintjsTable.libEsmTableBodyCellsMod.ITableBodyCellsProps because var conflicts: focusedCell. Inlined cellRenderer, grid, loading, onCompleteRender, renderMode, viewportRect */ trait ITableBodyProps
    extends StObject
       with ISelectableProps
       with RowIndices
       with ColumnIndices
       with IProps {
    
    /**
      * An optional callback for displaying a context menu when right-clicking
      * on the table body. The callback is supplied with an `IMenuContext`
      * containing the `Region`s of interest.
      */
    var bodyContextMenuRenderer: js.UndefOr[IContextMenuRenderer] = js.undefined
    
    /**
      * A cell renderer for the cells in the body.
      */
    var cellRenderer: CellRenderer
    
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
      * Locates the row/column/cell given a mouse event.
      */
    var locator: ILocator
    
    /**
      * The number of columns to freeze to the left side of the table, counting from the leftmost column.
      */
    var numFrozenColumns: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of rows to freeze to the top of the table, counting from the topmost row.
      */
    var numFrozenRows: js.UndefOr[Double] = js.undefined
    
    /**
      * An optional callback invoked when all cells in view have completely rendered.
      */
    var onCompleteRender: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Dictates how cells should be rendered. This component doesn't support
      * `RenderMode.BATCH_ON_UPDATE`, because there are actually multiple updates
      * that need to happen at higher levels before the table is considered fully
      * "mounted"; thus, we let higher components tell us when to switch modes.
      *
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
  object ITableBodyProps {
    
    inline def apply(
      cellRenderer: (/* rowIndex */ Double, /* columnIndex */ Double) => js.UndefOr[japgolly.scalajs.react.facade.React.Element],
      columnIndexEnd: Double,
      columnIndexStart: Double,
      grid: Grid,
      loading: Boolean,
      locator: ILocator,
      onFocusedCell: FocusedCellCoordinates => Callback,
      onSelection: js.Array[Region] => Callback,
      rowIndexEnd: Double,
      rowIndexStart: Double,
      viewportRect: Rect
    ): ITableBodyProps = {
      val __obj = js.Dynamic.literal(cellRenderer = js.Any.fromFunction2(cellRenderer), columnIndexEnd = columnIndexEnd.asInstanceOf[js.Any], columnIndexStart = columnIndexStart.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], locator = locator.asInstanceOf[js.Any], onFocusedCell = js.Any.fromFunction1((t0: FocusedCellCoordinates) => onFocusedCell(t0).runNow()), onSelection = js.Any.fromFunction1((t0: js.Array[Region]) => onSelection(t0).runNow()), rowIndexEnd = rowIndexEnd.asInstanceOf[js.Any], rowIndexStart = rowIndexStart.asInstanceOf[js.Any], viewportRect = viewportRect.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITableBodyProps]
    }
    
    extension [Self <: ITableBodyProps](x: Self) {
      
      inline def setBodyContextMenuRenderer(value: /* context */ IMenuContext => Element): Self = StObject.set(x, "bodyContextMenuRenderer", js.Any.fromFunction1(value))
      
      inline def setBodyContextMenuRendererUndefined: Self = StObject.set(x, "bodyContextMenuRenderer", js.undefined)
      
      inline def setCellRenderer(
        value: (/* rowIndex */ Double, /* columnIndex */ Double) => js.UndefOr[japgolly.scalajs.react.facade.React.Element]
      ): Self = StObject.set(x, "cellRenderer", js.Any.fromFunction2(value))
      
      inline def setGrid(value: Grid): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLocator(value: ILocator): Self = StObject.set(x, "locator", value.asInstanceOf[js.Any])
      
      inline def setNumFrozenColumns(value: Double): Self = StObject.set(x, "numFrozenColumns", value.asInstanceOf[js.Any])
      
      inline def setNumFrozenColumnsUndefined: Self = StObject.set(x, "numFrozenColumns", js.undefined)
      
      inline def setNumFrozenRows(value: Double): Self = StObject.set(x, "numFrozenRows", value.asInstanceOf[js.Any])
      
      inline def setNumFrozenRowsUndefined: Self = StObject.set(x, "numFrozenRows", js.undefined)
      
      inline def setOnCompleteRender(value: Callback): Self = StObject.set(x, "onCompleteRender", value.toJsFn)
      
      inline def setOnCompleteRenderUndefined: Self = StObject.set(x, "onCompleteRender", js.undefined)
      
      inline def setRenderMode(value: BATCH | NONE): Self = StObject.set(x, "renderMode", value.asInstanceOf[js.Any])
      
      inline def setRenderModeUndefined: Self = StObject.set(x, "renderMode", js.undefined)
      
      inline def setViewportRect(value: Rect): Self = StObject.set(x, "viewportRect", value.asInstanceOf[js.Any])
    }
  }
  
  type TableBodyProps = ITableBodyProps
}
