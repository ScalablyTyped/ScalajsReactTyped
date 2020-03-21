package typingsJapgolly.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type FactoryOrValue[T] = T | js.Function0[T]
  type MonoTypeOperatorFunction[T] = typingsJapgolly.rxjs.typesMod.OperatorFunction[T, T]
  type ObservableInput[T] = typingsJapgolly.rxjs.typesMod.SubscribableOrPromise[T] | typingsJapgolly.std.ArrayLike[T] | js.Iterable[T]
  type ObservableLike[T] = typingsJapgolly.rxjs.typesMod.InteropObservable[T]
  type ObservedValueOf[O] = js.Any
  type ObservedValuesFromArray[X] = js.Any
  type OperatorFunction[T, R] = typingsJapgolly.rxjs.typesMod.UnaryFunction[
    typingsJapgolly.rxjs.internalObservableMod.Observable[T], 
    typingsJapgolly.rxjs.internalObservableMod.Observable[R]
  ]
  type SubscribableOrPromise[T] = (typingsJapgolly.rxjs.typesMod.Subscribable[scala.Nothing | T]) | js.Thenable[T] | typingsJapgolly.rxjs.typesMod.InteropObservable[T]
  type TeardownLogic = typingsJapgolly.rxjs.typesMod.Unsubscribable | js.Function | scala.Unit
  type UnaryFunction[T, R] = js.Function1[/* source */ T, R]
}
