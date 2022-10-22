package typingsJapgolly.polished

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMathMathMod {
  
  @JSImport("polished/lib/math/math", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(formula: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(formula.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(formula: String, additionalSymbols: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(formula.asInstanceOf[js.Any], additionalSymbols.asInstanceOf[js.Any])).asInstanceOf[String]
}
