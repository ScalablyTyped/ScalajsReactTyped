package typingsJapgolly.reactQuery.typesCoreTypesMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactQuery.typesCoreMutationMod.MutationState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MutationObserverBaseResult[TData, TError, TVariables, TContext]
  extends StObject
     with MutationState[TData, TError, TVariables, TContext] {
  
  var isError: Boolean
  
  var isIdle: Boolean
  
  var isLoading: Boolean
  
  var isSuccess: Boolean
  
  var mutate: MutateFunction[TData, TError, TVariables, TContext]
  
  def reset(): Unit
}
object MutationObserverBaseResult {
  
  inline def apply[TData, TError, TVariables, TContext](
    failureCount: Double,
    isError: Boolean,
    isIdle: Boolean,
    isLoading: Boolean,
    isPaused: Boolean,
    isSuccess: Boolean,
    mutate: (TVariables, /* options */ js.UndefOr[MutateOptions[TData, TError, TVariables, TContext]]) => js.Promise[TData],
    reset: Callback,
    status: MutationStatus
  ): MutationObserverBaseResult[TData, TError, TVariables, TContext] = {
    val __obj = js.Dynamic.literal(failureCount = failureCount.asInstanceOf[js.Any], isError = isError.asInstanceOf[js.Any], isIdle = isIdle.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], isPaused = isPaused.asInstanceOf[js.Any], isSuccess = isSuccess.asInstanceOf[js.Any], mutate = js.Any.fromFunction2(mutate), reset = reset.toJsFn, status = status.asInstanceOf[js.Any], error = null)
    __obj.asInstanceOf[MutationObserverBaseResult[TData, TError, TVariables, TContext]]
  }
  
  extension [Self <: MutationObserverBaseResult[?, ?, ?, ?], TData, TError, TVariables, TContext](x: Self & (MutationObserverBaseResult[TData, TError, TVariables, TContext])) {
    
    inline def setIsError(value: Boolean): Self = StObject.set(x, "isError", value.asInstanceOf[js.Any])
    
    inline def setIsIdle(value: Boolean): Self = StObject.set(x, "isIdle", value.asInstanceOf[js.Any])
    
    inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    
    inline def setIsSuccess(value: Boolean): Self = StObject.set(x, "isSuccess", value.asInstanceOf[js.Any])
    
    inline def setMutate(
      value: (TVariables, /* options */ js.UndefOr[MutateOptions[TData, TError, TVariables, TContext]]) => js.Promise[TData]
    ): Self = StObject.set(x, "mutate", js.Any.fromFunction2(value))
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
  }
}
