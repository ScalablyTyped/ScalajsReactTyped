package typingsJapgolly.uiGrid

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCanvasHeightChanged[TEntity] extends js.Object {
  /**
    * is raised when the canvas height has changed
    * @param {ng.IScope} scope Grid scope
    * @param {canvasHeightChangedHandler} handler Callback
    */
  def canvasHeightChanged(scope: IScope, handler: canvasHeightChangedHandler): Unit
  /**
    * The visibility of a column has changed, the column itself is passed out as a parameter of the event
    * @param {ng.IScope} scope The scope of the controller. This is used to deregister this event when the
    *        scope is destroyed
    * @param {columnVisibilityChangedHandler} callBack Will be called when the event is emited.
    *        The function passes back the GridCol that has changed
    */
  def columnVisibilityChanged(scope: IScope, callBack: columnVisibilityChangedHandler[TEntity]): Unit
  /**
    * is raised after the filter is changed.
    * The nature of the watch expression doesn't allow notification of what changed,
    * so the receiver of this event will need to re-extract the filter conditions from the columns.
    * @param {ng.IScope} scope Grid scope
    * @param {filterChangedHandler} handler Callback
    */
  def filterChanged(scope: IScope, handler: filterChangedHandler[TEntity]): Unit
  /**
    * is raised after the cache of visible rows is changed
    * @param {ng.IScope} scope Grid scope
    * @param {rowsRenderedHandler} handler callback
    */
  def rowsRendered(scope: IScope, handler: rowsRenderedHandler[TEntity]): Unit
  /**
    * is raised after the rows that are visible change.
    * The filtering is zero-based, so it isn't possible to say which rows changed
    * (unlike in the selection feature). We can plausibly know which row was changed when setRowInvisible is
    * called, but in that situation the user already knows which row they changed.
    * When a filter runs we don't know what changed, and that is the one that would have been useful.
    * @param {ng.IScope} scope Grid scope
    * @param {rowsVisibleChangedHandler} handler callback
    */
  def rowsVisibleChanged(scope: IScope, handler: rowsVisibleChangedHandler[TEntity]): Unit
  /**
    * is raised when scroll begins. Is throttled, so won't be raised too frequently
    * @param {ng.IScope} scope Grid scope
    * @param {scrollBeginHandler} handler callback
    */
  def scrollBegin(scope: IScope, handler: scrollBeginHandler): Unit
  /**
    * is raised when scroll has finished. Is throttled, so won't be raised too frequently
    * @param {ng.IScope} scope Grid scope
    * @param {scrollEndHandler} handler callback
    */
  def scrollEnd(scope: IScope, handler: scrollEndHandler): Unit
  /**
    * is raised after the sort criteria on one or more columns have changed
    * @param {ng.IScope} scope Grid scope
    * @param {sortChangedHandler} handler callback
    */
  def sortChanged(scope: IScope, handler: sortChangedHandler[TEntity]): Unit
}

object AnonCanvasHeightChanged {
  @scala.inline
  def apply[TEntity](
    canvasHeightChanged: (IScope, canvasHeightChangedHandler) => Callback,
    columnVisibilityChanged: (IScope, columnVisibilityChangedHandler[TEntity]) => Callback,
    filterChanged: (IScope, filterChangedHandler[TEntity]) => Callback,
    rowsRendered: (IScope, rowsRenderedHandler[TEntity]) => Callback,
    rowsVisibleChanged: (IScope, rowsVisibleChangedHandler[TEntity]) => Callback,
    scrollBegin: (IScope, scrollBeginHandler) => Callback,
    scrollEnd: (IScope, scrollEndHandler) => Callback,
    sortChanged: (IScope, sortChangedHandler[TEntity]) => Callback
  ): AnonCanvasHeightChanged[TEntity] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canvasHeightChanged")(js.Any.fromFunction2((t0: typingsJapgolly.angular.mod.IScope, t1: typingsJapgolly.uiGrid.mod.canvasHeightChangedHandler) => canvasHeightChanged(t0, t1).runNow()))
    __obj.updateDynamic("columnVisibilityChanged")(js.Any.fromFunction2((t0: typingsJapgolly.angular.mod.IScope, t1: typingsJapgolly.uiGrid.mod.columnVisibilityChangedHandler[TEntity]) => columnVisibilityChanged(t0, t1).runNow()))
    __obj.updateDynamic("filterChanged")(js.Any.fromFunction2((t0: typingsJapgolly.angular.mod.IScope, t1: typingsJapgolly.uiGrid.mod.filterChangedHandler[TEntity]) => filterChanged(t0, t1).runNow()))
    __obj.updateDynamic("rowsRendered")(js.Any.fromFunction2((t0: typingsJapgolly.angular.mod.IScope, t1: typingsJapgolly.uiGrid.mod.rowsRenderedHandler[TEntity]) => rowsRendered(t0, t1).runNow()))
    __obj.updateDynamic("rowsVisibleChanged")(js.Any.fromFunction2((t0: typingsJapgolly.angular.mod.IScope, t1: typingsJapgolly.uiGrid.mod.rowsVisibleChangedHandler[TEntity]) => rowsVisibleChanged(t0, t1).runNow()))
    __obj.updateDynamic("scrollBegin")(js.Any.fromFunction2((t0: typingsJapgolly.angular.mod.IScope, t1: typingsJapgolly.uiGrid.mod.scrollBeginHandler) => scrollBegin(t0, t1).runNow()))
    __obj.updateDynamic("scrollEnd")(js.Any.fromFunction2((t0: typingsJapgolly.angular.mod.IScope, t1: typingsJapgolly.uiGrid.mod.scrollEndHandler) => scrollEnd(t0, t1).runNow()))
    __obj.updateDynamic("sortChanged")(js.Any.fromFunction2((t0: typingsJapgolly.angular.mod.IScope, t1: typingsJapgolly.uiGrid.mod.sortChangedHandler[TEntity]) => sortChanged(t0, t1).runNow()))
    __obj.asInstanceOf[AnonCanvasHeightChanged[TEntity]]
  }
}

