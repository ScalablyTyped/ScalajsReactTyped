package typingsJapgolly.mumath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object roundMod {
  
  inline def apply(value: Double): Double = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def apply(value: Double, step: Double): Double = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("mumath/round", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
