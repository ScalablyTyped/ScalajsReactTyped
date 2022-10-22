package typingsJapgolly.baseui

import japgolly.scalajs.react.Callback
import typingsJapgolly.baseui.dataTableTypesMod.ColumnOptions
import typingsJapgolly.baseui.dataTableTypesMod.Row
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataTableMeasureColumnWidthsMod {
  
  @JSImport("baseui/data-table/measure-column-widths", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasColumnsRowsWidthsIsSelectableOnWidthsChange: MeasureColumnWidthsProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasColumnsRowsWidthsIsSelectableOnWidthsChange.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait MeasureColumnWidthsProps extends StObject {
    
    var columns: js.Array[ColumnOptions[Any, Any]]
    
    var isSelectable: Boolean
    
    def onWidthsChange(a: js.Array[Double]): Unit
    
    var rows: js.Array[Row]
    
    var widths: js.Array[Double]
  }
  object MeasureColumnWidthsProps {
    
    inline def apply(
      columns: js.Array[ColumnOptions[Any, Any]],
      isSelectable: Boolean,
      onWidthsChange: js.Array[Double] => Callback,
      rows: js.Array[Row],
      widths: js.Array[Double]
    ): MeasureColumnWidthsProps = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], isSelectable = isSelectable.asInstanceOf[js.Any], onWidthsChange = js.Any.fromFunction1((t0: js.Array[Double]) => onWidthsChange(t0).runNow()), rows = rows.asInstanceOf[js.Any], widths = widths.asInstanceOf[js.Any])
      __obj.asInstanceOf[MeasureColumnWidthsProps]
    }
    
    extension [Self <: MeasureColumnWidthsProps](x: Self) {
      
      inline def setColumns(value: js.Array[ColumnOptions[Any, Any]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: (ColumnOptions[Any, Any])*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setIsSelectable(value: Boolean): Self = StObject.set(x, "isSelectable", value.asInstanceOf[js.Any])
      
      inline def setOnWidthsChange(value: js.Array[Double] => Callback): Self = StObject.set(x, "onWidthsChange", js.Any.fromFunction1((t0: js.Array[Double]) => value(t0).runNow()))
      
      inline def setRows(value: js.Array[Row]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsVarargs(value: Row*): Self = StObject.set(x, "rows", js.Array(value*))
      
      inline def setWidths(value: js.Array[Double]): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
      
      inline def setWidthsVarargs(value: Double*): Self = StObject.set(x, "widths", js.Array(value*))
    }
  }
}
