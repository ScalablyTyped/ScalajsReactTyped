package typingsJapgolly.muiDatatables.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.muiDatatables.mod.MUIDataTableBody
import typingsJapgolly.muiDatatables.mod.MUIDataTableCheckboxProps
import typingsJapgolly.muiDatatables.mod.MUIDataTableExpandButton
import typingsJapgolly.muiDatatables.mod.MUIDataTableFilterList
import typingsJapgolly.muiDatatables.mod.MUIDataTableFooter
import typingsJapgolly.muiDatatables.mod.MUIDataTableHead
import typingsJapgolly.muiDatatables.mod.MUIDataTableResize
import typingsJapgolly.muiDatatables.mod.MUIDataTableToolbar
import typingsJapgolly.muiDatatables.mod.MUIDataTableToolbarSelect
import typingsJapgolly.muiDatatables.mod.MUIDataTableViewCol
import typingsJapgolly.muiDatatables.mod.RenderCustomComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  Checkbox :mui-datatables.mui-datatables.RenderCustomComponent<mui-datatables.mui-datatables.MUIDataTableCheckboxProps> | react.react.ReactNode,   ExpandButton :mui-datatables.mui-datatables.RenderCustomComponent<mui-datatables.mui-datatables.MUIDataTableExpandButton> | react.react.ReactNode,   TableBody :mui-datatables.mui-datatables.RenderCustomComponent<mui-datatables.mui-datatables.MUIDataTableBody> | react.react.ReactNode,   TableViewCol :mui-datatables.mui-datatables.RenderCustomComponent<mui-datatables.mui-datatables.MUIDataTableViewCol> | react.react.ReactNode,   TableFilterList :mui-datatables.mui-datatables.RenderCustomComponent<mui-datatables.mui-datatables.MUIDataTableFilterList> | react.react.ReactNode,   TableFooter :mui-datatables.mui-datatables.RenderCustomComponent<mui-datatables.mui-datatables.MUIDataTableFooter> | react.react.ReactNode,   TableHead :mui-datatables.mui-datatables.RenderCustomComponent<mui-datatables.mui-datatables.MUIDataTableHead> | react.react.ReactNode,   TableResize :mui-datatables.mui-datatables.RenderCustomComponent<mui-datatables.mui-datatables.MUIDataTableResize> | react.react.ReactNode,   TableToolbar :mui-datatables.mui-datatables.RenderCustomComponent<mui-datatables.mui-datatables.MUIDataTableToolbar> | react.react.ReactNode,   TableToolbarSelect :mui-datatables.mui-datatables.RenderCustomComponent<mui-datatables.mui-datatables.MUIDataTableToolbarSelect> | react.react.ReactNode,   Tooltip :react.react.ReactNode,   icons :std.Partial<{  SearchIcon :react.react.ReactNode,   DownloadIcon :react.react.ReactNode,   PrintIcon :react.react.ReactNode,   ViewColumnIcon :react.react.ReactNode,   FilterIcon :react.react.ReactNode}>}> */
trait PartialCheckboxRenderCust extends StObject {
  
  var Checkbox: js.UndefOr[RenderCustomComponent[MUIDataTableCheckboxProps] | Node] = js.undefined
  
  var ExpandButton: js.UndefOr[RenderCustomComponent[MUIDataTableExpandButton] | Node] = js.undefined
  
  var TableBody: js.UndefOr[RenderCustomComponent[MUIDataTableBody] | Node] = js.undefined
  
  var TableFilterList: js.UndefOr[RenderCustomComponent[MUIDataTableFilterList] | Node] = js.undefined
  
  var TableFooter: js.UndefOr[RenderCustomComponent[MUIDataTableFooter] | Node] = js.undefined
  
  var TableHead: js.UndefOr[RenderCustomComponent[MUIDataTableHead] | Node] = js.undefined
  
  var TableResize: js.UndefOr[RenderCustomComponent[MUIDataTableResize] | Node] = js.undefined
  
  var TableToolbar: js.UndefOr[RenderCustomComponent[MUIDataTableToolbar] | Node] = js.undefined
  
  var TableToolbarSelect: js.UndefOr[RenderCustomComponent[MUIDataTableToolbarSelect] | Node] = js.undefined
  
  var TableViewCol: js.UndefOr[RenderCustomComponent[MUIDataTableViewCol] | Node] = js.undefined
  
  var Tooltip: js.UndefOr[Node] = js.undefined
  
