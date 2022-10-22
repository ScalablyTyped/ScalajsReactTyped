package typingsJapgolly.datatablesNetFixedcolumns

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Node
import typingsJapgolly.datatablesNet.DataTables.CellIndexReturn
import typingsJapgolly.datatablesNet.JQuery
import typingsJapgolly.datatablesNetFixedcolumns.datatablesNetFixedcolumnsStrings.auto
import typingsJapgolly.datatablesNetFixedcolumns.datatablesNetFixedcolumnsStrings.none
import typingsJapgolly.datatablesNetFixedcolumns.datatablesNetFixedcolumnsStrings.semiauto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataTables {
  
  trait Api extends StObject {
    
    /**
      * @description Namespacing for FixedColumns methods - FixedColumns' methods are available on the returned API instance.
      * @see {@link https://datatables.net/reference/api/fixedColumns()}
      */
    def fixedColumns(): FixedColumnsMethods
  }
  object Api {
    
    inline def apply(fixedColumns: CallbackTo[FixedColumnsMethods]): Api = {
      val __obj = js.Dynamic.literal(fixedColumns = fixedColumns.toJsFn)
      __obj.asInstanceOf[Api]
    }
    
    extension [Self <: Api](x: Self) {
      
      inline def setFixedColumns(value: CallbackTo[FixedColumnsMethods]): Self = StObject.set(x, "fixedColumns", value.toJsFn)
    }
  }
  
  trait CellMethods extends StObject {
    
    /**
      * @description Get the fixed column cell node for a cell or the cell from the original DataTable if there is no matching fixed cell found.
      * @see {@link https://datatables.net/reference/api/cell().fixedNode()}
      */
    def fixedNode(): Node
  }
  object CellMethods {
    
    inline def apply(fixedNode: CallbackTo[Node]): CellMethods = {
      val __obj = js.Dynamic.literal(fixedNode = fixedNode.toJsFn)
      __obj.asInstanceOf[CellMethods]
    }
    
    extension [Self <: CellMethods](x: Self) {
      
      inline def setFixedNode(value: CallbackTo[Node]): Self = StObject.set(x, "fixedNode", value.toJsFn)
    }
  }
  
  trait CellsMethods extends StObject {
    
    /**
      * @description Get the fixed column cell nodes for multiple cells or an Api instance containing
      * the cells from the original DataTable if there is no matching fixed cell found.
      * @see {@link https://datatables.net/reference/api/cells().fixedNodes()}
      */
    def fixedNodes(): Api
  }
  object CellsMethods {
    
    inline def apply(fixedNodes: CallbackTo[Api]): CellsMethods = {
      val __obj = js.Dynamic.literal(fixedNodes = fixedNodes.toJsFn)
      __obj.asInstanceOf[CellsMethods]
    }
    
    extension [Self <: CellsMethods](x: Self) {
      
      inline def setFixedNodes(value: CallbackTo[Api]): Self = StObject.set(x, "fixedNodes", value.toJsFn)
    }
  }
  
  @js.native
  trait FixedColumnsMethods
    extends StObject
       with Api {
    
    def cellIndex(row: Node): CellIndexReturn = js.native
    /**
      * @deprecated
      * Deprecated as of v3.2.1 use dt.cell(this).index() instead
      *
      * Get the cell index of a cell in a fixed column
      *
      * @param row The cell (td or th) to get the cell index of. This can be either a cell in the fixed columns or in the host DataTable.
      */
    def cellIndex(row: JQuery): CellIndexReturn = js.native
    
    /**
      * @description Redraw the fixed columns based on new table size
      * @see {@link https://datatables.net/reference/api/fixedColumns().relayout()}
      */
    def relayout(): Api = js.native
    
    /**
      * @deprecated
      * Deprecated as of v3.2.1. Use dt.row(this).index() instead
      *
      * Get the row index of a row in a fixed column
      */
    def rowIndex(): Double = js.native
    
    /**
      * @description Update the data shown in the FixedColumns.
      * @see {@link https://datatables.net/reference/api/fixedColumns().update()}
      */
    def update(): Api = js.native
  }
  
  trait FixedColumnsSettings extends StObject {
    
    /**
      * Row height matching algorithm to use
      *
      * FixedColumns has three different algorithms that it can use: 'none', 'semiauto', 'auto'
      * @see {@link https://datatables.net/reference/option/fixedColumns.heightMatch}
      */
    var heightMatch: js.UndefOr[none | semiauto | auto] = js.undefined
    
    /**
      * @description The number of columns on the left hand side of the table to fix in place.
      * @see {@link https://datatables.net/reference/option/fixedColumns.leftColumns}
      */
    var leftColumns: js.UndefOr[Double] = js.undefined
    
    /**
      * @description The number of columns on the right hand side of the table to fix in place.
      * @see {@link https://datatables.net/reference/option/fixedColumns.rightColumns}
      */
    var rightColumns: js.UndefOr[Double] = js.undefined
  }
  object FixedColumnsSettings {
    
    inline def apply(): FixedColumnsSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FixedColumnsSettings]
    }
    
    extension [Self <: FixedColumnsSettings](x: Self) {
      
      inline def setHeightMatch(value: none | semiauto | auto): Self = StObject.set(x, "heightMatch", value.asInstanceOf[js.Any])
      
      inline def setHeightMatchUndefined: Self = StObject.set(x, "heightMatch", js.undefined)
      
      inline def setLeftColumns(value: Double): Self = StObject.set(x, "leftColumns", value.asInstanceOf[js.Any])
      
      inline def setLeftColumnsUndefined: Self = StObject.set(x, "leftColumns", js.undefined)
      
      inline def setRightColumns(value: Double): Self = StObject.set(x, "rightColumns", value.asInstanceOf[js.Any])
      
      inline def setRightColumnsUndefined: Self = StObject.set(x, "rightColumns", js.undefined)
    }
  }
  
  trait RowsMethods extends StObject {
    
    /**
      * @description Mark the heights of the selected rows (from rows()) to be recalculated on the next draw.
      * @see {@link https://datatables.net/reference/api/rows().recalcHeight()}
      */
    def recalcHeight(): Api
  }
  object RowsMethods {
    
    inline def apply(recalcHeight: CallbackTo[Api]): RowsMethods = {
      val __obj = js.Dynamic.literal(recalcHeight = recalcHeight.toJsFn)
      __obj.asInstanceOf[RowsMethods]
    }
    
    extension [Self <: RowsMethods](x: Self) {
      
      inline def setRecalcHeight(value: CallbackTo[Api]): Self = StObject.set(x, "recalcHeight", value.toJsFn)
    }
  }
  
  trait Settings extends StObject {
    
    /**
      * @description Enable and configure the FixedColumns extension for DataTables.
      * @see {@link https://datatables.net/reference/option/fixedColumns}
      */
    var fixedColumns: js.UndefOr[Boolean | FixedColumnsSettings] = js.undefined
  }
  object Settings {
    
    inline def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    extension [Self <: Settings](x: Self) {
      
      inline def setFixedColumns(value: Boolean | FixedColumnsSettings): Self = StObject.set(x, "fixedColumns", value.asInstanceOf[js.Any])
      
      inline def setFixedColumnsUndefined: Self = StObject.set(x, "fixedColumns", js.undefined)
    }
  }
}
