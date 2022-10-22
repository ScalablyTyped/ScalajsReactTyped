package typingsJapgolly.antDesignProLayout.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.antDesignProLayout.antDesignProLayoutInts.`1`
import typingsJapgolly.antDesignProLayout.esTypingsMod.Route
import typingsJapgolly.std.FlatArray
import typingsJapgolly.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Array<@ant-design/pro-layout.@ant-design/pro-layout/es/typings.Route>> */
trait ReadonlyArrayRoute extends StObject {
  
  val at: js.Function1[/* index */ Double, js.UndefOr[Route]]
  
  val concat: js.Function1[/* repeated */ js.Array[Route], js.Array[Route]]
  
  val copyWithin: js.Function2[/* target */ Double, /* start */ Double, this.type]
  
  val entries: js.Function0[IterableIterator[js.Tuple2[Double, Route]]]
  
  val every: js.Function1[
    /* predicate */ js.Function3[
      /* value */ Route, 
      /* index */ Double, 
      /* array */ js.Array[Route], 
      /* is @ant-design/pro-layout.@ant-design/pro-layout/es/typings.Route */ Boolean
    ], 
    /* is std.Array<@ant-design/pro-layout.@ant-design/pro-layout/es/typings.Route> */ Boolean
  ]
  
  val fill: js.Function1[/* value */ Route, this.type]
  
  val filter: js.Function1[
    /* predicate */ js.Function3[
      /* value */ Route, 
      /* index */ Double, 
      /* array */ js.Array[Route], 
      /* is @ant-design/pro-layout.@ant-design/pro-layout/es/typings.Route */ Boolean
    ], 
    js.Array[Route]
  ]
  
  val find: js.Function1[
    /* predicate */ js.ThisFunction3[
      /* this */ Unit, 
      /* value */ Route, 
      /* index */ Double, 
      /* obj */ js.Array[Route], 
      /* is @ant-design/pro-layout.@ant-design/pro-layout/es/typings.Route */ Boolean
    ], 
    js.UndefOr[Route]
  ]
  
  val findIndex: js.Function1[
    /* predicate */ js.Function3[/* value */ Route, /* index */ Double, /* obj */ js.Array[Route], Any], 
    Double
  ]
  
  val flat: js.ThisFunction0[/* this */ Any, js.Array[FlatArray[Any, `1`]]]
  
  val flatMap: js.Function1[
    /* callback */ js.ThisFunction3[
      /* this */ Unit, 
      /* value */ Route, 
      /* index */ Double, 
      /* array */ js.Array[Route], 
      Any | js.Array[Any]
    ], 
    js.Array[Any]
  ]
  
  val forEach: js.Function1[
    /* callbackfn */ js.Function3[/* value */ Route, /* index */ Double, /* array */ js.Array[Route], Unit], 
    Unit
  ]
  
  val includes: js.Function1[/* searchElement */ Route, Boolean]
  
  val indexOf: js.Function1[/* searchElement */ Route, Double]
  
  val join: js.Function0[String]
  
  val keys: js.Function0[IterableIterator[Double]]
  
  val lastIndexOf: js.Function1[/* searchElement */ Route, Double]
  
  val length: Double
  
  val map: js.Function1[
    /* callbackfn */ js.Function3[/* value */ Route, /* index */ Double, /* array */ js.Array[Route], Any], 
    js.Array[Any]
  ]
  
  val pop: js.Function0[js.UndefOr[Route]]
  
  val push: js.Function1[/* repeated */ Route, Double]
  
  val reduce: js.Function1[
    /* callbackfn */ js.Function4[
      /* previousValue */ Route, 
      /* currentValue */ Route, 
      /* currentIndex */ Double, 
      /* array */ js.Array[Route], 
      Route
    ], 
    Route
  ]
  
  val reduceRight: js.Function1[
    /* callbackfn */ js.Function4[
      /* previousValue */ Route, 
      /* currentValue */ Route, 
      /* currentIndex */ Double, 
      /* array */ js.Array[Route], 
      Route
    ], 
    Route
  ]
  
  val reverse: js.Function0[js.Array[Route]]
  
