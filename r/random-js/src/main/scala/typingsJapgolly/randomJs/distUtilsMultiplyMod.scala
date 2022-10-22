package typingsJapgolly.randomJs

import typingsJapgolly.randomJs.distTypesMod.Distribution
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMultiplyMod {
  
  @JSImport("random-js/dist/utils/multiply", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def multiply(distribution: Distribution[Double], multiplier: Double): Distribution[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(distribution.asInstanceOf[js.Any], multiplier.asInstanceOf[js.Any])).asInstanceOf[Distribution[Double]]
}
