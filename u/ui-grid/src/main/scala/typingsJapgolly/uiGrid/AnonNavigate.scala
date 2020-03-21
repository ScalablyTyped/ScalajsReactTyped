package typingsJapgolly.uiGrid

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.mod.IScope
import typingsJapgolly.uiGrid.mod.cellNav.navigateHandler
import typingsJapgolly.uiGrid.mod.cellNav.viewportKeyDownHandler
import typingsJapgolly.uiGrid.mod.cellNav.viewportKeyPressHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNavigate[TEntity] extends js.Object {
  /**
    * raised when the active cell is changed
    * @param {ng.IScope} scope The grid scope
    * @param {navigateHandler} handler Callback
    */
  def navigate(scope: IScope, handler: navigateHandler[TEntity]): Unit
  /**
    * viewPortKeyDown is raised when the viewPort receives a keyDown event.
    * Cells never get focus in uiGrid due to the difficulties of setting focus on a cell that is
    * not visible in the viewport. Use this event whenever you need a keydown event on a cell.
    * @param {ng.IScope} scope The grid scope
    * @param {viewportKeyDownHandler} handler Callback
    */
  def viewPortKeyDown(scope: IScope, handler: viewportKeyDownHandler[TEntity]): Unit
  /**
    * viewPortKeyPress is raised when the viewPort receives a keyPress event.
    * Cells never get focus in uiGrid due to the difficulties of setting focus on a cell that is
    * not visible in the viewport. Use this event whenever you need a keypress event on a cell.
    * @param {ng.IScope} scope The grid scope
    * @param {viewportKeyPressHandler} handler Callback
    */
  def viewPortKeyPress(scope: IScope, handler: viewportKeyPressHandler[TEntity]): Unit
}

object AnonNavigate {
  @scala.inline
  def apply[TEntity](
    navigate: (IScope, navigateHandler[TEntity]) => Callback,
    viewPortKeyDown: (IScope, viewportKeyDownHandler[TEntity]) => Callback,
    viewPortKeyPress: (IScope, viewportKeyPressHandler[TEntity]) => Callback
  ): AnonNavigate[TEntity] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("navigate")(js.Any.fromFunction2((t0: typingsJapgolly.angular.mod.IScope, t1: typingsJapgolly.uiGrid.mod.cellNav.navigateHandler[TEntity]) => navigate(t0, t1).runNow()))
    __obj.updateDynamic("viewPortKeyDown")(js.Any.fromFunction2((t0: typingsJapgolly.angular.mod.IScope, t1: typingsJapgolly.uiGrid.mod.cellNav.viewportKeyDownHandler[TEntity]) => viewPortKeyDown(t0, t1).runNow()))
    __obj.updateDynamic("viewPortKeyPress")(js.Any.fromFunction2((t0: typingsJapgolly.angular.mod.IScope, t1: typingsJapgolly.uiGrid.mod.cellNav.viewportKeyPressHandler[TEntity]) => viewPortKeyPress(t0, t1).runNow()))
    __obj.asInstanceOf[AnonNavigate[TEntity]]
  }
}

