package typingsJapgolly.deepmergeTs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.deepmergeTs.deepmergeTsBooleans.`false`
import typingsJapgolly.deepmergeTs.distNodeTypesLegacyV46Mod.DeepMergeMergeFunctionURIs
import typingsJapgolly.deepmergeTs.mod.DeepMergeMergeFunctionUtils
import typingsJapgolly.deepmergeTs.mod.MetaDataUpdater
import typingsJapgolly.std.FlatArray
import typingsJapgolly.std.IterableIterator
import typingsJapgolly.std.ReadonlyMap
import typingsJapgolly.std.ReadonlySet
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionsURIs> */
  trait PartialDeepMergeMergeFunc extends StObject {
    
    var DeepMergeArraysURI: js.UndefOr[DeepMergeMergeFunctionURIs] = js.undefined
    
    var DeepMergeMapsURI: js.UndefOr[DeepMergeMergeFunctionURIs] = js.undefined
    
    var DeepMergeOthersURI: js.UndefOr[DeepMergeMergeFunctionURIs] = js.undefined
    
    var DeepMergeRecordsURI: js.UndefOr[DeepMergeMergeFunctionURIs] = js.undefined
    
    var DeepMergeSetsURI: js.UndefOr[DeepMergeMergeFunctionURIs] = js.undefined
  }
  object PartialDeepMergeMergeFunc {
    
    inline def apply(): PartialDeepMergeMergeFunc = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDeepMergeMergeFunc]
    }
    
    extension [Self <: PartialDeepMergeMergeFunc](x: Self) {
      
      inline def setDeepMergeArraysURI(value: DeepMergeMergeFunctionURIs): Self = StObject.set(x, "DeepMergeArraysURI", value.asInstanceOf[js.Any])
      
      inline def setDeepMergeArraysURIUndefined: Self = StObject.set(x, "DeepMergeArraysURI", js.undefined)
      
      inline def setDeepMergeMapsURI(value: DeepMergeMergeFunctionURIs): Self = StObject.set(x, "DeepMergeMapsURI", value.asInstanceOf[js.Any])
      
      inline def setDeepMergeMapsURIUndefined: Self = StObject.set(x, "DeepMergeMapsURI", js.undefined)
      
      inline def setDeepMergeOthersURI(value: DeepMergeMergeFunctionURIs): Self = StObject.set(x, "DeepMergeOthersURI", value.asInstanceOf[js.Any])
      
      inline def setDeepMergeOthersURIUndefined: Self = StObject.set(x, "DeepMergeOthersURI", js.undefined)
      
      inline def setDeepMergeRecordsURI(value: DeepMergeMergeFunctionURIs): Self = StObject.set(x, "DeepMergeRecordsURI", value.asInstanceOf[js.Any])
      
      inline def setDeepMergeRecordsURIUndefined: Self = StObject.set(x, "DeepMergeRecordsURI", js.undefined)
      
      inline def setDeepMergeSetsURI(value: DeepMergeMergeFunctionURIs): Self = StObject.set(x, "DeepMergeSetsURI", value.asInstanceOf[js.Any])
      
      inline def setDeepMergeSetsURIUndefined: Self = StObject.set(x, "DeepMergeSetsURI", js.undefined)
    }
  }
  
  /* Inlined std.Partial<deepmerge-ts.deepmerge-ts.DeepMergeOptionsFull> */
  trait PartialDeepMergeOptionsFu extends StObject {
    
    var mergeArrays: js.UndefOr[
        (js.Function3[
          /* records */ js.Array[js.Array[Any]], 
          /* utils */ DeepMergeMergeFunctionUtils, 
          /* meta */ Any, 
          Any
        ]) | `false`
      ] = js.undefined
    
    var mergeMaps: js.UndefOr[
        (js.Function3[
          /* records */ js.Array[ReadonlyReadonlyMapanyany], 
          /* utils */ DeepMergeMergeFunctionUtils, 
          /* meta */ Any, 
          Any
        ]) | `false`
      ] = js.undefined
    
    var mergeOthers: js.UndefOr[
        js.Function3[
          /* records */ js.Array[Any], 
          /* utils */ DeepMergeMergeFunctionUtils, 
          /* meta */ Any, 
          Any
        ]
      ] = js.undefined
    
    var mergeRecords: js.UndefOr[
        (js.Function3[
          /* records */ js.Array[Record[/* keyof any */ String, Any]], 
          /* utils */ DeepMergeMergeFunctionUtils, 
          /* meta */ Any, 
          Any
        ]) | `false`
      ] = js.undefined
    
    var mergeSets: js.UndefOr[
        (js.Function3[
          /* records */ js.Array[ReadonlyReadonlySetany], 
          /* utils */ DeepMergeMergeFunctionUtils, 
          /* meta */ Any, 
          Any
        ]) | `false`
      ] = js.undefined
    
    var metaDataUpdater: js.UndefOr[MetaDataUpdater] = js.undefined
  }
  object PartialDeepMergeOptionsFu {
    
    inline def apply(): PartialDeepMergeOptionsFu = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDeepMergeOptionsFu]
    }
    
    extension [Self <: PartialDeepMergeOptionsFu](x: Self) {
      
      inline def setMergeArrays(
        value: (js.Function3[
              /* records */ js.Array[js.Array[Any]], 
              /* utils */ DeepMergeMergeFunctionUtils, 
              /* meta */ Any, 
              Any
            ]) | `false`
      ): Self = StObject.set(x, "mergeArrays", value.asInstanceOf[js.Any])
      
      inline def setMergeArraysFunction3(
        value: (/* records */ js.Array[js.Array[Any]], /* utils */ DeepMergeMergeFunctionUtils, /* meta */ Any) => Any
      ): Self = StObject.set(x, "mergeArrays", js.Any.fromFunction3(value))
      
      inline def setMergeArraysUndefined: Self = StObject.set(x, "mergeArrays", js.undefined)
      
      inline def setMergeMaps(
        value: (js.Function3[
              /* records */ js.Array[ReadonlyReadonlyMapanyany], 
              /* utils */ DeepMergeMergeFunctionUtils, 
              /* meta */ Any, 
              Any
            ]) | `false`
      ): Self = StObject.set(x, "mergeMaps", value.asInstanceOf[js.Any])
      
      inline def setMergeMapsFunction3(
        value: (/* records */ js.Array[ReadonlyReadonlyMapanyany], /* utils */ DeepMergeMergeFunctionUtils, /* meta */ Any) => Any
      ): Self = StObject.set(x, "mergeMaps", js.Any.fromFunction3(value))
      
      inline def setMergeMapsUndefined: Self = StObject.set(x, "mergeMaps", js.undefined)
      
      inline def setMergeOthers(
        value: (/* records */ js.Array[Any], /* utils */ DeepMergeMergeFunctionUtils, /* meta */ Any) => Any
      ): Self = StObject.set(x, "mergeOthers", js.Any.fromFunction3(value))
      
      inline def setMergeOthersUndefined: Self = StObject.set(x, "mergeOthers", js.undefined)
      
      inline def setMergeRecords(
        value: (js.Function3[
              /* records */ js.Array[Record[/* keyof any */ String, Any]], 
              /* utils */ DeepMergeMergeFunctionUtils, 
              /* meta */ Any, 
              Any
            ]) | `false`
      ): Self = StObject.set(x, "mergeRecords", value.asInstanceOf[js.Any])
      
      inline def setMergeRecordsFunction3(
        value: (/* records */ js.Array[Record[/* keyof any */ String, Any]], /* utils */ DeepMergeMergeFunctionUtils, /* meta */ Any) => Any
      ): Self = StObject.set(x, "mergeRecords", js.Any.fromFunction3(value))
      
      inline def setMergeRecordsUndefined: Self = StObject.set(x, "mergeRecords", js.undefined)
      
      inline def setMergeSets(
        value: (js.Function3[
              /* records */ js.Array[ReadonlyReadonlySetany], 
              /* utils */ DeepMergeMergeFunctionUtils, 
              /* meta */ Any, 
              Any
            ]) | `false`
      ): Self = StObject.set(x, "mergeSets", value.asInstanceOf[js.Any])
      
      inline def setMergeSetsFunction3(
        value: (/* records */ js.Array[ReadonlyReadonlySetany], /* utils */ DeepMergeMergeFunctionUtils, /* meta */ Any) => Any
      ): Self = StObject.set(x, "mergeSets", js.Any.fromFunction3(value))
      
      inline def setMergeSetsUndefined: Self = StObject.set(x, "mergeSets", js.undefined)
      
      inline def setMetaDataUpdater(value: (/* previousMeta */ Any, /* metaMeta */ Any) => Any): Self = StObject.set(x, "metaDataUpdater", js.Any.fromFunction2(value))
      
      inline def setMetaDataUpdaterUndefined: Self = StObject.set(x, "metaDataUpdater", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<std.ReadonlyArray<unknown>> */
  trait ReadonlyReadonlyArrayunkn extends StObject {
    
    def at(index: Double): js.UndefOr[Any]
    
    def concat(items: js.Array[Any]*): js.Array[Any]
    
    def entries(): IterableIterator[js.Tuple2[Double, Any]]
    
    def every[S /* <: Any */](
      predicate: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], /* is S */ Boolean]
    ): /* is std.Array<S> */ Boolean
    
    def filter[S /* <: Any */](
      predicate: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], /* is S */ Boolean]
    ): js.Array[S]
    
    def find[S /* <: Any */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ Any, 
          /* index */ Double, 
          /* obj */ js.Array[Any], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S]
    
    def findIndex(predicate: js.Function3[/* value */ Any, /* index */ Double, /* obj */ js.Array[Any], Any]): Double
    
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]]
    
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ Any, 
          /* index */ Double, 
          /* array */ js.Array[Any], 
          U | js.Array[U]
        ]
    ): js.Array[U]
    
    def forEach(callbackfn: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Unit]): Unit
    
    def includes(searchElement: Any): Boolean
    
    def indexOf(searchElement: Any): Double
    
    def join(): String
    
    def keys(): IterableIterator[Double]
    
    def lastIndexOf(searchElement: Any): Double
    
    val length: Double
    
    def map[U](callbackfn: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], U]): js.Array[U]
    
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ Any, 
          /* currentValue */ Any, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Any], 
          Any
        ]
    ): Any
    
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ Any, 
          /* currentValue */ Any, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Any], 
          Any
        ]
    ): Any
    
    def slice(): js.Array[Any]
    
    def some(predicate: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Any]): Boolean
    
    def values(): IterableIterator[Any]
  }
  object ReadonlyReadonlyArrayunkn {
    
    inline def apply(
      at: Double => js.UndefOr[Any],
      concat: /* repeated */ js.Array[Any] => js.Array[Any],
      entries: CallbackTo[IterableIterator[js.Tuple2[Double, Any]]],
      every: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], /* is S */ Boolean] => /* is std.Array<S> */ Boolean,
      filter: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], /* is S */ Boolean] => js.Array[Any],
      find: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ Any, 
          /* index */ Double, 
          /* obj */ js.Array[Any], 
          /* is S */ Boolean
        ] => js.UndefOr[Any],
      findIndex: js.Function3[/* value */ Any, /* index */ Double, /* obj */ js.Array[Any], Any] => Double,
      flat: CallbackTo[js.Array[FlatArray[Any, Any]]],
      flatMap: js.ThisFunction3[Any, /* value */ Any, /* index */ Double, /* array */ js.Array[Any], Any | js.Array[Any]] => js.Array[Any],
      forEach: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Unit] => Callback,
      includes: Any => Boolean,
      indexOf: Any => Double,
      join: CallbackTo[String],
      keys: CallbackTo[IterableIterator[Double]],
      lastIndexOf: Any => Double,
      length: Double,
      map: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Any] => js.Array[Any],
      reduce: js.Function4[
          /* previousValue */ Any, 
          /* currentValue */ Any, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Any], 
          Any
        ] => Any,
      reduceRight: js.Function4[
          /* previousValue */ Any, 
          /* currentValue */ Any, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Any], 
          Any
        ] => Any,
      slice: CallbackTo[js.Array[Any]],
      some: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Any] => Boolean,
      values: CallbackTo[IterableIterator[Any]]
    ): ReadonlyReadonlyArrayunkn = {
      val __obj = js.Dynamic.literal(at = js.Any.fromFunction1(at), concat = js.Any.fromFunction1(concat), entries = entries.toJsFn, every = js.Any.fromFunction1(every), filter = js.Any.fromFunction1(filter), find = js.Any.fromFunction1(find), findIndex = js.Any.fromFunction1(findIndex), flat = flat.toJsFn, flatMap = js.Any.fromFunction1(flatMap), forEach = js.Any.fromFunction1((t0: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Unit]) => forEach(t0).runNow()), includes = js.Any.fromFunction1(includes), indexOf = js.Any.fromFunction1(indexOf), join = join.toJsFn, keys = keys.toJsFn, lastIndexOf = js.Any.fromFunction1(lastIndexOf), length = length.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), reduce = js.Any.fromFunction1(reduce), reduceRight = js.Any.fromFunction1(reduceRight), slice = slice.toJsFn, some = js.Any.fromFunction1(some), values = values.toJsFn)
      __obj.asInstanceOf[ReadonlyReadonlyArrayunkn]
    }
    
    extension [Self <: ReadonlyReadonlyArrayunkn](x: Self) {
      
      inline def setAt(value: Double => js.UndefOr[Any]): Self = StObject.set(x, "at", js.Any.fromFunction1(value))
      
      inline def setConcat(value: /* repeated */ js.Array[Any] => js.Array[Any]): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
      
      inline def setEntries(value: CallbackTo[IterableIterator[js.Tuple2[Double, Any]]]): Self = StObject.set(x, "entries", value.toJsFn)
      
      inline def setEvery(
        value: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], /* is S */ Boolean] => /* is std.Array<S> */ Boolean
      ): Self = StObject.set(x, "every", js.Any.fromFunction1(value))
      
      inline def setFilter(
        value: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], /* is S */ Boolean] => js.Array[Any]
      ): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFind(
        value: js.ThisFunction3[
              /* this */ Unit, 
              /* value */ Any, 
              /* index */ Double, 
              /* obj */ js.Array[Any], 
              /* is S */ Boolean
            ] => js.UndefOr[Any]
      ): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      inline def setFindIndex(value: js.Function3[/* value */ Any, /* index */ Double, /* obj */ js.Array[Any], Any] => Double): Self = StObject.set(x, "findIndex", js.Any.fromFunction1(value))
      
      inline def setFlat(value: CallbackTo[js.Array[FlatArray[Any, Any]]]): Self = StObject.set(x, "flat", value.toJsFn)
      
      inline def setFlatMap(
        value: js.ThisFunction3[Any, /* value */ Any, /* index */ Double, /* array */ js.Array[Any], Any | js.Array[Any]] => js.Array[Any]
      ): Self = StObject.set(x, "flatMap", js.Any.fromFunction1(value))
      
      inline def setForEach(
        value: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Unit] => Callback
      ): Self = StObject.set(x, "forEach", js.Any.fromFunction1((t0: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Unit]) => value(t0).runNow()))
      
      inline def setIncludes(value: Any => Boolean): Self = StObject.set(x, "includes", js.Any.fromFunction1(value))
      
      inline def setIndexOf(value: Any => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
      
      inline def setJoin(value: CallbackTo[String]): Self = StObject.set(x, "join", value.toJsFn)
      
      inline def setKeys(value: CallbackTo[IterableIterator[Double]]): Self = StObject.set(x, "keys", value.toJsFn)
      
      inline def setLastIndexOf(value: Any => Double): Self = StObject.set(x, "lastIndexOf", js.Any.fromFunction1(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setMap(
        value: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Any] => js.Array[Any]
      ): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setReduce(
        value: js.Function4[
              /* previousValue */ Any, 
              /* currentValue */ Any, 
              /* currentIndex */ Double, 
              /* array */ js.Array[Any], 
              Any
            ] => Any
      ): Self = StObject.set(x, "reduce", js.Any.fromFunction1(value))
      
      inline def setReduceRight(
        value: js.Function4[
              /* previousValue */ Any, 
              /* currentValue */ Any, 
              /* currentIndex */ Double, 
              /* array */ js.Array[Any], 
              Any
            ] => Any
      ): Self = StObject.set(x, "reduceRight", js.Any.fromFunction1(value))
      
      inline def setSlice(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "slice", value.toJsFn)
      
      inline def setSome(
        value: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Any] => Boolean
      ): Self = StObject.set(x, "some", js.Any.fromFunction1(value))
      
      inline def setValues(value: CallbackTo[IterableIterator[Any]]): Self = StObject.set(x, "values", value.toJsFn)
    }
  }
  
  /* Inlined std.Readonly<std.ReadonlyMap<any, any>> */
  trait ReadonlyReadonlyMapanyany extends StObject {
    
    def entries(): IterableIterator[js.Tuple2[Any, Any]]
    
    def forEach(callbackfn: js.Function3[/* value */ Any, /* key */ Any, /* map */ ReadonlyMap[Any, Any], Unit]): Unit
    
    def get(key: Any): js.UndefOr[Any]
    
    def has(key: Any): Boolean
    
    def keys(): IterableIterator[Any]
    
    val size: Double
    
    def values(): IterableIterator[Any]
  }
  object ReadonlyReadonlyMapanyany {
    
    inline def apply(
      entries: CallbackTo[IterableIterator[js.Tuple2[Any, Any]]],
      forEach: js.Function3[/* value */ Any, /* key */ Any, /* map */ ReadonlyMap[Any, Any], Unit] => Callback,
      get: Any => js.UndefOr[Any],
      has: Any => Boolean,
      keys: CallbackTo[IterableIterator[Any]],
      size: Double,
      values: CallbackTo[IterableIterator[Any]]
    ): ReadonlyReadonlyMapanyany = {
      val __obj = js.Dynamic.literal(entries = entries.toJsFn, forEach = js.Any.fromFunction1((t0: js.Function3[/* value */ Any, /* key */ Any, /* map */ ReadonlyMap[Any, Any], Unit]) => forEach(t0).runNow()), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = keys.toJsFn, size = size.asInstanceOf[js.Any], values = values.toJsFn)
      __obj.asInstanceOf[ReadonlyReadonlyMapanyany]
    }
    
    extension [Self <: ReadonlyReadonlyMapanyany](x: Self) {
      
      inline def setEntries(value: CallbackTo[IterableIterator[js.Tuple2[Any, Any]]]): Self = StObject.set(x, "entries", value.toJsFn)
      
      inline def setForEach(
        value: js.Function3[/* value */ Any, /* key */ Any, /* map */ ReadonlyMap[Any, Any], Unit] => Callback
      ): Self = StObject.set(x, "forEach", js.Any.fromFunction1((t0: js.Function3[/* value */ Any, /* key */ Any, /* map */ ReadonlyMap[Any, Any], Unit]) => value(t0).runNow()))
      
      inline def setGet(value: Any => js.UndefOr[Any]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHas(value: Any => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setKeys(value: CallbackTo[IterableIterator[Any]]): Self = StObject.set(x, "keys", value.toJsFn)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setValues(value: CallbackTo[IterableIterator[Any]]): Self = StObject.set(x, "values", value.toJsFn)
    }
  }
  
  /* Inlined std.Readonly<std.ReadonlyMap<unknown, unknown>> */
  trait ReadonlyReadonlyMapunknow extends StObject {
    
    def entries(): IterableIterator[js.Tuple2[Any, Any]]
    
    def forEach(callbackfn: js.Function3[/* value */ Any, /* key */ Any, /* map */ ReadonlyMap[Any, Any], Unit]): Unit
    
    def get(key: Any): js.UndefOr[Any]
    
    def has(key: Any): Boolean
    
    def keys(): IterableIterator[Any]
    
    val size: Double
    
    def values(): IterableIterator[Any]
  }
  object ReadonlyReadonlyMapunknow {
    
    inline def apply(
      entries: CallbackTo[IterableIterator[js.Tuple2[Any, Any]]],
      forEach: js.Function3[/* value */ Any, /* key */ Any, /* map */ ReadonlyMap[Any, Any], Unit] => Callback,
      get: Any => js.UndefOr[Any],
      has: Any => Boolean,
      keys: CallbackTo[IterableIterator[Any]],
      size: Double,
      values: CallbackTo[IterableIterator[Any]]
    ): ReadonlyReadonlyMapunknow = {
      val __obj = js.Dynamic.literal(entries = entries.toJsFn, forEach = js.Any.fromFunction1((t0: js.Function3[/* value */ Any, /* key */ Any, /* map */ ReadonlyMap[Any, Any], Unit]) => forEach(t0).runNow()), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = keys.toJsFn, size = size.asInstanceOf[js.Any], values = values.toJsFn)
      __obj.asInstanceOf[ReadonlyReadonlyMapunknow]
    }
    
    extension [Self <: ReadonlyReadonlyMapunknow](x: Self) {
      
      inline def setEntries(value: CallbackTo[IterableIterator[js.Tuple2[Any, Any]]]): Self = StObject.set(x, "entries", value.toJsFn)
      
      inline def setForEach(
        value: js.Function3[/* value */ Any, /* key */ Any, /* map */ ReadonlyMap[Any, Any], Unit] => Callback
      ): Self = StObject.set(x, "forEach", js.Any.fromFunction1((t0: js.Function3[/* value */ Any, /* key */ Any, /* map */ ReadonlyMap[Any, Any], Unit]) => value(t0).runNow()))
      
      inline def setGet(value: Any => js.UndefOr[Any]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHas(value: Any => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setKeys(value: CallbackTo[IterableIterator[Any]]): Self = StObject.set(x, "keys", value.toJsFn)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setValues(value: CallbackTo[IterableIterator[Any]]): Self = StObject.set(x, "values", value.toJsFn)
    }
  }
  
  /* Inlined std.Readonly<std.ReadonlySet<any>> */
  trait ReadonlyReadonlySetany extends StObject {
    
    def entries(): IterableIterator[js.Tuple2[Any, Any]]
    
    def forEach(callbackfn: js.Function3[/* value */ Any, /* value2 */ Any, /* set */ ReadonlySet[Any], Unit]): Unit
    
    def has(value: Any): Boolean
    
    def keys(): IterableIterator[Any]
    
    val size: Double
    
    def values(): IterableIterator[Any]
  }
  object ReadonlyReadonlySetany {
    
    inline def apply(
      entries: CallbackTo[IterableIterator[js.Tuple2[Any, Any]]],
      forEach: js.Function3[/* value */ Any, /* value2 */ Any, /* set */ ReadonlySet[Any], Unit] => Callback,
      has: Any => Boolean,
      keys: CallbackTo[IterableIterator[Any]],
      size: Double,
      values: CallbackTo[IterableIterator[Any]]
    ): ReadonlyReadonlySetany = {
      val __obj = js.Dynamic.literal(entries = entries.toJsFn, forEach = js.Any.fromFunction1((t0: js.Function3[/* value */ Any, /* value2 */ Any, /* set */ ReadonlySet[Any], Unit]) => forEach(t0).runNow()), has = js.Any.fromFunction1(has), keys = keys.toJsFn, size = size.asInstanceOf[js.Any], values = values.toJsFn)
      __obj.asInstanceOf[ReadonlyReadonlySetany]
    }
    
    extension [Self <: ReadonlyReadonlySetany](x: Self) {
      
      inline def setEntries(value: CallbackTo[IterableIterator[js.Tuple2[Any, Any]]]): Self = StObject.set(x, "entries", value.toJsFn)
      
      inline def setForEach(
        value: js.Function3[/* value */ Any, /* value2 */ Any, /* set */ ReadonlySet[Any], Unit] => Callback
      ): Self = StObject.set(x, "forEach", js.Any.fromFunction1((t0: js.Function3[/* value */ Any, /* value2 */ Any, /* set */ ReadonlySet[Any], Unit]) => value(t0).runNow()))
      
      inline def setHas(value: Any => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setKeys(value: CallbackTo[IterableIterator[Any]]): Self = StObject.set(x, "keys", value.toJsFn)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setValues(value: CallbackTo[IterableIterator[Any]]): Self = StObject.set(x, "values", value.toJsFn)
    }
  }
  
  /* Inlined std.Readonly<std.ReadonlySet<unknown>> */
  trait ReadonlyReadonlySetunknow extends StObject {
    
    def entries(): IterableIterator[js.Tuple2[Any, Any]]
    
    def forEach(callbackfn: js.Function3[/* value */ Any, /* value2 */ Any, /* set */ ReadonlySet[Any], Unit]): Unit
    
    def has(value: Any): Boolean
    
    def keys(): IterableIterator[Any]
    
    val size: Double
    
    def values(): IterableIterator[Any]
  }
  object ReadonlyReadonlySetunknow {
    
    inline def apply(
      entries: CallbackTo[IterableIterator[js.Tuple2[Any, Any]]],
      forEach: js.Function3[/* value */ Any, /* value2 */ Any, /* set */ ReadonlySet[Any], Unit] => Callback,
      has: Any => Boolean,
      keys: CallbackTo[IterableIterator[Any]],
      size: Double,
      values: CallbackTo[IterableIterator[Any]]
    ): ReadonlyReadonlySetunknow = {
      val __obj = js.Dynamic.literal(entries = entries.toJsFn, forEach = js.Any.fromFunction1((t0: js.Function3[/* value */ Any, /* value2 */ Any, /* set */ ReadonlySet[Any], Unit]) => forEach(t0).runNow()), has = js.Any.fromFunction1(has), keys = keys.toJsFn, size = size.asInstanceOf[js.Any], values = values.toJsFn)
      __obj.asInstanceOf[ReadonlyReadonlySetunknow]
    }
    
    extension [Self <: ReadonlyReadonlySetunknow](x: Self) {
      
      inline def setEntries(value: CallbackTo[IterableIterator[js.Tuple2[Any, Any]]]): Self = StObject.set(x, "entries", value.toJsFn)
      
      inline def setForEach(
        value: js.Function3[/* value */ Any, /* value2 */ Any, /* set */ ReadonlySet[Any], Unit] => Callback
      ): Self = StObject.set(x, "forEach", js.Any.fromFunction1((t0: js.Function3[/* value */ Any, /* value2 */ Any, /* set */ ReadonlySet[Any], Unit]) => value(t0).runNow()))
      
      inline def setHas(value: Any => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setKeys(value: CallbackTo[IterableIterator[Any]]): Self = StObject.set(x, "keys", value.toJsFn)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setValues(value: CallbackTo[IterableIterator[Any]]): Self = StObject.set(x, "values", value.toJsFn)
    }
  }
  
  /* Inlined std.Readonly<{  defaultMerge :symbol,   skip :symbol}> */
  trait ReadonlydefaultMergesymbo extends StObject {
    
    val defaultMerge: js.Symbol
    
    val skip: js.Symbol
  }
  object ReadonlydefaultMergesymbo {
    
    inline def apply(defaultMerge: js.Symbol, skip: js.Symbol): ReadonlydefaultMergesymbo = {
      val __obj = js.Dynamic.literal(defaultMerge = defaultMerge.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlydefaultMergesymbo]
    }
    
    extension [Self <: ReadonlydefaultMergesymbo](x: Self) {
      
      inline def setDefaultMerge(value: js.Symbol): Self = StObject.set(x, "defaultMerge", value.asInstanceOf[js.Any])
      
      inline def setSkip(value: js.Symbol): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    }
  }
}
