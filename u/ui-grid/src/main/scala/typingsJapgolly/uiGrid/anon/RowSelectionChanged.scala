package typingsJapgolly.uiGrid.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.mod.IScope
import typingsJapgolly.uiGrid.mod.selection.rowSelectionChangedBatchHandler
import typingsJapgolly.uiGrid.mod.selection.rowSelectionChangedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowSelectionChanged[TEntity] extends StObject {
  
  /**
    * is raised after the row.isSelected state is changed
    * @param scope grid scope
    * @param handler callback
    */
  def rowSelectionChanged(scope: IScope, handler: rowSelectionChangedHandler[TEntity]): Unit
  
  /**
    * is raised after the row.isSelected state is changed in bulk,
    * if the enableSelectionBatchEvent option is set to true (which it is by default).
    * This allows more efficient processing of bulk events.
    * @param scope grid scope
    * @param handler callback
    */
  def rowSelectionChangedBatch(scope: IScope, handler: rowSelectionChangedBatchHandler[TEntity]): Unit
}
object RowSelectionChanged {
  
  inline def apply[TEntity](
    rowSelectionChanged: (IScope, rowSelectionChangedHandler[TEntity]) => Callback,
    rowSelectionChangedBatch: (IScope, rowSelectionChangedBatchHandler[TEntity]) => Callback
  ): RowSelectionChanged[TEntity] = {
    val __obj = js.Dynamic.literal(rowSelectionChanged = js.Any.fromFunction2((t0: IScope, t1: rowSelectionChangedHandler[TEntity]) => (rowSelectionChanged(t0, t1)).runNow()), rowSelectionChangedBatch = js.Any.fromFunction2((t0: IScope, t1: rowSelectionChangedBatchHandler[TEntity]) => (rowSelectionChangedBatch(t0, t1)).runNow()))
    __obj.asInstanceOf[RowSelectionChanged[TEntity]]
  }
  
  extension [Self <: RowSelectionChanged[?], TEntity](x: Self & RowSelectionChanged[TEntity]) {
    
    inline def setRowSelectionChanged(value: (IScope, rowSelectionChangedHandler[TEntity]) => Callback): Self = StObject.set(x, "rowSelectionChanged", js.Any.fromFunction2((t0: IScope, t1: rowSelectionChangedHandler[TEntity]) => (value(t0, t1)).runNow()))
    
    inline def setRowSelectionChangedBatch(value: (IScope, rowSelectionChangedBatchHandler[TEntity]) => Callback): Self = StObject.set(x, "rowSelectionChangedBatch", js.Any.fromFunction2((t0: IScope, t1: rowSelectionChangedBatchHandler[TEntity]) => (value(t0, t1)).runNow()))
  }
}