  var icons: js.UndefOr[PartialSearchIconReactNod] = js.undefined
}
object PartialCheckboxRenderCust {
  
  inline def apply(): PartialCheckboxRenderCust = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCheckboxRenderCust]
  }
  
  extension [Self <: PartialCheckboxRenderCust](x: Self) {
    
    inline def setCheckbox(value: RenderCustomComponent[MUIDataTableCheckboxProps] | Node): Self = StObject.set(x, "Checkbox", value.asInstanceOf[js.Any])
    
    inline def setCheckboxFunction1(value: MUIDataTableCheckboxProps => Node): Self = StObject.set(x, "Checkbox", js.Any.fromFunction1(value))
    
    inline def setCheckboxNull: Self = StObject.set(x, "Checkbox", null)
    
    inline def setCheckboxUndefined: Self = StObject.set(x, "Checkbox", js.undefined)
    
    inline def setCheckboxVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "Checkbox", js.Array(value*))
    
    inline def setCheckboxVdomElement(value: VdomElement): Self = StObject.set(x, "Checkbox", value.rawElement.asInstanceOf[js.Any])
    
    inline def setExpandButton(value: RenderCustomComponent[MUIDataTableExpandButton] | Node): Self = StObject.set(x, "ExpandButton", value.asInstanceOf[js.Any])
    
    inline def setExpandButtonFunction1(value: MUIDataTableExpandButton => Node): Self = StObject.set(x, "ExpandButton", js.Any.fromFunction1(value))
    
    inline def setExpandButtonNull: Self = StObject.set(x, "ExpandButton", null)
    
    inline def setExpandButtonUndefined: Self = StObject.set(x, "ExpandButton", js.undefined)
    
    inline def setExpandButtonVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "ExpandButton", js.Array(value*))
    
    inline def setExpandButtonVdomElement(value: VdomElement): Self = StObject.set(x, "ExpandButton", value.rawElement.asInstanceOf[js.Any])
    
    inline def setIcons(value: PartialSearchIconReactNod): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    inline def setTableBody(value: RenderCustomComponent[MUIDataTableBody] | Node): Self = StObject.set(x, "TableBody", value.asInstanceOf[js.Any])
    
    inline def setTableBodyFunction1(value: MUIDataTableBody => Node): Self = StObject.set(x, "TableBody", js.Any.fromFunction1(value))
    
    inline def setTableBodyNull: Self = StObject.set(x, "TableBody", null)
    
    inline def setTableBodyUndefined: Self = StObject.set(x, "TableBody", js.undefined)
    
    inline def setTableBodyVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "TableBody", js.Array(value*))
    
    inline def setTableBodyVdomElement(value: VdomElement): Self = StObject.set(x, "TableBody", value.rawElement.asInstanceOf[js.Any])
    
    inline def setTableFilterList(value: RenderCustomComponent[MUIDataTableFilterList] | Node): Self = StObject.set(x, "TableFilterList", value.asInstanceOf[js.Any])
    
    inline def setTableFilterListFunction1(value: MUIDataTableFilterList => Node): Self = StObject.set(x, "TableFilterList", js.Any.fromFunction1(value))
    
    inline def setTableFilterListNull: Self = StObject.set(x, "TableFilterList", null)
    
    inline def setTableFilterListUndefined: Self = StObject.set(x, "TableFilterList", js.undefined)
    
    inline def setTableFilterListVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "TableFilterList", js.Array(value*))
    
    inline def setTableFilterListVdomElement(value: VdomElement): Self = StObject.set(x, "TableFilterList", value.rawElement.asInstanceOf[js.Any])
    
    inline def setTableFooter(value: RenderCustomComponent[MUIDataTableFooter] | Node): Self = StObject.set(x, "TableFooter", value.asInstanceOf[js.Any])
    
    inline def setTableFooterFunction1(value: MUIDataTableFooter => Node): Self = StObject.set(x, "TableFooter", js.Any.fromFunction1(value))
    
    inline def setTableFooterNull: Self = StObject.set(x, "TableFooter", null)
    
    inline def setTableFooterUndefined: Self = StObject.set(x, "TableFooter", js.undefined)
    
    inline def setTableFooterVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "TableFooter", js.Array(value*))
    
    inline def setTableFooterVdomElement(value: VdomElement): Self = StObject.set(x, "TableFooter", value.rawElement.asInstanceOf[js.Any])
    
    inline def setTableHead(value: RenderCustomComponent[MUIDataTableHead] | Node): Self = StObject.set(x, "TableHead", value.asInstanceOf[js.Any])
    
    inline def setTableHeadFunction1(value: MUIDataTableHead => Node): Self = StObject.set(x, "TableHead", js.Any.fromFunction1(value))
    
    inline def setTableHeadNull: Self = StObject.set(x, "TableHead", null)
    
    inline def setTableHeadUndefined: Self = StObject.set(x, "TableHead", js.undefined)
    
    inline def setTableHeadVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "TableHead", js.Array(value*))
    
    inline def setTableHeadVdomElement(value: VdomElement): Self = StObject.set(x, "TableHead", value.rawElement.asInstanceOf[js.Any])
    
    inline def setTableResize(value: RenderCustomComponent[MUIDataTableResize] | Node): Self = StObject.set(x, "TableResize", value.asInstanceOf[js.Any])
    
    inline def setTableResizeFunction1(value: MUIDataTableResize => Node): Self = StObject.set(x, "TableResize", js.Any.fromFunction1(value))
    
    inline def setTableResizeNull: Self = StObject.set(x, "TableResize", null)
    
    inline def setTableResizeUndefined: Self = StObject.set(x, "TableResize", js.undefined)
    
    inline def setTableResizeVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "TableResize", js.Array(value*))
    
    inline def setTableResizeVdomElement(value: VdomElement): Self = StObject.set(x, "TableResize", value.rawElement.asInstanceOf[js.Any])
    
    inline def setTableToolbar(value: RenderCustomComponent[MUIDataTableToolbar] | Node): Self = StObject.set(x, "TableToolbar", value.asInstanceOf[js.Any])
    
    inline def setTableToolbarFunction1(value: MUIDataTableToolbar => Node): Self = StObject.set(x, "TableToolbar", js.Any.fromFunction1(value))
    
    inline def setTableToolbarNull: Self = StObject.set(x, "TableToolbar", null)
    
    inline def setTableToolbarSelect(value: RenderCustomComponent[MUIDataTableToolbarSelect] | Node): Self = StObject.set(x, "TableToolbarSelect", value.asInstanceOf[js.Any])
    
    inline def setTableToolbarSelectFunction1(value: MUIDataTableToolbarSelect => Node): Self = StObject.set(x, "TableToolbarSelect", js.Any.fromFunction1(value))
    
    inline def setTableToolbarSelectNull: Self = StObject.set(x, "TableToolbarSelect", null)
    
    inline def setTableToolbarSelectUndefined: Self = StObject.set(x, "TableToolbarSelect", js.undefined)
    
    inline def setTableToolbarSelectVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "TableToolbarSelect", js.Array(value*))
    
    inline def setTableToolbarSelectVdomElement(value: VdomElement): Self = StObject.set(x, "TableToolbarSelect", value.rawElement.asInstanceOf[js.Any])
    
    inline def setTableToolbarUndefined: Self = StObject.set(x, "TableToolbar", js.undefined)
    
    inline def setTableToolbarVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "TableToolbar", js.Array(value*))
    
    inline def setTableToolbarVdomElement(value: VdomElement): Self = StObject.set(x, "TableToolbar", value.rawElement.asInstanceOf[js.Any])
    
    inline def setTableViewCol(value: RenderCustomComponent[MUIDataTableViewCol] | Node): Self = StObject.set(x, "TableViewCol", value.asInstanceOf[js.Any])
    
    inline def setTableViewColFunction1(value: MUIDataTableViewCol => Node): Self = StObject.set(x, "TableViewCol", js.Any.fromFunction1(value))
    
    inline def setTableViewColNull: Self = StObject.set(x, "TableViewCol", null)
    
    inline def setTableViewColUndefined: Self = StObject.set(x, "TableViewCol", js.undefined)
    
    inline def setTableViewColVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "TableViewCol", js.Array(value*))
    
    inline def setTableViewColVdomElement(value: VdomElement): Self = StObject.set(x, "TableViewCol", value.rawElement.asInstanceOf[js.Any])
    
    inline def setTooltip(value: VdomNode): Self = StObject.set(x, "Tooltip", value.rawNode.asInstanceOf[js.Any])
    
    inline def setTooltipNull: Self = StObject.set(x, "Tooltip", null)
    
    inline def setTooltipUndefined: Self = StObject.set(x, "Tooltip", js.undefined)
    
    inline def setTooltipVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "Tooltip", js.Array(value*))
    
    inline def setTooltipVdomElement(value: VdomElement): Self = StObject.set(x, "Tooltip", value.rawElement.asInstanceOf[js.Any])
  }
}
