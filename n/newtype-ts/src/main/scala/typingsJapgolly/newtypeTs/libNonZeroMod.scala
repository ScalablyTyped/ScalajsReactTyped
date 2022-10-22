package typingsJapgolly.newtypeTs

import typingsJapgolly.monocleTs.mod.Prism_
import typingsJapgolly.newtypeTs.mod.Newtype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNonZeroMod {
  
  @JSImport("newtype-ts/lib/NonZero", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isNonZero(n: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNonZero")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("newtype-ts/lib/NonZero", "prismNonZero")
  @js.native
  val prismNonZero: Prism_[Double, NonZero] = js.native
  
  type NonZero = Newtype[typingsJapgolly.newtypeTs.anon.NonZero, Double]
}
