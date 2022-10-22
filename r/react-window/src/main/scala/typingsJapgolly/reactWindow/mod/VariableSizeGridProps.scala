package typingsJapgolly.reactWindow.mod

import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariableSizeGridProps[T]
  extends StObject
     with GridProps[T] {
  
  /**
    * Returns the width of the specified column.
    */
  def columnWidth(index: Double): Double
  
  /**
    * Average (or estimated) column width for unrendered columns.
    *
    * This value is used to calculated the estimated total width of a Grid before its columns have all been measured.
    * The estimated width impacts user scrolling behavior. It is updated whenever new columns are measured.
    */
  var estimatedColumnWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Average (or estimated) row height for unrendered rows.
    *
    * This value is used to calculated the estimated total height of a Grid before its rows have all been measured.
    * The estimated height impacts user scrolling behavior. It is updated whenever new rows are measured.
    */
  var estimatedRowHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Returns the height of the specified row.
    */
  def rowHeight(index: Double): Double
}
object VariableSizeGridProps {
  
  inline def apply[T](
    children: ComponentType[GridChildComponentProps[T]],
    columnCount: Double,
    columnWidth: Double => Double,
    height: Double,
    rowCount: Double,
    rowHeight: Double => Double,
    width: Double
  ): VariableSizeGridProps[T] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], columnCount = columnCount.asInstanceOf[js.Any], columnWidth = js.Any.fromFunction1(columnWidth), height = height.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowHeight = js.Any.fromFunction1(rowHeight), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableSizeGridProps[T]]
  }
  
  extension [Self <: VariableSizeGridProps[?], T](x: Self & VariableSizeGridProps[T]) {
    
    inline def setColumnWidth(value: Double => Double): Self = StObject.set(x, "columnWidth", js.Any.fromFunction1(value))
    
    inline def setEstimatedColumnWidth(value: Double): Self = StObject.set(x, "estimatedColumnWidth", value.asInstanceOf[js.Any])
    
    inline def setEstimatedColumnWidthUndefined: Self = StObject.set(x, "estimatedColumnWidth", js.undefined)
    
    inline def setEstimatedRowHeight(value: Double): Self = StObject.set(x, "estimatedRowHeight", value.asInstanceOf[js.Any])
    
    inline def setEstimatedRowHeightUndefined: Self = StObject.set(x, "estimatedRowHeight", js.undefined)
    
    inline def setRowHeight(value: Double => Double): Self = StObject.set(x, "rowHeight", js.Any.fromFunction1(value))
  }
}
