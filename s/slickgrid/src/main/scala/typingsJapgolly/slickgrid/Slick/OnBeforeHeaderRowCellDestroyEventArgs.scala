package typingsJapgolly.slickgrid.Slick

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBeforeHeaderRowCellDestroyEventArgs[T /* <: SlickData */]
  extends StObject
     with GridEventArgs[T] {
  
  // todo: might be JQuery instance
  var column: Column[T]
  
  var node: HTMLElement
}
object OnBeforeHeaderRowCellDestroyEventArgs {
  
  inline def apply[T /* <: SlickData */](column: Column[T], grid: Grid[T], node: HTMLElement): OnBeforeHeaderRowCellDestroyEventArgs[T] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBeforeHeaderRowCellDestroyEventArgs[T]]
  }
  
  extension [Self <: OnBeforeHeaderRowCellDestroyEventArgs[?], T /* <: SlickData */](x: Self & OnBeforeHeaderRowCellDestroyEventArgs[T]) {
    
    inline def setColumn(value: Column[T]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setNode(value: HTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
