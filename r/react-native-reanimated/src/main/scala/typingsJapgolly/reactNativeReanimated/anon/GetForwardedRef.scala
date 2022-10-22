package typingsJapgolly.reactNativeReanimated.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.MutableRefObject
import typingsJapgolly.reactNativeReanimated.libTypesSetAndForwardRefMod.ForwardedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetForwardedRef[T] extends StObject {
  
  var getForwardedRef: ForwardedRef[T]
  
  def setLocalRef(ref: T): Unit
}
object GetForwardedRef {
  
  inline def apply[T](
    getForwardedRef: CallbackTo[MutableRefObject[T] | (js.Function1[T, Unit])],
    setLocalRef: T => Callback
  ): GetForwardedRef[T] = {
    val __obj = js.Dynamic.literal(getForwardedRef = getForwardedRef.toJsFn, setLocalRef = js.Any.fromFunction1((t0: T) => setLocalRef(t0).runNow()))
    __obj.asInstanceOf[GetForwardedRef[T]]
  }
  
  extension [Self <: GetForwardedRef[?], T](x: Self & GetForwardedRef[T]) {
    
    inline def setGetForwardedRef(value: CallbackTo[MutableRefObject[T] | (js.Function1[T, Unit])]): Self = StObject.set(x, "getForwardedRef", value.toJsFn)
    
    inline def setSetLocalRef(value: T => Callback): Self = StObject.set(x, "setLocalRef", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
  }
}
