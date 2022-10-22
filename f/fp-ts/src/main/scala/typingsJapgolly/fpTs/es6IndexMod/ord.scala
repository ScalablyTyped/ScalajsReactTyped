package typingsJapgolly.fpTs.es6IndexMod

import typingsJapgolly.fpTs.libContravariantMod.Contravariant1
import typingsJapgolly.fpTs.libMonoidMod.Monoid
import typingsJapgolly.fpTs.libOrdMod.Ord_
import typingsJapgolly.fpTs.libOrderingMod.Ordering
import typingsJapgolly.fpTs.libSemigroupMod.Semigroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ord {
  
  @JSImport("fp-ts/es6/index", "ord")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/es6/index", "ord.Contravariant")
  @js.native
  val Contravariant: Contravariant1[typingsJapgolly.fpTs.libOrdMod.URI] = js.native
  
  @JSImport("fp-ts/es6/index", "ord.URI")
  @js.native
  val URI: /* "Ord" */ String = js.native
  
  inline def between[A](O: Ord_[A]): js.Function2[/* low */ A, /* hi */ A, js.Function1[/* a */ A, Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("between")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* low */ A, /* hi */ A, js.Function1[/* a */ A, Boolean]]]
  
  inline def clamp[A](O: Ord_[A]): js.Function2[/* low */ A, /* hi */ A, js.Function1[/* a */ A, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* low */ A, /* hi */ A, js.Function1[/* a */ A, A]]]
  
  inline def contramap[A, B](f: js.Function1[/* b */ B, A]): js.Function1[/* fa */ Ord_[A], Ord_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("contramap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Ord_[A], Ord_[B]]]
  
  inline def equalsDefault[A](compare: js.Function2[/* first */ A, /* second */ A, Ordering]): js.Function2[/* x */ A, /* y */ A, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("equalsDefault")(compare.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* x */ A, /* y */ A, Boolean]]
  
  inline def equals_[A](O: Ord_[A]): js.Function1[/* second */ A, js.Function1[/* first */ A, Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* second */ A, js.Function1[/* first */ A, Boolean]]]
  
  inline def fromCompare[A](compare: js.Function2[/* first */ A, /* second */ A, Ordering]): Ord_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCompare")(compare.asInstanceOf[js.Any]).asInstanceOf[Ord_[A]]
  
  inline def geq[A](O: Ord_[A]): js.Function2[/* first */ A, /* second */ A, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("geq")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* first */ A, /* second */ A, Boolean]]
  
  inline def getDualOrd[A](O: Ord_[A]): Ord_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDualOrd")(O.asInstanceOf[js.Any]).asInstanceOf[Ord_[A]]
  
  inline def getMonoid[A](): Monoid[Ord_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonoid")().asInstanceOf[Monoid[Ord_[A]]]
  
  inline def getSemigroup[A](): Semigroup[Ord_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")().asInstanceOf[Semigroup[Ord_[A]]]
  
  inline def getTupleOrd[T /* <: js.Array[Ord_[Any]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param ords because its type T is not an array type */ ords: T
  ): Ord_[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends fp-ts.fp-ts/lib/Ord.Ord<infer A>? A : never} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTupleOrd")(ords.asInstanceOf[js.Any]).asInstanceOf[Ord_[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends fp-ts.fp-ts/lib/Ord.Ord<infer A>? A : never} */ js.Any
  ]]
  
  inline def gt[A](O: Ord_[A]): js.Function2[/* first */ A, /* second */ A, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("gt")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* first */ A, /* second */ A, Boolean]]
  
  inline def leq[A](O: Ord_[A]): js.Function2[/* first */ A, /* second */ A, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("leq")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* first */ A, /* second */ A, Boolean]]
  
  inline def lt[A](O: Ord_[A]): js.Function2[/* first */ A, /* second */ A, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("lt")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* first */ A, /* second */ A, Boolean]]
  
  inline def max[A](O: Ord_[A]): js.Function2[/* first */ A, /* second */ A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* first */ A, /* second */ A, A]]
  
  inline def min[A](O: Ord_[A]): js.Function2[/* first */ A, /* second */ A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* first */ A, /* second */ A, A]]
  
  @JSImport("fp-ts/es6/index", "ord.ord")
  @js.native
  val ord: Contravariant1[typingsJapgolly.fpTs.libOrdMod.URI] = js.native
  
  @JSImport("fp-ts/es6/index", "ord.ordBoolean")
  @js.native
  val ordBoolean: Ord_[Boolean] = js.native
  
  @JSImport("fp-ts/es6/index", "ord.ordDate")
  @js.native
  val ordDate: Ord_[js.Date] = js.native
  
  @JSImport("fp-ts/es6/index", "ord.ordNumber")
  @js.native
  val ordNumber: Ord_[Double] = js.native
  
  @JSImport("fp-ts/es6/index", "ord.ordString")
  @js.native
  val ordString: Ord_[String] = js.native
  
  inline def reverse[A](O: Ord_[A]): Ord_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(O.asInstanceOf[js.Any]).asInstanceOf[Ord_[A]]
  
  @JSImport("fp-ts/es6/index", "ord.trivial")
  @js.native
  val trivial: Ord_[Any] = js.native
  
  inline def tuple[A /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param ords because its type {[ K in keyof A ]: Ord<A[K]>} is not an array type */ ords: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: fp-ts.fp-ts/lib/Ord.Ord<A[K]>} */ js.Any
  ): Ord_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(ords.asInstanceOf[js.Any]).asInstanceOf[Ord_[A]]
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
}
