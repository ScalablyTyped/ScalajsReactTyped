package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsTable.libEsmCellCellMod.CellRenderer
import typingsJapgolly.blueprintjsTable.libEsmCommonCellTypesMod.FocusedCellCoordinates
import typingsJapgolly.blueprintjsTable.libEsmCommonGridMod.ColumnIndices
import typingsJapgolly.blueprintjsTable.libEsmCommonGridMod.RowIndices
import typingsJapgolly.blueprintjsTable.libEsmCommonRenderModeMod.RenderMode
import typingsJapgolly.blueprintjsTable.libEsmInteractionsDragTypesMod.ICoordinateData
import typingsJapgolly.blueprintjsTable.libEsmInteractionsMenusMenuContextMod.IMenuContext
import typingsJapgolly.blueprintjsTable.libEsmRegionsMod.Region
import typingsJapgolly.blueprintjsTable.libEsmRegionsMod.RegionCardinality
import typingsJapgolly.blueprintjsTable.libEsmRegionsMod.StyledRegionGroup
import typingsJapgolly.blueprintjsTable.libEsmRegionsMod.TableLoadingOption
import typingsJapgolly.blueprintjsTable.libEsmTablePropsMod.ITableProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Table {
  
  @JSImport("@blueprintjs/table", "Table")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsTable.mod.Table] {
    
    inline def bodyContextMenuRenderer(value: /* context */ IMenuContext => Element): this.type = set("bodyContextMenuRenderer", js.Any.fromFunction1(value))
    
    inline def children(
      value: japgolly.scalajs.react.facade.React.Element | js.Array[japgolly.scalajs.react.facade.React.Element]
    ): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenVarargs(value: japgolly.scalajs.react.facade.React.Element*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def columnWidths(value: js.Array[js.UndefOr[Double | Null]]): this.type = set("columnWidths", value.asInstanceOf[js.Any])
    
    inline def columnWidthsVarargs(value: (js.UndefOr[Double | Null])*): this.type = set("columnWidths", js.Array(value*))
    
    inline def defaultColumnWidth(value: Double): this.type = set("defaultColumnWidth", value.asInstanceOf[js.Any])
    
    inline def defaultRowHeight(value: Double): this.type = set("defaultRowHeight", value.asInstanceOf[js.Any])
    
    inline def enableColumnHeader(value: Boolean): this.type = set("enableColumnHeader", value.asInstanceOf[js.Any])
    
    inline def enableColumnInteractionBar(value: Boolean): this.type = set("enableColumnInteractionBar", value.asInstanceOf[js.Any])
    
    inline def enableColumnReordering(value: Boolean): this.type = set("enableColumnReordering", value.asInstanceOf[js.Any])
    
    inline def enableColumnResizing(value: Boolean): this.type = set("enableColumnResizing", value.asInstanceOf[js.Any])
    
    inline def enableFocusedCell(value: Boolean): this.type = set("enableFocusedCell", value.asInstanceOf[js.Any])
    
    inline def enableGhostCells(value: Boolean): this.type = set("enableGhostCells", value.asInstanceOf[js.Any])
    
    inline def enableMultipleSelection(value: Boolean): this.type = set("enableMultipleSelection", value.asInstanceOf[js.Any])
    
    inline def enableRowHeader(value: Boolean): this.type = set("enableRowHeader", value.asInstanceOf[js.Any])
    
    inline def enableRowReordering(value: Boolean): this.type = set("enableRowReordering", value.asInstanceOf[js.Any])
    
    inline def enableRowResizing(value: Boolean): this.type = set("enableRowResizing", value.asInstanceOf[js.Any])
    
    inline def focusedCell(value: FocusedCellCoordinates): this.type = set("focusedCell", value.asInstanceOf[js.Any])
    
    inline def forceRerenderOnSelectionChange(value: Boolean): this.type = set("forceRerenderOnSelectionChange", value.asInstanceOf[js.Any])
    
    inline def getCellClipboardData(value: (/* row */ Double, /* col */ Double, /* celRenderer */ CellRenderer) => Any): this.type = set("getCellClipboardData", js.Any.fromFunction3(value))
    
    inline def loadingOptions(value: js.Array[TableLoadingOption]): this.type = set("loadingOptions", value.asInstanceOf[js.Any])
    
    inline def loadingOptionsVarargs(value: TableLoadingOption*): this.type = set("loadingOptions", js.Array(value*))
    
    inline def maxColumnWidth(value: Double): this.type = set("maxColumnWidth", value.asInstanceOf[js.Any])
    
    inline def maxRowHeight(value: Double): this.type = set("maxRowHeight", value.asInstanceOf[js.Any])
    
    inline def minColumnWidth(value: Double): this.type = set("minColumnWidth", value.asInstanceOf[js.Any])
    
    inline def minRowHeight(value: Double): this.type = set("minRowHeight", value.asInstanceOf[js.Any])
    
    inline def numFrozenColumns(value: Double): this.type = set("numFrozenColumns", value.asInstanceOf[js.Any])
    
    inline def numFrozenRows(value: Double): this.type = set("numFrozenRows", value.asInstanceOf[js.Any])
    
    inline def numRows(value: Double): this.type = set("numRows", value.asInstanceOf[js.Any])
    
    inline def onColumnWidthChanged(value: (/* index */ Double, /* size */ Double) => Callback): this.type = set("onColumnWidthChanged", js.Any.fromFunction2((t0: /* index */ Double, t1: /* size */ Double) => (value(t0, t1)).runNow()))
    
    inline def onColumnsReordered(value: (/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double) => Callback): this.type = set("onColumnsReordered", js.Any.fromFunction3((t0: /* oldIndex */ Double, t1: /* newIndex */ Double, t2: /* length */ Double) => (value(t0, t1, t2)).runNow()))
    
    inline def onCompleteRender(value: Callback): this.type = set("onCompleteRender", value.toJsFn)
    
    inline def onCopy(value: /* success */ Boolean => Callback): this.type = set("onCopy", js.Any.fromFunction1((t0: /* success */ Boolean) => value(t0).runNow()))
    
    inline def onFocusedCell(value: /* focusedCell */ FocusedCellCoordinates => Callback): this.type = set("onFocusedCell", js.Any.fromFunction1((t0: /* focusedCell */ FocusedCellCoordinates) => value(t0).runNow()))
    
    inline def onRowHeightChanged(value: (/* index */ Double, /* size */ Double) => Callback): this.type = set("onRowHeightChanged", js.Any.fromFunction2((t0: /* index */ Double, t1: /* size */ Double) => (value(t0, t1)).runNow()))
    
    inline def onRowsReordered(value: (/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double) => Callback): this.type = set("onRowsReordered", js.Any.fromFunction3((t0: /* oldIndex */ Double, t1: /* newIndex */ Double, t2: /* length */ Double) => (value(t0, t1, t2)).runNow()))
    
    inline def onSelection(value: /* selectedRegions */ js.Array[Region] => Callback): this.type = set("onSelection", js.Any.fromFunction1((t0: /* selectedRegions */ js.Array[Region]) => value(t0).runNow()))
    
    inline def onVisibleCellsChange(value: (/* rowIndices */ RowIndices, /* columnIndices */ ColumnIndices) => Callback): this.type = set("onVisibleCellsChange", js.Any.fromFunction2((t0: /* rowIndices */ RowIndices, t1: /* columnIndices */ ColumnIndices) => (value(t0, t1)).runNow()))
    
    inline def renderMode(value: RenderMode): this.type = set("renderMode", value.asInstanceOf[js.Any])
    
    inline def rowHeaderCellRenderer(value: /* rowIndex */ Double => japgolly.scalajs.react.facade.React.Element): this.type = set("rowHeaderCellRenderer", js.Any.fromFunction1(value))
    
    inline def rowHeights(value: js.Array[js.UndefOr[Double | Null]]): this.type = set("rowHeights", value.asInstanceOf[js.Any])
    
    inline def rowHeightsVarargs(value: (js.UndefOr[Double | Null])*): this.type = set("rowHeights", js.Array(value*))
    
    inline def selectedRegionTransform(
      value: (/* region */ Region, /* event */ MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => Region
    ): this.type = set("selectedRegionTransform", js.Any.fromFunction3(value))
    
    inline def selectedRegions(value: js.Array[Region]): this.type = set("selectedRegions", value.asInstanceOf[js.Any])
    
    inline def selectedRegionsVarargs(value: Region*): this.type = set("selectedRegions", js.Array(value*))
    
    inline def selectionModes(value: js.Array[RegionCardinality]): this.type = set("selectionModes", value.asInstanceOf[js.Any])
    
    inline def selectionModesVarargs(value: RegionCardinality*): this.type = set("selectionModes", js.Array(value*))
    
    inline def styledRegionGroups(value: js.Array[StyledRegionGroup]): this.type = set("styledRegionGroups", value.asInstanceOf[js.Any])
    
    inline def styledRegionGroupsVarargs(value: StyledRegionGroup*): this.type = set("styledRegionGroups", js.Array(value*))
  }
  
  implicit def make(companion: Table.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ITableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
