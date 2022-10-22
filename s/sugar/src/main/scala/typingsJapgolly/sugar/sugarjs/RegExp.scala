package typingsJapgolly.sugar.sugarjs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.std.RegExpExecArray
import typingsJapgolly.sugar.sugarjs.Object.ObjectMergeOptions
import typingsJapgolly.sugar.sugarjs.Object.QueryStringOptions
import typingsJapgolly.sugar.sugarjs.Object.mapFn
import typingsJapgolly.sugar.sugarjs.Object.searchFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RegExp {
  
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
  
  trait ChainableBase[RawValue] extends StObject {
    
    def addFlags(flags: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.RegExp]
    
    def exec(string: java.lang.String): SugarDefaultChainable[RegExpExecArray | Null]
    
    def getFlags(): SugarDefaultChainable[java.lang.String]
    
    var raw: RawValue
    
    def removeFlags(flags: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.RegExp]
    
    def setFlags(flags: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.RegExp]
    
    def test(string: java.lang.String): SugarDefaultChainable[Boolean]
  }
  object ChainableBase {
    
    inline def apply[RawValue](
      addFlags: java.lang.String => SugarDefaultChainable[typingsJapgolly.sugar.RegExp],
      exec: java.lang.String => SugarDefaultChainable[RegExpExecArray | Null],
      getFlags: CallbackTo[SugarDefaultChainable[java.lang.String]],
      raw: RawValue,
      removeFlags: java.lang.String => SugarDefaultChainable[typingsJapgolly.sugar.RegExp],
      setFlags: java.lang.String => SugarDefaultChainable[typingsJapgolly.sugar.RegExp],
      test: java.lang.String => SugarDefaultChainable[Boolean]
    ): ChainableBase[RawValue] = {
      val __obj = js.Dynamic.literal(addFlags = js.Any.fromFunction1(addFlags), exec = js.Any.fromFunction1(exec), getFlags = getFlags.toJsFn, raw = raw.asInstanceOf[js.Any], removeFlags = js.Any.fromFunction1(removeFlags), setFlags = js.Any.fromFunction1(setFlags), test = js.Any.fromFunction1(test))
      __obj.asInstanceOf[ChainableBase[RawValue]]
    }
    
    extension [Self <: ChainableBase[?], RawValue](x: Self & ChainableBase[RawValue]) {
      
      inline def setAddFlags(value: java.lang.String => SugarDefaultChainable[typingsJapgolly.sugar.RegExp]): Self = StObject.set(x, "addFlags", js.Any.fromFunction1(value))
      
      inline def setExec(value: java.lang.String => SugarDefaultChainable[RegExpExecArray | Null]): Self = StObject.set(x, "exec", js.Any.fromFunction1(value))
      
      inline def setGetFlags(value: CallbackTo[SugarDefaultChainable[java.lang.String]]): Self = StObject.set(x, "getFlags", value.toJsFn)
      
      inline def setRaw(value: RawValue): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRemoveFlags(value: java.lang.String => SugarDefaultChainable[typingsJapgolly.sugar.RegExp]): Self = StObject.set(x, "removeFlags", js.Any.fromFunction1(value))
      
      inline def setSetFlags(value: java.lang.String => SugarDefaultChainable[typingsJapgolly.sugar.RegExp]): Self = StObject.set(x, "setFlags", js.Any.fromFunction1(value))
      
      inline def setTest(value: java.lang.String => SugarDefaultChainable[Boolean]): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with SugarNamespace
       with Instantiable0[Chainable[typingsJapgolly.sugar.RegExp]]
       with Instantiable1[/* raw */ typingsJapgolly.sugar.RegExp, Chainable[typingsJapgolly.sugar.RegExp]] {
    
    def apply(): Chainable[typingsJapgolly.sugar.RegExp] = js.native
    def apply(raw: typingsJapgolly.sugar.RegExp): Chainable[typingsJapgolly.sugar.RegExp] = js.native
    
    def addFlags(instance: typingsJapgolly.sugar.RegExp, flags: java.lang.String): typingsJapgolly.sugar.RegExp = js.native
    
    def escape(): java.lang.String = js.native
    def escape(str: java.lang.String): java.lang.String = js.native
    
    def getFlags(instance: typingsJapgolly.sugar.RegExp): java.lang.String = js.native
    
    def removeFlags(instance: typingsJapgolly.sugar.RegExp, flags: java.lang.String): typingsJapgolly.sugar.RegExp = js.native
    
    def setFlags(instance: typingsJapgolly.sugar.RegExp, flags: java.lang.String): typingsJapgolly.sugar.RegExp = js.native
  }
}
