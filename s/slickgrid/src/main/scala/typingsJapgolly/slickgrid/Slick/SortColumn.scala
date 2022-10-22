package typingsJapgolly.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortColumn[T /* <: SlickData */] extends StObject {
  
  var sortAsc: Boolean
  
  var sortCol: Column[T]
}
object SortColumn {
  
  inline def apply[T /* <: SlickData */](sortAsc: Boolean, sortCol: Column[T]): SortColumn[T] = {
    val __obj = js.Dynamic.literal(sortAsc = sortAsc.asInstanceOf[js.Any], sortCol = sortCol.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortColumn[T]]
  }
  
  extension [Self <: SortColumn[?], T /* <: SlickData */](x: Self & SortColumn[T]) {
    
    inline def setSortAsc(value: Boolean): Self = StObject.set(x, "sortAsc", value.asInstanceOf[js.Any])
    
    inline def setSortCol(value: Column[T]): Self = StObject.set(x, "sortCol", value.asInstanceOf[js.Any])
  }
}
