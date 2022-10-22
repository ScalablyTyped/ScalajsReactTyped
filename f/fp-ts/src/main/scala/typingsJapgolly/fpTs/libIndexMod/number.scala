package typingsJapgolly.fpTs.libIndexMod

import typingsJapgolly.fpTs.libMagmaMod.Magma
import typingsJapgolly.fpTs.libMonoidMod.Monoid
import typingsJapgolly.fpTs.libOrdMod.Ord_
import typingsJapgolly.fpTs.libRefinementMod.Refinement
import typingsJapgolly.fpTs.libSemigroupMod.Semigroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object number {
  
  @JSImport("fp-ts/lib/index", "number.Bounded")
  @js.native
  val Bounded: typingsJapgolly.fpTs.libBoundedMod.Bounded[Double] = js.native
  
  @JSImport("fp-ts/lib/index", "number.Eq")
  @js.native
  val Eq: typingsJapgolly.fpTs.libEqMod.Eq[Double] = js.native
  
  @JSImport("fp-ts/lib/index", "number.Field")
  @js.native
  val Field: typingsJapgolly.fpTs.libFieldMod.Field[Double] = js.native
  
  @JSImport("fp-ts/lib/index", "number.MagmaSub")
  @js.native
  val MagmaSub: Magma[Double] = js.native
  
  @JSImport("fp-ts/lib/index", "number.MonoidProduct")
  @js.native
  val MonoidProduct: Monoid[Double] = js.native
  
  @JSImport("fp-ts/lib/index", "number.MonoidSum")
  @js.native
  val MonoidSum: Monoid[Double] = js.native
  
  @JSImport("fp-ts/lib/index", "number.Ord")
  @js.native
  val Ord: Ord_[Double] = js.native
  
  @JSImport("fp-ts/lib/index", "number.SemigroupProduct")
  @js.native
  val SemigroupProduct: Semigroup[Double] = js.native
  
  @JSImport("fp-ts/lib/index", "number.SemigroupSum")
  @js.native
  val SemigroupSum: Semigroup[Double] = js.native
  
  @JSImport("fp-ts/lib/index", "number.Show")
  @js.native
  val Show: typingsJapgolly.fpTs.libShowMod.Show[Double] = js.native
  
  @JSImport("fp-ts/lib/index", "number.isNumber")
  @js.native
  val isNumber: Refinement[Any, Double] = js.native
}
