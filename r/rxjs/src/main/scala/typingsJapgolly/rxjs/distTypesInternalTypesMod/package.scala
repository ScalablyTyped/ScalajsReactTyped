package typingsJapgolly.rxjs.distTypesInternalTypesMod

import typingsJapgolly.rxjs.distTypesInternalObservableMod.Observable
import typingsJapgolly.std.ArrayLike
import typingsJapgolly.std.AsyncIterable
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type FactoryOrValue[T] = T | js.Function0[T]

/* Rewritten from type alias, can be one of: 
  - scala.Null
  - scala.Unit
  - typingsJapgolly.rxjs.rxjsBooleans.`false`
  - typingsJapgolly.rxjs.rxjsInts.`0`
  - typingsJapgolly.rxjs.rxjsInts.`-0`
  - typingsJapgolly.rxjs.rxjsStrings._empty
*/
type Falsy = js.UndefOr[_Falsy | Null]

type MonoTypeOperatorFunction[T] = OperatorFunction[T, T]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.rxjs.distTypesInternalObservableMod.Observable[T]
  - typingsJapgolly.rxjs.distTypesInternalTypesMod.InteropObservable[T]
  - typingsJapgolly.std.AsyncIterable[T]
  - typingsJapgolly.std.PromiseLike[T]
  - typingsJapgolly.std.ArrayLike[T]
  - js.Iterable[T]
  - typingsJapgolly.rxjs.distTypesInternalTypesMod.ReadableStreamLike[T]
*/
type ObservableInput[T] = _ObservableInput[T] | AsyncIterable[T] | PromiseLike[T] | ArrayLike[T] | js.Iterable[T]

type ObservableLike[T] = InteropObservable[T]

type ObservedValuesFromArray[X] = ObservedValueUnionFromArray[X]

type OperatorFunction[T, R] = UnaryFunction[Observable[T], Observable[R]]

type SubscribableOrPromise[T] = (Subscribable[scala.Nothing | T]) | PromiseLike[T] | InteropObservable[T]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.rxjs.distTypesInternalSubscriptionMod.Subscription
  - typingsJapgolly.rxjs.distTypesInternalTypesMod.Unsubscribable
  - js.Function0[scala.Unit]
  - scala.Unit
*/
type TeardownLogic = _TeardownLogic | js.Function0[Unit] | Unit

type UnaryFunction[T, R] = js.Function1[/* source */ T, R]
