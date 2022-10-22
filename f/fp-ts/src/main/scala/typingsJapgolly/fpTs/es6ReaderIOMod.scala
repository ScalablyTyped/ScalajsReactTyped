package typingsJapgolly.fpTs

import typingsJapgolly.fpTs.libApplicativeMod.Applicative2
import typingsJapgolly.fpTs.libApplyMod.Apply2
import typingsJapgolly.fpTs.libChainMod.Chain2
import typingsJapgolly.fpTs.libFromIOMod.FromIO2
import typingsJapgolly.fpTs.libFromReaderMod.FromReader2
import typingsJapgolly.fpTs.libFunctorMod.Functor2
import typingsJapgolly.fpTs.libIOMod.IO_
import typingsJapgolly.fpTs.libMonadIOMod.MonadIO2
import typingsJapgolly.fpTs.libMonadMod.Monad2
import typingsJapgolly.fpTs.libPointedMod.Pointed2
import typingsJapgolly.fpTs.libReaderIOMod.ReaderIO
import typingsJapgolly.fpTs.libReaderMod.Reader_
import typingsJapgolly.fpTs.libReadonlyNonEmptyArrayMod.ReadonlyNonEmptyArray_
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object es6ReaderIOMod {
  
  @JSImport("fp-ts/es6/ReaderIO", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/es6/ReaderIO", "ApT")
  @js.native
  val ApT: ReaderIO[Any, js.Array[Any]] = js.native
  
  @JSImport("fp-ts/es6/ReaderIO", "Applicative")
  @js.native
  val Applicative: Applicative2[typingsJapgolly.fpTs.libReaderIOMod.URI] = js.native
  
  @JSImport("fp-ts/es6/ReaderIO", "Apply")
  @js.native
  val Apply: Apply2[typingsJapgolly.fpTs.libReaderIOMod.URI] = js.native
  
  @JSImport("fp-ts/es6/ReaderIO", "Chain")
  @js.native
  val Chain_ : Chain2[typingsJapgolly.fpTs.libReaderIOMod.URI] = js.native
  
  @JSImport("fp-ts/es6/ReaderIO", "Do")
  @js.native
  val Do: ReaderIO[Any, js.Object] = js.native
  
  @JSImport("fp-ts/es6/ReaderIO", "FromIO")
  @js.native
  val FromIO_ : FromIO2[typingsJapgolly.fpTs.libReaderIOMod.URI] = js.native
  
  @JSImport("fp-ts/es6/ReaderIO", "FromReader")
  @js.native
  val FromReader_ : FromReader2[typingsJapgolly.fpTs.libReaderIOMod.URI] = js.native
  
  @JSImport("fp-ts/es6/ReaderIO", "Functor")
  @js.native
  val Functor: Functor2[typingsJapgolly.fpTs.libReaderIOMod.URI] = js.native
  
  @JSImport("fp-ts/es6/ReaderIO", "Monad")
  @js.native
  val Monad: Monad2[typingsJapgolly.fpTs.libReaderIOMod.URI] = js.native
  
  @JSImport("fp-ts/es6/ReaderIO", "MonadIO")
  @js.native
  val MonadIO: MonadIO2[typingsJapgolly.fpTs.libReaderIOMod.URI] = js.native
  
  @JSImport("fp-ts/es6/ReaderIO", "Pointed")
  @js.native
  val Pointed: Pointed2[typingsJapgolly.fpTs.libReaderIOMod.URI] = js.native
  
  @JSImport("fp-ts/es6/ReaderIO", "URI")
  @js.native
  val URI: /* "ReaderIO" */ String = js.native
  
  inline def ap[R, A](fa: ReaderIO[R, A]): js.Function1[/* fab */ ReaderIO[R, js.Function1[/* a */ A, Any]], ReaderIO[R, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ ReaderIO[R, js.Function1[/* a */ A, Any]], ReaderIO[R, Any]]]
  
  inline def apFirst[E, B](second: ReaderIO[E, B]): js.Function1[/* first */ ReaderIO[E, Any], ReaderIO[E, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirst")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ ReaderIO[E, Any], ReaderIO[E, Any]]]
  
  inline def apS[N /* <: String */, A, E, B](name: Exclude[N, /* keyof A */ String], fb: ReaderIO[E, B]): js.Function1[
    /* fa */ ReaderIO[E, A], 
    ReaderIO[
      E, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apS")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ ReaderIO[E, A], 
    ReaderIO[
      E, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def apSW[N /* <: String */, A, R2, B](name: Exclude[N, /* keyof A */ String], fb: ReaderIO[R2, B]): js.Function1[
    /* fa */ ReaderIO[Any, A], 
    ReaderIO[
      Any & R2, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apSW")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ ReaderIO[Any, A], 
    ReaderIO[
      Any & R2, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def apSecond[E, B](second: ReaderIO[E, B]): js.Function1[/* first */ ReaderIO[E, Any], ReaderIO[E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecond")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ ReaderIO[E, Any], ReaderIO[E, B]]]
  
  inline def apW[R2, A](fa: ReaderIO[R2, A]): js.Function1[/* fab */ ReaderIO[Any, js.Function1[/* a */ A, Any]], ReaderIO[Any & R2, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apW")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ ReaderIO[Any, js.Function1[/* a */ A, Any]], ReaderIO[Any & R2, Any]]]
  
  inline def ask[R](): ReaderIO[R, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("ask")().asInstanceOf[ReaderIO[R, R]]
  
  inline def asks[R, A](f: js.Function1[/* r */ R, A]): ReaderIO[R, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asks")(f.asInstanceOf[js.Any]).asInstanceOf[ReaderIO[R, A]]
  
  inline def asksReaderIO[R, A](f: js.Function1[/* r */ R, ReaderIO[R, A]]): ReaderIO[R, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asksReaderIO")(f.asInstanceOf[js.Any]).asInstanceOf[ReaderIO[R, A]]
  
  inline def asksReaderIOW[R1, R2, A](f: js.Function1[/* r1 */ R1, ReaderIO[R2, A]]): ReaderIO[R1 & R2, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asksReaderIOW")(f.asInstanceOf[js.Any]).asInstanceOf[ReaderIO[R1 & R2, A]]
  
  inline def bind[N /* <: String */, A, E, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, ReaderIO[E, B]]): js.Function1[
    /* ma */ ReaderIO[E, A], 
    ReaderIO[
      E, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* ma */ ReaderIO[E, A], 
    ReaderIO[
      E, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def bindTo[N /* <: String */](name: N): js.Function1[
    /* fa */ ReaderIO[Any, Any], 
    ReaderIO[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N ]: any} */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ ReaderIO[Any, Any], 
    ReaderIO[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N ]: any} */ js.Any
    ]
  ]]
  
  inline def bindW[N /* <: String */, A, R2, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, ReaderIO[R2, B]]): js.Function1[
    /* fa */ ReaderIO[Any, A], 
    ReaderIO[
      Any & R2, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindW")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ ReaderIO[Any, A], 
    ReaderIO[
      Any & R2, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def chain[A, R, B](f: js.Function1[/* a */ A, ReaderIO[R, B]]): js.Function1[/* ma */ ReaderIO[R, A], ReaderIO[R, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderIO[R, A], ReaderIO[R, B]]]
  
  inline def chainFirst[A, R, B](f: js.Function1[/* a */ A, ReaderIO[R, B]]): js.Function1[/* first */ ReaderIO[R, A], ReaderIO[R, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirst")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ ReaderIO[R, A], ReaderIO[R, A]]]
  
  inline def chainFirstIOK[A, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* first */ ReaderIO[Any, A], ReaderIO[Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstIOK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ ReaderIO[Any, A], ReaderIO[Any, A]]]
  
  inline def chainFirstReaderK[A, R, B](f: js.Function1[/* a */ A, Reader_[R, B]]): js.Function1[/* ma */ ReaderIO[R, A], ReaderIO[R, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstReaderK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderIO[R, A], ReaderIO[R, A]]]
  
  inline def chainFirstReaderKW[A, R1, B](f: js.Function1[/* a */ A, Reader_[R1, B]]): js.Function1[/* ma */ ReaderIO[Any, A], ReaderIO[R1 & Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstReaderKW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderIO[Any, A], ReaderIO[R1 & Any, A]]]
  
  inline def chainFirstW[A, R2, B](f: js.Function1[/* a */ A, ReaderIO[R2, B]]): js.Function1[/* ma */ ReaderIO[Any, A], ReaderIO[Any & R2, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderIO[Any, A], ReaderIO[Any & R2, A]]]
  
  inline def chainIOK[A, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* first */ ReaderIO[Any, A], ReaderIO[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainIOK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ ReaderIO[Any, A], ReaderIO[Any, B]]]
  
  inline def chainReaderK[A, R, B](f: js.Function1[/* a */ A, Reader_[R, B]]): js.Function1[/* ma */ ReaderIO[R, A], ReaderIO[R, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainReaderK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderIO[R, A], ReaderIO[R, B]]]
  
  inline def chainReaderKW[A, R1, B](f: js.Function1[/* a */ A, Reader_[R1, B]]): js.Function1[/* ma */ ReaderIO[Any, A], ReaderIO[R1 & Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainReaderKW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderIO[Any, A], ReaderIO[R1 & Any, B]]]
  
  inline def chainW[A, R2, B](f: js.Function1[/* a */ A, ReaderIO[R2, B]]): js.Function1[/* ma */ ReaderIO[Any, A], ReaderIO[Any & R2, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderIO[Any, A], ReaderIO[Any & R2, B]]]
  
  inline def flap[A](a: A): js.Function1[/* fab */ ReaderIO[Any, js.Function1[/* a */ A, Any]], ReaderIO[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ ReaderIO[Any, js.Function1[/* a */ A, Any]], ReaderIO[Any, Any]]]
  
  inline def flatten[R, A](mma: ReaderIO[R, ReaderIO[R, A]]): ReaderIO[R, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(mma.asInstanceOf[js.Any]).asInstanceOf[ReaderIO[R, A]]
  
  inline def flattenW[R1, R2, A](mma: ReaderIO[R1, ReaderIO[R2, A]]): ReaderIO[R1 & R2, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenW")(mma.asInstanceOf[js.Any]).asInstanceOf[ReaderIO[R1 & R2, A]]
  
  inline def fromIO[A, R](fa: IO_[A]): ReaderIO[R, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIO")(fa.asInstanceOf[js.Any]).asInstanceOf[ReaderIO[R, A]]
  
  inline def fromIOK[A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* a */ A, ReaderIO[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIOK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, ReaderIO[Any, B]]]
  
  inline def fromReader[R, A](fa: Reader_[R, A]): ReaderIO[R, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromReader")(fa.asInstanceOf[js.Any]).asInstanceOf[ReaderIO[R, A]]
  
  inline def fromReaderK[A /* <: js.Array[Any] */, R, B](f: js.Function1[/* a */ A, Reader_[R, B]]): js.Function1[/* a */ A, ReaderIO[R, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromReaderK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, ReaderIO[R, B]]]
  
  inline def local[R2, R1](f: js.Function1[/* r2 */ R2, R1]): js.Function1[/* ma */ ReaderIO[R1, Any], ReaderIO[R2, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("local")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderIO[R1, Any], ReaderIO[R2, Any]]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ ReaderIO[Any, A], ReaderIO[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ ReaderIO[Any, A], ReaderIO[Any, B]]]
  
  inline def of[R, A](a: A): ReaderIO[R, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any]).asInstanceOf[ReaderIO[R, A]]
  
  inline def sequenceArray[R, A](arr: js.Array[ReaderIO[R, A]]): ReaderIO[R, js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceArray")(arr.asInstanceOf[js.Any]).asInstanceOf[ReaderIO[R, js.Array[A]]]
  
  inline def traverseArray[A, R, B](f: js.Function1[/* a */ A, ReaderIO[R, B]]): js.Function1[/* as */ js.Array[A], ReaderIO[R, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseArray")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], ReaderIO[R, js.Array[B]]]]
  
  inline def traverseArrayWithIndex[A, R, B](f: js.Function2[/* index */ Double, /* a */ A, ReaderIO[R, B]]): js.Function1[/* as */ js.Array[A], ReaderIO[R, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], ReaderIO[R, js.Array[B]]]]
  
  inline def traverseReadonlyArrayWithIndex[A, R, B](f: js.Function2[/* index */ Double, /* a */ A, ReaderIO[R, B]]): js.Function1[/* as */ js.Array[A], ReaderIO[R, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], ReaderIO[R, js.Array[B]]]]
  
  inline def traverseReadonlyNonEmptyArrayWithIndex[A, R, B](f: js.Function2[/* index */ Double, /* a */ A, ReaderIO[R, B]]): js.Function1[/* as */ ReadonlyNonEmptyArray_[A], ReaderIO[R, ReadonlyNonEmptyArray_[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyNonEmptyArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ ReadonlyNonEmptyArray_[A], ReaderIO[R, ReadonlyNonEmptyArray_[B]]]]
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind2[E, A] extends StObject
  }
}
