package typingsJapgolly.popperjsCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsWithinMod {
  
  @JSImport("@popperjs/core/lib/utils/within", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def within(min: Double, value: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("within")(min.asInstanceOf[js.Any], value.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def withinMaxClamp(min: Double, value: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("withinMaxClamp")(min.asInstanceOf[js.Any], value.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
}
