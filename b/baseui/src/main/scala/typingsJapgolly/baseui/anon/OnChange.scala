package typingsJapgolly.baseui.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.baseui.pinCodeTypesMod.StateChange
import typingsJapgolly.baseui.pinCodeTypesMod.StatefulPinCodeContainerState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnChange extends StObject {
  
  var initialState: Values
  
  def onChange(): Unit
  
  var stateReducer: typingsJapgolly.baseui.pinCodeTypesMod.StateReducer
}
object OnChange {
  
  inline def apply(
    initialState: Values,
    onChange: Callback,
    stateReducer: (/* type */ StateChange, /* nextState */ StatefulPinCodeContainerState, /* currentState */ StatefulPinCodeContainerState) => StatefulPinCodeContainerState
  ): OnChange = {
    val __obj = js.Dynamic.literal(initialState = initialState.asInstanceOf[js.Any], onChange = onChange.toJsFn, stateReducer = js.Any.fromFunction3(stateReducer))
    __obj.asInstanceOf[OnChange]
  }
  
  extension [Self <: OnChange](x: Self) {
    
    inline def setInitialState(value: Values): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: Callback): Self = StObject.set(x, "onChange", value.toJsFn)
    
    inline def setStateReducer(
      value: (/* type */ StateChange, /* nextState */ StatefulPinCodeContainerState, /* currentState */ StatefulPinCodeContainerState) => StatefulPinCodeContainerState
    ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
  }
}
