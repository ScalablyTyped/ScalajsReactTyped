package typingsJapgolly.sugar.sugarjs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.sugar.sugarjs.Object.ObjectMergeOptions
import typingsJapgolly.sugar.sugarjs.Object.QueryStringOptions
import typingsJapgolly.sugar.sugarjs.Object.mapFn
import typingsJapgolly.sugar.sugarjs.Object.searchFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Function {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.sugar.sugarjs.Object.ChainableBase because var conflicts: raw. Inlined add, add, addAll, addAll, average, average, average, clone, clone, count, count, defaults, defaults, exclude, exclude, filter, filter, find, find, forEach, get, get, has, has, intersect, invert, invert, isArguments, isArray, isBoolean, isDate, isEmpty, isEqual, isError, isFunction, isMap, isNumber, isObject, isRegExp, isSet, isString, keys, least, least, least, least, least, least, least, least, map, map, max, max, max, max, max, max, max, max, median, median, median, merge, merge, mergeAll, mergeAll, min, min, min, min, min, min, min, min, most, most, most, most, most, most, most, most, none, none, reduce, reduce, reject, reject, reject, reject, remove, remove, select, select, select, select, set, size, some, some, subtract, sum, sum, sum, tap, toQueryString, toQueryString, values */ @js.native
  trait Chainable[RawValue]
    extends StObject
       with ChainableBase[RawValue] {
    
    def add[T](obj: js.Object): SugarDefaultChainable[js.Object] = js.native
    def add[T](obj: js.Object, options: ObjectMergeOptions[T]): SugarDefaultChainable[js.Object] = js.native
    
    def addAll[T](sources: typingsJapgolly.sugar.Array[js.Object]): SugarDefaultChainable[js.Object] = js.native
    def addAll[T](sources: typingsJapgolly.sugar.Array[js.Object], options: ObjectMergeOptions[T]): SugarDefaultChainable[js.Object] = js.native
    
    def average[T, U](): SugarDefaultChainable[Double] = js.native
    def average[T, U](map: java.lang.String): SugarDefaultChainable[Double] = js.native
    def average[T, U](map: mapFn[T, U]): SugarDefaultChainable[Double] = js.native
    
    def clone(deep: Boolean): SugarDefaultChainable[js.Object] = js.native
    
    def count[T](search: T): SugarDefaultChainable[Double] = js.native
    def count[T](search: searchFn[T]): SugarDefaultChainable[Double] = js.native
    
    def defaults[T](sources: typingsJapgolly.sugar.Array[js.Object]): SugarDefaultChainable[js.Object] = js.native
    def defaults[T](sources: typingsJapgolly.sugar.Array[js.Object], options: ObjectMergeOptions[T]): SugarDefaultChainable[js.Object] = js.native
    
    def exclude[T](search: T): SugarDefaultChainable[js.Object] = js.native
    def exclude[T](search: searchFn[T]): SugarDefaultChainable[js.Object] = js.native
    
    def filter[T](search: T): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def filter[T](search: searchFn[T]): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    
    def find[T](search: T): SugarDefaultChainable[Boolean] = js.native
    def find[T](search: searchFn[T]): SugarDefaultChainable[Boolean] = js.native
    
    def forEach[T](
      eachFn: js.Function3[
          /* val */ T, 
          /* key */ java.lang.String, 
          /* obj */ js.Object, 
          SugarDefaultChainable[Unit]
        ]
    ): SugarDefaultChainable[js.Object] = js.native
    
    def get[T](key: java.lang.String): SugarDefaultChainable[T] = js.native
    def get[T](key: java.lang.String, inherited: Boolean): SugarDefaultChainable[T] = js.native
    
    def has(key: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    def has(key: java.lang.String, inherited: Boolean): SugarDefaultChainable[Boolean] = js.native
    
    def intersect(obj: js.Object): SugarDefaultChainable[js.Object] = js.native
    
    def invert(): SugarDefaultChainable[js.Object] = js.native
    def invert(multi: Boolean): SugarDefaultChainable[js.Object] = js.native
    
    def isArguments(): SugarDefaultChainable[Boolean] = js.native
    
    def isArray(): SugarDefaultChainable[Boolean] = js.native
    
    def isBoolean(): SugarDefaultChainable[Boolean] = js.native
    
    def isDate(): SugarDefaultChainable[Boolean] = js.native
    
    def isEmpty(): SugarDefaultChainable[Boolean] = js.native
    
    def isEqual(obj: js.Object): SugarDefaultChainable[Boolean] = js.native
    
    def isError(): SugarDefaultChainable[Boolean] = js.native
    
    def isFunction(): SugarDefaultChainable[Boolean] = js.native
    
    def isMap(): SugarDefaultChainable[Boolean] = js.native
    
    def isNumber(): SugarDefaultChainable[Boolean] = js.native
    
    def isObject(): SugarDefaultChainable[Boolean] = js.native
    
    def isRegExp(): SugarDefaultChainable[Boolean] = js.native
    
    def isSet(): SugarDefaultChainable[Boolean] = js.native
    
    def isString(): SugarDefaultChainable[Boolean] = js.native
    
    def keys[T](): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    
    def least[T, U](): SugarDefaultChainable[T] = js.native
    def least[T, U](all: Boolean): SugarDefaultChainable[T] = js.native
    def least[T, U](all: Boolean, map: java.lang.String): SugarDefaultChainable[T] = js.native
    def least[T, U](all: Boolean, map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    def least[T, U](all: Unit, map: java.lang.String): SugarDefaultChainable[T] = js.native
    def least[T, U](all: Unit, map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    def least[T, U](map: java.lang.String): SugarDefaultChainable[T] = js.native
    def least[T, U](map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    
    def map[T, U](map: java.lang.String): SugarDefaultChainable[js.Object] = js.native
    def map[T, U](map: mapFn[T, U]): SugarDefaultChainable[js.Object] = js.native
    
    def max[T, U](): SugarDefaultChainable[T] = js.native
    def max[T, U](all: Boolean): SugarDefaultChainable[T] = js.native
    def max[T, U](all: Boolean, map: java.lang.String): SugarDefaultChainable[T] = js.native
    def max[T, U](all: Boolean, map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    def max[T, U](all: Unit, map: java.lang.String): SugarDefaultChainable[T] = js.native
    def max[T, U](all: Unit, map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    def max[T, U](map: java.lang.String): SugarDefaultChainable[T] = js.native
    def max[T, U](map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    
    def median[T, U](): SugarDefaultChainable[Double] = js.native
    def median[T, U](map: java.lang.String): SugarDefaultChainable[Double] = js.native
    def median[T, U](map: mapFn[T, U]): SugarDefaultChainable[Double] = js.native
    
    def merge[T](source: js.Object): SugarDefaultChainable[js.Object] = js.native
    def merge[T](source: js.Object, options: ObjectMergeOptions[T]): SugarDefaultChainable[js.Object] = js.native
    
    def mergeAll[T](sources: typingsJapgolly.sugar.Array[js.Object]): SugarDefaultChainable[js.Object] = js.native
    def mergeAll[T](sources: typingsJapgolly.sugar.Array[js.Object], options: ObjectMergeOptions[T]): SugarDefaultChainable[js.Object] = js.native
    
    def min[T, U](): SugarDefaultChainable[T] = js.native
    def min[T, U](all: Boolean): SugarDefaultChainable[T] = js.native
    def min[T, U](all: Boolean, map: java.lang.String): SugarDefaultChainable[T] = js.native
    def min[T, U](all: Boolean, map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    def min[T, U](all: Unit, map: java.lang.String): SugarDefaultChainable[T] = js.native
    def min[T, U](all: Unit, map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    def min[T, U](map: java.lang.String): SugarDefaultChainable[T] = js.native
    def min[T, U](map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    
    def most[T, U](): SugarDefaultChainable[T] = js.native
    def most[T, U](all: Boolean): SugarDefaultChainable[T] = js.native
    def most[T, U](all: Boolean, map: java.lang.String): SugarDefaultChainable[T] = js.native
    def most[T, U](all: Boolean, map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    def most[T, U](all: Unit, map: java.lang.String): SugarDefaultChainable[T] = js.native
    def most[T, U](all: Unit, map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    def most[T, U](map: java.lang.String): SugarDefaultChainable[T] = js.native
    def most[T, U](map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    
    def none[T](search: T): SugarDefaultChainable[Boolean] = js.native
    def none[T](search: searchFn[T]): SugarDefaultChainable[Boolean] = js.native
    
    def reduce[T](
      reduceFn: js.Function4[
          /* acc */ T, 
          /* val */ T, 
          /* key */ java.lang.String, 
          /* obj */ js.Object, 
          SugarDefaultChainable[Unit]
        ]
    ): SugarDefaultChainable[T] = js.native
    def reduce[T](
      reduceFn: js.Function4[
          /* acc */ T, 
          /* val */ T, 
          /* key */ java.lang.String, 
          /* obj */ js.Object, 
          SugarDefaultChainable[Unit]
        ],
      init: Any
    ): SugarDefaultChainable[T] = js.native
    
    def reject(find: java.lang.String): SugarDefaultChainable[js.Object] = js.native
    def reject(find: js.Object): SugarDefaultChainable[js.Object] = js.native
    def reject(find: typingsJapgolly.sugar.Array[java.lang.String]): SugarDefaultChainable[js.Object] = js.native
    def reject(find: typingsJapgolly.sugar.RegExp): SugarDefaultChainable[js.Object] = js.native
    
    def remove[T](search: T): SugarDefaultChainable[js.Object] = js.native
    def remove[T](search: searchFn[T]): SugarDefaultChainable[js.Object] = js.native
    
    def select(find: java.lang.String): SugarDefaultChainable[js.Object] = js.native
    def select(find: js.Object): SugarDefaultChainable[js.Object] = js.native
    def select(find: typingsJapgolly.sugar.Array[java.lang.String]): SugarDefaultChainable[js.Object] = js.native
    def select(find: typingsJapgolly.sugar.RegExp): SugarDefaultChainable[js.Object] = js.native
    
    def set[T](key: java.lang.String, `val`: T): SugarDefaultChainable[js.Object] = js.native
    
    def size(): SugarDefaultChainable[Double] = js.native
    
    def some[T](search: T): SugarDefaultChainable[Boolean] = js.native
    def some[T](search: searchFn[T]): SugarDefaultChainable[Boolean] = js.native
    
    def subtract(obj: js.Object): SugarDefaultChainable[js.Object] = js.native
    
    def sum[T, U](): SugarDefaultChainable[Double] = js.native
    def sum[T, U](map: java.lang.String): SugarDefaultChainable[Double] = js.native
    def sum[T, U](map: mapFn[T, U]): SugarDefaultChainable[Double] = js.native
    
    def tap(tapFn: js.Function1[/* obj */ js.Object, SugarDefaultChainable[Any]]): SugarDefaultChainable[js.Object] = js.native
    
    def toQueryString[T, U](): SugarDefaultChainable[js.Object] = js.native
    def toQueryString[T, U](options: QueryStringOptions[T, U]): SugarDefaultChainable[js.Object] = js.native
    
    def values[T](): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
  }
  
  @js.native
  trait ChainableBase[RawValue] extends StObject {
    
    def after(n: Double): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    
    @JSName("apply")
    def apply(thisArg: Any): SugarDefaultChainable[Any] = js.native
    @JSName("apply")
    def apply(thisArg: Any, argArray: Any): SugarDefaultChainable[Any] = js.native
    
    def bind(thisArg: Any, argArray: Any*): SugarDefaultChainable[Any] = js.native
    
    def call(thisArg: Any, argArray: Any*): SugarDefaultChainable[Any] = js.native
    
    def cancel(): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    
    def debounce(): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    def debounce(ms: Double): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    
    def delay(ms: Double, args: Any*): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    def delay(ms: Unit, args: Any*): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    
    def every(ms: Double, args: Any*): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    def every(ms: Unit, args: Any*): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    
    def `lazy`(): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    def `lazy`(ms: Double): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    def `lazy`(ms: Double, immediate: Boolean): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    def `lazy`(ms: Double, immediate: Boolean, limit: Double): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    def `lazy`(ms: Double, immediate: Unit, limit: Double): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    def `lazy`(ms: Unit, immediate: Boolean): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    def `lazy`(ms: Unit, immediate: Boolean, limit: Double): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    def `lazy`(ms: Unit, immediate: Unit, limit: Double): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    
    def lock(): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    def lock(n: Double): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    
    def memoize(): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    def memoize(hashFn: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    def memoize(hashFn: java.lang.String, limit: Double): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    def memoize(hashFn: Unit, limit: Double): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    def memoize(hashFn: typingsJapgolly.sugar.Function): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    def memoize(hashFn: typingsJapgolly.sugar.Function, limit: Double): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    
    def once(): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    
    def partial(args: Any*): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    
    var raw: RawValue = js.native
    
    def throttle(): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    def throttle(ms: Double): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
  }
  
  @js.native
  trait Constructor
    extends StObject
       with SugarNamespace
       with Instantiable0[Chainable[typingsJapgolly.sugar.Function]]
       with Instantiable1[
          /* raw */ typingsJapgolly.sugar.Function, 
          Chainable[typingsJapgolly.sugar.Function]
        ] {
    
    def apply(): Chainable[typingsJapgolly.sugar.Function] = js.native
    def apply(raw: typingsJapgolly.sugar.Function): Chainable[typingsJapgolly.sugar.Function] = js.native
    
    def after(instance: typingsJapgolly.sugar.Function, n: Double): typingsJapgolly.sugar.Function = js.native
    
    def cancel(instance: typingsJapgolly.sugar.Function): typingsJapgolly.sugar.Function = js.native
    
    def debounce(instance: typingsJapgolly.sugar.Function): typingsJapgolly.sugar.Function = js.native
    def debounce(instance: typingsJapgolly.sugar.Function, ms: Double): typingsJapgolly.sugar.Function = js.native
    
    def delay(instance: typingsJapgolly.sugar.Function, ms: Double, args: Any*): typingsJapgolly.sugar.Function = js.native
    def delay(instance: typingsJapgolly.sugar.Function, ms: Unit, args: Any*): typingsJapgolly.sugar.Function = js.native
    
    def every(instance: typingsJapgolly.sugar.Function, ms: Double, args: Any*): typingsJapgolly.sugar.Function = js.native
    def every(instance: typingsJapgolly.sugar.Function, ms: Unit, args: Any*): typingsJapgolly.sugar.Function = js.native
    
    def `lazy`(instance: typingsJapgolly.sugar.Function): typingsJapgolly.sugar.Function = js.native
    def `lazy`(instance: typingsJapgolly.sugar.Function, ms: Double): typingsJapgolly.sugar.Function = js.native
    def `lazy`(instance: typingsJapgolly.sugar.Function, ms: Double, immediate: Boolean): typingsJapgolly.sugar.Function = js.native
    def `lazy`(instance: typingsJapgolly.sugar.Function, ms: Double, immediate: Boolean, limit: Double): typingsJapgolly.sugar.Function = js.native
    def `lazy`(instance: typingsJapgolly.sugar.Function, ms: Double, immediate: Unit, limit: Double): typingsJapgolly.sugar.Function = js.native
    def `lazy`(instance: typingsJapgolly.sugar.Function, ms: Unit, immediate: Boolean): typingsJapgolly.sugar.Function = js.native
    def `lazy`(instance: typingsJapgolly.sugar.Function, ms: Unit, immediate: Boolean, limit: Double): typingsJapgolly.sugar.Function = js.native
    def `lazy`(instance: typingsJapgolly.sugar.Function, ms: Unit, immediate: Unit, limit: Double): typingsJapgolly.sugar.Function = js.native
    
    def lock(instance: typingsJapgolly.sugar.Function): typingsJapgolly.sugar.Function = js.native
    def lock(instance: typingsJapgolly.sugar.Function, n: Double): typingsJapgolly.sugar.Function = js.native
    
    def memoize(instance: typingsJapgolly.sugar.Function): typingsJapgolly.sugar.Function = js.native
    def memoize(instance: typingsJapgolly.sugar.Function, hashFn: java.lang.String): typingsJapgolly.sugar.Function = js.native
    def memoize(instance: typingsJapgolly.sugar.Function, hashFn: java.lang.String, limit: Double): typingsJapgolly.sugar.Function = js.native
    def memoize(instance: typingsJapgolly.sugar.Function, hashFn: Unit, limit: Double): typingsJapgolly.sugar.Function = js.native
    def memoize(instance: typingsJapgolly.sugar.Function, hashFn: typingsJapgolly.sugar.Function): typingsJapgolly.sugar.Function = js.native
    def memoize(instance: typingsJapgolly.sugar.Function, hashFn: typingsJapgolly.sugar.Function, limit: Double): typingsJapgolly.sugar.Function = js.native
    
    def once(instance: typingsJapgolly.sugar.Function): typingsJapgolly.sugar.Function = js.native
    
    def partial(instance: typingsJapgolly.sugar.Function, args: Any*): typingsJapgolly.sugar.Function = js.native
    
    def throttle(instance: typingsJapgolly.sugar.Function): typingsJapgolly.sugar.Function = js.native
    def throttle(instance: typingsJapgolly.sugar.Function, ms: Double): typingsJapgolly.sugar.Function = js.native
  }
}
