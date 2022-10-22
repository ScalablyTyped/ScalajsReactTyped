package typingsJapgolly.recoil.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// loadable.d.ts
trait BaseLoadable[T] extends StObject {
  
  def errorOrThrow(): Any
  
  def getValue(): T
  
  def is(other: Loadable[Any]): Boolean
  
  def map[S](map: js.Function1[/* from */ T, Loadable[S] | js.Promise[S] | S]): Loadable[S]
  
  def promiseOrThrow(): js.Promise[T]
  
  def toPromise(): js.Promise[T]
  
  def valueOrThrow(): T
}
object BaseLoadable {
  
  inline def apply[T](
    errorOrThrow: CallbackTo[Any],
    getValue: CallbackTo[T],
    is: Loadable[Any] => Boolean,
    map: js.Function1[/* from */ T, Loadable[Any] | js.Promise[Any] | Any] => Loadable[Any],
    promiseOrThrow: CallbackTo[js.Promise[T]],
    toPromise: CallbackTo[js.Promise[T]],
    valueOrThrow: CallbackTo[T]
  ): BaseLoadable[T] = {
    val __obj = js.Dynamic.literal(errorOrThrow = errorOrThrow.toJsFn, getValue = getValue.toJsFn, is = js.Any.fromFunction1(is), map = js.Any.fromFunction1(map), promiseOrThrow = promiseOrThrow.toJsFn, toPromise = toPromise.toJsFn, valueOrThrow = valueOrThrow.toJsFn)
    __obj.asInstanceOf[BaseLoadable[T]]
  }
  
  extension [Self <: BaseLoadable[?], T](x: Self & BaseLoadable[T]) {
    
    inline def setErrorOrThrow(value: CallbackTo[Any]): Self = StObject.set(x, "errorOrThrow", value.toJsFn)
    
    inline def setGetValue(value: CallbackTo[T]): Self = StObject.set(x, "getValue", value.toJsFn)
    
    inline def setIs(value: Loadable[Any] => Boolean): Self = StObject.set(x, "is", js.Any.fromFunction1(value))
    
    inline def setMap(value: js.Function1[/* from */ T, Loadable[Any] | js.Promise[Any] | Any] => Loadable[Any]): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
    
    inline def setPromiseOrThrow(value: CallbackTo[js.Promise[T]]): Self = StObject.set(x, "promiseOrThrow", value.toJsFn)
    
    inline def setToPromise(value: CallbackTo[js.Promise[T]]): Self = StObject.set(x, "toPromise", value.toJsFn)
    
    inline def setValueOrThrow(value: CallbackTo[T]): Self = StObject.set(x, "valueOrThrow", value.toJsFn)
  }
}
