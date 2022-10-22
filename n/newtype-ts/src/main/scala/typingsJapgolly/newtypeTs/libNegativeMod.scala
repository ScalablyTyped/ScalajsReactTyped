package typingsJapgolly.newtypeTs

import typingsJapgolly.monocleTs.mod.Prism_
import typingsJapgolly.newtypeTs.libNonPositiveMod.NonPositive
import typingsJapgolly.newtypeTs.libNonZeroMod.NonZero
import typingsJapgolly.newtypeTs.mod.Concat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNegativeMod {
  
  @JSImport("newtype-ts/lib/Negative", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isNegative(n: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNegative")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("newtype-ts/lib/Negative", "prismNegative")
  @js.native
  val prismNegative: Prism_[Double, Negative] = js.native
  
  type Negative = Concat[NonZero, NonPositive]
}
