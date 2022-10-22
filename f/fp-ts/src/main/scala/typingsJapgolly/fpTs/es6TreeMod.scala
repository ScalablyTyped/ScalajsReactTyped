package typingsJapgolly.fpTs

import typingsJapgolly.fpTs.libApplicativeMod.Applicative1
import typingsJapgolly.fpTs.libApplyMod.Apply1
import typingsJapgolly.fpTs.libChainMod.Chain1
import typingsJapgolly.fpTs.libComonadMod.Comonad1
import typingsJapgolly.fpTs.libEqMod.Eq
import typingsJapgolly.fpTs.libFoldableMod.Foldable1
import typingsJapgolly.fpTs.libFunctorMod.Functor1
import typingsJapgolly.fpTs.libMonadMod.Monad1
import typingsJapgolly.fpTs.libMonadMod.Monad2
import typingsJapgolly.fpTs.libMonadMod.Monad2C
import typingsJapgolly.fpTs.libMonadMod.Monad3
import typingsJapgolly.fpTs.libMonadMod.Monad3C
import typingsJapgolly.fpTs.libMonadMod.Monad4
import typingsJapgolly.fpTs.libMonoidMod.Monoid
import typingsJapgolly.fpTs.libPointedMod.Pointed1
import typingsJapgolly.fpTs.libPredicateMod.Predicate
import typingsJapgolly.fpTs.libShowMod.Show
import typingsJapgolly.fpTs.libTraversableMod.PipeableTraverse1
import typingsJapgolly.fpTs.libTraversableMod.Sequence1
import typingsJapgolly.fpTs.libTraversableMod.Traversable1
import typingsJapgolly.fpTs.libTreeMod.Forest
import typingsJapgolly.fpTs.libTreeMod.Tree_
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object es6TreeMod {
  
  @JSImport("fp-ts/es6/Tree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/es6/Tree", "Applicative")
  @js.native
  val Applicative: Applicative1[typingsJapgolly.fpTs.libTreeMod.URI] = js.native
  
  @JSImport("fp-ts/es6/Tree", "Apply")
  @js.native
  val Apply: Apply1[typingsJapgolly.fpTs.libTreeMod.URI] = js.native
  
  @JSImport("fp-ts/es6/Tree", "Chain")
  @js.native
  val Chain_ : Chain1[typingsJapgolly.fpTs.libTreeMod.URI] = js.native
  
  @JSImport("fp-ts/es6/Tree", "Comonad")
  @js.native
  val Comonad: Comonad1[typingsJapgolly.fpTs.libTreeMod.URI] = js.native
  
  @JSImport("fp-ts/es6/Tree", "Do")
  @js.native
  val Do: Tree_[js.Object] = js.native
  
  @JSImport("fp-ts/es6/Tree", "Foldable")
  @js.native
  val Foldable: Foldable1[typingsJapgolly.fpTs.libTreeMod.URI] = js.native
  
  @JSImport("fp-ts/es6/Tree", "Functor")
  @js.native
  val Functor: Functor1[typingsJapgolly.fpTs.libTreeMod.URI] = js.native
  
  @JSImport("fp-ts/es6/Tree", "Monad")
  @js.native
  val Monad: Monad1[typingsJapgolly.fpTs.libTreeMod.URI] = js.native
  
  @JSImport("fp-ts/es6/Tree", "Pointed")
  @js.native
  val Pointed: Pointed1[typingsJapgolly.fpTs.libTreeMod.URI] = js.native
  
  @JSImport("fp-ts/es6/Tree", "Traversable")
  @js.native
  val Traversable: Traversable1[typingsJapgolly.fpTs.libTreeMod.URI] = js.native
  
  @JSImport("fp-ts/es6/Tree", "URI")
  @js.native
  val URI: /* "Tree" */ String = js.native
  
  inline def ap[A](fa: Tree_[A]): js.Function1[/* fab */ Tree_[js.Function1[/* a */ A, Any]], Tree_[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ Tree_[js.Function1[/* a */ A, Any]], Tree_[Any]]]
  
  inline def apFirst[B](second: Tree_[B]): js.Function1[/* first */ Tree_[Any], Tree_[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirst")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ Tree_[Any], Tree_[Any]]]
  
  inline def apS[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], fb: Tree_[B]): js.Function1[
    /* fa */ Tree_[A], 
    Tree_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apS")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ Tree_[A], 
    Tree_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def apSecond[B](second: Tree_[B]): js.Function1[/* first */ Tree_[Any], Tree_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecond")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ Tree_[Any], Tree_[B]]]
  
  inline def bind[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, Tree_[B]]): js.Function1[
    /* ma */ Tree_[A], 
    Tree_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* ma */ Tree_[A], 
    Tree_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def bindTo[N /* <: String */](name: N): js.Function1[
    /* fa */ Tree_[Any], 
    Tree_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N ]: any} */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ Tree_[Any], 
    Tree_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N ]: any} */ js.Any
    ]
  ]]
  
  inline def chain[A, B](f: js.Function1[/* a */ A, Tree_[B]]): js.Function1[/* ma */ Tree_[A], Tree_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Tree_[A], Tree_[B]]]
  
  inline def chainFirst[A, B](f: js.Function1[/* a */ A, Tree_[B]]): js.Function1[/* first */ Tree_[A], Tree_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirst")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ Tree_[A], Tree_[A]]]
  
  inline def drawForest(forest: Forest[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("drawForest")(forest.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def drawTree(tree: Tree_[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("drawTree")(tree.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def duplicate[A](wa: Tree_[A]): Tree_[Tree_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("duplicate")(wa.asInstanceOf[js.Any]).asInstanceOf[Tree_[Tree_[A]]]
  
  inline def elem[A](E: Eq[A]): js.Function2[/* a */ A, /* fa */ Tree_[A], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("elem")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ A, /* fa */ Tree_[A], Boolean]]
  
  inline def exists[A](predicate: Predicate[A]): js.Function1[/* ma */ Tree_[A], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("exists")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Tree_[A], Boolean]]
  
  inline def extend[A, B](f: js.Function1[/* wa */ Tree_[A], B]): js.Function1[/* wa */ Tree_[A], Tree_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* wa */ Tree_[A], Tree_[B]]]
  
  inline def extract[A](wa: Tree_[A]): A = ^.asInstanceOf[js.Dynamic].applyDynamic("extract")(wa.asInstanceOf[js.Any]).asInstanceOf[A]
  
  inline def flap[A](a: A): js.Function1[/* fab */ Tree_[js.Function1[/* a */ A, Any]], Tree_[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ Tree_[js.Function1[/* a */ A, Any]], Tree_[Any]]]
  
  inline def flatten[A](mma: Tree_[Tree_[A]]): Tree_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(mma.asInstanceOf[js.Any]).asInstanceOf[Tree_[A]]
  
  inline def fold[A, B](f: js.Function2[/* a */ A, /* bs */ js.Array[B], B]): js.Function1[/* tree */ Tree_[A], B] = ^.asInstanceOf[js.Dynamic].applyDynamic("fold")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* tree */ Tree_[A], B]]
  
  inline def foldMap[M](M: Monoid[M]): js.Function1[/* f */ js.Function1[/* a */ Any, M], js.Function1[/* fa */ Tree_[Any], M]] = ^.asInstanceOf[js.Dynamic].applyDynamic("foldMap")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* f */ js.Function1[/* a */ Any, M], js.Function1[/* fa */ Tree_[Any], M]]]
  
  inline def getEq[A](E: Eq[A]): Eq[Tree_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEq")(E.asInstanceOf[js.Any]).asInstanceOf[Eq[Tree_[A]]]
  
  inline def getShow[A](S: Show[A]): Show[Tree_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getShow")(S.asInstanceOf[js.Any]).asInstanceOf[Show[Tree_[A]]]
  
  inline def let[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, B]): js.Function1[
    /* fa */ Tree_[A], 
    Tree_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("let")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ Tree_[A], 
    Tree_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def make[A](value: A): Tree_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("make")(value.asInstanceOf[js.Any]).asInstanceOf[Tree_[A]]
  inline def make[A](value: A, forest: Forest[A]): Tree_[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("make")(value.asInstanceOf[js.Any], forest.asInstanceOf[js.Any])).asInstanceOf[Tree_[A]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ Tree_[A], Tree_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Tree_[A], Tree_[B]]]
  
  inline def of[A](a: A): Tree_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any]).asInstanceOf[Tree_[A]]
  
  inline def reduce[A, B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): js.Function1[/* fa */ Tree_[A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ Tree_[A], B]]
  
  inline def reduceRight[A, B](b: B, f: js.Function2[/* a */ A, /* b */ B, B]): js.Function1[/* fa */ Tree_[A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ Tree_[A], B]]
  
  @JSImport("fp-ts/es6/Tree", "sequence")
  @js.native
  val sequence: Sequence1[typingsJapgolly.fpTs.libTreeMod.URI] = js.native
  
  @JSImport("fp-ts/es6/Tree", "traverse")
  @js.native
  val traverse: PipeableTraverse1[typingsJapgolly.fpTs.libTreeMod.URI] = js.native
  
  @JSImport("fp-ts/es6/Tree", "tree")
  @js.native
  val tree: Monad1[typingsJapgolly.fpTs.libTreeMod.URI] & Foldable1[typingsJapgolly.fpTs.libTreeMod.URI] & Traversable1[typingsJapgolly.fpTs.libTreeMod.URI] & Comonad1[typingsJapgolly.fpTs.libTreeMod.URI] = js.native
  
  inline def unfoldForest[A, B](bs: js.Array[B], f: js.Function1[/* b */ B, js.Tuple2[A, js.Array[B]]]): Forest[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("unfoldForest")(bs.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Forest[A]]
  
  inline def unfoldForestM[M](M: typingsJapgolly.fpTs.libMonadMod.Monad[M]): js.Function2[
    /* bs */ js.Array[Any], 
    /* f */ js.Function1[
      /* b */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, [A, Array<B>]> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Forest<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("unfoldForestM")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* bs */ js.Array[Any], 
    /* f */ js.Function1[
      /* b */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, [A, Array<B>]> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Forest<A>> */ Any
  ]]
  inline def unfoldForestM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](M: Monad1[M]): js.Function2[
    /* bs */ js.Array[Any], 
    /* f */ js.Function1[
      /* b */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, [A, Array<B>]> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Forest<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("unfoldForestM")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* bs */ js.Array[Any], 
    /* f */ js.Function1[
      /* b */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, [A, Array<B>]> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Forest<A>> */ Any
  ]]
  inline def unfoldForestM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](M: Monad2[M]): js.Function2[
    /* bs */ js.Array[Any], 
    /* f */ js.Function1[
      /* b */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, [E, Array<B>]> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, Forest<E>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("unfoldForestM")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* bs */ js.Array[Any], 
    /* f */ js.Function1[
      /* b */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, [E, Array<B>]> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, Forest<E>> */ Any
  ]]
  inline def unfoldForestM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](M: Monad3[M]): js.Function2[
    /* bs */ js.Array[Any], 
    /* f */ js.Function1[
      /* b */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, [A, Array<B>]> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Forest<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("unfoldForestM")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* bs */ js.Array[Any], 
    /* f */ js.Function1[
      /* b */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, [A, Array<B>]> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Forest<A>> */ Any
  ]]
  inline def unfoldForestM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](M: Monad4[M]): js.Function2[
    /* bs */ js.Array[Any], 
    /* f */ js.Function1[
      /* b */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, [A, Array<B>]> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, Forest<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("unfoldForestM")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* bs */ js.Array[Any], 
    /* f */ js.Function1[
      /* b */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, [A, Array<B>]> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, Forest<A>> */ Any
  ]]
  inline def unfoldForestM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](M: Monad2C[M, E]): js.Function2[
    /* bs */ js.Array[Any], 
    /* f */ js.Function1[
      /* b */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, [A, Array<B>]> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Forest<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("unfoldForestM")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* bs */ js.Array[Any], 
    /* f */ js.Function1[
      /* b */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, [A, Array<B>]> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Forest<A>> */ Any
  ]]
  inline def unfoldForestM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](M: Monad3C[M, E]): js.Function2[
    /* bs */ js.Array[Any], 
    /* f */ js.Function1[
      /* b */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, [A, Array<B>]> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Forest<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("unfoldForestM")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* bs */ js.Array[Any], 
    /* f */ js.Function1[
      /* b */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, [A, Array<B>]> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Forest<A>> */ Any
  ]]
  
  inline def unfoldTree[A, B](b: B, f: js.Function1[/* b */ B, js.Tuple2[A, js.Array[B]]]): Tree_[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("unfoldTree")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Tree_[A]]
  
  inline def unfoldTreeM[M](M: typingsJapgolly.fpTs.libMonadMod.Monad[M]): js.Function2[
    /* b */ Any, 
    /* f */ js.Function1[
      /* b */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, [A, Array<B>]> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Tree<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("unfoldTreeM")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* b */ Any, 
    /* f */ js.Function1[
      /* b */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, [A, Array<B>]> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Tree<A>> */ Any
  ]]
  inline def unfoldTreeM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](M: Monad1[M]): js.Function2[
    /* b */ Any, 
    /* f */ js.Function1[
      /* b */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, [A, Array<B>]> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Tree<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("unfoldTreeM")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* b */ Any, 
    /* f */ js.Function1[
      /* b */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, [A, Array<B>]> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Tree<A>> */ Any
  ]]
  inline def unfoldTreeM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](M: Monad2[M]): js.Function2[
    /* b */ Any, 
    /* f */ js.Function1[
      /* b */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, [A, Array<B>]> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Tree<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("unfoldTreeM")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* b */ Any, 
    /* f */ js.Function1[
      /* b */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, [A, Array<B>]> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Tree<A>> */ Any
  ]]
  inline def unfoldTreeM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](M: Monad3[M]): js.Function2[
    /* b */ Any, 
    /* f */ js.Function1[
      /* b */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, [A, Array<B>]> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Tree<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("unfoldTreeM")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* b */ Any, 
    /* f */ js.Function1[
      /* b */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, [A, Array<B>]> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Tree<A>> */ Any
  ]]
  inline def unfoldTreeM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](M: Monad4[M]): js.Function2[
    /* b */ Any, 
    /* f */ js.Function1[
      /* b */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, [A, Array<B>]> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, Tree<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("unfoldTreeM")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* b */ Any, 
    /* f */ js.Function1[
      /* b */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, [A, Array<B>]> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, Tree<A>> */ Any
  ]]
  inline def unfoldTreeM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](M: Monad2C[M, E]): js.Function2[
    /* b */ Any, 
    /* f */ js.Function1[
      /* b */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, [A, Array<B>]> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Tree<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("unfoldTreeM")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* b */ Any, 
    /* f */ js.Function1[
      /* b */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, [A, Array<B>]> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Tree<A>> */ Any
  ]]
  inline def unfoldTreeM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](M: Monad3C[M, E]): js.Function2[
    /* b */ Any, 
    /* f */ js.Function1[
      /* b */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, [A, Array<B>]> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Tree<A>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("unfoldTreeM")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* b */ Any, 
    /* f */ js.Function1[
      /* b */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, [A, Array<B>]> */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Tree<A>> */ Any
  ]]
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
}
