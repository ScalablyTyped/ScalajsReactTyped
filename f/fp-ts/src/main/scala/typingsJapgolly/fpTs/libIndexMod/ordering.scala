package typingsJapgolly.fpTs.libIndexMod

import typingsJapgolly.fpTs.libOrderingMod.Ordering
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ordering {
  
  @JSImport("fp-ts/lib/index", "ordering")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/index", "ordering.Eq")
  @js.native
  val Eq: typingsJapgolly.fpTs.libEqMod.Eq[Ordering] = js.native
  
  @JSImport("fp-ts/lib/index", "ordering.Monoid")
  @js.native
  val Monoid: typingsJapgolly.fpTs.libMonoidMod.Monoid[Ordering] = js.native
  
  @JSImport("fp-ts/lib/index", "ordering.Semigroup")
  @js.native
  val Semigroup: typingsJapgolly.fpTs.libSemigroupMod.Semigroup[Ordering] = js.native
  
  @JSImport("fp-ts/lib/index", "ordering.eqOrdering")
  @js.native
  val eqOrdering: typingsJapgolly.fpTs.libEqMod.Eq[Ordering] = js.native
  
  inline def invert(o: Ordering): Ordering = ^.asInstanceOf[js.Dynamic].applyDynamic("invert")(o.asInstanceOf[js.Any]).asInstanceOf[Ordering]
  
  inline def `match`[A](onLessThan: js.Function0[A], onEqual: js.Function0[A], onGreaterThan: js.Function0[A]): js.Function1[/* o */ Ordering, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(onLessThan.asInstanceOf[js.Any], onEqual.asInstanceOf[js.Any], onGreaterThan.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* o */ Ordering, A]]
  
  inline def matchW[A, B, C](onLessThan: js.Function0[A], onEqual: js.Function0[B], onGreaterThan: js.Function0[C]): js.Function1[/* o */ Ordering, A | B | C] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchW")(onLessThan.asInstanceOf[js.Any], onEqual.asInstanceOf[js.Any], onGreaterThan.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* o */ Ordering, A | B | C]]
  
  @JSImport("fp-ts/lib/index", "ordering.monoidOrdering")
  @js.native
  val monoidOrdering: typingsJapgolly.fpTs.libMonoidMod.Monoid[Ordering] = js.native
  
  inline def reverse(o: Ordering): Ordering = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(o.asInstanceOf[js.Any]).asInstanceOf[Ordering]
  
  @JSImport("fp-ts/lib/index", "ordering.semigroupOrdering")
  @js.native
  val semigroupOrdering: typingsJapgolly.fpTs.libSemigroupMod.Semigroup[Ordering] = js.native
  
  inline def sign(n: Double): Ordering = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(n.asInstanceOf[js.Any]).asInstanceOf[Ordering]
}
