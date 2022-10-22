package typingsJapgolly.recoil.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.recoil.recoilStrings.hasValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueLoadable[T]
  extends StObject
     with BaseLoadable[T]
     with Loadable[T] {
  
  var contents: T
  
  def errorMaybe(): Unit
  
  def promiseMaybe(): Unit
  
  var state: hasValue
  
  def valueMaybe(): T
}
object ValueLoadable {
  
  inline def apply[T](
    contents: T,
    errorMaybe: Callback,
    errorOrThrow: CallbackTo[Any],
    getValue: CallbackTo[T],
    is: Loadable[Any] => Boolean,
    map: js.Function1[T, Loadable[Any] | js.Promise[Any] | Any] => Loadable[Any],
    promiseMaybe: Callback,
    promiseOrThrow: CallbackTo[js.Promise[T]],
    toPromise: CallbackTo[js.Promise[T]],
    valueMaybe: CallbackTo[T],
    valueOrThrow: CallbackTo[T]
  ): ValueLoadable[T] = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], errorMaybe = errorMaybe.toJsFn, errorOrThrow = errorOrThrow.toJsFn, getValue = getValue.toJsFn, is = js.Any.fromFunction1(is), map = js.Any.fromFunction1(map), promiseMaybe = promiseMaybe.toJsFn, promiseOrThrow = promiseOrThrow.toJsFn, state = "hasValue", toPromise = toPromise.toJsFn, valueMaybe = valueMaybe.toJsFn, valueOrThrow = valueOrThrow.toJsFn)
    __obj.asInstanceOf[ValueLoadable[T]]
  }
  
  extension [Self <: ValueLoadable[?], T](x: Self & ValueLoadable[T]) {
    
    inline def setContents(value: T): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setErrorMaybe(value: Callback): Self = StObject.set(x, "errorMaybe", value.toJsFn)
    
    inline def setPromiseMaybe(value: Callback): Self = StObject.set(x, "promiseMaybe", value.toJsFn)
    
    inline def setState(value: hasValue): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setValueMaybe(value: CallbackTo[T]): Self = StObject.set(x, "valueMaybe", value.toJsFn)
  }
}
