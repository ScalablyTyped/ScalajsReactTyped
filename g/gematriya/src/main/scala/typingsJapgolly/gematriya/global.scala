package typingsJapgolly.gematriya

import typingsJapgolly.gematriya.anon.Geresh
import typingsJapgolly.gematriya.anon.Order
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def gematriya(num: Double): String = js.Dynamic.global.applyDynamic("gematriya")(num.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def gematriya(num: Double, options: Geresh): String = (js.Dynamic.global.applyDynamic("gematriya")(num.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def gematriya(str: String): Double = js.Dynamic.global.applyDynamic("gematriya")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def gematriya(str: String, options: Order): Double = (js.Dynamic.global.applyDynamic("gematriya")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
}
