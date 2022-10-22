package typingsJapgolly.slickgrid.Slick

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.slickgrid.Slick.Editors.Editor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorLock[T /* <: SlickData */] extends StObject {
  
  /***
    * Sets the specified edit controller as the active edit controller (acquire edit lock).
    * If another edit controller is already active, and exception will be thrown.
    * @method activate
    * @param editController {EditController} edit controller acquiring the lock
    */
  def activate(editController: Editor[T]): Unit
  
  /***
    * Attempts to cancel the current edit by calling "cancelCurrentEdit" method on the active edit
    * controller and returns whether the edit was successfully cancelled.  If no edit controller is
    * active, returns true.
    * @method cancelCurrentEdit
    * @return {Boolean}
    */
  def cancelCurrentEdit(): Boolean
  
  /***
    * Attempts to commit the current edit by calling "commitCurrentEdit" method on the active edit
    * controller and returns whether the commit attempt was successful (commit may fail due to validation
    * errors, etc.).  Edit controller's "commitCurrentEdit" must return true if the commit has succeeded
    * and false otherwise.  If no edit controller is active, returns true.
    * @method commitCurrentEdit
    * @return {Boolean}
    */
  def commitCurrentEdit(): Boolean
  
  /***
    * Unsets the specified edit controller as the active edit controller (release edit lock).
    * If the specified edit controller is not the active one, an exception will be thrown.
    * @method deactivate
    * @param editController {EditController} edit controller releasing the lock
    */
  def deactivate(editController: Editor[T]): Unit
  
  /***
    * Returns true if a specified edit controller is active (has the edit lock).
    * If the parameter is not specified, returns true if any edit controller is active.
    * @method isActive
    * @param editController {EditController}
    * @return {Boolean}
    */
  def isActive(editController: Editor[T]): Boolean
}
object EditorLock {
  
  inline def apply[T /* <: SlickData */](
    activate: Editor[T] => Callback,
    cancelCurrentEdit: CallbackTo[Boolean],
    commitCurrentEdit: CallbackTo[Boolean],
    deactivate: Editor[T] => Callback,
    isActive: Editor[T] => Boolean
  ): EditorLock[T] = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1((t0: Editor[T]) => activate(t0).runNow()), cancelCurrentEdit = cancelCurrentEdit.toJsFn, commitCurrentEdit = commitCurrentEdit.toJsFn, deactivate = js.Any.fromFunction1((t0: Editor[T]) => deactivate(t0).runNow()), isActive = js.Any.fromFunction1(isActive))
    __obj.asInstanceOf[EditorLock[T]]
  }
  
  extension [Self <: EditorLock[?], T /* <: SlickData */](x: Self & EditorLock[T]) {
    
    inline def setActivate(value: Editor[T] => Callback): Self = StObject.set(x, "activate", js.Any.fromFunction1((t0: Editor[T]) => value(t0).runNow()))
    
    inline def setCancelCurrentEdit(value: CallbackTo[Boolean]): Self = StObject.set(x, "cancelCurrentEdit", value.toJsFn)
    
    inline def setCommitCurrentEdit(value: CallbackTo[Boolean]): Self = StObject.set(x, "commitCurrentEdit", value.toJsFn)
    
    inline def setDeactivate(value: Editor[T] => Callback): Self = StObject.set(x, "deactivate", js.Any.fromFunction1((t0: Editor[T]) => value(t0).runNow()))
    
    inline def setIsActive(value: Editor[T] => Boolean): Self = StObject.set(x, "isActive", js.Any.fromFunction1(value))
  }
}