  val shift: js.Function0[js.UndefOr[Route]]
  
  val slice: js.Function0[js.Array[Route]]
  
  val some: js.Function1[
    /* predicate */ js.Function3[/* value */ Route, /* index */ Double, /* array */ js.Array[Route], Any], 
    Boolean
  ]
  
  val sort: js.Function0[this.type]
  
  val splice: js.Function1[/* start */ Double, js.Array[Route]]
  
  @JSName("toLocaleString")
  val toLocaleString_FReadonlyArrayRoute: js.Function0[String]
  
  @JSName("toString")
  val toString_FReadonlyArrayRoute: js.Function0[String]
  
  val unshift: js.Function1[/* repeated */ Route, Double]
  
  val values: js.Function0[IterableIterator[Route]]
}
object ReadonlyArrayRoute {
  
  inline def apply(
    at: /* index */ Double => js.UndefOr[Route],
    concat: /* repeated */ js.Array[Route] => js.Array[Route],
    copyWithin: (/* target */ Double, /* start */ Double) => ReadonlyArrayRoute,
    entries: CallbackTo[IterableIterator[js.Tuple2[Double, Route]]],
    every: /* predicate */ js.Function3[
      /* value */ Route, 
      /* index */ Double, 
      /* array */ js.Array[Route], 
      /* is @ant-design/pro-layout.@ant-design/pro-layout/es/typings.Route */ Boolean
    ] => /* is std.Array<@ant-design/pro-layout.@ant-design/pro-layout/es/typings.Route> */ Boolean,
    fill: /* value */ Route => ReadonlyArrayRoute,
    filter: /* predicate */ js.Function3[
      /* value */ Route, 
      /* index */ Double, 
      /* array */ js.Array[Route], 
      /* is @ant-design/pro-layout.@ant-design/pro-layout/es/typings.Route */ Boolean
    ] => js.Array[Route],
    find: /* predicate */ js.ThisFunction3[
      /* this */ Unit, 
      /* value */ Route, 
      /* index */ Double, 
      /* obj */ js.Array[Route], 
      /* is @ant-design/pro-layout.@ant-design/pro-layout/es/typings.Route */ Boolean
    ] => js.UndefOr[Route],
    findIndex: /* predicate */ js.Function3[/* value */ Route, /* index */ Double, /* obj */ js.Array[Route], Any] => Double,
    flat: js.ThisFunction0[/* this */ Any, js.Array[FlatArray[Any, `1`]]],
    flatMap: /* callback */ js.ThisFunction3[
      /* this */ Unit, 
      /* value */ Route, 
      /* index */ Double, 
      /* array */ js.Array[Route], 
      Any | js.Array[Any]
    ] => js.Array[Any],
    forEach: /* callbackfn */ js.Function3[/* value */ Route, /* index */ Double, /* array */ js.Array[Route], Unit] => Callback,
    includes: /* searchElement */ Route => Boolean,
    indexOf: /* searchElement */ Route => Double,
    join: CallbackTo[String],
    keys: CallbackTo[IterableIterator[Double]],
    lastIndexOf: /* searchElement */ Route => Double,
    length: Double,
    map: /* callbackfn */ js.Function3[/* value */ Route, /* index */ Double, /* array */ js.Array[Route], Any] => js.Array[Any],
    pop: CallbackTo[js.UndefOr[Route]],
    push: /* repeated */ Route => Double,
    reduce: /* callbackfn */ js.Function4[
      /* previousValue */ Route, 
      /* currentValue */ Route, 
      /* currentIndex */ Double, 
      /* array */ js.Array[Route], 
      Route
    ] => Route,
    reduceRight: /* callbackfn */ js.Function4[
      /* previousValue */ Route, 
      /* currentValue */ Route, 
      /* currentIndex */ Double, 
      /* array */ js.Array[Route], 
      Route
    ] => Route,
    reverse: CallbackTo[js.Array[Route]],
    shift: CallbackTo[js.UndefOr[Route]],
    slice: CallbackTo[js.Array[Route]],
    some: /* predicate */ js.Function3[/* value */ Route, /* index */ Double, /* array */ js.Array[Route], Any] => Boolean,
    sort: CallbackTo[ReadonlyArrayRoute],
    splice: /* start */ Double => js.Array[Route],
    toLocaleString: CallbackTo[String],
    toString_ : CallbackTo[String],
    unshift: /* repeated */ Route => Double,
    values: CallbackTo[IterableIterator[Route]]
  ): ReadonlyArrayRoute = {
    val __obj = js.Dynamic.literal(at = js.Any.fromFunction1(at), concat = js.Any.fromFunction1(concat), copyWithin = js.Any.fromFunction2(copyWithin), entries = entries.toJsFn, every = js.Any.fromFunction1(every), fill = js.Any.fromFunction1(fill), filter = js.Any.fromFunction1(filter), find = js.Any.fromFunction1(find), findIndex = js.Any.fromFunction1(findIndex), flat = flat.asInstanceOf[js.Any], flatMap = js.Any.fromFunction1(flatMap), forEach = js.Any.fromFunction1((t0: /* callbackfn */ js.Function3[/* value */ Route, /* index */ Double, /* array */ js.Array[Route], Unit]) => forEach(t0).runNow()), includes = js.Any.fromFunction1(includes), indexOf = js.Any.fromFunction1(indexOf), join = join.toJsFn, keys = keys.toJsFn, lastIndexOf = js.Any.fromFunction1(lastIndexOf), length = length.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), pop = pop.toJsFn, push = js.Any.fromFunction1(push), reduce = js.Any.fromFunction1(reduce), reduceRight = js.Any.fromFunction1(reduceRight), reverse = reverse.toJsFn, shift = shift.toJsFn, slice = slice.toJsFn, some = js.Any.fromFunction1(some), sort = sort.toJsFn, splice = js.Any.fromFunction1(splice), toLocaleString = toLocaleString.toJsFn, unshift = js.Any.fromFunction1(unshift), values = values.toJsFn)
    __obj.updateDynamic("toString")(toString_.toJsFn)
    __obj.asInstanceOf[ReadonlyArrayRoute]
  }
  
  extension [Self <: ReadonlyArrayRoute](x: Self) {
    
    inline def setAt(value: /* index */ Double => js.UndefOr[Route]): Self = StObject.set(x, "at", js.Any.fromFunction1(value))
    
    inline def setConcat(value: /* repeated */ js.Array[Route] => js.Array[Route]): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
    
    inline def setCopyWithin(value: (/* target */ Double, /* start */ Double) => ReadonlyArrayRoute): Self = StObject.set(x, "copyWithin", js.Any.fromFunction2(value))
    
    inline def setEntries(value: CallbackTo[IterableIterator[js.Tuple2[Double, Route]]]): Self = StObject.set(x, "entries", value.toJsFn)
    
    inline def setEvery(
      value: /* predicate */ js.Function3[
          /* value */ Route, 
          /* index */ Double, 
          /* array */ js.Array[Route], 
          /* is @ant-design/pro-layout.@ant-design/pro-layout/es/typings.Route */ Boolean
        ] => /* is std.Array<@ant-design/pro-layout.@ant-design/pro-layout/es/typings.Route> */ Boolean
    ): Self = StObject.set(x, "every", js.Any.fromFunction1(value))
    
    inline def setFill(value: /* value */ Route => ReadonlyArrayRoute): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
    
    inline def setFilter(
      value: /* predicate */ js.Function3[
          /* value */ Route, 
          /* index */ Double, 
          /* array */ js.Array[Route], 
          /* is @ant-design/pro-layout.@ant-design/pro-layout/es/typings.Route */ Boolean
        ] => js.Array[Route]
    ): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    inline def setFind(
      value: /* predicate */ js.ThisFunction3[
          /* this */ Unit, 
          /* value */ Route, 
          /* index */ Double, 
          /* obj */ js.Array[Route], 
          /* is @ant-design/pro-layout.@ant-design/pro-layout/es/typings.Route */ Boolean
        ] => js.UndefOr[Route]
    ): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
    
    inline def setFindIndex(
      value: /* predicate */ js.Function3[/* value */ Route, /* index */ Double, /* obj */ js.Array[Route], Any] => Double
    ): Self = StObject.set(x, "findIndex", js.Any.fromFunction1(value))
    
    inline def setFlat(value: js.ThisFunction0[/* this */ Any, js.Array[FlatArray[Any, `1`]]]): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
    
    inline def setFlatMap(
      value: /* callback */ js.ThisFunction3[
          /* this */ Unit, 
          /* value */ Route, 
          /* index */ Double, 
          /* array */ js.Array[Route], 
          Any | js.Array[Any]
        ] => js.Array[Any]
    ): Self = StObject.set(x, "flatMap", js.Any.fromFunction1(value))
    
    inline def setForEach(
      value: /* callbackfn */ js.Function3[/* value */ Route, /* index */ Double, /* array */ js.Array[Route], Unit] => Callback
    ): Self = StObject.set(x, "forEach", js.Any.fromFunction1((t0: /* callbackfn */ js.Function3[/* value */ Route, /* index */ Double, /* array */ js.Array[Route], Unit]) => value(t0).runNow()))
    
    inline def setIncludes(value: /* searchElement */ Route => Boolean): Self = StObject.set(x, "includes", js.Any.fromFunction1(value))
    
    inline def setIndexOf(value: /* searchElement */ Route => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
    
    inline def setJoin(value: CallbackTo[String]): Self = StObject.set(x, "join", value.toJsFn)
    
    inline def setKeys(value: CallbackTo[IterableIterator[Double]]): Self = StObject.set(x, "keys", value.toJsFn)
    
    inline def setLastIndexOf(value: /* searchElement */ Route => Double): Self = StObject.set(x, "lastIndexOf", js.Any.fromFunction1(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setMap(
      value: /* callbackfn */ js.Function3[/* value */ Route, /* index */ Double, /* array */ js.Array[Route], Any] => js.Array[Any]
    ): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
    
    inline def setPop(value: CallbackTo[js.UndefOr[Route]]): Self = StObject.set(x, "pop", value.toJsFn)
    
    inline def setPush(value: /* repeated */ Route => Double): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    
    inline def setReduce(
      value: /* callbackfn */ js.Function4[
          /* previousValue */ Route, 
          /* currentValue */ Route, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Route], 
          Route
        ] => Route
    ): Self = StObject.set(x, "reduce", js.Any.fromFunction1(value))
    
    inline def setReduceRight(
      value: /* callbackfn */ js.Function4[
          /* previousValue */ Route, 
          /* currentValue */ Route, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Route], 
          Route
        ] => Route
    ): Self = StObject.set(x, "reduceRight", js.Any.fromFunction1(value))
    
    inline def setReverse(value: CallbackTo[js.Array[Route]]): Self = StObject.set(x, "reverse", value.toJsFn)
    
    inline def setShift(value: CallbackTo[js.UndefOr[Route]]): Self = StObject.set(x, "shift", value.toJsFn)
    
    inline def setSlice(value: CallbackTo[js.Array[Route]]): Self = StObject.set(x, "slice", value.toJsFn)
    
    inline def setSome(
      value: /* predicate */ js.Function3[/* value */ Route, /* index */ Double, /* array */ js.Array[Route], Any] => Boolean
    ): Self = StObject.set(x, "some", js.Any.fromFunction1(value))
    
    inline def setSort(value: CallbackTo[ReadonlyArrayRoute]): Self = StObject.set(x, "sort", value.toJsFn)
    
    inline def setSplice(value: /* start */ Double => js.Array[Route]): Self = StObject.set(x, "splice", js.Any.fromFunction1(value))
    
    inline def setToLocaleString(value: CallbackTo[String]): Self = StObject.set(x, "toLocaleString", value.toJsFn)
    
    inline def setToString_(value: CallbackTo[String]): Self = StObject.set(x, "toString", value.toJsFn)
    
    inline def setUnshift(value: /* repeated */ Route => Double): Self = StObject.set(x, "unshift", js.Any.fromFunction1(value))
    
    inline def setValues(value: CallbackTo[IterableIterator[Route]]): Self = StObject.set(x, "values", value.toJsFn)
  }
}
