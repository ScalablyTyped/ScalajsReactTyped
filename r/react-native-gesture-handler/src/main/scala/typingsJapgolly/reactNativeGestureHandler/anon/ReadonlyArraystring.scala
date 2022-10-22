package typingsJapgolly.reactNativeGestureHandler.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.FlatArray
import typingsJapgolly.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Array<string>> */
trait ReadonlyArraystring extends StObject {
  
  val at: js.Function1[/* index */ Double, js.UndefOr[String]]
  
  val concat: js.Function1[/* repeated */ js.Array[String], js.Array[String]]
  
  val copyWithin: js.Function2[/* target */ Double, /* start */ Double, this.type]
  
  val entries: js.Function0[IterableIterator[js.Tuple2[Double, String]]]
  
  val every: js.Function1[
    /* predicate */ js.Function3[
      /* value */ String, 
      /* index */ Double, 
      /* array */ js.Array[String], 
      /* is string */ Boolean
    ], 
    /* is std.Array<string> */ Boolean
  ]
  
  val fill: js.Function1[/* value */ String, this.type]
  
  val filter: js.Function1[
    /* predicate */ js.Function3[
      /* value */ String, 
      /* index */ Double, 
      /* array */ js.Array[String], 
      /* is string */ Boolean
    ], 
    js.Array[String]
  ]
  
  val find: js.Function1[
    /* predicate */ js.ThisFunction3[
      /* this */ Unit, 
      /* value */ String, 
      /* index */ Double, 
      /* obj */ js.Array[String], 
      /* is string */ Boolean
    ], 
    js.UndefOr[String]
  ]
  
  val findIndex: js.Function1[
    /* predicate */ js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], Any], 
    Double
  ]
  
  val flat: js.ThisFunction0[
    /* this */ Any, 
    js.Array[
      FlatArray[Any, typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerInts.`1`]
    ]
  ]
  
  val flatMap: js.Function1[
    /* callback */ js.ThisFunction3[
      /* this */ Unit, 
      /* value */ String, 
      /* index */ Double, 
      /* array */ js.Array[String], 
      Any | js.Array[Any]
    ], 
    js.Array[Any]
  ]
  
  val forEach: js.Function1[
    /* callbackfn */ js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit], 
    Unit
  ]
  
  val includes: js.Function1[/* searchElement */ String, Boolean]
  
  val indexOf: js.Function1[/* searchElement */ String, Double]
  
  val join: js.Function0[String]
  
  val keys: js.Function0[IterableIterator[Double]]
  
  val lastIndexOf: js.Function1[/* searchElement */ String, Double]
  
  val length: Double
  
  val map: js.Function1[
    /* callbackfn */ js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any], 
    js.Array[Any]
  ]
  
  val pop: js.Function0[js.UndefOr[String]]
  
  val push: js.Function1[/* repeated */ String, Double]
  
  val reduce: js.Function1[
    /* callbackfn */ js.Function4[
      /* previousValue */ String, 
      /* currentValue */ String, 
      /* currentIndex */ Double, 
      /* array */ js.Array[String], 
      String
    ], 
    String
  ]
  
  val reduceRight: js.Function1[
    /* callbackfn */ js.Function4[
      /* previousValue */ String, 
      /* currentValue */ String, 
      /* currentIndex */ Double, 
      /* array */ js.Array[String], 
      String
    ], 
    String
  ]
  
  val reverse: js.Function0[js.Array[String]]
  
  val shift: js.Function0[js.UndefOr[String]]
  
  val slice: js.Function0[js.Array[String]]
  
  val some: js.Function1[
    /* predicate */ js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any], 
    Boolean
  ]
  
  val sort: js.Function0[this.type]
  
  val splice: js.Function1[/* start */ Double, js.Array[String]]
  
  @JSName("toLocaleString")
  val toLocaleString_FReadonlyArraystring: js.Function0[String]
  
  @JSName("toString")
  val toString_FReadonlyArraystring: js.Function0[String]
  
  val unshift: js.Function1[/* repeated */ String, Double]
  
  val values: js.Function0[IterableIterator[String]]
}
object ReadonlyArraystring {
  
