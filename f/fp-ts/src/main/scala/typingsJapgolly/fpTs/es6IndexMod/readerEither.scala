package typingsJapgolly.fpTs.es6IndexMod

import typingsJapgolly.fpTs.fpTsStrings.ReaderEither
import typingsJapgolly.fpTs.libAltMod.Alt3
import typingsJapgolly.fpTs.libAltMod.Alt3C
import typingsJapgolly.fpTs.libApplicativeMod.Applicative3
import typingsJapgolly.fpTs.libApplicativeMod.Applicative3C
import typingsJapgolly.fpTs.libApplyMod.Apply3
import typingsJapgolly.fpTs.libBifunctorMod.Bifunctor3
import typingsJapgolly.fpTs.libChainMod.Chain3
import typingsJapgolly.fpTs.libCompactableMod.Compactable3C
import typingsJapgolly.fpTs.libEitherMod.Either_
import typingsJapgolly.fpTs.libFilterableMod.Filterable3C
import typingsJapgolly.fpTs.libFromEitherMod.FromEither3
import typingsJapgolly.fpTs.libFromReaderMod.FromReader3
import typingsJapgolly.fpTs.libFunctionMod.Lazy
import typingsJapgolly.fpTs.libFunctorMod.Functor3
import typingsJapgolly.fpTs.libMonadMod.Monad3
import typingsJapgolly.fpTs.libMonadMod.Monad3C
import typingsJapgolly.fpTs.libMonadThrowMod.MonadThrow3
import typingsJapgolly.fpTs.libMonadThrowMod.MonadThrow3C
import typingsJapgolly.fpTs.libMonoidMod.Monoid
import typingsJapgolly.fpTs.libOptionMod.Option_
import typingsJapgolly.fpTs.libPointedMod.Pointed3
import typingsJapgolly.fpTs.libPredicateMod.Predicate
import typingsJapgolly.fpTs.libReaderEitherMod.ReaderEither_
import typingsJapgolly.fpTs.libReaderMod.Reader_
import typingsJapgolly.fpTs.libReadonlyNonEmptyArrayMod.ReadonlyNonEmptyArray_
import typingsJapgolly.fpTs.libRefinementMod.Refinement
import typingsJapgolly.fpTs.libSemigroupMod.Semigroup
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readerEither {
  
  @JSImport("fp-ts/es6/index", "readerEither")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/es6/index", "readerEither.Alt")
  @js.native
  val Alt_ : Alt3[typingsJapgolly.fpTs.libReaderEitherMod.URI] = js.native
  
  @JSImport("fp-ts/es6/index", "readerEither.ApT")
  @js.native
  val ApT: ReaderEither_[Any, scala.Nothing, js.Array[Any]] = js.native
  
  @JSImport("fp-ts/es6/index", "readerEither.Applicative")
  @js.native
  val Applicative: Applicative3[typingsJapgolly.fpTs.libReaderEitherMod.URI] = js.native
  
  @JSImport("fp-ts/es6/index", "readerEither.Apply")
  @js.native
  val Apply: Apply3[typingsJapgolly.fpTs.libReaderEitherMod.URI] = js.native
  
  @JSImport("fp-ts/es6/index", "readerEither.Bifunctor")
  @js.native
  val Bifunctor: Bifunctor3[typingsJapgolly.fpTs.libReaderEitherMod.URI] = js.native
  
  @JSImport("fp-ts/es6/index", "readerEither.Chain")
  @js.native
  val Chain_ : Chain3[typingsJapgolly.fpTs.libReaderEitherMod.URI] = js.native
  
  @JSImport("fp-ts/es6/index", "readerEither.Do")
  @js.native
  val Do: ReaderEither_[Any, scala.Nothing, js.Object] = js.native
  
  @JSImport("fp-ts/es6/index", "readerEither.FromEither")
  @js.native
  val FromEither_ : FromEither3[typingsJapgolly.fpTs.libReaderEitherMod.URI] = js.native
  
  @JSImport("fp-ts/es6/index", "readerEither.FromReader")
  @js.native
  val FromReader_ : FromReader3[typingsJapgolly.fpTs.libReaderEitherMod.URI] = js.native
  
  @JSImport("fp-ts/es6/index", "readerEither.Functor")
  @js.native
  val Functor: Functor3[typingsJapgolly.fpTs.libReaderEitherMod.URI] = js.native
  
  @JSImport("fp-ts/es6/index", "readerEither.Monad")
  @js.native
  val Monad: Monad3[typingsJapgolly.fpTs.libReaderEitherMod.URI] = js.native
  
  @JSImport("fp-ts/es6/index", "readerEither.MonadThrow")
  @js.native
  val MonadThrow: MonadThrow3[typingsJapgolly.fpTs.libReaderEitherMod.URI] = js.native
  
  @JSImport("fp-ts/es6/index", "readerEither.Pointed")
  @js.native
  val Pointed: Pointed3[typingsJapgolly.fpTs.libReaderEitherMod.URI] = js.native
  
  @JSImport("fp-ts/es6/index", "readerEither.URI")
  @js.native
  val URI: /* "ReaderEither" */ String = js.native
  
  inline def alt[R, E, A](that: js.Function0[ReaderEither_[R, E, A]]): js.Function1[/* fa */ ReaderEither_[R, E, A], ReaderEither_[R, E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(that.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ ReaderEither_[R, E, A], ReaderEither_[R, E, A]]]
  
  inline def altW[R2, E2, B](that: js.Function0[ReaderEither_[R2, E2, B]]): js.Function1[/* fa */ ReaderEither_[Any, Any, Any], ReaderEither_[Any & R2, E2, Any | B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("altW")(that.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ ReaderEither_[Any, Any, Any], ReaderEither_[Any & R2, E2, Any | B]]]
  
  inline def ap[R, E, A](fa: ReaderEither_[R, E, A]): js.Function1[
    /* fab */ ReaderEither_[R, E, js.Function1[/* a */ A, Any]], 
    ReaderEither_[R, E, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fab */ ReaderEither_[R, E, js.Function1[/* a */ A, Any]], 
    ReaderEither_[R, E, Any]
  ]]
  
  inline def apFirst[R, E, B](second: ReaderEither_[R, E, B]): js.Function1[/* first */ ReaderEither_[R, E, Any], ReaderEither_[R, E, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirst")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ ReaderEither_[R, E, Any], ReaderEither_[R, E, Any]]]
  
  inline def apFirstW[R2, E2, B](second: ReaderEither_[R2, E2, B]): js.Function1[/* first */ ReaderEither_[Any, Any, Any], ReaderEither_[Any & R2, Any | E2, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirstW")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ ReaderEither_[Any, Any, Any], ReaderEither_[Any & R2, Any | E2, Any]]]
  
  inline def apS[N /* <: String */, A, R, E, B](name: Exclude[N, /* keyof A */ String], fb: ReaderEither_[R, E, B]): js.Function1[
    /* fa */ ReaderEither_[R, E, A], 
    ReaderEither_[
      R, 
      E, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apS")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ ReaderEither_[R, E, A], 
    ReaderEither_[
      R, 
      E, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def apSW[A, N /* <: String */, R2, E2, B](name: Exclude[N, /* keyof A */ String], fb: ReaderEither_[R2, E2, B]): js.Function1[
    /* fa */ ReaderEither_[Any, Any, A], 
    ReaderEither_[
      Any & R2, 
      Any | E2, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apSW")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ ReaderEither_[Any, Any, A], 
    ReaderEither_[
      Any & R2, 
      Any | E2, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def apSecond[R, E, B](second: ReaderEither_[R, E, B]): js.Function1[/* first */ ReaderEither_[R, E, Any], ReaderEither_[R, E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecond")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ ReaderEither_[R, E, Any], ReaderEither_[R, E, B]]]
  
  inline def apSecondW[R2, E2, B](second: ReaderEither_[R2, E2, B]): js.Function1[/* first */ ReaderEither_[Any, Any, Any], ReaderEither_[Any & R2, Any | E2, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecondW")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ ReaderEither_[Any, Any, Any], ReaderEither_[Any & R2, Any | E2, B]]]
  
  inline def apW[R2, E2, A](fa: ReaderEither_[R2, E2, A]): js.Function1[
    /* fab */ ReaderEither_[Any, Any, js.Function1[/* a */ A, Any]], 
    ReaderEither_[Any & R2, Any | E2, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("apW")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fab */ ReaderEither_[Any, Any, js.Function1[/* a */ A, Any]], 
    ReaderEither_[Any & R2, Any | E2, Any]
  ]]
  
  inline def ask[R, E](): ReaderEither_[R, E, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("ask")().asInstanceOf[ReaderEither_[R, E, R]]
  
  inline def asks[R, A, E](f: js.Function1[/* r */ R, A]): ReaderEither_[R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asks")(f.asInstanceOf[js.Any]).asInstanceOf[ReaderEither_[R, E, A]]
  
  inline def asksReaderEither[R, E, A](f: js.Function1[/* r */ R, ReaderEither_[R, E, A]]): ReaderEither_[R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asksReaderEither")(f.asInstanceOf[js.Any]).asInstanceOf[ReaderEither_[R, E, A]]
  
  inline def asksReaderEitherW[R1, R2, E, A](f: js.Function1[/* r1 */ R1, ReaderEither_[R2, E, A]]): ReaderEither_[R1 & R2, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asksReaderEitherW")(f.asInstanceOf[js.Any]).asInstanceOf[ReaderEither_[R1 & R2, E, A]]
  
  inline def bimap[E, G, A, B](f: js.Function1[/* e */ E, G], g: js.Function1[/* a */ A, B]): js.Function1[/* fa */ ReaderEither_[Any, E, A], ReaderEither_[Any, G, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bimap")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ ReaderEither_[Any, E, A], ReaderEither_[Any, G, B]]]
  
  inline def bind[N /* <: String */, A, R, E, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, ReaderEither_[R, E, B]]): js.Function1[
    /* ma */ ReaderEither_[R, E, A], 
    ReaderEither_[
      R, 
      E, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* ma */ ReaderEither_[R, E, A], 
    ReaderEither_[
      R, 
      E, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def bindTo[N /* <: String */](name: N): js.Function1[
    /* fa */ ReaderEither_[Any, Any, Any], 
    ReaderEither_[
      Any, 
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N ]: any} */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ ReaderEither_[Any, Any, Any], 
    ReaderEither_[
      Any, 
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N ]: any} */ js.Any
    ]
  ]]
  
  inline def bindW[N /* <: String */, A, R2, E2, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, ReaderEither_[R2, E2, B]]): js.Function1[
    /* fa */ ReaderEither_[Any, Any, A], 
    ReaderEither_[
      Any & R2, 
      Any | E2, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindW")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ ReaderEither_[Any, Any, A], 
    ReaderEither_[
      Any & R2, 
      Any | E2, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def chain[R, E, A, B](f: js.Function1[/* a */ A, ReaderEither_[R, E, B]]): js.Function1[/* ma */ ReaderEither_[R, E, A], ReaderEither_[R, E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderEither_[R, E, A], ReaderEither_[R, E, B]]]
  
  inline def chainEitherK[E, A, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[/* ma */ ReaderEither_[Any, E, A], ReaderEither_[Any, E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderEither_[Any, E, A], ReaderEither_[Any, E, B]]]
  
  inline def chainEitherKW[E2, A, B](f: js.Function1[/* a */ A, Either_[E2, B]]): js.Function1[/* ma */ ReaderEither_[Any, Any, A], ReaderEither_[Any, Any | E2, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainEitherKW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderEither_[Any, Any, A], ReaderEither_[Any, Any | E2, B]]]
  
  inline def chainFirst[R, E, A, B](f: js.Function1[/* a */ A, ReaderEither_[R, E, B]]): js.Function1[/* ma */ ReaderEither_[R, E, A], ReaderEither_[R, E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirst")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderEither_[R, E, A], ReaderEither_[R, E, A]]]
  
  inline def chainFirstEitherK[A, E, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[/* ma */ ReaderEither_[Any, E, A], ReaderEither_[Any, E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderEither_[Any, E, A], ReaderEither_[Any, E, A]]]
  
  inline def chainFirstEitherKW[A, E2, B](f: js.Function1[/* a */ A, Either_[E2, B]]): js.Function1[/* ma */ ReaderEither_[Any, Any, A], ReaderEither_[Any, Any | E2, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstEitherKW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderEither_[Any, Any, A], ReaderEither_[Any, Any | E2, A]]]
  
  inline def chainFirstReaderK[A, R, B](f: js.Function1[/* a */ A, Reader_[R, B]]): js.Function1[/* ma */ ReaderEither_[R, Any, A], ReaderEither_[R, Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstReaderK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderEither_[R, Any, A], ReaderEither_[R, Any, A]]]
  
  inline def chainFirstReaderKW[A, R1, B](f: js.Function1[/* a */ A, Reader_[R1, B]]): js.Function1[/* ma */ ReaderEither_[Any, Any, A], ReaderEither_[R1 & Any, Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstReaderKW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderEither_[Any, Any, A], ReaderEither_[R1 & Any, Any, A]]]
  
  inline def chainFirstW[R2, E2, A, B](f: js.Function1[/* a */ A, ReaderEither_[R2, E2, B]]): js.Function1[/* ma */ ReaderEither_[Any, Any, A], ReaderEither_[Any & R2, Any | E2, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderEither_[Any, Any, A], ReaderEither_[Any & R2, Any | E2, A]]]
  
  inline def chainOptionK[E](onNone: Lazy[E]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[Any]], 
    js.Function1[/* ma */ ReaderEither_[Any, E, Any], ReaderEither_[Any, E, Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainOptionK")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[Any]], 
    js.Function1[/* ma */ ReaderEither_[Any, E, Any], ReaderEither_[Any, E, Any]]
  ]]
  
  inline def chainReaderK[A, R, B](f: js.Function1[/* a */ A, Reader_[R, B]]): js.Function1[/* ma */ ReaderEither_[R, Any, A], ReaderEither_[R, Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainReaderK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderEither_[R, Any, A], ReaderEither_[R, Any, B]]]
  
  inline def chainReaderKW[A, R2, B](f: js.Function1[/* a */ A, Reader_[R2, B]]): js.Function1[/* ma */ ReaderEither_[Any, Any, A], ReaderEither_[Any & R2, Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainReaderKW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderEither_[Any, Any, A], ReaderEither_[Any & R2, Any, B]]]
  
  inline def chainW[R2, E2, A, B](f: js.Function1[/* a */ A, ReaderEither_[R2, E2, B]]): js.Function1[/* ma */ ReaderEither_[Any, Any, A], ReaderEither_[Any & R2, Any | E2, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderEither_[Any, Any, A], ReaderEither_[Any & R2, Any | E2, B]]]
  
  inline def filterOrElse[E, A](predicate: Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* mb */ ReaderEither_[Any, E, A], ReaderEither_[Any, E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOrElse")(predicate.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* mb */ ReaderEither_[Any, E, A], ReaderEither_[Any, E, A]]]
  
  inline def filterOrElseW[A, E2](predicate: Predicate[A], onFalse: js.Function1[/* a */ A, E2]): js.Function1[/* mb */ ReaderEither_[Any, Any, A], ReaderEither_[Any, Any | E2, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOrElseW")(predicate.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* mb */ ReaderEither_[Any, Any, A], ReaderEither_[Any, Any | E2, A]]]
  
  inline def filterOrElseW_ABE2[A, B /* <: A */, E2](refinement: Refinement[A, B], onFalse: js.Function1[/* a */ A, E2]): js.Function1[/* ma */ ReaderEither_[Any, Any, A], ReaderEither_[Any, Any | E2, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOrElseW")(refinement.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ ReaderEither_[Any, Any, A], ReaderEither_[Any, Any | E2, B]]]
  
  inline def filterOrElse_EAB[E, A, B /* <: A */](refinement: Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* ma */ ReaderEither_[Any, E, A], ReaderEither_[Any, E, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOrElse")(refinement.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ ReaderEither_[Any, E, A], ReaderEither_[Any, E, B]]]
  
  inline def flap[A](a: A): js.Function1[
    /* fab */ ReaderEither_[Any, Any, js.Function1[/* a */ A, Any]], 
    ReaderEither_[Any, Any, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fab */ ReaderEither_[Any, Any, js.Function1[/* a */ A, Any]], 
    ReaderEither_[Any, Any, Any]
  ]]
  
  inline def flatten[R, E, A](mma: ReaderEither_[R, E, ReaderEither_[R, E, A]]): ReaderEither_[R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(mma.asInstanceOf[js.Any]).asInstanceOf[ReaderEither_[R, E, A]]
  
  inline def flattenW[R1, R2, E1, E2, A](mma: ReaderEither_[R1, E1, ReaderEither_[R2, E2, A]]): ReaderEither_[R1 & R2, E1 | E2, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenW")(mma.asInstanceOf[js.Any]).asInstanceOf[ReaderEither_[R1 & R2, E1 | E2, A]]
  
  inline def fold[R, E, A, B](onLeft: js.Function1[/* e */ E, Reader_[R, B]], onRight: js.Function1[/* a */ A, Reader_[R, B]]): js.Function1[/* ma */ ReaderEither_[R, E, A], Reader_[R, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fold")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ ReaderEither_[R, E, A], Reader_[R, B]]]
  
  inline def foldW[E, R2, B, A, R3, C](onLeft: js.Function1[/* e */ E, Reader_[R2, B]], onRight: js.Function1[/* a */ A, Reader_[R3, C]]): js.Function1[/* ma */ ReaderEither_[Any, E, A], Reader_[Any & R2 & R3, B | C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("foldW")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ ReaderEither_[Any, E, A], Reader_[Any & R2 & R3, B | C]]]
  
  inline def fromEither[E, A, R](fa: Either_[E, A]): ReaderEither_[R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEither")(fa.asInstanceOf[js.Any]).asInstanceOf[ReaderEither_[R, E, A]]
  
  inline def fromEitherK[E, A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[/* a */ A, ReaderEither_[Any, E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, ReaderEither_[Any, E, B]]]
  
  inline def fromOption[E](onNone: Lazy[E]): js.Function1[/* fa */ Option_[Any], ReaderEither_[Any, E, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOption")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Option_[Any], ReaderEither_[Any, E, Any]]]
  
  inline def fromOptionK[E](onNone: Lazy[E]): js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Option_[Any]], 
    js.Function1[/* a */ js.Array[Any], ReaderEither_[Any, E, Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOptionK")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Option_[Any]], 
    js.Function1[/* a */ js.Array[Any], ReaderEither_[Any, E, Any]]
  ]]
  
  inline def fromPredicate[E, A](predicate: Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* b */ A, ReaderEither_[Any, E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(predicate.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* b */ A, ReaderEither_[Any, E, A]]]
  
  inline def fromPredicate_EAB[E, A, B /* <: A */](refinement: Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* a */ A, ReaderEither_[Any, E, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(refinement.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, ReaderEither_[Any, E, B]]]
  
  inline def fromReader[R, A, E](fa: Reader_[R, A]): ReaderEither_[R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromReader")(fa.asInstanceOf[js.Any]).asInstanceOf[ReaderEither_[R, E, A]]
  
  inline def fromReaderK[A /* <: js.Array[Any] */, R, B](f: js.Function1[/* a */ A, Reader_[R, B]]): js.Function1[/* a */ A, ReaderEither_[R, scala.Nothing, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromReaderK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, ReaderEither_[R, scala.Nothing, B]]]
  
  inline def getAltReaderValidation[E](S: Semigroup[E]): Alt3C[typingsJapgolly.fpTs.libReaderEitherMod.URI, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAltReaderValidation")(S.asInstanceOf[js.Any]).asInstanceOf[Alt3C[typingsJapgolly.fpTs.libReaderEitherMod.URI, E]]
  
  inline def getApplicativeReaderValidation[E](S: Semigroup[E]): Applicative3C[typingsJapgolly.fpTs.libReaderEitherMod.URI, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplicativeReaderValidation")(S.asInstanceOf[js.Any]).asInstanceOf[Applicative3C[typingsJapgolly.fpTs.libReaderEitherMod.URI, E]]
  
  inline def getApplyMonoid[R, E, A](M: Monoid[A]): Monoid[ReaderEither_[R, E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplyMonoid")(M.asInstanceOf[js.Any]).asInstanceOf[Monoid[ReaderEither_[R, E, A]]]
  
  inline def getApplySemigroup[R, E, A](S: Semigroup[A]): Semigroup[ReaderEither_[R, E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplySemigroup")(S.asInstanceOf[js.Any]).asInstanceOf[Semigroup[ReaderEither_[R, E, A]]]
  
  inline def getCompactable[E](M: Monoid[E]): Compactable3C[ReaderEither, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCompactable")(M.asInstanceOf[js.Any]).asInstanceOf[Compactable3C[ReaderEither, E]]
  
  inline def getFilterable[E](M: Monoid[E]): Filterable3C[typingsJapgolly.fpTs.libReaderEitherMod.URI, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilterable")(M.asInstanceOf[js.Any]).asInstanceOf[Filterable3C[typingsJapgolly.fpTs.libReaderEitherMod.URI, E]]
  
  inline def getOrElse[E, R, A](onLeft: js.Function1[/* e */ E, Reader_[R, A]]): js.Function1[/* ma */ ReaderEither_[R, E, A], Reader_[R, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElse")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderEither_[R, E, A], Reader_[R, A]]]
  
  inline def getOrElseW[R2, E, B](onLeft: js.Function1[/* e */ E, Reader_[R2, B]]): js.Function1[/* ma */ ReaderEither_[Any, E, Any], Reader_[Any & R2, Any | B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElseW")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderEither_[Any, E, Any], Reader_[Any & R2, Any | B]]]
  
  inline def getReaderValidation[E](SE: Semigroup[E]): (Monad3C[typingsJapgolly.fpTs.libReaderEitherMod.URI, E]) & Bifunctor3[typingsJapgolly.fpTs.libReaderEitherMod.URI] & (Alt3C[typingsJapgolly.fpTs.libReaderEitherMod.URI, E]) & (MonadThrow3C[typingsJapgolly.fpTs.libReaderEitherMod.URI, E]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getReaderValidation")(SE.asInstanceOf[js.Any]).asInstanceOf[(Monad3C[typingsJapgolly.fpTs.libReaderEitherMod.URI, E]) & Bifunctor3[typingsJapgolly.fpTs.libReaderEitherMod.URI] & (Alt3C[typingsJapgolly.fpTs.libReaderEitherMod.URI, E]) & (MonadThrow3C[typingsJapgolly.fpTs.libReaderEitherMod.URI, E])]
  
  inline def getSemigroup[R, E, A](S: Semigroup[A]): Semigroup[ReaderEither_[R, E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")(S.asInstanceOf[js.Any]).asInstanceOf[Semigroup[ReaderEither_[R, E, A]]]
  
  inline def left[R, E, A](e: E): ReaderEither_[R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(e.asInstanceOf[js.Any]).asInstanceOf[ReaderEither_[R, E, A]]
  
  inline def leftReader[R, E, A](me: Reader_[R, E]): ReaderEither_[R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftReader")(me.asInstanceOf[js.Any]).asInstanceOf[ReaderEither_[R, E, A]]
  
  inline def let[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, B]): js.Function1[
    /* fa */ ReaderEither_[Any, Any, A], 
    ReaderEither_[
      Any, 
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("let")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ ReaderEither_[Any, Any, A], 
    ReaderEither_[
      Any, 
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def local[R2, R1](f: js.Function1[/* r2 */ R2, R1]): js.Function1[/* ma */ ReaderEither_[R1, Any, Any], ReaderEither_[R2, Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("local")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderEither_[R1, Any, Any], ReaderEither_[R2, Any, Any]]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ ReaderEither_[Any, Any, A], ReaderEither_[Any, Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ ReaderEither_[Any, Any, A], ReaderEither_[Any, Any, B]]]
  
  inline def mapLeft[E, G](f: js.Function1[/* e */ E, G]): js.Function1[/* fa */ ReaderEither_[Any, E, Any], ReaderEither_[Any, G, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeft")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ ReaderEither_[Any, E, Any], ReaderEither_[Any, G, Any]]]
  
  inline def `match`[E, B, A](onLeft: js.Function1[/* e */ E, B], onRight: js.Function1[/* a */ A, B]): js.Function1[/* ma */ ReaderEither_[Any, E, A], Reader_[Any, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ ReaderEither_[Any, E, A], Reader_[Any, B]]]
  
  inline def matchE[R, E, A, B](onLeft: js.Function1[/* e */ E, Reader_[R, B]], onRight: js.Function1[/* a */ A, Reader_[R, B]]): js.Function1[/* ma */ ReaderEither_[R, E, A], Reader_[R, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchE")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ ReaderEither_[R, E, A], Reader_[R, B]]]
  
  inline def matchEW[E, R2, B, A, R3, C](onLeft: js.Function1[/* e */ E, Reader_[R2, B]], onRight: js.Function1[/* a */ A, Reader_[R3, C]]): js.Function1[/* ma */ ReaderEither_[Any, E, A], Reader_[Any & R2 & R3, B | C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchEW")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ ReaderEither_[Any, E, A], Reader_[Any & R2 & R3, B | C]]]
  
  inline def matchW[E, B, A, C](onLeft: js.Function1[/* e */ E, B], onRight: js.Function1[/* a */ A, C]): js.Function1[/* ma */ Reader_[Any, Either_[E, A]], Reader_[Any, B | C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchW")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ Reader_[Any, Either_[E, A]], Reader_[Any, B | C]]]
  
  inline def of[R, E, A](a: A): ReaderEither_[R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any]).asInstanceOf[ReaderEither_[R, E, A]]
  
  inline def orElse[E1, R, E2, A](onLeft: js.Function1[/* e */ E1, ReaderEither_[R, E2, A]]): js.Function1[/* ma */ ReaderEither_[R, E1, A], ReaderEither_[R, E2, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("orElse")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderEither_[R, E1, A], ReaderEither_[R, E2, A]]]
  
  inline def orElseFirst[E, R, B](onLeft: js.Function1[/* e */ E, ReaderEither_[R, E, B]]): js.Function1[/* ma */ ReaderEither_[R, E, Any], ReaderEither_[R, E, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("orElseFirst")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderEither_[R, E, Any], ReaderEither_[R, E, Any]]]
  
  inline def orElseFirstW[E1, R2, E2, B](onLeft: js.Function1[/* e */ E1, ReaderEither_[R2, E2, B]]): js.Function1[/* ma */ ReaderEither_[Any, E1, Any], ReaderEither_[Any & R2, E1 | E2, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("orElseFirstW")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderEither_[Any, E1, Any], ReaderEither_[Any & R2, E1 | E2, Any]]]
  
  inline def orElseW[E1, R1, E2, B](onLeft: js.Function1[/* e */ E1, ReaderEither_[R1, E2, B]]): js.Function1[/* ma */ ReaderEither_[Any, E1, Any], ReaderEither_[R1 & Any, E2, Any | B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("orElseW")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderEither_[Any, E1, Any], ReaderEither_[R1 & Any, E2, Any | B]]]
  
  inline def orLeft[E1, R, E2](onLeft: js.Function1[/* e */ E1, Reader_[R, E2]]): js.Function1[/* fa */ ReaderEither_[R, E1, Any], ReaderEither_[R, E2, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("orLeft")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ ReaderEither_[R, E1, Any], ReaderEither_[R, E2, Any]]]
  
  @JSImport("fp-ts/es6/index", "readerEither.readerEither")
  @js.native
  val readerEither: Monad3[typingsJapgolly.fpTs.libReaderEitherMod.URI] & Bifunctor3[typingsJapgolly.fpTs.libReaderEitherMod.URI] & Alt3[typingsJapgolly.fpTs.libReaderEitherMod.URI] & MonadThrow3[typingsJapgolly.fpTs.libReaderEitherMod.URI] = js.native
  
  inline def right[R, E, A](a: A): ReaderEither_[R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(a.asInstanceOf[js.Any]).asInstanceOf[ReaderEither_[R, E, A]]
  
  inline def rightReader[R, E, A](ma: Reader_[R, A]): ReaderEither_[R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightReader")(ma.asInstanceOf[js.Any]).asInstanceOf[ReaderEither_[R, E, A]]
  
  inline def sequenceArray[R, E, A](arr: js.Array[ReaderEither_[R, E, A]]): ReaderEither_[R, E, js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceArray")(arr.asInstanceOf[js.Any]).asInstanceOf[ReaderEither_[R, E, js.Array[A]]]
  
  inline def swap[R, E, A](ma: ReaderEither_[R, E, A]): ReaderEither_[R, A, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("swap")(ma.asInstanceOf[js.Any]).asInstanceOf[ReaderEither_[R, A, E]]
  
  @JSImport("fp-ts/es6/index", "readerEither.throwError")
  @js.native
  val throwError: js.Function1[
    /* e */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, A> */ Any
  ] = js.native
  
  inline def toUnion[R, E, A](fa: ReaderEither_[R, E, A]): Reader_[R, E | A] = ^.asInstanceOf[js.Dynamic].applyDynamic("toUnion")(fa.asInstanceOf[js.Any]).asInstanceOf[Reader_[R, E | A]]
  
  inline def traverseArray[R, E, A, B](f: js.Function1[/* a */ A, ReaderEither_[R, E, B]]): js.Function1[/* as */ js.Array[A], ReaderEither_[R, E, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseArray")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], ReaderEither_[R, E, js.Array[B]]]]
  
  inline def traverseArrayWithIndex[R, E, A, B](f: js.Function2[/* index */ Double, /* a */ A, ReaderEither_[R, E, B]]): js.Function1[/* as */ js.Array[A], ReaderEither_[R, E, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], ReaderEither_[R, E, js.Array[B]]]]
  
  inline def traverseReadonlyArrayWithIndex[A, R, E, B](f: js.Function2[/* index */ Double, /* a */ A, ReaderEither_[R, E, B]]): js.Function1[/* as */ js.Array[A], ReaderEither_[R, E, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], ReaderEither_[R, E, js.Array[B]]]]
  
  inline def traverseReadonlyNonEmptyArrayWithIndex[A, R, E, B](f: js.Function2[/* index */ Double, /* a */ A, ReaderEither_[R, E, B]]): js.Function1[/* as */ ReadonlyNonEmptyArray_[A], ReaderEither_[R, E, ReadonlyNonEmptyArray_[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyNonEmptyArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ ReadonlyNonEmptyArray_[A], ReaderEither_[R, E, ReadonlyNonEmptyArray_[B]]]]
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind3[R, E, A] extends StObject
  }
}
