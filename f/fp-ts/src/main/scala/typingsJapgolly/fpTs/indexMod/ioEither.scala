package typingsJapgolly.fpTs.indexMod

import typingsJapgolly.fpTs.fpTsStrings.IOEither
import typingsJapgolly.fpTs.libAltMod.Alt2
import typingsJapgolly.fpTs.libAltMod.Alt2C
import typingsJapgolly.fpTs.libApplicativeMod.Applicative2
import typingsJapgolly.fpTs.libApplicativeMod.Applicative2C
import typingsJapgolly.fpTs.libApplyMod.Apply2
import typingsJapgolly.fpTs.libBifunctorMod.Bifunctor2
import typingsJapgolly.fpTs.libChainMod.Chain2
import typingsJapgolly.fpTs.libCompactableMod.Compactable2C
import typingsJapgolly.fpTs.libEitherMod.Either_
import typingsJapgolly.fpTs.libFilterableMod.Filterable2C
import typingsJapgolly.fpTs.libFromEitherMod.FromEither2
import typingsJapgolly.fpTs.libFromIOMod.FromIO2
import typingsJapgolly.fpTs.libFunctionMod.Lazy
import typingsJapgolly.fpTs.libFunctorMod.Functor2
import typingsJapgolly.fpTs.libIOMod.IO_
import typingsJapgolly.fpTs.libIoeitherMod.IOEither_
import typingsJapgolly.fpTs.libMonadIOMod.MonadIO2
import typingsJapgolly.fpTs.libMonadIOMod.MonadIO2C
import typingsJapgolly.fpTs.libMonadMod.Monad2
import typingsJapgolly.fpTs.libMonadMod.Monad2C
import typingsJapgolly.fpTs.libMonadThrowMod.MonadThrow2
import typingsJapgolly.fpTs.libMonadThrowMod.MonadThrow2C
import typingsJapgolly.fpTs.libMonoidMod.Monoid
import typingsJapgolly.fpTs.libOptionMod.Option_
import typingsJapgolly.fpTs.libPointedMod.Pointed2
import typingsJapgolly.fpTs.libPredicateMod.Predicate
import typingsJapgolly.fpTs.libReadonlyNonEmptyArrayMod.ReadonlyNonEmptyArray_
import typingsJapgolly.fpTs.libRefinementMod.Refinement
import typingsJapgolly.fpTs.libSemigroupMod.Semigroup
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ioEither {
  
  @JSImport("fp-ts/index", "ioEither")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/index", "ioEither.Alt")
  @js.native
  val Alt_ : Alt2[typingsJapgolly.fpTs.libIoeitherMod.URI] = js.native
  
  @JSImport("fp-ts/index", "ioEither.ApT")
  @js.native
  val ApT: IOEither_[scala.Nothing, js.Array[Any]] = js.native
  
  @JSImport("fp-ts/index", "ioEither.Applicative")
  @js.native
  val Applicative: Applicative2[typingsJapgolly.fpTs.libIoeitherMod.URI] = js.native
  
  @JSImport("fp-ts/index", "ioEither.ApplicativePar")
  @js.native
  val ApplicativePar: Applicative2[typingsJapgolly.fpTs.libIoeitherMod.URI] = js.native
  
  @JSImport("fp-ts/index", "ioEither.ApplicativeSeq")
  @js.native
  val ApplicativeSeq: Applicative2[typingsJapgolly.fpTs.libIoeitherMod.URI] = js.native
  
  @JSImport("fp-ts/index", "ioEither.ApplyPar")
  @js.native
  val ApplyPar: Apply2[typingsJapgolly.fpTs.libIoeitherMod.URI] = js.native
  
  @JSImport("fp-ts/index", "ioEither.Bifunctor")
  @js.native
  val Bifunctor: Bifunctor2[typingsJapgolly.fpTs.libIoeitherMod.URI] = js.native
  
  @JSImport("fp-ts/index", "ioEither.Chain")
  @js.native
  val Chain_ : Chain2[typingsJapgolly.fpTs.libIoeitherMod.URI] = js.native
  
  @JSImport("fp-ts/index", "ioEither.Do")
  @js.native
  val Do: IOEither_[scala.Nothing, js.Object] = js.native
  
  @JSImport("fp-ts/index", "ioEither.FromEither")
  @js.native
  val FromEither_ : FromEither2[typingsJapgolly.fpTs.libIoeitherMod.URI] = js.native
  
  @JSImport("fp-ts/index", "ioEither.FromIO")
  @js.native
  val FromIO_ : FromIO2[typingsJapgolly.fpTs.libIoeitherMod.URI] = js.native
  
  @JSImport("fp-ts/index", "ioEither.Functor")
  @js.native
  val Functor: Functor2[typingsJapgolly.fpTs.libIoeitherMod.URI] = js.native
  
  @JSImport("fp-ts/index", "ioEither.Monad")
  @js.native
  val Monad: Monad2[typingsJapgolly.fpTs.libIoeitherMod.URI] = js.native
  
  @JSImport("fp-ts/index", "ioEither.MonadIO")
  @js.native
  val MonadIO: MonadIO2[typingsJapgolly.fpTs.libIoeitherMod.URI] = js.native
  
  @JSImport("fp-ts/index", "ioEither.MonadThrow")
  @js.native
  val MonadThrow: MonadThrow2[typingsJapgolly.fpTs.libIoeitherMod.URI] = js.native
  
  @JSImport("fp-ts/index", "ioEither.Pointed")
  @js.native
  val Pointed: Pointed2[typingsJapgolly.fpTs.libIoeitherMod.URI] = js.native
  
  @JSImport("fp-ts/index", "ioEither.URI")
  @js.native
  val URI: /* "IOEither" */ String = js.native
  
  inline def alt[E, A](that: Lazy[IOEither_[E, A]]): js.Function1[/* fa */ IOEither_[E, A], IOEither_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(that.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ IOEither_[E, A], IOEither_[E, A]]]
  
  inline def altW[E2, B](that: Lazy[IOEither_[E2, B]]): js.Function1[/* fa */ IOEither_[Any, Any], IOEither_[E2, Any | B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("altW")(that.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ IOEither_[Any, Any], IOEither_[E2, Any | B]]]
  
  inline def ap[E, A](fa: IOEither_[E, A]): js.Function1[/* fab */ IOEither_[E, js.Function1[/* a */ A, Any]], IOEither_[E, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ IOEither_[E, js.Function1[/* a */ A, Any]], IOEither_[E, Any]]]
  
  inline def apFirst[E, B](second: IOEither_[E, B]): js.Function1[/* first */ IOEither_[E, Any], IOEither_[E, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirst")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ IOEither_[E, Any], IOEither_[E, Any]]]
  
  inline def apFirstW[E2, B](second: IOEither_[E2, B]): js.Function1[/* first */ IOEither_[Any, Any], IOEither_[Any | E2, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirstW")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ IOEither_[Any, Any], IOEither_[Any | E2, Any]]]
  
  inline def apS[N /* <: String */, A, E, B](name: Exclude[N, /* keyof A */ String], fb: IOEither_[E, B]): js.Function1[
    /* fa */ IOEither_[E, A], 
    IOEither_[
      E, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apS")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ IOEither_[E, A], 
    IOEither_[
      E, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def apSW[A, N /* <: String */, E2, B](name: Exclude[N, /* keyof A */ String], fb: IOEither_[E2, B]): js.Function1[
    /* fa */ IOEither_[Any, A], 
    IOEither_[
      Any | E2, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apSW")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ IOEither_[Any, A], 
    IOEither_[
      Any | E2, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def apSecond[E, B](second: IOEither_[E, B]): js.Function1[/* first */ IOEither_[E, Any], IOEither_[E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecond")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ IOEither_[E, Any], IOEither_[E, B]]]
  
  inline def apSecondW[E2, B](second: IOEither_[E2, B]): js.Function1[/* first */ IOEither_[Any, Any], IOEither_[Any | E2, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecondW")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ IOEither_[Any, Any], IOEither_[Any | E2, B]]]
  
  inline def apW[E2, A](fa: IOEither_[E2, A]): js.Function1[/* fab */ IOEither_[Any, js.Function1[/* a */ A, Any]], IOEither_[Any | E2, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apW")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ IOEither_[Any, js.Function1[/* a */ A, Any]], IOEither_[Any | E2, Any]]]
  
  inline def bimap[E, G, A, B](f: js.Function1[/* e */ E, G], g: js.Function1[/* a */ A, B]): js.Function1[/* fa */ IOEither_[E, A], IOEither_[G, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bimap")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ IOEither_[E, A], IOEither_[G, B]]]
  
  inline def bind[N /* <: String */, A, E, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, IOEither_[E, B]]): js.Function1[
    /* ma */ IOEither_[E, A], 
    IOEither_[
      E, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* ma */ IOEither_[E, A], 
    IOEither_[
      E, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def bindTo[N /* <: String */](name: N): js.Function1[
    /* fa */ IOEither_[Any, Any], 
    IOEither_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N ]: any} */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ IOEither_[Any, Any], 
    IOEither_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N ]: any} */ js.Any
    ]
  ]]
  
  inline def bindW[N /* <: String */, A, E2, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, IOEither_[E2, B]]): js.Function1[
    /* fa */ IOEither_[Any, A], 
    IOEither_[
      Any | E2, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindW")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ IOEither_[Any, A], 
    IOEither_[
      Any | E2, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def bracket[E, A, B](
    acquire: IOEither_[E, A],
    use: js.Function1[/* a */ A, IOEither_[E, B]],
    release: js.Function2[/* a */ A, /* e */ Either_[E, B], IOEither_[E, Unit]]
  ): IOEither_[E, B] = (^.asInstanceOf[js.Dynamic].applyDynamic("bracket")(acquire.asInstanceOf[js.Any], use.asInstanceOf[js.Any], release.asInstanceOf[js.Any])).asInstanceOf[IOEither_[E, B]]
  
  inline def bracketW[E1, A, E2, B, E3](
    acquire: IOEither_[E1, A],
    use: js.Function1[/* a */ A, IOEither_[E2, B]],
    release: js.Function2[/* a */ A, /* e */ Either_[E2, B], IOEither_[E3, Unit]]
  ): IOEither_[E1 | E2 | E3, B] = (^.asInstanceOf[js.Dynamic].applyDynamic("bracketW")(acquire.asInstanceOf[js.Any], use.asInstanceOf[js.Any], release.asInstanceOf[js.Any])).asInstanceOf[IOEither_[E1 | E2 | E3, B]]
  
  inline def chain[E, A, B](f: js.Function1[/* a */ A, IOEither_[E, B]]): js.Function1[/* ma */ IOEither_[E, A], IOEither_[E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ IOEither_[E, A], IOEither_[E, B]]]
  
  inline def chainEitherK[E, A, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[/* ma */ IOEither_[E, A], IOEither_[E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ IOEither_[E, A], IOEither_[E, B]]]
  
  inline def chainEitherKW[E2, A, B](f: js.Function1[/* a */ A, Either_[E2, B]]): js.Function1[/* ma */ IOEither_[Any, A], IOEither_[Any | E2, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainEitherKW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ IOEither_[Any, A], IOEither_[Any | E2, B]]]
  
  inline def chainFirst[E, A, B](f: js.Function1[/* a */ A, IOEither_[E, B]]): js.Function1[/* ma */ IOEither_[E, A], IOEither_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirst")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ IOEither_[E, A], IOEither_[E, A]]]
  
  inline def chainFirstEitherK[A, E, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[/* ma */ IOEither_[E, A], IOEither_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ IOEither_[E, A], IOEither_[E, A]]]
  
  inline def chainFirstEitherKW[A, E2, B](f: js.Function1[/* a */ A, Either_[E2, B]]): js.Function1[/* ma */ IOEither_[Any, A], IOEither_[Any | E2, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstEitherKW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ IOEither_[Any, A], IOEither_[Any | E2, A]]]
  
  inline def chainFirstIOK[A, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* first */ IOEither_[Any, A], IOEither_[Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstIOK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ IOEither_[Any, A], IOEither_[Any, A]]]
  
  inline def chainFirstW[E2, A, B](f: js.Function1[/* a */ A, IOEither_[E2, B]]): js.Function1[/* ma */ IOEither_[Any, A], IOEither_[Any | E2, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ IOEither_[Any, A], IOEither_[Any | E2, A]]]
  
  inline def chainIOK[A, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* first */ IOEither_[Any, A], IOEither_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainIOK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ IOEither_[Any, A], IOEither_[Any, B]]]
  
  inline def chainOptionK[E](onNone: Lazy[E]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[Any]], 
    js.Function1[/* ma */ IOEither_[E, Any], IOEither_[E, Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainOptionK")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[Any]], 
    js.Function1[/* ma */ IOEither_[E, Any], IOEither_[E, Any]]
  ]]
  
  inline def chainW[E2, A, B](f: js.Function1[/* a */ A, IOEither_[E2, B]]): js.Function1[/* ma */ IOEither_[Any, A], IOEither_[Any | E2, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ IOEither_[Any, A], IOEither_[Any | E2, B]]]
  
  inline def filterOrElse[E, A](predicate: Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* mb */ IOEither_[E, A], IOEither_[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOrElse")(predicate.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* mb */ IOEither_[E, A], IOEither_[E, A]]]
  
  inline def filterOrElseW[A, E2](predicate: Predicate[A], onFalse: js.Function1[/* a */ A, E2]): js.Function1[/* mb */ IOEither_[Any, A], IOEither_[Any | E2, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOrElseW")(predicate.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* mb */ IOEither_[Any, A], IOEither_[Any | E2, A]]]
  
  inline def filterOrElseW_ABE2[A, B /* <: A */, E2](refinement: Refinement[A, B], onFalse: js.Function1[/* a */ A, E2]): js.Function1[/* ma */ IOEither_[Any, A], IOEither_[Any | E2, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOrElseW")(refinement.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ IOEither_[Any, A], IOEither_[Any | E2, B]]]
  
  inline def filterOrElse_EAB[E, A, B /* <: A */](refinement: Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* ma */ IOEither_[E, A], IOEither_[E, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOrElse")(refinement.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ IOEither_[E, A], IOEither_[E, B]]]
  
  inline def flap[A](a: A): js.Function1[/* fab */ IOEither_[Any, js.Function1[/* a */ A, Any]], IOEither_[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ IOEither_[Any, js.Function1[/* a */ A, Any]], IOEither_[Any, Any]]]
  
  inline def flatten[E, A](mma: IOEither_[E, IOEither_[E, A]]): IOEither_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(mma.asInstanceOf[js.Any]).asInstanceOf[IOEither_[E, A]]
  
  inline def flattenW[E1, E2, A](mma: IOEither_[E1, IOEither_[E2, A]]): IOEither_[E1 | E2, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenW")(mma.asInstanceOf[js.Any]).asInstanceOf[IOEither_[E1 | E2, A]]
  
  inline def fold[E, A, B](onLeft: js.Function1[/* e */ E, IO_[B]], onRight: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* ma */ IOEither_[E, A], IO_[B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fold")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ IOEither_[E, A], IO_[B]]]
  
  inline def foldW[E, B, A, C](onLeft: js.Function1[/* e */ E, IO_[B]], onRight: js.Function1[/* a */ A, IO_[C]]): js.Function1[/* ma */ IOEither_[E, A], IO_[B | C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("foldW")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ IOEither_[E, A], IO_[B | C]]]
  
  inline def fromEither[E, A](fa: Either_[E, A]): IOEither_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEither")(fa.asInstanceOf[js.Any]).asInstanceOf[IOEither_[E, A]]
  
  inline def fromEitherK[E, A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[/* a */ A, IOEither_[E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, IOEither_[E, B]]]
  
  inline def fromIO[A, E](fa: IO_[A]): IOEither_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIO")(fa.asInstanceOf[js.Any]).asInstanceOf[IOEither_[E, A]]
  
  inline def fromIOK[A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* a */ A, IOEither_[scala.Nothing, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIOK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, IOEither_[scala.Nothing, B]]]
  
  inline def fromOption[E](onNone: Lazy[E]): js.Function1[/* fa */ Option_[Any], IOEither_[E, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOption")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Option_[Any], IOEither_[E, Any]]]
  
  inline def fromOptionK[E](onNone: Lazy[E]): js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Option_[Any]], 
    js.Function1[/* a */ js.Array[Any], IOEither_[E, Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOptionK")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Option_[Any]], 
    js.Function1[/* a */ js.Array[Any], IOEither_[E, Any]]
  ]]
  
  inline def fromPredicate[E, A](predicate: Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* b */ A, IOEither_[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(predicate.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* b */ A, IOEither_[E, A]]]
  
  inline def fromPredicate_EAB[E, A, B /* <: A */](refinement: Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* a */ A, IOEither_[E, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(refinement.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, IOEither_[E, B]]]
  
  inline def getAltIOValidation[E](S: Semigroup[E]): Alt2C[typingsJapgolly.fpTs.libIoeitherMod.URI, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAltIOValidation")(S.asInstanceOf[js.Any]).asInstanceOf[Alt2C[typingsJapgolly.fpTs.libIoeitherMod.URI, E]]
  
  inline def getApplicativeIOValidation[E](S: Semigroup[E]): Applicative2C[typingsJapgolly.fpTs.libIoeitherMod.URI, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplicativeIOValidation")(S.asInstanceOf[js.Any]).asInstanceOf[Applicative2C[typingsJapgolly.fpTs.libIoeitherMod.URI, E]]
  
  inline def getApplyMonoid[E, A](M: Monoid[A]): Monoid[IOEither_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplyMonoid")(M.asInstanceOf[js.Any]).asInstanceOf[Monoid[IOEither_[E, A]]]
  
  inline def getApplySemigroup[E, A](S: Semigroup[A]): Semigroup[IOEither_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplySemigroup")(S.asInstanceOf[js.Any]).asInstanceOf[Semigroup[IOEither_[E, A]]]
  
  inline def getCompactable[E](M: Monoid[E]): Compactable2C[IOEither, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCompactable")(M.asInstanceOf[js.Any]).asInstanceOf[Compactable2C[IOEither, E]]
  
  inline def getFilterable[E](M: Monoid[E]): Filterable2C[typingsJapgolly.fpTs.libIoeitherMod.URI, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilterable")(M.asInstanceOf[js.Any]).asInstanceOf[Filterable2C[typingsJapgolly.fpTs.libIoeitherMod.URI, E]]
  
  inline def getIOValidation[E](SE: Semigroup[E]): (Monad2C[typingsJapgolly.fpTs.libIoeitherMod.URI, E]) & Bifunctor2[typingsJapgolly.fpTs.libIoeitherMod.URI] & (Alt2C[typingsJapgolly.fpTs.libIoeitherMod.URI, E]) & (MonadIO2C[typingsJapgolly.fpTs.libIoeitherMod.URI, E]) & (MonadThrow2C[typingsJapgolly.fpTs.libIoeitherMod.URI, E]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getIOValidation")(SE.asInstanceOf[js.Any]).asInstanceOf[(Monad2C[typingsJapgolly.fpTs.libIoeitherMod.URI, E]) & Bifunctor2[typingsJapgolly.fpTs.libIoeitherMod.URI] & (Alt2C[typingsJapgolly.fpTs.libIoeitherMod.URI, E]) & (MonadIO2C[typingsJapgolly.fpTs.libIoeitherMod.URI, E]) & (MonadThrow2C[typingsJapgolly.fpTs.libIoeitherMod.URI, E])]
  
  inline def getOrElse[E, A](onLeft: js.Function1[/* e */ E, IO_[A]]): js.Function1[/* ma */ IOEither_[E, A], IO_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElse")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ IOEither_[E, A], IO_[A]]]
  
  inline def getOrElseW[E, B](onLeft: js.Function1[/* e */ E, IO_[B]]): js.Function1[/* ma */ IOEither_[E, Any], IO_[Any | B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElseW")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ IOEither_[E, Any], IO_[Any | B]]]
  
  inline def getSemigroup[E, A](S: Semigroup[A]): Semigroup[IOEither_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")(S.asInstanceOf[js.Any]).asInstanceOf[Semigroup[IOEither_[E, A]]]
  
  @JSImport("fp-ts/index", "ioEither.ioEither")
  @js.native
  val ioEither: Monad2[typingsJapgolly.fpTs.libIoeitherMod.URI] & Bifunctor2[typingsJapgolly.fpTs.libIoeitherMod.URI] & Alt2[typingsJapgolly.fpTs.libIoeitherMod.URI] & MonadIO2[typingsJapgolly.fpTs.libIoeitherMod.URI] & MonadThrow2[typingsJapgolly.fpTs.libIoeitherMod.URI] = js.native
  
  inline def left[E, A](l: E): IOEither_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(l.asInstanceOf[js.Any]).asInstanceOf[IOEither_[E, A]]
  
  inline def leftIO[E, A](me: IO_[E]): IOEither_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftIO")(me.asInstanceOf[js.Any]).asInstanceOf[IOEither_[E, A]]
  
  inline def let[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, B]): js.Function1[
    /* fa */ IOEither_[Any, A], 
    IOEither_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("let")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ IOEither_[Any, A], 
    IOEither_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ IOEither_[Any, A], IOEither_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ IOEither_[Any, A], IOEither_[Any, B]]]
  
  inline def mapLeft[E, G](f: js.Function1[/* e */ E, G]): js.Function1[/* fa */ IOEither_[E, Any], IOEither_[G, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeft")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ IOEither_[E, Any], IOEither_[G, Any]]]
  
  inline def `match`[E, B, A](onLeft: js.Function1[/* e */ E, B], onRight: js.Function1[/* a */ A, B]): js.Function1[/* ma */ IOEither_[E, A], IO_[B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ IOEither_[E, A], IO_[B]]]
  
  inline def matchE[E, A, B](onLeft: js.Function1[/* e */ E, IO_[B]], onRight: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* ma */ IOEither_[E, A], IO_[B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchE")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ IOEither_[E, A], IO_[B]]]
  
  inline def matchEW[E, B, A, C](onLeft: js.Function1[/* e */ E, IO_[B]], onRight: js.Function1[/* a */ A, IO_[C]]): js.Function1[/* ma */ IOEither_[E, A], IO_[B | C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchEW")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ IOEither_[E, A], IO_[B | C]]]
  
  inline def matchW[E, B, A, C](onLeft: js.Function1[/* e */ E, B], onRight: js.Function1[/* a */ A, C]): js.Function1[/* ma */ IOEither_[E, A], IO_[B | C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchW")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ IOEither_[E, A], IO_[B | C]]]
  
  inline def of[E, A](a: A): IOEither_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any]).asInstanceOf[IOEither_[E, A]]
  
  inline def orElse[E1, A, E2](onLeft: js.Function1[/* e */ E1, IOEither_[E2, A]]): js.Function1[/* ma */ IOEither_[E1, A], IOEither_[E2, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("orElse")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ IOEither_[E1, A], IOEither_[E2, A]]]
  
  inline def orElseFirst[E, B](onLeft: js.Function1[/* e */ E, IOEither_[E, B]]): js.Function1[/* ma */ IOEither_[E, Any], IOEither_[E, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("orElseFirst")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ IOEither_[E, Any], IOEither_[E, Any]]]
  
  inline def orElseFirstIOK[E, B](onLeft: js.Function1[/* e */ E, IO_[B]]): js.Function1[/* ma */ IOEither_[E, Any], IOEither_[E, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("orElseFirstIOK")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ IOEither_[E, Any], IOEither_[E, Any]]]
  
  inline def orElseFirstW[E1, E2, B](onLeft: js.Function1[/* e */ E1, IOEither_[E2, B]]): js.Function1[/* ma */ IOEither_[E1, Any], IOEither_[E1 | E2, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("orElseFirstW")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ IOEither_[E1, Any], IOEither_[E1 | E2, Any]]]
  
  inline def orElseW[E1, E2, B](onLeft: js.Function1[/* e */ E1, IOEither_[E2, B]]): js.Function1[/* ma */ IOEither_[E1, Any], IOEither_[E2, Any | B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("orElseW")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ IOEither_[E1, Any], IOEither_[E2, Any | B]]]
  
  inline def orLeft[E1, E2](onLeft: js.Function1[/* e */ E1, IO_[E2]]): js.Function1[/* fa */ IOEither_[E1, Any], IOEither_[E2, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("orLeft")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ IOEither_[E1, Any], IOEither_[E2, Any]]]
  
  inline def right[E, A](a: A): IOEither_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(a.asInstanceOf[js.Any]).asInstanceOf[IOEither_[E, A]]
  
  inline def rightIO[E, A](ma: IO_[A]): IOEither_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightIO")(ma.asInstanceOf[js.Any]).asInstanceOf[IOEither_[E, A]]
  
  inline def sequenceArray[E, A](arr: js.Array[IOEither_[E, A]]): IOEither_[E, js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceArray")(arr.asInstanceOf[js.Any]).asInstanceOf[IOEither_[E, js.Array[A]]]
  
  inline def sequenceSeqArray[E, A](arr: js.Array[IOEither_[E, A]]): IOEither_[E, js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceSeqArray")(arr.asInstanceOf[js.Any]).asInstanceOf[IOEither_[E, js.Array[A]]]
  
  inline def swap[E, A](ma: IOEither_[E, A]): IOEither_[A, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("swap")(ma.asInstanceOf[js.Any]).asInstanceOf[IOEither_[A, E]]
  
  @JSImport("fp-ts/index", "ioEither.throwError")
  @js.native
  val throwError: js.Function1[
    /* e */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ Any
  ] = js.native
  
  inline def toUnion[E, A](fa: IOEither_[E, A]): IO_[E | A] = ^.asInstanceOf[js.Dynamic].applyDynamic("toUnion")(fa.asInstanceOf[js.Any]).asInstanceOf[IO_[E | A]]
  
  inline def traverseArray[A, E, B](f: js.Function1[/* a */ A, IOEither_[E, B]]): js.Function1[/* as */ js.Array[A], IOEither_[E, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseArray")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], IOEither_[E, js.Array[B]]]]
  
  inline def traverseArrayWithIndex[A, E, B](f: js.Function2[/* index */ Double, /* a */ A, IOEither_[E, B]]): js.Function1[/* as */ js.Array[A], IOEither_[E, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], IOEither_[E, js.Array[B]]]]
  
  inline def traverseReadonlyArrayWithIndex[A, E, B](f: js.Function2[/* index */ Double, /* a */ A, IOEither_[E, B]]): js.Function1[/* as */ js.Array[A], IOEither_[E, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], IOEither_[E, js.Array[B]]]]
  
  inline def traverseReadonlyArrayWithIndexSeq[A, E, B](f: js.Function2[/* index */ Double, /* a */ A, IOEither_[E, B]]): js.Function1[/* as */ js.Array[A], IOEither_[E, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyArrayWithIndexSeq")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], IOEither_[E, js.Array[B]]]]
  
  inline def traverseReadonlyNonEmptyArrayWithIndex[A, E, B](f: js.Function2[/* index */ Double, /* a */ A, IOEither_[E, B]]): js.Function1[/* as */ ReadonlyNonEmptyArray_[A], IOEither_[E, ReadonlyNonEmptyArray_[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyNonEmptyArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ ReadonlyNonEmptyArray_[A], IOEither_[E, ReadonlyNonEmptyArray_[B]]]]
  
  inline def traverseReadonlyNonEmptyArrayWithIndexSeq[A, E, B](f: js.Function2[/* index */ Double, /* a */ A, IOEither_[E, B]]): js.Function1[/* as */ ReadonlyNonEmptyArray_[A], IOEither_[E, ReadonlyNonEmptyArray_[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyNonEmptyArrayWithIndexSeq")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ ReadonlyNonEmptyArray_[A], IOEither_[E, ReadonlyNonEmptyArray_[B]]]]
  
  inline def traverseSeqArray[A, E, B](f: js.Function1[/* a */ A, IOEither_[E, B]]): js.Function1[/* as */ js.Array[A], IOEither_[E, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseSeqArray")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], IOEither_[E, js.Array[B]]]]
  
  inline def traverseSeqArrayWithIndex[A, E, B](f: js.Function2[/* index */ Double, /* a */ A, IOEither_[E, B]]): js.Function1[/* as */ js.Array[A], IOEither_[E, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseSeqArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], IOEither_[E, js.Array[B]]]]
  
  inline def tryCatch[E, A](f: Lazy[A], onThrow: js.Function1[/* reason */ Any, E]): IOEither_[E, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("tryCatch")(f.asInstanceOf[js.Any], onThrow.asInstanceOf[js.Any])).asInstanceOf[IOEither_[E, A]]
  
  inline def tryCatchK[A /* <: js.Array[Any] */, B, E](f: js.Function1[/* a */ A, B], onThrow: js.Function1[/* reason */ Any, E]): js.Function1[/* a */ A, IOEither_[E, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("tryCatchK")(f.asInstanceOf[js.Any], onThrow.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, IOEither_[E, B]]]
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind2[E, A] extends StObject
  }
}
