package typingsJapgolly.fpTs.libIndexMod

import typingsJapgolly.fpTs.libApplicativeMod.Applicative2C
import typingsJapgolly.fpTs.libApplyMod.Apply2C
import typingsJapgolly.fpTs.libBifunctorMod.Bifunctor2
import typingsJapgolly.fpTs.libBooleanAlgebraMod.BooleanAlgebra
import typingsJapgolly.fpTs.libBoundedMod.Bounded
import typingsJapgolly.fpTs.libConstMod.Const_
import typingsJapgolly.fpTs.libContravariantMod.Contravariant2
import typingsJapgolly.fpTs.libEqMod.Eq
import typingsJapgolly.fpTs.libFunctorMod.Functor2
import typingsJapgolly.fpTs.libHeytingAlgebraMod.HeytingAlgebra
import typingsJapgolly.fpTs.libMonoidMod.Monoid
import typingsJapgolly.fpTs.libOrdMod.Ord_
import typingsJapgolly.fpTs.libRingMod.Ring
import typingsJapgolly.fpTs.libSemigroupMod.Semigroup
import typingsJapgolly.fpTs.libSemiringMod.Semiring
import typingsJapgolly.fpTs.libShowMod.Show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object const {
  
  @JSImport("fp-ts/lib/index", "const")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/index", "const.Bifunctor")
  @js.native
  val Bifunctor: Bifunctor2[typingsJapgolly.fpTs.libConstMod.URI] = js.native
  
  @JSImport("fp-ts/lib/index", "const.Contravariant")
  @js.native
  val Contravariant: Contravariant2[typingsJapgolly.fpTs.libConstMod.URI] = js.native
  
  @JSImport("fp-ts/lib/index", "const.Functor")
  @js.native
  val Functor: Functor2[typingsJapgolly.fpTs.libConstMod.URI] = js.native
  
  @JSImport("fp-ts/lib/index", "const.URI")
  @js.native
  val URI: /* "Const" */ String = js.native
  
  inline def bimap[E, G, A, B](f: js.Function1[/* e */ E, G], g: js.Function1[/* a */ A, B]): js.Function1[/* fa */ Const_[E, A], Const_[G, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bimap")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ Const_[E, A], Const_[G, B]]]
  
  @JSImport("fp-ts/lib/index", "const.const_")
  @js.native
  val const: Functor2[typingsJapgolly.fpTs.libConstMod.URI] & Contravariant2[typingsJapgolly.fpTs.libConstMod.URI] & Bifunctor2[typingsJapgolly.fpTs.libConstMod.URI] = js.native
  
  inline def contramap[A, B](f: js.Function1[/* b */ B, A]): js.Function1[/* fa */ Const_[Any, A], Const_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("contramap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Const_[Any, A], Const_[Any, B]]]
  
  inline def flap[A](a: A): js.Function1[/* fab */ Const_[Any, js.Function1[/* a */ A, Any]], Const_[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ Const_[Any, js.Function1[/* a */ A, Any]], Const_[Any, Any]]]
  
  inline def getApplicative[E](M: Monoid[E]): Applicative2C[typingsJapgolly.fpTs.libConstMod.URI, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplicative")(M.asInstanceOf[js.Any]).asInstanceOf[Applicative2C[typingsJapgolly.fpTs.libConstMod.URI, E]]
  
  inline def getApply[E](S: Semigroup[E]): Apply2C[typingsJapgolly.fpTs.libConstMod.URI, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApply")(S.asInstanceOf[js.Any]).asInstanceOf[Apply2C[typingsJapgolly.fpTs.libConstMod.URI, E]]
  
  inline def getBooleanAlgebra[E, A](H: BooleanAlgebra[E]): BooleanAlgebra[Const_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBooleanAlgebra")(H.asInstanceOf[js.Any]).asInstanceOf[BooleanAlgebra[Const_[E, A]]]
  
  inline def getBounded[E, A](B: Bounded[E]): Bounded[Const_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBounded")(B.asInstanceOf[js.Any]).asInstanceOf[Bounded[Const_[E, A]]]
  
  inline def getEq[E, A](E: Eq[E]): Eq[Const_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEq")(E.asInstanceOf[js.Any]).asInstanceOf[Eq[Const_[E, A]]]
  
  inline def getHeytingAlgebra[E, A](H: HeytingAlgebra[E]): HeytingAlgebra[Const_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeytingAlgebra")(H.asInstanceOf[js.Any]).asInstanceOf[HeytingAlgebra[Const_[E, A]]]
  
  inline def getMonoid[E, A](M: Monoid[E]): Monoid[Const_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonoid")(M.asInstanceOf[js.Any]).asInstanceOf[Monoid[Const_[E, A]]]
  
  inline def getOrd[E, A](O: Ord_[E]): Ord_[Const_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrd")(O.asInstanceOf[js.Any]).asInstanceOf[Ord_[Const_[E, A]]]
  
  inline def getRing[E, A](S: Ring[E]): Ring[Const_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRing")(S.asInstanceOf[js.Any]).asInstanceOf[Ring[Const_[E, A]]]
  
  inline def getSemigroup[E, A](S: Semigroup[E]): Semigroup[Const_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")(S.asInstanceOf[js.Any]).asInstanceOf[Semigroup[Const_[E, A]]]
  
  inline def getSemiring[E, A](S: Semiring[E]): Semiring[Const_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemiring")(S.asInstanceOf[js.Any]).asInstanceOf[Semiring[Const_[E, A]]]
  
  inline def getShow[E, A](S: Show[E]): Show[Const_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getShow")(S.asInstanceOf[js.Any]).asInstanceOf[Show[Const_[E, A]]]
  
  inline def make[E, A](e: E): Const_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("make")(e.asInstanceOf[js.Any]).asInstanceOf[Const_[E, A]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ Const_[Any, A], Const_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Const_[Any, A], Const_[Any, B]]]
  
  inline def mapLeft[E, G](f: js.Function1[/* e */ E, G]): js.Function1[/* fa */ Const_[E, Any], Const_[G, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeft")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Const_[E, Any], Const_[G, Any]]]
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind2[E, A] extends StObject
  }
}
