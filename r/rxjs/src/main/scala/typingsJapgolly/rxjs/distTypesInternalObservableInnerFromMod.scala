package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.distTypesInternalObservableMod.Observable
import typingsJapgolly.rxjs.distTypesInternalTypesMod.ObservableInput
import typingsJapgolly.rxjs.distTypesInternalTypesMod.ObservedValueOf
import typingsJapgolly.rxjs.distTypesInternalTypesMod.ReadableStreamLike
import typingsJapgolly.std.ArrayLike
import typingsJapgolly.std.AsyncIterable
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalObservableInnerFromMod {
  
  @JSImport("rxjs/dist/types/internal/observable/innerFrom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromArrayLike[T](array: ArrayLike[T]): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArrayLike")(array.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  
  inline def fromAsyncIterable[T](asyncIterable: AsyncIterable[T]): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAsyncIterable")(asyncIterable.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  
  inline def fromInteropObservable[T](obj: Any): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInteropObservable")(obj.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  
  inline def fromIterable[T](iterable: js.Iterable[T]): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIterable")(iterable.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  
  inline def fromPromise[T](promise: PromiseLike[T]): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPromise")(promise.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  
  inline def fromReadableStreamLike[T](readableStream: ReadableStreamLike[T]): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromReadableStreamLike")(readableStream.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  
  inline def innerFrom[O /* <: ObservableInput[Any] */](input: O): Observable[ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("innerFrom")(input.asInstanceOf[js.Any]).asInstanceOf[Observable[ObservedValueOf[O]]]
}
