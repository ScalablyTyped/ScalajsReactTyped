package typingsJapgolly.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Tracks the parent object for complex editors by exposing it as an object reference via editorState.current.entity
  * it is possible to modify this object, so should be used with care
  */
trait IEditorState extends StObject {
  
  var current: Any
  
  var state: IState
}
object IEditorState {
  
  inline def apply(current: Any, state: IState): IEditorState = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditorState]
  }
  
  extension [Self <: IEditorState](x: Self) {
    
    inline def setCurrent(value: Any): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setState(value: IState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
