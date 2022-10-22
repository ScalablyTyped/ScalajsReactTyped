package typingsJapgolly.typedoc

import typingsJapgolly.typescript.mod.Declaration
import typingsJapgolly.typescript.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibConverterConvertExpressionMod {
  
  @JSImport("typedoc/dist/lib/converter/convert-expression", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertDefaultValue(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDefaultValue")().asInstanceOf[js.UndefOr[String]]
  inline def convertDefaultValue(node: Declaration): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDefaultValue")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def convertExpression(expression: Expression): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertExpression")(expression.asInstanceOf[js.Any]).asInstanceOf[String]
}
