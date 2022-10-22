package typingsJapgolly.fpTs

import typingsJapgolly.fpTs.anon.Fn4
import typingsJapgolly.fpTs.anon.FnCallASet
import typingsJapgolly.fpTs.anon.FnCallMeThat
import typingsJapgolly.fpTs.libEitherMod.Either_
import typingsJapgolly.fpTs.libEqMod.Eq
import typingsJapgolly.fpTs.libMagmaMod.Magma
import typingsJapgolly.fpTs.libMonoidMod.Monoid
import typingsJapgolly.fpTs.libOptionMod.Option_
import typingsJapgolly.fpTs.libOrdMod.Ord_
import typingsJapgolly.fpTs.libPredicateMod.Predicate
import typingsJapgolly.fpTs.libRefinementMod.Refinement
import typingsJapgolly.fpTs.libSemigroupMod.Semigroup
import typingsJapgolly.fpTs.libSeparatedMod.Separated_
import typingsJapgolly.fpTs.libShowMod.Show
import typingsJapgolly.std.ReadonlySet
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object readonlySetMod {
  
  @JSImport("fp-ts/ReadonlySet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/ReadonlySet", "URI")
  @js.native
  val URI: /* "ReadonlySet" */ String = js.native
  
  inline def chain[B](E: Eq[B]): js.Function1[
    /* f */ js.Function1[/* x */ Any, ReadonlySet[B]], 
    js.Function1[/* set */ ReadonlySet[Any], ReadonlySet[B]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* x */ Any, ReadonlySet[B]], 
    js.Function1[/* set */ ReadonlySet[Any], ReadonlySet[B]]
  ]]
  
  inline def compact[A](E: Eq[A]): js.Function1[/* fa */ ReadonlySet[Option_[A]], ReadonlySet[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("compact")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ ReadonlySet[Option_[A]], ReadonlySet[A]]]
  
  inline def difference[A](E: Eq[A]): FnCallMeThat[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("difference")(E.asInstanceOf[js.Any]).asInstanceOf[FnCallMeThat[A]]
  
  inline def elem[A](E: Eq[A]): FnCallASet[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("elem")(E.asInstanceOf[js.Any]).asInstanceOf[FnCallASet[A]]
  
  @JSImport("fp-ts/ReadonlySet", "empty")
  @js.native
  val empty: ReadonlySet[scala.Nothing] = js.native
  
  inline def every[A](predicate: Predicate[A]): Predicate[ReadonlySet[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[Predicate[ReadonlySet[A]]]
  
  inline def every_AB_Refinement[A, B /* <: A */](refinement: Refinement[A, B]): Refinement[ReadonlySet[A], ReadonlySet[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(refinement.asInstanceOf[js.Any]).asInstanceOf[Refinement[ReadonlySet[A], ReadonlySet[B]]]
  
  inline def filter[A](predicate: Predicate[A]): js.Function1[/* set */ ReadonlySet[A], ReadonlySet[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* set */ ReadonlySet[A], ReadonlySet[A]]]
  
  inline def filterMap[B](E: Eq[B]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[B]], 
    js.Function1[/* fa */ ReadonlySet[Any], ReadonlySet[B]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterMap")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[B]], 
    js.Function1[/* fa */ ReadonlySet[Any], ReadonlySet[B]]
  ]]
  
  inline def filter_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* set */ ReadonlySet[A], ReadonlySet[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* set */ ReadonlySet[A], ReadonlySet[B]]]
  
  inline def foldMap[A, M](O: Ord_[A], M: Monoid[M]): js.Function1[/* f */ js.Function1[/* a */ A, M], js.Function1[/* fa */ ReadonlySet[A], M]] = (^.asInstanceOf[js.Dynamic].applyDynamic("foldMap")(O.asInstanceOf[js.Any], M.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* f */ js.Function1[/* a */ A, M], js.Function1[/* fa */ ReadonlySet[A], M]]]
  
  inline def fromArray[A](E: Eq[A]): js.Function1[/* as */ js.Array[A], ReadonlySet[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], ReadonlySet[A]]]
  
  inline def fromReadonlyArray[A](E: Eq[A]): js.Function1[/* as */ js.Array[A], ReadonlySet[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromReadonlyArray")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], ReadonlySet[A]]]
  
  inline def fromSet[A](s: Set[A]): ReadonlySet[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSet")(s.asInstanceOf[js.Any]).asInstanceOf[ReadonlySet[A]]
  
  inline def getDifferenceMagma[A](E: Eq[A]): Magma[ReadonlySet[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDifferenceMagma")(E.asInstanceOf[js.Any]).asInstanceOf[Magma[ReadonlySet[A]]]
  
  inline def getEq[A](E: Eq[A]): Eq[ReadonlySet[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEq")(E.asInstanceOf[js.Any]).asInstanceOf[Eq[ReadonlySet[A]]]
  
  inline def getIntersectionSemigroup[A](E: Eq[A]): Semigroup[ReadonlySet[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIntersectionSemigroup")(E.asInstanceOf[js.Any]).asInstanceOf[Semigroup[ReadonlySet[A]]]
  
  inline def getShow[A](S: Show[A]): Show[ReadonlySet[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getShow")(S.asInstanceOf[js.Any]).asInstanceOf[Show[ReadonlySet[A]]]
  
  inline def getUnionMonoid[A](E: Eq[A]): Monoid[ReadonlySet[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnionMonoid")(E.asInstanceOf[js.Any]).asInstanceOf[Monoid[ReadonlySet[A]]]
  
  inline def getUnionSemigroup[A](E: Eq[A]): Semigroup[ReadonlySet[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnionSemigroup")(E.asInstanceOf[js.Any]).asInstanceOf[Semigroup[ReadonlySet[A]]]
  
  inline def insert[A](E: Eq[A]): js.Function1[/* a */ A, js.Function1[/* set */ ReadonlySet[A], ReadonlySet[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, js.Function1[/* set */ ReadonlySet[A], ReadonlySet[A]]]]
  
  inline def intersection[A](E: Eq[A]): FnCallMeThat[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(E.asInstanceOf[js.Any]).asInstanceOf[FnCallMeThat[A]]
  
  inline def isEmpty[A](set: ReadonlySet[A]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(set.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSubset[A](E: Eq[A]): Fn4[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("isSubset")(E.asInstanceOf[js.Any]).asInstanceOf[Fn4[A]]
  
  inline def map[B](E: Eq[B]): js.Function1[
    /* f */ js.Function1[/* x */ Any, B], 
    js.Function1[/* set */ ReadonlySet[Any], ReadonlySet[B]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* x */ Any, B], 
    js.Function1[/* set */ ReadonlySet[Any], ReadonlySet[B]]
  ]]
  
  inline def partition[A](predicate: Predicate[A]): js.Function1[/* set */ ReadonlySet[A], Separated_[ReadonlySet[A], ReadonlySet[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* set */ ReadonlySet[A], Separated_[ReadonlySet[A], ReadonlySet[A]]]]
  
  inline def partitionMap[B, C](EB: Eq[B], EC: Eq[C]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Either_[B, C]], 
    js.Function1[/* set */ ReadonlySet[Any], Separated_[ReadonlySet[B], ReadonlySet[C]]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("partitionMap")(EB.asInstanceOf[js.Any], EC.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Either_[B, C]], 
    js.Function1[/* set */ ReadonlySet[Any], Separated_[ReadonlySet[B], ReadonlySet[C]]]
  ]]
  
  inline def partition_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* set */ ReadonlySet[A], Separated_[ReadonlySet[A], ReadonlySet[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* set */ ReadonlySet[A], Separated_[ReadonlySet[A], ReadonlySet[B]]]]
  
  inline def reduce[A](O: Ord_[A]): js.Function2[
    /* b */ Any, 
    /* f */ js.Function2[/* b */ Any, /* a */ A, Any], 
    js.Function1[/* fa */ ReadonlySet[A], Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* b */ Any, 
    /* f */ js.Function2[/* b */ Any, /* a */ A, Any], 
    js.Function1[/* fa */ ReadonlySet[A], Any]
  ]]
  
  inline def reduceRight[A](O: Ord_[A]): js.Function2[
    /* b */ Any, 
    /* f */ js.Function2[/* a */ A, /* b */ Any, Any], 
    js.Function1[/* fa */ ReadonlySet[A], Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* b */ Any, 
    /* f */ js.Function2[/* a */ A, /* b */ Any, Any], 
    js.Function1[/* fa */ ReadonlySet[A], Any]
  ]]
  
  inline def remove[A](E: Eq[A]): js.Function1[/* a */ A, js.Function1[/* set */ ReadonlySet[A], ReadonlySet[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, js.Function1[/* set */ ReadonlySet[A], ReadonlySet[A]]]]
  
  inline def separate[E, A](EE: Eq[E], EA: Eq[A]): js.Function1[/* fa */ ReadonlySet[Either_[E, A]], Separated_[ReadonlySet[E], ReadonlySet[A]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("separate")(EE.asInstanceOf[js.Any], EA.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ ReadonlySet[Either_[E, A]], Separated_[ReadonlySet[E], ReadonlySet[A]]]]
  
  inline def singleton[A](a: A): ReadonlySet[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("singleton")(a.asInstanceOf[js.Any]).asInstanceOf[ReadonlySet[A]]
  
  inline def size[A](set: ReadonlySet[A]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("size")(set.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def some[A](predicate: Predicate[A]): js.Function1[/* set */ ReadonlySet[A], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* set */ ReadonlySet[A], Boolean]]
  
  inline def toReadonlyArray[A](O: Ord_[A]): js.Function1[/* set */ ReadonlySet[A], js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toReadonlyArray")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* set */ ReadonlySet[A], js.Array[A]]]
  
  inline def toSet[A](s: ReadonlySet[A]): Set[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("toSet")(s.asInstanceOf[js.Any]).asInstanceOf[Set[A]]
  
  inline def toggle[A](E: Eq[A]): js.Function1[/* a */ A, js.Function1[/* set */ ReadonlySet[A], ReadonlySet[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, js.Function1[/* set */ ReadonlySet[A], ReadonlySet[A]]]]
  
  inline def union[A](E: Eq[A]): FnCallMeThat[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(E.asInstanceOf[js.Any]).asInstanceOf[FnCallMeThat[A]]
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
}
