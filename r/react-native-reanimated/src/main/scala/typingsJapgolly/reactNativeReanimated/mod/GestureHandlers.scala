package typingsJapgolly.reactNativeReanimated.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GestureHandlers[T, TContext /* <: Context */] extends StObject {
  
  var onActive: js.UndefOr[Handler[T, TContext]] = js.undefined
  
  var onCancel: js.UndefOr[Handler[T, TContext]] = js.undefined
  
  var onEnd: js.UndefOr[Handler[T, TContext]] = js.undefined
  
  var onFail: js.UndefOr[Handler[T, TContext]] = js.undefined
  
  var onFinish: js.UndefOr[
    js.Function3[/* event */ T, /* context */ TContext, /* isCanceledOrFailed */ Boolean, Unit]
  ] = js.undefined
  
  var onStart: js.UndefOr[Handler[T, TContext]] = js.undefined
}
object GestureHandlers {
  
  inline def apply[T, TContext /* <: Context */](): GestureHandlers[T, TContext] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GestureHandlers[T, TContext]]
  }
  
  extension [Self <: GestureHandlers[?, ?], T, TContext /* <: Context */](x: Self & (GestureHandlers[T, TContext])) {
    
    inline def setOnActive(value: (T, TContext) => Callback): Self = StObject.set(x, "onActive", js.Any.fromFunction2((t0: T, t1: TContext) => (value(t0, t1)).runNow()))
    
    inline def setOnActiveUndefined: Self = StObject.set(x, "onActive", js.undefined)
    
    inline def setOnCancel(value: (T, TContext) => Callback): Self = StObject.set(x, "onCancel", js.Any.fromFunction2((t0: T, t1: TContext) => (value(t0, t1)).runNow()))
    
    inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
    
    inline def setOnEnd(value: (T, TContext) => Callback): Self = StObject.set(x, "onEnd", js.Any.fromFunction2((t0: T, t1: TContext) => (value(t0, t1)).runNow()))
    
    inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
    
    inline def setOnFail(value: (T, TContext) => Callback): Self = StObject.set(x, "onFail", js.Any.fromFunction2((t0: T, t1: TContext) => (value(t0, t1)).runNow()))
    
    inline def setOnFailUndefined: Self = StObject.set(x, "onFail", js.undefined)
    
    inline def setOnFinish(value: (/* event */ T, /* context */ TContext, /* isCanceledOrFailed */ Boolean) => Callback): Self = StObject.set(x, "onFinish", js.Any.fromFunction3((t0: /* event */ T, t1: /* context */ TContext, t2: /* isCanceledOrFailed */ Boolean) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnFinishUndefined: Self = StObject.set(x, "onFinish", js.undefined)
    
    inline def setOnStart(value: (T, TContext) => Callback): Self = StObject.set(x, "onStart", js.Any.fromFunction2((t0: T, t1: TContext) => (value(t0, t1)).runNow()))
    
    inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
  }
}
