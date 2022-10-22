package typingsJapgolly.fpTs

import typingsJapgolly.fpTs.libMagmaMod.Magma
import typingsJapgolly.fpTs.libMonoidMod.Monoid
import typingsJapgolly.fpTs.libOrdMod.Ord_
import typingsJapgolly.fpTs.libRefinementMod.Refinement
import typingsJapgolly.fpTs.libSemigroupMod.Semigroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNumberMod {
  
  @JSImport("fp-ts/lib/number", "Bounded")
  @js.native
  val Bounded: typingsJapgolly.fpTs.libBoundedMod.Bounded[Double] = js.native
  
  @JSImport("fp-ts/lib/number", "Eq")
  @js.native
  val Eq: typingsJapgolly.fpTs.libEqMod.Eq[Double] = js.native
  
  @JSImport("fp-ts/lib/number", "Field")
  @js.native
  val Field: typingsJapgolly.fpTs.libFieldMod.Field[Double] = js.native
  
  @JSImport("fp-ts/lib/number", "MagmaSub")
  @js.native
  val MagmaSub: Magma[Double] = js.native
  
  @JSImport("fp-ts/lib/number", "MonoidProduct")
  @js.native
  val MonoidProduct: Monoid[Double] = js.native
  
  @JSImport("fp-ts/lib/number", "MonoidSum")
  @js.native
  val MonoidSum: Monoid[Double] = js.native
  
  @JSImport("fp-ts/lib/number", "Ord")
  @js.native
  val Ord: Ord_[Double] = js.native
  
  @JSImport("fp-ts/lib/number", "SemigroupProduct")
  @js.native
  val SemigroupProduct: Semigroup[Double] = js.native
  
  @JSImport("fp-ts/lib/number", "SemigroupSum")
  @js.native
  val SemigroupSum: Semigroup[Double] = js.native
  
  @JSImport("fp-ts/lib/number", "Show")
  @js.native
  val Show: typingsJapgolly.fpTs.libShowMod.Show[Double] = js.native
  
  @JSImport("fp-ts/lib/number", "isNumber")
  @js.native
  val isNumber: Refinement[Any, Double] = js.native
}
