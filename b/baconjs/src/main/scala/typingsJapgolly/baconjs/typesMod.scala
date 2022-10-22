package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.anon.Fn0
import typingsJapgolly.baconjs.anon.Fn1
import typingsJapgolly.baconjs.anon.Fn10
import typingsJapgolly.baconjs.anon.Fn2
import typingsJapgolly.baconjs.anon.Fn3
import typingsJapgolly.baconjs.anon.Fn4
import typingsJapgolly.baconjs.anon.Fn5
import typingsJapgolly.baconjs.anon.Fn6
import typingsJapgolly.baconjs.anon.Fn7
import typingsJapgolly.baconjs.anon.Fn8
import typingsJapgolly.baconjs.anon.Fn9
import typingsJapgolly.baconjs.anon.FnCall
import typingsJapgolly.baconjs.anon.FnCallF
import typingsJapgolly.baconjs.anon.FnCallFXs
import typingsJapgolly.baconjs.anon.FnCallFnMe
import typingsJapgolly.baconjs.anon.FnCallX
import typingsJapgolly.baconjs.anon.FnCallXXs
import typingsJapgolly.baconjs.anon.FnCallXs
import typingsJapgolly.baconjs.anon.FnCallXsF
import typingsJapgolly.baconjs.anon.FnCallXsSeedF
import typingsJapgolly.baconjs.anon.FnCallXsX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("baconjs/types/_", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("baconjs/types/_", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baconjs/types/_", "default.all")
    @js.native
    def all: Fn7 = js.native
    inline def all[A](xs: js.Array[A], f: js.Function1[/* x */ A, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(xs.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def all_=(x: Fn7): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.always")
    @js.native
    def always: FnCallX = js.native
    inline def always[A](x: A): js.Function0[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("always")(x.asInstanceOf[js.Any]).asInstanceOf[js.Function0[A]]
    inline def always_=(x: FnCallX): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("always")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.any")
    @js.native
    def any: Any = js.native
    inline def any_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("any")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.bind")
    @js.native
    def bind: FnCallFnMe = js.native
    inline def bind[F /* <: js.Function */](fn: F, me: Any): F = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], me.asInstanceOf[js.Any])).asInstanceOf[F]
    inline def bind_=(x: FnCallFnMe): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bind")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.contains")
    @js.native
    def contains: FnCallXsX = js.native
    inline def contains[A](xs: js.Array[A], x: A): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(xs.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def contains_=(x: FnCallXsX): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contains")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.each")
    @js.native
    def each: Fn3 = js.native
    inline def each[A](xs: Any, f: js.Function2[/* key */ String, /* x */ A, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(xs.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def each_=(x: Fn3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("each")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.empty")
    @js.native
    def empty: Fn0 = js.native
    inline def empty[A](xs: js.Array[A]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")(xs.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def empty_=(x: Fn0): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("empty")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.filter")
    @js.native
    def filter: FnCallFXs = js.native
    inline def filter[A](f: js.Function1[/* a */ A, Boolean], xs: js.Array[A]): js.Array[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(f.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Array[A]]
    inline def filter_=(x: FnCallFXs): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("filter")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.flatMap")
    @js.native
    def flatMap: Fn9 = js.native
    inline def flatMap[A, B](f: js.Function1[/* x */ A, js.Array[B]], xs: js.Array[A]): js.Array[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(f.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Array[B]]
    inline def flatMap_=(x: Fn9): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flatMap")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.fold")
    @js.native
    def fold: FnCallXsSeedF = js.native
    inline def fold[V, A](xs: js.Array[V], seed: A, f: js.Function2[/* acc */ A, /* x */ V, A]): A = (^.asInstanceOf[js.Dynamic].applyDynamic("fold")(xs.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[A]
    inline def fold_=(x: FnCallXsSeedF): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fold")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.head")
    @js.native
    def head: FnCallXs = js.native
    inline def head[V](xs: js.Array[V]): V = ^.asInstanceOf[js.Dynamic].applyDynamic("head")(xs.asInstanceOf[js.Any]).asInstanceOf[V]
    inline def head_=(x: FnCallXs): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("head")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.id")
    @js.native
    def id: Fn5 = js.native
    inline def id[A](x: A): A = ^.asInstanceOf[js.Dynamic].applyDynamic("id")(x.asInstanceOf[js.Any]).asInstanceOf[A]
    inline def id_=(x: Fn5): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.indexOf")
    @js.native
    def indexOf: FnCall = js.native
    inline def indexOf[A](xs: js.Array[A], x: A): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(xs.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def indexOf_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indexOf")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.indexWhere")
    @js.native
    def indexWhere: FnCallXsF = js.native
    inline def indexWhere[A](xs: js.Array[A], f: js.Function1[/* x */ A, Boolean]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexWhere")(xs.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def indexWhere_=(x: FnCallXsF): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indexWhere")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.isFunction")
    @js.native
    def isFunction: js.Function1[/* f */ Any, /* is std.Function */ Boolean] = js.native
    inline def isFunction(f: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(f.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
    inline def isFunction_=(x: js.Function1[/* f */ Any, /* is std.Function */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isFunction")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.last")
    @js.native
    def last: Fn6 = js.native
    inline def last[A](xs: js.Array[A]): A = ^.asInstanceOf[js.Dynamic].applyDynamic("last")(xs.asInstanceOf[js.Any]).asInstanceOf[A]
    inline def last_=(x: Fn6): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("last")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.map")
    @js.native
    def map: Fn2 = js.native
    inline def map[A, B](f: js.Function1[/* a */ A, B], xs: js.Array[A]): js.Array[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Array[B]]
    inline def map_=(x: Fn2): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("map")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.negate")
    @js.native
    def negate: FnCallF = js.native
    inline def negate[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* x */ A, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("negate")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* x */ A, Boolean]]
    inline def negate_=(x: FnCallF): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("negate")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.remove")
    @js.native
    def remove: Fn8 = js.native
    inline def remove[V](x: V, xs: js.Array[V]): js.UndefOr[js.Array[V]] = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(x.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[V]]]
    inline def remove_=(x: Fn8): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("remove")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.tail")
    @js.native
    def tail: Fn1 = js.native
    inline def tail[V](xs: js.Array[V]): js.Array[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("tail")(xs.asInstanceOf[js.Any]).asInstanceOf[js.Array[V]]
    inline def tail_=(x: Fn1): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tail")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.toArray")
    @js.native
    def toArray: Fn4 = js.native
    inline def toArray[A](xs: A): js.Array[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(xs.asInstanceOf[js.Any]).asInstanceOf[js.Array[A]]
    inline def toArray[A](xs: js.Array[A]): js.Array[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(xs.asInstanceOf[js.Any]).asInstanceOf[js.Array[A]]
    inline def toArray_=(x: Fn4): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toArray")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.toFunction")
    @js.native
    def toFunction: Fn10 = js.native
    inline def toFunction[V, V2](f: V2): js.Function1[/* x */ V, V2] = ^.asInstanceOf[js.Dynamic].applyDynamic("toFunction")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* x */ V, V2]]
    inline def toFunction[V, V2](f: js.Function1[/* x */ V, V2]): js.Function1[/* x */ V, V2] = ^.asInstanceOf[js.Dynamic].applyDynamic("toFunction")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* x */ V, V2]]
    inline def toFunction_=(x: Fn10): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toFunction")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.toString")
    @js.native
    def toString_ : js.Function1[/* obj */ Any, String] = js.native
    
    inline def toString_(obj: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def toString__=(x: js.Function1[/* obj */ Any, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toString")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.without")
    @js.native
    def without: FnCallXXs = js.native
    inline def without[A](x: A, xs: js.Array[A]): js.Array[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("without")(x.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Array[A]]
    inline def without_=(x: FnCallXXs): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("without")(x.asInstanceOf[js.Any])
  }
  
  inline def all[A](xs: js.Array[A], f: js.Function1[/* x */ A, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(xs.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def always[A](x: A): js.Function0[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("always")(x.asInstanceOf[js.Any]).asInstanceOf[js.Function0[A]]
  
  inline def any[A](xs: js.Array[A], f: js.Function1[/* x */ A, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(xs.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def bind[F /* <: js.Function */](fn: F, me: Any): F = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], me.asInstanceOf[js.Any])).asInstanceOf[F]
  
  inline def contains[A](xs: js.Array[A], x: A): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(xs.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def each[A](xs: Any, f: js.Function2[/* key */ String, /* x */ A, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(xs.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def empty[A](xs: js.Array[A]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")(xs.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def filter[A](f: js.Function1[/* a */ A, Boolean], xs: js.Array[A]): js.Array[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(f.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Array[A]]
  
  inline def flatMap[A, B](f: js.Function1[/* x */ A, js.Array[B]], xs: js.Array[A]): js.Array[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(f.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Array[B]]
  
  inline def flip[A, B, C](f: js.Function2[/* a */ A, /* b */ B, C]): js.Function2[/* b */ B, /* a */ A, C] = ^.asInstanceOf[js.Dynamic].applyDynamic("flip")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* b */ B, /* a */ A, C]]
  
  inline def fold[V, A](xs: js.Array[V], seed: A, f: js.Function2[/* acc */ A, /* x */ V, A]): A = (^.asInstanceOf[js.Dynamic].applyDynamic("fold")(xs.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[A]
  
  inline def head[V](xs: js.Array[V]): V = ^.asInstanceOf[js.Dynamic].applyDynamic("head")(xs.asInstanceOf[js.Any]).asInstanceOf[V]
  
  inline def id[A](x: A): A = ^.asInstanceOf[js.Dynamic].applyDynamic("id")(x.asInstanceOf[js.Any]).asInstanceOf[A]
  
  inline def indexOf[A](xs: js.Array[A], x: A): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(xs.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def indexWhere[A](xs: js.Array[A], f: js.Function1[/* x */ A, Boolean]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexWhere")(xs.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isFunction(f: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(f.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def last[A](xs: js.Array[A]): A = ^.asInstanceOf[js.Dynamic].applyDynamic("last")(xs.asInstanceOf[js.Any]).asInstanceOf[A]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B], xs: js.Array[A]): js.Array[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Array[B]]
  
  inline def negate[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* x */ A, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("negate")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* x */ A, Boolean]]
  
  inline def remove[V](x: V, xs: js.Array[V]): js.UndefOr[js.Array[V]] = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(x.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[V]]]
  
  inline def tail[V](xs: js.Array[V]): js.Array[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("tail")(xs.asInstanceOf[js.Any]).asInstanceOf[js.Array[V]]
  
  inline def toArray[A](xs: A): js.Array[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(xs.asInstanceOf[js.Any]).asInstanceOf[js.Array[A]]
  inline def toArray[A](xs: js.Array[A]): js.Array[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(xs.asInstanceOf[js.Any]).asInstanceOf[js.Array[A]]
  
  inline def toFunction[V, V2](f: V2): js.Function1[/* x */ V, V2] = ^.asInstanceOf[js.Dynamic].applyDynamic("toFunction")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* x */ V, V2]]
  inline def toFunction[V, V2](f: js.Function1[/* x */ V, V2]): js.Function1[/* x */ V, V2] = ^.asInstanceOf[js.Dynamic].applyDynamic("toFunction")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* x */ V, V2]]
  
  inline def toString_(obj: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def without[A](x: A, xs: js.Array[A]): js.Array[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("without")(x.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Array[A]]
}
