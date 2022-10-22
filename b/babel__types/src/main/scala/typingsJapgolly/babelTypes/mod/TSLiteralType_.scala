package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.TSLiteralType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.babelTypes.mod._Node because Already inherited */ trait TSLiteralType_
  extends StObject
     with BaseNode
     with TSBaseType
     with TSType
     with TypeScript {
  
  var literal: NumericLiteral_ | StringLiteral_ | BooleanLiteral_ | BigIntLiteral_ | TemplateLiteral_ | UnaryExpression_
  
  @JSName("type")
  var type_TSLiteralType_ : TSLiteralType
}
object TSLiteralType_ {
  
  inline def apply(
    literal: NumericLiteral_ | StringLiteral_ | BooleanLiteral_ | BigIntLiteral_ | TemplateLiteral_ | UnaryExpression_
  ): TSLiteralType_ = {
    val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSLiteralType")
    __obj.asInstanceOf[TSLiteralType_]
  }
  
  extension [Self <: TSLiteralType_](x: Self) {
    
    inline def setLiteral(
      value: NumericLiteral_ | StringLiteral_ | BooleanLiteral_ | BigIntLiteral_ | TemplateLiteral_ | UnaryExpression_
    ): Self = StObject.set(x, "literal", value.asInstanceOf[js.Any])
    
    inline def setType(value: TSLiteralType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
