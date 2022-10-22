package typingsJapgolly.geolib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esConvertAreaMod {
  
  @JSImport("geolib/es/convertArea", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(squareMeters: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(squareMeters.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def default(squareMeters: Double, targetUnit: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(squareMeters.asInstanceOf[js.Any], targetUnit.asInstanceOf[js.Any])).asInstanceOf[Double]
}
