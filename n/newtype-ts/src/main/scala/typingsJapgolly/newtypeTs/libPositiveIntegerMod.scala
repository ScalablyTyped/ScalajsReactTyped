package typingsJapgolly.newtypeTs

import typingsJapgolly.monocleTs.mod.Prism_
import typingsJapgolly.newtypeTs.libNonNegativeIntegerMod.NonNegativeInteger
import typingsJapgolly.newtypeTs.libNonZeroMod.NonZero
import typingsJapgolly.newtypeTs.mod.Concat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPositiveIntegerMod {
  
  @JSImport("newtype-ts/lib/PositiveInteger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isPositiveInteger(n: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPositiveInteger")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("newtype-ts/lib/PositiveInteger", "prismPositiveInteger")
  @js.native
  val prismPositiveInteger: Prism_[Double, PositiveInteger] = js.native
  
  type PositiveInteger = Concat[NonZero, NonNegativeInteger]
}
