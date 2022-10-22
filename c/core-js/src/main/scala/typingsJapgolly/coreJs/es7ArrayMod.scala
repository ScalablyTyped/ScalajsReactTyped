package typingsJapgolly.coreJs

import typingsJapgolly.std.ArrayLike
import typingsJapgolly.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* was `typeof core.Array` */
object es7ArrayMod {
  
  @JSImport("core-js/es7/array", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def concat[T](array: ArrayLike[T], items: (Array[T] | T)*): Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(scala.List(array.asInstanceOf[js.Any]).`++`(items.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Array[T]]
  
  inline def copyWithin[T](array: ArrayLike[T], target: Double, start: Double): Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyWithin")(array.asInstanceOf[js.Any], target.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Array[T]]
  inline def copyWithin[T](array: ArrayLike[T], target: Double, start: Double, end: Double): Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyWithin")(array.asInstanceOf[js.Any], target.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Array[T]]
  
  inline def entries[T](array: ArrayLike[T]): IterableIterator[js.Tuple2[Double, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")(array.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[js.Tuple2[Double, T]]]
  
  inline def every[T](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Boolean]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def every[T](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Boolean],
    thisArg: Any
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def fill[T](array: ArrayLike[T], value: T): Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Array[T]]
  inline def fill[T](array: ArrayLike[T], value: T, start: Double): Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Array[T]]
  inline def fill[T](array: ArrayLike[T], value: T, start: Double, end: Double): Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Array[T]]
  inline def fill[T](array: ArrayLike[T], value: T, start: Unit, end: Double): Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Array[T]]
  
