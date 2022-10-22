package typingsJapgolly.newtypeTs

import typingsJapgolly.monocleTs.mod.Prism_
import typingsJapgolly.newtypeTs.mod.Newtype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIntegerMod {
  
  @JSImport("newtype-ts/lib/Integer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isInteger(n: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInteger")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("newtype-ts/lib/Integer", "prismInteger")
  @js.native
  val prismInteger: Prism_[Double, Integer] = js.native
  
  type Integer = Newtype[typingsJapgolly.newtypeTs.anon.Integer, Double]
}
