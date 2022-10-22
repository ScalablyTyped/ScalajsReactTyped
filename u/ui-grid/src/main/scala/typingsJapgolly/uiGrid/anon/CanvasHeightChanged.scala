package typingsJapgolly.uiGrid.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.mod.IScope
import typingsJapgolly.uiGrid.mod.canvasHeightChangedHandler
import typingsJapgolly.uiGrid.mod.columnVisibilityChangedHandler
import typingsJapgolly.uiGrid.mod.filterChangedHandler
import typingsJapgolly.uiGrid.mod.rowsRenderedHandler
import typingsJapgolly.uiGrid.mod.rowsVisibleChangedHandler
import typingsJapgolly.uiGrid.mod.scrollBeginHandler
import typingsJapgolly.uiGrid.mod.scrollEndHandler
import typingsJapgolly.uiGrid.mod.sortChangedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasHeightChanged[TEntity] extends StObject {
  
  /**
    * is raised when the canvas height has changed
    * @param scope Grid scope
    * @param handler Callback
    */
  def canvasHeightChanged(scope: IScope, handler: canvasHeightChangedHandler): Unit
  
  /**
    * The visibility of a column has changed, the column itself is passed out as a parameter of the event
    * @param scope The scope of the controller. This is used to deregister this event when the
    *        scope is destroyed
    * @param callBack Will be called when the event is emited.
    *        The function passes back the GridCol that has changed
    */
  def columnVisibilityChanged(scope: IScope, callBack: columnVisibilityChangedHandler[TEntity]): Unit
  
  /**
    * is raised after the filter is changed.
    * The nature of the watch expression doesn't allow notification of what changed,
    * so the receiver of this event will need to re-extract the filter conditions from the columns.
    * @param scope Grid scope
    * @param handler Callback
    */
  def filterChanged(scope: IScope, handler: filterChangedHandler[TEntity]): Unit
  
  /**
    * is raised after the cache of visible rows is changed
    * @param scope Grid scope
    * @param handler callback
    */
  def rowsRendered(scope: IScope, handler: rowsRenderedHandler[TEntity]): Unit
  
  /**
    * is raised after the rows that are visible change.
    * The filtering is zero-based, so it isn't possible to say which rows changed
    * (unlike in the selection feature). We can plausibly know which row was changed when setRowInvisible is
    * called, but in that situation the user already knows which row they changed.
    * When a filter runs we don't know what changed, and that is the one that would have been useful.
    * @param scope Grid scope
    * @param handler callback
    */
  def rowsVisibleChanged(scope: IScope, handler: rowsVisibleChangedHandler[TEntity]): Unit
  
  /**
    * is raised when scroll begins. Is throttled, so won't be raised too frequently
    * @param scope Grid scope
    * @param handler callback
    */
  def scrollBegin(scope: IScope, handler: scrollBeginHandler): Unit
  
  /**
    * is raised when scroll has finished. Is throttled, so won't be raised too frequently
    * @param scope Grid scope
    * @param handler callback
    */
  def scrollEnd(scope: IScope, handler: scrollEndHandler): Unit
  
  /**
    * is raised after the sort criteria on one or more columns have changed
    * @param scope Grid scope
    * @param handler callback
    */
  def sortChanged(scope: IScope, handler: sortChangedHandler[TEntity]): Unit
}
object CanvasHeightChanged {
  