  inline def apply(
    at: /* index */ Double => js.UndefOr[String],
    concat: /* repeated */ js.Array[String] => js.Array[String],
    copyWithin: (/* target */ Double, /* start */ Double) => ReadonlyArraystring,
    entries: CallbackTo[IterableIterator[js.Tuple2[Double, String]]],
    every: /* predicate */ js.Function3[
      /* value */ String, 
      /* index */ Double, 
      /* array */ js.Array[String], 
      /* is string */ Boolean
    ] => /* is std.Array<string> */ Boolean,
    fill: /* value */ String => ReadonlyArraystring,
    filter: /* predicate */ js.Function3[
      /* value */ String, 
      /* index */ Double, 
      /* array */ js.Array[String], 
      /* is string */ Boolean
    ] => js.Array[String],
    find: /* predicate */ js.ThisFunction3[
      /* this */ Unit, 
      /* value */ String, 
      /* index */ Double, 
      /* obj */ js.Array[String], 
      /* is string */ Boolean
    ] => js.UndefOr[String],
    findIndex: /* predicate */ js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], Any] => Double,
    flat: js.ThisFunction0[
      /* this */ Any, 
      js.Array[
        FlatArray[Any, typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerInts.`1`]
      ]
    ],
    flatMap: /* callback */ js.ThisFunction3[
      /* this */ Unit, 
      /* value */ String, 
      /* index */ Double, 
      /* array */ js.Array[String], 
      Any | js.Array[Any]
    ] => js.Array[Any],
    forEach: /* callbackfn */ js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit] => Callback,
    includes: /* searchElement */ String => Boolean,
    indexOf: /* searchElement */ String => Double,
    join: CallbackTo[String],
    keys: CallbackTo[IterableIterator[Double]],
    lastIndexOf: /* searchElement */ String => Double,
    length: Double,
    map: /* callbackfn */ js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any] => js.Array[Any],
    pop: CallbackTo[js.UndefOr[String]],
    push: /* repeated */ String => Double,
    reduce: /* callbackfn */ js.Function4[
      /* previousValue */ String, 
      /* currentValue */ String, 
      /* currentIndex */ Double, 
      /* array */ js.Array[String], 
      String
    ] => String,
    reduceRight: /* callbackfn */ js.Function4[
      /* previousValue */ String, 
      /* currentValue */ String, 
      /* currentIndex */ Double, 
      /* array */ js.Array[String], 
      String
    ] => String,
    reverse: CallbackTo[js.Array[String]],
    shift: CallbackTo[js.UndefOr[String]],
    slice: CallbackTo[js.Array[String]],
    some: /* predicate */ js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any] => Boolean,
    sort: CallbackTo[ReadonlyArraystring],
    splice: /* start */ Double => js.Array[String],
    toLocaleString: CallbackTo[String],
    toString_ : CallbackTo[String],
    unshift: /* repeated */ String => Double,
    values: CallbackTo[IterableIterator[String]]
  ): ReadonlyArraystring = {
    val __obj = js.Dynamic.literal(at = js.Any.fromFunction1(at), concat = js.Any.fromFunction1(concat), copyWithin = js.Any.fromFunction2(copyWithin), entries = entries.toJsFn, every = js.Any.fromFunction1(every), fill = js.Any.fromFunction1(fill), filter = js.Any.fromFunction1(filter), find = js.Any.fromFunction1(find), findIndex = js.Any.fromFunction1(findIndex), flat = flat.asInstanceOf[js.Any], flatMap = js.Any.fromFunction1(flatMap), forEach = js.Any.fromFunction1((t0: /* callbackfn */ js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit]) => forEach(t0).runNow()), includes = js.Any.fromFunction1(includes), indexOf = js.Any.fromFunction1(indexOf), join = join.toJsFn, keys = keys.toJsFn, lastIndexOf = js.Any.fromFunction1(lastIndexOf), length = length.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), pop = pop.toJsFn, push = js.Any.fromFunction1(push), reduce = js.Any.fromFunction1(reduce), reduceRight = js.Any.fromFunction1(reduceRight), reverse = reverse.toJsFn, shift = shift.toJsFn, slice = slice.toJsFn, some = js.Any.fromFunction1(some), sort = sort.toJsFn, splice = js.Any.fromFunction1(splice), toLocaleString = toLocaleString.toJsFn, unshift = js.Any.fromFunction1(unshift), values = values.toJsFn)
    __obj.updateDynamic("toString")(toString_.toJsFn)
    __obj.asInstanceOf[ReadonlyArraystring]
  }
  
  extension [Self <: ReadonlyArraystring](x: Self) {
    
    inline def setAt(value: /* index */ Double => js.UndefOr[String]): Self = StObject.set(x, "at", js.Any.fromFunction1(value))
    
    inline def setConcat(value: /* repeated */ js.Array[String] => js.Array[String]): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
    
    inline def setCopyWithin(value: (/* target */ Double, /* start */ Double) => ReadonlyArraystring): Self = StObject.set(x, "copyWithin", js.Any.fromFunction2(value))
    
    inline def setEntries(value: CallbackTo[IterableIterator[js.Tuple2[Double, String]]]): Self = StObject.set(x, "entries", value.toJsFn)
    
    inline def setEvery(
      value: /* predicate */ js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is string */ Boolean
        ] => /* is std.Array<string> */ Boolean
    ): Self = StObject.set(x, "every", js.Any.fromFunction1(value))
    
    inline def setFill(value: /* value */ String => ReadonlyArraystring): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
    
    inline def setFilter(
      value: /* predicate */ js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is string */ Boolean
        ] => js.Array[String]
    ): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    inline def setFind(
      value: /* predicate */ js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is string */ Boolean
        ] => js.UndefOr[String]
    ): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
    
    inline def setFindIndex(
      value: /* predicate */ js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], Any] => Double
    ): Self = StObject.set(x, "findIndex", js.Any.fromFunction1(value))
    
    inline def setFlat(
      value: js.ThisFunction0[
          /* this */ Any, 
          js.Array[
            FlatArray[Any, typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerInts.`1`]
          ]
        ]
    ): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
    
    inline def setFlatMap(
      value: /* callback */ js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          Any | js.Array[Any]
        ] => js.Array[Any]
    ): Self = StObject.set(x, "flatMap", js.Any.fromFunction1(value))
    
    inline def setForEach(
      value: /* callbackfn */ js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit] => Callback
    ): Self = StObject.set(x, "forEach", js.Any.fromFunction1((t0: /* callbackfn */ js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit]) => value(t0).runNow()))
    
    inline def setIncludes(value: /* searchElement */ String => Boolean): Self = StObject.set(x, "includes", js.Any.fromFunction1(value))
    
    inline def setIndexOf(value: /* searchElement */ String => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
    
    inline def setJoin(value: CallbackTo[String]): Self = StObject.set(x, "join", value.toJsFn)
    
    inline def setKeys(value: CallbackTo[IterableIterator[Double]]): Self = StObject.set(x, "keys", value.toJsFn)
    
    inline def setLastIndexOf(value: /* searchElement */ String => Double): Self = StObject.set(x, "lastIndexOf", js.Any.fromFunction1(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setMap(
      value: /* callbackfn */ js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any] => js.Array[Any]
    ): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
    
    inline def setPop(value: CallbackTo[js.UndefOr[String]]): Self = StObject.set(x, "pop", value.toJsFn)
    
    inline def setPush(value: /* repeated */ String => Double): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    
    inline def setReduce(
      value: /* callbackfn */ js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ] => String
    ): Self = StObject.set(x, "reduce", js.Any.fromFunction1(value))
    
    inline def setReduceRight(
      value: /* callbackfn */ js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ] => String
    ): Self = StObject.set(x, "reduceRight", js.Any.fromFunction1(value))
    
    inline def setReverse(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "reverse", value.toJsFn)
    
    inline def setShift(value: CallbackTo[js.UndefOr[String]]): Self = StObject.set(x, "shift", value.toJsFn)
    
    inline def setSlice(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "slice", value.toJsFn)
    
    inline def setSome(
      value: /* predicate */ js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any] => Boolean
    ): Self = StObject.set(x, "some", js.Any.fromFunction1(value))
    
    inline def setSort(value: CallbackTo[ReadonlyArraystring]): Self = StObject.set(x, "sort", value.toJsFn)
    
    inline def setSplice(value: /* start */ Double => js.Array[String]): Self = StObject.set(x, "splice", js.Any.fromFunction1(value))
    
    inline def setToLocaleString(value: CallbackTo[String]): Self = StObject.set(x, "toLocaleString", value.toJsFn)
    
    inline def setToString_(value: CallbackTo[String]): Self = StObject.set(x, "toString", value.toJsFn)
    
    inline def setUnshift(value: /* repeated */ String => Double): Self = StObject.set(x, "unshift", js.Any.fromFunction1(value))
    
    inline def setValues(value: CallbackTo[IterableIterator[String]]): Self = StObject.set(x, "values", value.toJsFn)
  }
}
