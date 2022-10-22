package typingsJapgolly.uiGrid.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.mod.IScope
import typingsJapgolly.uiGrid.mod.cellNav.navigateHandler
import typingsJapgolly.uiGrid.mod.cellNav.viewportKeyDownHandler
import typingsJapgolly.uiGrid.mod.cellNav.viewportKeyPressHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigate[TEntity] extends StObject {
  
  /**
    * raised when the active cell is changed
    * @param scope The grid scope
    * @param handler Callback
    */
  def navigate(scope: IScope, handler: navigateHandler[TEntity]): Unit
  
  /**
    * viewPortKeyDown is raised when the viewPort receives a keyDown event.
    * Cells never get focus in uiGrid due to the difficulties of setting focus on a cell that is
    * not visible in the viewport. Use this event whenever you need a keydown event on a cell.
    * @param scope The grid scope
    * @param handler Callback
    */
  def viewPortKeyDown(scope: IScope, handler: viewportKeyDownHandler[TEntity]): Unit
  
  /**
    * viewPortKeyPress is raised when the viewPort receives a keyPress event.
    * Cells never get focus in uiGrid due to the difficulties of setting focus on a cell that is
    * not visible in the viewport. Use this event whenever you need a keypress event on a cell.
    * @param scope The grid scope
    * @param handler Callback
    */
  def viewPortKeyPress(scope: IScope, handler: viewportKeyPressHandler[TEntity]): Unit
}
object Navigate {
  
  inline def apply[TEntity](
    navigate: (IScope, navigateHandler[TEntity]) => Callback,
    viewPortKeyDown: (IScope, viewportKeyDownHandler[TEntity]) => Callback,
    viewPortKeyPress: (IScope, viewportKeyPressHandler[TEntity]) => Callback
  ): Navigate[TEntity] = {
    val __obj = js.Dynamic.literal(navigate = js.Any.fromFunction2((t0: IScope, t1: navigateHandler[TEntity]) => (navigate(t0, t1)).runNow()), viewPortKeyDown = js.Any.fromFunction2((t0: IScope, t1: viewportKeyDownHandler[TEntity]) => (viewPortKeyDown(t0, t1)).runNow()), viewPortKeyPress = js.Any.fromFunction2((t0: IScope, t1: viewportKeyPressHandler[TEntity]) => (viewPortKeyPress(t0, t1)).runNow()))
    __obj.asInstanceOf[Navigate[TEntity]]
  }
  
  extension [Self <: Navigate[?], TEntity](x: Self & Navigate[TEntity]) {
    
    inline def setNavigate(value: (IScope, navigateHandler[TEntity]) => Callback): Self = StObject.set(x, "navigate", js.Any.fromFunction2((t0: IScope, t1: navigateHandler[TEntity]) => (value(t0, t1)).runNow()))
    
    inline def setViewPortKeyDown(value: (IScope, viewportKeyDownHandler[TEntity]) => Callback): Self = StObject.set(x, "viewPortKeyDown", js.Any.fromFunction2((t0: IScope, t1: viewportKeyDownHandler[TEntity]) => (value(t0, t1)).runNow()))
    
    inline def setViewPortKeyPress(value: (IScope, viewportKeyPressHandler[TEntity]) => Callback): Self = StObject.set(x, "viewPortKeyPress", js.Any.fromFunction2((t0: IScope, t1: viewportKeyPressHandler[TEntity]) => (value(t0, t1)).runNow()))
  }
}
