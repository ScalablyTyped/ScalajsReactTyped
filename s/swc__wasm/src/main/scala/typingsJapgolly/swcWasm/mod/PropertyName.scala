package typingsJapgolly.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swcWasm.mod.Identifier
  - typingsJapgolly.swcWasm.mod.StringLiteral
  - typingsJapgolly.swcWasm.mod.NumericLiteral
  - typingsJapgolly.swcWasm.mod.ComputedPropName
  - typingsJapgolly.swcWasm.mod.BigIntLiteral
*/
trait PropertyName extends StObject
object PropertyName {
  
  inline def BigIntLiteral(span: Span, value: js.BigInt): typingsJapgolly.swcWasm.mod.BigIntLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BigIntLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.BigIntLiteral]
  }
  
  inline def ComputedPropName(expression: Expression, span: Span): typingsJapgolly.swcWasm.mod.ComputedPropName = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Computed")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.ComputedPropName]
  }
  
  inline def Identifier(optional: Boolean, span: Span, value: String): typingsJapgolly.swcWasm.mod.Identifier = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.Identifier]
  }
  
  inline def NumericLiteral(span: Span, value: Double): typingsJapgolly.swcWasm.mod.NumericLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.NumericLiteral]
  }
  
  inline def StringLiteral(span: Span, value: String): typingsJapgolly.swcWasm.mod.StringLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.StringLiteral]
  }
}
