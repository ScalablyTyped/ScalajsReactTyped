package typingsJapgolly.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.libMod.FunctionDeclaration_
  - typingsJapgolly.babelTypes.libMod.FunctionExpression_
  - typingsJapgolly.babelTypes.libMod.StringLiteral_
  - typingsJapgolly.babelTypes.libMod.NumericLiteral_
  - typingsJapgolly.babelTypes.libMod.NullLiteral_
  - typingsJapgolly.babelTypes.libMod.BooleanLiteral_
  - typingsJapgolly.babelTypes.libMod.RegExpLiteral_
  - typingsJapgolly.babelTypes.libMod.ArrowFunctionExpression_
  - typingsJapgolly.babelTypes.libMod.BigIntLiteral_
  - typingsJapgolly.babelTypes.libMod.DecimalLiteral_
*/
trait Pureish extends StObject
object Pureish {
  
  inline def ArrowFunctionExpression_(
    async: Boolean,
    body: BlockStatement_ | Expression,
    expression: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_]
  ): typingsJapgolly.babelTypes.libMod.ArrowFunctionExpression_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrowFunctionExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ArrowFunctionExpression_]
  }
  
  inline def BigIntLiteral_(value: String): typingsJapgolly.babelTypes.libMod.BigIntLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BigIntLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.BigIntLiteral_]
  }
  
  inline def BooleanLiteral_(value: Boolean): typingsJapgolly.babelTypes.libMod.BooleanLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.BooleanLiteral_]
  }
  
  inline def DecimalLiteral_(value: String): typingsJapgolly.babelTypes.libMod.DecimalLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DecimalLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.DecimalLiteral_]
  }
  
  inline def FunctionDeclaration_(
    async: Boolean,
    body: BlockStatement_,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_]
  ): typingsJapgolly.babelTypes.libMod.FunctionDeclaration_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.FunctionDeclaration_]
  }
  
  inline def FunctionExpression_(
    async: Boolean,
    body: BlockStatement_,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_]
  ): typingsJapgolly.babelTypes.libMod.FunctionExpression_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.FunctionExpression_]
  }
  
  inline def NullLiteral_(): typingsJapgolly.babelTypes.libMod.NullLiteral_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NullLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.NullLiteral_]
  }
  
  inline def NumericLiteral_(value: Double): typingsJapgolly.babelTypes.libMod.NumericLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.NumericLiteral_]
  }
  
  inline def RegExpLiteral_(flags: String, pattern: String): typingsJapgolly.babelTypes.libMod.RegExpLiteral_ = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RegExpLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.RegExpLiteral_]
  }
  
  inline def StringLiteral_(value: String): typingsJapgolly.babelTypes.libMod.StringLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.StringLiteral_]
  }
}
