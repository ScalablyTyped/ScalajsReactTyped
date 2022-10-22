package typingsJapgolly.handsontable

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.handsontable.handsontableStrings.after
import typingsJapgolly.handsontable.handsontableStrings.before
import typingsJapgolly.numbro.mod.numbro.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  type CellChange = js.Tuple4[Double, String | Double, CellValue, CellValue]
  
  type CellValue = Any
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.handsontable.handsontableStrings.auto
    - typingsJapgolly.handsontable.handsontableStrings.edit
    - typingsJapgolly.handsontable.handsontableStrings.loadData
    - typingsJapgolly.handsontable.handsontableStrings.populateFromArray
    - typingsJapgolly.handsontable.handsontableStrings.spliceCol
    - typingsJapgolly.handsontable.handsontableStrings.spliceRow
    - typingsJapgolly.handsontable.handsontableStrings.timeValidate
    - typingsJapgolly.handsontable.handsontableStrings.dateValidate
    - typingsJapgolly.handsontable.handsontableStrings.validateCells
    - typingsJapgolly.handsontable.handsontableStrings.AutofillDotfill
    - typingsJapgolly.handsontable.handsontableStrings.ContextMenuDotclearColumns
    - typingsJapgolly.handsontable.handsontableStrings.ContextMenuDotcolumnLeft
    - typingsJapgolly.handsontable.handsontableStrings.ContextMenuDotcolumnRight
    - typingsJapgolly.handsontable.handsontableStrings.ContextMenuDotremoveColumn
    - typingsJapgolly.handsontable.handsontableStrings.ContextMenuDotremoveRow
    - typingsJapgolly.handsontable.handsontableStrings.ContextMenuDotrowAbove
    - typingsJapgolly.handsontable.handsontableStrings.ContextMenuDotrowBelow
    - typingsJapgolly.handsontable.handsontableStrings.CopyPasteDotpaste
    - typingsJapgolly.handsontable.handsontableStrings.UndoRedoDotredo
    - typingsJapgolly.handsontable.handsontableStrings.UndoRedoDotundo
    - typingsJapgolly.handsontable.handsontableStrings.ColumnSummaryDotset
    - typingsJapgolly.handsontable.handsontableStrings.ColumnSummaryDotreset
  */
  trait ChangeSource extends StObject
  object ChangeSource {
    
    inline def AutofillDotfill: typingsJapgolly.handsontable.handsontableStrings.AutofillDotfill = "Autofill.fill".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.AutofillDotfill]
    
    inline def ColumnSummaryDotreset: typingsJapgolly.handsontable.handsontableStrings.ColumnSummaryDotreset = "ColumnSummary.reset".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.ColumnSummaryDotreset]
    
    inline def ColumnSummaryDotset: typingsJapgolly.handsontable.handsontableStrings.ColumnSummaryDotset = "ColumnSummary.set".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.ColumnSummaryDotset]
    
    inline def ContextMenuDotclearColumns: typingsJapgolly.handsontable.handsontableStrings.ContextMenuDotclearColumns = "ContextMenu.clearColumns".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.ContextMenuDotclearColumns]
    
    inline def ContextMenuDotcolumnLeft: typingsJapgolly.handsontable.handsontableStrings.ContextMenuDotcolumnLeft = "ContextMenu.columnLeft".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.ContextMenuDotcolumnLeft]
    
    inline def ContextMenuDotcolumnRight: typingsJapgolly.handsontable.handsontableStrings.ContextMenuDotcolumnRight = "ContextMenu.columnRight".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.ContextMenuDotcolumnRight]
    
    inline def ContextMenuDotremoveColumn: typingsJapgolly.handsontable.handsontableStrings.ContextMenuDotremoveColumn = "ContextMenu.removeColumn".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.ContextMenuDotremoveColumn]
    
    inline def ContextMenuDotremoveRow: typingsJapgolly.handsontable.handsontableStrings.ContextMenuDotremoveRow = "ContextMenu.removeRow".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.ContextMenuDotremoveRow]
    
    inline def ContextMenuDotrowAbove: typingsJapgolly.handsontable.handsontableStrings.ContextMenuDotrowAbove = "ContextMenu.rowAbove".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.ContextMenuDotrowAbove]
    
    inline def ContextMenuDotrowBelow: typingsJapgolly.handsontable.handsontableStrings.ContextMenuDotrowBelow = "ContextMenu.rowBelow".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.ContextMenuDotrowBelow]
    
    inline def CopyPasteDotpaste: typingsJapgolly.handsontable.handsontableStrings.CopyPasteDotpaste = "CopyPaste.paste".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.CopyPasteDotpaste]
    
    inline def UndoRedoDotredo: typingsJapgolly.handsontable.handsontableStrings.UndoRedoDotredo = "UndoRedo.redo".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.UndoRedoDotredo]
    
    inline def UndoRedoDotundo: typingsJapgolly.handsontable.handsontableStrings.UndoRedoDotundo = "UndoRedo.undo".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.UndoRedoDotundo]
    
    inline def auto: typingsJapgolly.handsontable.handsontableStrings.auto = "auto".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.auto]
    
    inline def dateValidate: typingsJapgolly.handsontable.handsontableStrings.dateValidate = "dateValidate".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.dateValidate]
    
    inline def edit: typingsJapgolly.handsontable.handsontableStrings.edit = "edit".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.edit]
    
    inline def loadData: typingsJapgolly.handsontable.handsontableStrings.loadData = "loadData".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.loadData]
    
    inline def populateFromArray: typingsJapgolly.handsontable.handsontableStrings.populateFromArray = "populateFromArray".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.populateFromArray]
    
    inline def spliceCol: typingsJapgolly.handsontable.handsontableStrings.spliceCol = "spliceCol".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.spliceCol]
    
    inline def spliceRow: typingsJapgolly.handsontable.handsontableStrings.spliceRow = "spliceRow".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.spliceRow]
    
    inline def timeValidate: typingsJapgolly.handsontable.handsontableStrings.timeValidate = "timeValidate".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.timeValidate]
    
    inline def validateCells: typingsJapgolly.handsontable.handsontableStrings.validateCells = "validateCells".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.validateCells]
  }
  
  @js.native
  trait ColumnDataGetterSetterFunction extends StObject {
    
    def apply(row: js.Array[CellValue]): CellValue = js.native
    def apply(row: js.Array[CellValue], value: CellValue): Unit = js.native
    def apply(row: RowObject): CellValue = js.native
    def apply(row: RowObject, value: CellValue): Unit = js.native
  }
  
  trait LabelOptions extends StObject {
    
    var position: js.UndefOr[before | after] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String | js.Function0[String]] = js.undefined
  }
  object LabelOptions {
    
    inline def apply(): LabelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelOptions]
    }
    
    extension [Self <: LabelOptions](x: Self) {
      
      inline def setPosition(value: before | after): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setValue(value: String | js.Function0[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueCallbackTo(value: CallbackTo[String]): Self = StObject.set(x, "value", value.toJsFn)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait NumericFormatOptions extends StObject {
    
    var culture: js.UndefOr[String] = js.undefined
    
    var pattern: String | Format
  }
  object NumericFormatOptions {
    
    inline def apply(pattern: String | Format): NumericFormatOptions = {
      val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumericFormatOptions]
    }
    
    extension [Self <: NumericFormatOptions](x: Self) {
      
      inline def setCulture(value: String): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
      
      inline def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
      
      inline def setPattern(value: String | Format): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    }
  }
  
  trait RangeType extends StObject {
    
    var endCol: Double
    
    var endRow: Double
    
    var startCol: Double
    
    var startRow: Double
  }
  object RangeType {
    
    inline def apply(endCol: Double, endRow: Double, startCol: Double, startRow: Double): RangeType = {
      val __obj = js.Dynamic.literal(endCol = endCol.asInstanceOf[js.Any], endRow = endRow.asInstanceOf[js.Any], startCol = startCol.asInstanceOf[js.Any], startRow = startRow.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangeType]
    }
    
    extension [Self <: RangeType](x: Self) {
      
      inline def setEndCol(value: Double): Self = StObject.set(x, "endCol", value.asInstanceOf[js.Any])
      
      inline def setEndRow(value: Double): Self = StObject.set(x, "endRow", value.asInstanceOf[js.Any])
      
      inline def setStartCol(value: Double): Self = StObject.set(x, "startCol", value.asInstanceOf[js.Any])
      
      inline def setStartRow(value: Double): Self = StObject.set(x, "startRow", value.asInstanceOf[js.Any])
    }
  }
  
  type RowObject = StringDictionary[Any]
  
  type SelectOptionsObject = StringDictionary[String]
  
  trait SimpleCellCoords extends StObject {
    
    var col: Double
    
    var row: Double
  }
  object SimpleCellCoords {
    
    inline def apply(col: Double, row: Double): SimpleCellCoords = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleCellCoords]
    }
    
    extension [Self <: SimpleCellCoords](x: Self) {
      
      inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    }
  }
  
  type SourceRowData = RowObject | js.Array[CellValue]
}
