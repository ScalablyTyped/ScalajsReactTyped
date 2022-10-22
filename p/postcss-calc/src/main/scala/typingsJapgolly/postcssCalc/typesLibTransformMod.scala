package typingsJapgolly.postcssCalc

import typingsJapgolly.postcss.mod.Result
import typingsJapgolly.postcssCalc.anon.Preserve
import typingsJapgolly.postcssCalc.postcssCalcStrings.params
import typingsJapgolly.postcssCalc.postcssCalcStrings.selector
import typingsJapgolly.postcssCalc.postcssCalcStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibTransformMod {
  
  inline def apply(node: Any, property: value | params | selector, options: Preserve, result: Result): Unit = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], property.asInstanceOf[js.Any], options.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("postcss-calc/types/lib/transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
