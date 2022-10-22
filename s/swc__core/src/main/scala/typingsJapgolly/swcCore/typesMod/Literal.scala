package typingsJapgolly.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swcCore.typesMod.StringLiteral
  - typingsJapgolly.swcCore.typesMod.BooleanLiteral
  - typingsJapgolly.swcCore.typesMod.NullLiteral
  - typingsJapgolly.swcCore.typesMod.NumericLiteral
  - typingsJapgolly.swcCore.typesMod.BigIntLiteral
  - typingsJapgolly.swcCore.typesMod.RegExpLiteral
  - typingsJapgolly.swcCore.typesMod.JSXText
*/
trait Literal
  extends StObject
     with Expression
     with JSXAttrValue
object Literal {
  
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
  
  inline def JSXText(raw: String, span: Span, value: String): typingsJapgolly.swcCore.typesMod.JSXText = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXText")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.JSXText]
  }
  
  inline def NullLiteral(span: Span): typingsJapgolly.swcCore.typesMod.NullLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NullLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.NullLiteral]
  }
  
  inline def NumericLiteral(span: Span, value: Double): typingsJapgolly.swcCore.typesMod.NumericLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.NumericLiteral]
  }
  
  inline def RegExpLiteral(flags: String, pattern: String, span: Span): typingsJapgolly.swcCore.typesMod.RegExpLiteral = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RegExpLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.RegExpLiteral]
  }
  
  inline def StringLiteral(span: Span, value: String): typingsJapgolly.swcCore.typesMod.StringLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.StringLiteral]
  }
}
