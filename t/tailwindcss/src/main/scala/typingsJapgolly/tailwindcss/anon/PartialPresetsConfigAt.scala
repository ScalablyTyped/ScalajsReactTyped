package typingsJapgolly.tailwindcss.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.FlatArray
import typingsJapgolly.std.IterableIterator
import typingsJapgolly.tailwindcss.tailwindcssInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<tailwindcss.tailwindcss/types/config.PresetsConfig> */
trait PartialPresetsConfigAt extends StObject {
  
  var at: js.UndefOr[
    js.Function1[/* index */ Double, js.UndefOr[typingsJapgolly.tailwindcss.typesConfigMod.Config]]
  ] = js.undefined
  
  var concat: js.UndefOr[
    js.Function1[
      /* repeated */ js.Array[typingsJapgolly.tailwindcss.typesConfigMod.Config], 
      js.Array[typingsJapgolly.tailwindcss.typesConfigMod.Config]
    ]
  ] = js.undefined
  
  var copyWithin: js.UndefOr[js.Function2[/* target */ Double, /* start */ Double, this.type]] = js.undefined
  
  var entries: js.UndefOr[
    js.Function0[
      IterableIterator[js.Tuple2[Double, typingsJapgolly.tailwindcss.typesConfigMod.Config]]
    ]
  ] = js.undefined
  
  var every: js.UndefOr[
    js.Function1[
      /* predicate */ js.Function3[
        /* value */ typingsJapgolly.tailwindcss.typesConfigMod.Config, 
        /* index */ Double, 
        /* array */ js.Array[typingsJapgolly.tailwindcss.typesConfigMod.Config], 
        /* is tailwindcss.tailwindcss/types/config.Config */ Boolean
      ], 
      /* is std.Array<tailwindcss.tailwindcss/types/config.Config> */ Boolean
    ]
  ] = js.undefined
  
  var fill: js.UndefOr[
    js.Function1[/* value */ typingsJapgolly.tailwindcss.typesConfigMod.Config, this.type]
  ] = js.undefined
  
  var filter: js.UndefOr[
    js.Function1[
      /* predicate */ js.Function3[
        /* value */ typingsJapgolly.tailwindcss.typesConfigMod.Config, 
        /* index */ Double, 
        /* array */ js.Array[typingsJapgolly.tailwindcss.typesConfigMod.Config], 
        /* is tailwindcss.tailwindcss/types/config.Config */ Boolean
      ], 
      js.Array[typingsJapgolly.tailwindcss.typesConfigMod.Config]
    ]
  ] = js.undefined
  
  var find: js.UndefOr[
    js.Function1[
      /* predicate */ js.ThisFunction3[
        /* this */ Unit, 
        /* value */ typingsJapgolly.tailwindcss.typesConfigMod.Config, 
        /* index */ Double, 
        /* obj */ js.Array[typingsJapgolly.tailwindcss.typesConfigMod.Config], 
        /* is tailwindcss.tailwindcss/types/config.Config */ Boolean
      ], 
      js.UndefOr[typingsJapgolly.tailwindcss.typesConfigMod.Config]
    ]
  ] = js.undefined
  
  var findIndex: js.UndefOr[
    js.Function1[
      /* predicate */ js.Function3[
        /* value */ typingsJapgolly.tailwindcss.typesConfigMod.Config, 
        /* index */ Double, 
        /* obj */ js.Array[typingsJapgolly.tailwindcss.typesConfigMod.Config], 
        Any
      ], 
      Double
    ]
  ] = js.undefined
  
  var flat: js.UndefOr[js.ThisFunction0[/* this */ Any, js.Array[FlatArray[Any, `1`]]]] = js.undefined
  
  var flatMap: js.UndefOr[
    js.Function1[
      /* callback */ js.ThisFunction3[
        /* this */ Unit, 
        /* value */ typingsJapgolly.tailwindcss.typesConfigMod.Config, 
        /* index */ Double, 
        /* array */ js.Array[typingsJapgolly.tailwindcss.typesConfigMod.Config], 
        Any | js.Array[Any]
      ], 
      js.Array[Any]
    ]
  ] = js.undefined
  
