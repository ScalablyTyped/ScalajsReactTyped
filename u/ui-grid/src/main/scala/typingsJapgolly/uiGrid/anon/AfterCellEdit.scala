package typingsJapgolly.uiGrid.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.mod.IScope
import typingsJapgolly.uiGrid.mod.edit.afterCellEditHandler
import typingsJapgolly.uiGrid.mod.edit.beginCellEditHandler
import typingsJapgolly.uiGrid.mod.edit.cancelCellEditHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AfterCellEdit[TEntity] extends StObject {
  
  /**
    * raised when cell editing is complete
    * @param scope The grid scope
    * @param handler Callback
    */
  def afterCellEdit(scope: IScope, handler: afterCellEditHandler[TEntity]): Unit
  
  /**
    * raised when cell editing starts on a cell
    * @param scope The grid scope
    * @param handler Callback
    */
  def beginCellEdit(scope: IScope, handler: beginCellEditHandler[TEntity]): Unit
  
  /**
    * raised when cell editing is cancelled on a cell
    * @param scope The grid scope
    * @param handler Callback
    */
  def cancelCellEdit(scope: IScope, handler: cancelCellEditHandler[TEntity]): Unit
}
object AfterCellEdit {
  
  inline def apply[TEntity](
    afterCellEdit: (IScope, afterCellEditHandler[TEntity]) => Callback,
    beginCellEdit: (IScope, beginCellEditHandler[TEntity]) => Callback,
    cancelCellEdit: (IScope, cancelCellEditHandler[TEntity]) => Callback
  ): AfterCellEdit[TEntity] = {
    val __obj = js.Dynamic.literal(afterCellEdit = js.Any.fromFunction2((t0: IScope, t1: afterCellEditHandler[TEntity]) => (afterCellEdit(t0, t1)).runNow()), beginCellEdit = js.Any.fromFunction2((t0: IScope, t1: beginCellEditHandler[TEntity]) => (beginCellEdit(t0, t1)).runNow()), cancelCellEdit = js.Any.fromFunction2((t0: IScope, t1: cancelCellEditHandler[TEntity]) => (cancelCellEdit(t0, t1)).runNow()))
    __obj.asInstanceOf[AfterCellEdit[TEntity]]
  }
  
  extension [Self <: AfterCellEdit[?], TEntity](x: Self & AfterCellEdit[TEntity]) {
    
    inline def setAfterCellEdit(value: (IScope, afterCellEditHandler[TEntity]) => Callback): Self = StObject.set(x, "afterCellEdit", js.Any.fromFunction2((t0: IScope, t1: afterCellEditHandler[TEntity]) => (value(t0, t1)).runNow()))
    
    inline def setBeginCellEdit(value: (IScope, beginCellEditHandler[TEntity]) => Callback): Self = StObject.set(x, "beginCellEdit", js.Any.fromFunction2((t0: IScope, t1: beginCellEditHandler[TEntity]) => (value(t0, t1)).runNow()))
    
    inline def setCancelCellEdit(value: (IScope, cancelCellEditHandler[TEntity]) => Callback): Self = StObject.set(x, "cancelCellEdit", js.Any.fromFunction2((t0: IScope, t1: cancelCellEditHandler[TEntity]) => (value(t0, t1)).runNow()))
  }
}
