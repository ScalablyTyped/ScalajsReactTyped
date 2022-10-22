package typingsJapgolly.sugar.sugarjs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.std.Intl.DateTimeFormatOptions
import typingsJapgolly.sugar.sugarjs.Object.ObjectMergeOptions
import typingsJapgolly.sugar.sugarjs.Object.QueryStringOptions
import typingsJapgolly.sugar.sugarjs.Object.mapFn
import typingsJapgolly.sugar.sugarjs.Object.searchFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Date {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.sugar.sugarjs.Object.ChainableBase because var conflicts: raw. Inlined add, add, addAll, addAll, average, average, average, count, count, defaults, defaults, every, every, exclude, exclude, filter, filter, find, find, forEach, has, has, intersect, invert, invert, isArguments, isArray, isBoolean, isDate, isEmpty, isEqual, isError, isFunction, isMap, isNumber, isObject, isRegExp, isSet, isString, keys, least, least, least, least, least, least, least, least, map, map, max, max, max, max, max, max, max, max, median, median, median, merge, merge, mergeAll, mergeAll, min, min, min, min, min, min, min, min, most, most, most, most, most, most, most, most, none, none, reduce, reduce, reject, reject, reject, reject, remove, remove, select, select, select, select, size, some, some, subtract, sum, sum, sum, tap, toQueryString, toQueryString, values */ @js.native
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
    
    def addDays(n: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def addDays(n: Double, reset: Boolean): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def addHours(n: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def addHours(n: Double, reset: Boolean): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def addMilliseconds(n: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def addMilliseconds(n: Double, reset: Boolean): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def addMinutes(n: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def addMinutes(n: Double, reset: Boolean): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def addMonths(n: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def addMonths(n: Double, reset: Boolean): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def addSeconds(n: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def addSeconds(n: Double, reset: Boolean): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def addWeeks(n: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def addWeeks(n: Double, reset: Boolean): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def addYears(n: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def addYears(n: Double, reset: Boolean): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def advance(milliseconds: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def advance(set: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def advance(set: java.lang.String, reset: Boolean): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def advance(set: js.Object): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def advance(set: js.Object, reset: Boolean): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def advance(year: Double, month: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def advance(year: Double, month: Double, day: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def advance(year: Double, month: Double, day: Double, hour: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def advance(year: Double, month: Double, day: Double, hour: Double, minute: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def advance(year: Double, month: Double, day: Double, hour: Double, minute: Double, second: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def advance(year: Double, month: Double, day: Double, hour: Double, minute: Unit, second: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def advance(year: Double, month: Double, day: Double, hour: Unit, minute: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def advance(year: Double, month: Double, day: Double, hour: Unit, minute: Double, second: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def advance(year: Double, month: Double, day: Double, hour: Unit, minute: Unit, second: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def advance(year: Double, month: Double, day: Unit, hour: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def advance(year: Double, month: Double, day: Unit, hour: Double, minute: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def advance(year: Double, month: Double, day: Unit, hour: Double, minute: Double, second: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def advance(year: Double, month: Double, day: Unit, hour: Double, minute: Unit, second: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def advance(year: Double, month: Double, day: Unit, hour: Unit, minute: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def advance(year: Double, month: Double, day: Unit, hour: Unit, minute: Double, second: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def advance(year: Double, month: Double, day: Unit, hour: Unit, minute: Unit, second: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def beginningOfDay(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def beginningOfDay(localeCode: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def beginningOfISOWeek(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def beginningOfMonth(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def beginningOfMonth(localeCode: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def beginningOfWeek(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def beginningOfWeek(localeCode: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def beginningOfYear(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def beginningOfYear(localeCode: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def daysAgo(): SugarDefaultChainable[Double] = js.native
    
    def daysFromNow(): SugarDefaultChainable[Double] = js.native
    
    def daysInMonth(): SugarDefaultChainable[Double] = js.native
    
    def daysSince(d: java.lang.String): SugarDefaultChainable[Double] = js.native
    def daysSince(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def daysSince(d: Double): SugarDefaultChainable[Double] = js.native
    def daysSince(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def daysSince(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[Double] = js.native
    def daysSince(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    
    def daysUntil(): SugarDefaultChainable[Double] = js.native
    def daysUntil(d: java.lang.String): SugarDefaultChainable[Double] = js.native
    def daysUntil(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def daysUntil(d: Double): SugarDefaultChainable[Double] = js.native
    def daysUntil(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def daysUntil(d: Unit, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def daysUntil(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[Double] = js.native
    def daysUntil(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    
    def endOfDay(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def endOfDay(localeCode: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def endOfISOWeek(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def endOfMonth(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def endOfMonth(localeCode: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def endOfWeek(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def endOfWeek(localeCode: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def endOfYear(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def endOfYear(localeCode: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def format(): SugarDefaultChainable[java.lang.String] = js.native
    def format(f: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def format(f: java.lang.String, localeCode: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def format(f: Unit, localeCode: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    
    def full(): SugarDefaultChainable[java.lang.String] = js.native
    def full(localeCode: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    
    def get(d: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def get(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def get(d: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def get(d: Double, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def get(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def get(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def getDate(): SugarDefaultChainable[Double] = js.native
    
    def getDay(): SugarDefaultChainable[Double] = js.native
    
    def getFullYear(): SugarDefaultChainable[Double] = js.native
    
    def getHours(): SugarDefaultChainable[Double] = js.native
    
    def getISOWeek(): SugarDefaultChainable[Double] = js.native
    
    def getMilliseconds(): SugarDefaultChainable[Double] = js.native
    
    def getMinutes(): SugarDefaultChainable[Double] = js.native
    
    def getMonth(): SugarDefaultChainable[Double] = js.native
    
    def getSeconds(): SugarDefaultChainable[Double] = js.native
    
    def getTime(): SugarDefaultChainable[Double] = js.native
    
    def getTimezoneOffset(): SugarDefaultChainable[Double] = js.native
    
    def getUTCDate(): SugarDefaultChainable[Double] = js.native
    
    def getUTCDay(): SugarDefaultChainable[Double] = js.native
    
    def getUTCFullYear(): SugarDefaultChainable[Double] = js.native
    
    def getUTCHours(): SugarDefaultChainable[Double] = js.native
    
    def getUTCMilliseconds(): SugarDefaultChainable[Double] = js.native
    
    def getUTCMinutes(): SugarDefaultChainable[Double] = js.native
    
    def getUTCMonth(): SugarDefaultChainable[Double] = js.native
    
    def getUTCOffset(): SugarDefaultChainable[java.lang.String] = js.native
    def getUTCOffset(iso: Boolean): SugarDefaultChainable[java.lang.String] = js.native
    
    def getUTCSeconds(): SugarDefaultChainable[Double] = js.native
    
    def getUTCWeekday(): SugarDefaultChainable[Double] = js.native
    
    def getWeekday(): SugarDefaultChainable[Double] = js.native
    
    def hoursAgo(): SugarDefaultChainable[Double] = js.native
    
    def hoursFromNow(): SugarDefaultChainable[Double] = js.native
    
    def hoursSince(d: java.lang.String): SugarDefaultChainable[Double] = js.native
    def hoursSince(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def hoursSince(d: Double): SugarDefaultChainable[Double] = js.native
    def hoursSince(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def hoursSince(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[Double] = js.native
    def hoursSince(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    
    def hoursUntil(): SugarDefaultChainable[Double] = js.native
    def hoursUntil(d: java.lang.String): SugarDefaultChainable[Double] = js.native
    def hoursUntil(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def hoursUntil(d: Double): SugarDefaultChainable[Double] = js.native
    def hoursUntil(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def hoursUntil(d: Unit, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def hoursUntil(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[Double] = js.native
    def hoursUntil(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    
    def is(d: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    def is(d: java.lang.String, margin: Double): SugarDefaultChainable[Boolean] = js.native
    def is(d: Double): SugarDefaultChainable[Boolean] = js.native
    def is(d: Double, margin: Double): SugarDefaultChainable[Boolean] = js.native
    def is(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[Boolean] = js.native
    def is(d: typingsJapgolly.sugar.Date, margin: Double): SugarDefaultChainable[Boolean] = js.native
    
    def isAfter(d: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    def isAfter(d: java.lang.String, margin: Double): SugarDefaultChainable[Boolean] = js.native
    def isAfter(d: Double): SugarDefaultChainable[Boolean] = js.native
    def isAfter(d: Double, margin: Double): SugarDefaultChainable[Boolean] = js.native
    def isAfter(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[Boolean] = js.native
    def isAfter(d: typingsJapgolly.sugar.Date, margin: Double): SugarDefaultChainable[Boolean] = js.native
    
    def isBefore(d: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    def isBefore(d: java.lang.String, margin: Double): SugarDefaultChainable[Boolean] = js.native
    def isBefore(d: Double): SugarDefaultChainable[Boolean] = js.native
    def isBefore(d: Double, margin: Double): SugarDefaultChainable[Boolean] = js.native
    def isBefore(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[Boolean] = js.native
    def isBefore(d: typingsJapgolly.sugar.Date, margin: Double): SugarDefaultChainable[Boolean] = js.native
    
    def isBetween(d1: java.lang.String, d2: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    def isBetween(d1: java.lang.String, d2: java.lang.String, margin: Double): SugarDefaultChainable[Boolean] = js.native
    def isBetween(d1: java.lang.String, d2: Double): SugarDefaultChainable[Boolean] = js.native
    def isBetween(d1: java.lang.String, d2: Double, margin: Double): SugarDefaultChainable[Boolean] = js.native
    def isBetween(d1: java.lang.String, d2: typingsJapgolly.sugar.Date): SugarDefaultChainable[Boolean] = js.native
    def isBetween(d1: java.lang.String, d2: typingsJapgolly.sugar.Date, margin: Double): SugarDefaultChainable[Boolean] = js.native
    def isBetween(d1: Double, d2: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    def isBetween(d1: Double, d2: java.lang.String, margin: Double): SugarDefaultChainable[Boolean] = js.native
    def isBetween(d1: Double, d2: Double): SugarDefaultChainable[Boolean] = js.native
    def isBetween(d1: Double, d2: Double, margin: Double): SugarDefaultChainable[Boolean] = js.native
    def isBetween(d1: Double, d2: typingsJapgolly.sugar.Date): SugarDefaultChainable[Boolean] = js.native
    def isBetween(d1: Double, d2: typingsJapgolly.sugar.Date, margin: Double): SugarDefaultChainable[Boolean] = js.native
    def isBetween(d1: typingsJapgolly.sugar.Date, d2: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    def isBetween(d1: typingsJapgolly.sugar.Date, d2: java.lang.String, margin: Double): SugarDefaultChainable[Boolean] = js.native
    def isBetween(d1: typingsJapgolly.sugar.Date, d2: Double): SugarDefaultChainable[Boolean] = js.native
    def isBetween(d1: typingsJapgolly.sugar.Date, d2: Double, margin: Double): SugarDefaultChainable[Boolean] = js.native
    def isBetween(d1: typingsJapgolly.sugar.Date, d2: typingsJapgolly.sugar.Date): SugarDefaultChainable[Boolean] = js.native
    def isBetween(d1: typingsJapgolly.sugar.Date, d2: typingsJapgolly.sugar.Date, margin: Double): SugarDefaultChainable[Boolean] = js.native
    
    def isFriday(): SugarDefaultChainable[Boolean] = js.native
    
    def isFuture(): SugarDefaultChainable[Boolean] = js.native
    
    def isLastMonth(): SugarDefaultChainable[Boolean] = js.native
    def isLastMonth(localeCode: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    
    def isLastWeek(): SugarDefaultChainable[Boolean] = js.native
    def isLastWeek(localeCode: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    
    def isLastYear(): SugarDefaultChainable[Boolean] = js.native
    def isLastYear(localeCode: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    
    def isLeapYear(): SugarDefaultChainable[Boolean] = js.native
    
    def isMonday(): SugarDefaultChainable[Boolean] = js.native
    
    def isNextMonth(): SugarDefaultChainable[Boolean] = js.native
    def isNextMonth(localeCode: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    
    def isNextWeek(): SugarDefaultChainable[Boolean] = js.native
    def isNextWeek(localeCode: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    
    def isNextYear(): SugarDefaultChainable[Boolean] = js.native
    def isNextYear(localeCode: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    
    def isPast(): SugarDefaultChainable[Boolean] = js.native
    
    def isSaturday(): SugarDefaultChainable[Boolean] = js.native
    
    def isSunday(): SugarDefaultChainable[Boolean] = js.native
    
    def isThisMonth(): SugarDefaultChainable[Boolean] = js.native
    def isThisMonth(localeCode: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    
    def isThisWeek(): SugarDefaultChainable[Boolean] = js.native
    def isThisWeek(localeCode: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    
    def isThisYear(): SugarDefaultChainable[Boolean] = js.native
    def isThisYear(localeCode: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    
    def isThursday(): SugarDefaultChainable[Boolean] = js.native
    
    def isToday(): SugarDefaultChainable[Boolean] = js.native
    
    def isTomorrow(): SugarDefaultChainable[Boolean] = js.native
    
    def isTuesday(): SugarDefaultChainable[Boolean] = js.native
    
    def isUTC(): SugarDefaultChainable[Boolean] = js.native
    
    def isValid(): SugarDefaultChainable[Boolean] = js.native
    
    def isWednesday(): SugarDefaultChainable[Boolean] = js.native
    
    def isWeekday(): SugarDefaultChainable[Boolean] = js.native
    
    def isWeekend(): SugarDefaultChainable[Boolean] = js.native
    
    def isYesterday(): SugarDefaultChainable[Boolean] = js.native
    
    def iso(): SugarDefaultChainable[java.lang.String] = js.native
    
    def long(): SugarDefaultChainable[java.lang.String] = js.native
    def long(localeCode: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    
    def medium(): SugarDefaultChainable[java.lang.String] = js.native
    def medium(localeCode: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    
    def millisecondsAgo(): SugarDefaultChainable[Double] = js.native
    
    def millisecondsFromNow(): SugarDefaultChainable[Double] = js.native
    
    def millisecondsSince(d: java.lang.String): SugarDefaultChainable[Double] = js.native
    def millisecondsSince(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def millisecondsSince(d: Double): SugarDefaultChainable[Double] = js.native
    def millisecondsSince(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def millisecondsSince(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[Double] = js.native
    def millisecondsSince(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    
    def millisecondsUntil(): SugarDefaultChainable[Double] = js.native
    def millisecondsUntil(d: java.lang.String): SugarDefaultChainable[Double] = js.native
    def millisecondsUntil(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def millisecondsUntil(d: Double): SugarDefaultChainable[Double] = js.native
    def millisecondsUntil(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def millisecondsUntil(d: Unit, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def millisecondsUntil(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[Double] = js.native
    def millisecondsUntil(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    
    def minutesAgo(): SugarDefaultChainable[Double] = js.native
    
    def minutesFromNow(): SugarDefaultChainable[Double] = js.native
    
    def minutesSince(d: java.lang.String): SugarDefaultChainable[Double] = js.native
    def minutesSince(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def minutesSince(d: Double): SugarDefaultChainable[Double] = js.native
    def minutesSince(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def minutesSince(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[Double] = js.native
    def minutesSince(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    
    def minutesUntil(): SugarDefaultChainable[Double] = js.native
    def minutesUntil(d: java.lang.String): SugarDefaultChainable[Double] = js.native
    def minutesUntil(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def minutesUntil(d: Double): SugarDefaultChainable[Double] = js.native
    def minutesUntil(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def minutesUntil(d: Unit, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def minutesUntil(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[Double] = js.native
    def minutesUntil(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    
    def monthsAgo(): SugarDefaultChainable[Double] = js.native
    
    def monthsFromNow(): SugarDefaultChainable[Double] = js.native
    
    def monthsSince(d: java.lang.String): SugarDefaultChainable[Double] = js.native
    def monthsSince(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def monthsSince(d: Double): SugarDefaultChainable[Double] = js.native
    def monthsSince(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def monthsSince(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[Double] = js.native
    def monthsSince(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    
    def monthsUntil(): SugarDefaultChainable[Double] = js.native
    def monthsUntil(d: java.lang.String): SugarDefaultChainable[Double] = js.native
    def monthsUntil(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def monthsUntil(d: Double): SugarDefaultChainable[Double] = js.native
    def monthsUntil(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def monthsUntil(d: Unit, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def monthsUntil(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[Double] = js.native
    def monthsUntil(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    
    var raw: RawValue = js.native
    
    def relative(): SugarDefaultChainable[java.lang.String] = js.native
    def relative(localeCode: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def relative(
      localeCode: java.lang.String,
      relativeFn: js.Function4[
          /* num */ Double, 
          /* unit */ Double, 
          /* ms */ Double, 
          /* loc */ Locale, 
          SugarDefaultChainable[java.lang.String]
        ]
    ): SugarDefaultChainable[java.lang.String] = js.native
    def relative(
      localeCode: Unit,
      relativeFn: js.Function4[
          /* num */ Double, 
          /* unit */ Double, 
          /* ms */ Double, 
          /* loc */ Locale, 
          SugarDefaultChainable[java.lang.String]
        ]
    ): SugarDefaultChainable[java.lang.String] = js.native
    def relative(
      relativeFn: js.Function4[
          /* num */ Double, 
          /* unit */ Double, 
          /* ms */ Double, 
          /* loc */ Locale, 
          SugarDefaultChainable[java.lang.String]
        ]
    ): SugarDefaultChainable[java.lang.String] = js.native
    
    def relativeTo(d: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def relativeTo(d: java.lang.String, localeCode: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def relativeTo(d: Double): SugarDefaultChainable[java.lang.String] = js.native
    def relativeTo(d: Double, localeCode: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def relativeTo(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[java.lang.String] = js.native
    def relativeTo(d: typingsJapgolly.sugar.Date, localeCode: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    
    def reset(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def reset(unit: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def reset(unit: java.lang.String, localeCode: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def reset(unit: Unit, localeCode: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def rewind(milliseconds: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def rewind(set: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def rewind(set: java.lang.String, reset: Boolean): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def rewind(set: js.Object): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def rewind(set: js.Object, reset: Boolean): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def rewind(year: Double, month: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def rewind(year: Double, month: Double, day: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def rewind(year: Double, month: Double, day: Double, hour: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def rewind(year: Double, month: Double, day: Double, hour: Double, minute: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def rewind(year: Double, month: Double, day: Double, hour: Double, minute: Double, second: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def rewind(year: Double, month: Double, day: Double, hour: Double, minute: Unit, second: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def rewind(year: Double, month: Double, day: Double, hour: Unit, minute: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def rewind(year: Double, month: Double, day: Double, hour: Unit, minute: Double, second: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def rewind(year: Double, month: Double, day: Double, hour: Unit, minute: Unit, second: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def rewind(year: Double, month: Double, day: Unit, hour: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def rewind(year: Double, month: Double, day: Unit, hour: Double, minute: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def rewind(year: Double, month: Double, day: Unit, hour: Double, minute: Double, second: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def rewind(year: Double, month: Double, day: Unit, hour: Double, minute: Unit, second: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def rewind(year: Double, month: Double, day: Unit, hour: Unit, minute: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def rewind(year: Double, month: Double, day: Unit, hour: Unit, minute: Double, second: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def rewind(year: Double, month: Double, day: Unit, hour: Unit, minute: Unit, second: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def secondsAgo(): SugarDefaultChainable[Double] = js.native
    
    def secondsFromNow(): SugarDefaultChainable[Double] = js.native
    
    def secondsSince(d: java.lang.String): SugarDefaultChainable[Double] = js.native
    def secondsSince(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def secondsSince(d: Double): SugarDefaultChainable[Double] = js.native
    def secondsSince(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def secondsSince(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[Double] = js.native
    def secondsSince(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    
    def secondsUntil(): SugarDefaultChainable[Double] = js.native
    def secondsUntil(d: java.lang.String): SugarDefaultChainable[Double] = js.native
    def secondsUntil(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def secondsUntil(d: Double): SugarDefaultChainable[Double] = js.native
    def secondsUntil(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def secondsUntil(d: Unit, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def secondsUntil(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[Double] = js.native
    def secondsUntil(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    
    def set(milliseconds: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def set(set: js.Object): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def set(set: js.Object, reset: Boolean): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def set(year: Double, month: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def set(year: Double, month: Double, day: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def set(year: Double, month: Double, day: Double, hour: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def set(year: Double, month: Double, day: Double, hour: Double, minute: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def set(year: Double, month: Double, day: Double, hour: Double, minute: Double, second: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def set(year: Double, month: Double, day: Double, hour: Double, minute: Unit, second: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def set(year: Double, month: Double, day: Double, hour: Unit, minute: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def set(year: Double, month: Double, day: Double, hour: Unit, minute: Double, second: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def set(year: Double, month: Double, day: Double, hour: Unit, minute: Unit, second: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def set(year: Double, month: Double, day: Unit, hour: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def set(year: Double, month: Double, day: Unit, hour: Double, minute: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def set(year: Double, month: Double, day: Unit, hour: Double, minute: Double, second: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def set(year: Double, month: Double, day: Unit, hour: Double, minute: Unit, second: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def set(year: Double, month: Double, day: Unit, hour: Unit, minute: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def set(year: Double, month: Double, day: Unit, hour: Unit, minute: Double, second: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def set(year: Double, month: Double, day: Unit, hour: Unit, minute: Unit, second: Double): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def setDate(date: Double): SugarDefaultChainable[Double] = js.native
    
    def setFullYear(year: Double): SugarDefaultChainable[Double] = js.native
    def setFullYear(year: Double, month: Double): SugarDefaultChainable[Double] = js.native
    def setFullYear(year: Double, month: Double, date: Double): SugarDefaultChainable[Double] = js.native
    def setFullYear(year: Double, month: Unit, date: Double): SugarDefaultChainable[Double] = js.native
    
    def setHours(hours: Double): SugarDefaultChainable[Double] = js.native
    def setHours(hours: Double, min: Double): SugarDefaultChainable[Double] = js.native
    def setHours(hours: Double, min: Double, sec: Double): SugarDefaultChainable[Double] = js.native
    def setHours(hours: Double, min: Double, sec: Double, ms: Double): SugarDefaultChainable[Double] = js.native
    def setHours(hours: Double, min: Double, sec: Unit, ms: Double): SugarDefaultChainable[Double] = js.native
    def setHours(hours: Double, min: Unit, sec: Double): SugarDefaultChainable[Double] = js.native
    def setHours(hours: Double, min: Unit, sec: Double, ms: Double): SugarDefaultChainable[Double] = js.native
    def setHours(hours: Double, min: Unit, sec: Unit, ms: Double): SugarDefaultChainable[Double] = js.native
    
    def setISOWeek(num: Double): SugarDefaultChainable[Unit] = js.native
    
    def setMilliseconds(ms: Double): SugarDefaultChainable[Double] = js.native
    
    def setMinutes(min: Double): SugarDefaultChainable[Double] = js.native
    def setMinutes(min: Double, sec: Double): SugarDefaultChainable[Double] = js.native
    def setMinutes(min: Double, sec: Double, ms: Double): SugarDefaultChainable[Double] = js.native
    def setMinutes(min: Double, sec: Unit, ms: Double): SugarDefaultChainable[Double] = js.native
    
    def setMonth(month: Double): SugarDefaultChainable[Double] = js.native
    def setMonth(month: Double, date: Double): SugarDefaultChainable[Double] = js.native
    
    def setSeconds(sec: Double): SugarDefaultChainable[Double] = js.native
    def setSeconds(sec: Double, ms: Double): SugarDefaultChainable[Double] = js.native
    
    def setTime(time: Double): SugarDefaultChainable[Double] = js.native
    
    def setUTC(): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    def setUTC(on: Boolean): SugarDefaultChainable[typingsJapgolly.sugar.Date] = js.native
    
    def setUTCDate(date: Double): SugarDefaultChainable[Double] = js.native
    
    def setUTCFullYear(year: Double): SugarDefaultChainable[Double] = js.native
    def setUTCFullYear(year: Double, month: Double): SugarDefaultChainable[Double] = js.native
    def setUTCFullYear(year: Double, month: Double, date: Double): SugarDefaultChainable[Double] = js.native
    def setUTCFullYear(year: Double, month: Unit, date: Double): SugarDefaultChainable[Double] = js.native
    
    def setUTCHours(hours: Double): SugarDefaultChainable[Double] = js.native
    def setUTCHours(hours: Double, min: Double): SugarDefaultChainable[Double] = js.native
    def setUTCHours(hours: Double, min: Double, sec: Double): SugarDefaultChainable[Double] = js.native
    def setUTCHours(hours: Double, min: Double, sec: Double, ms: Double): SugarDefaultChainable[Double] = js.native
    def setUTCHours(hours: Double, min: Double, sec: Unit, ms: Double): SugarDefaultChainable[Double] = js.native
    def setUTCHours(hours: Double, min: Unit, sec: Double): SugarDefaultChainable[Double] = js.native
    def setUTCHours(hours: Double, min: Unit, sec: Double, ms: Double): SugarDefaultChainable[Double] = js.native
    def setUTCHours(hours: Double, min: Unit, sec: Unit, ms: Double): SugarDefaultChainable[Double] = js.native
    
    def setUTCMilliseconds(ms: Double): SugarDefaultChainable[Double] = js.native
    
    def setUTCMinutes(min: Double): SugarDefaultChainable[Double] = js.native
    def setUTCMinutes(min: Double, sec: Double): SugarDefaultChainable[Double] = js.native
    def setUTCMinutes(min: Double, sec: Double, ms: Double): SugarDefaultChainable[Double] = js.native
    def setUTCMinutes(min: Double, sec: Unit, ms: Double): SugarDefaultChainable[Double] = js.native
    
    def setUTCMonth(month: Double): SugarDefaultChainable[Double] = js.native
    def setUTCMonth(month: Double, date: Double): SugarDefaultChainable[Double] = js.native
    
    def setUTCSeconds(sec: Double): SugarDefaultChainable[Double] = js.native
    def setUTCSeconds(sec: Double, ms: Double): SugarDefaultChainable[Double] = js.native
    
    def setWeekday(dow: Double): SugarDefaultChainable[Unit] = js.native
    
    def short(): SugarDefaultChainable[java.lang.String] = js.native
    def short(localeCode: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    
    def toDateString(): SugarDefaultChainable[java.lang.String] = js.native
    
    def toISOString(): SugarDefaultChainable[java.lang.String] = js.native
    
    def toJSON(): SugarDefaultChainable[java.lang.String] = js.native
    def toJSON(key: Any): SugarDefaultChainable[java.lang.String] = js.native
    
    def toLocaleDateString(): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleDateString(locales: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleDateString(locales: java.lang.String, options: DateTimeFormatOptions): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleDateString(locales: Unit, options: DateTimeFormatOptions): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleDateString(locales: typingsJapgolly.sugar.Array[java.lang.String]): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleDateString(locales: typingsJapgolly.sugar.Array[java.lang.String], options: DateTimeFormatOptions): SugarDefaultChainable[java.lang.String] = js.native
    
    def toLocaleString(locales: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleString(locales: java.lang.String, options: DateTimeFormatOptions): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleString(locales: Unit, options: DateTimeFormatOptions): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleString(locales: typingsJapgolly.sugar.Array[java.lang.String]): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleString(locales: typingsJapgolly.sugar.Array[java.lang.String], options: DateTimeFormatOptions): SugarDefaultChainable[java.lang.String] = js.native
    
    def toLocaleTimeString(): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleTimeString(locales: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleTimeString(locales: java.lang.String, options: DateTimeFormatOptions): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleTimeString(locales: Unit, options: DateTimeFormatOptions): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleTimeString(locales: typingsJapgolly.sugar.Array[java.lang.String]): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleTimeString(locales: typingsJapgolly.sugar.Array[java.lang.String], options: DateTimeFormatOptions): SugarDefaultChainable[java.lang.String] = js.native
    
    def toTimeString(): SugarDefaultChainable[java.lang.String] = js.native
    
    def toUTCString(): SugarDefaultChainable[java.lang.String] = js.native
    
    def weeksAgo(): SugarDefaultChainable[Double] = js.native
    
    def weeksFromNow(): SugarDefaultChainable[Double] = js.native
    
    def weeksSince(d: java.lang.String): SugarDefaultChainable[Double] = js.native
    def weeksSince(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def weeksSince(d: Double): SugarDefaultChainable[Double] = js.native
    def weeksSince(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def weeksSince(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[Double] = js.native
    def weeksSince(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    
    def weeksUntil(): SugarDefaultChainable[Double] = js.native
    def weeksUntil(d: java.lang.String): SugarDefaultChainable[Double] = js.native
    def weeksUntil(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def weeksUntil(d: Double): SugarDefaultChainable[Double] = js.native
    def weeksUntil(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def weeksUntil(d: Unit, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def weeksUntil(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[Double] = js.native
    def weeksUntil(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    
    def yearsAgo(): SugarDefaultChainable[Double] = js.native
    
    def yearsFromNow(): SugarDefaultChainable[Double] = js.native
    
    def yearsSince(d: java.lang.String): SugarDefaultChainable[Double] = js.native
    def yearsSince(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def yearsSince(d: Double): SugarDefaultChainable[Double] = js.native
    def yearsSince(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def yearsSince(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[Double] = js.native
    def yearsSince(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    
    def yearsUntil(): SugarDefaultChainable[Double] = js.native
    def yearsUntil(d: java.lang.String): SugarDefaultChainable[Double] = js.native
    def yearsUntil(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def yearsUntil(d: Double): SugarDefaultChainable[Double] = js.native
    def yearsUntil(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def yearsUntil(d: Unit, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def yearsUntil(d: typingsJapgolly.sugar.Date): SugarDefaultChainable[Double] = js.native
    def yearsUntil(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  }
  
  @js.native
  trait Constructor
    extends StObject
       with SugarNamespace
       with Instantiable0[Chainable[typingsJapgolly.sugar.Date]]
       with Instantiable1[
          (/* d */ typingsJapgolly.sugar.Date) | (/* d */ Double) | (/* d */ java.lang.String), 
          Chainable[typingsJapgolly.sugar.Date]
        ]
       with Instantiable2[
          (/* d */ typingsJapgolly.sugar.Date) | (/* d */ Double) | (/* d */ java.lang.String) | (/* d */ Unit), 
          /* options */ DateCreateOptions, 
          Chainable[typingsJapgolly.sugar.Date]
        ] {
    
    def apply(): Chainable[typingsJapgolly.sugar.Date] = js.native
    def apply(d: java.lang.String): Chainable[typingsJapgolly.sugar.Date] = js.native
    def apply(d: java.lang.String, options: DateCreateOptions): Chainable[typingsJapgolly.sugar.Date] = js.native
    def apply(d: Double): Chainable[typingsJapgolly.sugar.Date] = js.native
    def apply(d: Double, options: DateCreateOptions): Chainable[typingsJapgolly.sugar.Date] = js.native
    def apply(d: Unit, options: DateCreateOptions): Chainable[typingsJapgolly.sugar.Date] = js.native
    def apply(d: typingsJapgolly.sugar.Date): Chainable[typingsJapgolly.sugar.Date] = js.native
    def apply(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): Chainable[typingsJapgolly.sugar.Date] = js.native
    
    def addDays(instance: typingsJapgolly.sugar.Date, n: Double): typingsJapgolly.sugar.Date = js.native
    def addDays(instance: typingsJapgolly.sugar.Date, n: Double, reset: Boolean): typingsJapgolly.sugar.Date = js.native
    
    def addHours(instance: typingsJapgolly.sugar.Date, n: Double): typingsJapgolly.sugar.Date = js.native
    def addHours(instance: typingsJapgolly.sugar.Date, n: Double, reset: Boolean): typingsJapgolly.sugar.Date = js.native
    
    def addLocale(localeCode: java.lang.String, `def`: js.Object): Locale = js.native
    
    def addMilliseconds(instance: typingsJapgolly.sugar.Date, n: Double): typingsJapgolly.sugar.Date = js.native
    def addMilliseconds(instance: typingsJapgolly.sugar.Date, n: Double, reset: Boolean): typingsJapgolly.sugar.Date = js.native
    
    def addMinutes(instance: typingsJapgolly.sugar.Date, n: Double): typingsJapgolly.sugar.Date = js.native
    def addMinutes(instance: typingsJapgolly.sugar.Date, n: Double, reset: Boolean): typingsJapgolly.sugar.Date = js.native
    
    def addMonths(instance: typingsJapgolly.sugar.Date, n: Double): typingsJapgolly.sugar.Date = js.native
    def addMonths(instance: typingsJapgolly.sugar.Date, n: Double, reset: Boolean): typingsJapgolly.sugar.Date = js.native
    
    def addSeconds(instance: typingsJapgolly.sugar.Date, n: Double): typingsJapgolly.sugar.Date = js.native
    def addSeconds(instance: typingsJapgolly.sugar.Date, n: Double, reset: Boolean): typingsJapgolly.sugar.Date = js.native
    
    def addWeeks(instance: typingsJapgolly.sugar.Date, n: Double): typingsJapgolly.sugar.Date = js.native
    def addWeeks(instance: typingsJapgolly.sugar.Date, n: Double, reset: Boolean): typingsJapgolly.sugar.Date = js.native
    
    def addYears(instance: typingsJapgolly.sugar.Date, n: Double): typingsJapgolly.sugar.Date = js.native
    def addYears(instance: typingsJapgolly.sugar.Date, n: Double, reset: Boolean): typingsJapgolly.sugar.Date = js.native
    
    def advance(instance: typingsJapgolly.sugar.Date, milliseconds: Double): typingsJapgolly.sugar.Date = js.native
    def advance(instance: typingsJapgolly.sugar.Date, set: java.lang.String): typingsJapgolly.sugar.Date = js.native
    def advance(instance: typingsJapgolly.sugar.Date, set: java.lang.String, reset: Boolean): typingsJapgolly.sugar.Date = js.native
    def advance(instance: typingsJapgolly.sugar.Date, set: js.Object): typingsJapgolly.sugar.Date = js.native
    def advance(instance: typingsJapgolly.sugar.Date, set: js.Object, reset: Boolean): typingsJapgolly.sugar.Date = js.native
    def advance(instance: typingsJapgolly.sugar.Date, year: Double, month: Double): typingsJapgolly.sugar.Date = js.native
    def advance(instance: typingsJapgolly.sugar.Date, year: Double, month: Double, day: Double): typingsJapgolly.sugar.Date = js.native
    def advance(instance: typingsJapgolly.sugar.Date, year: Double, month: Double, day: Double, hour: Double): typingsJapgolly.sugar.Date = js.native
    def advance(
      instance: typingsJapgolly.sugar.Date,
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Double
    ): typingsJapgolly.sugar.Date = js.native
    def advance(
      instance: typingsJapgolly.sugar.Date,
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Double,
      second: Double
    ): typingsJapgolly.sugar.Date = js.native
    def advance(
      instance: typingsJapgolly.sugar.Date,
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Unit,
      second: Double
    ): typingsJapgolly.sugar.Date = js.native
    def advance(
      instance: typingsJapgolly.sugar.Date,
      year: Double,
      month: Double,
      day: Double,
      hour: Unit,
      minute: Double
    ): typingsJapgolly.sugar.Date = js.native
    def advance(
      instance: typingsJapgolly.sugar.Date,
      year: Double,
      month: Double,
      day: Double,
      hour: Unit,
      minute: Double,
      second: Double
    ): typingsJapgolly.sugar.Date = js.native
    def advance(
      instance: typingsJapgolly.sugar.Date,
      year: Double,
      month: Double,
      day: Double,
      hour: Unit,
      minute: Unit,
      second: Double
    ): typingsJapgolly.sugar.Date = js.native
    def advance(instance: typingsJapgolly.sugar.Date, year: Double, month: Double, day: Unit, hour: Double): typingsJapgolly.sugar.Date = js.native
    def advance(
      instance: typingsJapgolly.sugar.Date,
      year: Double,
      month: Double,
      day: Unit,
      hour: Double,
      minute: Double
    ): typingsJapgolly.sugar.Date = js.native
    def advance(
      instance: typingsJapgolly.sugar.Date,
      year: Double,
      month: Double,
      day: Unit,
      hour: Double,
      minute: Double,
      second: Double
    ): typingsJapgolly.sugar.Date = js.native
    def advance(
      instance: typingsJapgolly.sugar.Date,
      year: Double,
      month: Double,
      day: Unit,
      hour: Double,
      minute: Unit,
      second: Double
    ): typingsJapgolly.sugar.Date = js.native
    def advance(
      instance: typingsJapgolly.sugar.Date,
      year: Double,
      month: Double,
      day: Unit,
      hour: Unit,
      minute: Double
    ): typingsJapgolly.sugar.Date = js.native
    def advance(
      instance: typingsJapgolly.sugar.Date,
      year: Double,
      month: Double,
      day: Unit,
      hour: Unit,
      minute: Double,
      second: Double
    ): typingsJapgolly.sugar.Date = js.native
    def advance(
      instance: typingsJapgolly.sugar.Date,
      year: Double,
      month: Double,
      day: Unit,
      hour: Unit,
      minute: Unit,
      second: Double
    ): typingsJapgolly.sugar.Date = js.native
    
    def beginningOfDay(instance: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def beginningOfDay(instance: typingsJapgolly.sugar.Date, localeCode: java.lang.String): typingsJapgolly.sugar.Date = js.native
    
    def beginningOfISOWeek(instance: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    
    def beginningOfMonth(instance: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def beginningOfMonth(instance: typingsJapgolly.sugar.Date, localeCode: java.lang.String): typingsJapgolly.sugar.Date = js.native
    
    def beginningOfWeek(instance: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def beginningOfWeek(instance: typingsJapgolly.sugar.Date, localeCode: java.lang.String): typingsJapgolly.sugar.Date = js.native
    
    def beginningOfYear(instance: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def beginningOfYear(instance: typingsJapgolly.sugar.Date, localeCode: java.lang.String): typingsJapgolly.sugar.Date = js.native
    
    def clone(instance: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    
    def create(): typingsJapgolly.sugar.Date = js.native
    def create(d: java.lang.String): typingsJapgolly.sugar.Date = js.native
    def create(d: java.lang.String, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def create(d: Double): typingsJapgolly.sugar.Date = js.native
    def create(d: Double, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def create(d: Unit, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def create(d: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def create(d: typingsJapgolly.sugar.Date, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    
    def daysAgo(instance: typingsJapgolly.sugar.Date): Double = js.native
    
    def daysFromNow(instance: typingsJapgolly.sugar.Date): Double = js.native
    
    def daysInMonth(instance: typingsJapgolly.sugar.Date): Double = js.native
    
    def daysSince(instance: typingsJapgolly.sugar.Date, d: java.lang.String): Double = js.native
    def daysSince(instance: typingsJapgolly.sugar.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
    def daysSince(instance: typingsJapgolly.sugar.Date, d: Double): Double = js.native
    def daysSince(instance: typingsJapgolly.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
    def daysSince(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date): Double = js.native
    def daysSince(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): Double = js.native
    
    def daysUntil(instance: typingsJapgolly.sugar.Date): Double = js.native
    def daysUntil(instance: typingsJapgolly.sugar.Date, d: java.lang.String): Double = js.native
    def daysUntil(instance: typingsJapgolly.sugar.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
    def daysUntil(instance: typingsJapgolly.sugar.Date, d: Double): Double = js.native
    def daysUntil(instance: typingsJapgolly.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
    def daysUntil(instance: typingsJapgolly.sugar.Date, d: Unit, options: DateCreateOptions): Double = js.native
    def daysUntil(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date): Double = js.native
    def daysUntil(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): Double = js.native
    
    def endOfDay(instance: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def endOfDay(instance: typingsJapgolly.sugar.Date, localeCode: java.lang.String): typingsJapgolly.sugar.Date = js.native
    
    def endOfISOWeek(instance: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    
    def endOfMonth(instance: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def endOfMonth(instance: typingsJapgolly.sugar.Date, localeCode: java.lang.String): typingsJapgolly.sugar.Date = js.native
    
    def endOfWeek(instance: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def endOfWeek(instance: typingsJapgolly.sugar.Date, localeCode: java.lang.String): typingsJapgolly.sugar.Date = js.native
    
    def endOfYear(instance: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def endOfYear(instance: typingsJapgolly.sugar.Date, localeCode: java.lang.String): typingsJapgolly.sugar.Date = js.native
    
    def format(instance: typingsJapgolly.sugar.Date): java.lang.String = js.native
    def format(instance: typingsJapgolly.sugar.Date, f: java.lang.String): java.lang.String = js.native
    def format(instance: typingsJapgolly.sugar.Date, f: java.lang.String, localeCode: java.lang.String): java.lang.String = js.native
    def format(instance: typingsJapgolly.sugar.Date, f: Unit, localeCode: java.lang.String): java.lang.String = js.native
    
    def full(instance: typingsJapgolly.sugar.Date): java.lang.String = js.native
    def full(instance: typingsJapgolly.sugar.Date, localeCode: java.lang.String): java.lang.String = js.native
    
    def get(instance: typingsJapgolly.sugar.Date, d: java.lang.String): typingsJapgolly.sugar.Date = js.native
    def get(instance: typingsJapgolly.sugar.Date, d: java.lang.String, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def get(instance: typingsJapgolly.sugar.Date, d: Double): typingsJapgolly.sugar.Date = js.native
    def get(instance: typingsJapgolly.sugar.Date, d: Double, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    def get(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def get(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): typingsJapgolly.sugar.Date = js.native
    
    def getAllLocaleCodes(): typingsJapgolly.sugar.Array[java.lang.String] = js.native
    
    def getAllLocales(): typingsJapgolly.sugar.Array[Locale] = js.native
    
    def getISOWeek(instance: typingsJapgolly.sugar.Date): Double = js.native
    
    def getLocale(): Locale = js.native
    def getLocale(localeCode: java.lang.String): Locale = js.native
    
    def getOption[T](name: java.lang.String): T = js.native
    
    def getUTCOffset(instance: typingsJapgolly.sugar.Date): java.lang.String = js.native
    def getUTCOffset(instance: typingsJapgolly.sugar.Date, iso: Boolean): java.lang.String = js.native
    
    def getUTCWeekday(instance: typingsJapgolly.sugar.Date): Double = js.native
    
    def getWeekday(instance: typingsJapgolly.sugar.Date): Double = js.native
    
    def hoursAgo(instance: typingsJapgolly.sugar.Date): Double = js.native
    
    def hoursFromNow(instance: typingsJapgolly.sugar.Date): Double = js.native
    
    def hoursSince(instance: typingsJapgolly.sugar.Date, d: java.lang.String): Double = js.native
    def hoursSince(instance: typingsJapgolly.sugar.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
    def hoursSince(instance: typingsJapgolly.sugar.Date, d: Double): Double = js.native
    def hoursSince(instance: typingsJapgolly.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
    def hoursSince(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date): Double = js.native
    def hoursSince(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): Double = js.native
    
    def hoursUntil(instance: typingsJapgolly.sugar.Date): Double = js.native
    def hoursUntil(instance: typingsJapgolly.sugar.Date, d: java.lang.String): Double = js.native
    def hoursUntil(instance: typingsJapgolly.sugar.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
    def hoursUntil(instance: typingsJapgolly.sugar.Date, d: Double): Double = js.native
    def hoursUntil(instance: typingsJapgolly.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
    def hoursUntil(instance: typingsJapgolly.sugar.Date, d: Unit, options: DateCreateOptions): Double = js.native
    def hoursUntil(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date): Double = js.native
    def hoursUntil(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): Double = js.native
    
    def is(instance: typingsJapgolly.sugar.Date, d: java.lang.String): Boolean = js.native
    def is(instance: typingsJapgolly.sugar.Date, d: java.lang.String, margin: Double): Boolean = js.native
    def is(instance: typingsJapgolly.sugar.Date, d: Double): Boolean = js.native
    def is(instance: typingsJapgolly.sugar.Date, d: Double, margin: Double): Boolean = js.native
    def is(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date): Boolean = js.native
    def is(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date, margin: Double): Boolean = js.native
    
    def isAfter(instance: typingsJapgolly.sugar.Date, d: java.lang.String): Boolean = js.native
    def isAfter(instance: typingsJapgolly.sugar.Date, d: java.lang.String, margin: Double): Boolean = js.native
    def isAfter(instance: typingsJapgolly.sugar.Date, d: Double): Boolean = js.native
    def isAfter(instance: typingsJapgolly.sugar.Date, d: Double, margin: Double): Boolean = js.native
    def isAfter(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date): Boolean = js.native
    def isAfter(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date, margin: Double): Boolean = js.native
    
    def isBefore(instance: typingsJapgolly.sugar.Date, d: java.lang.String): Boolean = js.native
    def isBefore(instance: typingsJapgolly.sugar.Date, d: java.lang.String, margin: Double): Boolean = js.native
    def isBefore(instance: typingsJapgolly.sugar.Date, d: Double): Boolean = js.native
    def isBefore(instance: typingsJapgolly.sugar.Date, d: Double, margin: Double): Boolean = js.native
    def isBefore(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date): Boolean = js.native
    def isBefore(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date, margin: Double): Boolean = js.native
    
    def isBetween(instance: typingsJapgolly.sugar.Date, d1: java.lang.String, d2: java.lang.String): Boolean = js.native
    def isBetween(instance: typingsJapgolly.sugar.Date, d1: java.lang.String, d2: java.lang.String, margin: Double): Boolean = js.native
    def isBetween(instance: typingsJapgolly.sugar.Date, d1: java.lang.String, d2: Double): Boolean = js.native
    def isBetween(instance: typingsJapgolly.sugar.Date, d1: java.lang.String, d2: Double, margin: Double): Boolean = js.native
    def isBetween(instance: typingsJapgolly.sugar.Date, d1: java.lang.String, d2: typingsJapgolly.sugar.Date): Boolean = js.native
    def isBetween(
      instance: typingsJapgolly.sugar.Date,
      d1: java.lang.String,
      d2: typingsJapgolly.sugar.Date,
      margin: Double
    ): Boolean = js.native
    def isBetween(instance: typingsJapgolly.sugar.Date, d1: Double, d2: java.lang.String): Boolean = js.native
    def isBetween(instance: typingsJapgolly.sugar.Date, d1: Double, d2: java.lang.String, margin: Double): Boolean = js.native
    def isBetween(instance: typingsJapgolly.sugar.Date, d1: Double, d2: Double): Boolean = js.native
    def isBetween(instance: typingsJapgolly.sugar.Date, d1: Double, d2: Double, margin: Double): Boolean = js.native
    def isBetween(instance: typingsJapgolly.sugar.Date, d1: Double, d2: typingsJapgolly.sugar.Date): Boolean = js.native
    def isBetween(instance: typingsJapgolly.sugar.Date, d1: Double, d2: typingsJapgolly.sugar.Date, margin: Double): Boolean = js.native
    def isBetween(instance: typingsJapgolly.sugar.Date, d1: typingsJapgolly.sugar.Date, d2: java.lang.String): Boolean = js.native
    def isBetween(
      instance: typingsJapgolly.sugar.Date,
      d1: typingsJapgolly.sugar.Date,
      d2: java.lang.String,
      margin: Double
    ): Boolean = js.native
    def isBetween(instance: typingsJapgolly.sugar.Date, d1: typingsJapgolly.sugar.Date, d2: Double): Boolean = js.native
    def isBetween(instance: typingsJapgolly.sugar.Date, d1: typingsJapgolly.sugar.Date, d2: Double, margin: Double): Boolean = js.native
    def isBetween(
      instance: typingsJapgolly.sugar.Date,
      d1: typingsJapgolly.sugar.Date,
      d2: typingsJapgolly.sugar.Date
    ): Boolean = js.native
    def isBetween(
      instance: typingsJapgolly.sugar.Date,
      d1: typingsJapgolly.sugar.Date,
      d2: typingsJapgolly.sugar.Date,
      margin: Double
    ): Boolean = js.native
    
    def isFriday(instance: typingsJapgolly.sugar.Date): Boolean = js.native
    
    def isFuture(instance: typingsJapgolly.sugar.Date): Boolean = js.native
    
    def isLastMonth(instance: typingsJapgolly.sugar.Date): Boolean = js.native
    def isLastMonth(instance: typingsJapgolly.sugar.Date, localeCode: java.lang.String): Boolean = js.native
    
    def isLastWeek(instance: typingsJapgolly.sugar.Date): Boolean = js.native
    def isLastWeek(instance: typingsJapgolly.sugar.Date, localeCode: java.lang.String): Boolean = js.native
    
    def isLastYear(instance: typingsJapgolly.sugar.Date): Boolean = js.native
    def isLastYear(instance: typingsJapgolly.sugar.Date, localeCode: java.lang.String): Boolean = js.native
    
    def isLeapYear(instance: typingsJapgolly.sugar.Date): Boolean = js.native
    
    def isMonday(instance: typingsJapgolly.sugar.Date): Boolean = js.native
    
    def isNextMonth(instance: typingsJapgolly.sugar.Date): Boolean = js.native
    def isNextMonth(instance: typingsJapgolly.sugar.Date, localeCode: java.lang.String): Boolean = js.native
    
    def isNextWeek(instance: typingsJapgolly.sugar.Date): Boolean = js.native
    def isNextWeek(instance: typingsJapgolly.sugar.Date, localeCode: java.lang.String): Boolean = js.native
    
    def isNextYear(instance: typingsJapgolly.sugar.Date): Boolean = js.native
    def isNextYear(instance: typingsJapgolly.sugar.Date, localeCode: java.lang.String): Boolean = js.native
    
    def isPast(instance: typingsJapgolly.sugar.Date): Boolean = js.native
    
    def isSaturday(instance: typingsJapgolly.sugar.Date): Boolean = js.native
    
    def isSunday(instance: typingsJapgolly.sugar.Date): Boolean = js.native
    
    def isThisMonth(instance: typingsJapgolly.sugar.Date): Boolean = js.native
    def isThisMonth(instance: typingsJapgolly.sugar.Date, localeCode: java.lang.String): Boolean = js.native
    
    def isThisWeek(instance: typingsJapgolly.sugar.Date): Boolean = js.native
    def isThisWeek(instance: typingsJapgolly.sugar.Date, localeCode: java.lang.String): Boolean = js.native
    
    def isThisYear(instance: typingsJapgolly.sugar.Date): Boolean = js.native
    def isThisYear(instance: typingsJapgolly.sugar.Date, localeCode: java.lang.String): Boolean = js.native
    
    def isThursday(instance: typingsJapgolly.sugar.Date): Boolean = js.native
    
    def isToday(instance: typingsJapgolly.sugar.Date): Boolean = js.native
    
    def isTomorrow(instance: typingsJapgolly.sugar.Date): Boolean = js.native
    
    def isTuesday(instance: typingsJapgolly.sugar.Date): Boolean = js.native
    
    def isUTC(instance: typingsJapgolly.sugar.Date): Boolean = js.native
    
    def isValid(instance: typingsJapgolly.sugar.Date): Boolean = js.native
    
    def isWednesday(instance: typingsJapgolly.sugar.Date): Boolean = js.native
    
    def isWeekday(instance: typingsJapgolly.sugar.Date): Boolean = js.native
    
    def isWeekend(instance: typingsJapgolly.sugar.Date): Boolean = js.native
    
    def isYesterday(instance: typingsJapgolly.sugar.Date): Boolean = js.native
    
    def iso(instance: typingsJapgolly.sugar.Date): java.lang.String = js.native
    
    def long(instance: typingsJapgolly.sugar.Date): java.lang.String = js.native
    def long(instance: typingsJapgolly.sugar.Date, localeCode: java.lang.String): java.lang.String = js.native
    
    def medium(instance: typingsJapgolly.sugar.Date): java.lang.String = js.native
    def medium(instance: typingsJapgolly.sugar.Date, localeCode: java.lang.String): java.lang.String = js.native
    
    def millisecondsAgo(instance: typingsJapgolly.sugar.Date): Double = js.native
    
    def millisecondsFromNow(instance: typingsJapgolly.sugar.Date): Double = js.native
    
    def millisecondsSince(instance: typingsJapgolly.sugar.Date, d: java.lang.String): Double = js.native
    def millisecondsSince(instance: typingsJapgolly.sugar.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
    def millisecondsSince(instance: typingsJapgolly.sugar.Date, d: Double): Double = js.native
    def millisecondsSince(instance: typingsJapgolly.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
    def millisecondsSince(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date): Double = js.native
    def millisecondsSince(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): Double = js.native
    
    def millisecondsUntil(instance: typingsJapgolly.sugar.Date): Double = js.native
    def millisecondsUntil(instance: typingsJapgolly.sugar.Date, d: java.lang.String): Double = js.native
    def millisecondsUntil(instance: typingsJapgolly.sugar.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
    def millisecondsUntil(instance: typingsJapgolly.sugar.Date, d: Double): Double = js.native
    def millisecondsUntil(instance: typingsJapgolly.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
    def millisecondsUntil(instance: typingsJapgolly.sugar.Date, d: Unit, options: DateCreateOptions): Double = js.native
    def millisecondsUntil(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date): Double = js.native
    def millisecondsUntil(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): Double = js.native
    
    def minutesAgo(instance: typingsJapgolly.sugar.Date): Double = js.native
    
    def minutesFromNow(instance: typingsJapgolly.sugar.Date): Double = js.native
    
    def minutesSince(instance: typingsJapgolly.sugar.Date, d: java.lang.String): Double = js.native
    def minutesSince(instance: typingsJapgolly.sugar.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
    def minutesSince(instance: typingsJapgolly.sugar.Date, d: Double): Double = js.native
    def minutesSince(instance: typingsJapgolly.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
    def minutesSince(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date): Double = js.native
    def minutesSince(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): Double = js.native
    
    def minutesUntil(instance: typingsJapgolly.sugar.Date): Double = js.native
    def minutesUntil(instance: typingsJapgolly.sugar.Date, d: java.lang.String): Double = js.native
    def minutesUntil(instance: typingsJapgolly.sugar.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
    def minutesUntil(instance: typingsJapgolly.sugar.Date, d: Double): Double = js.native
    def minutesUntil(instance: typingsJapgolly.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
    def minutesUntil(instance: typingsJapgolly.sugar.Date, d: Unit, options: DateCreateOptions): Double = js.native
    def minutesUntil(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date): Double = js.native
    def minutesUntil(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): Double = js.native
    
    def monthsAgo(instance: typingsJapgolly.sugar.Date): Double = js.native
    
    def monthsFromNow(instance: typingsJapgolly.sugar.Date): Double = js.native
    
    def monthsSince(instance: typingsJapgolly.sugar.Date, d: java.lang.String): Double = js.native
    def monthsSince(instance: typingsJapgolly.sugar.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
    def monthsSince(instance: typingsJapgolly.sugar.Date, d: Double): Double = js.native
    def monthsSince(instance: typingsJapgolly.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
    def monthsSince(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date): Double = js.native
    def monthsSince(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): Double = js.native
    
    def monthsUntil(instance: typingsJapgolly.sugar.Date): Double = js.native
    def monthsUntil(instance: typingsJapgolly.sugar.Date, d: java.lang.String): Double = js.native
    def monthsUntil(instance: typingsJapgolly.sugar.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
    def monthsUntil(instance: typingsJapgolly.sugar.Date, d: Double): Double = js.native
    def monthsUntil(instance: typingsJapgolly.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
    def monthsUntil(instance: typingsJapgolly.sugar.Date, d: Unit, options: DateCreateOptions): Double = js.native
    def monthsUntil(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date): Double = js.native
    def monthsUntil(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): Double = js.native
    
    def range(): Range = js.native
    def range(start: java.lang.String): Range = js.native
    def range(start: java.lang.String, end: java.lang.String): Range = js.native
    def range(start: java.lang.String, end: typingsJapgolly.sugar.Date): Range = js.native
    def range(start: Unit, end: java.lang.String): Range = js.native
    def range(start: Unit, end: typingsJapgolly.sugar.Date): Range = js.native
    def range(start: typingsJapgolly.sugar.Date): Range = js.native
    def range(start: typingsJapgolly.sugar.Date, end: java.lang.String): Range = js.native
    def range(start: typingsJapgolly.sugar.Date, end: typingsJapgolly.sugar.Date): Range = js.native
    
    def relative(instance: typingsJapgolly.sugar.Date): java.lang.String = js.native
    def relative(instance: typingsJapgolly.sugar.Date, localeCode: java.lang.String): java.lang.String = js.native
    def relative(
      instance: typingsJapgolly.sugar.Date,
      localeCode: java.lang.String,
      relativeFn: js.Function4[/* num */ Double, /* unit */ Double, /* ms */ Double, /* loc */ Locale, java.lang.String]
    ): java.lang.String = js.native
    def relative(
      instance: typingsJapgolly.sugar.Date,
      localeCode: Unit,
      relativeFn: js.Function4[/* num */ Double, /* unit */ Double, /* ms */ Double, /* loc */ Locale, java.lang.String]
    ): java.lang.String = js.native
    def relative(
      instance: typingsJapgolly.sugar.Date,
      relativeFn: js.Function4[/* num */ Double, /* unit */ Double, /* ms */ Double, /* loc */ Locale, java.lang.String]
    ): java.lang.String = js.native
    
    def relativeTo(instance: typingsJapgolly.sugar.Date, d: java.lang.String): java.lang.String = js.native
    def relativeTo(instance: typingsJapgolly.sugar.Date, d: java.lang.String, localeCode: java.lang.String): java.lang.String = js.native
    def relativeTo(instance: typingsJapgolly.sugar.Date, d: Double): java.lang.String = js.native
    def relativeTo(instance: typingsJapgolly.sugar.Date, d: Double, localeCode: java.lang.String): java.lang.String = js.native
    def relativeTo(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date): java.lang.String = js.native
    def relativeTo(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date, localeCode: java.lang.String): java.lang.String = js.native
    
    def removeLocale(localeCode: java.lang.String): Locale = js.native
    
    def reset(instance: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def reset(instance: typingsJapgolly.sugar.Date, unit: java.lang.String): typingsJapgolly.sugar.Date = js.native
    def reset(instance: typingsJapgolly.sugar.Date, unit: java.lang.String, localeCode: java.lang.String): typingsJapgolly.sugar.Date = js.native
    def reset(instance: typingsJapgolly.sugar.Date, unit: Unit, localeCode: java.lang.String): typingsJapgolly.sugar.Date = js.native
    
    def rewind(instance: typingsJapgolly.sugar.Date, milliseconds: Double): typingsJapgolly.sugar.Date = js.native
    def rewind(instance: typingsJapgolly.sugar.Date, set: java.lang.String): typingsJapgolly.sugar.Date = js.native
    def rewind(instance: typingsJapgolly.sugar.Date, set: java.lang.String, reset: Boolean): typingsJapgolly.sugar.Date = js.native
    def rewind(instance: typingsJapgolly.sugar.Date, set: js.Object): typingsJapgolly.sugar.Date = js.native
    def rewind(instance: typingsJapgolly.sugar.Date, set: js.Object, reset: Boolean): typingsJapgolly.sugar.Date = js.native
    def rewind(instance: typingsJapgolly.sugar.Date, year: Double, month: Double): typingsJapgolly.sugar.Date = js.native
    def rewind(instance: typingsJapgolly.sugar.Date, year: Double, month: Double, day: Double): typingsJapgolly.sugar.Date = js.native
    def rewind(instance: typingsJapgolly.sugar.Date, year: Double, month: Double, day: Double, hour: Double): typingsJapgolly.sugar.Date = js.native
    def rewind(
      instance: typingsJapgolly.sugar.Date,
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Double
    ): typingsJapgolly.sugar.Date = js.native
    def rewind(
      instance: typingsJapgolly.sugar.Date,
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Double,
      second: Double
    ): typingsJapgolly.sugar.Date = js.native
    def rewind(
      instance: typingsJapgolly.sugar.Date,
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Unit,
      second: Double
    ): typingsJapgolly.sugar.Date = js.native
    def rewind(
      instance: typingsJapgolly.sugar.Date,
      year: Double,
      month: Double,
      day: Double,
      hour: Unit,
      minute: Double
    ): typingsJapgolly.sugar.Date = js.native
    def rewind(
      instance: typingsJapgolly.sugar.Date,
      year: Double,
      month: Double,
      day: Double,
      hour: Unit,
      minute: Double,
      second: Double
    ): typingsJapgolly.sugar.Date = js.native
    def rewind(
      instance: typingsJapgolly.sugar.Date,
      year: Double,
      month: Double,
      day: Double,
      hour: Unit,
      minute: Unit,
      second: Double
    ): typingsJapgolly.sugar.Date = js.native
    def rewind(instance: typingsJapgolly.sugar.Date, year: Double, month: Double, day: Unit, hour: Double): typingsJapgolly.sugar.Date = js.native
    def rewind(
      instance: typingsJapgolly.sugar.Date,
      year: Double,
      month: Double,
      day: Unit,
      hour: Double,
      minute: Double
    ): typingsJapgolly.sugar.Date = js.native
    def rewind(
      instance: typingsJapgolly.sugar.Date,
      year: Double,
      month: Double,
      day: Unit,
      hour: Double,
      minute: Double,
      second: Double
    ): typingsJapgolly.sugar.Date = js.native
    def rewind(
      instance: typingsJapgolly.sugar.Date,
      year: Double,
      month: Double,
      day: Unit,
      hour: Double,
      minute: Unit,
      second: Double
    ): typingsJapgolly.sugar.Date = js.native
    def rewind(
      instance: typingsJapgolly.sugar.Date,
      year: Double,
      month: Double,
      day: Unit,
      hour: Unit,
      minute: Double
    ): typingsJapgolly.sugar.Date = js.native
    def rewind(
      instance: typingsJapgolly.sugar.Date,
      year: Double,
      month: Double,
      day: Unit,
      hour: Unit,
      minute: Double,
      second: Double
    ): typingsJapgolly.sugar.Date = js.native
    def rewind(
      instance: typingsJapgolly.sugar.Date,
      year: Double,
      month: Double,
      day: Unit,
      hour: Unit,
      minute: Unit,
      second: Double
    ): typingsJapgolly.sugar.Date = js.native
    
    def secondsAgo(instance: typingsJapgolly.sugar.Date): Double = js.native
    
    def secondsFromNow(instance: typingsJapgolly.sugar.Date): Double = js.native
    
    def secondsSince(instance: typingsJapgolly.sugar.Date, d: java.lang.String): Double = js.native
    def secondsSince(instance: typingsJapgolly.sugar.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
    def secondsSince(instance: typingsJapgolly.sugar.Date, d: Double): Double = js.native
    def secondsSince(instance: typingsJapgolly.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
    def secondsSince(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date): Double = js.native
    def secondsSince(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): Double = js.native
    
    def secondsUntil(instance: typingsJapgolly.sugar.Date): Double = js.native
    def secondsUntil(instance: typingsJapgolly.sugar.Date, d: java.lang.String): Double = js.native
    def secondsUntil(instance: typingsJapgolly.sugar.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
    def secondsUntil(instance: typingsJapgolly.sugar.Date, d: Double): Double = js.native
    def secondsUntil(instance: typingsJapgolly.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
    def secondsUntil(instance: typingsJapgolly.sugar.Date, d: Unit, options: DateCreateOptions): Double = js.native
    def secondsUntil(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date): Double = js.native
    def secondsUntil(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): Double = js.native
    
    def set(instance: typingsJapgolly.sugar.Date, milliseconds: Double): typingsJapgolly.sugar.Date = js.native
    def set(instance: typingsJapgolly.sugar.Date, set: js.Object): typingsJapgolly.sugar.Date = js.native
    def set(instance: typingsJapgolly.sugar.Date, set: js.Object, reset: Boolean): typingsJapgolly.sugar.Date = js.native
    def set(instance: typingsJapgolly.sugar.Date, year: Double, month: Double): typingsJapgolly.sugar.Date = js.native
    def set(instance: typingsJapgolly.sugar.Date, year: Double, month: Double, day: Double): typingsJapgolly.sugar.Date = js.native
    def set(instance: typingsJapgolly.sugar.Date, year: Double, month: Double, day: Double, hour: Double): typingsJapgolly.sugar.Date = js.native
    def set(
      instance: typingsJapgolly.sugar.Date,
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Double
    ): typingsJapgolly.sugar.Date = js.native
    def set(
      instance: typingsJapgolly.sugar.Date,
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Double,
      second: Double
    ): typingsJapgolly.sugar.Date = js.native
    def set(
      instance: typingsJapgolly.sugar.Date,
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Unit,
      second: Double
    ): typingsJapgolly.sugar.Date = js.native
    def set(
      instance: typingsJapgolly.sugar.Date,
      year: Double,
      month: Double,
      day: Double,
      hour: Unit,
      minute: Double
    ): typingsJapgolly.sugar.Date = js.native
    def set(
      instance: typingsJapgolly.sugar.Date,
      year: Double,
      month: Double,
      day: Double,
      hour: Unit,
      minute: Double,
      second: Double
    ): typingsJapgolly.sugar.Date = js.native
    def set(
      instance: typingsJapgolly.sugar.Date,
      year: Double,
      month: Double,
      day: Double,
      hour: Unit,
      minute: Unit,
      second: Double
    ): typingsJapgolly.sugar.Date = js.native
    def set(instance: typingsJapgolly.sugar.Date, year: Double, month: Double, day: Unit, hour: Double): typingsJapgolly.sugar.Date = js.native
    def set(
      instance: typingsJapgolly.sugar.Date,
      year: Double,
      month: Double,
      day: Unit,
      hour: Double,
      minute: Double
    ): typingsJapgolly.sugar.Date = js.native
    def set(
      instance: typingsJapgolly.sugar.Date,
      year: Double,
      month: Double,
      day: Unit,
      hour: Double,
      minute: Double,
      second: Double
    ): typingsJapgolly.sugar.Date = js.native
    def set(
      instance: typingsJapgolly.sugar.Date,
      year: Double,
      month: Double,
      day: Unit,
      hour: Double,
      minute: Unit,
      second: Double
    ): typingsJapgolly.sugar.Date = js.native
    def set(
      instance: typingsJapgolly.sugar.Date,
      year: Double,
      month: Double,
      day: Unit,
      hour: Unit,
      minute: Double
    ): typingsJapgolly.sugar.Date = js.native
    def set(
      instance: typingsJapgolly.sugar.Date,
      year: Double,
      month: Double,
      day: Unit,
      hour: Unit,
      minute: Double,
      second: Double
    ): typingsJapgolly.sugar.Date = js.native
    def set(
      instance: typingsJapgolly.sugar.Date,
      year: Double,
      month: Double,
      day: Unit,
      hour: Unit,
      minute: Unit,
      second: Double
    ): typingsJapgolly.sugar.Date = js.native
    
    def setISOWeek(instance: typingsJapgolly.sugar.Date, num: Double): Unit = js.native
    
    def setLocale(localeCode: java.lang.String): Locale = js.native
    
    def setOption(name: java.lang.String, value: Any): Unit = js.native
    def setOption(options: DateOptions): Unit = js.native
    
    def setUTC(instance: typingsJapgolly.sugar.Date): typingsJapgolly.sugar.Date = js.native
    def setUTC(instance: typingsJapgolly.sugar.Date, on: Boolean): typingsJapgolly.sugar.Date = js.native
    
    def setWeekday(instance: typingsJapgolly.sugar.Date, dow: Double): Unit = js.native
    
    def short(instance: typingsJapgolly.sugar.Date): java.lang.String = js.native
    def short(instance: typingsJapgolly.sugar.Date, localeCode: java.lang.String): java.lang.String = js.native
    
    def weeksAgo(instance: typingsJapgolly.sugar.Date): Double = js.native
    
    def weeksFromNow(instance: typingsJapgolly.sugar.Date): Double = js.native
    
    def weeksSince(instance: typingsJapgolly.sugar.Date, d: java.lang.String): Double = js.native
    def weeksSince(instance: typingsJapgolly.sugar.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
    def weeksSince(instance: typingsJapgolly.sugar.Date, d: Double): Double = js.native
    def weeksSince(instance: typingsJapgolly.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
    def weeksSince(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date): Double = js.native
    def weeksSince(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): Double = js.native
    
    def weeksUntil(instance: typingsJapgolly.sugar.Date): Double = js.native
    def weeksUntil(instance: typingsJapgolly.sugar.Date, d: java.lang.String): Double = js.native
    def weeksUntil(instance: typingsJapgolly.sugar.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
    def weeksUntil(instance: typingsJapgolly.sugar.Date, d: Double): Double = js.native
    def weeksUntil(instance: typingsJapgolly.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
    def weeksUntil(instance: typingsJapgolly.sugar.Date, d: Unit, options: DateCreateOptions): Double = js.native
    def weeksUntil(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date): Double = js.native
    def weeksUntil(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): Double = js.native
    
    def yearsAgo(instance: typingsJapgolly.sugar.Date): Double = js.native
    
    def yearsFromNow(instance: typingsJapgolly.sugar.Date): Double = js.native
    
    def yearsSince(instance: typingsJapgolly.sugar.Date, d: java.lang.String): Double = js.native
    def yearsSince(instance: typingsJapgolly.sugar.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
    def yearsSince(instance: typingsJapgolly.sugar.Date, d: Double): Double = js.native
    def yearsSince(instance: typingsJapgolly.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
    def yearsSince(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date): Double = js.native
    def yearsSince(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): Double = js.native
    
    def yearsUntil(instance: typingsJapgolly.sugar.Date): Double = js.native
    def yearsUntil(instance: typingsJapgolly.sugar.Date, d: java.lang.String): Double = js.native
    def yearsUntil(instance: typingsJapgolly.sugar.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
    def yearsUntil(instance: typingsJapgolly.sugar.Date, d: Double): Double = js.native
    def yearsUntil(instance: typingsJapgolly.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
    def yearsUntil(instance: typingsJapgolly.sugar.Date, d: Unit, options: DateCreateOptions): Double = js.native
    def yearsUntil(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date): Double = js.native
    def yearsUntil(instance: typingsJapgolly.sugar.Date, d: typingsJapgolly.sugar.Date, options: DateCreateOptions): Double = js.native
  }
  
  trait DateCreateOptions extends StObject {
    
    @JSName("clone")
    var clone_FDateCreateOptions: js.UndefOr[Boolean] = js.undefined
    
    var fromUTC: js.UndefOr[Boolean] = js.undefined
    
    var future: js.UndefOr[Boolean] = js.undefined
    
    var locale: js.UndefOr[java.lang.String] = js.undefined
    
    var params: js.UndefOr[js.Object] = js.undefined
    
    var past: js.UndefOr[Boolean] = js.undefined
    
    var setUTC: js.UndefOr[Boolean] = js.undefined
  }
  object DateCreateOptions {
    
    inline def apply(): DateCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateCreateOptions]
    }
    
    extension [Self <: DateCreateOptions](x: Self) {
      
      inline def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
      
      inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
      
      inline def setFromUTC(value: Boolean): Self = StObject.set(x, "fromUTC", value.asInstanceOf[js.Any])
      
      inline def setFromUTCUndefined: Self = StObject.set(x, "fromUTC", js.undefined)
      
      inline def setFuture(value: Boolean): Self = StObject.set(x, "future", value.asInstanceOf[js.Any])
      
      inline def setFutureUndefined: Self = StObject.set(x, "future", js.undefined)
      
      inline def setLocale(value: java.lang.String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setPast(value: Boolean): Self = StObject.set(x, "past", value.asInstanceOf[js.Any])
      
      inline def setPastUndefined: Self = StObject.set(x, "past", js.undefined)
      
      inline def setSetUTC(value: Boolean): Self = StObject.set(x, "setUTC", value.asInstanceOf[js.Any])
      
      inline def setSetUTCUndefined: Self = StObject.set(x, "setUTC", js.undefined)
    }
  }
  
  trait DateOptions extends StObject {
    
    var newDateInternal: typingsJapgolly.sugar.Function
  }
  object DateOptions {
    
    inline def apply(newDateInternal: typingsJapgolly.sugar.Function): DateOptions = {
      val __obj = js.Dynamic.literal(newDateInternal = newDateInternal.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateOptions]
    }
    
    extension [Self <: DateOptions](x: Self) {
      
      inline def setNewDateInternal(value: typingsJapgolly.sugar.Function): Self = StObject.set(x, "newDateInternal", value.asInstanceOf[js.Any])
    }
  }
}
