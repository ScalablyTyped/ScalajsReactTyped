package typingsJapgolly.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.mod.StringLiteral_
  - typingsJapgolly.babelTypes.mod.NumericLiteral_
  - typingsJapgolly.babelTypes.mod.NullLiteral_
  - typingsJapgolly.babelTypes.mod.BooleanLiteral_
  - typingsJapgolly.babelTypes.mod.RegExpLiteral_
  - typingsJapgolly.babelTypes.mod.TemplateLiteral_
  - typingsJapgolly.babelTypes.mod.BigIntLiteral_
  - typingsJapgolly.babelTypes.mod.DecimalLiteral_
*/
trait Literal
  extends StObject
     with _Node
object Literal {
  
  inline def BigIntLiteral_(value: String): typingsJapgolly.babelTypes.mod.BigIntLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BigIntLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.BigIntLiteral_]
  }
  
  inline def BooleanLiteral_(value: Boolean): typingsJapgolly.babelTypes.mod.BooleanLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.BooleanLiteral_]
  }
  
  inline def DecimalLiteral_(value: String): typingsJapgolly.babelTypes.mod.DecimalLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DecimalLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.DecimalLiteral_]
  }
  
  inline def NullLiteral_(): typingsJapgolly.babelTypes.mod.NullLiteral_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("NullLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.NullLiteral_]
  }
  
  inline def NumericLiteral_(value: Double): typingsJapgolly.babelTypes.mod.NumericLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.NumericLiteral_]
  }
  
  inline def RegExpLiteral_(flags: String, pattern: String): typingsJapgolly.babelTypes.mod.RegExpLiteral_ = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("RegExpLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.RegExpLiteral_]
  }
  
  inline def StringLiteral_(value: String): typingsJapgolly.babelTypes.mod.StringLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.StringLiteral_]
  }
  
  inline def TemplateLiteral_(expressions: js.Array[Expression | TSType], quasis: js.Array[TemplateElement_]): typingsJapgolly.babelTypes.mod.TemplateLiteral_ = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TemplateLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TemplateLiteral_]
  }
}
