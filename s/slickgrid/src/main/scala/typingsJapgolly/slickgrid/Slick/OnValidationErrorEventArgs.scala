package typingsJapgolly.slickgrid.Slick

import org.scalajs.dom.HTMLElement
import typingsJapgolly.slickgrid.Slick.Editors.Editor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnValidationErrorEventArgs[T /* <: SlickData */]
  extends StObject
     with GridEventArgs[T] {
  
  var cell: Double
  
  var cellNode: HTMLElement
  
  var column: Column[T]
  
  var editor: Editor[T]
  
  var row: Double
  
  var validationResults: ValidateResults
}
object OnValidationErrorEventArgs {
  
  inline def apply[T /* <: SlickData */](
    cell: Double,
    cellNode: HTMLElement,
    column: Column[T],
    editor: Editor[T],
    grid: Grid[T],
    row: Double,
    validationResults: ValidateResults
  ): OnValidationErrorEventArgs[T] = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], cellNode = cellNode.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], validationResults = validationResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnValidationErrorEventArgs[T]]
  }
  
  extension [Self <: OnValidationErrorEventArgs[?], T /* <: SlickData */](x: Self & OnValidationErrorEventArgs[T]) {
    
    inline def setCell(value: Double): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    inline def setCellNode(value: HTMLElement): Self = StObject.set(x, "cellNode", value.asInstanceOf[js.Any])
    
    inline def setColumn(value: Column[T]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setEditor(value: Editor[T]): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setValidationResults(value: ValidateResults): Self = StObject.set(x, "validationResults", value.asInstanceOf[js.Any])
  }
}