  inline def apply[TEntity](
    canvasHeightChanged: (IScope, canvasHeightChangedHandler) => Callback,
    columnVisibilityChanged: (IScope, columnVisibilityChangedHandler[TEntity]) => Callback,
    filterChanged: (IScope, filterChangedHandler[TEntity]) => Callback,
    rowsRendered: (IScope, rowsRenderedHandler[TEntity]) => Callback,
    rowsVisibleChanged: (IScope, rowsVisibleChangedHandler[TEntity]) => Callback,
    scrollBegin: (IScope, scrollBeginHandler) => Callback,
    scrollEnd: (IScope, scrollEndHandler) => Callback,
    sortChanged: (IScope, sortChangedHandler[TEntity]) => Callback
  ): CanvasHeightChanged[TEntity] = {
    val __obj = js.Dynamic.literal(canvasHeightChanged = js.Any.fromFunction2((t0: IScope, t1: canvasHeightChangedHandler) => (canvasHeightChanged(t0, t1)).runNow()), columnVisibilityChanged = js.Any.fromFunction2((t0: IScope, t1: columnVisibilityChangedHandler[TEntity]) => (columnVisibilityChanged(t0, t1)).runNow()), filterChanged = js.Any.fromFunction2((t0: IScope, t1: filterChangedHandler[TEntity]) => (filterChanged(t0, t1)).runNow()), rowsRendered = js.Any.fromFunction2((t0: IScope, t1: rowsRenderedHandler[TEntity]) => (rowsRendered(t0, t1)).runNow()), rowsVisibleChanged = js.Any.fromFunction2((t0: IScope, t1: rowsVisibleChangedHandler[TEntity]) => (rowsVisibleChanged(t0, t1)).runNow()), scrollBegin = js.Any.fromFunction2((t0: IScope, t1: scrollBeginHandler) => (scrollBegin(t0, t1)).runNow()), scrollEnd = js.Any.fromFunction2((t0: IScope, t1: scrollEndHandler) => (scrollEnd(t0, t1)).runNow()), sortChanged = js.Any.fromFunction2((t0: IScope, t1: sortChangedHandler[TEntity]) => (sortChanged(t0, t1)).runNow()))
    __obj.asInstanceOf[CanvasHeightChanged[TEntity]]
  }
  
  extension [Self <: CanvasHeightChanged[?], TEntity](x: Self & CanvasHeightChanged[TEntity]) {
    
    inline def setCanvasHeightChanged(value: (IScope, canvasHeightChangedHandler) => Callback): Self = StObject.set(x, "canvasHeightChanged", js.Any.fromFunction2((t0: IScope, t1: canvasHeightChangedHandler) => (value(t0, t1)).runNow()))
    
    inline def setColumnVisibilityChanged(value: (IScope, columnVisibilityChangedHandler[TEntity]) => Callback): Self = StObject.set(x, "columnVisibilityChanged", js.Any.fromFunction2((t0: IScope, t1: columnVisibilityChangedHandler[TEntity]) => (value(t0, t1)).runNow()))
    
    inline def setFilterChanged(value: (IScope, filterChangedHandler[TEntity]) => Callback): Self = StObject.set(x, "filterChanged", js.Any.fromFunction2((t0: IScope, t1: filterChangedHandler[TEntity]) => (value(t0, t1)).runNow()))
    
    inline def setRowsRendered(value: (IScope, rowsRenderedHandler[TEntity]) => Callback): Self = StObject.set(x, "rowsRendered", js.Any.fromFunction2((t0: IScope, t1: rowsRenderedHandler[TEntity]) => (value(t0, t1)).runNow()))
    
    inline def setRowsVisibleChanged(value: (IScope, rowsVisibleChangedHandler[TEntity]) => Callback): Self = StObject.set(x, "rowsVisibleChanged", js.Any.fromFunction2((t0: IScope, t1: rowsVisibleChangedHandler[TEntity]) => (value(t0, t1)).runNow()))
    
    inline def setScrollBegin(value: (IScope, scrollBeginHandler) => Callback): Self = StObject.set(x, "scrollBegin", js.Any.fromFunction2((t0: IScope, t1: scrollBeginHandler) => (value(t0, t1)).runNow()))
    
    inline def setScrollEnd(value: (IScope, scrollEndHandler) => Callback): Self = StObject.set(x, "scrollEnd", js.Any.fromFunction2((t0: IScope, t1: scrollEndHandler) => (value(t0, t1)).runNow()))
    
    inline def setSortChanged(value: (IScope, sortChangedHandler[TEntity]) => Callback): Self = StObject.set(x, "sortChanged", js.Any.fromFunction2((t0: IScope, t1: sortChangedHandler[TEntity]) => (value(t0, t1)).runNow()))
  }
}
