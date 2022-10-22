package typingsJapgolly.formatjsEcma402Abstract

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getNumberOptionMod {
  
  @JSImport("@formatjs/ecma402-abstract/GetNumberOption", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def GetNumberOption[T /* <: js.Object */, K /* <: /* keyof T */ String */](options: T, property: K, minimum: Double, maximum: Double, fallback: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("GetNumberOption")(options.asInstanceOf[js.Any], property.asInstanceOf[js.Any], minimum.asInstanceOf[js.Any], maximum.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[Double]
}
