package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.facade.React.RefHandle
import typingsJapgolly.propTypes.mod.InferProps
import typingsJapgolly.propTypes.mod.ReactNodeLike
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.propTypes.mod.Validator
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.NamedExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.ResizeObserver
import typingsJapgolly.wixStyleReact.anon.ColNum
import typingsJapgolly.wixStyleReact.anon.Column
import typingsJapgolly.wixStyleReact.anon.CurrentPage
import typingsJapgolly.wixStyleReact.anon.DataIndex
import typingsJapgolly.wixStyleReact.anon.DictxChildren
import typingsJapgolly.wixStyleReact.anon.Important
import typingsJapgolly.wixStyleReact.anon.IsDragOverlay
import typingsJapgolly.wixStyleReact.anon.ItemsPerPage
import typingsJapgolly.wixStyleReact.anon.MaskingClassNames
import typingsJapgolly.wixStyleReact.anon.SelectedRows
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableDataTableDataTableMod {
  
  @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", JSImport.Default)
  @js.native
  open class default protected () extends DataTable {
    def this(props: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.defaultProps.columns")
      @js.native
      val columns: js.Array[scala.Nothing] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.defaultProps.data")
      @js.native
      val data: js.Array[scala.Nothing] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.defaultProps.dragAndDrop")
      @js.native
      val dragAndDrop: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.defaultProps.hasMore")
      @js.native
      val hasMore: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.defaultProps.horizontalScroll")
      @js.native
      val horizontalScroll: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.defaultProps.infiniteScroll")
      @js.native
      val infiniteScroll: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.defaultProps.initialLoad")
      @js.native
      val initialLoad: Boolean = js.native
      
      inline def isRowDisabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRowDisabled")().asInstanceOf[Boolean]
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.defaultProps.isRowSelected")
      @js.native
      val isRowSelected: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.defaultProps.itemsPerPage")
      @js.native
      val itemsPerPage: Double = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.defaultProps.loadMore")
      @js.native
      val loadMore: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.defaultProps.loader")
      @js.native
      val loader: Element = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.defaultProps.removeRowDetailsPadding")
      @js.native
      val removeRowDetailsPadding: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.defaultProps.rowVerticalPadding")
      @js.native
      val rowVerticalPadding: String = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.defaultProps.scrollElement")
      @js.native
      val scrollElement: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.defaultProps.selectedRowsIds")
      @js.native
      val selectedRowsIds: js.Array[scala.Nothing] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.defaultProps.showHeaderWhenEmpty")
      @js.native
      val showHeaderWhenEmpty: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.defaultProps.showLastRowDivider")
      @js.native
      val showLastRowDivider: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.defaultProps.skin")
      @js.native
      val skin: String = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.defaultProps.stickyColumns")
      @js.native
      val stickyColumns: Double = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.defaultProps.useWindow")
      @js.native
      val useWindow: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.defaultProps.virtualizedLineHeight")
      @js.native
      val virtualizedLineHeight: Double = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.defaultProps.width_1")
      @js.native
      val width1: String = js.native
    }
    
    @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes1 {
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.allowMultiDetailsExpansion")
      @js.native
      val allowMultiDetailsExpansion: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.columns_1")
      @js.native
      val columns1: Validator[js.Array[js.UndefOr[InferProps[Important] | Null]]] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.dragAndDrop_1")
      @js.native
      val dragAndDrop1: Requireable[js.Object] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.dynamicRowClass")
      @js.native
      val dynamicRowClass: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.hasMore_1")
      @js.native
      val hasMore1: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.hideHeader")
      @js.native
      val hideHeader: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.hideHeaderAccessible")
      @js.native
      val hideHeaderAccessible: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.horizontalScroll_1")
      @js.native
      val horizontalScroll1: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.id")
      @js.native
      val id: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.infiniteScroll_1")
      @js.native
      val infiniteScroll1: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.initialLoad_1")
      @js.native
      val initialLoad1: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.isDragAndDropDisabled")
      @js.native
      val isDragAndDropDisabled: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.isRowDisabled_1")
      @js.native
      val isRowDisabled1: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.isRowHighlight")
      @js.native
      val isRowHighlight: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.isRowSelected_1")
      @js.native
      val isRowSelected1: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.itemsPerPage_1")
      @js.native
      val itemsPerPage1: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.leftShadowVisible")
      @js.native
      val leftShadowVisible: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.loadMore_1")
      @js.native
      val loadMore1: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.loader_1")
      @js.native
      val loader1: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.onDragCancel")
      @js.native
      val onDragCancel: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.onDragEnd")
      @js.native
      val onDragEnd: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.onDragStart")
      @js.native
      val onDragStart: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.onMouseEnterRow")
      @js.native
      val onMouseEnterRow: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.onMouseLeaveRow")
      @js.native
      val onMouseLeaveRow: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.onRowClick")
      @js.native
      val onRowClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.onSortClick")
      @js.native
      val onSortClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.onUpdateScrollShadows")
      @js.native
      val onUpdateScrollShadows: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.removeRowDetailsPadding_1")
      @js.native
      val removeRowDetailsPadding1: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.rightShadowVisible")
      @js.native
      val rightShadowVisible: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.rowClass")
      @js.native
      val rowClass: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.rowDataHook")
      @js.native
      val rowDataHook: Requireable[String | (js.Function1[/* repeated */ Any, Any])] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.rowDetails")
      @js.native
      val rowDetails: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.rowVerticalPadding_1")
      @js.native
      val rowVerticalPadding1: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.scrollElement_1")
      @js.native
      val scrollElement1: Requireable[js.Object] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.selectedRowsIds_1")
      @js.native
      val selectedRowsIds1: Requireable[js.Array[js.UndefOr[String | Double | Null]]] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.showHeaderWhenEmpty_1")
      @js.native
      val showHeaderWhenEmpty1: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.showLastRowDivider_1")
      @js.native
      val showLastRowDivider1: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.skin_1")
      @js.native
      val skin1: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.stickyColumns_1")
      @js.native
      val stickyColumns1: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.thBorder")
      @js.native
      val thBorder: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.thBoxShadow")
      @js.native
      val thBoxShadow: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.thColor")
      @js.native
      val thColor: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.thFontSize")
      @js.native
      val thFontSize: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.thHeight")
      @js.native
      val thHeight: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.thLetterSpacing")
      @js.native
      val thLetterSpacing: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.thOpacity")
      @js.native
      val thOpacity: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.thPadding")
      @js.native
      val thPadding: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.useWindow_1")
      @js.native
      val useWindow1: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.virtualized")
      @js.native
      val virtualized: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.virtualizedLineHeight_1")
      @js.native
      val virtualizedLineHeight1: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.virtualizedListRef")
      @js.native
      val virtualizedListRef: Requireable[Any] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.virtualizedTableHeight")
      @js.native
      val virtualizedTableHeight: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "default.propTypes_1.width_2")
      @js.native
      val width2: Requireable[String] = js.native
    }
  }
  
  object DataTableHeader {
    
    inline def apply(props: Any): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "DataTableHeader")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Table/DataTable/DataTable", "DataTableHeader.propTypes.width")
      @js.native
      val width: Requireable[String] = js.native
    }
  }
  
  @js.native
  trait DataTable extends Component[Any, Any, Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MDataTable(nextProps: Any): Unit = js.native
    
    def _updateScrollShadows(): Unit = js.native
    
    def calcLastPage(hasDataItemsPerPage: ItemsPerPage): Double = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MDataTable(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDataTable(): Unit = js.native
    
    var contentRef: RefHandle[Any] = js.native
    
    var contentResizeObserver: js.UndefOr[ResizeObserver] = js.native
    
    def createInitialScrollingState(props: Any): CurrentPage = js.native
    
    def getCellClasses(hasColumnColNumRowData: ColNum): String = js.native
    
    def getVirtualRowHeight(): Any = js.native
    
    def loadMore(): Unit = js.native
    
    def onRowClick(rowData: Any, rowNum: Any): Unit = js.native
    
    def renderBody(rows: Any): Element = js.native
    
    def renderCell(hasRowDataColumnRowNumColNumMaskingClassNamesIsDragOverlay: Column): Element = js.native
    
    def renderRow(hasRowDataRowNumStyleMaskingClassNamesIsDragOverlay: MaskingClassNames): js.Array[Element] = js.native
    
    def renderRowWithMaskingClassNames(hasRowDataRowNumStyleIsDragOverlay: IsDragOverlay): Element = js.native
    
    def renderTable(rowsToRender: Any): Element = js.native
    
    var renderVirtualizedMemoizedRow: NamedExoticComponent[DataIndex] = js.native
    
    def renderVirtualizedRow(hasDataIndexStyle: DataIndex): Element = js.native
    
    def renderVirtualizedTable(): Element = js.native
    
    def renderVirtualizedTableElement(hasChildrenRest: DictxChildren): Element = js.native
    
    @JSName("state")
    var state_DataTable: SelectedRows = js.native
    
    def style: Any = js.native
    
    def toggleRowDetails(selectedRow: Any): Unit = js.native
    
    var virtualizedTableElementWithRefForward: ForwardRefExoticComponent[RefAttributes[Any]] = js.native
    
    def wrapWithHorizontalScroll(table: Any): Element = js.native
    
    def wrapWithInfiniteScroll(table: Any): Element = js.native
  }
}
