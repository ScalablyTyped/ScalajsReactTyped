package typingsJapgolly.baseui.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.baseui.phoneInputTypesMod.State
import typingsJapgolly.baseui.phoneInputTypesMod.StateChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnCountryChange extends StObject {
  
  var initialState: Country
  
  def onCountryChange(): Unit
  
  def onTextChange(): Unit
  
  var stateReducer: typingsJapgolly.baseui.phoneInputTypesMod.StateReducer
}
object OnCountryChange {
  
  inline def apply(
    initialState: Country,
    onCountryChange: Callback,
    onTextChange: Callback,
    stateReducer: (/* type */ StateChange, /* nextState */ PartialState, /* currentState */ State) => State
  ): OnCountryChange = {
    val __obj = js.Dynamic.literal(initialState = initialState.asInstanceOf[js.Any], onCountryChange = onCountryChange.toJsFn, onTextChange = onTextChange.toJsFn, stateReducer = js.Any.fromFunction3(stateReducer))
    __obj.asInstanceOf[OnCountryChange]
  }
  
  extension [Self <: OnCountryChange](x: Self) {
    
    inline def setInitialState(value: Country): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    inline def setOnCountryChange(value: Callback): Self = StObject.set(x, "onCountryChange", value.toJsFn)
    
    inline def setOnTextChange(value: Callback): Self = StObject.set(x, "onTextChange", value.toJsFn)
    
    inline def setStateReducer(value: (/* type */ StateChange, /* nextState */ PartialState, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
  }
}
