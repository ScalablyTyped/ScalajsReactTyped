package typingsJapgolly.uiGrid.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.mod.IScope
import typingsJapgolly.uiGrid.mod.treeBase.rowCollapsedHandler
import typingsJapgolly.uiGrid.mod.treeBase.rowExpandedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowCollapsed[TEntity] extends StObject {
  
  /**
    * Raised when a row is collapsed.  Doesn't really have a purpose at the moment.  Included for symmetry
    * @param scope Grid scope
    * @param handler Callback
    */
  def rowCollapsed(scope: IScope, handler: rowCollapsedHandler[TEntity]): Unit
  
  /**
    * Raised whenever a row is expanded.
    *
    * If you are dynamically rendering your tree,
    * in your callback you can retrieve the children of this row and load them into the grid data.
    *
    * When the data is loaded, the grid will automatically refresh to show these new rows.
    * @param scope Grid Scope
    * @param handler Callback
    */
  def rowExpanded(scope: IScope, handler: rowExpandedHandler[TEntity]): Unit
}
object RowCollapsed {
  
  inline def apply[TEntity](
    rowCollapsed: (IScope, rowCollapsedHandler[TEntity]) => Callback,
    rowExpanded: (IScope, rowExpandedHandler[TEntity]) => Callback
  ): RowCollapsed[TEntity] = {
    val __obj = js.Dynamic.literal(rowCollapsed = js.Any.fromFunction2((t0: IScope, t1: rowCollapsedHandler[TEntity]) => (rowCollapsed(t0, t1)).runNow()), rowExpanded = js.Any.fromFunction2((t0: IScope, t1: rowExpandedHandler[TEntity]) => (rowExpanded(t0, t1)).runNow()))
    __obj.asInstanceOf[RowCollapsed[TEntity]]
  }
  
  extension [Self <: RowCollapsed[?], TEntity](x: Self & RowCollapsed[TEntity]) {
    
    inline def setRowCollapsed(value: (IScope, rowCollapsedHandler[TEntity]) => Callback): Self = StObject.set(x, "rowCollapsed", js.Any.fromFunction2((t0: IScope, t1: rowCollapsedHandler[TEntity]) => (value(t0, t1)).runNow()))
    
    inline def setRowExpanded(value: (IScope, rowExpandedHandler[TEntity]) => Callback): Self = StObject.set(x, "rowExpanded", js.Any.fromFunction2((t0: IScope, t1: rowExpandedHandler[TEntity]) => (value(t0, t1)).runNow()))
  }
}
