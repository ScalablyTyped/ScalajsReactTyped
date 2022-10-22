package typingsJapgolly.classificator

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.FlatArray
import typingsJapgolly.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Category extends StObject {
    
    var category: String
    
    var logLikelihood: Double
    
    var logProba: Double
    
    var proba: Double
  }
  object Category {
    
    inline def apply(category: String, logLikelihood: Double, logProba: Double, proba: Double): Category = {
      val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], logLikelihood = logLikelihood.asInstanceOf[js.Any], logProba = logProba.asInstanceOf[js.Any], proba = proba.asInstanceOf[js.Any])
      __obj.asInstanceOf[Category]
    }
    
    extension [Self <: Category](x: Self) {
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setLogLikelihood(value: Double): Self = StObject.set(x, "logLikelihood", value.asInstanceOf[js.Any])
      
      inline def setLogProba(value: Double): Self = StObject.set(x, "logProba", value.asInstanceOf[js.Any])
      
      inline def setProba(value: Double): Self = StObject.set(x, "proba", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<std.Array<string>> */
  trait ReadonlyArraystring extends StObject {
    
    def at(index: Double): js.UndefOr[String]
    
    def concat(items: js.Array[String]*): js.Array[String]
    
    def copyWithin(target: Double, start: Double): this.type
    
    def entries(): IterableIterator[js.Tuple2[Double, String]]
    
    def every[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): /* is std.Array<S> */ Boolean
    
    def fill(value: String): this.type
    
    def filter[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.Array[S]
    
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S]
    
    def findIndex(predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], Any]): Double
    
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]]
    
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ]
    ): js.Array[U]
    
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit]
    ): Unit
    
    def includes(searchElement: String): Boolean
    
    def indexOf(searchElement: String): Double
    
    def join(): String
    
    def keys(): IterableIterator[Double]
    
    def lastIndexOf(searchElement: String): Double
    
    val length: Double
    
    def map[U](callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U]): js.Array[U]
    
    def pop(): js.UndefOr[String]
    
    def push(items: String*): Double
    
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String
    
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String
    
    def reverse(): js.Array[String]
    
    def shift(): js.UndefOr[String]
    
    def slice(): js.Array[String]
    
    def some(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any]): Boolean
    
    def sort(): this.type
    
    def splice(start: Double): js.Array[String]
    
    def unshift(items: String*): Double
    
    def values(): IterableIterator[String]
  }
  object ReadonlyArraystring {
    
    inline def apply(
      at: Double => js.UndefOr[String],
      concat: /* repeated */ js.Array[String] => js.Array[String],
      copyWithin: (Double, Double) => ReadonlyArraystring,
      entries: CallbackTo[IterableIterator[js.Tuple2[Double, String]]],
      every: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ] => /* is std.Array<S> */ Boolean,
      fill: String => ReadonlyArraystring,
      filter: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ] => js.Array[Any],
      find: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ] => js.UndefOr[Any],
      findIndex: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], Any] => Double,
      flat: CallbackTo[js.Array[FlatArray[Any, Any]]],
      flatMap: js.ThisFunction3[
          Any, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          Any | js.Array[Any]
        ] => js.Array[Any],
      forEach: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit] => Callback,
      includes: String => Boolean,
      indexOf: String => Double,
      join: CallbackTo[String],
      keys: CallbackTo[IterableIterator[Double]],
      lastIndexOf: String => Double,
      length: Double,
      map: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any] => js.Array[Any],
      pop: CallbackTo[js.UndefOr[String]],
      push: /* repeated */ String => Double,
      reduce: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ] => String,
      reduceRight: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ] => String,
      reverse: CallbackTo[js.Array[String]],
      shift: CallbackTo[js.UndefOr[String]],
      slice: CallbackTo[js.Array[String]],
      some: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any] => Boolean,
      sort: CallbackTo[ReadonlyArraystring],
      splice: Double => js.Array[String],
      unshift: /* repeated */ String => Double,
      values: CallbackTo[IterableIterator[String]]
    ): ReadonlyArraystring = {
      val __obj = js.Dynamic.literal(at = js.Any.fromFunction1(at), concat = js.Any.fromFunction1(concat), copyWithin = js.Any.fromFunction2(copyWithin), entries = entries.toJsFn, every = js.Any.fromFunction1(every), fill = js.Any.fromFunction1(fill), filter = js.Any.fromFunction1(filter), find = js.Any.fromFunction1(find), findIndex = js.Any.fromFunction1(findIndex), flat = flat.toJsFn, flatMap = js.Any.fromFunction1(flatMap), forEach = js.Any.fromFunction1((t0: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit]) => forEach(t0).runNow()), includes = js.Any.fromFunction1(includes), indexOf = js.Any.fromFunction1(indexOf), join = join.toJsFn, keys = keys.toJsFn, lastIndexOf = js.Any.fromFunction1(lastIndexOf), length = length.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), pop = pop.toJsFn, push = js.Any.fromFunction1(push), reduce = js.Any.fromFunction1(reduce), reduceRight = js.Any.fromFunction1(reduceRight), reverse = reverse.toJsFn, shift = shift.toJsFn, slice = slice.toJsFn, some = js.Any.fromFunction1(some), sort = sort.toJsFn, splice = js.Any.fromFunction1(splice), unshift = js.Any.fromFunction1(unshift), values = values.toJsFn)
      __obj.asInstanceOf[ReadonlyArraystring]
    }
    
    extension [Self <: ReadonlyArraystring](x: Self) {
      
      inline def setAt(value: Double => js.UndefOr[String]): Self = StObject.set(x, "at", js.Any.fromFunction1(value))
      
      inline def setConcat(value: /* repeated */ js.Array[String] => js.Array[String]): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
      
      inline def setCopyWithin(value: (Double, Double) => ReadonlyArraystring): Self = StObject.set(x, "copyWithin", js.Any.fromFunction2(value))
      
      inline def setEntries(value: CallbackTo[IterableIterator[js.Tuple2[Double, String]]]): Self = StObject.set(x, "entries", value.toJsFn)
      
      inline def setEvery(
        value: js.Function3[
              /* value */ String, 
              /* index */ Double, 
              /* array */ js.Array[String], 
              /* is S */ Boolean
            ] => /* is std.Array<S> */ Boolean
      ): Self = StObject.set(x, "every", js.Any.fromFunction1(value))
      
      inline def setFill(value: String => ReadonlyArraystring): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
      
      inline def setFilter(
        value: js.Function3[
              /* value */ String, 
              /* index */ Double, 
              /* array */ js.Array[String], 
              /* is S */ Boolean
            ] => js.Array[Any]
      ): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFind(
        value: js.ThisFunction3[
              /* this */ Unit, 
              /* value */ String, 
              /* index */ Double, 
              /* obj */ js.Array[String], 
              /* is S */ Boolean
            ] => js.UndefOr[Any]
      ): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      inline def setFindIndex(
        value: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], Any] => Double
      ): Self = StObject.set(x, "findIndex", js.Any.fromFunction1(value))
      
      inline def setFlat(value: CallbackTo[js.Array[FlatArray[Any, Any]]]): Self = StObject.set(x, "flat", value.toJsFn)
      
      inline def setFlatMap(
        value: js.ThisFunction3[
              Any, 
              /* value */ String, 
              /* index */ Double, 
              /* array */ js.Array[String], 
              Any | js.Array[Any]
            ] => js.Array[Any]
      ): Self = StObject.set(x, "flatMap", js.Any.fromFunction1(value))
      
      inline def setForEach(
        value: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit] => Callback
      ): Self = StObject.set(x, "forEach", js.Any.fromFunction1((t0: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit]) => value(t0).runNow()))
      
      inline def setIncludes(value: String => Boolean): Self = StObject.set(x, "includes", js.Any.fromFunction1(value))
      
      inline def setIndexOf(value: String => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
      
      inline def setJoin(value: CallbackTo[String]): Self = StObject.set(x, "join", value.toJsFn)
      
      inline def setKeys(value: CallbackTo[IterableIterator[Double]]): Self = StObject.set(x, "keys", value.toJsFn)
      
      inline def setLastIndexOf(value: String => Double): Self = StObject.set(x, "lastIndexOf", js.Any.fromFunction1(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setMap(
        value: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any] => js.Array[Any]
      ): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setPop(value: CallbackTo[js.UndefOr[String]]): Self = StObject.set(x, "pop", value.toJsFn)
      
      inline def setPush(value: /* repeated */ String => Double): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      inline def setReduce(
        value: js.Function4[
              /* previousValue */ String, 
              /* currentValue */ String, 
              /* currentIndex */ Double, 
              /* array */ js.Array[String], 
              String
            ] => String
      ): Self = StObject.set(x, "reduce", js.Any.fromFunction1(value))
      
      inline def setReduceRight(
        value: js.Function4[
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
        value: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any] => Boolean
      ): Self = StObject.set(x, "some", js.Any.fromFunction1(value))
      
      inline def setSort(value: CallbackTo[ReadonlyArraystring]): Self = StObject.set(x, "sort", value.toJsFn)
      
      inline def setSplice(value: Double => js.Array[String]): Self = StObject.set(x, "splice", js.Any.fromFunction1(value))
      
      inline def setUnshift(value: /* repeated */ String => Double): Self = StObject.set(x, "unshift", js.Any.fromFunction1(value))
      
      inline def setValues(value: CallbackTo[IterableIterator[String]]): Self = StObject.set(x, "values", value.toJsFn)
    }
  }
}
