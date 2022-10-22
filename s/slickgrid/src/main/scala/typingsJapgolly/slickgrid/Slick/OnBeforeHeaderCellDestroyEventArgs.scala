package typingsJapgolly.slickgrid.Slick

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBeforeHeaderCellDestroyEventArgs[T /* <: SlickData */]
  extends StObject
     with GridEventArgs[T] {
  
  // todo: might be JQuery instance
  var column: Column[T]
  
  var node: HTMLElement
}
object OnBeforeHeaderCellDestroyEventArgs {
  
  inline def apply[T /* <: SlickData */](column: Column[T], grid: Grid[T], node: HTMLElement): OnBeforeHeaderCellDestroyEventArgs[T] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBeforeHeaderCellDestroyEventArgs[T]]
  }
  
  extension [Self <: OnBeforeHeaderCellDestroyEventArgs[?], T /* <: SlickData */](x: Self & OnBeforeHeaderCellDestroyEventArgs[T]) {
    
    inline def setColumn(value: Column[T]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setNode(value: HTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
