package typingsJapgolly.fpTs.es6IndexMod

import typingsJapgolly.fpTs.libApplicativeMod.Applicative2
import typingsJapgolly.fpTs.libApplyMod.Apply2
import typingsJapgolly.fpTs.libCategoryMod.Category2
import typingsJapgolly.fpTs.libChainMod.Chain2
import typingsJapgolly.fpTs.libChoiceMod.Choice2
import typingsJapgolly.fpTs.libFunctorMod.Functor2
import typingsJapgolly.fpTs.libMonadMod.Monad2
import typingsJapgolly.fpTs.libMonoidMod.Monoid
import typingsJapgolly.fpTs.libPointedMod.Pointed2
import typingsJapgolly.fpTs.libProfunctorMod.Profunctor2
import typingsJapgolly.fpTs.libReaderMod.Reader_
import typingsJapgolly.fpTs.libReadonlyNonEmptyArrayMod.ReadonlyNonEmptyArray_
import typingsJapgolly.fpTs.libSemigroupMod.Semigroup
import typingsJapgolly.fpTs.libStrongMod.Strong2
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reader {
  
  @JSImport("fp-ts/es6/index", "reader")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/es6/index", "reader.ApT")
  @js.native
  val ApT: Reader_[Any, js.Array[Any]] = js.native
  
  @JSImport("fp-ts/es6/index", "reader.Applicative")
  @js.native
  val Applicative: Applicative2[typingsJapgolly.fpTs.libReaderMod.URI] = js.native
  
  @JSImport("fp-ts/es6/index", "reader.Apply")
  @js.native
  val Apply: Apply2[typingsJapgolly.fpTs.libReaderMod.URI] = js.native
  
  @JSImport("fp-ts/es6/index", "reader.Category")
  @js.native
  val Category: Category2[typingsJapgolly.fpTs.libReaderMod.URI] = js.native
  
  @JSImport("fp-ts/es6/index", "reader.Chain")
  @js.native
  val Chain_ : Chain2[typingsJapgolly.fpTs.libReaderMod.URI] = js.native
  
  @JSImport("fp-ts/es6/index", "reader.Choice")
  @js.native
  val Choice: Choice2[typingsJapgolly.fpTs.libReaderMod.URI] = js.native
  
  @JSImport("fp-ts/es6/index", "reader.Do")
  @js.native
  val Do: Reader_[Any, js.Object] = js.native
  
  @JSImport("fp-ts/es6/index", "reader.Functor")
  @js.native
  val Functor: Functor2[typingsJapgolly.fpTs.libReaderMod.URI] = js.native
  
  @JSImport("fp-ts/es6/index", "reader.Monad")
  @js.native
  val Monad: Monad2[typingsJapgolly.fpTs.libReaderMod.URI] = js.native
  
  @JSImport("fp-ts/es6/index", "reader.Pointed")
  @js.native
  val Pointed: Pointed2[typingsJapgolly.fpTs.libReaderMod.URI] = js.native
  
  @JSImport("fp-ts/es6/index", "reader.Profunctor")
  @js.native
  val Profunctor: Profunctor2[typingsJapgolly.fpTs.libReaderMod.URI] = js.native
  
  @JSImport("fp-ts/es6/index", "reader.Strong")
  @js.native
  val Strong: Strong2[typingsJapgolly.fpTs.libReaderMod.URI] = js.native
  
  @JSImport("fp-ts/es6/index", "reader.URI")
  @js.native
  val URI: /* "Reader" */ String = js.native
  
  inline def ap[R, A](fa: Reader_[R, A]): js.Function1[/* fab */ Reader_[R, js.Function1[/* a */ A, Any]], Reader_[R, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ Reader_[R, js.Function1[/* a */ A, Any]], Reader_[R, Any]]]
  
  inline def apFirst[E, B](second: Reader_[E, B]): js.Function1[/* first */ Reader_[E, Any], Reader_[E, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirst")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ Reader_[E, Any], Reader_[E, Any]]]
  
  inline def apFirstW[R2, B](second: Reader_[R2, B]): js.Function1[/* first */ Reader_[Any, Any], Reader_[Any & R2, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirstW")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ Reader_[Any, Any], Reader_[Any & R2, Any]]]
  
  inline def apS[N /* <: String */, A, E, B](name: Exclude[N, /* keyof A */ String], fb: Reader_[E, B]): js.Function1[
    /* fa */ Reader_[E, A], 
    Reader_[
      E, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apS")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ Reader_[E, A], 
    Reader_[
      E, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def apSW[A, N /* <: String */, R2, B](name: Exclude[N, /* keyof A */ String], fb: Reader_[R2, B]): js.Function1[
    /* fa */ Reader_[Any, A], 
    Reader_[
      Any & R2, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apSW")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ Reader_[Any, A], 
    Reader_[
      Any & R2, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def apSecond[E, B](second: Reader_[E, B]): js.Function1[/* first */ Reader_[E, Any], Reader_[E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecond")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ Reader_[E, Any], Reader_[E, B]]]
  
  inline def apSecondW[R2, B](second: Reader_[R2, B]): js.Function1[/* first */ Reader_[Any, Any], Reader_[Any & R2, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecondW")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ Reader_[Any, Any], Reader_[Any & R2, B]]]
  
  inline def apW[R2, A](fa: Reader_[R2, A]): js.Function1[/* fab */ Reader_[Any, js.Function1[/* a */ A, Any]], Reader_[Any & R2, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apW")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ Reader_[Any, js.Function1[/* a */ A, Any]], Reader_[Any & R2, Any]]]
  
  inline def ask[R](): Reader_[R, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("ask")().asInstanceOf[Reader_[R, R]]
  
  inline def asks[R, A](f: js.Function1[/* r */ R, A]): Reader_[R, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asks")(f.asInstanceOf[js.Any]).asInstanceOf[Reader_[R, A]]
  
  inline def asksReader[R, A](f: js.Function1[/* r */ R, Reader_[R, A]]): Reader_[R, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asksReader")(f.asInstanceOf[js.Any]).asInstanceOf[Reader_[R, A]]
  
  inline def asksReaderW[R1, R2, A](f: js.Function1[/* r1 */ R1, Reader_[R2, A]]): Reader_[R1 & R2, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asksReaderW")(f.asInstanceOf[js.Any]).asInstanceOf[Reader_[R1 & R2, A]]
  
  inline def bind[N /* <: String */, A, E, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, Reader_[E, B]]): js.Function1[
    /* ma */ Reader_[E, A], 
    Reader_[
      E, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* ma */ Reader_[E, A], 
    Reader_[
      E, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def bindTo[N /* <: String */](name: N): js.Function1[
    /* fa */ Reader_[Any, Any], 
    Reader_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N ]: any} */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ Reader_[Any, Any], 
    Reader_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N ]: any} */ js.Any
    ]
  ]]
  
  inline def bindW[N /* <: String */, A, R2, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, Reader_[R2, B]]): js.Function1[
    /* fa */ Reader_[Any, A], 
    Reader_[
      Any & R2, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindW")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ Reader_[Any, A], 
    Reader_[
      Any & R2, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def chain[A, R, B](f: js.Function1[/* a */ A, Reader_[R, B]]): js.Function1[/* ma */ Reader_[R, A], Reader_[R, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Reader_[R, A], Reader_[R, B]]]
  
  inline def chainFirst[A, R, B](f: js.Function1[/* a */ A, Reader_[R, B]]): js.Function1[/* first */ Reader_[R, A], Reader_[R, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirst")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ Reader_[R, A], Reader_[R, A]]]
  
  inline def chainFirstW[R2, A, B](f: js.Function1[/* a */ A, Reader_[R2, B]]): js.Function1[/* ma */ Reader_[Any, A], Reader_[Any & R2, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Reader_[Any, A], Reader_[Any & R2, A]]]
  
  inline def chainW[R2, A, B](f: js.Function1[/* a */ A, Reader_[R2, B]]): js.Function1[/* ma */ Reader_[Any, A], Reader_[Any & R2, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Reader_[Any, A], Reader_[Any & R2, B]]]
  
  inline def compose[A, B](ab: Reader_[A, B]): js.Function1[/* bc */ Reader_[B, Any], Reader_[A, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* bc */ Reader_[B, Any], Reader_[A, Any]]]
  
  @JSImport("fp-ts/es6/index", "reader.first")
  @js.native
  val first: js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, [A, C], [B, C]> */ Any
  ] = js.native
  
  inline def flap[A](a: A): js.Function1[/* fab */ Reader_[Any, js.Function1[/* a */ A, Any]], Reader_[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ Reader_[Any, js.Function1[/* a */ A, Any]], Reader_[Any, Any]]]
  
  inline def flatten[R, A](mma: Reader_[R, Reader_[R, A]]): Reader_[R, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(mma.asInstanceOf[js.Any]).asInstanceOf[Reader_[R, A]]
  
  inline def flattenW[R1, R2, A](mma: Reader_[R1, Reader_[R2, A]]): Reader_[R1 & R2, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenW")(mma.asInstanceOf[js.Any]).asInstanceOf[Reader_[R1 & R2, A]]
  
  inline def getMonoid[R, A](M: Monoid[A]): Monoid[Reader_[R, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonoid")(M.asInstanceOf[js.Any]).asInstanceOf[Monoid[Reader_[R, A]]]
  
  inline def getSemigroup[R, A](S: Semigroup[A]): Semigroup[Reader_[R, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")(S.asInstanceOf[js.Any]).asInstanceOf[Semigroup[Reader_[R, A]]]
  
  @JSImport("fp-ts/es6/index", "reader.id")
  @js.native
  val id: js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, A> */ Any
  ] = js.native
  
  @JSImport("fp-ts/es6/index", "reader.left")
  @js.native
  val left: js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, Either<A, C>, Either<B, C>> */ Any
  ] = js.native
  
  inline def let[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, B]): js.Function1[
    /* fa */ Reader_[Any, A], 
    Reader_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("let")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ Reader_[Any, A], 
    Reader_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def local[R2, R1](f: js.Function1[/* r2 */ R2, R1]): js.Function1[/* ma */ Reader_[R1, Any], Reader_[R2, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("local")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Reader_[R1, Any], Reader_[R2, Any]]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ Reader_[Any, A], Reader_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Reader_[Any, A], Reader_[Any, B]]]
  
  inline def of[R, A](a: A): Reader_[R, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any]).asInstanceOf[Reader_[R, A]]
  
  inline def promap[E, A, D, B](f: js.Function1[/* d */ D, E], g: js.Function1[/* a */ A, B]): js.Function1[/* fea */ Reader_[E, A], Reader_[D, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("promap")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fea */ Reader_[E, A], Reader_[D, B]]]
  
  @JSImport("fp-ts/es6/index", "reader.reader")
  @js.native
  val reader: Monad2[typingsJapgolly.fpTs.libReaderMod.URI] & Profunctor2[typingsJapgolly.fpTs.libReaderMod.URI] & Category2[typingsJapgolly.fpTs.libReaderMod.URI] & Strong2[typingsJapgolly.fpTs.libReaderMod.URI] & Choice2[typingsJapgolly.fpTs.libReaderMod.URI] = js.native
  
  @JSImport("fp-ts/es6/index", "reader.right")
  @js.native
  val right: js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, B, C> */ /* pbc */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, Either<A, B>, Either<A, C>> */ Any
  ] = js.native
  
  @JSImport("fp-ts/es6/index", "reader.second")
  @js.native
  val second: js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, B, C> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, [A, B], [A, C]> */ Any
  ] = js.native
  
  inline def sequenceArray[R, A](arr: js.Array[Reader_[R, A]]): Reader_[R, js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceArray")(arr.asInstanceOf[js.Any]).asInstanceOf[Reader_[R, js.Array[A]]]
  
  inline def traverseArray[R, A, B](f: js.Function1[/* a */ A, Reader_[R, B]]): js.Function1[/* as */ js.Array[A], Reader_[R, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseArray")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], Reader_[R, js.Array[B]]]]
  
  inline def traverseArrayWithIndex[R, A, B](f: js.Function2[/* index */ Double, /* a */ A, Reader_[R, B]]): js.Function1[/* as */ js.Array[A], Reader_[R, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], Reader_[R, js.Array[B]]]]
  
  inline def traverseReadonlyArrayWithIndex[A, R, B](f: js.Function2[/* index */ Double, /* a */ A, Reader_[R, B]]): js.Function1[/* as */ js.Array[A], Reader_[R, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], Reader_[R, js.Array[B]]]]
  
  inline def traverseReadonlyNonEmptyArrayWithIndex[A, R, B](f: js.Function2[/* index */ Double, /* a */ A, Reader_[R, B]]): js.Function1[/* as */ ReadonlyNonEmptyArray_[A], Reader_[R, ReadonlyNonEmptyArray_[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyNonEmptyArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ ReadonlyNonEmptyArray_[A], Reader_[R, ReadonlyNonEmptyArray_[B]]]]
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind2[E, A] extends StObject
  }
}
