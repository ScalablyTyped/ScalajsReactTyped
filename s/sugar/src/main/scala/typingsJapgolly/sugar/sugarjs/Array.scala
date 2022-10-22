package typingsJapgolly.sugar.sugarjs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.std.ArrayLike
import typingsJapgolly.sugar.sugarjs.Object.ObjectMergeOptions
import typingsJapgolly.sugar.sugarjs.Object.QueryStringOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Array {
  
  trait ArrayOptions extends StObject {
    
    var sortCollate: js.UndefOr[typingsJapgolly.sugar.Function] = js.undefined
    
    var sortEquivalents: js.UndefOr[js.Object] = js.undefined
    
    var sortIgnore: js.UndefOr[typingsJapgolly.sugar.RegExp] = js.undefined
    
    var sortIgnoreCase: js.UndefOr[Boolean] = js.undefined
    
    var sortNatural: js.UndefOr[Boolean] = js.undefined
    
    var sortOrder: js.UndefOr[java.lang.String] = js.undefined
  }
  object ArrayOptions {
    
    inline def apply(): ArrayOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrayOptions]
    }
    
    extension [Self <: ArrayOptions](x: Self) {
      
      inline def setSortCollate(value: typingsJapgolly.sugar.Function): Self = StObject.set(x, "sortCollate", value.asInstanceOf[js.Any])
      
      inline def setSortCollateUndefined: Self = StObject.set(x, "sortCollate", js.undefined)
      
      inline def setSortEquivalents(value: js.Object): Self = StObject.set(x, "sortEquivalents", value.asInstanceOf[js.Any])
      
      inline def setSortEquivalentsUndefined: Self = StObject.set(x, "sortEquivalents", js.undefined)
      
      inline def setSortIgnore(value: typingsJapgolly.sugar.RegExp): Self = StObject.set(x, "sortIgnore", value.asInstanceOf[js.Any])
      
      inline def setSortIgnoreCase(value: Boolean): Self = StObject.set(x, "sortIgnoreCase", value.asInstanceOf[js.Any])
      
      inline def setSortIgnoreCaseUndefined: Self = StObject.set(x, "sortIgnoreCase", js.undefined)
      
      inline def setSortIgnoreUndefined: Self = StObject.set(x, "sortIgnore", js.undefined)
      
      inline def setSortNatural(value: Boolean): Self = StObject.set(x, "sortNatural", value.asInstanceOf[js.Any])
      
      inline def setSortNaturalUndefined: Self = StObject.set(x, "sortNatural", js.undefined)
      
      inline def setSortOrder(value: java.lang.String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.sugar.sugarjs.Object.ChainableBase because var conflicts: raw. Inlined addAll, addAll, defaults, defaults, get, get, has, has, invert, invert, isArguments, isArray, isBoolean, isDate, isError, isFunction, isMap, isNumber, isObject, isRegExp, isSet, isString, keys, merge, merge, mergeAll, mergeAll, reject, reject, reject, reject, select, select, select, select, set, size, tap, toQueryString, toQueryString, values */ @js.native
  trait Chainable[T, RawValue]
    extends StObject
       with ChainableBase[T, RawValue] {
    
    def addAll[T](sources: typingsJapgolly.sugar.Array[js.Object]): SugarDefaultChainable[js.Object] = js.native
    def addAll[T](sources: typingsJapgolly.sugar.Array[js.Object], options: ObjectMergeOptions[T]): SugarDefaultChainable[js.Object] = js.native
    
    def defaults[T](sources: typingsJapgolly.sugar.Array[js.Object]): SugarDefaultChainable[js.Object] = js.native
    def defaults[T](sources: typingsJapgolly.sugar.Array[js.Object], options: ObjectMergeOptions[T]): SugarDefaultChainable[js.Object] = js.native
    
    def get[T](key: java.lang.String): SugarDefaultChainable[T] = js.native
    def get[T](key: java.lang.String, inherited: Boolean): SugarDefaultChainable[T] = js.native
    
    def has(key: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    def has(key: java.lang.String, inherited: Boolean): SugarDefaultChainable[Boolean] = js.native
    
    def invert(): SugarDefaultChainable[js.Object] = js.native
    def invert(multi: Boolean): SugarDefaultChainable[js.Object] = js.native
    
    def isArguments(): SugarDefaultChainable[Boolean] = js.native
    
    def isArray(): SugarDefaultChainable[Boolean] = js.native
    
    def isBoolean(): SugarDefaultChainable[Boolean] = js.native
    
    def isDate(): SugarDefaultChainable[Boolean] = js.native
    
    def isError(): SugarDefaultChainable[Boolean] = js.native
    
    def isFunction(): SugarDefaultChainable[Boolean] = js.native
    
    def isMap(): SugarDefaultChainable[Boolean] = js.native
    
    def isNumber(): SugarDefaultChainable[Boolean] = js.native
    
    def isObject(): SugarDefaultChainable[Boolean] = js.native
    
    def isRegExp(): SugarDefaultChainable[Boolean] = js.native
    
    def isSet(): SugarDefaultChainable[Boolean] = js.native
    
    def isString(): SugarDefaultChainable[Boolean] = js.native
    
    def keys[T](): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    
    def merge[T](source: js.Object): SugarDefaultChainable[js.Object] = js.native
    def merge[T](source: js.Object, options: ObjectMergeOptions[T]): SugarDefaultChainable[js.Object] = js.native
    
    def mergeAll[T](sources: typingsJapgolly.sugar.Array[js.Object]): SugarDefaultChainable[js.Object] = js.native
    def mergeAll[T](sources: typingsJapgolly.sugar.Array[js.Object], options: ObjectMergeOptions[T]): SugarDefaultChainable[js.Object] = js.native
    
    def reject(find: java.lang.String): SugarDefaultChainable[js.Object] = js.native
    def reject(find: js.Object): SugarDefaultChainable[js.Object] = js.native
    def reject(find: typingsJapgolly.sugar.Array[java.lang.String]): SugarDefaultChainable[js.Object] = js.native
    def reject(find: typingsJapgolly.sugar.RegExp): SugarDefaultChainable[js.Object] = js.native
    
    def select(find: java.lang.String): SugarDefaultChainable[js.Object] = js.native
    def select(find: js.Object): SugarDefaultChainable[js.Object] = js.native
    def select(find: typingsJapgolly.sugar.Array[java.lang.String]): SugarDefaultChainable[js.Object] = js.native
    def select(find: typingsJapgolly.sugar.RegExp): SugarDefaultChainable[js.Object] = js.native
    
    def set[T](key: java.lang.String, `val`: T): SugarDefaultChainable[js.Object] = js.native
    
    def size(): SugarDefaultChainable[Double] = js.native
    
    def tap(tapFn: js.Function1[/* obj */ js.Object, SugarDefaultChainable[Any]]): SugarDefaultChainable[js.Object] = js.native
    
    def toQueryString[T, U](): SugarDefaultChainable[js.Object] = js.native
    def toQueryString[T, U](options: QueryStringOptions[T, U]): SugarDefaultChainable[js.Object] = js.native
    
    def values[T](): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
  }
  
  @js.native
  trait ChainableBase[T, RawValue] extends StObject {
    
    def add(item: T): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def add(item: T, index: Double): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def add(item: typingsJapgolly.sugar.Array[T]): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def add(item: typingsJapgolly.sugar.Array[T], index: Double): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    
    def append(item: T): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def append(item: T, index: Double): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def append(item: typingsJapgolly.sugar.Array[T]): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def append(item: typingsJapgolly.sugar.Array[T], index: Double): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    
    def at(index: Double): SugarDefaultChainable[T] = js.native
    def at(index: Double, loop: Boolean): SugarDefaultChainable[T] = js.native
    def at(index: typingsJapgolly.sugar.Array[Double]): SugarDefaultChainable[T] = js.native
    def at(index: typingsJapgolly.sugar.Array[Double], loop: Boolean): SugarDefaultChainable[T] = js.native
    
    def average[U](): SugarDefaultChainable[Double] = js.native
    def average[U](map: java.lang.String): SugarDefaultChainable[Double] = js.native
    def average[U](map: mapFn[T, U]): SugarDefaultChainable[Double] = js.native
    
    def compact(): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def compact(all: Boolean): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    
    def concat(items: (typingsJapgolly.sugar.Array[T] | T)*): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    
    def copyWithin(target: Double, start: Double): SugarDefaultChainable[this.type] = js.native
    def copyWithin(target: Double, start: Double, end: Double): SugarDefaultChainable[this.type] = js.native
    
    def count(search: T): SugarDefaultChainable[Double] = js.native
    def count(search: T, context: Any): SugarDefaultChainable[Double] = js.native
    def count(search: searchFn[T]): SugarDefaultChainable[Double] = js.native
    def count(search: searchFn[T], context: Any): SugarDefaultChainable[Double] = js.native
    
    def every(search: T): SugarDefaultChainable[Boolean] = js.native
    def every(search: T, context: Any): SugarDefaultChainable[Boolean] = js.native
    def every(
      search: (js.Function3[/* value */ T, /* index */ Double, /* array */ typingsJapgolly.sugar.Array[T], Boolean]) | searchFn[T]
    ): SugarDefaultChainable[Boolean] = js.native
    def every(
      search: (js.Function3[/* value */ T, /* index */ Double, /* array */ typingsJapgolly.sugar.Array[T], Boolean]) | searchFn[T],
      context: Any
    ): SugarDefaultChainable[Boolean] = js.native
    
    def everyFromIndex(startIndex: Double, args: Any*): SugarDefaultChainable[T] = js.native
    def everyFromIndex(startIndex: Double, loop: Boolean, args: Any*): SugarDefaultChainable[T] = js.native
    def everyFromIndex(startIndex: Double, loop: Unit, args: Any*): SugarDefaultChainable[T] = js.native
    
    def exclude(search: T): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def exclude(search: searchFn[T]): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    
    def fill(value: T): SugarDefaultChainable[this.type] = js.native
    def fill(value: T, start: Double): SugarDefaultChainable[this.type] = js.native
    def fill(value: T, start: Double, end: Double): SugarDefaultChainable[this.type] = js.native
    def fill(value: T, start: Unit, end: Double): SugarDefaultChainable[this.type] = js.native
    
    def filter(search: T): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def filter(search: T, context: Any): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def filter(
      search: (js.Function3[/* value */ T, /* index */ Double, /* array */ typingsJapgolly.sugar.Array[T], Any]) | searchFn[T]
    ): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def filter(
      search: (js.Function3[/* value */ T, /* index */ Double, /* array */ typingsJapgolly.sugar.Array[T], Any]) | searchFn[T],
      context: Any
    ): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    
    def filterFromIndex(startIndex: Double, args: Any*): SugarDefaultChainable[T] = js.native
    def filterFromIndex(startIndex: Double, loop: Boolean, args: Any*): SugarDefaultChainable[T] = js.native
    def filterFromIndex(startIndex: Double, loop: Unit, args: Any*): SugarDefaultChainable[T] = js.native
    
    def find(search: T): SugarDefaultChainable[T] = js.native
    def find(search: T, context: Any): SugarDefaultChainable[T] = js.native
    def find(
      search: (js.Function3[/* value */ T, /* index */ Double, /* obj */ typingsJapgolly.sugar.Array[T], Boolean]) | searchFn[T]
    ): SugarDefaultChainable[T] = js.native
    def find(
      search: (js.Function3[/* value */ T, /* index */ Double, /* obj */ typingsJapgolly.sugar.Array[T], Boolean]) | searchFn[T],
      context: Any
    ): SugarDefaultChainable[T] = js.native
    
    def findFromIndex(startIndex: Double, args: Any*): SugarDefaultChainable[T] = js.native
    def findFromIndex(startIndex: Double, loop: Boolean, args: Any*): SugarDefaultChainable[T] = js.native
    def findFromIndex(startIndex: Double, loop: Unit, args: Any*): SugarDefaultChainable[T] = js.native
    
    def findIndex(search: T): SugarDefaultChainable[Double] = js.native
    def findIndex(search: T, context: Any): SugarDefaultChainable[Double] = js.native
    def findIndex(
      search: (js.Function3[/* value */ T, /* index */ Double, /* obj */ typingsJapgolly.sugar.Array[T], Boolean]) | searchFn[T]
    ): SugarDefaultChainable[Double] = js.native
    def findIndex(
      search: (js.Function3[/* value */ T, /* index */ Double, /* obj */ typingsJapgolly.sugar.Array[T], Boolean]) | searchFn[T],
      context: Any
    ): SugarDefaultChainable[Double] = js.native
    
    def findIndexFromIndex(startIndex: Double, args: Any*): SugarDefaultChainable[T] = js.native
    def findIndexFromIndex(startIndex: Double, loop: Boolean, args: Any*): SugarDefaultChainable[T] = js.native
    def findIndexFromIndex(startIndex: Double, loop: Unit, args: Any*): SugarDefaultChainable[T] = js.native
    
    def first(): SugarDefaultChainable[T] = js.native
    def first(num: Double): SugarDefaultChainable[T] = js.native
    
    def flatten(): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def flatten(limit: Double): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    
    def forEach(
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typingsJapgolly.sugar.Array[T], Unit]
    ): SugarDefaultChainable[Unit] = js.native
    def forEach(
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typingsJapgolly.sugar.Array[T], Unit],
      thisArg: Any
    ): SugarDefaultChainable[Unit] = js.native
    
    def forEachFromIndex(startIndex: Double, args: Any*): SugarDefaultChainable[T] = js.native
    def forEachFromIndex(startIndex: Double, loop: Boolean, args: Any*): SugarDefaultChainable[T] = js.native
    def forEachFromIndex(startIndex: Double, loop: Unit, args: Any*): SugarDefaultChainable[T] = js.native
    
    def from(index: Double): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    
    def groupBy[U](map: java.lang.String): SugarDefaultChainable[js.Object] = js.native
    def groupBy[U](
      map: java.lang.String,
      groupFn: js.Function3[
          /* arr */ typingsJapgolly.sugar.Array[T], 
          /* key */ java.lang.String, 
          /* obj */ js.Object, 
          SugarDefaultChainable[Unit]
        ]
    ): SugarDefaultChainable[js.Object] = js.native
    def groupBy[U](map: mapFn[T, U]): SugarDefaultChainable[js.Object] = js.native
    def groupBy[U](
      map: mapFn[T, U],
      groupFn: js.Function3[
          /* arr */ typingsJapgolly.sugar.Array[T], 
          /* key */ java.lang.String, 
          /* obj */ js.Object, 
          SugarDefaultChainable[Unit]
        ]
    ): SugarDefaultChainable[js.Object] = js.native
    
    def inGroups(num: Double): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def inGroups(num: Double, padding: Any): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    
    def inGroupsOf(num: Double): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def inGroupsOf(num: Double, padding: Any): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    
    def indexOf(searchElement: T): SugarDefaultChainable[Double] = js.native
    def indexOf(searchElement: T, fromIndex: Double): SugarDefaultChainable[Double] = js.native
    
    def insert(item: T): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def insert(item: T, index: Double): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def insert(item: typingsJapgolly.sugar.Array[T]): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def insert(item: typingsJapgolly.sugar.Array[T], index: Double): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    
    def intersect(arr: typingsJapgolly.sugar.Array[T]): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    
    def isEmpty(): SugarDefaultChainable[Boolean] = js.native
    
    def isEqual(arr: typingsJapgolly.sugar.Array[T]): SugarDefaultChainable[Boolean] = js.native
    
    def join(): SugarDefaultChainable[java.lang.String] = js.native
    def join(separator: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    
    def last(): SugarDefaultChainable[T] = js.native
    def last(num: Double): SugarDefaultChainable[T] = js.native
    
    def lastIndexOf(searchElement: T): SugarDefaultChainable[Double] = js.native
    def lastIndexOf(searchElement: T, fromIndex: Double): SugarDefaultChainable[Double] = js.native
    
    def least[U](): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def least[U](all: Boolean): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def least[U](all: Boolean, map: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def least[U](all: Boolean, map: mapFn[T, U]): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def least[U](all: Unit, map: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def least[U](all: Unit, map: mapFn[T, U]): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def least[U](map: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def least[U](map: mapFn[T, U]): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    
    def map[U](
      map: (js.Function3[/* value */ T, /* index */ Double, /* array */ typingsJapgolly.sugar.Array[T], U]) | (mapFn[T, U])
    ): SugarDefaultChainable[typingsJapgolly.sugar.Array[U]] = js.native
    def map[U](
      map: (js.Function3[/* value */ T, /* index */ Double, /* array */ typingsJapgolly.sugar.Array[T], U]) | (mapFn[T, U]),
      context: Any
    ): SugarDefaultChainable[typingsJapgolly.sugar.Array[U]] = js.native
    def map[U](map: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Array[U]] = js.native
    def map[U](map: java.lang.String, context: Any): SugarDefaultChainable[typingsJapgolly.sugar.Array[U]] = js.native
    
    def mapFromIndex(startIndex: Double, args: Any*): SugarDefaultChainable[T] = js.native
    def mapFromIndex(startIndex: Double, loop: Boolean, args: Any*): SugarDefaultChainable[T] = js.native
    def mapFromIndex(startIndex: Double, loop: Unit, args: Any*): SugarDefaultChainable[T] = js.native
    
    def max[U](): SugarDefaultChainable[T] = js.native
    def max[U](all: Boolean): SugarDefaultChainable[T] = js.native
    def max[U](all: Boolean, map: java.lang.String): SugarDefaultChainable[T] = js.native
    def max[U](all: Boolean, map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    def max[U](all: Unit, map: java.lang.String): SugarDefaultChainable[T] = js.native
    def max[U](all: Unit, map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    def max[U](map: java.lang.String): SugarDefaultChainable[T] = js.native
    def max[U](map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    
    def median[U](): SugarDefaultChainable[Double] = js.native
    def median[U](map: java.lang.String): SugarDefaultChainable[Double] = js.native
    def median[U](map: mapFn[T, U]): SugarDefaultChainable[Double] = js.native
    
    def min[U](): SugarDefaultChainable[T] = js.native
    def min[U](all: Boolean): SugarDefaultChainable[T] = js.native
    def min[U](all: Boolean, map: java.lang.String): SugarDefaultChainable[T] = js.native
    def min[U](all: Boolean, map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    def min[U](all: Unit, map: java.lang.String): SugarDefaultChainable[T] = js.native
    def min[U](all: Unit, map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    def min[U](map: java.lang.String): SugarDefaultChainable[T] = js.native
    def min[U](map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    
    def most[U](): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def most[U](all: Boolean): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def most[U](all: Boolean, map: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def most[U](all: Boolean, map: mapFn[T, U]): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def most[U](all: Unit, map: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def most[U](all: Unit, map: mapFn[T, U]): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def most[U](map: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def most[U](map: mapFn[T, U]): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    
    def none(search: T): SugarDefaultChainable[Boolean] = js.native
    def none(search: T, context: Any): SugarDefaultChainable[Boolean] = js.native
    def none(search: searchFn[T]): SugarDefaultChainable[Boolean] = js.native
    def none(search: searchFn[T], context: Any): SugarDefaultChainable[Boolean] = js.native
    
    def pop(): SugarDefaultChainable[js.UndefOr[T]] = js.native
    
    def push(items: T*): SugarDefaultChainable[Double] = js.native
    
    var raw: RawValue = js.native
    
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ T, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ typingsJapgolly.sugar.Array[T], 
          T
        ]
    ): SugarDefaultChainable[T] = js.native
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ T, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ typingsJapgolly.sugar.Array[T], 
          T
        ],
      initialValue: T
    ): SugarDefaultChainable[T] = js.native
    
    def reduceFromIndex(startIndex: Double, args: Any*): SugarDefaultChainable[T] = js.native
    def reduceFromIndex(startIndex: Double, loop: Boolean, args: Any*): SugarDefaultChainable[T] = js.native
    def reduceFromIndex(startIndex: Double, loop: Unit, args: Any*): SugarDefaultChainable[T] = js.native
    
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ T, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ typingsJapgolly.sugar.Array[T], 
          T
        ]
    ): SugarDefaultChainable[T] = js.native
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ T, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ typingsJapgolly.sugar.Array[T], 
          T
        ],
      initialValue: T
    ): SugarDefaultChainable[T] = js.native
    
    def reduceRightFromIndex(startIndex: Double, args: Any*): SugarDefaultChainable[T] = js.native
    def reduceRightFromIndex(startIndex: Double, loop: Boolean, args: Any*): SugarDefaultChainable[T] = js.native
    def reduceRightFromIndex(startIndex: Double, loop: Unit, args: Any*): SugarDefaultChainable[T] = js.native
    
    @JSName("reduceRight")
    def reduceRight_U[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ typingsJapgolly.sugar.Array[T], 
          U
        ],
      initialValue: U
    ): SugarDefaultChainable[U] = js.native
    
    @JSName("reduce")
    def reduce_U[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ typingsJapgolly.sugar.Array[T], 
          U
        ],
      initialValue: U
    ): SugarDefaultChainable[U] = js.native
    
    def remove(search: T): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def remove(search: searchFn[T]): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    
    def removeAt(start: Double): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def removeAt(start: Double, end: Double): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    
    def reverse(): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    
    def sample(): SugarDefaultChainable[T] = js.native
    def sample(num: Double): SugarDefaultChainable[T] = js.native
    def sample(num: Double, remove: Boolean): SugarDefaultChainable[T] = js.native
    def sample(num: Unit, remove: Boolean): SugarDefaultChainable[T] = js.native
    
    def shift(): SugarDefaultChainable[js.UndefOr[T]] = js.native
    
    def shuffle(): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    
    def slice(): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def slice(start: Double): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def slice(start: Double, end: Double): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def slice(start: Unit, end: Double): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    
    def some(search: T): SugarDefaultChainable[Boolean] = js.native
    def some(search: T, context: Any): SugarDefaultChainable[Boolean] = js.native
    def some(
      search: (js.Function3[/* value */ T, /* index */ Double, /* array */ typingsJapgolly.sugar.Array[T], Boolean]) | searchFn[T]
    ): SugarDefaultChainable[Boolean] = js.native
    def some(
      search: (js.Function3[/* value */ T, /* index */ Double, /* array */ typingsJapgolly.sugar.Array[T], Boolean]) | searchFn[T],
      context: Any
    ): SugarDefaultChainable[Boolean] = js.native
    
    def someFromIndex(startIndex: Double, args: Any*): SugarDefaultChainable[T] = js.native
    def someFromIndex(startIndex: Double, loop: Boolean, args: Any*): SugarDefaultChainable[T] = js.native
    def someFromIndex(startIndex: Double, loop: Unit, args: Any*): SugarDefaultChainable[T] = js.native
    
    def sort(): SugarDefaultChainable[this.type] = js.native
    def sort(compareFn: js.Function2[/* a */ T, /* b */ T, Double]): SugarDefaultChainable[this.type] = js.native
    
    def sortBy[U](): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def sortBy[U](map: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def sortBy[U](map: java.lang.String, desc: Boolean): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def sortBy[U](map: Unit, desc: Boolean): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def sortBy[U](map: sortMapFn[T, U]): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def sortBy[U](map: sortMapFn[T, U], desc: Boolean): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    
    def splice(start: Double): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def splice(start: Double, deleteCount: Double, items: T*): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    
    def subtract(item: T): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def subtract(item: typingsJapgolly.sugar.Array[T]): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    
    def sum[U](): SugarDefaultChainable[Double] = js.native
    def sum[U](map: java.lang.String): SugarDefaultChainable[Double] = js.native
    def sum[U](map: mapFn[T, U]): SugarDefaultChainable[Double] = js.native
    
    def to(index: Double): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    
    def union(arr: typingsJapgolly.sugar.Array[T]): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    
    def unique[U](): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def unique[U](map: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    def unique[U](map: mapFn[T, U]): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
    
    def unshift(items: T*): SugarDefaultChainable[Double] = js.native
    
    def zip(args: Any*): SugarDefaultChainable[typingsJapgolly.sugar.Array[T]] = js.native
  }
  
  @js.native
  trait Constructor
    extends StObject
       with SugarNamespace
       with Instantiable0[Chainable[js.Object, typingsJapgolly.sugar.Array[js.Object]]]
       with Instantiable1[
          (/* obj */ ArrayLike[js.Object]) | (/* obj */ Double), 
          Chainable[js.Object, typingsJapgolly.sugar.Array[js.Object]]
        ]
       with Instantiable2[
          (/* obj */ ArrayLike[js.Object]) | (/* obj */ Double) | (/* obj */ Unit), 
          /* clone */ Boolean, 
          Chainable[js.Object, typingsJapgolly.sugar.Array[js.Object]]
        ] {
    
    def apply[T](): Chainable[T, typingsJapgolly.sugar.Array[T]] = js.native
    def apply[T](obj: Double): Chainable[T, typingsJapgolly.sugar.Array[T]] = js.native
    def apply[T](obj: Double, clone: Boolean): Chainable[T, typingsJapgolly.sugar.Array[T]] = js.native
    def apply[T](obj: Unit, clone: Boolean): Chainable[T, typingsJapgolly.sugar.Array[T]] = js.native
    def apply[T](obj: ArrayLike[T]): Chainable[T, typingsJapgolly.sugar.Array[T]] = js.native
    def apply[T](obj: ArrayLike[T], clone: Boolean): Chainable[T, typingsJapgolly.sugar.Array[T]] = js.native
    
    def add[T](instance: typingsJapgolly.sugar.Array[T], item: T): typingsJapgolly.sugar.Array[T] = js.native
    def add[T](instance: typingsJapgolly.sugar.Array[T], item: T, index: Double): typingsJapgolly.sugar.Array[T] = js.native
    def add[T](instance: typingsJapgolly.sugar.Array[T], item: typingsJapgolly.sugar.Array[T]): typingsJapgolly.sugar.Array[T] = js.native
    def add[T](instance: typingsJapgolly.sugar.Array[T], item: typingsJapgolly.sugar.Array[T], index: Double): typingsJapgolly.sugar.Array[T] = js.native
    
    def append[T](instance: typingsJapgolly.sugar.Array[T], item: T): typingsJapgolly.sugar.Array[T] = js.native
    def append[T](instance: typingsJapgolly.sugar.Array[T], item: T, index: Double): typingsJapgolly.sugar.Array[T] = js.native
    def append[T](instance: typingsJapgolly.sugar.Array[T], item: typingsJapgolly.sugar.Array[T]): typingsJapgolly.sugar.Array[T] = js.native
    def append[T](instance: typingsJapgolly.sugar.Array[T], item: typingsJapgolly.sugar.Array[T], index: Double): typingsJapgolly.sugar.Array[T] = js.native
    
    def at[T](instance: typingsJapgolly.sugar.Array[T], index: Double): T = js.native
    def at[T](instance: typingsJapgolly.sugar.Array[T], index: Double, loop: Boolean): T = js.native
    def at[T](instance: typingsJapgolly.sugar.Array[T], index: typingsJapgolly.sugar.Array[Double]): T = js.native
    def at[T](
      instance: typingsJapgolly.sugar.Array[T],
      index: typingsJapgolly.sugar.Array[Double],
      loop: Boolean
    ): T = js.native
    
    def average[T, U](instance: typingsJapgolly.sugar.Array[T]): Double = js.native
    def average[T, U](instance: typingsJapgolly.sugar.Array[T], map: java.lang.String): Double = js.native
    def average[T, U](instance: typingsJapgolly.sugar.Array[T], map: mapFn[T, U]): Double = js.native
    
    def clone[T](instance: typingsJapgolly.sugar.Array[T]): typingsJapgolly.sugar.Array[T] = js.native
    
    def compact[T](instance: typingsJapgolly.sugar.Array[T]): typingsJapgolly.sugar.Array[T] = js.native
    def compact[T](instance: typingsJapgolly.sugar.Array[T], all: Boolean): typingsJapgolly.sugar.Array[T] = js.native
    
    def construct[T](n: Double, indexMapFn: js.Function1[/* i */ Double, T]): typingsJapgolly.sugar.Array[T] = js.native
    
    def count[T](instance: typingsJapgolly.sugar.Array[T], search: T): Double = js.native
    def count[T](instance: typingsJapgolly.sugar.Array[T], search: T, context: Any): Double = js.native
    def count[T](instance: typingsJapgolly.sugar.Array[T], search: searchFn[T]): Double = js.native
    def count[T](instance: typingsJapgolly.sugar.Array[T], search: searchFn[T], context: Any): Double = js.native
    
    def create[T](): typingsJapgolly.sugar.Array[T] = js.native
    def create[T](obj: Double): typingsJapgolly.sugar.Array[T] = js.native
    def create[T](obj: Double, clone: Boolean): typingsJapgolly.sugar.Array[T] = js.native
    def create[T](obj: Unit, clone: Boolean): typingsJapgolly.sugar.Array[T] = js.native
    def create[T](obj: ArrayLike[T]): typingsJapgolly.sugar.Array[T] = js.native
    def create[T](obj: ArrayLike[T], clone: Boolean): typingsJapgolly.sugar.Array[T] = js.native
    
    def every[T](instance: typingsJapgolly.sugar.Array[T], search: T): Boolean = js.native
    def every[T](instance: typingsJapgolly.sugar.Array[T], search: T, context: Any): Boolean = js.native
    def every[T](instance: typingsJapgolly.sugar.Array[T], search: searchFn[T]): Boolean = js.native
    def every[T](instance: typingsJapgolly.sugar.Array[T], search: searchFn[T], context: Any): Boolean = js.native
    
    def everyFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, args: Any*): T = js.native
    def everyFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, loop: Boolean, args: Any*): T = js.native
    def everyFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, loop: Unit, args: Any*): T = js.native
    
    def exclude[T](instance: typingsJapgolly.sugar.Array[T], search: T): typingsJapgolly.sugar.Array[T] = js.native
    def exclude[T](instance: typingsJapgolly.sugar.Array[T], search: searchFn[T]): typingsJapgolly.sugar.Array[T] = js.native
    
    def filter[T](instance: typingsJapgolly.sugar.Array[T], search: T): typingsJapgolly.sugar.Array[T] = js.native
    def filter[T](instance: typingsJapgolly.sugar.Array[T], search: T, context: Any): typingsJapgolly.sugar.Array[T] = js.native
    def filter[T](instance: typingsJapgolly.sugar.Array[T], search: searchFn[T]): typingsJapgolly.sugar.Array[T] = js.native
    def filter[T](instance: typingsJapgolly.sugar.Array[T], search: searchFn[T], context: Any): typingsJapgolly.sugar.Array[T] = js.native
    
    def filterFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, args: Any*): T = js.native
    def filterFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, loop: Boolean, args: Any*): T = js.native
    def filterFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, loop: Unit, args: Any*): T = js.native
    
    def find[T](instance: typingsJapgolly.sugar.Array[T], search: T): T = js.native
    def find[T](instance: typingsJapgolly.sugar.Array[T], search: T, context: Any): T = js.native
    def find[T](instance: typingsJapgolly.sugar.Array[T], search: searchFn[T]): T = js.native
    def find[T](instance: typingsJapgolly.sugar.Array[T], search: searchFn[T], context: Any): T = js.native
    
    def findFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, args: Any*): T = js.native
    def findFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, loop: Boolean, args: Any*): T = js.native
    def findFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, loop: Unit, args: Any*): T = js.native
    
    def findIndex[T](instance: typingsJapgolly.sugar.Array[T], search: T): Double = js.native
    def findIndex[T](instance: typingsJapgolly.sugar.Array[T], search: T, context: Any): Double = js.native
    def findIndex[T](instance: typingsJapgolly.sugar.Array[T], search: searchFn[T]): Double = js.native
    def findIndex[T](instance: typingsJapgolly.sugar.Array[T], search: searchFn[T], context: Any): Double = js.native
    
    def findIndexFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, args: Any*): T = js.native
    def findIndexFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, loop: Boolean, args: Any*): T = js.native
    def findIndexFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, loop: Unit, args: Any*): T = js.native
    
    def first[T](instance: typingsJapgolly.sugar.Array[T]): T = js.native
    def first[T](instance: typingsJapgolly.sugar.Array[T], num: Double): T = js.native
    
    def flatten[T](instance: typingsJapgolly.sugar.Array[T]): typingsJapgolly.sugar.Array[T] = js.native
    def flatten[T](instance: typingsJapgolly.sugar.Array[T], limit: Double): typingsJapgolly.sugar.Array[T] = js.native
    
    def forEachFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, args: Any*): T = js.native
    def forEachFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, loop: Boolean, args: Any*): T = js.native
    def forEachFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, loop: Unit, args: Any*): T = js.native
    
    def from[T](instance: typingsJapgolly.sugar.Array[T], index: Double): typingsJapgolly.sugar.Array[T] = js.native
    
    def getOption[T](name: java.lang.String): T = js.native
    
    def groupBy[T, U](instance: typingsJapgolly.sugar.Array[T], map: java.lang.String): js.Object = js.native
    def groupBy[T, U](
      instance: typingsJapgolly.sugar.Array[T],
      map: java.lang.String,
      groupFn: js.Function3[
          /* arr */ typingsJapgolly.sugar.Array[T], 
          /* key */ java.lang.String, 
          /* obj */ js.Object, 
          Unit
        ]
    ): js.Object = js.native
    def groupBy[T, U](instance: typingsJapgolly.sugar.Array[T], map: mapFn[T, U]): js.Object = js.native
    def groupBy[T, U](
      instance: typingsJapgolly.sugar.Array[T],
      map: mapFn[T, U],
      groupFn: js.Function3[
          /* arr */ typingsJapgolly.sugar.Array[T], 
          /* key */ java.lang.String, 
          /* obj */ js.Object, 
          Unit
        ]
    ): js.Object = js.native
    
    def inGroups[T](instance: typingsJapgolly.sugar.Array[T], num: Double): typingsJapgolly.sugar.Array[T] = js.native
    def inGroups[T](instance: typingsJapgolly.sugar.Array[T], num: Double, padding: Any): typingsJapgolly.sugar.Array[T] = js.native
    
    def inGroupsOf[T](instance: typingsJapgolly.sugar.Array[T], num: Double): typingsJapgolly.sugar.Array[T] = js.native
    def inGroupsOf[T](instance: typingsJapgolly.sugar.Array[T], num: Double, padding: Any): typingsJapgolly.sugar.Array[T] = js.native
    
    def insert[T](instance: typingsJapgolly.sugar.Array[T], item: T): typingsJapgolly.sugar.Array[T] = js.native
    def insert[T](instance: typingsJapgolly.sugar.Array[T], item: T, index: Double): typingsJapgolly.sugar.Array[T] = js.native
    def insert[T](instance: typingsJapgolly.sugar.Array[T], item: typingsJapgolly.sugar.Array[T]): typingsJapgolly.sugar.Array[T] = js.native
    def insert[T](instance: typingsJapgolly.sugar.Array[T], item: typingsJapgolly.sugar.Array[T], index: Double): typingsJapgolly.sugar.Array[T] = js.native
    
    def intersect[T](instance: typingsJapgolly.sugar.Array[T], arr: typingsJapgolly.sugar.Array[T]): typingsJapgolly.sugar.Array[T] = js.native
    
    def isEmpty[T](instance: typingsJapgolly.sugar.Array[T]): Boolean = js.native
    
    def isEqual[T](instance: typingsJapgolly.sugar.Array[T], arr: typingsJapgolly.sugar.Array[T]): Boolean = js.native
    
    def last[T](instance: typingsJapgolly.sugar.Array[T]): T = js.native
    def last[T](instance: typingsJapgolly.sugar.Array[T], num: Double): T = js.native
    
    def least[T, U](instance: typingsJapgolly.sugar.Array[T]): typingsJapgolly.sugar.Array[T] = js.native
    def least[T, U](instance: typingsJapgolly.sugar.Array[T], all: Boolean): typingsJapgolly.sugar.Array[T] = js.native
    def least[T, U](instance: typingsJapgolly.sugar.Array[T], all: Boolean, map: java.lang.String): typingsJapgolly.sugar.Array[T] = js.native
    def least[T, U](instance: typingsJapgolly.sugar.Array[T], all: Boolean, map: mapFn[T, U]): typingsJapgolly.sugar.Array[T] = js.native
    def least[T, U](instance: typingsJapgolly.sugar.Array[T], all: Unit, map: java.lang.String): typingsJapgolly.sugar.Array[T] = js.native
    def least[T, U](instance: typingsJapgolly.sugar.Array[T], all: Unit, map: mapFn[T, U]): typingsJapgolly.sugar.Array[T] = js.native
    def least[T, U](instance: typingsJapgolly.sugar.Array[T], map: java.lang.String): typingsJapgolly.sugar.Array[T] = js.native
    def least[T, U](instance: typingsJapgolly.sugar.Array[T], map: mapFn[T, U]): typingsJapgolly.sugar.Array[T] = js.native
    
    def map[T, U](instance: typingsJapgolly.sugar.Array[T], map: java.lang.String): typingsJapgolly.sugar.Array[U] = js.native
    def map[T, U](instance: typingsJapgolly.sugar.Array[T], map: java.lang.String, context: Any): typingsJapgolly.sugar.Array[U] = js.native
    def map[T, U](instance: typingsJapgolly.sugar.Array[T], map: mapFn[T, U]): typingsJapgolly.sugar.Array[U] = js.native
    def map[T, U](instance: typingsJapgolly.sugar.Array[T], map: mapFn[T, U], context: Any): typingsJapgolly.sugar.Array[U] = js.native
    
    def mapFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, args: Any*): T = js.native
    def mapFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, loop: Boolean, args: Any*): T = js.native
    def mapFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, loop: Unit, args: Any*): T = js.native
    
    def max[T, U](instance: typingsJapgolly.sugar.Array[T]): T = js.native
    def max[T, U](instance: typingsJapgolly.sugar.Array[T], all: Boolean): T = js.native
    def max[T, U](instance: typingsJapgolly.sugar.Array[T], all: Boolean, map: java.lang.String): T = js.native
    def max[T, U](instance: typingsJapgolly.sugar.Array[T], all: Boolean, map: mapFn[T, U]): T = js.native
    def max[T, U](instance: typingsJapgolly.sugar.Array[T], all: Unit, map: java.lang.String): T = js.native
    def max[T, U](instance: typingsJapgolly.sugar.Array[T], all: Unit, map: mapFn[T, U]): T = js.native
    def max[T, U](instance: typingsJapgolly.sugar.Array[T], map: java.lang.String): T = js.native
    def max[T, U](instance: typingsJapgolly.sugar.Array[T], map: mapFn[T, U]): T = js.native
    
    def median[T, U](instance: typingsJapgolly.sugar.Array[T]): Double = js.native
    def median[T, U](instance: typingsJapgolly.sugar.Array[T], map: java.lang.String): Double = js.native
    def median[T, U](instance: typingsJapgolly.sugar.Array[T], map: mapFn[T, U]): Double = js.native
    
    def min[T, U](instance: typingsJapgolly.sugar.Array[T]): T = js.native
    def min[T, U](instance: typingsJapgolly.sugar.Array[T], all: Boolean): T = js.native
    def min[T, U](instance: typingsJapgolly.sugar.Array[T], all: Boolean, map: java.lang.String): T = js.native
    def min[T, U](instance: typingsJapgolly.sugar.Array[T], all: Boolean, map: mapFn[T, U]): T = js.native
    def min[T, U](instance: typingsJapgolly.sugar.Array[T], all: Unit, map: java.lang.String): T = js.native
    def min[T, U](instance: typingsJapgolly.sugar.Array[T], all: Unit, map: mapFn[T, U]): T = js.native
    def min[T, U](instance: typingsJapgolly.sugar.Array[T], map: java.lang.String): T = js.native
    def min[T, U](instance: typingsJapgolly.sugar.Array[T], map: mapFn[T, U]): T = js.native
    
    def most[T, U](instance: typingsJapgolly.sugar.Array[T]): typingsJapgolly.sugar.Array[T] = js.native
    def most[T, U](instance: typingsJapgolly.sugar.Array[T], all: Boolean): typingsJapgolly.sugar.Array[T] = js.native
    def most[T, U](instance: typingsJapgolly.sugar.Array[T], all: Boolean, map: java.lang.String): typingsJapgolly.sugar.Array[T] = js.native
    def most[T, U](instance: typingsJapgolly.sugar.Array[T], all: Boolean, map: mapFn[T, U]): typingsJapgolly.sugar.Array[T] = js.native
    def most[T, U](instance: typingsJapgolly.sugar.Array[T], all: Unit, map: java.lang.String): typingsJapgolly.sugar.Array[T] = js.native
    def most[T, U](instance: typingsJapgolly.sugar.Array[T], all: Unit, map: mapFn[T, U]): typingsJapgolly.sugar.Array[T] = js.native
    def most[T, U](instance: typingsJapgolly.sugar.Array[T], map: java.lang.String): typingsJapgolly.sugar.Array[T] = js.native
    def most[T, U](instance: typingsJapgolly.sugar.Array[T], map: mapFn[T, U]): typingsJapgolly.sugar.Array[T] = js.native
    
    def none[T](instance: typingsJapgolly.sugar.Array[T], search: T): Boolean = js.native
    def none[T](instance: typingsJapgolly.sugar.Array[T], search: T, context: Any): Boolean = js.native
    def none[T](instance: typingsJapgolly.sugar.Array[T], search: searchFn[T]): Boolean = js.native
    def none[T](instance: typingsJapgolly.sugar.Array[T], search: searchFn[T], context: Any): Boolean = js.native
    
    def reduceFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, args: Any*): T = js.native
    def reduceFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, loop: Boolean, args: Any*): T = js.native
    def reduceFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, loop: Unit, args: Any*): T = js.native
    
    def reduceRightFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, args: Any*): T = js.native
    def reduceRightFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, loop: Boolean, args: Any*): T = js.native
    def reduceRightFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, loop: Unit, args: Any*): T = js.native
    
    def remove[T](instance: typingsJapgolly.sugar.Array[T], search: T): typingsJapgolly.sugar.Array[T] = js.native
    def remove[T](instance: typingsJapgolly.sugar.Array[T], search: searchFn[T]): typingsJapgolly.sugar.Array[T] = js.native
    
    def removeAt[T](instance: typingsJapgolly.sugar.Array[T], start: Double): typingsJapgolly.sugar.Array[T] = js.native
    def removeAt[T](instance: typingsJapgolly.sugar.Array[T], start: Double, end: Double): typingsJapgolly.sugar.Array[T] = js.native
    
    def sample[T](instance: typingsJapgolly.sugar.Array[T]): T = js.native
    def sample[T](instance: typingsJapgolly.sugar.Array[T], num: Double): T = js.native
    def sample[T](instance: typingsJapgolly.sugar.Array[T], num: Double, remove: Boolean): T = js.native
    def sample[T](instance: typingsJapgolly.sugar.Array[T], num: Unit, remove: Boolean): T = js.native
    
    def setOption(name: java.lang.String, value: Any): Unit = js.native
    def setOption(options: ArrayOptions): Unit = js.native
    
    def shuffle[T](instance: typingsJapgolly.sugar.Array[T]): typingsJapgolly.sugar.Array[T] = js.native
    
    def some[T](instance: typingsJapgolly.sugar.Array[T], search: T): Boolean = js.native
    def some[T](instance: typingsJapgolly.sugar.Array[T], search: T, context: Any): Boolean = js.native
    def some[T](instance: typingsJapgolly.sugar.Array[T], search: searchFn[T]): Boolean = js.native
    def some[T](instance: typingsJapgolly.sugar.Array[T], search: searchFn[T], context: Any): Boolean = js.native
    
    def someFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, args: Any*): T = js.native
    def someFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, loop: Boolean, args: Any*): T = js.native
    def someFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, loop: Unit, args: Any*): T = js.native
    
    def sortBy[T, U](instance: typingsJapgolly.sugar.Array[T]): typingsJapgolly.sugar.Array[T] = js.native
    def sortBy[T, U](instance: typingsJapgolly.sugar.Array[T], map: java.lang.String): typingsJapgolly.sugar.Array[T] = js.native
    def sortBy[T, U](instance: typingsJapgolly.sugar.Array[T], map: java.lang.String, desc: Boolean): typingsJapgolly.sugar.Array[T] = js.native
    def sortBy[T, U](instance: typingsJapgolly.sugar.Array[T], map: Unit, desc: Boolean): typingsJapgolly.sugar.Array[T] = js.native
    def sortBy[T, U](instance: typingsJapgolly.sugar.Array[T], map: sortMapFn[T, U]): typingsJapgolly.sugar.Array[T] = js.native
    def sortBy[T, U](instance: typingsJapgolly.sugar.Array[T], map: sortMapFn[T, U], desc: Boolean): typingsJapgolly.sugar.Array[T] = js.native
    
    def subtract[T](instance: typingsJapgolly.sugar.Array[T], item: T): typingsJapgolly.sugar.Array[T] = js.native
    def subtract[T](instance: typingsJapgolly.sugar.Array[T], item: typingsJapgolly.sugar.Array[T]): typingsJapgolly.sugar.Array[T] = js.native
    
    def sum[T, U](instance: typingsJapgolly.sugar.Array[T]): Double = js.native
    def sum[T, U](instance: typingsJapgolly.sugar.Array[T], map: java.lang.String): Double = js.native
    def sum[T, U](instance: typingsJapgolly.sugar.Array[T], map: mapFn[T, U]): Double = js.native
    
    def to[T](instance: typingsJapgolly.sugar.Array[T], index: Double): typingsJapgolly.sugar.Array[T] = js.native
    
    def union[T](instance: typingsJapgolly.sugar.Array[T], arr: typingsJapgolly.sugar.Array[T]): typingsJapgolly.sugar.Array[T] = js.native
    
    def unique[T, U](instance: typingsJapgolly.sugar.Array[T]): typingsJapgolly.sugar.Array[T] = js.native
    def unique[T, U](instance: typingsJapgolly.sugar.Array[T], map: java.lang.String): typingsJapgolly.sugar.Array[T] = js.native
    def unique[T, U](instance: typingsJapgolly.sugar.Array[T], map: mapFn[T, U]): typingsJapgolly.sugar.Array[T] = js.native
    
    def zip[T](instance: typingsJapgolly.sugar.Array[T], args: Any*): typingsJapgolly.sugar.Array[T] = js.native
  }
  
  type mapFn[T, U] = js.Function3[/* el */ T, /* i */ Double, /* arr */ typingsJapgolly.sugar.Array[T], U]
  
  type searchFn[T] = js.Function3[/* el */ T, /* i */ Double, /* arr */ typingsJapgolly.sugar.Array[T], Boolean]
  
  type sortMapFn[T, U] = js.Function1[/* el */ T, U]
}
