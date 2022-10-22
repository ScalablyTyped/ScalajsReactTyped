package typingsJapgolly.fpTs

import typingsJapgolly.fpTs.libApplicativeMod.Applicative2
import typingsJapgolly.fpTs.libApplyMod.Apply2
import typingsJapgolly.fpTs.libChainMod.Chain2
import typingsJapgolly.fpTs.libFromStateMod.FromState2
import typingsJapgolly.fpTs.libFunctorMod.Functor2
import typingsJapgolly.fpTs.libMonadMod.Monad2
import typingsJapgolly.fpTs.libPointedMod.Pointed2
import typingsJapgolly.fpTs.libReadonlyNonEmptyArrayMod.ReadonlyNonEmptyArray_
import typingsJapgolly.fpTs.libStateMod.State_
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object es6StateMod {
  
  @JSImport("fp-ts/es6/State", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/es6/State", "Applicative")
  @js.native
  val Applicative: Applicative2[typingsJapgolly.fpTs.libStateMod.URI] = js.native
  
  @JSImport("fp-ts/es6/State", "Apply")
  @js.native
  val Apply: Apply2[typingsJapgolly.fpTs.libStateMod.URI] = js.native
  
  @JSImport("fp-ts/es6/State", "Chain")
  @js.native
  val Chain_ : Chain2[typingsJapgolly.fpTs.libStateMod.URI] = js.native
  
  @JSImport("fp-ts/es6/State", "FromState")
  @js.native
  val FromState: FromState2[typingsJapgolly.fpTs.libStateMod.URI] = js.native
  
  @JSImport("fp-ts/es6/State", "Functor")
  @js.native
  val Functor: Functor2[typingsJapgolly.fpTs.libStateMod.URI] = js.native
  
  @JSImport("fp-ts/es6/State", "Monad")
  @js.native
  val Monad: Monad2[typingsJapgolly.fpTs.libStateMod.URI] = js.native
  
  @JSImport("fp-ts/es6/State", "Pointed")
  @js.native
  val Pointed: Pointed2[typingsJapgolly.fpTs.libStateMod.URI] = js.native
  
  @JSImport("fp-ts/es6/State", "URI")
  @js.native
  val URI: /* "State" */ String = js.native
  
  inline def ap[E, A](fa: State_[E, A]): js.Function1[/* fab */ State_[E, js.Function1[/* a */ A, Any]], State_[E, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ State_[E, js.Function1[/* a */ A, Any]], State_[E, Any]]]
  
  inline def apFirst[E, B](second: State_[E, B]): js.Function1[/* first */ State_[E, Any], State_[E, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirst")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ State_[E, Any], State_[E, Any]]]
  
  inline def apS[N /* <: String */, A, E, B](name: Exclude[N, /* keyof A */ String], fb: State_[E, B]): js.Function1[
    /* fa */ State_[E, A], 
    State_[
      E, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apS")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ State_[E, A], 
    State_[
      E, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def apSecond[E, B](second: State_[E, B]): js.Function1[/* first */ State_[E, Any], State_[E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecond")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ State_[E, Any], State_[E, B]]]
  
  inline def bind[N /* <: String */, A, E, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, State_[E, B]]): js.Function1[
    /* ma */ State_[E, A], 
    State_[
      E, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* ma */ State_[E, A], 
    State_[
      E, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def bindTo[N /* <: String */](name: N): js.Function1[
    /* fa */ State_[Any, Any], 
    State_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N ]: any} */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ State_[Any, Any], 
    State_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N ]: any} */ js.Any
    ]
  ]]
  
  inline def chain[E, A, B](f: js.Function1[/* a */ A, State_[E, B]]): js.Function1[/* ma */ State_[E, A], State_[E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ State_[E, A], State_[E, B]]]
  
  inline def chainFirst[S, A, B](f: js.Function1[/* a */ A, State_[S, B]]): js.Function1[/* ma */ State_[S, A], State_[S, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirst")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ State_[S, A], State_[S, A]]]
  
  inline def evalState[S, A](ma: State_[S, A], s: S): A = (^.asInstanceOf[js.Dynamic].applyDynamic("evalState")(ma.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[A]
  
  inline def evaluate[S](s: S): js.Function1[/* ma */ State_[S, Any], Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("evaluate")(s.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ State_[S, Any], Any]]
  
  inline def execState[S, A](ma: State_[S, A], s: S): S = (^.asInstanceOf[js.Dynamic].applyDynamic("execState")(ma.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[S]
  
  inline def execute[S](s: S): js.Function1[/* ma */ State_[S, Any], S] = ^.asInstanceOf[js.Dynamic].applyDynamic("execute")(s.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ State_[S, Any], S]]
  
  inline def flap[A](a: A): js.Function1[/* fab */ State_[Any, js.Function1[/* a */ A, Any]], State_[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ State_[Any, js.Function1[/* a */ A, Any]], State_[Any, Any]]]
  
  inline def flatten[E, A](mma: State_[E, State_[E, A]]): State_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(mma.asInstanceOf[js.Any]).asInstanceOf[State_[E, A]]
  
  inline def get[S](): State_[S, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[State_[S, S]]
  
  inline def gets[S, A](f: js.Function1[/* s */ S, A]): State_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("gets")(f.asInstanceOf[js.Any]).asInstanceOf[State_[S, A]]
  
  inline def let[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, B]): js.Function1[
    /* fa */ State_[Any, A], 
    State_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("let")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ State_[Any, A], 
    State_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ State_[Any, A], State_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ State_[Any, A], State_[Any, B]]]
  
  inline def modify[S](f: js.Function1[/* s */ S, S]): State_[S, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("modify")(f.asInstanceOf[js.Any]).asInstanceOf[State_[S, Unit]]
  
  inline def of[S, A](a: A): State_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any]).asInstanceOf[State_[S, A]]
  
  inline def put[S](s: S): State_[S, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("put")(s.asInstanceOf[js.Any]).asInstanceOf[State_[S, Unit]]
  
  inline def sequenceArray[S, A](arr: js.Array[State_[S, A]]): State_[S, js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceArray")(arr.asInstanceOf[js.Any]).asInstanceOf[State_[S, js.Array[A]]]
  
  @JSImport("fp-ts/es6/State", "state")
  @js.native
  val state: Monad2[typingsJapgolly.fpTs.libStateMod.URI] = js.native
  
  inline def traverseArray[A, S, B](f: js.Function1[/* a */ A, State_[S, B]]): js.Function1[/* as */ js.Array[A], State_[S, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseArray")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], State_[S, js.Array[B]]]]
  
  inline def traverseArrayWithIndex[A, S, B](f: js.Function2[/* index */ Double, /* a */ A, State_[S, B]]): js.Function1[/* as */ js.Array[A], State_[S, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], State_[S, js.Array[B]]]]
  
  inline def traverseReadonlyArrayWithIndex[A, S, B](f: js.Function2[/* index */ Double, /* a */ A, State_[S, B]]): js.Function1[/* as */ js.Array[A], State_[S, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], State_[S, js.Array[B]]]]
  
  inline def traverseReadonlyNonEmptyArrayWithIndex[A, S, B](f: js.Function2[/* index */ Double, /* a */ A, State_[S, B]]): js.Function1[/* as */ ReadonlyNonEmptyArray_[A], State_[S, ReadonlyNonEmptyArray_[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyNonEmptyArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ ReadonlyNonEmptyArray_[A], State_[S, ReadonlyNonEmptyArray_[B]]]]
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind2[E, A] extends StObject
  }
}
