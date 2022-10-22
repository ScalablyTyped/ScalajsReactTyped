package typingsJapgolly.shakacodeRecompose

import typingsJapgolly.shakacodeRecompose.mod.InferableComponentEnhancerWithProps
import typingsJapgolly.shakacodeRecompose.mod.StateHandlerMap
import typingsJapgolly.shakacodeRecompose.mod.StateUpdaters
import typingsJapgolly.shakacodeRecompose.mod.mapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/shakacode/recompose/blob/master/docs/API.md#withstatehandlers
object withStateHandlersMod {
  
  @JSImport("@shakacode/recompose/withStateHandlers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TState, TUpdaters /* <: StateHandlerMap[TState] */, TOutter](createProps: TState, stateUpdaters: StateUpdaters[TOutter, TState, TUpdaters]): InferableComponentEnhancerWithProps[TOutter & TState & TUpdaters, TOutter] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(createProps.asInstanceOf[js.Any], stateUpdaters.asInstanceOf[js.Any])).asInstanceOf[InferableComponentEnhancerWithProps[TOutter & TState & TUpdaters, TOutter]]
  inline def default[TState, TUpdaters /* <: StateHandlerMap[TState] */, TOutter](createProps: mapper[TOutter, TState], stateUpdaters: StateUpdaters[TOutter, TState, TUpdaters]): InferableComponentEnhancerWithProps[TOutter & TState & TUpdaters, TOutter] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(createProps.asInstanceOf[js.Any], stateUpdaters.asInstanceOf[js.Any])).asInstanceOf[InferableComponentEnhancerWithProps[TOutter & TState & TUpdaters, TOutter]]
}
