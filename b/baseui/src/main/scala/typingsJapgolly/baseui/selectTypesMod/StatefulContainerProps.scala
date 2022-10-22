package typingsJapgolly.baseui.selectTypesMod

import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatefulContainerProps extends StObject {
  
  def children(a: SelectProps): Node
  
  var initialState: State
  
  def onChange(params: OnChangeParams): Any
  
  var overrides: SelectOverrides
  
  var stateReducer: StateReducer
}
object StatefulContainerProps {
  
  inline def apply(
    children: SelectProps => Node,
    initialState: State,
    onChange: OnChangeParams => Any,
    overrides: SelectOverrides,
    stateReducer: (/* stateType */ String, /* nextState */ State, /* currentState */ State) => State
  ): StatefulContainerProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), initialState = initialState.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), overrides = overrides.asInstanceOf[js.Any], stateReducer = js.Any.fromFunction3(stateReducer))
    __obj.asInstanceOf[StatefulContainerProps]
  }
  
  extension [Self <: StatefulContainerProps](x: Self) {
    
    inline def setChildren(value: SelectProps => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: OnChangeParams => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOverrides(value: SelectOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setStateReducer(value: (/* stateType */ String, /* nextState */ State, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
  }
}
