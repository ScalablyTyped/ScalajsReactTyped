package typingsJapgolly.uiGrid.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.mod.IScope
import typingsJapgolly.uiGrid.mod.expandable.rowExpandedStateChangedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowExpandedStateChanged[TEntity] extends StObject {
  
  /**
    * raised when cell editing is complete
    * @param scope
    * @param handler
    */
  def rowExpandedStateChanged(scope: IScope, handler: rowExpandedStateChangedHandler[TEntity]): Unit
}
object RowExpandedStateChanged {
  
  inline def apply[TEntity](rowExpandedStateChanged: (IScope, rowExpandedStateChangedHandler[TEntity]) => Callback): RowExpandedStateChanged[TEntity] = {
    val __obj = js.Dynamic.literal(rowExpandedStateChanged = js.Any.fromFunction2((t0: IScope, t1: rowExpandedStateChangedHandler[TEntity]) => (rowExpandedStateChanged(t0, t1)).runNow()))
    __obj.asInstanceOf[RowExpandedStateChanged[TEntity]]
  }
  
  extension [Self <: RowExpandedStateChanged[?], TEntity](x: Self & RowExpandedStateChanged[TEntity]) {
    
    inline def setRowExpandedStateChanged(value: (IScope, rowExpandedStateChangedHandler[TEntity]) => Callback): Self = StObject.set(x, "rowExpandedStateChanged", js.Any.fromFunction2((t0: IScope, t1: rowExpandedStateChangedHandler[TEntity]) => (value(t0, t1)).runNow()))
  }
}
