package typingsJapgolly.fpTs

import typingsJapgolly.fpTs.fpTsStrings.TaskThese
import typingsJapgolly.fpTs.libApplicativeMod.Applicative2C
import typingsJapgolly.fpTs.libApplyMod.Apply1
import typingsJapgolly.fpTs.libApplyMod.Apply2C
import typingsJapgolly.fpTs.libBifunctorMod.Bifunctor2
import typingsJapgolly.fpTs.libChainMod.Chain2C
import typingsJapgolly.fpTs.libEitherMod.Either_
import typingsJapgolly.fpTs.libFromEitherMod.FromEither2
import typingsJapgolly.fpTs.libFromIOMod.FromIO2
import typingsJapgolly.fpTs.libFromTaskMod.FromTask2
import typingsJapgolly.fpTs.libFromTheseMod.FromThese2
import typingsJapgolly.fpTs.libFunctionMod.Lazy
import typingsJapgolly.fpTs.libFunctorMod.Functor2
import typingsJapgolly.fpTs.libIOMod.IO_
import typingsJapgolly.fpTs.libIoeitherMod.IOEither_
import typingsJapgolly.fpTs.libMonadMod.Monad2C
import typingsJapgolly.fpTs.libMonadTaskMod.MonadTask2C
import typingsJapgolly.fpTs.libOptionMod.Option_
import typingsJapgolly.fpTs.libPointedMod.Pointed2
import typingsJapgolly.fpTs.libPredicateMod.Predicate
import typingsJapgolly.fpTs.libReadonlyNonEmptyArrayMod.ReadonlyNonEmptyArray_
import typingsJapgolly.fpTs.libRefinementMod.Refinement
import typingsJapgolly.fpTs.libSemigroupMod.Semigroup
import typingsJapgolly.fpTs.libTaskMod.Task_
import typingsJapgolly.fpTs.libTheseMod.These_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTaskTheseMod {
  
  @JSImport("fp-ts/lib/TaskThese", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/TaskThese", "ApT")
  @js.native
  val ApT: TaskThese_[scala.Nothing, js.Array[Any]] = js.native
  
  @JSImport("fp-ts/lib/TaskThese", "Bifunctor")
  @js.native
  val Bifunctor: Bifunctor2[typingsJapgolly.fpTs.libTaskTheseMod.URI] = js.native
  
  @JSImport("fp-ts/lib/TaskThese", "FromEither")
  @js.native
  val FromEither_ : FromEither2[typingsJapgolly.fpTs.libTaskTheseMod.URI] = js.native
  
  @JSImport("fp-ts/lib/TaskThese", "FromIO")
  @js.native
  val FromIO_ : FromIO2[typingsJapgolly.fpTs.libTaskTheseMod.URI] = js.native
  
  @JSImport("fp-ts/lib/TaskThese", "FromTask")
  @js.native
  val FromTask_ : FromTask2[typingsJapgolly.fpTs.libTaskTheseMod.URI] = js.native
  
  @JSImport("fp-ts/lib/TaskThese", "FromThese")
  @js.native
  val FromThese_ : FromThese2[typingsJapgolly.fpTs.libTaskTheseMod.URI] = js.native
  
  @JSImport("fp-ts/lib/TaskThese", "Functor")
  @js.native
  val Functor: Functor2[typingsJapgolly.fpTs.libTaskTheseMod.URI] = js.native
  
  @JSImport("fp-ts/lib/TaskThese", "Pointed")
  @js.native
  val Pointed: Pointed2[typingsJapgolly.fpTs.libTaskTheseMod.URI] = js.native
  
  @JSImport("fp-ts/lib/TaskThese", "URI")
  @js.native
  val URI: /* "TaskThese" */ String = js.native
  type URI = /* "TaskThese" */ String
  
  @JSImport("fp-ts/lib/TaskThese", "bifunctorTaskThese")
  @js.native
  val bifunctorTaskThese: Bifunctor2[typingsJapgolly.fpTs.libTaskTheseMod.URI] = js.native
  
  inline def bimap[E, G, A, B](f: js.Function1[/* e */ E, G], g: js.Function1[/* a */ A, B]): js.Function1[/* fa */ TaskThese_[E, A], TaskThese_[G, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bimap")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ TaskThese_[E, A], TaskThese_[G, B]]]
  
  inline def both[E, A](e: E, a: A): TaskThese_[E, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("both")(e.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[TaskThese_[E, A]]
  
  inline def flap[A](a: A): js.Function1[/* fab */ TaskThese_[Any, js.Function1[/* a */ A, Any]], TaskThese_[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ TaskThese_[Any, js.Function1[/* a */ A, Any]], TaskThese_[Any, Any]]]
  
  inline def fold[E, B, A](
    onLeft: js.Function1[/* e */ E, Task_[B]],
    onRight: js.Function1[/* a */ A, Task_[B]],
    onBoth: js.Function2[/* e */ E, /* a */ A, Task_[B]]
  ): js.Function1[/* fa */ TaskThese_[E, A], Task_[B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fold")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any], onBoth.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ TaskThese_[E, A], Task_[B]]]
  
  inline def foldW[E, B, A, C, D](
    onLeft: js.Function1[/* e */ E, Task_[B]],
    onRight: js.Function1[/* a */ A, Task_[C]],
    onBoth: js.Function2[/* e */ E, /* a */ A, Task_[D]]
  ): js.Function1[/* fa */ TaskThese_[E, A], Task_[B | C | D]] = (^.asInstanceOf[js.Dynamic].applyDynamic("foldW")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any], onBoth.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ TaskThese_[E, A], Task_[B | C | D]]]
  
  inline def fromEither[E, A](fa: Either_[E, A]): TaskThese_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEither")(fa.asInstanceOf[js.Any]).asInstanceOf[TaskThese_[E, A]]
  
  inline def fromIO[A, E](fa: IO_[A]): TaskThese_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIO")(fa.asInstanceOf[js.Any]).asInstanceOf[TaskThese_[E, A]]
  
  inline def fromIOEither[E, A](fa: IOEither_[E, A]): TaskThese_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIOEither")(fa.asInstanceOf[js.Any]).asInstanceOf[TaskThese_[E, A]]
  
  inline def fromIOK[A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* a */ A, TaskThese_[scala.Nothing, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIOK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, TaskThese_[scala.Nothing, B]]]
  
  inline def fromOption[E](onNone: Lazy[E]): js.Function1[/* fa */ Option_[Any], TaskThese_[E, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOption")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Option_[Any], TaskThese_[E, Any]]]
  
  inline def fromOptionK[E](onNone: Lazy[E]): js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Option_[Any]], 
    js.Function1[/* a */ js.Array[Any], TaskThese_[E, Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOptionK")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Option_[Any]], 
    js.Function1[/* a */ js.Array[Any], TaskThese_[E, Any]]
  ]]
  
  inline def fromPredicate[A, E](predicate: Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* b */ A, TaskThese_[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(predicate.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* b */ A, TaskThese_[E, A]]]
  
  inline def fromPredicate_ABE[A, B /* <: A */, E](refinement: Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* a */ A, TaskThese_[E, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(refinement.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, TaskThese_[E, B]]]
  
  inline def fromTask[A, E](fa: Task_[A]): TaskThese_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTask")(fa.asInstanceOf[js.Any]).asInstanceOf[TaskThese_[E, A]]
  
  inline def fromTaskK[A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, Task_[B]]): js.Function1[/* a */ A, TaskThese_[scala.Nothing, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTaskK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, TaskThese_[scala.Nothing, B]]]
  
  inline def fromThese[E, A](fa: These_[E, A]): TaskThese_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromThese")(fa.asInstanceOf[js.Any]).asInstanceOf[TaskThese_[E, A]]
  
  inline def fromTheseK[A /* <: js.Array[Any] */, E, B](f: js.Function1[/* a */ A, These_[E, B]]): js.Function1[/* a */ A, TaskThese_[E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTheseK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, TaskThese_[E, B]]]
  
  @JSImport("fp-ts/lib/TaskThese", "functorTaskThese")
  @js.native
  val functorTaskThese: Functor2[typingsJapgolly.fpTs.libTaskTheseMod.URI] = js.native
  
  inline def getApplicative[E](A: Apply1[typingsJapgolly.fpTs.libTaskMod.URI], S: Semigroup[E]): Applicative2C[typingsJapgolly.fpTs.libTaskTheseMod.URI, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("getApplicative")(A.asInstanceOf[js.Any], S.asInstanceOf[js.Any])).asInstanceOf[Applicative2C[typingsJapgolly.fpTs.libTaskTheseMod.URI, E]]
  
  inline def getApply[E](A: Apply1[typingsJapgolly.fpTs.libTaskMod.URI], S: Semigroup[E]): Apply2C[TaskThese, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("getApply")(A.asInstanceOf[js.Any], S.asInstanceOf[js.Any])).asInstanceOf[Apply2C[TaskThese, E]]
  
  inline def getChain[E](S: Semigroup[E]): Chain2C[typingsJapgolly.fpTs.libTaskTheseMod.URI, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChain")(S.asInstanceOf[js.Any]).asInstanceOf[Chain2C[typingsJapgolly.fpTs.libTaskTheseMod.URI, E]]
  
  inline def getMonad[E](S: Semigroup[E]): (Monad2C[typingsJapgolly.fpTs.libTaskTheseMod.URI, E]) & (MonadTask2C[typingsJapgolly.fpTs.libTaskTheseMod.URI, E]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonad")(S.asInstanceOf[js.Any]).asInstanceOf[(Monad2C[typingsJapgolly.fpTs.libTaskTheseMod.URI, E]) & (MonadTask2C[typingsJapgolly.fpTs.libTaskTheseMod.URI, E])]
  
  inline def getSemigroup[E, A](SE: Semigroup[E], SA: Semigroup[A]): Semigroup[TaskThese_[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")(SE.asInstanceOf[js.Any], SA.asInstanceOf[js.Any])).asInstanceOf[Semigroup[TaskThese_[E, A]]]
  
  inline def left[E, A](e: E): TaskThese_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(e.asInstanceOf[js.Any]).asInstanceOf[TaskThese_[E, A]]
  
  inline def leftIO[E, A](me: IO_[E]): TaskThese_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftIO")(me.asInstanceOf[js.Any]).asInstanceOf[TaskThese_[E, A]]
  
  inline def leftTask[E, A](me: Task_[E]): TaskThese_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftTask")(me.asInstanceOf[js.Any]).asInstanceOf[TaskThese_[E, A]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ TaskThese_[Any, A], TaskThese_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ TaskThese_[Any, A], TaskThese_[Any, B]]]
  
  inline def mapLeft[E, G](f: js.Function1[/* e */ E, G]): js.Function1[/* fa */ TaskThese_[E, Any], TaskThese_[G, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeft")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ TaskThese_[E, Any], TaskThese_[G, Any]]]
  
  inline def `match`[E, B, A](
    onLeft: js.Function1[/* e */ E, B],
    onRight: js.Function1[/* a */ A, B],
    onBoth: js.Function2[/* e */ E, /* a */ A, B]
  ): js.Function1[/* fa */ TaskThese_[E, A], Task_[B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any], onBoth.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ TaskThese_[E, A], Task_[B]]]
  
  inline def matchE[E, B, A](
    onLeft: js.Function1[/* e */ E, Task_[B]],
    onRight: js.Function1[/* a */ A, Task_[B]],
    onBoth: js.Function2[/* e */ E, /* a */ A, Task_[B]]
  ): js.Function1[/* fa */ TaskThese_[E, A], Task_[B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchE")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any], onBoth.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ TaskThese_[E, A], Task_[B]]]
  
  inline def matchEW[E, B, A, C, D](
    onLeft: js.Function1[/* e */ E, Task_[B]],
    onRight: js.Function1[/* a */ A, Task_[C]],
    onBoth: js.Function2[/* e */ E, /* a */ A, Task_[D]]
  ): js.Function1[/* fa */ TaskThese_[E, A], Task_[B | C | D]] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchEW")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any], onBoth.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ TaskThese_[E, A], Task_[B | C | D]]]
  
  inline def matchW[E, B, A, C, D](
    onLeft: js.Function1[/* e */ E, B],
    onRight: js.Function1[/* a */ A, C],
    onBoth: js.Function2[/* e */ E, /* a */ A, D]
  ): js.Function1[/* ma */ TaskThese_[E, A], Task_[B | C | D]] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchW")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any], onBoth.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ TaskThese_[E, A], Task_[B | C | D]]]
  
  inline def of[E, A](a: A): TaskThese_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any]).asInstanceOf[TaskThese_[E, A]]
  
  inline def right[E, A](a: A): TaskThese_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(a.asInstanceOf[js.Any]).asInstanceOf[TaskThese_[E, A]]
  
  inline def rightIO[E, A](ma: IO_[A]): TaskThese_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightIO")(ma.asInstanceOf[js.Any]).asInstanceOf[TaskThese_[E, A]]
  
  inline def rightTask[E, A](ma: Task_[A]): TaskThese_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightTask")(ma.asInstanceOf[js.Any]).asInstanceOf[TaskThese_[E, A]]
  
  inline def swap[E, A](fa: TaskThese_[E, A]): TaskThese_[A, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("swap")(fa.asInstanceOf[js.Any]).asInstanceOf[TaskThese_[A, E]]
  
  @JSImport("fp-ts/lib/TaskThese", "taskThese")
  @js.native
  val taskThese: Functor2[typingsJapgolly.fpTs.libTaskTheseMod.URI] & Bifunctor2[typingsJapgolly.fpTs.libTaskTheseMod.URI] = js.native
  
  inline def toTuple[E, A](e: E, a: A): js.Function1[/* fa */ TaskThese_[E, A], Task_[js.Tuple2[E, A]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toTuple")(e.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ TaskThese_[E, A], Task_[js.Tuple2[E, A]]]]
  
  inline def toTuple2[E, A](e: Lazy[E], a: Lazy[A]): js.Function1[/* fa */ TaskThese_[E, A], Task_[js.Tuple2[E, A]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toTuple2")(e.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ TaskThese_[E, A], Task_[js.Tuple2[E, A]]]]
  
  inline def traverseReadonlyArrayWithIndex[E](S: Semigroup[E]): js.Function1[
    /* f */ js.Function2[/* index */ Double, /* a */ Any, TaskThese_[E, Any]], 
    js.Function1[/* as */ js.Array[Any], TaskThese_[E, js.Array[Any]]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyArrayWithIndex")(S.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function2[/* index */ Double, /* a */ Any, TaskThese_[E, Any]], 
    js.Function1[/* as */ js.Array[Any], TaskThese_[E, js.Array[Any]]]
  ]]
  
  inline def traverseReadonlyArrayWithIndexSeq[E](S: Semigroup[E]): js.Function1[
    /* f */ js.Function2[/* index */ Double, /* a */ Any, TaskThese_[E, Any]], 
    js.Function1[/* as */ js.Array[Any], TaskThese_[E, js.Array[Any]]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyArrayWithIndexSeq")(S.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function2[/* index */ Double, /* a */ Any, TaskThese_[E, Any]], 
    js.Function1[/* as */ js.Array[Any], TaskThese_[E, js.Array[Any]]]
  ]]
  
  inline def traverseReadonlyNonEmptyArrayWithIndex[E](S: Semigroup[E]): js.Function1[
    /* f */ js.Function2[/* index */ Double, /* a */ Any, TaskThese_[E, Any]], 
    js.Function1[/* as */ ReadonlyNonEmptyArray_[Any], TaskThese_[E, ReadonlyNonEmptyArray_[Any]]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyNonEmptyArrayWithIndex")(S.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function2[/* index */ Double, /* a */ Any, TaskThese_[E, Any]], 
    js.Function1[/* as */ ReadonlyNonEmptyArray_[Any], TaskThese_[E, ReadonlyNonEmptyArray_[Any]]]
  ]]
  
  inline def traverseReadonlyNonEmptyArrayWithIndexSeq[E](S: Semigroup[E]): js.Function1[
    /* f */ js.Function2[/* index */ Double, /* a */ Any, TaskThese_[E, Any]], 
    js.Function1[/* as */ ReadonlyNonEmptyArray_[Any], TaskThese_[E, ReadonlyNonEmptyArray_[Any]]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyNonEmptyArrayWithIndexSeq")(S.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function2[/* index */ Double, /* a */ Any, TaskThese_[E, Any]], 
    js.Function1[/* as */ ReadonlyNonEmptyArray_[Any], TaskThese_[E, ReadonlyNonEmptyArray_[Any]]]
  ]]
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind2[E, A] extends StObject
  }
  
  type TaskThese_[E, A] = Task_[These_[E, A]]
}