  inline def filter[T](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Boolean]
  ): Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any])).asInstanceOf[Array[T]]
  inline def filter[T](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Boolean],
    thisArg: Any
  ): Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Array[T]]
  
  inline def find[T](
    array: ArrayLike[T],
    predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ Array[T], Boolean]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(array.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def find[T](
    array: ArrayLike[T],
    predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ Array[T], Boolean],
    thisArg: Any
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(array.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def findIndex[T](array: ArrayLike[T], predicate: js.Function1[/* value */ T, Boolean]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(array.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def findIndex[T](array: ArrayLike[T], predicate: js.Function1[/* value */ T, Boolean], thisArg: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(array.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def forEach[T](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def forEach[T](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Unit],
    thisArg: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def from[T](arrayLike: js.Iterable[T]): Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(arrayLike.asInstanceOf[js.Any]).asInstanceOf[Array[T]]
  inline def from[T](arrayLike: ArrayLike[T]): Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(arrayLike.asInstanceOf[js.Any]).asInstanceOf[Array[T]]
  inline def from[T, U](arrayLike: js.Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(arrayLike.asInstanceOf[js.Any], mapfn.asInstanceOf[js.Any])).asInstanceOf[Array[U]]
  inline def from[T, U](arrayLike: js.Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: Any): Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(arrayLike.asInstanceOf[js.Any], mapfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Array[U]]
  inline def from[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(arrayLike.asInstanceOf[js.Any], mapfn.asInstanceOf[js.Any])).asInstanceOf[Array[U]]
  inline def from[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: Any): Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(arrayLike.asInstanceOf[js.Any], mapfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Array[U]]
  
  inline def includes[T](array: ArrayLike[T], value: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def includes[T](array: ArrayLike[T], value: T, fromIndex: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def indexOf[T](array: ArrayLike[T], searchElement: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], searchElement.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def indexOf[T](array: ArrayLike[T], searchElement: T, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isArray(arg: Any): /* is core-js.Array<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is core-js.Array<any> */ Boolean]
  
  inline def join[T](array: ArrayLike[T]): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(array.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  inline def join[T](array: ArrayLike[T], separator: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(array.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  inline def keys[T](array: ArrayLike[T]): IterableIterator[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(array.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[Double]]
  
  inline def lastIndexOf[T](array: ArrayLike[T], earchElement: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(array.asInstanceOf[js.Any], earchElement.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def lastIndexOf[T](array: ArrayLike[T], earchElement: T, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(array.asInstanceOf[js.Any], earchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def map[T, U](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], U]
  ): Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any])).asInstanceOf[Array[U]]
  inline def map[T, U](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], U],
    thisArg: Any
  ): Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Array[U]]
  
  inline def of[T](items: T*): Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Array[T]]
  
  inline def pop[T](array: ArrayLike[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")(array.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def push[T](array: ArrayLike[T], items: T*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(scala.List(array.asInstanceOf[js.Any]).`++`(items.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Double]
  
  inline def reduce[T](
    array: ArrayLike[T],
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ Array[T], 
      T
    ]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def reduce[T](
    array: ArrayLike[T],
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ Array[T], 
      T
    ],
    initialValue: T
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def reduceRight[T](
    array: ArrayLike[T],
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ Array[T], 
      T
    ]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def reduceRight[T](
    array: ArrayLike[T],
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ Array[T], 
      T
    ],
    initialValue: T
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def reduceRight_TU_U[T, U](
    array: ArrayLike[T],
    callbackfn: js.Function4[
      /* previousValue */ U, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ Array[T], 
      U
    ],
    initialValue: U
  ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[U]
  
  inline def reduce_TU_U[T, U](
    array: ArrayLike[T],
    callbackfn: js.Function4[
      /* previousValue */ U, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ Array[T], 
      U
    ],
    initialValue: U
  ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[U]
  
  inline def reverse[T](array: ArrayLike[T]): Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(array.asInstanceOf[js.Any]).asInstanceOf[Array[T]]
  
  inline def shift[T](array: ArrayLike[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")(array.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def slice[T](array: ArrayLike[T]): Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(array.asInstanceOf[js.Any]).asInstanceOf[Array[T]]
  inline def slice[T](array: ArrayLike[T], start: Double): Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(array.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Array[T]]
  inline def slice[T](array: ArrayLike[T], start: Double, end: Double): Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(array.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Array[T]]
  inline def slice[T](array: ArrayLike[T], start: Unit, end: Double): Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(array.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Array[T]]
  
  inline def some[T](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Boolean]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def some[T](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Boolean],
    thisArg: Any
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def sort[T](array: ArrayLike[T]): Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(array.asInstanceOf[js.Any]).asInstanceOf[Array[T]]
  inline def sort[T](array: ArrayLike[T], compareFn: js.Function2[/* a */ T, /* b */ T, Double]): Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(array.asInstanceOf[js.Any], compareFn.asInstanceOf[js.Any])).asInstanceOf[Array[T]]
  
  inline def splice[T](array: ArrayLike[T], start: Double, deleteCount: Double, items: T*): Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")((scala.List(array.asInstanceOf[js.Any], start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any])).`++`(items.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Array[T]]
  inline def splice[T](array: ArrayLike[T], start: Double, deleteCount: Unit, items: T*): Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")((scala.List(array.asInstanceOf[js.Any], start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any])).`++`(items.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Array[T]]
  
  inline def turn[T](
    array: ArrayLike[T],
    callbackfn: js.Function4[/* memo */ Array[T], /* value */ T, /* index */ Double, /* array */ Array[T], Unit]
  ): Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("turn")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any])).asInstanceOf[Array[T]]
  inline def turn[T](
    array: ArrayLike[T],
    callbackfn: js.Function4[/* memo */ Array[T], /* value */ T, /* index */ Double, /* array */ Array[T], Unit],
    memo: Array[T]
  ): Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("turn")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any], memo.asInstanceOf[js.Any])).asInstanceOf[Array[T]]
  inline def turn[T, U](
    array: ArrayLike[T],
    callbackfn: js.Function4[/* memo */ U, /* value */ T, /* index */ Double, /* array */ Array[T], Unit],
    memo: U
  ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("turn")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any], memo.asInstanceOf[js.Any])).asInstanceOf[U]
  
  inline def turn_TU_U[T, U](
    array: ArrayLike[T],
    callbackfn: js.Function4[/* memo */ U, /* value */ T, /* index */ Double, /* array */ Array[T], Unit]
  ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("turn")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any])).asInstanceOf[U]
  
  inline def unshift[T](array: ArrayLike[T], items: T*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unshift")(scala.List(array.asInstanceOf[js.Any]).`++`(items.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Double]
  
  inline def values[T](array: ArrayLike[T]): IterableIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(array.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[T]]
}
