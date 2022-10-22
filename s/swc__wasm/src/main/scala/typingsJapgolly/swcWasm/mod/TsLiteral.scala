package typingsJapgolly.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swcWasm.mod.NumericLiteral
  - typingsJapgolly.swcWasm.mod.StringLiteral
  - typingsJapgolly.swcWasm.mod.BooleanLiteral
  - typingsJapgolly.swcWasm.mod.BigIntLiteral
  - typingsJapgolly.swcWasm.mod.TsTemplateLiteralType
*/
trait TsLiteral extends StObject
object TsLiteral {
  
  inline def BigIntLiteral(span: Span, value: js.BigInt): typingsJapgolly.swcWasm.mod.BigIntLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BigIntLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.BigIntLiteral]
  }
  
  inline def BooleanLiteral(span: Span, value: Boolean): typingsJapgolly.swcWasm.mod.BooleanLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.BooleanLiteral]
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
  
  inline def TsTemplateLiteralType(quasis: js.Array[TemplateElement], span: Span, types: js.Array[TsType]): typingsJapgolly.swcWasm.mod.TsTemplateLiteralType = {
    val __obj = js.Dynamic.literal(quasis = quasis.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TemplateLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsTemplateLiteralType]
  }
}
