package typingsJapgolly.shakacodeRecompose

import typingsJapgolly.shakacodeRecompose.mod.InferableComponentEnhancerWithProps
import typingsJapgolly.shakacodeRecompose.mod.mapper
import typingsJapgolly.shakacodeRecompose.mod.reducer
import typingsJapgolly.shakacodeRecompose.mod.reducerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/shakacode/recompose/blob/master/docs/API.md#withreducer
object withReducerMod {
  
  @JSImport("@shakacode/recompose/withReducer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TOutter, TState, TAction, TStateName /* <: String */, TDispatchName /* <: String */](
    stateName: TStateName,
    dispatchName: TDispatchName,
    reducer: reducer[TState, TAction],
    initialState: TState
  ): InferableComponentEnhancerWithProps[reducerProps[TState, TAction, TStateName, TDispatchName], TOutter] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(stateName.asInstanceOf[js.Any], dispatchName.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[InferableComponentEnhancerWithProps[reducerProps[TState, TAction, TStateName, TDispatchName], TOutter]]
  inline def default[TOutter, TState, TAction, TStateName /* <: String */, TDispatchName /* <: String */](
    stateName: TStateName,
    dispatchName: TDispatchName,
    reducer: reducer[TState, TAction],
    initialState: mapper[TOutter, TState]
  ): InferableComponentEnhancerWithProps[reducerProps[TState, TAction, TStateName, TDispatchName], TOutter] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(stateName.asInstanceOf[js.Any], dispatchName.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[InferableComponentEnhancerWithProps[reducerProps[TState, TAction, TStateName, TDispatchName], TOutter]]
}
