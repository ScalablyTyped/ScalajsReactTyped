package typingsJapgolly.vegaLite

import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileDataExpressionsMod {
  
  @JSImport("vega-lite/build/src/compile/data/expressions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDependentFields(expression: String): Set[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDependentFields")(expression.asInstanceOf[js.Any]).asInstanceOf[Set[String]]
}
