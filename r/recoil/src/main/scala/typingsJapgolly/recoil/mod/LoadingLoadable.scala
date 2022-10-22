package typingsJapgolly.recoil.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.recoil.recoilStrings.loading
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadingLoadable[T]
  extends StObject
     with BaseLoadable[T]
     with Loadable[T] {
  
  var contents: js.Promise[T]
  
  def errorMaybe(): Unit
  
  def promiseMaybe(): js.Promise[T]
  
  var state: loading
  
  def valueMaybe(): Unit
}
object LoadingLoadable {
  
  inline def apply[T](
    contents: js.Promise[T],
    errorMaybe: Callback,
    errorOrThrow: CallbackTo[Any],
    getValue: CallbackTo[T],
    is: Loadable[Any] => Boolean,
    map: js.Function1[T, Loadable[Any] | js.Promise[Any] | Any] => Loadable[Any],
    promiseMaybe: CallbackTo[js.Promise[T]],
    promiseOrThrow: CallbackTo[js.Promise[T]],
    toPromise: CallbackTo[js.Promise[T]],
    valueMaybe: Callback,
    valueOrThrow: CallbackTo[T]
  ): LoadingLoadable[T] = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], errorMaybe = errorMaybe.toJsFn, errorOrThrow = errorOrThrow.toJsFn, getValue = getValue.toJsFn, is = js.Any.fromFunction1(is), map = js.Any.fromFunction1(map), promiseMaybe = promiseMaybe.toJsFn, promiseOrThrow = promiseOrThrow.toJsFn, state = "loading", toPromise = toPromise.toJsFn, valueMaybe = valueMaybe.toJsFn, valueOrThrow = valueOrThrow.toJsFn)
    __obj.asInstanceOf[LoadingLoadable[T]]
  }
  
  extension [Self <: LoadingLoadable[?], T](x: Self & LoadingLoadable[T]) {
    
    inline def setContents(value: js.Promise[T]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setErrorMaybe(value: Callback): Self = StObject.set(x, "errorMaybe", value.toJsFn)
    
    inline def setPromiseMaybe(value: CallbackTo[js.Promise[T]]): Self = StObject.set(x, "promiseMaybe", value.toJsFn)
    
    inline def setState(value: loading): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setValueMaybe(value: Callback): Self = StObject.set(x, "valueMaybe", value.toJsFn)
  }
}
