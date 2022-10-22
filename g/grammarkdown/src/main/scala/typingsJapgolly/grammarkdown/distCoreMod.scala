package typingsJapgolly.grammarkdown

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.esfxAsyncCanceltoken.mod.CancelToken
import typingsJapgolly.esfxCancelable.mod.Cancelable
import typingsJapgolly.grammarkdown.anon.Dispose
import typingsJapgolly.grammarkdown.grammarkdownInts.`-1`
import typingsJapgolly.grammarkdown.grammarkdownInts.`0`
import typingsJapgolly.grammarkdown.grammarkdownInts.`1`
import typingsJapgolly.std.IterableIterator
import typingsJapgolly.std.Map
import typingsJapgolly.std.PromiseLike
import typingsJapgolly.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreMod {
  
  @JSImport("grammarkdown/dist/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("grammarkdown/dist/core", "AggregateCancelable")
  @js.native
  open class AggregateCancelable () extends StObject {
    
    /* private */ var _cancelCount: Any = js.native
    
    /* private */ var _cancelSource: Any = js.native
    
    /* private */ var _subscriptions: Any = js.native
    
    def addCancelable(): js.UndefOr[Dispose] = js.native
    def addCancelable(cancelable: Cancelable): js.UndefOr[Dispose] = js.native
    
    def canBeCanceled: Boolean = js.native
    
    def cancelable: CancelToken = js.native
  }
  
  @JSImport("grammarkdown/dist/core", "SharedOperation")
  @js.native
  open class SharedOperation[T] protected () extends StObject {
    def this(callback: js.Function1[/* cancelToken */ js.UndefOr[CancelToken], PromiseLike[T] | T]) = this()
    
    /* private */ var _callback: Any = js.native
    
    /* private */ var _invokeWorker: Any = js.native
    
    /* private */ var _sharedOperation: Any = js.native
    
    def invoke(): js.Promise[T] = js.native
    def invoke(cancelable: Cancelable): js.Promise[T] = js.native
  }
  
  inline def binarySearch(array: js.Array[Double], value: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("binarySearch")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def binarySearchBy[T, K](array: js.Array[T], key: K, selector: js.Function1[/* value */ T, K]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("binarySearchBy")(array.asInstanceOf[js.Any], key.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def binarySearchBy[T, K](
    array: js.Array[T],
    key: K,
    selector: js.Function1[/* value */ T, K],
    comparison: js.Function2[/* x */ K, /* y */ K, Double]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("binarySearchBy")(array.asInstanceOf[js.Any], key.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], comparison.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def compare(x: Any, y: Any): `0` | `1` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[`0` | `1` | `-1`]
  
  inline def compareNumbers(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareNumbers")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def compareStrings(): `0` | `1` | `-1` = ^.asInstanceOf[js.Dynamic].applyDynamic("compareStrings")().asInstanceOf[`0` | `1` | `-1`]
  inline def compareStrings(x: String): `0` | `1` | `-1` = ^.asInstanceOf[js.Dynamic].applyDynamic("compareStrings")(x.asInstanceOf[js.Any]).asInstanceOf[`0` | `1` | `-1`]
  inline def compareStrings(x: String, y: String): `0` | `1` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareStrings")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[`0` | `1` | `-1`]
  inline def compareStrings(x: String, y: String, ignoreCase: Boolean): `0` | `1` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareStrings")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], ignoreCase.asInstanceOf[js.Any])).asInstanceOf[`0` | `1` | `-1`]
  inline def compareStrings(x: String, y: Unit, ignoreCase: Boolean): `0` | `1` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareStrings")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], ignoreCase.asInstanceOf[js.Any])).asInstanceOf[`0` | `1` | `-1`]
  inline def compareStrings(x: Unit, y: String): `0` | `1` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareStrings")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[`0` | `1` | `-1`]
  inline def compareStrings(x: Unit, y: String, ignoreCase: Boolean): `0` | `1` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareStrings")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], ignoreCase.asInstanceOf[js.Any])).asInstanceOf[`0` | `1` | `-1`]
  inline def compareStrings(x: Unit, y: Unit, ignoreCase: Boolean): `0` | `1` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareStrings")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], ignoreCase.asInstanceOf[js.Any])).asInstanceOf[`0` | `1` | `-1`]
  
  inline def concat[T](): js.UndefOr[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")().asInstanceOf[js.UndefOr[js.Array[T]]]
  inline def concat[T](a: js.Array[T]): js.UndefOr[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(a.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[T]]]
  inline def concat[T](a: js.Array[T], b: js.Array[T]): js.UndefOr[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[T]]]
  inline def concat[T](a: Unit, b: js.Array[T]): js.UndefOr[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[T]]]
  
  inline def concat_T_Array[T](a: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def concat_T_Array[T](a: js.Array[T], b: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def concat_T_Array[T](a: Unit, b: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def deduplicateSorted[T](array: js.Array[T], comparer: js.Function2[/* a */ T, /* b */ T, Double | Boolean]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("deduplicateSorted")(array.asInstanceOf[js.Any], comparer.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @JSImport("grammarkdown/dist/core", "emptyIterable")
  @js.native
  val emptyIterable: IterableIterator[scala.Nothing] = js.native
  
  inline def first[T](): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("first")().asInstanceOf[js.UndefOr[T]]
  inline def first[T](iterable: js.Array[T]): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("first")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  inline def first[T](iterable: js.Iterable[T]): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("first")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  inline def forEach[T, U](array: js.Array[T], cb: js.Function1[/* value */ T, js.UndefOr[U]]): js.UndefOr[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(array.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[U]]
  inline def forEach[T, U](array: Unit, cb: js.Function1[/* value */ T, js.UndefOr[U]]): js.UndefOr[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(array.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[U]]
  
  inline def forEachPossiblyAsync[T, U](iterable: js.Iterable[T], callback: js.Function1[/* value */ T, js.UndefOr[js.Promise[U] | U]]): Unit | js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachPossiblyAsync")(iterable.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit | js.Promise[Unit]]
  
  inline def getLocalPath(file: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalPath")(file.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def identity[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def isFileUri(file: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFileUri")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPromise[T](): /* is std.Promise<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")().asInstanceOf[/* is std.Promise<T> */ Boolean]
  inline def isPromise[T](value: T): /* is std.Promise<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Promise<T> */ Boolean]
  inline def isPromise[T](value: js.Promise[T]): /* is std.Promise<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Promise<T> */ Boolean]
  
  inline def isUri(file: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUri")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def last[T](): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("last")().asInstanceOf[js.UndefOr[T]]
  inline def last[T](iterable: js.Array[T]): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("last")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  inline def last[T](iterable: js.Iterable[T]): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("last")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  inline def mapFromObject[T](`object`: DictionaryLike[T]): Map[String, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapFromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Map[String, T]]
  
  inline def mapSet[K, V](map: Map[K, V], key: K, value: V): V = (^.asInstanceOf[js.Dynamic].applyDynamic("mapSet")(map.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[V]
  inline def mapSet[K /* <: js.Object */, V](map: WeakMap[K, V], key: K, value: V): V = (^.asInstanceOf[js.Dynamic].applyDynamic("mapSet")(map.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[V]
  
  inline def only[T](): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("only")().asInstanceOf[js.UndefOr[T]]
  inline def only[T](iterable: js.Array[T]): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("only")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  inline def only[T](iterable: js.Iterable[T]): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("only")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  inline def pipe[T, U](result: T, next: js.Function1[js.UndefOr[T], js.UndefOr[js.Promise[U] | U]]): U | js.Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(result.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[U | js.Promise[U]]
  inline def pipe[T, U](result: js.Promise[T], next: js.Function1[js.UndefOr[T], js.UndefOr[js.Promise[U] | U]]): U | js.Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(result.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[U | js.Promise[U]]
  inline def pipe[T, U](result: Unit, next: js.Function1[js.UndefOr[T], js.UndefOr[js.Promise[U] | U]]): U | js.Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(result.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[U | js.Promise[U]]
  
  inline def promiseFinally[T](promise: PromiseLike[T], onFinally: js.Function0[Unit]): PromiseLike[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("promiseFinally")(promise.asInstanceOf[js.Any], onFinally.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[T]]
  
  inline def stableSort[T](array: js.Array[T], comparer: js.Function2[/* a */ T, /* b */ T, Double]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("stableSort")(array.asInstanceOf[js.Any], comparer.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def toCancelToken(): js.UndefOr[CancelToken] = ^.asInstanceOf[js.Dynamic].applyDynamic("toCancelToken")().asInstanceOf[js.UndefOr[CancelToken]]
  inline def toCancelToken(cancelable: Cancelable): CancelToken = ^.asInstanceOf[js.Dynamic].applyDynamic("toCancelToken")(cancelable.asInstanceOf[js.Any]).asInstanceOf[CancelToken]
  
  inline def toCancelToken_Union(cancelable: Cancelable): js.UndefOr[CancelToken] = ^.asInstanceOf[js.Dynamic].applyDynamic("toCancelToken")(cancelable.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CancelToken]]
  
  type DictionaryLike[T] = StringDictionary[T] & NumberDictionary[T]
}
