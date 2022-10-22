package typingsJapgolly.zenObservable

import typingsJapgolly.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmMod {
  
  @JSImport("zen-observable/esm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("zen-observable/esm", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends typingsJapgolly.zenObservable.mod.^[T] {
    def this(subscriber: typingsJapgolly.zenObservable.mod.global.ZenObservable.Subscriber[T]) = this()
  }
  object default {
    
    @JSImport("zen-observable/esm", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def from[R](observable: ArrayLike[R]): typingsJapgolly.zenObservable.mod.Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(observable.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.zenObservable.mod.Observable[R]]
    /* static member */
    inline def from[R](observable: typingsJapgolly.zenObservable.mod.Observable[R]): typingsJapgolly.zenObservable.mod.Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(observable.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.zenObservable.mod.Observable[R]]
    inline def from[R](observable: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[R]): typingsJapgolly.zenObservable.mod.Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(observable.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.zenObservable.mod.Observable[R]]
    
    /* static member */
    inline def of[R](items: R*): typingsJapgolly.zenObservable.mod.Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.zenObservable.mod.Observable[R]]
  }
  
  @JSImport("zen-observable/esm", "Observable")
  @js.native
  open class Observable[T] protected ()
    extends typingsJapgolly.zenObservable.mod.^[T] {
    def this(subscriber: typingsJapgolly.zenObservable.mod.global.ZenObservable.Subscriber[T]) = this()
  }
  object Observable {
    
    @JSImport("zen-observable/esm", "Observable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from[R](observable: ArrayLike[R]): typingsJapgolly.zenObservable.mod.Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(observable.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.zenObservable.mod.Observable[R]]
    /* static member */
    inline def from[R](observable: typingsJapgolly.zenObservable.mod.Observable[R]): typingsJapgolly.zenObservable.mod.Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(observable.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.zenObservable.mod.Observable[R]]
    inline def from[R](observable: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[R]): typingsJapgolly.zenObservable.mod.Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(observable.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.zenObservable.mod.Observable[R]]
    
    /* static member */
    inline def of[R](items: R*): typingsJapgolly.zenObservable.mod.Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.zenObservable.mod.Observable[R]]
  }
  
  inline def combineLatest(): typingsJapgolly.zenObservable.mod.^[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")().asInstanceOf[typingsJapgolly.zenObservable.mod.^[scala.Nothing]]
  inline def combineLatest[A](a: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[A]): typingsJapgolly.zenObservable.mod.^[js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(a.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.zenObservable.mod.^[js.Array[A]]]
  inline def combineLatest[T](observables: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[T]*): typingsJapgolly.zenObservable.mod.^[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(observables.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.zenObservable.mod.^[js.Array[T]]]
  inline def combineLatest[A, B](
    a: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[B]
  ): typingsJapgolly.zenObservable.mod.^[js.Tuple2[A, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.zenObservable.mod.^[js.Tuple2[A, B]]]
  inline def combineLatest[A, B, C](
    a: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[C]
  ): typingsJapgolly.zenObservable.mod.^[js.Tuple3[A, B, C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.zenObservable.mod.^[js.Tuple3[A, B, C]]]
  inline def combineLatest[A, B, C, D](
    a: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[D]
  ): typingsJapgolly.zenObservable.mod.^[js.Tuple4[A, B, C, D]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.zenObservable.mod.^[js.Tuple4[A, B, C, D]]]
  inline def combineLatest[A, B, C, D, E](
    a: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[D],
    e: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[E]
  ): typingsJapgolly.zenObservable.mod.^[js.Tuple5[A, B, C, D, E]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.zenObservable.mod.^[js.Tuple5[A, B, C, D, E]]]
  inline def combineLatest[A, B, C, D, E, F](
    a: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[D],
    e: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[E],
    f: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[F]
  ): typingsJapgolly.zenObservable.mod.^[js.Tuple6[A, B, C, D, E, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.zenObservable.mod.^[js.Tuple6[A, B, C, D, E, F]]]
  
  inline def merge(): typingsJapgolly.zenObservable.mod.^[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")().asInstanceOf[typingsJapgolly.zenObservable.mod.^[scala.Nothing]]
  inline def merge[A](a: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[A]): typingsJapgolly.zenObservable.mod.^[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(a.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.zenObservable.mod.^[A]]
  inline def merge[T](observables: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[T]*): typingsJapgolly.zenObservable.mod.^[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(observables.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.zenObservable.mod.^[T]]
  inline def merge[A, B](
    a: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[B]
  ): typingsJapgolly.zenObservable.mod.^[A | B] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.zenObservable.mod.^[A | B]]
  inline def merge[A, B, C](
    a: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[C]
  ): typingsJapgolly.zenObservable.mod.^[A | B | C] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.zenObservable.mod.^[A | B | C]]
  inline def merge[A, B, C, D](
    a: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[D]
  ): typingsJapgolly.zenObservable.mod.^[A | B | C | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.zenObservable.mod.^[A | B | C | D]]
  inline def merge[A, B, C, D, E](
    a: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[D],
    e: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[E]
  ): typingsJapgolly.zenObservable.mod.^[A | B | C | D | E] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.zenObservable.mod.^[A | B | C | D | E]]
  inline def merge[A, B, C, D, E, F](
    a: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[D],
    e: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[E],
    f: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[F]
  ): typingsJapgolly.zenObservable.mod.^[A | B | C | D | E | F] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.zenObservable.mod.^[A | B | C | D | E | F]]
  
  inline def zip(): typingsJapgolly.zenObservable.mod.^[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")().asInstanceOf[typingsJapgolly.zenObservable.mod.^[scala.Nothing]]
  inline def zip[A](a: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[A]): typingsJapgolly.zenObservable.mod.^[js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(a.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.zenObservable.mod.^[js.Array[A]]]
  inline def zip[T](observables: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[T]*): typingsJapgolly.zenObservable.mod.^[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(observables.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.zenObservable.mod.^[js.Array[T]]]
  inline def zip[A, B](
    a: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[B]
  ): typingsJapgolly.zenObservable.mod.^[js.Tuple2[A, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.zenObservable.mod.^[js.Tuple2[A, B]]]
  inline def zip[A, B, C](
    a: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[C]
  ): typingsJapgolly.zenObservable.mod.^[js.Tuple3[A, B, C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.zenObservable.mod.^[js.Tuple3[A, B, C]]]
  inline def zip[A, B, C, D](
    a: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[D]
  ): typingsJapgolly.zenObservable.mod.^[js.Tuple4[A, B, C, D]] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.zenObservable.mod.^[js.Tuple4[A, B, C, D]]]
  inline def zip[A, B, C, D, E](
    a: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[D],
    e: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[E]
  ): typingsJapgolly.zenObservable.mod.^[js.Tuple5[A, B, C, D, E]] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.zenObservable.mod.^[js.Tuple5[A, B, C, D, E]]]
  inline def zip[A, B, C, D, E, F](
    a: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[D],
    e: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[E],
    f: typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[F]
  ): typingsJapgolly.zenObservable.mod.^[js.Tuple6[A, B, C, D, E, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.zenObservable.mod.^[js.Tuple6[A, B, C, D, E, F]]]
  
  type ObservableLike[T] = typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike[T]
  
  type Observer[T] = typingsJapgolly.zenObservable.mod.global.ZenObservable.Observer[T]
  
  type Subscriber[T] = typingsJapgolly.zenObservable.mod.global.ZenObservable.Subscriber[T]
  
  type Subscription = typingsJapgolly.zenObservable.mod.global.ZenObservable.Subscription
  
  type SubscriptionObserver[T] = typingsJapgolly.zenObservable.mod.global.ZenObservable.SubscriptionObserver[T]
}
