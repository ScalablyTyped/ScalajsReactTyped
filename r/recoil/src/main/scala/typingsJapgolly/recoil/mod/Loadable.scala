package typingsJapgolly.recoil.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.recoil.mod.ValueLoadable[T]
  - typingsJapgolly.recoil.mod.LoadingLoadable[T]
  - typingsJapgolly.recoil.mod.ErrorLoadable[T]
*/
trait Loadable[T] extends StObject
object Loadable {
  
  inline def ErrorLoadable[T](
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
  ): typingsJapgolly.recoil.mod.ErrorLoadable[T] = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], errorMaybe = errorMaybe.toJsFn, errorOrThrow = errorOrThrow.toJsFn, getValue = getValue.toJsFn, is = js.Any.fromFunction1(is), map = js.Any.fromFunction1(map), promiseMaybe = promiseMaybe.toJsFn, promiseOrThrow = promiseOrThrow.toJsFn, state = "hasError", toPromise = toPromise.toJsFn, valueMaybe = valueMaybe.toJsFn, valueOrThrow = valueOrThrow.toJsFn)
    __obj.asInstanceOf[typingsJapgolly.recoil.mod.ErrorLoadable[T]]
  }
  
  inline def LoadingLoadable[T](
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
  ): typingsJapgolly.recoil.mod.LoadingLoadable[T] = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], errorMaybe = errorMaybe.toJsFn, errorOrThrow = errorOrThrow.toJsFn, getValue = getValue.toJsFn, is = js.Any.fromFunction1(is), map = js.Any.fromFunction1(map), promiseMaybe = promiseMaybe.toJsFn, promiseOrThrow = promiseOrThrow.toJsFn, state = "loading", toPromise = toPromise.toJsFn, valueMaybe = valueMaybe.toJsFn, valueOrThrow = valueOrThrow.toJsFn)
    __obj.asInstanceOf[typingsJapgolly.recoil.mod.LoadingLoadable[T]]
  }
  
  inline def ValueLoadable[T](
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
  ): typingsJapgolly.recoil.mod.ValueLoadable[T] = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], errorMaybe = errorMaybe.toJsFn, errorOrThrow = errorOrThrow.toJsFn, getValue = getValue.toJsFn, is = js.Any.fromFunction1(is), map = js.Any.fromFunction1(map), promiseMaybe = promiseMaybe.toJsFn, promiseOrThrow = promiseOrThrow.toJsFn, state = "hasValue", toPromise = toPromise.toJsFn, valueMaybe = valueMaybe.toJsFn, valueOrThrow = valueOrThrow.toJsFn)
    __obj.asInstanceOf[typingsJapgolly.recoil.mod.ValueLoadable[T]]
  }
}
