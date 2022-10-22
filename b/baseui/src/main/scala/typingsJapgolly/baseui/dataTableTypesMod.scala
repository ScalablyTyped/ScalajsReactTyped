package typingsJapgolly.baseui

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.baseui.anon.ClearSelection
import typingsJapgolly.baseui.anon.Close
import typingsJapgolly.baseui.anon.Description
import typingsJapgolly.baseui.anon.Event
import typingsJapgolly.baseui.anon.Filters
import typingsJapgolly.baseui.anon.IsMeasured
import typingsJapgolly.baseui.anon.SizeNumber
import typingsJapgolly.baseui.baseuiStrings.center
import typingsJapgolly.baseui.baseuiStrings.end_
import typingsJapgolly.baseui.baseuiStrings.start
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.std.Map
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataTableTypesMod {
  
  trait BatchAction extends StObject {
    
    var label: String
    
    def onClick(a: ClearSelection): Any
    
    var renderIcon: js.UndefOr[ComponentType[SizeNumber & Any]] = js.undefined
  }
  object BatchAction {
    
    inline def apply(label: String, onClick: ClearSelection => Any): BatchAction = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
      __obj.asInstanceOf[BatchAction]
    }
    
    extension [Self <: BatchAction](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: ClearSelection => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setRenderIcon(value: ComponentType[SizeNumber & Any]): Self = StObject.set(x, "renderIcon", value.asInstanceOf[js.Any])
      
      inline def setRenderIconUndefined: Self = StObject.set(x, "renderIcon", js.undefined)
    }
  }
  
  trait ColumnOptions[Value, FilterParams]
    extends StObject
       with SharedColumnOptions[Value] {
    
    def buildFilter(a: FilterParams): js.Function1[/* a */ Value, Boolean]
    
    var kind: Columns
    
    var renderCell: RenderCell[Value]
    
    var renderFilter: RenderFilter[Value, FilterParams]
    
    def sortFn(b: Value, a: Value): Double
    
    @JSName("sortable")
    var sortable_ColumnOptions: Boolean
    
    var textQueryFilter: js.UndefOr[js.Function2[/* b */ String, /* a */ Value, Boolean]] = js.undefined
  }
  object ColumnOptions {
    
    inline def apply[Value, FilterParams](
      buildFilter: FilterParams => js.Function1[/* a */ Value, Boolean],
      kind: Columns,
      mapDataToValue: Any => Value,
      renderCell: RenderCell[Value],
      renderFilter: RenderFilter[Value, FilterParams],
      sortFn: (Value, Value) => Double,
      sortable: Boolean,
      title: String
    ): ColumnOptions[Value, FilterParams] = {
      val __obj = js.Dynamic.literal(buildFilter = js.Any.fromFunction1(buildFilter), kind = kind.asInstanceOf[js.Any], mapDataToValue = js.Any.fromFunction1(mapDataToValue), renderCell = renderCell.asInstanceOf[js.Any], renderFilter = renderFilter.asInstanceOf[js.Any], sortFn = js.Any.fromFunction2(sortFn), sortable = sortable.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnOptions[Value, FilterParams]]
    }
    
    extension [Self <: ColumnOptions[?, ?], Value, FilterParams](x: Self & (ColumnOptions[Value, FilterParams])) {
      
      inline def setBuildFilter(value: FilterParams => js.Function1[/* a */ Value, Boolean]): Self = StObject.set(x, "buildFilter", js.Any.fromFunction1(value))
      
      inline def setKind(value: Columns): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setRenderCell(value: RenderCell[Value]): Self = StObject.set(x, "renderCell", value.asInstanceOf[js.Any])
      
      inline def setRenderFilter(value: RenderFilter[Value, FilterParams]): Self = StObject.set(x, "renderFilter", value.asInstanceOf[js.Any])
      
      inline def setSortFn(value: (Value, Value) => Double): Self = StObject.set(x, "sortFn", js.Any.fromFunction2(value))
      
      inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
      
      inline def setTextQueryFilter(value: (/* b */ String, /* a */ Value) => Boolean): Self = StObject.set(x, "textQueryFilter", js.Any.fromFunction2(value))
      
      inline def setTextQueryFilterUndefined: Self = StObject.set(x, "textQueryFilter", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.baseui.baseuiStrings.NUMERICAL
    - typingsJapgolly.baseui.baseuiStrings.BOOLEAN
    - typingsJapgolly.baseui.baseuiStrings.STRING
    - typingsJapgolly.baseui.baseuiStrings.ANCHOR
    - typingsJapgolly.baseui.baseuiStrings.ROW_INDEX
    - typingsJapgolly.baseui.baseuiStrings.CUSTOM
    - typingsJapgolly.baseui.baseuiStrings.DATETIME
    - typingsJapgolly.baseui.baseuiStrings.CATEGORICAL
  */
  trait Columns extends StObject
  
  trait ControlRef extends StObject {
    
    var current: ImperativeMethods | Null
  }
  object ControlRef {
    
    inline def apply(): ControlRef = {
      val __obj = js.Dynamic.literal(current = null)
      __obj.asInstanceOf[ControlRef]
    }
    
    extension [Self <: ControlRef](x: Self) {
      
      inline def setCurrent(value: ImperativeMethods): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentNull: Self = StObject.set(x, "current", null)
    }
  }
  
  trait DataTableProps
    extends StObject
       with StatefulDataTableProps {
    
    var filters: js.UndefOr[Map[String, Description]] = js.undefined
    
    var onSelectMany: js.UndefOr[js.Function1[/* rows */ js.Array[Row], Unit]] = js.undefined
    
    var onSelectNone: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSelectOne: js.UndefOr[js.Function1[/* row */ Row, Unit]] = js.undefined
    
    @JSName("onSort")
    var onSort_DataTableProps: js.UndefOr[js.Function1[/* columnIndex */ Double, Unit]] = js.undefined
    
    var selectedRowIds: js.UndefOr[Set[String | Double]] = js.undefined
    
    var sortDirection: js.UndefOr[SortDirections] = js.undefined
    
    var sortIndex: js.UndefOr[Double] = js.undefined
    
    var textQuery: js.UndefOr[String] = js.undefined
  }
  object DataTableProps {
    
    inline def apply(columns: js.Array[ColumnOptions[Any, Any]], rows: js.Array[Row]): DataTableProps = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataTableProps]
    }
    
    extension [Self <: DataTableProps](x: Self) {
      
      inline def setFilters(value: Map[String, Description]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setOnSelectMany(value: /* rows */ js.Array[Row] => Callback): Self = StObject.set(x, "onSelectMany", js.Any.fromFunction1((t0: /* rows */ js.Array[Row]) => value(t0).runNow()))
      
      inline def setOnSelectManyUndefined: Self = StObject.set(x, "onSelectMany", js.undefined)
      
      inline def setOnSelectNone(value: Callback): Self = StObject.set(x, "onSelectNone", value.toJsFn)
      
      inline def setOnSelectNoneUndefined: Self = StObject.set(x, "onSelectNone", js.undefined)
      
      inline def setOnSelectOne(value: /* row */ Row => Callback): Self = StObject.set(x, "onSelectOne", js.Any.fromFunction1((t0: /* row */ Row) => value(t0).runNow()))
      
      inline def setOnSelectOneUndefined: Self = StObject.set(x, "onSelectOne", js.undefined)
      
      inline def setOnSort(value: /* columnIndex */ Double => Callback): Self = StObject.set(x, "onSort", js.Any.fromFunction1((t0: /* columnIndex */ Double) => value(t0).runNow()))
      
      inline def setOnSortUndefined: Self = StObject.set(x, "onSort", js.undefined)
      
      inline def setSelectedRowIds(value: Set[String | Double]): Self = StObject.set(x, "selectedRowIds", value.asInstanceOf[js.Any])
      
      inline def setSelectedRowIdsUndefined: Self = StObject.set(x, "selectedRowIds", js.undefined)
      
      inline def setSortDirection(value: SortDirections): Self = StObject.set(x, "sortDirection", value.asInstanceOf[js.Any])
      
      inline def setSortDirectionUndefined: Self = StObject.set(x, "sortDirection", js.undefined)
      
      inline def setSortIndex(value: Double): Self = StObject.set(x, "sortIndex", value.asInstanceOf[js.Any])
      
      inline def setSortIndexUndefined: Self = StObject.set(x, "sortIndex", js.undefined)
      
      inline def setTextQuery(value: String): Self = StObject.set(x, "textQuery", value.asInstanceOf[js.Any])
      
      inline def setTextQueryUndefined: Self = StObject.set(x, "textQuery", js.undefined)
    }
  }
  
  trait ImperativeMethods extends StObject {
    
    def clearSelection(): Unit
    
    def getRows(): js.Array[Row]
  }
  object ImperativeMethods {
    
    inline def apply(clearSelection: Callback, getRows: CallbackTo[js.Array[Row]]): ImperativeMethods = {
      val __obj = js.Dynamic.literal(clearSelection = clearSelection.toJsFn, getRows = getRows.toJsFn)
      __obj.asInstanceOf[ImperativeMethods]
    }
    
    extension [Self <: ImperativeMethods](x: Self) {
      
      inline def setClearSelection(value: Callback): Self = StObject.set(x, "clearSelection", value.toJsFn)
      
      inline def setGetRows(value: CallbackTo[js.Array[Row]]): Self = StObject.set(x, "getRows", value.toJsFn)
    }
  }
  
  type RenderCell[Value] = ComponentType[IsMeasured[Value]]
  
  type RenderFilter[Value, FilterParams] = ComponentType[Close[Value, FilterParams]]
  
  trait Row extends StObject {
    
    var data: Any
    
    var id: Double | String
  }
  object Row {
    
    inline def apply(data: Any, id: Double | String): Row = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Row]
    }
    
    extension [Self <: Row](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait RowAction extends StObject {
    
    var label: String
    
    def onClick(a: Event): Any
    
    var renderButton: js.UndefOr[ComponentType[js.Object]] = js.undefined
    
    var renderIcon: ComponentType[SizeNumber & Any]
  }
  object RowAction {
    
    inline def apply(label: String, onClick: Event => Any, renderIcon: ComponentType[SizeNumber & Any]): RowAction = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), renderIcon = renderIcon.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowAction]
    }
    
    extension [Self <: RowAction](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: Event => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setRenderButton(value: ComponentType[js.Object]): Self = StObject.set(x, "renderButton", value.asInstanceOf[js.Any])
      
      inline def setRenderButtonUndefined: Self = StObject.set(x, "renderButton", js.undefined)
      
      inline def setRenderIcon(value: ComponentType[SizeNumber & Any]): Self = StObject.set(x, "renderIcon", value.asInstanceOf[js.Any])
    }
  }
  
  trait SharedColumnOptions[Value] extends StObject {
    
    var cellBlockAlign: js.UndefOr[start | center | end_] = js.undefined
    
    var fillWidth: js.UndefOr[Boolean] = js.undefined
    
    var filterable: js.UndefOr[Boolean] = js.undefined
    
    def mapDataToValue(data: Any): Value
    
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    var minWidth: js.UndefOr[Double] = js.undefined
    
    var sortable: js.UndefOr[Boolean] = js.undefined
    
    var title: String
  }
  object SharedColumnOptions {
    
    inline def apply[Value](mapDataToValue: Any => Value, title: String): SharedColumnOptions[Value] = {
      val __obj = js.Dynamic.literal(mapDataToValue = js.Any.fromFunction1(mapDataToValue), title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[SharedColumnOptions[Value]]
    }
    
    extension [Self <: SharedColumnOptions[?], Value](x: Self & SharedColumnOptions[Value]) {
      
      inline def setCellBlockAlign(value: start | center | end_): Self = StObject.set(x, "cellBlockAlign", value.asInstanceOf[js.Any])
      
      inline def setCellBlockAlignUndefined: Self = StObject.set(x, "cellBlockAlign", js.undefined)
      
      inline def setFillWidth(value: Boolean): Self = StObject.set(x, "fillWidth", value.asInstanceOf[js.Any])
      
      inline def setFillWidthUndefined: Self = StObject.set(x, "fillWidth", js.undefined)
      
      inline def setFilterable(value: Boolean): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
      
      inline def setFilterableUndefined: Self = StObject.set(x, "filterable", js.undefined)
      
      inline def setMapDataToValue(value: Any => Value): Self = StObject.set(x, "mapDataToValue", js.Any.fromFunction1(value))
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
      
      inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.baseui.baseuiStrings.ASC
    - typingsJapgolly.baseui.baseuiStrings.DESC
  */
  trait SortDirections extends StObject
  
  trait StatefulContainerProps
    extends StObject
       with StatefulDataTableProps {
    
    def children(a: Filters): Node
  }
  object StatefulContainerProps {
    
    inline def apply(children: Filters => Node, columns: js.Array[ColumnOptions[Any, Any]], rows: js.Array[Row]): StatefulContainerProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatefulContainerProps]
    }
    
    extension [Self <: StatefulContainerProps](x: Self) {
      
      inline def setChildren(value: Filters => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  trait StatefulDataTableProps extends StObject {
    
    var batchActions: js.UndefOr[js.Array[BatchAction]] = js.undefined
    
    var columns: js.Array[ColumnOptions[Any, Any]]
    
    var controlRef: js.UndefOr[ControlRef] = js.undefined
    
    var emptyMessage: js.UndefOr[String | ComponentType[js.Object]] = js.undefined
    
    var filterable: js.UndefOr[Boolean] = js.undefined
    
    var initialFilters: js.UndefOr[Map[String, Description]] = js.undefined
    
    var initialSelectedRowIds: js.UndefOr[Set[Double | String]] = js.undefined
    
    var initialSortDirection: js.UndefOr[SortDirections] = js.undefined
    
    var initialSortIndex: js.UndefOr[Double] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
    
    var loadingMessage: js.UndefOr[String | ComponentType[js.Object]] = js.undefined
    
    var onFilterAdd: js.UndefOr[js.Function2[/* b */ String, /* a */ Description, Any]] = js.undefined
    
    var onFilterRemove: js.UndefOr[js.Function1[/* a */ String, Any]] = js.undefined
    
    var onIncludedRowsChange: js.UndefOr[js.Function1[/* rows */ js.Array[Row], Unit]] = js.undefined
    
    var onRowHighlightChange: js.UndefOr[js.Function2[/* rowIndex */ Double, /* row */ Row, Unit]] = js.undefined
    
    var onSelectionChange: js.UndefOr[js.Function1[/* a */ js.Array[Row], Any]] = js.undefined
    
    var onSort: js.UndefOr[js.Function2[/* columnIndex */ Double, /* sortDirection */ SortDirections, Unit]] = js.undefined
    
    var onTextQueryChange: js.UndefOr[js.Function1[/* textQuery */ String, Unit]] = js.undefined
    
    var resizableColumnWidths: js.UndefOr[Boolean] = js.undefined
    
    var rowActions: js.UndefOr[js.Array[RowAction] | (js.Function1[/* a */ Row, js.Array[RowAction]])] = js.undefined
    
    var rowHeight: js.UndefOr[Double] = js.undefined
    
    var rowHighlightIndex: js.UndefOr[Double] = js.undefined
    
    var rows: js.Array[Row]
    
    var searchable: js.UndefOr[Boolean] = js.undefined
  }
  object StatefulDataTableProps {
    
    inline def apply(columns: js.Array[ColumnOptions[Any, Any]], rows: js.Array[Row]): StatefulDataTableProps = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatefulDataTableProps]
    }
    
    extension [Self <: StatefulDataTableProps](x: Self) {
      
      inline def setBatchActions(value: js.Array[BatchAction]): Self = StObject.set(x, "batchActions", value.asInstanceOf[js.Any])
      
      inline def setBatchActionsUndefined: Self = StObject.set(x, "batchActions", js.undefined)
      
      inline def setBatchActionsVarargs(value: BatchAction*): Self = StObject.set(x, "batchActions", js.Array(value*))
      
      inline def setColumns(value: js.Array[ColumnOptions[Any, Any]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: (ColumnOptions[Any, Any])*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setControlRef(value: ControlRef): Self = StObject.set(x, "controlRef", value.asInstanceOf[js.Any])
      
      inline def setControlRefUndefined: Self = StObject.set(x, "controlRef", js.undefined)
      
      inline def setEmptyMessage(value: String | ComponentType[js.Object]): Self = StObject.set(x, "emptyMessage", value.asInstanceOf[js.Any])
      
      inline def setEmptyMessageUndefined: Self = StObject.set(x, "emptyMessage", js.undefined)
      
      inline def setFilterable(value: Boolean): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
      
      inline def setFilterableUndefined: Self = StObject.set(x, "filterable", js.undefined)
      
      inline def setInitialFilters(value: Map[String, Description]): Self = StObject.set(x, "initialFilters", value.asInstanceOf[js.Any])
      
      inline def setInitialFiltersUndefined: Self = StObject.set(x, "initialFilters", js.undefined)
      
      inline def setInitialSelectedRowIds(value: Set[Double | String]): Self = StObject.set(x, "initialSelectedRowIds", value.asInstanceOf[js.Any])
      
      inline def setInitialSelectedRowIdsUndefined: Self = StObject.set(x, "initialSelectedRowIds", js.undefined)
      
      inline def setInitialSortDirection(value: SortDirections): Self = StObject.set(x, "initialSortDirection", value.asInstanceOf[js.Any])
      
      inline def setInitialSortDirectionUndefined: Self = StObject.set(x, "initialSortDirection", js.undefined)
      
      inline def setInitialSortIndex(value: Double): Self = StObject.set(x, "initialSortIndex", value.asInstanceOf[js.Any])
      
      inline def setInitialSortIndexUndefined: Self = StObject.set(x, "initialSortIndex", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingMessage(value: String | ComponentType[js.Object]): Self = StObject.set(x, "loadingMessage", value.asInstanceOf[js.Any])
      
      inline def setLoadingMessageUndefined: Self = StObject.set(x, "loadingMessage", js.undefined)
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setOnFilterAdd(value: (/* b */ String, /* a */ Description) => Any): Self = StObject.set(x, "onFilterAdd", js.Any.fromFunction2(value))
      
      inline def setOnFilterAddUndefined: Self = StObject.set(x, "onFilterAdd", js.undefined)
      
      inline def setOnFilterRemove(value: /* a */ String => Any): Self = StObject.set(x, "onFilterRemove", js.Any.fromFunction1(value))
      
      inline def setOnFilterRemoveUndefined: Self = StObject.set(x, "onFilterRemove", js.undefined)
      
      inline def setOnIncludedRowsChange(value: /* rows */ js.Array[Row] => Callback): Self = StObject.set(x, "onIncludedRowsChange", js.Any.fromFunction1((t0: /* rows */ js.Array[Row]) => value(t0).runNow()))
      
      inline def setOnIncludedRowsChangeUndefined: Self = StObject.set(x, "onIncludedRowsChange", js.undefined)
      
      inline def setOnRowHighlightChange(value: (/* rowIndex */ Double, /* row */ Row) => Callback): Self = StObject.set(x, "onRowHighlightChange", js.Any.fromFunction2((t0: /* rowIndex */ Double, t1: /* row */ Row) => (value(t0, t1)).runNow()))
      
      inline def setOnRowHighlightChangeUndefined: Self = StObject.set(x, "onRowHighlightChange", js.undefined)
      
      inline def setOnSelectionChange(value: /* a */ js.Array[Row] => Any): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction1(value))
      
      inline def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
      
      inline def setOnSort(value: (/* columnIndex */ Double, /* sortDirection */ SortDirections) => Callback): Self = StObject.set(x, "onSort", js.Any.fromFunction2((t0: /* columnIndex */ Double, t1: /* sortDirection */ SortDirections) => (value(t0, t1)).runNow()))
      
      inline def setOnSortUndefined: Self = StObject.set(x, "onSort", js.undefined)
      
      inline def setOnTextQueryChange(value: /* textQuery */ String => Callback): Self = StObject.set(x, "onTextQueryChange", js.Any.fromFunction1((t0: /* textQuery */ String) => value(t0).runNow()))
      
      inline def setOnTextQueryChangeUndefined: Self = StObject.set(x, "onTextQueryChange", js.undefined)
      
      inline def setResizableColumnWidths(value: Boolean): Self = StObject.set(x, "resizableColumnWidths", value.asInstanceOf[js.Any])
      
      inline def setResizableColumnWidthsUndefined: Self = StObject.set(x, "resizableColumnWidths", js.undefined)
      
      inline def setRowActions(value: js.Array[RowAction] | (js.Function1[/* a */ Row, js.Array[RowAction]])): Self = StObject.set(x, "rowActions", value.asInstanceOf[js.Any])
      
      inline def setRowActionsFunction1(value: /* a */ Row => js.Array[RowAction]): Self = StObject.set(x, "rowActions", js.Any.fromFunction1(value))
      
      inline def setRowActionsUndefined: Self = StObject.set(x, "rowActions", js.undefined)
      
      inline def setRowActionsVarargs(value: RowAction*): Self = StObject.set(x, "rowActions", js.Array(value*))
      
      inline def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      inline def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
      
      inline def setRowHighlightIndex(value: Double): Self = StObject.set(x, "rowHighlightIndex", value.asInstanceOf[js.Any])
      
      inline def setRowHighlightIndexUndefined: Self = StObject.set(x, "rowHighlightIndex", js.undefined)
      
      inline def setRows(value: js.Array[Row]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsVarargs(value: Row*): Self = StObject.set(x, "rows", js.Array(value*))
      
      inline def setSearchable(value: Boolean): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
      
      inline def setSearchableUndefined: Self = StObject.set(x, "searchable", js.undefined)
    }
  }
}
