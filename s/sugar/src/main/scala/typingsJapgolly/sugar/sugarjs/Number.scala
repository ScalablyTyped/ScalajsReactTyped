package typingsJapgolly.sugar.sugarjs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.std.Intl.NumberFormatOptions
import typingsJapgolly.sugar.sugarjs.Date.DateCreateOptions
import typingsJapgolly.sugar.sugarjs.Object.ObjectMergeOptions
import typingsJapgolly.sugar.sugarjs.Object.QueryStringOptions
import typingsJapgolly.sugar.sugarjs.Object.mapFn
import typingsJapgolly.sugar.sugarjs.Object.searchFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Number {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.sugar.sugarjs.Object.ChainableBase because var conflicts: raw. Inlined add, add, addAll, addAll, average, average, average, clone, clone, count, count, defaults, defaults, every, every, exclude, exclude, filter, filter, find, find, forEach, get, get, has, has, intersect, invert, invert, isArguments, isArray, isBoolean, isDate, isEmpty, isEqual, isError, isFunction, isMap, isNumber, isObject, isRegExp, isSet, isString, keys, least, least, least, least, least, least, least, least, map, map, max, max, max, max, max, max, max, max, median, median, median, merge, merge, mergeAll, mergeAll, min, min, min, min, min, min, min, min, most, most, most, most, most, most, most, most, none, none, reduce, reduce, reject, reject, reject, reject, remove, remove, select, select, select, select, set, size, some, some, subtract, sum, sum, sum, tap, toQueryString, toQueryString, values */ @js.native
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
    
    def every[T](search: T): SugarDefaultChainable[Boolean] = js.native
    def every[T](search: searchFn[T]): SugarDefaultChainable[Boolean] = js.native
    
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
    
    def abbr(): SugarDefaultChainable[java.lang.String] = js.native
    def abbr(precision: Double): SugarDefaultChainable[java.lang.String] = js.native
    
    def abs(): SugarDefaultChainable[Double] = js.native
    
    def acos(): SugarDefaultChainable[Double] = js.native
    
    def asin(): SugarDefaultChainable[Double] = js.native
    
    def atan(): SugarDefaultChainable[Double] = js.native
    
    def bytes(): SugarDefaultChainable[java.lang.String] = js.native
    def bytes(precision: Double): SugarDefaultChainable[java.lang.String] = js.native
    def bytes(precision: Double, binary: Boolean): SugarDefaultChainable[java.lang.String] = js.native
    def bytes(precision: Double, binary: Boolean, units: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def bytes(precision: Double, binary: Unit, units: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def bytes(precision: Unit, binary: Boolean): SugarDefaultChainable[java.lang.String] = js.native
    def bytes(precision: Unit, binary: Boolean, units: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def bytes(precision: Unit, binary: Unit, units: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    
    def cap(): SugarDefaultChainable[Double] = js.native
    def cap(max: Double): SugarDefaultChainable[Double] = js.native
    
    def ceil(): SugarDefaultChainable[Double] = js.native
    def ceil(precision: Double): SugarDefaultChainable[Double] = js.native
    
    def chr(): SugarDefaultChainable[java.lang.String] = js.native
    
    def clamp(): SugarDefaultChainable[Double] = js.native
    def clamp(start: Double): SugarDefaultChainable[Double] = js.native
    def clamp(start: Double, end: Double): SugarDefaultChainable[Double] = js.native
    def clamp(start: Unit, end: Double): SugarDefaultChainable[Double] = js.native
    
    def cos(): SugarDefaultChainable[Double] = js.native
    
    def day(): SugarDefaultChainable[Double] = js.native
    
    def dayAfter(d: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def dayAfter(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def dayAfter(d: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def dayAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def dayAfter(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def dayAfter(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def dayAgo(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def dayBefore(d: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def dayBefore(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def dayBefore(d: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def dayBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def dayBefore(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def dayBefore(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def dayFromNow(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def days(): SugarDefaultChainable[Double] = js.native
    
    def daysAfter(d: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def daysAfter(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def daysAfter(d: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def daysAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def daysAfter(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def daysAfter(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def daysAgo(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def daysBefore(d: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def daysBefore(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def daysBefore(d: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def daysBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def daysBefore(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def daysBefore(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def daysFromNow(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def downto[T](num: Double): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def downto[T](
      num: Double,
      everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, SugarDefaultChainable[Unit]]
    ): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def downto[T](num: Double, step: Double): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def downto[T](
      num: Double,
      step: Double,
      everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, SugarDefaultChainable[Unit]]
    ): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def downto[T](
      num: Double,
      step: Unit,
      everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, SugarDefaultChainable[Unit]]
    ): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    
    def duration(): SugarDefaultChainable[java.lang.String] = js.native
    def duration(localeCode: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    
    def exp(): SugarDefaultChainable[Double] = js.native
    
    def floor(): SugarDefaultChainable[Double] = js.native
    def floor(precision: Double): SugarDefaultChainable[Double] = js.native
    
    def format(): SugarDefaultChainable[java.lang.String] = js.native
    def format(place: Double): SugarDefaultChainable[java.lang.String] = js.native
    
    def hex(): SugarDefaultChainable[java.lang.String] = js.native
    def hex(pad: Double): SugarDefaultChainable[java.lang.String] = js.native
    
    def hour(): SugarDefaultChainable[Double] = js.native
    
    def hourAfter(d: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def hourAfter(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def hourAfter(d: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def hourAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def hourAfter(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def hourAfter(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def hourAgo(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def hourBefore(d: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def hourBefore(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def hourBefore(d: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def hourBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def hourBefore(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def hourBefore(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def hourFromNow(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def hours(): SugarDefaultChainable[Double] = js.native
    
    def hoursAfter(d: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def hoursAfter(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def hoursAfter(d: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def hoursAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def hoursAfter(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def hoursAfter(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def hoursAgo(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def hoursBefore(d: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def hoursBefore(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def hoursBefore(d: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def hoursBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def hoursBefore(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def hoursBefore(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def hoursFromNow(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def isEven(): SugarDefaultChainable[Boolean] = js.native
    
    def isInteger(): SugarDefaultChainable[Boolean] = js.native
    
    def isMultipleOf(num: Double): SugarDefaultChainable[Boolean] = js.native
    
    def isOdd(): SugarDefaultChainable[Boolean] = js.native
    
    def log(): SugarDefaultChainable[Double] = js.native
    def log(base: Double): SugarDefaultChainable[Double] = js.native
    
    def metric(): SugarDefaultChainable[java.lang.String] = js.native
    def metric(precision: Double): SugarDefaultChainable[java.lang.String] = js.native
    def metric(precision: Double, units: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def metric(precision: Unit, units: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    
    def millisecond(): SugarDefaultChainable[Double] = js.native
    
    def millisecondAfter(d: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def millisecondAfter(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def millisecondAfter(d: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def millisecondAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def millisecondAfter(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def millisecondAfter(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def millisecondAgo(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def millisecondBefore(d: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def millisecondBefore(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def millisecondBefore(d: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def millisecondBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def millisecondBefore(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def millisecondBefore(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def millisecondFromNow(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def milliseconds(): SugarDefaultChainable[Double] = js.native
    
    def millisecondsAfter(d: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def millisecondsAfter(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def millisecondsAfter(d: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def millisecondsAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def millisecondsAfter(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def millisecondsAfter(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def millisecondsAgo(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def millisecondsBefore(d: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def millisecondsBefore(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def millisecondsBefore(d: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def millisecondsBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def millisecondsBefore(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def millisecondsBefore(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def millisecondsFromNow(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def minute(): SugarDefaultChainable[Double] = js.native
    
    def minuteAfter(d: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def minuteAfter(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def minuteAfter(d: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def minuteAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def minuteAfter(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def minuteAfter(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def minuteAgo(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def minuteBefore(d: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def minuteBefore(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def minuteBefore(d: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def minuteBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def minuteBefore(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def minuteBefore(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def minuteFromNow(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def minutes(): SugarDefaultChainable[Double] = js.native
    
    def minutesAfter(d: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def minutesAfter(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def minutesAfter(d: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def minutesAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def minutesAfter(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def minutesAfter(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def minutesAgo(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def minutesBefore(d: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def minutesBefore(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def minutesBefore(d: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def minutesBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def minutesBefore(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def minutesBefore(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def minutesFromNow(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def month(): SugarDefaultChainable[Double] = js.native
    
    def monthAfter(d: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def monthAfter(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def monthAfter(d: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def monthAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def monthAfter(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def monthAfter(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def monthAgo(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def monthBefore(d: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def monthBefore(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def monthBefore(d: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def monthBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def monthBefore(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def monthBefore(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def monthFromNow(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def months(): SugarDefaultChainable[Double] = js.native
    
    def monthsAfter(d: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def monthsAfter(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def monthsAfter(d: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def monthsAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def monthsAfter(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def monthsAfter(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def monthsAgo(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def monthsBefore(d: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def monthsBefore(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def monthsBefore(d: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def monthsBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def monthsBefore(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def monthsBefore(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def monthsFromNow(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def ordinalize(): SugarDefaultChainable[java.lang.String] = js.native
    
    def pad(): SugarDefaultChainable[java.lang.String] = js.native
    def pad(place: Double): SugarDefaultChainable[java.lang.String] = js.native
    def pad(place: Double, sign: Boolean): SugarDefaultChainable[java.lang.String] = js.native
    def pad(place: Double, sign: Boolean, base: Double): SugarDefaultChainable[java.lang.String] = js.native
    def pad(place: Double, sign: Unit, base: Double): SugarDefaultChainable[java.lang.String] = js.native
    def pad(place: Unit, sign: Boolean): SugarDefaultChainable[java.lang.String] = js.native
    def pad(place: Unit, sign: Boolean, base: Double): SugarDefaultChainable[java.lang.String] = js.native
    def pad(place: Unit, sign: Unit, base: Double): SugarDefaultChainable[java.lang.String] = js.native
    
    def pow(): SugarDefaultChainable[Double] = js.native
    
    var raw: RawValue = js.native
    
    def round(): SugarDefaultChainable[Double] = js.native
    def round(precision: Double): SugarDefaultChainable[Double] = js.native
    
    def second(): SugarDefaultChainable[Double] = js.native
    
    def secondAfter(d: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def secondAfter(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def secondAfter(d: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def secondAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def secondAfter(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def secondAfter(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def secondAgo(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def secondBefore(d: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def secondBefore(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def secondBefore(d: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def secondBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def secondBefore(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def secondBefore(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def secondFromNow(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def seconds(): SugarDefaultChainable[Double] = js.native
    
    def secondsAfter(d: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def secondsAfter(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def secondsAfter(d: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def secondsAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def secondsAfter(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def secondsAfter(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def secondsAgo(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def secondsBefore(d: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def secondsBefore(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def secondsBefore(d: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def secondsBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def secondsBefore(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def secondsBefore(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def secondsFromNow(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def sin(): SugarDefaultChainable[Double] = js.native
    
    def sqrt(): SugarDefaultChainable[Double] = js.native
    
    def tan(): SugarDefaultChainable[Double] = js.native
    
    def times[T](indexMapFn: js.Function1[/* i */ Double, SugarDefaultChainable[Any]]): SugarDefaultChainable[T] = js.native
    
    def toExponential(): SugarDefaultChainable[java.lang.String] = js.native
    def toExponential(fractionDigits: Double): SugarDefaultChainable[java.lang.String] = js.native
    
    def toFixed(): SugarDefaultChainable[java.lang.String] = js.native
    def toFixed(fractionDigits: Double): SugarDefaultChainable[java.lang.String] = js.native
    
    def toLocaleString(locales: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleString(locales: java.lang.String, options: NumberFormatOptions): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleString(locales: Unit, options: NumberFormatOptions): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleString(locales: typingsJapgolly.sugar.Array[java.lang.String]): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleString(locales: typingsJapgolly.sugar.Array[java.lang.String], options: NumberFormatOptions): SugarDefaultChainable[java.lang.String] = js.native
    
    def toNumber(): SugarDefaultChainable[Double] = js.native
    
    def toPrecision(): SugarDefaultChainable[java.lang.String] = js.native
    def toPrecision(precision: Double): SugarDefaultChainable[java.lang.String] = js.native
    
    def upto[T](num: Double): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def upto[T](
      num: Double,
      everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, SugarDefaultChainable[Unit]]
    ): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def upto[T](num: Double, step: Double): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def upto[T](
      num: Double,
      step: Double,
      everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, SugarDefaultChainable[Unit]]
    ): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def upto[T](
      num: Double,
      step: Unit,
      everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, SugarDefaultChainable[Unit]]
    ): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    
    def week(): SugarDefaultChainable[Double] = js.native
    
    def weekAfter(d: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def weekAfter(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def weekAfter(d: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def weekAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def weekAfter(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def weekAfter(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def weekAgo(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def weekBefore(d: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def weekBefore(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def weekBefore(d: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def weekBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def weekBefore(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def weekBefore(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def weekFromNow(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def weeks(): SugarDefaultChainable[Double] = js.native
    
    def weeksAfter(d: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def weeksAfter(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def weeksAfter(d: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def weeksAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def weeksAfter(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def weeksAfter(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def weeksAgo(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def weeksBefore(d: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def weeksBefore(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def weeksBefore(d: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def weeksBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def weeksBefore(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def weeksBefore(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def weeksFromNow(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def year(): SugarDefaultChainable[Double] = js.native
    
    def yearAfter(d: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def yearAfter(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def yearAfter(d: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def yearAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def yearAfter(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def yearAfter(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def yearAgo(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def yearBefore(d: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def yearBefore(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def yearBefore(d: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def yearBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def yearBefore(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def yearBefore(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def yearFromNow(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def years(): SugarDefaultChainable[Double] = js.native
    
    def yearsAfter(d: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def yearsAfter(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def yearsAfter(d: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def yearsAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def yearsAfter(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def yearsAfter(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def yearsAgo(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def yearsBefore(d: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def yearsBefore(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def yearsBefore(d: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def yearsBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def yearsBefore(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def yearsBefore(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def yearsFromNow(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
  }
  
  @js.native
  trait Constructor
    extends StObject
       with SugarNamespace
       with Instantiable0[Chainable[Double]]
       with Instantiable1[/* raw */ Double, Chainable[Double]] {
    
    def apply(): Chainable[Double] = js.native
    def apply(raw: Double): Chainable[Double] = js.native
    
    def abbr(instance: Double): java.lang.String = js.native
    def abbr(instance: Double, precision: Double): java.lang.String = js.native
    
    def abs(instance: Double): Double = js.native
    
    def acos(instance: Double): Double = js.native
    
    def asin(instance: Double): Double = js.native
    
    def atan(instance: Double): Double = js.native
    
    def bytes(instance: Double): java.lang.String = js.native
    def bytes(instance: Double, precision: Double): java.lang.String = js.native
    def bytes(instance: Double, precision: Double, binary: Boolean): java.lang.String = js.native
    def bytes(instance: Double, precision: Double, binary: Boolean, units: java.lang.String): java.lang.String = js.native
    def bytes(instance: Double, precision: Double, binary: Unit, units: java.lang.String): java.lang.String = js.native
    def bytes(instance: Double, precision: Unit, binary: Boolean): java.lang.String = js.native
    def bytes(instance: Double, precision: Unit, binary: Boolean, units: java.lang.String): java.lang.String = js.native
    def bytes(instance: Double, precision: Unit, binary: Unit, units: java.lang.String): java.lang.String = js.native
    
    def cap(instance: Double): Double = js.native
    def cap(instance: Double, max: Double): Double = js.native
    
    def ceil(instance: Double): Double = js.native
    def ceil(instance: Double, precision: Double): Double = js.native
    
    def chr(instance: Double): java.lang.String = js.native
    
    def clamp(instance: Double): Double = js.native
    def clamp(instance: Double, start: Double): Double = js.native
    def clamp(instance: Double, start: Double, end: Double): Double = js.native
    def clamp(instance: Double, start: Unit, end: Double): Double = js.native
    
    def cos(instance: Double): Double = js.native
    
    def day(instance: Double): Double = js.native
    
    def dayAfter(instance: Double, d: java.lang.String): typingsJapgolly.sugar.Date = js.native
    def dayAfter(instance: Double, d: java.lang.String, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def dayAfter(instance: Double, d: Double): typingsJapgolly.sugar.Date = js.native
    def dayAfter(instance: Double, d: Double, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def dayAfter(instance: Double, d: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def dayAfter(instance: Double, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    
    def dayAgo(instance: Double): typingsJapgolly.sugar.Date = js.native
    
    def dayBefore(instance: Double, d: java.lang.String): typingsJapgolly.sugar.Date = js.native
    def dayBefore(instance: Double, d: java.lang.String, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def dayBefore(instance: Double, d: Double): typingsJapgolly.sugar.Date = js.native
    def dayBefore(instance: Double, d: Double, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def dayBefore(instance: Double, d: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def dayBefore(instance: Double, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    
    def dayFromNow(instance: Double): typingsJapgolly.sugar.Date = js.native
    
    def days(instance: Double): Double = js.native
    
    def daysAfter(instance: Double, d: java.lang.String): typingsJapgolly.sugar.Date = js.native
    def daysAfter(instance: Double, d: java.lang.String, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def daysAfter(instance: Double, d: Double): typingsJapgolly.sugar.Date = js.native
    def daysAfter(instance: Double, d: Double, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def daysAfter(instance: Double, d: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def daysAfter(instance: Double, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    
    def daysAgo(instance: Double): typingsJapgolly.sugar.Date = js.native
    
    def daysBefore(instance: Double, d: java.lang.String): typingsJapgolly.sugar.Date = js.native
    def daysBefore(instance: Double, d: java.lang.String, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def daysBefore(instance: Double, d: Double): typingsJapgolly.sugar.Date = js.native
    def daysBefore(instance: Double, d: Double, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def daysBefore(instance: Double, d: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def daysBefore(instance: Double, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    
    def daysFromNow(instance: Double): typingsJapgolly.sugar.Date = js.native
    
    def downto[T](instance: Double, num: Double): typingsJapgolly.sugar.Array[T] = js.native
    def downto[T](
      instance: Double,
      num: Double,
      everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, Unit]
    ): typingsJapgolly.sugar.Array[T] = js.native
    def downto[T](instance: Double, num: Double, step: Double): typingsJapgolly.sugar.Array[T] = js.native
    def downto[T](
      instance: Double,
      num: Double,
      step: Double,
      everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, Unit]
    ): typingsJapgolly.sugar.Array[T] = js.native
    def downto[T](
      instance: Double,
      num: Double,
      step: Unit,
      everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, Unit]
    ): typingsJapgolly.sugar.Array[T] = js.native
    
    def duration(instance: Double): java.lang.String = js.native
    def duration(instance: Double, localeCode: java.lang.String): java.lang.String = js.native
    
    def exp(instance: Double): Double = js.native
    
    def floor(instance: Double): Double = js.native
    def floor(instance: Double, precision: Double): Double = js.native
    
    def format(instance: Double): java.lang.String = js.native
    def format(instance: Double, place: Double): java.lang.String = js.native
    
    def getOption[T](name: java.lang.String): T = js.native
    
    def hex(instance: Double): java.lang.String = js.native
    def hex(instance: Double, pad: Double): java.lang.String = js.native
    
    def hour(instance: Double): Double = js.native
    
    def hourAfter(instance: Double, d: java.lang.String): typingsJapgolly.sugar.Date = js.native
    def hourAfter(instance: Double, d: java.lang.String, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def hourAfter(instance: Double, d: Double): typingsJapgolly.sugar.Date = js.native
    def hourAfter(instance: Double, d: Double, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def hourAfter(instance: Double, d: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def hourAfter(instance: Double, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    
    def hourAgo(instance: Double): typingsJapgolly.sugar.Date = js.native
    
    def hourBefore(instance: Double, d: java.lang.String): typingsJapgolly.sugar.Date = js.native
    def hourBefore(instance: Double, d: java.lang.String, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def hourBefore(instance: Double, d: Double): typingsJapgolly.sugar.Date = js.native
    def hourBefore(instance: Double, d: Double, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def hourBefore(instance: Double, d: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def hourBefore(instance: Double, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    
    def hourFromNow(instance: Double): typingsJapgolly.sugar.Date = js.native
    
    def hours(instance: Double): Double = js.native
    
    def hoursAfter(instance: Double, d: java.lang.String): typingsJapgolly.sugar.Date = js.native
    def hoursAfter(instance: Double, d: java.lang.String, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def hoursAfter(instance: Double, d: Double): typingsJapgolly.sugar.Date = js.native
    def hoursAfter(instance: Double, d: Double, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def hoursAfter(instance: Double, d: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def hoursAfter(instance: Double, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    
    def hoursAgo(instance: Double): typingsJapgolly.sugar.Date = js.native
    
    def hoursBefore(instance: Double, d: java.lang.String): typingsJapgolly.sugar.Date = js.native
    def hoursBefore(instance: Double, d: java.lang.String, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def hoursBefore(instance: Double, d: Double): typingsJapgolly.sugar.Date = js.native
    def hoursBefore(instance: Double, d: Double, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def hoursBefore(instance: Double, d: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def hoursBefore(instance: Double, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    
    def hoursFromNow(instance: Double): typingsJapgolly.sugar.Date = js.native
    
    def isEven(instance: Double): Boolean = js.native
    
    def isInteger(instance: Double): Boolean = js.native
    
    def isMultipleOf(instance: Double, num: Double): Boolean = js.native
    
    def isOdd(instance: Double): Boolean = js.native
    
    def log(instance: Double): Double = js.native
    def log(instance: Double, base: Double): Double = js.native
    
    def metric(instance: Double): java.lang.String = js.native
    def metric(instance: Double, precision: Double): java.lang.String = js.native
    def metric(instance: Double, precision: Double, units: java.lang.String): java.lang.String = js.native
    def metric(instance: Double, precision: Unit, units: java.lang.String): java.lang.String = js.native
    
    def millisecond(instance: Double): Double = js.native
    
    def millisecondAfter(instance: Double, d: java.lang.String): typingsJapgolly.sugar.Date = js.native
    def millisecondAfter(instance: Double, d: java.lang.String, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def millisecondAfter(instance: Double, d: Double): typingsJapgolly.sugar.Date = js.native
    def millisecondAfter(instance: Double, d: Double, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def millisecondAfter(instance: Double, d: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def millisecondAfter(instance: Double, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    
    def millisecondAgo(instance: Double): typingsJapgolly.sugar.Date = js.native
    
    def millisecondBefore(instance: Double, d: java.lang.String): typingsJapgolly.sugar.Date = js.native
    def millisecondBefore(instance: Double, d: java.lang.String, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def millisecondBefore(instance: Double, d: Double): typingsJapgolly.sugar.Date = js.native
    def millisecondBefore(instance: Double, d: Double, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def millisecondBefore(instance: Double, d: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def millisecondBefore(instance: Double, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    
    def millisecondFromNow(instance: Double): typingsJapgolly.sugar.Date = js.native
    
    def milliseconds(instance: Double): Double = js.native
    
    def millisecondsAfter(instance: Double, d: java.lang.String): typingsJapgolly.sugar.Date = js.native
    def millisecondsAfter(instance: Double, d: java.lang.String, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def millisecondsAfter(instance: Double, d: Double): typingsJapgolly.sugar.Date = js.native
    def millisecondsAfter(instance: Double, d: Double, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def millisecondsAfter(instance: Double, d: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def millisecondsAfter(instance: Double, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    
    def millisecondsAgo(instance: Double): typingsJapgolly.sugar.Date = js.native
    
    def millisecondsBefore(instance: Double, d: java.lang.String): typingsJapgolly.sugar.Date = js.native
    def millisecondsBefore(instance: Double, d: java.lang.String, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def millisecondsBefore(instance: Double, d: Double): typingsJapgolly.sugar.Date = js.native
    def millisecondsBefore(instance: Double, d: Double, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def millisecondsBefore(instance: Double, d: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def millisecondsBefore(instance: Double, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    
    def millisecondsFromNow(instance: Double): typingsJapgolly.sugar.Date = js.native
    
    def minute(instance: Double): Double = js.native
    
    def minuteAfter(instance: Double, d: java.lang.String): typingsJapgolly.sugar.Date = js.native
    def minuteAfter(instance: Double, d: java.lang.String, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def minuteAfter(instance: Double, d: Double): typingsJapgolly.sugar.Date = js.native
    def minuteAfter(instance: Double, d: Double, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def minuteAfter(instance: Double, d: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def minuteAfter(instance: Double, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    
    def minuteAgo(instance: Double): typingsJapgolly.sugar.Date = js.native
    
    def minuteBefore(instance: Double, d: java.lang.String): typingsJapgolly.sugar.Date = js.native
    def minuteBefore(instance: Double, d: java.lang.String, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def minuteBefore(instance: Double, d: Double): typingsJapgolly.sugar.Date = js.native
    def minuteBefore(instance: Double, d: Double, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def minuteBefore(instance: Double, d: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def minuteBefore(instance: Double, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    
    def minuteFromNow(instance: Double): typingsJapgolly.sugar.Date = js.native
    
    def minutes(instance: Double): Double = js.native
    
    def minutesAfter(instance: Double, d: java.lang.String): typingsJapgolly.sugar.Date = js.native
    def minutesAfter(instance: Double, d: java.lang.String, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def minutesAfter(instance: Double, d: Double): typingsJapgolly.sugar.Date = js.native
    def minutesAfter(instance: Double, d: Double, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def minutesAfter(instance: Double, d: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def minutesAfter(instance: Double, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    
    def minutesAgo(instance: Double): typingsJapgolly.sugar.Date = js.native
    
    def minutesBefore(instance: Double, d: java.lang.String): typingsJapgolly.sugar.Date = js.native
    def minutesBefore(instance: Double, d: java.lang.String, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def minutesBefore(instance: Double, d: Double): typingsJapgolly.sugar.Date = js.native
    def minutesBefore(instance: Double, d: Double, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def minutesBefore(instance: Double, d: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def minutesBefore(instance: Double, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    
    def minutesFromNow(instance: Double): typingsJapgolly.sugar.Date = js.native
    
    def month(instance: Double): Double = js.native
    
    def monthAfter(instance: Double, d: java.lang.String): typingsJapgolly.sugar.Date = js.native
    def monthAfter(instance: Double, d: java.lang.String, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def monthAfter(instance: Double, d: Double): typingsJapgolly.sugar.Date = js.native
    def monthAfter(instance: Double, d: Double, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def monthAfter(instance: Double, d: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def monthAfter(instance: Double, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    
    def monthAgo(instance: Double): typingsJapgolly.sugar.Date = js.native
    
    def monthBefore(instance: Double, d: java.lang.String): typingsJapgolly.sugar.Date = js.native
    def monthBefore(instance: Double, d: java.lang.String, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def monthBefore(instance: Double, d: Double): typingsJapgolly.sugar.Date = js.native
    def monthBefore(instance: Double, d: Double, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def monthBefore(instance: Double, d: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def monthBefore(instance: Double, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    
    def monthFromNow(instance: Double): typingsJapgolly.sugar.Date = js.native
    
    def months(instance: Double): Double = js.native
    
    def monthsAfter(instance: Double, d: java.lang.String): typingsJapgolly.sugar.Date = js.native
    def monthsAfter(instance: Double, d: java.lang.String, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def monthsAfter(instance: Double, d: Double): typingsJapgolly.sugar.Date = js.native
    def monthsAfter(instance: Double, d: Double, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def monthsAfter(instance: Double, d: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def monthsAfter(instance: Double, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    
    def monthsAgo(instance: Double): typingsJapgolly.sugar.Date = js.native
    
    def monthsBefore(instance: Double, d: java.lang.String): typingsJapgolly.sugar.Date = js.native
    def monthsBefore(instance: Double, d: java.lang.String, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def monthsBefore(instance: Double, d: Double): typingsJapgolly.sugar.Date = js.native
    def monthsBefore(instance: Double, d: Double, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def monthsBefore(instance: Double, d: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def monthsBefore(instance: Double, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    
    def monthsFromNow(instance: Double): typingsJapgolly.sugar.Date = js.native
    
    def ordinalize(instance: Double): java.lang.String = js.native
    
    def pad(instance: Double): java.lang.String = js.native
    def pad(instance: Double, place: Double): java.lang.String = js.native
    def pad(instance: Double, place: Double, sign: Boolean): java.lang.String = js.native
    def pad(instance: Double, place: Double, sign: Boolean, base: Double): java.lang.String = js.native
    def pad(instance: Double, place: Double, sign: Unit, base: Double): java.lang.String = js.native
    def pad(instance: Double, place: Unit, sign: Boolean): java.lang.String = js.native
    def pad(instance: Double, place: Unit, sign: Boolean, base: Double): java.lang.String = js.native
    def pad(instance: Double, place: Unit, sign: Unit, base: Double): java.lang.String = js.native
    
    def pow(instance: Double): Double = js.native
    
    def random(): Double = js.native
    def random(n1: Double): Double = js.native
    def random(n1: Double, n2: Double): Double = js.native
    def random(n1: Unit, n2: Double): Double = js.native
    
    def range(): Range = js.native
    def range(start: Double): Range = js.native
    def range(start: Double, end: Double): Range = js.native
    def range(start: Unit, end: Double): Range = js.native
    
    def round(instance: Double): Double = js.native
    def round(instance: Double, precision: Double): Double = js.native
    
    def second(instance: Double): Double = js.native
    
    def secondAfter(instance: Double, d: java.lang.String): typingsJapgolly.sugar.Date = js.native
    def secondAfter(instance: Double, d: java.lang.String, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def secondAfter(instance: Double, d: Double): typingsJapgolly.sugar.Date = js.native
    def secondAfter(instance: Double, d: Double, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def secondAfter(instance: Double, d: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def secondAfter(instance: Double, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    
    def secondAgo(instance: Double): typingsJapgolly.sugar.Date = js.native
    
    def secondBefore(instance: Double, d: java.lang.String): typingsJapgolly.sugar.Date = js.native
    def secondBefore(instance: Double, d: java.lang.String, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def secondBefore(instance: Double, d: Double): typingsJapgolly.sugar.Date = js.native
    def secondBefore(instance: Double, d: Double, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def secondBefore(instance: Double, d: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def secondBefore(instance: Double, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    
    def secondFromNow(instance: Double): typingsJapgolly.sugar.Date = js.native
    
    def seconds(instance: Double): Double = js.native
    
    def secondsAfter(instance: Double, d: java.lang.String): typingsJapgolly.sugar.Date = js.native
    def secondsAfter(instance: Double, d: java.lang.String, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def secondsAfter(instance: Double, d: Double): typingsJapgolly.sugar.Date = js.native
    def secondsAfter(instance: Double, d: Double, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def secondsAfter(instance: Double, d: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def secondsAfter(instance: Double, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    
    def secondsAgo(instance: Double): typingsJapgolly.sugar.Date = js.native
    
    def secondsBefore(instance: Double, d: java.lang.String): typingsJapgolly.sugar.Date = js.native
    def secondsBefore(instance: Double, d: java.lang.String, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def secondsBefore(instance: Double, d: Double): typingsJapgolly.sugar.Date = js.native
    def secondsBefore(instance: Double, d: Double, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def secondsBefore(instance: Double, d: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def secondsBefore(instance: Double, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    
    def secondsFromNow(instance: Double): typingsJapgolly.sugar.Date = js.native
    
    def setOption(name: java.lang.String, value: Any): Unit = js.native
    def setOption(options: NumberOptions): Unit = js.native
    
    def sin(instance: Double): Double = js.native
    
    def sqrt(instance: Double): Double = js.native
    
    def tan(instance: Double): Double = js.native
    
    def times[T](instance: Double, indexMapFn: js.Function1[/* i */ Double, Any]): T = js.native
    
    def toNumber(instance: Double): Double = js.native
    
    def upto[T](instance: Double, num: Double): typingsJapgolly.sugar.Array[T] = js.native
    def upto[T](
      instance: Double,
      num: Double,
      everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, Unit]
    ): typingsJapgolly.sugar.Array[T] = js.native
    def upto[T](instance: Double, num: Double, step: Double): typingsJapgolly.sugar.Array[T] = js.native
    def upto[T](
      instance: Double,
      num: Double,
      step: Double,
      everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, Unit]
    ): typingsJapgolly.sugar.Array[T] = js.native
    def upto[T](
      instance: Double,
      num: Double,
      step: Unit,
      everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, Unit]
    ): typingsJapgolly.sugar.Array[T] = js.native
    
    def week(instance: Double): Double = js.native
    
    def weekAfter(instance: Double, d: java.lang.String): typingsJapgolly.sugar.Date = js.native
    def weekAfter(instance: Double, d: java.lang.String, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def weekAfter(instance: Double, d: Double): typingsJapgolly.sugar.Date = js.native
    def weekAfter(instance: Double, d: Double, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def weekAfter(instance: Double, d: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def weekAfter(instance: Double, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    
    def weekAgo(instance: Double): typingsJapgolly.sugar.Date = js.native
    
    def weekBefore(instance: Double, d: java.lang.String): typingsJapgolly.sugar.Date = js.native
    def weekBefore(instance: Double, d: java.lang.String, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def weekBefore(instance: Double, d: Double): typingsJapgolly.sugar.Date = js.native
    def weekBefore(instance: Double, d: Double, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def weekBefore(instance: Double, d: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def weekBefore(instance: Double, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    
    def weekFromNow(instance: Double): typingsJapgolly.sugar.Date = js.native
    
    def weeks(instance: Double): Double = js.native
    
    def weeksAfter(instance: Double, d: java.lang.String): typingsJapgolly.sugar.Date = js.native
    def weeksAfter(instance: Double, d: java.lang.String, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def weeksAfter(instance: Double, d: Double): typingsJapgolly.sugar.Date = js.native
    def weeksAfter(instance: Double, d: Double, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def weeksAfter(instance: Double, d: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def weeksAfter(instance: Double, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    
    def weeksAgo(instance: Double): typingsJapgolly.sugar.Date = js.native
    
    def weeksBefore(instance: Double, d: java.lang.String): typingsJapgolly.sugar.Date = js.native
    def weeksBefore(instance: Double, d: java.lang.String, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def weeksBefore(instance: Double, d: Double): typingsJapgolly.sugar.Date = js.native
    def weeksBefore(instance: Double, d: Double, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def weeksBefore(instance: Double, d: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def weeksBefore(instance: Double, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    
    def weeksFromNow(instance: Double): typingsJapgolly.sugar.Date = js.native
    
    def year(instance: Double): Double = js.native
    
    def yearAfter(instance: Double, d: java.lang.String): typingsJapgolly.sugar.Date = js.native
    def yearAfter(instance: Double, d: java.lang.String, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def yearAfter(instance: Double, d: Double): typingsJapgolly.sugar.Date = js.native
    def yearAfter(instance: Double, d: Double, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def yearAfter(instance: Double, d: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def yearAfter(instance: Double, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    
    def yearAgo(instance: Double): typingsJapgolly.sugar.Date = js.native
    
    def yearBefore(instance: Double, d: java.lang.String): typingsJapgolly.sugar.Date = js.native
    def yearBefore(instance: Double, d: java.lang.String, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def yearBefore(instance: Double, d: Double): typingsJapgolly.sugar.Date = js.native
    def yearBefore(instance: Double, d: Double, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def yearBefore(instance: Double, d: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def yearBefore(instance: Double, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    
    def yearFromNow(instance: Double): typingsJapgolly.sugar.Date = js.native
    
    def years(instance: Double): Double = js.native
    
    def yearsAfter(instance: Double, d: java.lang.String): typingsJapgolly.sugar.Date = js.native
    def yearsAfter(instance: Double, d: java.lang.String, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def yearsAfter(instance: Double, d: Double): typingsJapgolly.sugar.Date = js.native
    def yearsAfter(instance: Double, d: Double, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def yearsAfter(instance: Double, d: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def yearsAfter(instance: Double, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    
    def yearsAgo(instance: Double): typingsJapgolly.sugar.Date = js.native
    
    def yearsBefore(instance: Double, d: java.lang.String): typingsJapgolly.sugar.Date = js.native
    def yearsBefore(instance: Double, d: java.lang.String, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def yearsBefore(instance: Double, d: Double): typingsJapgolly.sugar.Date = js.native
    def yearsBefore(instance: Double, d: Double, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def yearsBefore(instance: Double, d: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def yearsBefore(instance: Double, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    
    def yearsFromNow(instance: Double): typingsJapgolly.sugar.Date = js.native
  }
  
  trait NumberOptions extends StObject {
    
    var decimal: java.lang.String
    
    var thousands: java.lang.String
  }
  object NumberOptions {
    
    inline def apply(decimal: java.lang.String, thousands: java.lang.String): NumberOptions = {
      val __obj = js.Dynamic.literal(decimal = decimal.asInstanceOf[js.Any], thousands = thousands.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberOptions]
    }
    
    extension [Self <: NumberOptions](x: Self) {
      
      inline def setDecimal(value: java.lang.String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
      
      inline def setThousands(value: java.lang.String): Self = StObject.set(x, "thousands", value.asInstanceOf[js.Any])
    }
  }
}
