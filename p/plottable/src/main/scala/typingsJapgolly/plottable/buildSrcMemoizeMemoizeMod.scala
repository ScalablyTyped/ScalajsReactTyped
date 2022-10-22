package typingsJapgolly.plottable

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcMemoizeMemoizeMod {
  
  @JSImport("plottable/build/src/memoize/memoize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def memoize[F /* <: js.Function */](compute: F): MemoizedFunction[F] = ^.asInstanceOf[js.Dynamic].applyDynamic("memoize")(compute.asInstanceOf[js.Any]).asInstanceOf[MemoizedFunction[F]]
  
  trait IMemoizedFunctionMethods extends StObject {
    
    /**
      * Lock the memoization to always return the cached
      * property during the duration of fn. This lets you
      * bypass the performance hit of signing when you
      * know the fn will not mutate the inputs.
      *
      * Be sure to force the memoization to the value
      * you want before calling this!
      *
      * @param fn
      */
    def doLocked[T](fn: js.Function0[T]): T
    
    /**
      * Turn on perf logging. Useful for debugging.
      */
    def logPerformance(): this.type
  }
  object IMemoizedFunctionMethods {
    
    inline def apply(doLocked: js.Function0[Any] => Any, logPerformance: CallbackTo[IMemoizedFunctionMethods]): IMemoizedFunctionMethods = {
      val __obj = js.Dynamic.literal(doLocked = js.Any.fromFunction1(doLocked), logPerformance = logPerformance.toJsFn)
      __obj.asInstanceOf[IMemoizedFunctionMethods]
    }
    
    extension [Self <: IMemoizedFunctionMethods](x: Self) {
      
      inline def setDoLocked(value: js.Function0[Any] => Any): Self = StObject.set(x, "doLocked", js.Any.fromFunction1(value))
      
      inline def setLogPerformance(value: CallbackTo[IMemoizedFunctionMethods]): Self = StObject.set(x, "logPerformance", value.toJsFn)
    }
  }
  
  type MemoizedFunction[F /* <: js.Function */] = F & IMemoizedFunctionMethods
}