  var forEach: js.UndefOr[
    js.Function1[
      /* callbackfn */ js.Function3[
        /* value */ typingsJapgolly.tailwindcss.typesConfigMod.Config, 
        /* index */ Double, 
        /* array */ js.Array[typingsJapgolly.tailwindcss.typesConfigMod.Config], 
        Unit
      ], 
      Unit
    ]
  ] = js.undefined
  
  var includes: js.UndefOr[
    js.Function1[/* searchElement */ typingsJapgolly.tailwindcss.typesConfigMod.Config, Boolean]
  ] = js.undefined
  
  var indexOf: js.UndefOr[
    js.Function1[/* searchElement */ typingsJapgolly.tailwindcss.typesConfigMod.Config, Double]
  ] = js.undefined
  
  var join: js.UndefOr[js.Function0[String]] = js.undefined
  
  var keys: js.UndefOr[js.Function0[IterableIterator[Double]]] = js.undefined
  
  var lastIndexOf: js.UndefOr[
    js.Function1[/* searchElement */ typingsJapgolly.tailwindcss.typesConfigMod.Config, Double]
  ] = js.undefined
  
  var length: js.UndefOr[Double] = js.undefined
  
  var map: js.UndefOr[
    js.Function1[
      /* callbackfn */ js.Function3[
        /* value */ typingsJapgolly.tailwindcss.typesConfigMod.Config, 
        /* index */ Double, 
        /* array */ js.Array[typingsJapgolly.tailwindcss.typesConfigMod.Config], 
        Any
      ], 
      js.Array[Any]
    ]
  ] = js.undefined
  
  var pop: js.UndefOr[js.Function0[js.UndefOr[typingsJapgolly.tailwindcss.typesConfigMod.Config]]] = js.undefined
  
  var push: js.UndefOr[
    js.Function1[/* repeated */ typingsJapgolly.tailwindcss.typesConfigMod.Config, Double]
  ] = js.undefined
  
  var reduce: js.UndefOr[
    js.Function1[
      /* callbackfn */ js.Function4[
        /* previousValue */ typingsJapgolly.tailwindcss.typesConfigMod.Config, 
        /* currentValue */ typingsJapgolly.tailwindcss.typesConfigMod.Config, 
        /* currentIndex */ Double, 
        /* array */ js.Array[typingsJapgolly.tailwindcss.typesConfigMod.Config], 
        typingsJapgolly.tailwindcss.typesConfigMod.Config
      ], 
      typingsJapgolly.tailwindcss.typesConfigMod.Config
    ]
  ] = js.undefined
  
  var reduceRight: js.UndefOr[
    js.Function1[
      /* callbackfn */ js.Function4[
        /* previousValue */ typingsJapgolly.tailwindcss.typesConfigMod.Config, 
        /* currentValue */ typingsJapgolly.tailwindcss.typesConfigMod.Config, 
        /* currentIndex */ Double, 
        /* array */ js.Array[typingsJapgolly.tailwindcss.typesConfigMod.Config], 
        typingsJapgolly.tailwindcss.typesConfigMod.Config
      ], 
      typingsJapgolly.tailwindcss.typesConfigMod.Config
    ]
  ] = js.undefined
  
  var reverse: js.UndefOr[js.Function0[js.Array[typingsJapgolly.tailwindcss.typesConfigMod.Config]]] = js.undefined
  
  var shift: js.UndefOr[js.Function0[js.UndefOr[typingsJapgolly.tailwindcss.typesConfigMod.Config]]] = js.undefined
  
  var slice: js.UndefOr[js.Function0[js.Array[typingsJapgolly.tailwindcss.typesConfigMod.Config]]] = js.undefined
  
  var some: js.UndefOr[
    js.Function1[
      /* predicate */ js.Function3[
        /* value */ typingsJapgolly.tailwindcss.typesConfigMod.Config, 
        /* index */ Double, 
        /* array */ js.Array[typingsJapgolly.tailwindcss.typesConfigMod.Config], 
        Any
      ], 
      Boolean
    ]
  ] = js.undefined
  
