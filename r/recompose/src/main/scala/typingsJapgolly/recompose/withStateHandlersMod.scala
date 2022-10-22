package typingsJapgolly.recompose

import typingsJapgolly.recompose.mod.InferableComponentEnhancerWithProps
import typingsJapgolly.recompose.mod.StateHandlerMap
import typingsJapgolly.recompose.mod.StateUpdaters
import typingsJapgolly.recompose.mod.mapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#withstatehandlers
object withStateHandlersMod {
  
  @JSImport("recompose/withStateHandlers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TState, TUpdaters /* <: StateHandlerMap[TState] */, TOutter](createProps: TState, stateUpdaters: StateUpdaters[TOutter, TState, TUpdaters]): InferableComponentEnhancerWithProps[TOutter & TState & TUpdaters, TOutter] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(createProps.asInstanceOf[js.Any], stateUpdaters.asInstanceOf[js.Any])).asInstanceOf[InferableComponentEnhancerWithProps[TOutter & TState & TUpdaters, TOutter]]
  inline def default[TState, TUpdaters /* <: StateHandlerMap[TState] */, TOutter](createProps: mapper[TOutter, TState], stateUpdaters: StateUpdaters[TOutter, TState, TUpdaters]): InferableComponentEnhancerWithProps[TOutter & TState & TUpdaters, TOutter] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(createProps.asInstanceOf[js.Any], stateUpdaters.asInstanceOf[js.Any])).asInstanceOf[InferableComponentEnhancerWithProps[TOutter & TState & TUpdaters, TOutter]]
}
