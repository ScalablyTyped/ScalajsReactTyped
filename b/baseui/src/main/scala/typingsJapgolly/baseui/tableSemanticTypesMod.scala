package typingsJapgolly.baseui

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.baseui.baseuiStrings.ASC
import typingsJapgolly.baseui.baseuiStrings.DESC
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.helpersOverridesMod.Override
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableSemanticTypesMod {
  
  trait BuilderOverrides
    extends StObject
       with TableOverrides {
    
    var SortAscIcon: js.UndefOr[Override[Any]] = js.undefined
    
    var SortDescIcon: js.UndefOr[Override[Any]] = js.undefined
    
    var SortIconContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var SortNoneIcon: js.UndefOr[Override[Any]] = js.undefined
    
    var TableHeadCellSortable: js.UndefOr[Override[Any]] = js.undefined
  }
  object BuilderOverrides {
    
    inline def apply(): BuilderOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BuilderOverrides]
    }
    
    extension [Self <: BuilderOverrides](x: Self) {
      
      inline def setSortAscIcon(value: Override[Any]): Self = StObject.set(x, "SortAscIcon", value.asInstanceOf[js.Any])
      
      inline def setSortAscIconUndefined: Self = StObject.set(x, "SortAscIcon", js.undefined)
      
      inline def setSortDescIcon(value: Override[Any]): Self = StObject.set(x, "SortDescIcon", value.asInstanceOf[js.Any])
      
      inline def setSortDescIconUndefined: Self = StObject.set(x, "SortDescIcon", js.undefined)
      
      inline def setSortIconContainer(value: Override[Any]): Self = StObject.set(x, "SortIconContainer", value.asInstanceOf[js.Any])
      
      inline def setSortIconContainerUndefined: Self = StObject.set(x, "SortIconContainer", js.undefined)
      
      inline def setSortNoneIcon(value: Override[Any]): Self = StObject.set(x, "SortNoneIcon", value.asInstanceOf[js.Any])
      
      inline def setSortNoneIconUndefined: Self = StObject.set(x, "SortNoneIcon", js.undefined)
      
      inline def setTableHeadCellSortable(value: Override[Any]): Self = StObject.set(x, "TableHeadCellSortable", value.asInstanceOf[js.Any])
      
      inline def setTableHeadCellSortableUndefined: Self = StObject.set(x, "TableHeadCellSortable", js.undefined)
    }
  }
  
  trait ColumnOverrides extends StObject {
    
    var SortAscIcon: js.UndefOr[Override[Any]] = js.undefined
    
    var SortDescIcon: js.UndefOr[Override[Any]] = js.undefined
    
    var SortNoneIcon: js.UndefOr[Override[Any]] = js.undefined
    
    var TableBodyCell: js.UndefOr[Override[Any]] = js.undefined
    
    var TableHeadCell: js.UndefOr[Override[Any]] = js.undefined
    
    var TableHeadCellSortable: js.UndefOr[Override[Any]] = js.undefined
  }
  object ColumnOverrides {
    
    inline def apply(): ColumnOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnOverrides]
    }
    
    extension [Self <: ColumnOverrides](x: Self) {
      
      inline def setSortAscIcon(value: Override[Any]): Self = StObject.set(x, "SortAscIcon", value.asInstanceOf[js.Any])
      
      inline def setSortAscIconUndefined: Self = StObject.set(x, "SortAscIcon", js.undefined)
      
      inline def setSortDescIcon(value: Override[Any]): Self = StObject.set(x, "SortDescIcon", value.asInstanceOf[js.Any])
      
      inline def setSortDescIconUndefined: Self = StObject.set(x, "SortDescIcon", js.undefined)
      
      inline def setSortNoneIcon(value: Override[Any]): Self = StObject.set(x, "SortNoneIcon", value.asInstanceOf[js.Any])
      
      inline def setSortNoneIconUndefined: Self = StObject.set(x, "SortNoneIcon", js.undefined)
      
      inline def setTableBodyCell(value: Override[Any]): Self = StObject.set(x, "TableBodyCell", value.asInstanceOf[js.Any])
      
      inline def setTableBodyCellUndefined: Self = StObject.set(x, "TableBodyCell", js.undefined)
      
      inline def setTableHeadCell(value: Override[Any]): Self = StObject.set(x, "TableHeadCell", value.asInstanceOf[js.Any])
      
      inline def setTableHeadCellSortable(value: Override[Any]): Self = StObject.set(x, "TableHeadCellSortable", value.asInstanceOf[js.Any])
      
      inline def setTableHeadCellSortableUndefined: Self = StObject.set(x, "TableHeadCellSortable", js.undefined)
      
      inline def setTableHeadCellUndefined: Self = StObject.set(x, "TableHeadCell", js.undefined)
    }
  }
  
  /* Inlined keyof std.Readonly<{ readonly horizontal :'horizontal',  readonly vertical :'vertical',  readonly grid :'grid',  readonly clean :'clean'}> */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.baseui.baseuiStrings.horizontal
    - typingsJapgolly.baseui.baseuiStrings.vertical
    - typingsJapgolly.baseui.baseuiStrings.grid
    - typingsJapgolly.baseui.baseuiStrings.clean
  */
  trait Divider extends StObject
  object Divider {
    
    inline def clean: typingsJapgolly.baseui.baseuiStrings.clean = "clean".asInstanceOf[typingsJapgolly.baseui.baseuiStrings.clean]
    
    inline def grid: typingsJapgolly.baseui.baseuiStrings.grid = "grid".asInstanceOf[typingsJapgolly.baseui.baseuiStrings.grid]
    
    inline def horizontal: typingsJapgolly.baseui.baseuiStrings.horizontal = "horizontal".asInstanceOf[typingsJapgolly.baseui.baseuiStrings.horizontal]
    
    inline def vertical: typingsJapgolly.baseui.baseuiStrings.vertical = "vertical".asInstanceOf[typingsJapgolly.baseui.baseuiStrings.vertical]
  }
  
  /* Inlined keyof std.Readonly<{ readonly compact :'compact',  readonly default :'default',  readonly spacious :'spacious'}> */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.baseui.baseuiStrings.compact
    - typingsJapgolly.baseui.baseuiStrings.default_
    - typingsJapgolly.baseui.baseuiStrings.spacious
  */
  trait Size extends StObject
  object Size {
    
    inline def default: default_ = "default".asInstanceOf[default_]
    
    inline def compact: typingsJapgolly.baseui.baseuiStrings.compact = "compact".asInstanceOf[typingsJapgolly.baseui.baseuiStrings.compact]
    
    inline def spacious: typingsJapgolly.baseui.baseuiStrings.spacious = "spacious".asInstanceOf[typingsJapgolly.baseui.baseuiStrings.spacious]
  }
  
  @js.native
  trait TableBuilderColumnProps[RowT] extends StObject {
    
    def children(row: RowT): Node = js.native
    def children(row: RowT, rowIndex: Double): Node = js.native
    
    var header: js.UndefOr[Node] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var numeric: js.UndefOr[Boolean] = js.native
    
    var overrides: js.UndefOr[ColumnOverrides] = js.native
    
    var sortable: js.UndefOr[Boolean] = js.native
    
    var tableHeadAriaLabel: js.UndefOr[String] = js.native
  }
  
  trait TableBuilderProps[RowT] extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var data: js.Array[RowT]
    
    var divider: js.UndefOr[Divider] = js.undefined
    
    var emptyMessage: js.UndefOr[Node | js.Function0[Node]] = js.undefined
    
    var horizontalScrollWidth: js.UndefOr[String] = js.undefined
    
    var isLoading: js.UndefOr[Boolean] = js.undefined
    
    var loadingMessage: js.UndefOr[Node | js.Function0[Node]] = js.undefined
    
    var onSort: js.UndefOr[js.Function1[/* columnId */ String, Unit]] = js.undefined
    
    var overrides: js.UndefOr[BuilderOverrides] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
    
    var sortColumn: js.UndefOr[String | Null] = js.undefined
    
    var sortOrder: js.UndefOr[ASC | DESC | Null] = js.undefined
  }
  object TableBuilderProps {
    
    inline def apply[RowT](data: js.Array[RowT]): TableBuilderProps[RowT] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableBuilderProps[RowT]]
    }
    
    extension [Self <: TableBuilderProps[?], RowT](x: Self & TableBuilderProps[RowT]) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setData(value: js.Array[RowT]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: RowT*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDivider(value: Divider): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      inline def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
      
      inline def setEmptyMessage(value: Node | js.Function0[Node]): Self = StObject.set(x, "emptyMessage", value.asInstanceOf[js.Any])
      
      inline def setEmptyMessageCallbackTo(value: CallbackTo[Node]): Self = StObject.set(x, "emptyMessage", value.toJsFn)
      
      inline def setEmptyMessageNull: Self = StObject.set(x, "emptyMessage", null)
      
      inline def setEmptyMessageUndefined: Self = StObject.set(x, "emptyMessage", js.undefined)
      
      inline def setEmptyMessageVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "emptyMessage", js.Array(value*))
      
      inline def setEmptyMessageVdomElement(value: VdomElement): Self = StObject.set(x, "emptyMessage", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHorizontalScrollWidth(value: String): Self = StObject.set(x, "horizontalScrollWidth", value.asInstanceOf[js.Any])
      
      inline def setHorizontalScrollWidthUndefined: Self = StObject.set(x, "horizontalScrollWidth", js.undefined)
      
      inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
      
      inline def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
      
      inline def setLoadingMessage(value: Node | js.Function0[Node]): Self = StObject.set(x, "loadingMessage", value.asInstanceOf[js.Any])
      
      inline def setLoadingMessageCallbackTo(value: CallbackTo[Node]): Self = StObject.set(x, "loadingMessage", value.toJsFn)
      
      inline def setLoadingMessageNull: Self = StObject.set(x, "loadingMessage", null)
      
      inline def setLoadingMessageUndefined: Self = StObject.set(x, "loadingMessage", js.undefined)
      
      inline def setLoadingMessageVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "loadingMessage", js.Array(value*))
      
      inline def setLoadingMessageVdomElement(value: VdomElement): Self = StObject.set(x, "loadingMessage", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnSort(value: /* columnId */ String => Callback): Self = StObject.set(x, "onSort", js.Any.fromFunction1((t0: /* columnId */ String) => value(t0).runNow()))
      
      inline def setOnSortUndefined: Self = StObject.set(x, "onSort", js.undefined)
      
      inline def setOverrides(value: BuilderOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSortColumn(value: String): Self = StObject.set(x, "sortColumn", value.asInstanceOf[js.Any])
      
      inline def setSortColumnNull: Self = StObject.set(x, "sortColumn", null)
      
      inline def setSortColumnUndefined: Self = StObject.set(x, "sortColumn", js.undefined)
      
      inline def setSortOrder(value: ASC | DESC): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      inline def setSortOrderNull: Self = StObject.set(x, "sortOrder", null)
      
      inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    }
  }
  
  trait TableOverrides extends StObject {
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
    
    var Table: js.UndefOr[Override[Any]] = js.undefined
    
    var TableBody: js.UndefOr[Override[Any]] = js.undefined
    
    var TableBodyCell: js.UndefOr[Override[Any]] = js.undefined
    
    var TableBodyRow: js.UndefOr[Override[Any]] = js.undefined
    
    var TableEmptyMessage: js.UndefOr[Override[Any]] = js.undefined
    
    var TableHead: js.UndefOr[Override[Any]] = js.undefined
    
    var TableHeadCell: js.UndefOr[Override[Any]] = js.undefined
    
    var TableHeadRow: js.UndefOr[Override[Any]] = js.undefined
    
    var TableLoadingMessage: js.UndefOr[Override[Any]] = js.undefined
  }
  object TableOverrides {
    
    inline def apply(): TableOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableOverrides]
    }
    
    extension [Self <: TableOverrides](x: Self) {
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      inline def setTable(value: Override[Any]): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
      
      inline def setTableBody(value: Override[Any]): Self = StObject.set(x, "TableBody", value.asInstanceOf[js.Any])
      
      inline def setTableBodyCell(value: Override[Any]): Self = StObject.set(x, "TableBodyCell", value.asInstanceOf[js.Any])
      
      inline def setTableBodyCellUndefined: Self = StObject.set(x, "TableBodyCell", js.undefined)
      
      inline def setTableBodyRow(value: Override[Any]): Self = StObject.set(x, "TableBodyRow", value.asInstanceOf[js.Any])
      
      inline def setTableBodyRowUndefined: Self = StObject.set(x, "TableBodyRow", js.undefined)
      
      inline def setTableBodyUndefined: Self = StObject.set(x, "TableBody", js.undefined)
      
      inline def setTableEmptyMessage(value: Override[Any]): Self = StObject.set(x, "TableEmptyMessage", value.asInstanceOf[js.Any])
      
      inline def setTableEmptyMessageUndefined: Self = StObject.set(x, "TableEmptyMessage", js.undefined)
      
      inline def setTableHead(value: Override[Any]): Self = StObject.set(x, "TableHead", value.asInstanceOf[js.Any])
      
      inline def setTableHeadCell(value: Override[Any]): Self = StObject.set(x, "TableHeadCell", value.asInstanceOf[js.Any])
      
      inline def setTableHeadCellUndefined: Self = StObject.set(x, "TableHeadCell", js.undefined)
      
      inline def setTableHeadRow(value: Override[Any]): Self = StObject.set(x, "TableHeadRow", value.asInstanceOf[js.Any])
      
      inline def setTableHeadRowUndefined: Self = StObject.set(x, "TableHeadRow", js.undefined)
      
      inline def setTableHeadUndefined: Self = StObject.set(x, "TableHead", js.undefined)
      
      inline def setTableLoadingMessage(value: Override[Any]): Self = StObject.set(x, "TableLoadingMessage", value.asInstanceOf[js.Any])
      
      inline def setTableLoadingMessageUndefined: Self = StObject.set(x, "TableLoadingMessage", js.undefined)
      
      inline def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
    }
  }
  
  trait TableProps extends StObject {
    
    var columns: js.Array[Node]
    
    var data: js.Array[js.Array[Node]]
    
    var divider: js.UndefOr[Divider] = js.undefined
    
    var emptyMessage: js.UndefOr[Node | js.Function0[Node]] = js.undefined
    
    var horizontalScrollWidth: js.UndefOr[String] = js.undefined
    
    var isLoading: js.UndefOr[Boolean] = js.undefined
    
    var loadingMessage: js.UndefOr[Node | js.Function0[Node]] = js.undefined
    
    var overrides: js.UndefOr[TableOverrides] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
  }
  object TableProps {
    
    inline def apply(columns: js.Array[Node], data: js.Array[js.Array[Node]]): TableProps = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableProps]
    }
    
    extension [Self <: TableProps](x: Self) {
      
      inline def setColumns(value: js.Array[Node]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: Node*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setData(value: js.Array[js.Array[Node]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: js.Array[Node]*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDivider(value: Divider): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      inline def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
      
      inline def setEmptyMessage(value: Node | js.Function0[Node]): Self = StObject.set(x, "emptyMessage", value.asInstanceOf[js.Any])
      
      inline def setEmptyMessageCallbackTo(value: CallbackTo[Node]): Self = StObject.set(x, "emptyMessage", value.toJsFn)
      
      inline def setEmptyMessageNull: Self = StObject.set(x, "emptyMessage", null)
      
      inline def setEmptyMessageUndefined: Self = StObject.set(x, "emptyMessage", js.undefined)
      
      inline def setEmptyMessageVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "emptyMessage", js.Array(value*))
      
      inline def setEmptyMessageVdomElement(value: VdomElement): Self = StObject.set(x, "emptyMessage", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHorizontalScrollWidth(value: String): Self = StObject.set(x, "horizontalScrollWidth", value.asInstanceOf[js.Any])
      
      inline def setHorizontalScrollWidthUndefined: Self = StObject.set(x, "horizontalScrollWidth", js.undefined)
      
      inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
      
      inline def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
      
      inline def setLoadingMessage(value: Node | js.Function0[Node]): Self = StObject.set(x, "loadingMessage", value.asInstanceOf[js.Any])
      
      inline def setLoadingMessageCallbackTo(value: CallbackTo[Node]): Self = StObject.set(x, "loadingMessage", value.toJsFn)
      
      inline def setLoadingMessageNull: Self = StObject.set(x, "loadingMessage", null)
      
      inline def setLoadingMessageUndefined: Self = StObject.set(x, "loadingMessage", js.undefined)
      
      inline def setLoadingMessageVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "loadingMessage", js.Array(value*))
      
      inline def setLoadingMessageVdomElement(value: VdomElement): Self = StObject.set(x, "loadingMessage", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOverrides(value: TableOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
