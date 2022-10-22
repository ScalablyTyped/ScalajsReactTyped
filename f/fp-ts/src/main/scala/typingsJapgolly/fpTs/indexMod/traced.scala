package typingsJapgolly.fpTs.indexMod

import typingsJapgolly.fpTs.libComonadMod.Comonad2C
import typingsJapgolly.fpTs.libFunctorMod.Functor2
import typingsJapgolly.fpTs.libMonoidMod.Monoid
import typingsJapgolly.fpTs.libTracedMod.Traced_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object traced {
  
  @JSImport("fp-ts/index", "traced")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/index", "traced.Functor")
  @js.native
  val Functor: Functor2[typingsJapgolly.fpTs.libTracedMod.URI] = js.native
  
  @JSImport("fp-ts/index", "traced.URI")
  @js.native
  val URI: /* "Traced" */ String = js.native
  
  inline def censor[P](f: js.Function1[/* p */ P, P]): js.Function1[/* wa */ Traced_[P, Any], Traced_[P, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("censor")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* wa */ Traced_[P, Any], Traced_[P, Any]]]
  
  inline def flap[A](a: A): js.Function1[/* fab */ Traced_[Any, js.Function1[/* a */ A, Any]], Traced_[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ Traced_[Any, js.Function1[/* a */ A, Any]], Traced_[Any, Any]]]
  
  inline def getComonad[P](monoid: Monoid[P]): Comonad2C[typingsJapgolly.fpTs.libTracedMod.URI, P] = ^.asInstanceOf[js.Dynamic].applyDynamic("getComonad")(monoid.asInstanceOf[js.Any]).asInstanceOf[Comonad2C[typingsJapgolly.fpTs.libTracedMod.URI, P]]
  
  inline def listen[P, A](wa: Traced_[P, A]): Traced_[P, js.Tuple2[A, P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listen")(wa.asInstanceOf[js.Any]).asInstanceOf[Traced_[P, js.Tuple2[A, P]]]
  
  inline def listens[P, B](f: js.Function1[/* p */ P, B]): js.Function1[/* wa */ Traced_[P, Any], Traced_[P, js.Tuple2[Any, B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listens")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* wa */ Traced_[P, Any], Traced_[P, js.Tuple2[Any, B]]]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ Traced_[Any, A], Traced_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Traced_[Any, A], Traced_[Any, B]]]
  
  @JSImport("fp-ts/index", "traced.traced")
  @js.native
  val traced: Functor2[typingsJapgolly.fpTs.libTracedMod.URI] = js.native
  
  inline def tracks[P, A](M: Monoid[P], f: js.Function1[/* a */ A, P]): js.Function1[/* wa */ Traced_[P, A], A] = (^.asInstanceOf[js.Dynamic].applyDynamic("tracks")(M.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* wa */ Traced_[P, A], A]]
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind2[E, A] extends StObject
  }
}
