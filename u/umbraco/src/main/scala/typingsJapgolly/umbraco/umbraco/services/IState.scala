package typingsJapgolly.umbraco.umbraco.services

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*Tracks the parent object for complex editors by exposing it as an object reference via editorState.current.entity
  * it is possible to modify this object, so should be used with care */
trait IState extends StObject {
  
  /**
    * @ngdoc function
    * @name umbraco.services.angularHelper#getCurrent
    * @methodOf umbraco.services.editorState
    * @function
    *
    * @description
    * Returns an object reference to the current editor entity.
    * the entity is the root object of the editor.
    * EditorState is used by property/parameter editors that need
    * access to the entire entity being edited, not just the property/parameter
    *
    * editorState.current can not be overwritten, you should only read values from it
    * since modifying individual properties should be handled by the property editors
    */
  def getCurrent(): Any
  
  /**
    * @ngdoc function
    * @name umbraco.services.angularHelper#reset
    * @methodOf umbraco.services.editorState
    * @function
    *
    * @description
    * Since the editorstate entity is read-only, you cannot set it to null
    * only through the reset() method
    */
  def reset(): Unit
  
  /**
    * @ngdoc function
    * @name umbraco.services.angularHelper#set
    * @methodOf umbraco.services.editorState
    * @function
    *
    * @description
    * Sets the current entity object for the currently active editor
    * This is only used when implementing an editor with a complex model
    * like the content editor, where the model is modified by several
    * child controllers.
    */
  def set(entity: js.Object): Unit
}
object IState {
  
  inline def apply(getCurrent: CallbackTo[Any], reset: Callback, set: js.Object => Callback): IState = {
    val __obj = js.Dynamic.literal(getCurrent = getCurrent.toJsFn, reset = reset.toJsFn, set = js.Any.fromFunction1((t0: js.Object) => set(t0).runNow()))
    __obj.asInstanceOf[IState]
  }
  
  extension [Self <: IState](x: Self) {
    
    inline def setGetCurrent(value: CallbackTo[Any]): Self = StObject.set(x, "getCurrent", value.toJsFn)
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setSet(value: js.Object => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
  }
}
