package typingsJapgolly.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swcWasm.mod.StringLiteral
  - typingsJapgolly.swcWasm.mod.BooleanLiteral
  - typingsJapgolly.swcWasm.mod.NullLiteral
  - typingsJapgolly.swcWasm.mod.NumericLiteral
  - typingsJapgolly.swcWasm.mod.BigIntLiteral
  - typingsJapgolly.swcWasm.mod.RegExpLiteral
  - typingsJapgolly.swcWasm.mod.JSXText
*/
trait Literal
  extends StObject
     with Expression
     with JSXAttrValue
object Literal {
  
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
  
  inline def JSXText(raw: String, span: Span, value: String): typingsJapgolly.swcWasm.mod.JSXText = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXText")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.JSXText]
  }
  
  inline def NullLiteral(span: Span): typingsJapgolly.swcWasm.mod.NullLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NullLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.NullLiteral]
  }
  
  inline def NumericLiteral(span: Span, value: Double): typingsJapgolly.swcWasm.mod.NumericLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.NumericLiteral]
  }
  
  inline def RegExpLiteral(flags: String, pattern: String, span: Span): typingsJapgolly.swcWasm.mod.RegExpLiteral = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RegExpLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.RegExpLiteral]
  }
  
  inline def StringLiteral(span: Span, value: String): typingsJapgolly.swcWasm.mod.StringLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.StringLiteral]
  }
}
