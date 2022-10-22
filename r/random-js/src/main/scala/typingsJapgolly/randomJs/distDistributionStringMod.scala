package typingsJapgolly.randomJs

import typingsJapgolly.randomJs.distTypesMod.StringDistribution
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDistributionStringMod {
  
  @JSImport("random-js/dist/distribution/string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def string(): StringDistribution = ^.asInstanceOf[js.Dynamic].applyDynamic("string")().asInstanceOf[StringDistribution]
  inline def string(pool: String): StringDistribution = ^.asInstanceOf[js.Dynamic].applyDynamic("string")(pool.asInstanceOf[js.Any]).asInstanceOf[StringDistribution]
}