  var sort: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  var splice: js.UndefOr[
    js.Function1[/* start */ Double, js.Array[typingsJapgolly.tailwindcss.typesConfigMod.Config]]
  ] = js.undefined
  
  @JSName("toLocaleString")
  var toLocaleString_FPartialPresetsConfigAt: js.UndefOr[js.Function0[String]] = js.undefined
  
  @JSName("toString")
  var toString_FPartialPresetsConfigAt: js.UndefOr[js.Function0[String]] = js.undefined
  
  var unshift: js.UndefOr[
    js.Function1[/* repeated */ typingsJapgolly.tailwindcss.typesConfigMod.Config, Double]
  ] = js.undefined
  
  var values: js.UndefOr[
    js.Function0[IterableIterator[typingsJapgolly.tailwindcss.typesConfigMod.Config]]
  ] = js.undefined
}
object PartialPresetsConfigAt {
  
  inline def apply(): PartialPresetsConfigAt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPresetsConfigAt]
  }
  
  extension [Self <: PartialPresetsConfigAt](x: Self) {
    
    inline def setAt(value: /* index */ Double => js.UndefOr[typingsJapgolly.tailwindcss.typesConfigMod.Config]): Self = StObject.set(x, "at", js.Any.fromFunction1(value))
    
    inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
    
    inline def setConcat(
      value: /* repeated */ js.Array[typingsJapgolly.tailwindcss.typesConfigMod.Config] => js.Array[typingsJapgolly.tailwindcss.typesConfigMod.Config]
    ): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
    
    inline def setConcatUndefined: Self = StObject.set(x, "concat", js.undefined)
    
    inline def setCopyWithin(value: (/* target */ Double, /* start */ Double) => PartialPresetsConfigAt): Self = StObject.set(x, "copyWithin", js.Any.fromFunction2(value))
    
    inline def setCopyWithinUndefined: Self = StObject.set(x, "copyWithin", js.undefined)
    
    inline def setEntries(
      value: CallbackTo[
          IterableIterator[js.Tuple2[Double, typingsJapgolly.tailwindcss.typesConfigMod.Config]]
        ]
    ): Self = StObject.set(x, "entries", value.toJsFn)
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEvery(
      value: /* predicate */ js.Function3[
          /* value */ typingsJapgolly.tailwindcss.typesConfigMod.Config, 
          /* index */ Double, 
          /* array */ js.Array[typingsJapgolly.tailwindcss.typesConfigMod.Config], 
          /* is tailwindcss.tailwindcss/types/config.Config */ Boolean
        ] => /* is std.Array<tailwindcss.tailwindcss/types/config.Config> */ Boolean
    ): Self = StObject.set(x, "every", js.Any.fromFunction1(value))
    
    inline def setEveryUndefined: Self = StObject.set(x, "every", js.undefined)
    
    inline def setFill(value: /* value */ typingsJapgolly.tailwindcss.typesConfigMod.Config => PartialPresetsConfigAt): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFilter(
      value: /* predicate */ js.Function3[
          /* value */ typingsJapgolly.tailwindcss.typesConfigMod.Config, 
          /* index */ Double, 
          /* array */ js.Array[typingsJapgolly.tailwindcss.typesConfigMod.Config], 
          /* is tailwindcss.tailwindcss/types/config.Config */ Boolean
        ] => js.Array[typingsJapgolly.tailwindcss.typesConfigMod.Config]
    ): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFind(
      value: /* predicate */ js.ThisFunction3[
          /* this */ Unit, 
          /* value */ typingsJapgolly.tailwindcss.typesConfigMod.Config, 
          /* index */ Double, 
          /* obj */ js.Array[typingsJapgolly.tailwindcss.typesConfigMod.Config], 
          /* is tailwindcss.tailwindcss/types/config.Config */ Boolean
        ] => js.UndefOr[typingsJapgolly.tailwindcss.typesConfigMod.Config]
    ): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
    
    inline def setFindIndex(
      value: /* predicate */ js.Function3[
          /* value */ typingsJapgolly.tailwindcss.typesConfigMod.Config, 
          /* index */ Double, 
          /* obj */ js.Array[typingsJapgolly.tailwindcss.typesConfigMod.Config], 
          Any
        ] => Double
    ): Self = StObject.set(x, "findIndex", js.Any.fromFunction1(value))
    
    inline def setFindIndexUndefined: Self = StObject.set(x, "findIndex", js.undefined)
    
    inline def setFindUndefined: Self = StObject.set(x, "find", js.undefined)
    
    inline def setFlat(value: js.ThisFunction0[/* this */ Any, js.Array[FlatArray[Any, `1`]]]): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
    
    inline def setFlatMap(
      value: /* callback */ js.ThisFunction3[
          /* this */ Unit, 
          /* value */ typingsJapgolly.tailwindcss.typesConfigMod.Config, 
          /* index */ Double, 
          /* array */ js.Array[typingsJapgolly.tailwindcss.typesConfigMod.Config], 
          Any | js.Array[Any]
        ] => js.Array[Any]
    ): Self = StObject.set(x, "flatMap", js.Any.fromFunction1(value))
    
    inline def setFlatMapUndefined: Self = StObject.set(x, "flatMap", js.undefined)
    
    inline def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
    
    inline def setForEach(
      value: /* callbackfn */ js.Function3[
          /* value */ typingsJapgolly.tailwindcss.typesConfigMod.Config, 
          /* index */ Double, 
          /* array */ js.Array[typingsJapgolly.tailwindcss.typesConfigMod.Config], 
          Unit
        ] => Callback
    ): Self = StObject.set(x, "forEach", js.Any.fromFunction1((t0: /* callbackfn */ js.Function3[
          /* value */ typingsJapgolly.tailwindcss.typesConfigMod.Config, 
          /* index */ Double, 
          /* array */ js.Array[typingsJapgolly.tailwindcss.typesConfigMod.Config], 
          Unit
        ]) => value(t0).runNow()))
    
    inline def setForEachUndefined: Self = StObject.set(x, "forEach", js.undefined)
    
    inline def setIncludes(value: /* searchElement */ typingsJapgolly.tailwindcss.typesConfigMod.Config => Boolean): Self = StObject.set(x, "includes", js.Any.fromFunction1(value))
    
    inline def setIncludesUndefined: Self = StObject.set(x, "includes", js.undefined)
    
    inline def setIndexOf(value: /* searchElement */ typingsJapgolly.tailwindcss.typesConfigMod.Config => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
    
    inline def setIndexOfUndefined: Self = StObject.set(x, "indexOf", js.undefined)
    
    inline def setJoin(value: CallbackTo[String]): Self = StObject.set(x, "join", value.toJsFn)
    
    inline def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
    
    inline def setKeys(value: CallbackTo[IterableIterator[Double]]): Self = StObject.set(x, "keys", value.toJsFn)
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setLastIndexOf(value: /* searchElement */ typingsJapgolly.tailwindcss.typesConfigMod.Config => Double): Self = StObject.set(x, "lastIndexOf", js.Any.fromFunction1(value))
    
    inline def setLastIndexOfUndefined: Self = StObject.set(x, "lastIndexOf", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setMap(
      value: /* callbackfn */ js.Function3[
          /* value */ typingsJapgolly.tailwindcss.typesConfigMod.Config, 
          /* index */ Double, 
          /* array */ js.Array[typingsJapgolly.tailwindcss.typesConfigMod.Config], 
          Any
        ] => js.Array[Any]
    ): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setPop(value: CallbackTo[js.UndefOr[typingsJapgolly.tailwindcss.typesConfigMod.Config]]): Self = StObject.set(x, "pop", value.toJsFn)
    
    inline def setPopUndefined: Self = StObject.set(x, "pop", js.undefined)
    
    inline def setPush(value: /* repeated */ typingsJapgolly.tailwindcss.typesConfigMod.Config => Double): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    
    inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
    
    inline def setReduce(
      value: /* callbackfn */ js.Function4[
          /* previousValue */ typingsJapgolly.tailwindcss.typesConfigMod.Config, 
          /* currentValue */ typingsJapgolly.tailwindcss.typesConfigMod.Config, 
          /* currentIndex */ Double, 
          /* array */ js.Array[typingsJapgolly.tailwindcss.typesConfigMod.Config], 
          typingsJapgolly.tailwindcss.typesConfigMod.Config
        ] => typingsJapgolly.tailwindcss.typesConfigMod.Config
    ): Self = StObject.set(x, "reduce", js.Any.fromFunction1(value))
    
    inline def setReduceRight(
      value: /* callbackfn */ js.Function4[
          /* previousValue */ typingsJapgolly.tailwindcss.typesConfigMod.Config, 
          /* currentValue */ typingsJapgolly.tailwindcss.typesConfigMod.Config, 
          /* currentIndex */ Double, 
          /* array */ js.Array[typingsJapgolly.tailwindcss.typesConfigMod.Config], 
          typingsJapgolly.tailwindcss.typesConfigMod.Config
        ] => typingsJapgolly.tailwindcss.typesConfigMod.Config
    ): Self = StObject.set(x, "reduceRight", js.Any.fromFunction1(value))
    
    inline def setReduceRightUndefined: Self = StObject.set(x, "reduceRight", js.undefined)
    
    inline def setReduceUndefined: Self = StObject.set(x, "reduce", js.undefined)
    
    inline def setReverse(value: CallbackTo[js.Array[typingsJapgolly.tailwindcss.typesConfigMod.Config]]): Self = StObject.set(x, "reverse", value.toJsFn)
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    inline def setShift(value: CallbackTo[js.UndefOr[typingsJapgolly.tailwindcss.typesConfigMod.Config]]): Self = StObject.set(x, "shift", value.toJsFn)
    
    inline def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
    
    inline def setSlice(value: CallbackTo[js.Array[typingsJapgolly.tailwindcss.typesConfigMod.Config]]): Self = StObject.set(x, "slice", value.toJsFn)
    
    inline def setSliceUndefined: Self = StObject.set(x, "slice", js.undefined)
    
    inline def setSome(
      value: /* predicate */ js.Function3[
          /* value */ typingsJapgolly.tailwindcss.typesConfigMod.Config, 
          /* index */ Double, 
          /* array */ js.Array[typingsJapgolly.tailwindcss.typesConfigMod.Config], 
          Any
        ] => Boolean
    ): Self = StObject.set(x, "some", js.Any.fromFunction1(value))
    
    inline def setSomeUndefined: Self = StObject.set(x, "some", js.undefined)
    
    inline def setSort(value: CallbackTo[PartialPresetsConfigAt]): Self = StObject.set(x, "sort", value.toJsFn)
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSplice(value: /* start */ Double => js.Array[typingsJapgolly.tailwindcss.typesConfigMod.Config]): Self = StObject.set(x, "splice", js.Any.fromFunction1(value))
    
    inline def setSpliceUndefined: Self = StObject.set(x, "splice", js.undefined)
    
    inline def setToLocaleString(value: CallbackTo[String]): Self = StObject.set(x, "toLocaleString", value.toJsFn)
    
    inline def setToLocaleStringUndefined: Self = StObject.set(x, "toLocaleString", js.undefined)
    
    inline def setToString_(value: CallbackTo[String]): Self = StObject.set(x, "toString", value.toJsFn)
    
    inline def setToString_Undefined: Self = StObject.set(x, "toString", js.undefined)
    
    inline def setUnshift(value: /* repeated */ typingsJapgolly.tailwindcss.typesConfigMod.Config => Double): Self = StObject.set(x, "unshift", js.Any.fromFunction1(value))
    
    inline def setUnshiftUndefined: Self = StObject.set(x, "unshift", js.undefined)
    
    inline def setValues(value: CallbackTo[IterableIterator[typingsJapgolly.tailwindcss.typesConfigMod.Config]]): Self = StObject.set(x, "values", value.toJsFn)
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
