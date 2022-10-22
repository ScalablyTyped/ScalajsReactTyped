package typingsJapgolly.reactNativeReanimated.mod.Animated

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimatedValue[T /* <: Value */]
  extends StObject
     with AnimatedNode[T] {
  
  def interpolate(config: InterpolationConfig): AnimatedNode[Double]
  
  def setValue(value: Adaptable[T]): Unit
}
object AnimatedValue {
  
  inline def apply[T /* <: Value */](
    Space__value: T,
    interpolate: InterpolationConfig => AnimatedNode[Double],
    isNativelyInitialized: CallbackTo[Boolean],
    setValue: Adaptable[T] => Callback
  ): AnimatedValue[T] = {
    val __obj = js.Dynamic.literal(interpolate = js.Any.fromFunction1(interpolate), isNativelyInitialized = isNativelyInitialized.toJsFn, setValue = js.Any.fromFunction1((t0: Adaptable[T]) => setValue(t0).runNow()))
    __obj.updateDynamic(" __value")(Space__value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedValue[T]]
  }
  
  extension [Self <: AnimatedValue[?], T /* <: Value */](x: Self & AnimatedValue[T]) {
    
    inline def setInterpolate(value: InterpolationConfig => AnimatedNode[Double]): Self = StObject.set(x, "interpolate", js.Any.fromFunction1(value))
    
    inline def setSetValue(value: Adaptable[T] => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction1((t0: Adaptable[T]) => value(t0).runNow()))
  }
}
