package typingsJapgolly.fpTs.indexMod

import typingsJapgolly.fpTs.fpTsStrings.These
import typingsJapgolly.fpTs.libApplicativeMod.Applicative2C
import typingsJapgolly.fpTs.libApplyMod.Apply2C
import typingsJapgolly.fpTs.libBifunctorMod.Bifunctor2
import typingsJapgolly.fpTs.libChainMod.Chain2C
import typingsJapgolly.fpTs.libEqMod.Eq
import typingsJapgolly.fpTs.libFoldableMod.Foldable2
import typingsJapgolly.fpTs.libFromEitherMod.FromEither2
import typingsJapgolly.fpTs.libFromTheseMod.FromThese2
import typingsJapgolly.fpTs.libFunctionMod.Lazy
import typingsJapgolly.fpTs.libFunctorMod.Functor2
import typingsJapgolly.fpTs.libMonadMod.Monad2C
import typingsJapgolly.fpTs.libMonadThrowMod.MonadThrow2C
import typingsJapgolly.fpTs.libMonoidMod.Monoid
import typingsJapgolly.fpTs.libOptionMod.Option_
import typingsJapgolly.fpTs.libPointedMod.Pointed2
import typingsJapgolly.fpTs.libPredicateMod.Predicate
import typingsJapgolly.fpTs.libReadonlyNonEmptyArrayMod.ReadonlyNonEmptyArray_
import typingsJapgolly.fpTs.libRefinementMod.Refinement
import typingsJapgolly.fpTs.libSemigroupMod.Semigroup
import typingsJapgolly.fpTs.libShowMod.Show
import typingsJapgolly.fpTs.libTheseMod.These_
import typingsJapgolly.fpTs.libTraversableMod.PipeableTraverse2
import typingsJapgolly.fpTs.libTraversableMod.Sequence2
import typingsJapgolly.fpTs.libTraversableMod.Traversable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object these {
  
  @JSImport("fp-ts/index", "these")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/index", "these.ApT")
  @js.native
  val ApT: These_[scala.Nothing, js.Array[Any]] = js.native
  
  @JSImport("fp-ts/index", "these.Bifunctor")
  @js.native
  val Bifunctor: Bifunctor2[typingsJapgolly.fpTs.libTheseMod.URI] = js.native
  
  @JSImport("fp-ts/index", "these.Foldable")
  @js.native
  val Foldable: Foldable2[typingsJapgolly.fpTs.libTheseMod.URI] = js.native
  
  @JSImport("fp-ts/index", "these.FromEither")
  @js.native
  val FromEither: FromEither2[typingsJapgolly.fpTs.libTheseMod.URI] = js.native
  
  @JSImport("fp-ts/index", "these.FromThese")
  @js.native
  val FromThese: FromThese2[typingsJapgolly.fpTs.libTheseMod.URI] = js.native
  
  @JSImport("fp-ts/index", "these.Functor")
  @js.native
  val Functor: Functor2[typingsJapgolly.fpTs.libTheseMod.URI] = js.native
  
  @JSImport("fp-ts/index", "these.Pointed")
  @js.native
  val Pointed: Pointed2[typingsJapgolly.fpTs.libTheseMod.URI] = js.native
  
  @JSImport("fp-ts/index", "these.Traversable")
  @js.native
  val Traversable: Traversable2[typingsJapgolly.fpTs.libTheseMod.URI] = js.native
  
  @JSImport("fp-ts/index", "these.URI")
  @js.native
  val URI: /* "These" */ String = js.native
  
  inline def bimap[E, G, A, B](f: js.Function1[/* e */ E, G], g: js.Function1[/* a */ A, B]): js.Function1[/* fa */ These_[E, A], These_[G, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bimap")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ These_[E, A], These_[G, B]]]
  
  inline def both[E, A](left: E, right: A): These_[E, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("both")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[These_[E, A]]
  
  inline def elem[A](E: Eq[A]): js.Function1[/* a */ A, js.Function1[/* ma */ These_[Any, A], Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("elem")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, js.Function1[/* ma */ These_[Any, A], Boolean]]]
  
  inline def exists[A](predicate: Predicate[A]): js.Function1[/* ma */ These_[Any, A], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("exists")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ These_[Any, A], Boolean]]
  
  inline def flap[A](a: A): js.Function1[/* fab */ These_[Any, js.Function1[/* a */ A, Any]], These_[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ These_[Any, js.Function1[/* a */ A, Any]], These_[Any, Any]]]
  
  inline def fold[E, A, B](
    onLeft: js.Function1[/* e */ E, B],
    onRight: js.Function1[/* a */ A, B],
    onBoth: js.Function2[/* e */ E, /* a */ A, B]
  ): js.Function1[/* fa */ These_[E, A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("fold")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any], onBoth.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ These_[E, A], B]]
  
  inline def foldMap[M](M: Monoid[M]): js.Function1[/* f */ js.Function1[/* a */ Any, M], js.Function1[/* fa */ These_[Any, Any], M]] = ^.asInstanceOf[js.Dynamic].applyDynamic("foldMap")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* f */ js.Function1[/* a */ Any, M], js.Function1[/* fa */ These_[Any, Any], M]]]
  
  inline def foldW[E, B, A, C, D](
    onLeft: js.Function1[/* e */ E, B],
    onRight: js.Function1[/* a */ A, C],
    onBoth: js.Function2[/* e */ E, /* a */ A, D]
  ): js.Function1[/* fa */ These_[E, A], B | C | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("foldW")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any], onBoth.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ These_[E, A], B | C | D]]
  
  inline def fromOption[E](onNone: Lazy[E]): js.Function1[/* fa */ Option_[Any], These_[E, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOption")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Option_[Any], These_[E, Any]]]
  
  inline def fromOptionK[E](onNone: Lazy[E]): js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Option_[Any]], 
    js.Function1[/* a */ js.Array[Any], These_[E, Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOptionK")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Option_[Any]], 
    js.Function1[/* a */ js.Array[Any], These_[E, Any]]
  ]]
  
  inline def fromOptions[E, A](fe: Option_[E], fa: Option_[A]): Option_[These_[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromOptions")(fe.asInstanceOf[js.Any], fa.asInstanceOf[js.Any])).asInstanceOf[Option_[These_[E, A]]]
  
  inline def fromPredicate[A, E](predicate: Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* b */ A, These_[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(predicate.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* b */ A, These_[E, A]]]
  
  inline def fromPredicate_ABE[A, B /* <: A */, E](refinement: Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* a */ A, These_[E, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(refinement.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, These_[E, B]]]
  
  inline def getApplicative[E](S: Semigroup[E]): Applicative2C[typingsJapgolly.fpTs.libTheseMod.URI, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplicative")(S.asInstanceOf[js.Any]).asInstanceOf[Applicative2C[typingsJapgolly.fpTs.libTheseMod.URI, E]]
  
  inline def getApply[E](S: Semigroup[E]): Apply2C[These, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApply")(S.asInstanceOf[js.Any]).asInstanceOf[Apply2C[These, E]]
  
  inline def getChain[E](S: Semigroup[E]): Chain2C[typingsJapgolly.fpTs.libTheseMod.URI, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChain")(S.asInstanceOf[js.Any]).asInstanceOf[Chain2C[typingsJapgolly.fpTs.libTheseMod.URI, E]]
  
  inline def getEq[E, A](EE: Eq[E], EA: Eq[A]): Eq[These_[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEq")(EE.asInstanceOf[js.Any], EA.asInstanceOf[js.Any])).asInstanceOf[Eq[These_[E, A]]]
  
  inline def getLeft[E, A](fa: These_[E, A]): Option_[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLeft")(fa.asInstanceOf[js.Any]).asInstanceOf[Option_[E]]
  
  inline def getLeftOnly[E, A](fa: These_[E, A]): Option_[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLeftOnly")(fa.asInstanceOf[js.Any]).asInstanceOf[Option_[E]]
  
  inline def getMonad[E](S: Semigroup[E]): (Monad2C[typingsJapgolly.fpTs.libTheseMod.URI, E]) & (MonadThrow2C[typingsJapgolly.fpTs.libTheseMod.URI, E]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonad")(S.asInstanceOf[js.Any]).asInstanceOf[(Monad2C[typingsJapgolly.fpTs.libTheseMod.URI, E]) & (MonadThrow2C[typingsJapgolly.fpTs.libTheseMod.URI, E])]
  
  inline def getRight[E, A](fa: These_[E, A]): Option_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRight")(fa.asInstanceOf[js.Any]).asInstanceOf[Option_[A]]
  
  inline def getRightOnly[E, A](fa: These_[E, A]): Option_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRightOnly")(fa.asInstanceOf[js.Any]).asInstanceOf[Option_[A]]
  
  inline def getSemigroup[E, A](SE: Semigroup[E], SA: Semigroup[A]): Semigroup[These_[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")(SE.asInstanceOf[js.Any], SA.asInstanceOf[js.Any])).asInstanceOf[Semigroup[These_[E, A]]]
  
  inline def getShow[E, A](SE: Show[E], SA: Show[A]): Show[These_[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getShow")(SE.asInstanceOf[js.Any], SA.asInstanceOf[js.Any])).asInstanceOf[Show[These_[E, A]]]
  
  inline def isBoth[E, A](fa: These_[E, A]): /* is fp-ts.fp-ts/lib/These.Both<E, A> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoth")(fa.asInstanceOf[js.Any]).asInstanceOf[/* is fp-ts.fp-ts/lib/These.Both<E, A> */ Boolean]
  
  inline def isLeft[E](fa: These_[E, Any]): /* is fp-ts.fp-ts/lib/Either.Left<E> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeft")(fa.asInstanceOf[js.Any]).asInstanceOf[/* is fp-ts.fp-ts/lib/Either.Left<E> */ Boolean]
  
  inline def isRight[A](fa: These_[Any, A]): /* is fp-ts.fp-ts/lib/Either.Right<A> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRight")(fa.asInstanceOf[js.Any]).asInstanceOf[/* is fp-ts.fp-ts/lib/Either.Right<A> */ Boolean]
  
  inline def left[E, A](left: E): These_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(left.asInstanceOf[js.Any]).asInstanceOf[These_[E, A]]
  
  inline def leftOrBoth[E](e: E): js.Function1[/* ma */ Option_[Any], These_[E, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftOrBoth")(e.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Option_[Any], These_[E, Any]]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ These_[Any, A], These_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ These_[Any, A], These_[Any, B]]]
  
  inline def mapLeft[E, G](f: js.Function1[/* e */ E, G]): js.Function1[/* fa */ These_[E, Any], These_[G, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeft")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ These_[E, Any], These_[G, Any]]]
  
  inline def `match`[E, A, B](
    onLeft: js.Function1[/* e */ E, B],
    onRight: js.Function1[/* a */ A, B],
    onBoth: js.Function2[/* e */ E, /* a */ A, B]
  ): js.Function1[/* fa */ These_[E, A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any], onBoth.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ These_[E, A], B]]
  
  inline def matchW[E, B, A, C, D](
    onLeft: js.Function1[/* e */ E, B],
    onRight: js.Function1[/* a */ A, C],
    onBoth: js.Function2[/* e */ E, /* a */ A, D]
  ): js.Function1[/* fa */ These_[E, A], B | C | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchW")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any], onBoth.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ These_[E, A], B | C | D]]
  
  inline def of[E, A](right: A): These_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(right.asInstanceOf[js.Any]).asInstanceOf[These_[E, A]]
  
  inline def reduce[A, B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): js.Function1[/* fa */ These_[Any, A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ These_[Any, A], B]]
  
  inline def reduceRight[A, B](b: B, f: js.Function2[/* a */ A, /* b */ B, B]): js.Function1[/* fa */ These_[Any, A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ These_[Any, A], B]]
  
  inline def right[E, A](right: A): These_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(right.asInstanceOf[js.Any]).asInstanceOf[These_[E, A]]
  
  inline def rightOrBoth[A](a: A): js.Function1[/* me */ Option_[Any], These_[Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightOrBoth")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* me */ Option_[Any], These_[Any, A]]]
  
  @JSImport("fp-ts/index", "these.sequence")
  @js.native
  val sequence: Sequence2[typingsJapgolly.fpTs.libTheseMod.URI] = js.native
  
  inline def swap[E, A](fa: These_[E, A]): These_[A, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("swap")(fa.asInstanceOf[js.Any]).asInstanceOf[These_[A, E]]
  
  @JSImport("fp-ts/index", "these.these")
  @js.native
  val these: Functor2[typingsJapgolly.fpTs.libTheseMod.URI] & Bifunctor2[typingsJapgolly.fpTs.libTheseMod.URI] & Foldable2[typingsJapgolly.fpTs.libTheseMod.URI] & Traversable2[typingsJapgolly.fpTs.libTheseMod.URI] = js.native
  
  inline def toTuple[E, A](e: E, a: A): js.Function1[/* fa */ These_[E, A], js.Tuple2[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toTuple")(e.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ These_[E, A], js.Tuple2[E, A]]]
  
  inline def toTuple2[E, A](e: Lazy[E], a: Lazy[A]): js.Function1[/* fa */ These_[E, A], js.Tuple2[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toTuple2")(e.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ These_[E, A], js.Tuple2[E, A]]]
  
  @JSImport("fp-ts/index", "these.traverse")
  @js.native
  val traverse: PipeableTraverse2[typingsJapgolly.fpTs.libTheseMod.URI] = js.native
  
  inline def traverseReadonlyArrayWithIndex[E](S: Semigroup[E]): js.Function1[
    /* f */ js.Function2[/* index */ Double, /* a */ Any, These_[E, Any]], 
    js.Function1[/* as */ js.Array[Any], These_[E, js.Array[Any]]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyArrayWithIndex")(S.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function2[/* index */ Double, /* a */ Any, These_[E, Any]], 
    js.Function1[/* as */ js.Array[Any], These_[E, js.Array[Any]]]
  ]]
  
  inline def traverseReadonlyNonEmptyArrayWithIndex[E](S: Semigroup[E]): js.Function1[
    /* f */ js.Function2[/* index */ Double, /* a */ Any, These_[E, Any]], 
    js.Function1[/* as */ ReadonlyNonEmptyArray_[Any], These_[E, ReadonlyNonEmptyArray_[Any]]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyNonEmptyArrayWithIndex")(S.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function2[/* index */ Double, /* a */ Any, These_[E, Any]], 
    js.Function1[/* as */ ReadonlyNonEmptyArray_[Any], These_[E, ReadonlyNonEmptyArray_[Any]]]
  ]]
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind2[E, A] extends StObject
  }
}
