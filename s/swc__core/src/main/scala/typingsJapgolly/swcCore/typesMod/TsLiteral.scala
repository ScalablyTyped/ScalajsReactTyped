package typingsJapgolly.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swcCore.typesMod.NumericLiteral
  - typingsJapgolly.swcCore.typesMod.StringLiteral
  - typingsJapgolly.swcCore.typesMod.BooleanLiteral
  - typingsJapgolly.swcCore.typesMod.BigIntLiteral
  - typingsJapgolly.swcCore.typesMod.TsTemplateLiteralType
*/
trait TsLiteral extends StObject
object TsLiteral {
  
  inline def BigIntLiteral(span: Span, value: js.BigInt): typingsJapgolly.swcCore.typesMod.BigIntLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BigIntLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.BigIntLiteral]
  }
  
  inline def BooleanLiteral(span: Span, value: Boolean): typingsJapgolly.swcCore.typesMod.BooleanLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.BooleanLiteral]
  }
  
  inline def NumericLiteral(span: Span, value: Double): typingsJapgolly.swcCore.typesMod.NumericLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.NumericLiteral]
  }
  
  inline def StringLiteral(span: Span, value: String): typingsJapgolly.swcCore.typesMod.StringLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.StringLiteral]
  }
  
  inline def TsTemplateLiteralType(quasis: js.Array[TemplateElement], span: Span, types: js.Array[TsType]): typingsJapgolly.swcCore.typesMod.TsTemplateLiteralType = {
    val __obj = js.Dynamic.literal(quasis = quasis.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TemplateLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsTemplateLiteralType]
  }
}
