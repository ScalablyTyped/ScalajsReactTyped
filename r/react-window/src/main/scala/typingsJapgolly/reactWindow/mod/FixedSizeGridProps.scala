package typingsJapgolly.reactWindow.mod

import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FixedSizeGridProps[T]
  extends StObject
     with GridProps[T] {
  
  /**
    * Width of an individual column within the grid.
    */
  var columnWidth: Double
  
  /**
    * Height of an individual row within the grid.
    */
  var rowHeight: Double
}
object FixedSizeGridProps {
  
  inline def apply[T](
    children: ComponentType[GridChildComponentProps[T]],
    columnCount: Double,
    columnWidth: Double,
    height: Double,
    rowCount: Double,
    rowHeight: Double,
    width: Double
  ): FixedSizeGridProps[T] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], columnCount = columnCount.asInstanceOf[js.Any], columnWidth = columnWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedSizeGridProps[T]]
  }
  
  extension [Self <: FixedSizeGridProps[?], T](x: Self & FixedSizeGridProps[T]) {
    
    inline def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    inline def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
  }
}
