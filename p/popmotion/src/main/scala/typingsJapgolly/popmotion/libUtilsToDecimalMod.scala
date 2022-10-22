package typingsJapgolly.popmotion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsToDecimalMod {
  
  @JSImport("popmotion/lib/utils/to-decimal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toDecimal(num: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toDecimal")(num.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def toDecimal(num: Double, precision: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toDecimal")(num.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[Double]
}
