package typingsJapgolly.newtypeTs

import typingsJapgolly.monocleTs.mod.Prism_
import typingsJapgolly.newtypeTs.mod.Newtype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNonPositiveMod {
  
  @JSImport("newtype-ts/lib/NonPositive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isNonPositive(n: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNonPositive")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("newtype-ts/lib/NonPositive", "prismNonPositive")
  @js.native
  val prismNonPositive: Prism_[Double, NonPositive] = js.native
  
  type NonPositive = Newtype[typingsJapgolly.newtypeTs.anon.NonPositive, Double]
}
