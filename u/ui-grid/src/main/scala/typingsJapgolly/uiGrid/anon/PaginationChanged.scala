package typingsJapgolly.uiGrid.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.mod.IScope
import typingsJapgolly.uiGrid.mod.pagination.paginationChangedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaginationChanged extends StObject {
  
  /**
    * This event fires when the pageSize or currentPage changes
    * @param scope The grid scope
    * @param handler Callback
    */
  def paginationChanged(scope: IScope, handler: paginationChangedHandler): Unit
}
object PaginationChanged {
  
  inline def apply(paginationChanged: (IScope, paginationChangedHandler) => Callback): PaginationChanged = {
    val __obj = js.Dynamic.literal(paginationChanged = js.Any.fromFunction2((t0: IScope, t1: paginationChangedHandler) => (paginationChanged(t0, t1)).runNow()))
    __obj.asInstanceOf[PaginationChanged]
  }
  
  extension [Self <: PaginationChanged](x: Self) {
    
    inline def setPaginationChanged(value: (IScope, paginationChangedHandler) => Callback): Self = StObject.set(x, "paginationChanged", js.Any.fromFunction2((t0: IScope, t1: paginationChangedHandler) => (value(t0, t1)).runNow()))
  }
}
