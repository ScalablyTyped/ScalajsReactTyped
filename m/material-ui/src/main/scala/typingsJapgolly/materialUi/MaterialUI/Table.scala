package typingsJapgolly.materialUi.MaterialUI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.materialUi.materialUiStrings.all
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Table {
  
  type Table = Component[TableProps & js.Object, js.Object]
  
  type TableBody = Component[TableBodyProps & js.Object, js.Object]
  
  trait TableBodyProps extends StObject {
    
    /** @deprecated Instead, use property on Table */
    var allRowsSelected: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var deselectOnClickaway: js.UndefOr[Boolean] = js.undefined
    
    var displayRowCheckbox: js.UndefOr[Boolean] = js.undefined
    
    /** @deprecated Instead, use property on Table */
    var multiSelectable: js.UndefOr[Boolean] = js.undefined
    
    /** @deprecated Instead, use event handler on Table */
    var onCellClick: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]] = js.undefined
    
    /** @deprecated Instead, use event handler on Table */
    var onCellHover: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]] = js.undefined
    
    /** @deprecated Instead, use event handler on Table */
    var onCellHoverExit: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]] = js.undefined
    
    /** @deprecated Instead, use event handler on Table */
    var onRowHover: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.undefined
    
    /** @deprecated Instead, use event handler on Table */
    var onRowHoverExit: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.undefined
    
    /** @deprecated Instead, use event handler on Table */
    var onRowSelection: js.UndefOr[js.Function1[/* selectedRows */ js.Array[Double] | String, Unit]] = js.undefined
    
    var preScanRows: js.UndefOr[Boolean] = js.undefined
    
    /** @deprecated Instead, use property on Table */
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    var showRowHover: js.UndefOr[Boolean] = js.undefined
    
    var stripedRows: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object TableBodyProps {
    
    inline def apply(): TableBodyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableBodyProps]
    }
    
    extension [Self <: TableBodyProps](x: Self) {
      
      inline def setAllRowsSelected(value: Boolean): Self = StObject.set(x, "allRowsSelected", value.asInstanceOf[js.Any])
      
      inline def setAllRowsSelectedUndefined: Self = StObject.set(x, "allRowsSelected", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDeselectOnClickaway(value: Boolean): Self = StObject.set(x, "deselectOnClickaway", value.asInstanceOf[js.Any])
      
      inline def setDeselectOnClickawayUndefined: Self = StObject.set(x, "deselectOnClickaway", js.undefined)
      
      inline def setDisplayRowCheckbox(value: Boolean): Self = StObject.set(x, "displayRowCheckbox", value.asInstanceOf[js.Any])
      
      inline def setDisplayRowCheckboxUndefined: Self = StObject.set(x, "displayRowCheckbox", js.undefined)
      
      inline def setMultiSelectable(value: Boolean): Self = StObject.set(x, "multiSelectable", value.asInstanceOf[js.Any])
      
      inline def setMultiSelectableUndefined: Self = StObject.set(x, "multiSelectable", js.undefined)
      
      inline def setOnCellClick(value: (/* row */ Double, /* column */ Double) => Callback): Self = StObject.set(x, "onCellClick", js.Any.fromFunction2((t0: /* row */ Double, t1: /* column */ Double) => (value(t0, t1)).runNow()))
      
      inline def setOnCellClickUndefined: Self = StObject.set(x, "onCellClick", js.undefined)
      
      inline def setOnCellHover(value: (/* row */ Double, /* column */ Double) => Callback): Self = StObject.set(x, "onCellHover", js.Any.fromFunction2((t0: /* row */ Double, t1: /* column */ Double) => (value(t0, t1)).runNow()))
      
      inline def setOnCellHoverExit(value: (/* row */ Double, /* column */ Double) => Callback): Self = StObject.set(x, "onCellHoverExit", js.Any.fromFunction2((t0: /* row */ Double, t1: /* column */ Double) => (value(t0, t1)).runNow()))
      
      inline def setOnCellHoverExitUndefined: Self = StObject.set(x, "onCellHoverExit", js.undefined)
      
      inline def setOnCellHoverUndefined: Self = StObject.set(x, "onCellHover", js.undefined)
      
      inline def setOnRowHover(value: /* row */ Double => Callback): Self = StObject.set(x, "onRowHover", js.Any.fromFunction1((t0: /* row */ Double) => value(t0).runNow()))
      
      inline def setOnRowHoverExit(value: /* row */ Double => Callback): Self = StObject.set(x, "onRowHoverExit", js.Any.fromFunction1((t0: /* row */ Double) => value(t0).runNow()))
      
      inline def setOnRowHoverExitUndefined: Self = StObject.set(x, "onRowHoverExit", js.undefined)
      
      inline def setOnRowHoverUndefined: Self = StObject.set(x, "onRowHover", js.undefined)
      
      inline def setOnRowSelection(value: /* selectedRows */ js.Array[Double] | String => Callback): Self = StObject.set(x, "onRowSelection", js.Any.fromFunction1((t0: /* selectedRows */ js.Array[Double] | String) => value(t0).runNow()))
      
      inline def setOnRowSelectionUndefined: Self = StObject.set(x, "onRowSelection", js.undefined)
      
      inline def setPreScanRows(value: Boolean): Self = StObject.set(x, "preScanRows", value.asInstanceOf[js.Any])
      
      inline def setPreScanRowsUndefined: Self = StObject.set(x, "preScanRows", js.undefined)
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setShowRowHover(value: Boolean): Self = StObject.set(x, "showRowHover", value.asInstanceOf[js.Any])
      
      inline def setShowRowHoverUndefined: Self = StObject.set(x, "showRowHover", js.undefined)
      
      inline def setStripedRows(value: Boolean): Self = StObject.set(x, "stripedRows", value.asInstanceOf[js.Any])
      
      inline def setStripedRowsUndefined: Self = StObject.set(x, "stripedRows", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type TableFooter = Component[TableFooterProps & js.Object, js.Object]
  
  trait TableFooterProps extends StObject {
    
    // <tfoot/> is element that get the 'other' properties
    var adjustForCheckbox: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object TableFooterProps {
    
    inline def apply(): TableFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableFooterProps]
    }
    
    extension [Self <: TableFooterProps](x: Self) {
      
      inline def setAdjustForCheckbox(value: Boolean): Self = StObject.set(x, "adjustForCheckbox", value.asInstanceOf[js.Any])
      
      inline def setAdjustForCheckboxUndefined: Self = StObject.set(x, "adjustForCheckbox", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type TableHeader = Component[TableHeaderProps & js.Object, js.Object]
  
  type TableHeaderColumn = Component[TableHeaderColumnProps & js.Object, js.Object]
  
  trait TableHeaderColumnProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    // <th/> is element that get the 'other' properties
    var className: js.UndefOr[String] = js.undefined
    
    // useful attributes passed to <th/>
    var colSpan: js.UndefOr[Double] = js.undefined
    
    var columnNumber: js.UndefOr[Double] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[
        js.Function2[
          /* e */ ReactMouseEventFrom[js.Object & org.scalajs.dom.Element], 
          /* column */ Double, 
          Unit
        ]
      ] = js.undefined
    
    var rowSpan: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tooltip: js.UndefOr[String] = js.undefined
    
    var tooltipStyle: js.UndefOr[CSSProperties] = js.undefined
  }
  object TableHeaderColumnProps {
    
    inline def apply(): TableHeaderColumnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableHeaderColumnProps]
    }
    
    extension [Self <: TableHeaderColumnProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
      
      inline def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
      
      inline def setColumnNumberUndefined: Self = StObject.set(x, "columnNumber", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOnClick(
        value: (/* e */ ReactMouseEventFrom[js.Object & org.scalajs.dom.Element], /* column */ Double) => Callback
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[js.Object & org.scalajs.dom.Element], t1: /* column */ Double) => (value(t0, t1)).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      
      inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipStyle(value: CSSProperties): Self = StObject.set(x, "tooltipStyle", value.asInstanceOf[js.Any])
      
      inline def setTooltipStyleUndefined: Self = StObject.set(x, "tooltipStyle", js.undefined)
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  trait TableHeaderProps extends StObject {
    
    var adjustForCheckbox: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var displaySelectAll: js.UndefOr[Boolean] = js.undefined
    
    var enableSelectAll: js.UndefOr[Boolean] = js.undefined
    
    /** @deprecated Instead, use event handler on Table */
    var onSelectAll: js.UndefOr[js.Function1[/* checked */ Boolean, Unit]] = js.undefined
    
    /** @deprecated Instead, use event handler on Table */
    var selectAllSelected: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object TableHeaderProps {
    
    inline def apply(): TableHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableHeaderProps]
    }
    
    extension [Self <: TableHeaderProps](x: Self) {
      
      inline def setAdjustForCheckbox(value: Boolean): Self = StObject.set(x, "adjustForCheckbox", value.asInstanceOf[js.Any])
      
      inline def setAdjustForCheckboxUndefined: Self = StObject.set(x, "adjustForCheckbox", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisplaySelectAll(value: Boolean): Self = StObject.set(x, "displaySelectAll", value.asInstanceOf[js.Any])
      
      inline def setDisplaySelectAllUndefined: Self = StObject.set(x, "displaySelectAll", js.undefined)
      
      inline def setEnableSelectAll(value: Boolean): Self = StObject.set(x, "enableSelectAll", value.asInstanceOf[js.Any])
      
      inline def setEnableSelectAllUndefined: Self = StObject.set(x, "enableSelectAll", js.undefined)
      
      inline def setOnSelectAll(value: /* checked */ Boolean => Callback): Self = StObject.set(x, "onSelectAll", js.Any.fromFunction1((t0: /* checked */ Boolean) => value(t0).runNow()))
      
      inline def setOnSelectAllUndefined: Self = StObject.set(x, "onSelectAll", js.undefined)
      
      inline def setSelectAllSelected(value: Boolean): Self = StObject.set(x, "selectAllSelected", value.asInstanceOf[js.Any])
      
      inline def setSelectAllSelectedUndefined: Self = StObject.set(x, "selectAllSelected", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait TableProps extends StObject {
    
    var allRowsSelected: js.UndefOr[Boolean] = js.undefined
    
    var bodyStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var fixedFooter: js.UndefOr[Boolean] = js.undefined
    
    var fixedHeader: js.UndefOr[Boolean] = js.undefined
    
    var footerStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var headerStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var height: js.UndefOr[String] = js.undefined
    
    var multiSelectable: js.UndefOr[Boolean] = js.undefined
    
    var onCellClick: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]] = js.undefined
    
    var onCellHover: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]] = js.undefined
    
    var onCellHoverExit: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]] = js.undefined
    
    var onRowHover: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.undefined
    
    var onRowHoverExit: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.undefined
    
    var onRowSelection: js.UndefOr[js.Function1[/* selectedRows */ js.Array[Double] | all, Unit]] = js.undefined
    
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var wrapperStyle: js.UndefOr[CSSProperties] = js.undefined
  }
  object TableProps {
    
    inline def apply(): TableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableProps]
    }
    
    extension [Self <: TableProps](x: Self) {
      
      inline def setAllRowsSelected(value: Boolean): Self = StObject.set(x, "allRowsSelected", value.asInstanceOf[js.Any])
      
      inline def setAllRowsSelectedUndefined: Self = StObject.set(x, "allRowsSelected", js.undefined)
      
      inline def setBodyStyle(value: CSSProperties): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
      
      inline def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFixedFooter(value: Boolean): Self = StObject.set(x, "fixedFooter", value.asInstanceOf[js.Any])
      
      inline def setFixedFooterUndefined: Self = StObject.set(x, "fixedFooter", js.undefined)
      
      inline def setFixedHeader(value: Boolean): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
      
      inline def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
      
      inline def setFooterStyle(value: CSSProperties): Self = StObject.set(x, "footerStyle", value.asInstanceOf[js.Any])
      
      inline def setFooterStyleUndefined: Self = StObject.set(x, "footerStyle", js.undefined)
      
      inline def setHeaderStyle(value: CSSProperties): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
      
      inline def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMultiSelectable(value: Boolean): Self = StObject.set(x, "multiSelectable", value.asInstanceOf[js.Any])
      
      inline def setMultiSelectableUndefined: Self = StObject.set(x, "multiSelectable", js.undefined)
      
      inline def setOnCellClick(value: (/* row */ Double, /* column */ Double) => Callback): Self = StObject.set(x, "onCellClick", js.Any.fromFunction2((t0: /* row */ Double, t1: /* column */ Double) => (value(t0, t1)).runNow()))
      
      inline def setOnCellClickUndefined: Self = StObject.set(x, "onCellClick", js.undefined)
      
      inline def setOnCellHover(value: (/* row */ Double, /* column */ Double) => Callback): Self = StObject.set(x, "onCellHover", js.Any.fromFunction2((t0: /* row */ Double, t1: /* column */ Double) => (value(t0, t1)).runNow()))
      
      inline def setOnCellHoverExit(value: (/* row */ Double, /* column */ Double) => Callback): Self = StObject.set(x, "onCellHoverExit", js.Any.fromFunction2((t0: /* row */ Double, t1: /* column */ Double) => (value(t0, t1)).runNow()))
      
      inline def setOnCellHoverExitUndefined: Self = StObject.set(x, "onCellHoverExit", js.undefined)
      
      inline def setOnCellHoverUndefined: Self = StObject.set(x, "onCellHover", js.undefined)
      
      inline def setOnRowHover(value: /* row */ Double => Callback): Self = StObject.set(x, "onRowHover", js.Any.fromFunction1((t0: /* row */ Double) => value(t0).runNow()))
      
      inline def setOnRowHoverExit(value: /* row */ Double => Callback): Self = StObject.set(x, "onRowHoverExit", js.Any.fromFunction1((t0: /* row */ Double) => value(t0).runNow()))
      
      inline def setOnRowHoverExitUndefined: Self = StObject.set(x, "onRowHoverExit", js.undefined)
      
      inline def setOnRowHoverUndefined: Self = StObject.set(x, "onRowHover", js.undefined)
      
      inline def setOnRowSelection(value: /* selectedRows */ js.Array[Double] | all => Callback): Self = StObject.set(x, "onRowSelection", js.Any.fromFunction1((t0: /* selectedRows */ js.Array[Double] | all) => value(t0).runNow()))
      
      inline def setOnRowSelectionUndefined: Self = StObject.set(x, "onRowSelection", js.undefined)
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setWrapperStyle(value: CSSProperties): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
      
      inline def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
    }
  }
  
  type TableRow = Component[TableRowProps & js.Object, js.Object]
  
  type TableRowColumn = Component[TableRowColumnProps & js.Object, js.Object]
  
  trait TableRowColumnProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    // <td/> is element that get the 'other' properties
    var className: js.UndefOr[String] = js.undefined
    
    // useful attributes passed to <td/>
    var colSpan: js.UndefOr[Double] = js.undefined
    
    var columnNumber: js.UndefOr[Double] = js.undefined
    
    var hoverable: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    /** @deprecated Instead, use event handler on Table */
    var onClick: js.UndefOr[
        js.Function2[
          /* e */ ReactMouseEventFrom[js.Object & org.scalajs.dom.Element], 
          /* column */ Double, 
          Unit
        ]
      ] = js.undefined
    
    /** @deprecated Instead, use event handler on Table */
    var onHover: js.UndefOr[
        js.Function2[
          /* e */ ReactMouseEventFrom[js.Object & org.scalajs.dom.Element], 
          /* column */ Double, 
          Unit
        ]
      ] = js.undefined
    
    /** @deprecated Instead, use event handler on Table */
    var onHoverExit: js.UndefOr[
        js.Function2[
          /* e */ ReactMouseEventFrom[js.Object & org.scalajs.dom.Element], 
          /* column */ Double, 
          Unit
        ]
      ] = js.undefined
    
    var rowSpan: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object TableRowColumnProps {
    
    inline def apply(): TableRowColumnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableRowColumnProps]
    }
    
    extension [Self <: TableRowColumnProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
      
      inline def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
      
      inline def setColumnNumberUndefined: Self = StObject.set(x, "columnNumber", js.undefined)
      
      inline def setHoverable(value: Boolean): Self = StObject.set(x, "hoverable", value.asInstanceOf[js.Any])
      
      inline def setHoverableUndefined: Self = StObject.set(x, "hoverable", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOnClick(
        value: (/* e */ ReactMouseEventFrom[js.Object & org.scalajs.dom.Element], /* column */ Double) => Callback
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[js.Object & org.scalajs.dom.Element], t1: /* column */ Double) => (value(t0, t1)).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnHover(
        value: (/* e */ ReactMouseEventFrom[js.Object & org.scalajs.dom.Element], /* column */ Double) => Callback
      ): Self = StObject.set(x, "onHover", js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[js.Object & org.scalajs.dom.Element], t1: /* column */ Double) => (value(t0, t1)).runNow()))
      
      inline def setOnHoverExit(
        value: (/* e */ ReactMouseEventFrom[js.Object & org.scalajs.dom.Element], /* column */ Double) => Callback
      ): Self = StObject.set(x, "onHoverExit", js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[js.Object & org.scalajs.dom.Element], t1: /* column */ Double) => (value(t0, t1)).runNow()))
      
      inline def setOnHoverExitUndefined: Self = StObject.set(x, "onHoverExit", js.undefined)
      
      inline def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
      
      inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      
      inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait TableRowProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    // <tr/> is element that get the 'other' properties
    var className: js.UndefOr[String] = js.undefined
    
    var displayBorder: js.UndefOr[Boolean] = js.undefined
    
    var hoverable: js.UndefOr[Boolean] = js.undefined
    
    var hovered: js.UndefOr[Boolean] = js.undefined
    
    /** @deprecated Instead, use event handler on Table */
    var onCellClick: js.UndefOr[
        js.Function3[
          /* e */ ReactMouseEventFrom[js.Object & org.scalajs.dom.Element], 
          /* row */ Double, 
          /* column */ Double, 
          Unit
        ]
      ] = js.undefined
    
    /** @deprecated Instead, use event handler on Table */
    var onCellHover: js.UndefOr[
        js.Function3[
          /* e */ ReactMouseEventFrom[js.Object & org.scalajs.dom.Element], 
          /* row */ Double, 
          /* column */ Double, 
          Unit
        ]
      ] = js.undefined
    
    /** @deprecated Instead, use event handler on Table */
    var onCellHoverExit: js.UndefOr[
        js.Function3[
          /* e */ ReactMouseEventFrom[js.Object & org.scalajs.dom.Element], 
          /* row */ Double, 
          /* column */ Double, 
          Unit
        ]
      ] = js.undefined
    
    /** @deprecated Instead, use event handler on Table */
    var onRowClick: js.UndefOr[
        js.Function2[
          /* e */ ReactMouseEventFrom[js.Object & org.scalajs.dom.Element], 
          /* row */ Double, 
          Unit
        ]
      ] = js.undefined
    
    /** @deprecated Instead, use event handler on Table */
    var onRowHover: js.UndefOr[
        js.Function2[
          /* e */ ReactMouseEventFrom[js.Object & org.scalajs.dom.Element], 
          /* row */ Double, 
          Unit
        ]
      ] = js.undefined
    
    /** @deprecated Instead, use event handler on Table */
    var onRowHoverExit: js.UndefOr[
        js.Function2[
          /* e */ ReactMouseEventFrom[js.Object & org.scalajs.dom.Element], 
          /* row */ Double, 
          Unit
        ]
      ] = js.undefined
    
    var rowNumber: js.UndefOr[Double] = js.undefined
    
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var striped: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object TableRowProps {
    
    inline def apply(): TableRowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableRowProps]
    }
    
    extension [Self <: TableRowProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisplayBorder(value: Boolean): Self = StObject.set(x, "displayBorder", value.asInstanceOf[js.Any])
      
      inline def setDisplayBorderUndefined: Self = StObject.set(x, "displayBorder", js.undefined)
      
      inline def setHoverable(value: Boolean): Self = StObject.set(x, "hoverable", value.asInstanceOf[js.Any])
      
      inline def setHoverableUndefined: Self = StObject.set(x, "hoverable", js.undefined)
      
      inline def setHovered(value: Boolean): Self = StObject.set(x, "hovered", value.asInstanceOf[js.Any])
      
      inline def setHoveredUndefined: Self = StObject.set(x, "hovered", js.undefined)
      
      inline def setOnCellClick(
        value: (/* e */ ReactMouseEventFrom[js.Object & org.scalajs.dom.Element], /* row */ Double, /* column */ Double) => Callback
      ): Self = StObject.set(x, "onCellClick", js.Any.fromFunction3((t0: /* e */ ReactMouseEventFrom[js.Object & org.scalajs.dom.Element], t1: /* row */ Double, t2: /* column */ Double) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnCellClickUndefined: Self = StObject.set(x, "onCellClick", js.undefined)
      
      inline def setOnCellHover(
        value: (/* e */ ReactMouseEventFrom[js.Object & org.scalajs.dom.Element], /* row */ Double, /* column */ Double) => Callback
      ): Self = StObject.set(x, "onCellHover", js.Any.fromFunction3((t0: /* e */ ReactMouseEventFrom[js.Object & org.scalajs.dom.Element], t1: /* row */ Double, t2: /* column */ Double) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnCellHoverExit(
        value: (/* e */ ReactMouseEventFrom[js.Object & org.scalajs.dom.Element], /* row */ Double, /* column */ Double) => Callback
      ): Self = StObject.set(x, "onCellHoverExit", js.Any.fromFunction3((t0: /* e */ ReactMouseEventFrom[js.Object & org.scalajs.dom.Element], t1: /* row */ Double, t2: /* column */ Double) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnCellHoverExitUndefined: Self = StObject.set(x, "onCellHoverExit", js.undefined)
      
      inline def setOnCellHoverUndefined: Self = StObject.set(x, "onCellHover", js.undefined)
      
      inline def setOnRowClick(
        value: (/* e */ ReactMouseEventFrom[js.Object & org.scalajs.dom.Element], /* row */ Double) => Callback
      ): Self = StObject.set(x, "onRowClick", js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[js.Object & org.scalajs.dom.Element], t1: /* row */ Double) => (value(t0, t1)).runNow()))
      
      inline def setOnRowClickUndefined: Self = StObject.set(x, "onRowClick", js.undefined)
      
      inline def setOnRowHover(
        value: (/* e */ ReactMouseEventFrom[js.Object & org.scalajs.dom.Element], /* row */ Double) => Callback
      ): Self = StObject.set(x, "onRowHover", js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[js.Object & org.scalajs.dom.Element], t1: /* row */ Double) => (value(t0, t1)).runNow()))
      
      inline def setOnRowHoverExit(
        value: (/* e */ ReactMouseEventFrom[js.Object & org.scalajs.dom.Element], /* row */ Double) => Callback
      ): Self = StObject.set(x, "onRowHoverExit", js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[js.Object & org.scalajs.dom.Element], t1: /* row */ Double) => (value(t0, t1)).runNow()))
      
      inline def setOnRowHoverExitUndefined: Self = StObject.set(x, "onRowHoverExit", js.undefined)
      
      inline def setOnRowHoverUndefined: Self = StObject.set(x, "onRowHover", js.undefined)
      
      inline def setRowNumber(value: Double): Self = StObject.set(x, "rowNumber", value.asInstanceOf[js.Any])
      
      inline def setRowNumberUndefined: Self = StObject.set(x, "rowNumber", js.undefined)
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setStriped(value: Boolean): Self = StObject.set(x, "striped", value.asInstanceOf[js.Any])
      
      inline def setStripedUndefined: Self = StObject.set(x, "striped", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
