package typingsJapgolly.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLodashFixedBaseMod {
  
  @JSImport("@antv/util/lib/lodash/fixed-base", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(v: Double, base: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(v.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def default(v: Double, base: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(v.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Double]
}
