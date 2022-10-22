package typingsJapgolly.rxjsCompat

import typingsJapgolly.rxjs.distTypesInternalObservableMod.Observable
import typingsJapgolly.rxjs.distTypesInternalTypesMod.InteropObservable
import typingsJapgolly.rxjs.distTypesInternalTypesMod.ObservedValueOf
import typingsJapgolly.rxjs.distTypesInternalTypesMod.OperatorFunction
import typingsJapgolly.rxjs.distTypesInternalTypesMod.ReadableStreamLike
import typingsJapgolly.std.ArrayLike
import typingsJapgolly.std.AsyncIterable
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsSwitchMapToMod {
  
  @JSImport("rxjs-compat/operators/switchMapTo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def switchMapTo(observable: js.Iterable[Any]): OperatorFunction[Any, ObservedValueOf[js.Iterable[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[js.Iterable[Any]]]]
  inline def switchMapTo(observable: js.Iterable[Any], resultSelector: Unit): OperatorFunction[Any, ObservedValueOf[js.Iterable[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[js.Iterable[Any]]]]
  inline def switchMapTo(observable: Observable[Any]): OperatorFunction[Any, ObservedValueOf[Observable[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[Observable[Any]]]]
  inline def switchMapTo(observable: Observable[Any], resultSelector: Unit): OperatorFunction[Any, ObservedValueOf[Observable[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[Observable[Any]]]]
  inline def switchMapTo(observable: InteropObservable[Any]): OperatorFunction[Any, ObservedValueOf[InteropObservable[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[InteropObservable[Any]]]]
  inline def switchMapTo(observable: InteropObservable[Any], resultSelector: Unit): OperatorFunction[Any, ObservedValueOf[InteropObservable[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[InteropObservable[Any]]]]
  inline def switchMapTo(observable: ReadableStreamLike[Any]): OperatorFunction[Any, ObservedValueOf[ReadableStreamLike[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[ReadableStreamLike[Any]]]]
  inline def switchMapTo(observable: ReadableStreamLike[Any], resultSelector: Unit): OperatorFunction[Any, ObservedValueOf[ReadableStreamLike[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[ReadableStreamLike[Any]]]]
  inline def switchMapTo(observable: ArrayLike[Any]): OperatorFunction[Any, ObservedValueOf[ArrayLike[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[ArrayLike[Any]]]]
  inline def switchMapTo(observable: ArrayLike[Any], resultSelector: Unit): OperatorFunction[Any, ObservedValueOf[ArrayLike[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[ArrayLike[Any]]]]
  inline def switchMapTo(observable: AsyncIterable[Any]): OperatorFunction[Any, ObservedValueOf[AsyncIterable[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[AsyncIterable[Any]]]]
  inline def switchMapTo(observable: AsyncIterable[Any], resultSelector: Unit): OperatorFunction[Any, ObservedValueOf[AsyncIterable[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[AsyncIterable[Any]]]]
  inline def switchMapTo(observable: PromiseLike[Any]): OperatorFunction[Any, ObservedValueOf[PromiseLike[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[PromiseLike[Any]]]]
  inline def switchMapTo(observable: PromiseLike[Any], resultSelector: Unit): OperatorFunction[Any, ObservedValueOf[PromiseLike[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[PromiseLike[Any]]]]
  inline def switchMapTo[T, R](
    observable: js.Iterable[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[js.Iterable[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def switchMapTo[T, R](
    observable: Observable[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[Observable[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def switchMapTo[T, R](
    observable: InteropObservable[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[InteropObservable[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def switchMapTo[T, R](
    observable: ReadableStreamLike[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[ReadableStreamLike[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def switchMapTo[T, R](
    observable: ArrayLike[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[ArrayLike[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def switchMapTo[T, R](
    observable: AsyncIterable[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[AsyncIterable[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def switchMapTo[T, R](
    observable: PromiseLike[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[PromiseLike[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
}
