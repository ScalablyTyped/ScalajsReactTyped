package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.wixStyleReact.distTypesTableDataTableMod.DataTableColumn
import typingsJapgolly.wixStyleReact.distTypesTableDataTableMod.DataTableProps
import typingsJapgolly.wixStyleReact.distTypesTableDataTableMod.DataTableRowDataHookFn
import typingsJapgolly.wixStyleReact.distTypesTableDataTableMod.DataTableRowVerticalPadding
import typingsJapgolly.wixStyleReact.distTypesTableDataTableMod.DataTableSkin
import typingsJapgolly.wixStyleReact.distTypesTableDataTableMod.RowDataDefaultType
import typingsJapgolly.wixStyleReact.distTypesTableDataTableMod.TableDragAndDrop
import typingsJapgolly.wixStyleReact.distTypesTableDataTableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataTable {
  
  inline def apply[RowData](columns: js.Array[DataTableColumn[RowData]]): Builder[RowData] = {
    val __props = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    new Builder[RowData](js.Array(this.component, __props.asInstanceOf[DataTableProps[RowData]]))
  }
  
  @JSImport("wix-style-react/dist/types/Table/DataTable", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[RowData] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default[RowData]] {
    
    inline def allowMultiDetailsExpansion(value: Boolean): this.type = set("allowMultiDetailsExpansion", value.asInstanceOf[js.Any])
    
    inline def data(value: js.Array[RowData]): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def dataVarargs(value: RowData*): this.type = set("data", js.Array(value*))
    
    inline def dragAndDrop(value: TableDragAndDrop[Element]): this.type = set("dragAndDrop", value.asInstanceOf[js.Any])
    
    inline def dynamicRowClass(value: (RowData, /* rowNum */ Double) => String): this.type = set("dynamicRowClass", js.Any.fromFunction2(value))
    
    inline def hasMore(value: Boolean): this.type = set("hasMore", value.asInstanceOf[js.Any])
    
    inline def hideHeader(value: Boolean): this.type = set("hideHeader", value.asInstanceOf[js.Any])
    
    inline def hideHeaderAccessible(value: Boolean): this.type = set("hideHeaderAccessible", value.asInstanceOf[js.Any])
    
    inline def horizontalScroll(value: Boolean): this.type = set("horizontalScroll", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def infiniteScroll(value: Boolean): this.type = set("infiniteScroll", value.asInstanceOf[js.Any])
    
    inline def infiniteScrollRef(value: Ref[Any]): this.type = set("infiniteScrollRef", value.asInstanceOf[js.Any])
    
    inline def infiniteScrollRefFunction1(value: Any | Null => Callback): this.type = set("infiniteScrollRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def infiniteScrollRefNull: this.type = set("infiniteScrollRef", null)
    
    inline def initialLoad(value: Boolean): this.type = set("initialLoad", value.asInstanceOf[js.Any])
    
    inline def isRowDisabled(value: RowData => Boolean): this.type = set("isRowDisabled", js.Any.fromFunction1(value))
    
    inline def isRowHighlight(value: (RowData, /* rowNum */ Double) => Boolean): this.type = set("isRowHighlight", js.Any.fromFunction2(value))
    
    inline def isRowSelected(value: (RowData, /* rowNum */ Double) => Boolean): this.type = set("isRowSelected", js.Any.fromFunction2(value))
    
    inline def itemsPerPage(value: Double): this.type = set("itemsPerPage", value.asInstanceOf[js.Any])
    
    inline def loadMore(value: Callback): this.type = set("loadMore", value.toJsFn)
    
    inline def loader(value: VdomNode): this.type = set("loader", value.rawNode.asInstanceOf[js.Any])
    
    inline def loaderNull: this.type = set("loader", null)
    
    inline def loaderVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("loader", js.Array(value*))
    
    inline def loaderVdomElement(value: VdomElement): this.type = set("loader", value.rawElement.asInstanceOf[js.Any])
    
    inline def onMouseEnterRow(value: (RowData, /* rowNum */ Double) => Callback): this.type = set("onMouseEnterRow", js.Any.fromFunction2((t0: RowData, t1: /* rowNum */ Double) => (value(t0, t1)).runNow()))
    
    inline def onMouseLeaveRow(value: (RowData, /* rowNum */ Double) => Callback): this.type = set("onMouseLeaveRow", js.Any.fromFunction2((t0: RowData, t1: /* rowNum */ Double) => (value(t0, t1)).runNow()))
    
    inline def onRowClick(value: (RowData, /* rowNum */ Double) => Callback): this.type = set("onRowClick", js.Any.fromFunction2((t0: RowData, t1: /* rowNum */ Double) => (value(t0, t1)).runNow()))
    
    inline def onSortClick(value: (/* column */ DataTableColumn[RowDataDefaultType], /* colNum */ Double) => Callback): this.type = set("onSortClick", js.Any.fromFunction2((t0: /* column */ DataTableColumn[RowDataDefaultType], t1: /* colNum */ Double) => (value(t0, t1)).runNow()))
    
    inline def removeRowDetailsPadding(value: Boolean): this.type = set("removeRowDetailsPadding", value.asInstanceOf[js.Any])
    
    inline def rowClass(value: String): this.type = set("rowClass", value.asInstanceOf[js.Any])
    
    inline def rowDataHook(value: String | DataTableRowDataHookFn[RowData]): this.type = set("rowDataHook", value.asInstanceOf[js.Any])
    
    inline def rowDataHookFunction2(value: (RowData, /* rowNum */ Double) => String): this.type = set("rowDataHook", js.Any.fromFunction2(value))
    
    inline def rowDetails(value: (RowData, /* rowNum */ Double) => Node): this.type = set("rowDetails", js.Any.fromFunction2(value))
    
    inline def rowVerticalPadding(value: DataTableRowVerticalPadding): this.type = set("rowVerticalPadding", value.asInstanceOf[js.Any])
    
    inline def scrollElement(value: HTMLElement | RefHandle[Any]): this.type = set("scrollElement", value.asInstanceOf[js.Any])
    
    inline def selectedRowsIds(value: js.Array[String | Double]): this.type = set("selectedRowsIds", value.asInstanceOf[js.Any])
    
    inline def selectedRowsIdsVarargs(value: (String | Double)*): this.type = set("selectedRowsIds", js.Array(value*))
    
    inline def showHeaderWhenEmpty(value: Boolean): this.type = set("showHeaderWhenEmpty", value.asInstanceOf[js.Any])
    
    inline def showLastRowDivider(value: Boolean): this.type = set("showLastRowDivider", value.asInstanceOf[js.Any])
    
    inline def skin(value: DataTableSkin): this.type = set("skin", value.asInstanceOf[js.Any])
    
    inline def stickyColumns(value: Double): this.type = set("stickyColumns", value.asInstanceOf[js.Any])
    
    inline def useWindow(value: Boolean): this.type = set("useWindow", value.asInstanceOf[js.Any])
    
    inline def virtualized(value: Boolean): this.type = set("virtualized", value.asInstanceOf[js.Any])
    
    inline def virtualizedLineHeight(value: Double): this.type = set("virtualizedLineHeight", value.asInstanceOf[js.Any])
    
    inline def virtualizedListRef(value: LegacyRef[Any]): this.type = set("virtualizedListRef", value.asInstanceOf[js.Any])
    
    inline def virtualizedListRefFunction1(value: Any | Null => Callback): this.type = set("virtualizedListRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def virtualizedListRefNull: this.type = set("virtualizedListRef", null)
    
    inline def virtualizedTableHeight(value: Double): this.type = set("virtualizedTableHeight", value.asInstanceOf[js.Any])
    
    inline def width(value: String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps[RowData](p: DataTableProps[RowData]): Builder[RowData] = new Builder[RowData](js.Array(this.component, p.asInstanceOf[js.Any]))
}
