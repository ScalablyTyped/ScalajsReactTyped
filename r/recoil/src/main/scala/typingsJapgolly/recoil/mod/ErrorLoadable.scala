package typingsJapgolly.recoil.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.recoil.recoilStrings.hasError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorLoadable[T]
  extends StObject
     with BaseLoadable[T]
     with Loadable[T] {
  
  var contents: Any
  
  def errorMaybe(): Any
  
  def promiseMaybe(): Unit
  
  var state: hasError
  
  def valueMaybe(): Unit
}
object ErrorLoadable {
  
  inline def apply[T](
    contents: Any,
    errorMaybe: CallbackTo[Any],
    errorOrThrow: CallbackTo[Any],
    getValue: CallbackTo[T],
    is: Loadable[Any] => Boolean,
    map: js.Function1[T, Loadable[Any] | js.Promise[Any] | Any] => Loadable[Any],
    promiseMaybe: Callback,
    promiseOrThrow: CallbackTo[js.Promise[T]],
    toPromise: CallbackTo[js.Promise[T]],
    valueMaybe: Callback,
    valueOrThrow: CallbackTo[T]
  ): ErrorLoadable[T] = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], errorMaybe = errorMaybe.toJsFn, errorOrThrow = errorOrThrow.toJsFn, getValue = getValue.toJsFn, is = js.Any.fromFunction1(is), map = js.Any.fromFunction1(map), promiseMaybe = promiseMaybe.toJsFn, promiseOrThrow = promiseOrThrow.toJsFn, state = "hasError", toPromise = toPromise.toJsFn, valueMaybe = valueMaybe.toJsFn, valueOrThrow = valueOrThrow.toJsFn)
    __obj.asInstanceOf[ErrorLoadable[T]]
  }
  
  extension [Self <: ErrorLoadable[?], T](x: Self & ErrorLoadable[T]) {
    
    inline def setContents(value: Any): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setErrorMaybe(value: CallbackTo[Any]): Self = StObject.set(x, "errorMaybe", value.toJsFn)
    
    inline def setPromiseMaybe(value: Callback): Self = StObject.set(x, "promiseMaybe", value.toJsFn)
    
    inline def setState(value: hasError): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setValueMaybe(value: Callback): Self = StObject.set(x, "valueMaybe", value.toJsFn)
  }
}
