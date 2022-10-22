package typingsJapgolly.fpTs

import typingsJapgolly.fpTs.libApplicativeMod.Applicative1
import typingsJapgolly.fpTs.libApplyMod.Apply1
import typingsJapgolly.fpTs.libChainMod.Chain1
import typingsJapgolly.fpTs.libChainRecMod.ChainRec1
import typingsJapgolly.fpTs.libFromIOMod.FromIO1
import typingsJapgolly.fpTs.libFunctorMod.Functor1
import typingsJapgolly.fpTs.libIOMod.IO_
import typingsJapgolly.fpTs.libMonadIOMod.MonadIO1
import typingsJapgolly.fpTs.libMonadMod.Monad1
import typingsJapgolly.fpTs.libMonoidMod.Monoid
import typingsJapgolly.fpTs.libPointedMod.Pointed1
import typingsJapgolly.fpTs.libReadonlyNonEmptyArrayMod.ReadonlyNonEmptyArray_
import typingsJapgolly.fpTs.libSemigroupMod.Semigroup
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object iOMod {
  
  @JSImport("fp-ts/IO", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/IO", "ApT")
  @js.native
  val ApT: IO_[js.Array[Any]] = js.native
  
  @JSImport("fp-ts/IO", "Applicative")
  @js.native
  val Applicative: Applicative1[typingsJapgolly.fpTs.libIOMod.URI] = js.native
  
  @JSImport("fp-ts/IO", "Apply")
  @js.native
  val Apply: Apply1[typingsJapgolly.fpTs.libIOMod.URI] = js.native
  
  @JSImport("fp-ts/IO", "ChainRec")
  @js.native
  val ChainRec: ChainRec1[typingsJapgolly.fpTs.libIOMod.URI] = js.native
  
  @JSImport("fp-ts/IO", "Chain")
  @js.native
  val Chain_ : Chain1[typingsJapgolly.fpTs.libIOMod.URI] = js.native
  
  @JSImport("fp-ts/IO", "Do")
  @js.native
  val Do: IO_[js.Object] = js.native
  
  @JSImport("fp-ts/IO", "FromIO")
  @js.native
  val FromIO_ : FromIO1[typingsJapgolly.fpTs.libIOMod.URI] = js.native
  
  @JSImport("fp-ts/IO", "Functor")
  @js.native
  val Functor: Functor1[typingsJapgolly.fpTs.libIOMod.URI] = js.native
  
  @JSImport("fp-ts/IO", "Monad")
  @js.native
  val Monad: Monad1[typingsJapgolly.fpTs.libIOMod.URI] = js.native
  
  @JSImport("fp-ts/IO", "MonadIO")
  @js.native
  val MonadIO: MonadIO1[typingsJapgolly.fpTs.libIOMod.URI] = js.native
  
  @JSImport("fp-ts/IO", "Pointed")
  @js.native
  val Pointed: Pointed1[typingsJapgolly.fpTs.libIOMod.URI] = js.native
  
  @JSImport("fp-ts/IO", "URI")
  @js.native
  val URI: /* "IO" */ String = js.native
  
  inline def ap[A](fa: IO_[A]): js.Function1[/* fab */ IO_[js.Function1[/* a */ A, Any]], IO_[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ IO_[js.Function1[/* a */ A, Any]], IO_[Any]]]
  
  inline def apFirst[B](second: IO_[B]): js.Function1[/* first */ IO_[Any], IO_[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirst")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ IO_[Any], IO_[Any]]]
  
  inline def apS[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], fb: IO_[B]): js.Function1[
    /* fa */ IO_[A], 
    IO_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apS")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ IO_[A], 
    IO_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def apSecond[B](second: IO_[B]): js.Function1[/* first */ IO_[Any], IO_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecond")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ IO_[Any], IO_[B]]]
  
  inline def bind[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, IO_[B]]): js.Function1[
    /* ma */ IO_[A], 
    IO_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* ma */ IO_[A], 
    IO_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def bindTo[N /* <: String */](name: N): js.Function1[
    /* fa */ IO_[Any], 
    IO_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N ]: any} */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ IO_[Any], 
    IO_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N ]: any} */ js.Any
    ]
  ]]
  
  inline def chain[A, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* ma */ IO_[A], IO_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ IO_[A], IO_[B]]]
  
  inline def chainFirst[A, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* first */ IO_[A], IO_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirst")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ IO_[A], IO_[A]]]
  
  inline def flap[A](a: A): js.Function1[/* fab */ IO_[js.Function1[/* a */ A, Any]], IO_[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ IO_[js.Function1[/* a */ A, Any]], IO_[Any]]]
  
  inline def flatten[A](mma: IO_[IO_[A]]): IO_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(mma.asInstanceOf[js.Any]).asInstanceOf[IO_[A]]
  
  inline def fromIO[A](fa: IO_[A]): IO_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIO")(fa.asInstanceOf[js.Any]).asInstanceOf[IO_[A]]
  
  inline def getMonoid[A](M: Monoid[A]): Monoid[IO_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonoid")(M.asInstanceOf[js.Any]).asInstanceOf[Monoid[IO_[A]]]
  
  inline def getSemigroup[A](S: Semigroup[A]): Semigroup[IO_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")(S.asInstanceOf[js.Any]).asInstanceOf[Semigroup[IO_[A]]]
  
  @JSImport("fp-ts/IO", "io")
  @js.native
  val io: Monad1[typingsJapgolly.fpTs.libIOMod.URI] & MonadIO1[typingsJapgolly.fpTs.libIOMod.URI] & ChainRec1[typingsJapgolly.fpTs.libIOMod.URI] = js.native
  
  inline def let[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, B]): js.Function1[
    /* fa */ IO_[A], 
    IO_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("let")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ IO_[A], 
    IO_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ IO_[A], IO_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ IO_[A], IO_[B]]]
  
  inline def of[A](a: A): IO_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any]).asInstanceOf[IO_[A]]
  
  inline def sequenceArray[A](arr: js.Array[IO_[A]]): IO_[js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceArray")(arr.asInstanceOf[js.Any]).asInstanceOf[IO_[js.Array[A]]]
  
  inline def traverseArray[A, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* as */ js.Array[A], IO_[js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseArray")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], IO_[js.Array[B]]]]
  
  inline def traverseArrayWithIndex[A, B](f: js.Function2[/* index */ Double, /* a */ A, IO_[B]]): js.Function1[/* as */ js.Array[A], IO_[js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], IO_[js.Array[B]]]]
  
  inline def traverseReadonlyArrayWithIndex[A, B](f: js.Function2[/* index */ Double, /* a */ A, IO_[B]]): js.Function1[/* as */ js.Array[A], IO_[js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], IO_[js.Array[B]]]]
  
  inline def traverseReadonlyNonEmptyArrayWithIndex[A, B](f: js.Function2[/* index */ Double, /* a */ A, IO_[B]]): js.Function1[/* as */ ReadonlyNonEmptyArray_[A], IO_[ReadonlyNonEmptyArray_[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyNonEmptyArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ ReadonlyNonEmptyArray_[A], IO_[ReadonlyNonEmptyArray_[B]]]]
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
}
