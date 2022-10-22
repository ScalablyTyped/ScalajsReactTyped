package typingsJapgolly.fpTs.es6IndexMod

import typingsJapgolly.fpTs.libAltMod.Alt1
import typingsJapgolly.fpTs.libApplicativeMod.Applicative1
import typingsJapgolly.fpTs.libApplyMod.Apply1
import typingsJapgolly.fpTs.libChainMod.Chain1
import typingsJapgolly.fpTs.libChainRecMod.ChainRec1
import typingsJapgolly.fpTs.libComonadMod.Comonad1
import typingsJapgolly.fpTs.libEqMod.Eq
import typingsJapgolly.fpTs.libFoldableMod.Foldable1
import typingsJapgolly.fpTs.libFunctorMod.Functor1
import typingsJapgolly.fpTs.libIdentityMod.Identity_
import typingsJapgolly.fpTs.libMonadMod.Monad1
import typingsJapgolly.fpTs.libMonoidMod.Monoid
import typingsJapgolly.fpTs.libPointedMod.Pointed1
import typingsJapgolly.fpTs.libShowMod.Show
import typingsJapgolly.fpTs.libTraversableMod.PipeableTraverse1
import typingsJapgolly.fpTs.libTraversableMod.Sequence1
import typingsJapgolly.fpTs.libTraversableMod.Traversable1
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object identity {
  
  @JSImport("fp-ts/es6/index", "identity")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/es6/index", "identity.Alt")
  @js.native
  val Alt_ : Alt1[typingsJapgolly.fpTs.libIdentityMod.URI] = js.native
  
  @JSImport("fp-ts/es6/index", "identity.Applicative")
  @js.native
  val Applicative: Applicative1[typingsJapgolly.fpTs.libIdentityMod.URI] = js.native
  
  @JSImport("fp-ts/es6/index", "identity.Apply")
  @js.native
  val Apply: Apply1[typingsJapgolly.fpTs.libIdentityMod.URI] = js.native
  
  @JSImport("fp-ts/es6/index", "identity.ChainRec")
  @js.native
  val ChainRec: ChainRec1[typingsJapgolly.fpTs.libIdentityMod.URI] = js.native
  
  @JSImport("fp-ts/es6/index", "identity.Chain")
  @js.native
  val Chain_ : Chain1[typingsJapgolly.fpTs.libIdentityMod.URI] = js.native
  
  @JSImport("fp-ts/es6/index", "identity.Comonad")
  @js.native
  val Comonad: Comonad1[typingsJapgolly.fpTs.libIdentityMod.URI] = js.native
  
  @JSImport("fp-ts/es6/index", "identity.Do")
  @js.native
  val Do: Identity_[js.Object] = js.native
  
  @JSImport("fp-ts/es6/index", "identity.Foldable")
  @js.native
  val Foldable: Foldable1[typingsJapgolly.fpTs.libIdentityMod.URI] = js.native
  
  @JSImport("fp-ts/es6/index", "identity.Functor")
  @js.native
  val Functor: Functor1[typingsJapgolly.fpTs.libIdentityMod.URI] = js.native
  
  @JSImport("fp-ts/es6/index", "identity.Monad")
  @js.native
  val Monad: Monad1[typingsJapgolly.fpTs.libIdentityMod.URI] = js.native
  
  @JSImport("fp-ts/es6/index", "identity.Pointed")
  @js.native
  val Pointed: Pointed1[typingsJapgolly.fpTs.libIdentityMod.URI] = js.native
  
  @JSImport("fp-ts/es6/index", "identity.Traversable")
  @js.native
  val Traversable: Traversable1[typingsJapgolly.fpTs.libIdentityMod.URI] = js.native
  
  @JSImport("fp-ts/es6/index", "identity.URI")
  @js.native
  val URI: /* "Identity" */ String = js.native
  
  inline def alt[A](that: js.Function0[Identity_[A]]): js.Function1[/* fa */ Identity_[A], Identity_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(that.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Identity_[A], Identity_[A]]]
  
  inline def altW[B](that: js.Function0[Identity_[B]]): js.Function1[/* fa */ Identity_[Any], Identity_[Any | B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("altW")(that.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Identity_[Any], Identity_[Any | B]]]
  
  inline def ap[A](fa: Identity_[A]): js.Function1[/* fab */ Identity_[js.Function1[/* a */ A, Any]], Identity_[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ Identity_[js.Function1[/* a */ A, Any]], Identity_[Any]]]
  
  inline def apFirst[B](second: B): js.Function1[/* first */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirst")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ Any, Any]]
  
  inline def apS[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], fb: B): js.Function1[
    /* fa */ A, 
    /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apS")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ A, 
    /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
  ]]
  
  inline def apSecond[B](second: B): js.Function1[/* first */ Any, B] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecond")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ Any, B]]
  
  inline def bind[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, B]): js.Function1[
    /* ma */ A, 
    /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* ma */ A, 
    /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
  ]]
  
  inline def bindTo[N /* <: String */](name: N): js.Function1[
    /* fa */ Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N ]: any} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N ]: any} */ js.Any
  ]]
  
  inline def chain[A, B](f: js.Function1[/* a */ A, Identity_[B]]): js.Function1[/* ma */ Identity_[A], Identity_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Identity_[A], Identity_[B]]]
  
  inline def chainFirst[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* first */ A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirst")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ A, A]]
  
  inline def duplicate[A](ma: Identity_[A]): Identity_[Identity_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("duplicate")(ma.asInstanceOf[js.Any]).asInstanceOf[Identity_[Identity_[A]]]
  
  inline def extend[A, B](f: js.Function1[/* wa */ Identity_[A], B]): js.Function1[/* wa */ Identity_[A], Identity_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* wa */ Identity_[A], Identity_[B]]]
  
  inline def extract[A](wa: Identity_[A]): A = ^.asInstanceOf[js.Dynamic].applyDynamic("extract")(wa.asInstanceOf[js.Any]).asInstanceOf[A]
  
  inline def flap[A](a: A): js.Function1[/* fab */ js.Function1[/* a */ A, Any], Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ js.Function1[/* a */ A, Any], Any]]
  
  inline def flatten[A](mma: Identity_[Identity_[A]]): Identity_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(mma.asInstanceOf[js.Any]).asInstanceOf[Identity_[A]]
  
  inline def foldMap[M](M: Monoid[M]): js.Function1[/* f */ js.Function1[/* a */ Any, M], js.Function1[/* fa */ Identity_[Any], M]] = ^.asInstanceOf[js.Dynamic].applyDynamic("foldMap")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* f */ js.Function1[/* a */ Any, M], js.Function1[/* fa */ Identity_[Any], M]]]
  
  inline def getEq[A](E: Eq[A]): Eq[Identity_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEq")(E.asInstanceOf[js.Any]).asInstanceOf[Eq[Identity_[A]]]
  
  inline def getShow[A](S: Show[A]): Show[Identity_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getShow")(S.asInstanceOf[js.Any]).asInstanceOf[Show[Identity_[A]]]
  
  @JSImport("fp-ts/es6/index", "identity.identity")
  @js.native
  val identity: Monad1[typingsJapgolly.fpTs.libIdentityMod.URI] & Foldable1[typingsJapgolly.fpTs.libIdentityMod.URI] & Traversable1[typingsJapgolly.fpTs.libIdentityMod.URI] & Alt1[typingsJapgolly.fpTs.libIdentityMod.URI] & Comonad1[typingsJapgolly.fpTs.libIdentityMod.URI] & ChainRec1[typingsJapgolly.fpTs.libIdentityMod.URI] = js.native
  
  inline def let[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, B]): js.Function1[
    /* fa */ A, 
    /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("let")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ A, 
    /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
  ]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ Identity_[A], Identity_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Identity_[A], Identity_[B]]]
  
  inline def of[A](a: A): Identity_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any]).asInstanceOf[Identity_[A]]
  
  inline def reduce[A, B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): js.Function1[/* fa */ Identity_[A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ Identity_[A], B]]
  
  inline def reduceRight[A, B](b: B, f: js.Function2[/* a */ A, /* b */ B, B]): js.Function1[/* fa */ Identity_[A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ Identity_[A], B]]
  
  @JSImport("fp-ts/es6/index", "identity.sequence")
  @js.native
  val sequence: Sequence1[typingsJapgolly.fpTs.libIdentityMod.URI] = js.native
  
  @JSImport("fp-ts/es6/index", "identity.traverse")
  @js.native
  val traverse: PipeableTraverse1[typingsJapgolly.fpTs.libIdentityMod.URI] = js.native
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
}
