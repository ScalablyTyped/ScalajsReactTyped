package typingsJapgolly.newtypeTs

import typingsJapgolly.monocleTs.mod.Prism_
import typingsJapgolly.newtypeTs.libNonPositiveIntegerMod.NonPositiveInteger
import typingsJapgolly.newtypeTs.libNonZeroMod.NonZero
import typingsJapgolly.newtypeTs.mod.Concat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNegativeIntegerMod {
  
  @JSImport("newtype-ts/lib/NegativeInteger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isNegativeInteger(n: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNegativeInteger")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("newtype-ts/lib/NegativeInteger", "prismNegativeInteger")
  @js.native
  val prismNegativeInteger: Prism_[Double, NegativeInteger] = js.native
  
  type NegativeInteger = Concat[NonZero, NonPositiveInteger]
}
