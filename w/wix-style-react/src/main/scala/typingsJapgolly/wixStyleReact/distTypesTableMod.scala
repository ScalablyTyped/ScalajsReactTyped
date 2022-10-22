package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.wixStyleReact.anon.Origin
import typingsJapgolly.wixStyleReact.anon.OriginType
import typingsJapgolly.wixStyleReact.anon.`4`
import typingsJapgolly.wixStyleReact.distTypesTableDataTableMod.DataTableColumn
import typingsJapgolly.wixStyleReact.distTypesTableDataTableMod.DataTableRowDataHookFn
import typingsJapgolly.wixStyleReact.distTypesTableDataTableMod.DataTableRowVerticalPadding
import typingsJapgolly.wixStyleReact.distTypesTableDataTableMod.DataTableSkin
import typingsJapgolly.wixStyleReact.distTypesTableDataTableMod.DragEndEvent
import typingsJapgolly.wixStyleReact.distTypesTableDataTableMod.DragStartEvent
import typingsJapgolly.wixStyleReact.distTypesTableDataTableMod.RowDataDefaultType
import typingsJapgolly.wixStyleReact.distTypesTableDataTableMod.TableDragAndDrop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableMod {
  
  @JSImport("wix-style-react/dist/types/Table", JSImport.Default)
  @js.native
  open class default[RowData] () extends Table[RowData]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/Table", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/Table", "default.BulkSelectionCheckbox")
    @js.native
    def BulkSelectionCheckbox: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<{  dataHook :string}> */ Any = js.native
    inline def BulkSelectionCheckbox_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<{  dataHook :string}> */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BulkSelectionCheckbox")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Table", "default.Content")
    @js.native
    def Content: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<{  titleBarVisible :boolean | undefined,   titleBarDisplay :boolean | undefined,   dataHook :string | undefined}> */ Any = js.native
    inline def Content_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<{  titleBarVisible :boolean | undefined,   titleBarDisplay :boolean | undefined,   dataHook :string | undefined}> */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Table", "default.EmptyState")
    @js.native
    def EmptyState: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<EmptyStateProps> */ Any = js.native
    inline def EmptyState_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<EmptyStateProps> */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EmptyState")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Table", "default.SubToolbar")
    @js.native
    def SubToolbar: FunctionComponent[`4`] = js.native
    inline def SubToolbar_=(x: FunctionComponent[`4`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SubToolbar")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Table", "default.Titlebar")
    @js.native
    def Titlebar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<{  dataHook :string | undefined}> */ Any = js.native
    inline def Titlebar_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<{  dataHook :string | undefined}> */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Titlebar")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Table", "default.ToolbarContainer")
    @js.native
    def ToolbarContainer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC */ Any = js.native
    inline def ToolbarContainer_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ToolbarContainer")(x.asInstanceOf[js.Any])
  }
  
  type OnSelectionChangedFn = js.Function2[
    /* selectedIds */ js.UndefOr[(js.Array[Double | String]) | Null], 
    /* change */ Origin | OriginType, 
    Unit
  ]
  
  type SelectionDisabledFn[RowData] = js.Function1[/* rowData */ RowData, Unit]
  
  @js.native
  trait Table[RowData]
    extends Component[TableProps[RowData], js.Object, Any] {
    
    def setSelectedIds(): Unit = js.native
    def setSelectedIds(selectedIds: js.Array[Double | String]): Unit = js.native
  }
  
  type TableColumn[RowDataType] = DataTableColumn[RowDataType]
  
  trait TableProps[RowData]
    extends StObject
       with UsedDataTableProps[RowData] {
    
    var columns: js.Array[TableColumn[RowData]]
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var deselectRowsByDefault: js.UndefOr[Boolean] = js.undefined
    
    var dragAndDrop: js.UndefOr[TableDragAndDrop[Element]] = js.undefined
    
    var hideBulkSelectionCheckbox: js.UndefOr[Boolean] = js.undefined
    
    var isDragAndDropDisabled: js.UndefOr[Boolean] = js.undefined
    
    var onDragCancel: js.UndefOr[js.Function1[/* event */ DragEndEvent, Any]] = js.undefined
    
    var onDragEnd: js.UndefOr[js.Function1[/* event */ DragEndEvent, Any]] = js.undefined
    
    var onDragStart: js.UndefOr[js.Function1[/* event */ DragStartEvent, Any]] = js.undefined
    
    var onSelectionChanged: js.UndefOr[OnSelectionChangedFn] = js.undefined
    
    var onSortClick: js.UndefOr[
        js.Function2[/* colData */ TableColumn[RowDataDefaultType], /* colNum */ Double, Unit]
      ] = js.undefined
    
    var selectedIds: js.UndefOr[js.Array[Double | String]] = js.undefined
    
    var selectionDisabled: js.UndefOr[Boolean | SelectionDisabledFn[RowData]] = js.undefined
    
    var showSelection: js.UndefOr[Boolean] = js.undefined
    
    var totalSelectableCount: js.UndefOr[Double] = js.undefined
    
    var withWrapper: js.UndefOr[Boolean] = js.undefined
  }
  object TableProps {
    
    inline def apply[RowData](columns: js.Array[TableColumn[RowData]]): TableProps[RowData] = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableProps[RowData]]
    }
    
    extension [Self <: TableProps[?], RowData](x: Self & TableProps[RowData]) {
      
      inline def setColumns(value: js.Array[TableColumn[RowData]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: TableColumn[RowData]*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDeselectRowsByDefault(value: Boolean): Self = StObject.set(x, "deselectRowsByDefault", value.asInstanceOf[js.Any])
      
      inline def setDeselectRowsByDefaultUndefined: Self = StObject.set(x, "deselectRowsByDefault", js.undefined)
      
      inline def setDragAndDrop(value: TableDragAndDrop[Element]): Self = StObject.set(x, "dragAndDrop", value.asInstanceOf[js.Any])
      
      inline def setDragAndDropUndefined: Self = StObject.set(x, "dragAndDrop", js.undefined)
      
      inline def setHideBulkSelectionCheckbox(value: Boolean): Self = StObject.set(x, "hideBulkSelectionCheckbox", value.asInstanceOf[js.Any])
      
      inline def setHideBulkSelectionCheckboxUndefined: Self = StObject.set(x, "hideBulkSelectionCheckbox", js.undefined)
      
      inline def setIsDragAndDropDisabled(value: Boolean): Self = StObject.set(x, "isDragAndDropDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsDragAndDropDisabledUndefined: Self = StObject.set(x, "isDragAndDropDisabled", js.undefined)
      
      inline def setOnDragCancel(value: /* event */ DragEndEvent => Any): Self = StObject.set(x, "onDragCancel", js.Any.fromFunction1(value))
      
      inline def setOnDragCancelUndefined: Self = StObject.set(x, "onDragCancel", js.undefined)
      
      inline def setOnDragEnd(value: /* event */ DragEndEvent => Any): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragStart(value: /* event */ DragStartEvent => Any): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnSelectionChanged(
        value: (/* selectedIds */ js.UndefOr[(js.Array[Double | String]) | Null], /* change */ Origin | OriginType) => Callback
      ): Self = StObject.set(x, "onSelectionChanged", js.Any.fromFunction2((t0: /* selectedIds */ js.UndefOr[(js.Array[Double | String]) | Null], t1: /* change */ Origin | OriginType) => (value(t0, t1)).runNow()))
      
      inline def setOnSelectionChangedUndefined: Self = StObject.set(x, "onSelectionChanged", js.undefined)
      
      inline def setOnSortClick(value: (/* colData */ TableColumn[RowDataDefaultType], /* colNum */ Double) => Callback): Self = StObject.set(x, "onSortClick", js.Any.fromFunction2((t0: /* colData */ TableColumn[RowDataDefaultType], t1: /* colNum */ Double) => (value(t0, t1)).runNow()))
      
      inline def setOnSortClickUndefined: Self = StObject.set(x, "onSortClick", js.undefined)
      
      inline def setSelectedIds(value: js.Array[Double | String]): Self = StObject.set(x, "selectedIds", value.asInstanceOf[js.Any])
      
      inline def setSelectedIdsUndefined: Self = StObject.set(x, "selectedIds", js.undefined)
      
      inline def setSelectedIdsVarargs(value: (Double | String)*): Self = StObject.set(x, "selectedIds", js.Array(value*))
      
      inline def setSelectionDisabled(value: Boolean | SelectionDisabledFn[RowData]): Self = StObject.set(x, "selectionDisabled", value.asInstanceOf[js.Any])
      
      inline def setSelectionDisabledFunction1(value: RowData => Callback): Self = StObject.set(x, "selectionDisabled", js.Any.fromFunction1((t0: RowData) => value(t0).runNow()))
      
      inline def setSelectionDisabledUndefined: Self = StObject.set(x, "selectionDisabled", js.undefined)
      
      inline def setShowSelection(value: Boolean): Self = StObject.set(x, "showSelection", value.asInstanceOf[js.Any])
      
      inline def setShowSelectionUndefined: Self = StObject.set(x, "showSelection", js.undefined)
      
      inline def setTotalSelectableCount(value: Double): Self = StObject.set(x, "totalSelectableCount", value.asInstanceOf[js.Any])
      
      inline def setTotalSelectableCountUndefined: Self = StObject.set(x, "totalSelectableCount", js.undefined)
      
      inline def setWithWrapper(value: Boolean): Self = StObject.set(x, "withWrapper", value.asInstanceOf[js.Any])
      
      inline def setWithWrapperUndefined: Self = StObject.set(x, "withWrapper", js.undefined)
    }
  }
  
  /* Inlined std.Pick<wix-style-react.wix-style-react/dist/types/Table/DataTable.DataTableProps<RowData>, 'allowMultiDetailsExpansion' | 'dynamicRowClass' | 'isRowHighlight' | 'hasMore' | 'initialLoad' | 'id' | 'infiniteScroll' | 'itemsPerPage' | 'loader' | 'loadMore' | 'onRowClick' | 'onMouseEnterRow' | 'onMouseLeaveRow' | 'useWindow' | 'scrollElement' | 'rowVerticalPadding' | 'rowDetails' | 'removeRowDetailsPadding' | 'rowDataHook' | 'rowClass' | 'showHeaderWhenEmpty' | 'showLastRowDivider' | 'virtualized' | 'virtualizedTableHeight' | 'virtualizedLineHeight' | 'virtualizedListRef' | 'width' | 'skin' | 'data' | 'horizontalScroll' | 'stickyColumns' | 'isRowDisabled' | 'infiniteScrollRef'> */
  trait UsedDataTableProps[RowData] extends StObject {
    
    var allowMultiDetailsExpansion: js.UndefOr[Boolean] = js.undefined
    
    var data: js.UndefOr[js.Array[RowData]] = js.undefined
    
    var dynamicRowClass: js.UndefOr[js.Function2[/* rowData */ RowData, /* rowNum */ Double, String]] = js.undefined
    
    var hasMore: js.UndefOr[Boolean] = js.undefined
    
    var horizontalScroll: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var infiniteScroll: js.UndefOr[Boolean] = js.undefined
    
    var infiniteScrollRef: js.UndefOr[Ref[Any]] = js.undefined
    
    var initialLoad: js.UndefOr[Boolean] = js.undefined
    
    var isRowDisabled: js.UndefOr[js.Function1[/* rowData */ RowData, Boolean]] = js.undefined
    
    var isRowHighlight: js.UndefOr[js.Function2[/* rowData */ RowData, /* rowNum */ Double, Boolean]] = js.undefined
    
    var itemsPerPage: js.UndefOr[Double] = js.undefined
    
    var loadMore: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var loader: js.UndefOr[Node] = js.undefined
    
    var onMouseEnterRow: js.UndefOr[js.Function2[/* rowData */ RowData, /* rowNum */ Double, Unit]] = js.undefined
    
    var onMouseLeaveRow: js.UndefOr[js.Function2[/* rowData */ RowData, /* rowNum */ Double, Unit]] = js.undefined
    
    var onRowClick: js.UndefOr[js.Function2[/* rowData */ RowData, /* rowNum */ Double, Unit]] = js.undefined
    
    var removeRowDetailsPadding: js.UndefOr[Boolean] = js.undefined
    
    var rowClass: js.UndefOr[String] = js.undefined
    
    var rowDataHook: js.UndefOr[String | DataTableRowDataHookFn[RowData]] = js.undefined
    
    var rowDetails: js.UndefOr[js.Function2[/* rowData */ RowData, /* rowNum */ Double, Node]] = js.undefined
    
    var rowVerticalPadding: js.UndefOr[DataTableRowVerticalPadding] = js.undefined
    
    var scrollElement: js.UndefOr[HTMLElement | RefHandle[Any]] = js.undefined
    
    var showHeaderWhenEmpty: js.UndefOr[Boolean] = js.undefined
    
    var showLastRowDivider: js.UndefOr[Boolean] = js.undefined
    
    var skin: js.UndefOr[DataTableSkin] = js.undefined
    
    var stickyColumns: js.UndefOr[Double] = js.undefined
    
    var useWindow: js.UndefOr[Boolean] = js.undefined
    
    var virtualized: js.UndefOr[Boolean] = js.undefined
    
    var virtualizedLineHeight: js.UndefOr[Double] = js.undefined
    
    var virtualizedListRef: js.UndefOr[LegacyRef[Any]] = js.undefined
    
    var virtualizedTableHeight: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
  }
  object UsedDataTableProps {
    
    inline def apply[RowData](): UsedDataTableProps[RowData] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UsedDataTableProps[RowData]]
    }
    
    extension [Self <: UsedDataTableProps[?], RowData](x: Self & UsedDataTableProps[RowData]) {
      
      inline def setAllowMultiDetailsExpansion(value: Boolean): Self = StObject.set(x, "allowMultiDetailsExpansion", value.asInstanceOf[js.Any])
      
      inline def setAllowMultiDetailsExpansionUndefined: Self = StObject.set(x, "allowMultiDetailsExpansion", js.undefined)
      
      inline def setData(value: js.Array[RowData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: RowData*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDynamicRowClass(value: (/* rowData */ RowData, /* rowNum */ Double) => String): Self = StObject.set(x, "dynamicRowClass", js.Any.fromFunction2(value))
      
      inline def setDynamicRowClassUndefined: Self = StObject.set(x, "dynamicRowClass", js.undefined)
      
      inline def setHasMore(value: Boolean): Self = StObject.set(x, "hasMore", value.asInstanceOf[js.Any])
      
      inline def setHasMoreUndefined: Self = StObject.set(x, "hasMore", js.undefined)
      
      inline def setHorizontalScroll(value: Boolean): Self = StObject.set(x, "horizontalScroll", value.asInstanceOf[js.Any])
      
      inline def setHorizontalScrollUndefined: Self = StObject.set(x, "horizontalScroll", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInfiniteScroll(value: Boolean): Self = StObject.set(x, "infiniteScroll", value.asInstanceOf[js.Any])
      
      inline def setInfiniteScrollRef(value: Ref[Any]): Self = StObject.set(x, "infiniteScrollRef", value.asInstanceOf[js.Any])
      
      inline def setInfiniteScrollRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "infiniteScrollRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
      
      inline def setInfiniteScrollRefNull: Self = StObject.set(x, "infiniteScrollRef", null)
      
      inline def setInfiniteScrollRefUndefined: Self = StObject.set(x, "infiniteScrollRef", js.undefined)
      
      inline def setInfiniteScrollUndefined: Self = StObject.set(x, "infiniteScroll", js.undefined)
      
      inline def setInitialLoad(value: Boolean): Self = StObject.set(x, "initialLoad", value.asInstanceOf[js.Any])
      
      inline def setInitialLoadUndefined: Self = StObject.set(x, "initialLoad", js.undefined)
      
      inline def setIsRowDisabled(value: /* rowData */ RowData => Boolean): Self = StObject.set(x, "isRowDisabled", js.Any.fromFunction1(value))
      
      inline def setIsRowDisabledUndefined: Self = StObject.set(x, "isRowDisabled", js.undefined)
      
      inline def setIsRowHighlight(value: (/* rowData */ RowData, /* rowNum */ Double) => Boolean): Self = StObject.set(x, "isRowHighlight", js.Any.fromFunction2(value))
      
      inline def setIsRowHighlightUndefined: Self = StObject.set(x, "isRowHighlight", js.undefined)
      
      inline def setItemsPerPage(value: Double): Self = StObject.set(x, "itemsPerPage", value.asInstanceOf[js.Any])
      
      inline def setItemsPerPageUndefined: Self = StObject.set(x, "itemsPerPage", js.undefined)
      
      inline def setLoadMore(value: Callback): Self = StObject.set(x, "loadMore", value.toJsFn)
      
      inline def setLoadMoreUndefined: Self = StObject.set(x, "loadMore", js.undefined)
      
      inline def setLoader(value: VdomNode): Self = StObject.set(x, "loader", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLoaderNull: Self = StObject.set(x, "loader", null)
      
      inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
      inline def setLoaderVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "loader", js.Array(value*))
      
      inline def setLoaderVdomElement(value: VdomElement): Self = StObject.set(x, "loader", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnMouseEnterRow(value: (/* rowData */ RowData, /* rowNum */ Double) => Callback): Self = StObject.set(x, "onMouseEnterRow", js.Any.fromFunction2((t0: /* rowData */ RowData, t1: /* rowNum */ Double) => (value(t0, t1)).runNow()))
      
      inline def setOnMouseEnterRowUndefined: Self = StObject.set(x, "onMouseEnterRow", js.undefined)
      
      inline def setOnMouseLeaveRow(value: (/* rowData */ RowData, /* rowNum */ Double) => Callback): Self = StObject.set(x, "onMouseLeaveRow", js.Any.fromFunction2((t0: /* rowData */ RowData, t1: /* rowNum */ Double) => (value(t0, t1)).runNow()))
      
      inline def setOnMouseLeaveRowUndefined: Self = StObject.set(x, "onMouseLeaveRow", js.undefined)
      
      inline def setOnRowClick(value: (/* rowData */ RowData, /* rowNum */ Double) => Callback): Self = StObject.set(x, "onRowClick", js.Any.fromFunction2((t0: /* rowData */ RowData, t1: /* rowNum */ Double) => (value(t0, t1)).runNow()))
      
      inline def setOnRowClickUndefined: Self = StObject.set(x, "onRowClick", js.undefined)
      
      inline def setRemoveRowDetailsPadding(value: Boolean): Self = StObject.set(x, "removeRowDetailsPadding", value.asInstanceOf[js.Any])
      
      inline def setRemoveRowDetailsPaddingUndefined: Self = StObject.set(x, "removeRowDetailsPadding", js.undefined)
      
      inline def setRowClass(value: String): Self = StObject.set(x, "rowClass", value.asInstanceOf[js.Any])
      
      inline def setRowClassUndefined: Self = StObject.set(x, "rowClass", js.undefined)
      
      inline def setRowDataHook(value: String | DataTableRowDataHookFn[RowData]): Self = StObject.set(x, "rowDataHook", value.asInstanceOf[js.Any])
      
      inline def setRowDataHookFunction2(value: (RowData, /* rowNum */ Double) => String): Self = StObject.set(x, "rowDataHook", js.Any.fromFunction2(value))
      
      inline def setRowDataHookUndefined: Self = StObject.set(x, "rowDataHook", js.undefined)
      
      inline def setRowDetails(value: (/* rowData */ RowData, /* rowNum */ Double) => Node): Self = StObject.set(x, "rowDetails", js.Any.fromFunction2(value))
      
      inline def setRowDetailsUndefined: Self = StObject.set(x, "rowDetails", js.undefined)
      
      inline def setRowVerticalPadding(value: DataTableRowVerticalPadding): Self = StObject.set(x, "rowVerticalPadding", value.asInstanceOf[js.Any])
      
      inline def setRowVerticalPaddingUndefined: Self = StObject.set(x, "rowVerticalPadding", js.undefined)
      
      inline def setScrollElement(value: HTMLElement | RefHandle[Any]): Self = StObject.set(x, "scrollElement", value.asInstanceOf[js.Any])
      
      inline def setScrollElementUndefined: Self = StObject.set(x, "scrollElement", js.undefined)
      
      inline def setShowHeaderWhenEmpty(value: Boolean): Self = StObject.set(x, "showHeaderWhenEmpty", value.asInstanceOf[js.Any])
      
      inline def setShowHeaderWhenEmptyUndefined: Self = StObject.set(x, "showHeaderWhenEmpty", js.undefined)
      
      inline def setShowLastRowDivider(value: Boolean): Self = StObject.set(x, "showLastRowDivider", value.asInstanceOf[js.Any])
      
      inline def setShowLastRowDividerUndefined: Self = StObject.set(x, "showLastRowDivider", js.undefined)
      
      inline def setSkin(value: DataTableSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setStickyColumns(value: Double): Self = StObject.set(x, "stickyColumns", value.asInstanceOf[js.Any])
      
      inline def setStickyColumnsUndefined: Self = StObject.set(x, "stickyColumns", js.undefined)
      
      inline def setUseWindow(value: Boolean): Self = StObject.set(x, "useWindow", value.asInstanceOf[js.Any])
      
      inline def setUseWindowUndefined: Self = StObject.set(x, "useWindow", js.undefined)
      
      inline def setVirtualized(value: Boolean): Self = StObject.set(x, "virtualized", value.asInstanceOf[js.Any])
      
      inline def setVirtualizedLineHeight(value: Double): Self = StObject.set(x, "virtualizedLineHeight", value.asInstanceOf[js.Any])
      
      inline def setVirtualizedLineHeightUndefined: Self = StObject.set(x, "virtualizedLineHeight", js.undefined)
      
      inline def setVirtualizedListRef(value: LegacyRef[Any]): Self = StObject.set(x, "virtualizedListRef", value.asInstanceOf[js.Any])
      
      inline def setVirtualizedListRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "virtualizedListRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
      
      inline def setVirtualizedListRefNull: Self = StObject.set(x, "virtualizedListRef", null)
      
      inline def setVirtualizedListRefUndefined: Self = StObject.set(x, "virtualizedListRef", js.undefined)
      
      inline def setVirtualizedTableHeight(value: Double): Self = StObject.set(x, "virtualizedTableHeight", value.asInstanceOf[js.Any])
      
      inline def setVirtualizedTableHeightUndefined: Self = StObject.set(x, "virtualizedTableHeight", js.undefined)
      
      inline def setVirtualizedUndefined: Self = StObject.set(x, "virtualized", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
