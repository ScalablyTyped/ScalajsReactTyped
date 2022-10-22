package typingsJapgolly.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnStatement
  extends StObject
     with BaseASTNode
     with ASTNode
     with Statement {
  
  var expression: Expression | Null
  
  @JSName("type")
  var type_ReturnStatement: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ReturnStatement
}
object ReturnStatement {
  
  inline def apply(): ReturnStatement = {
    val __obj = js.Dynamic.literal(expression = null)
    __obj.updateDynamic("type")("ReturnStatement")
    __obj.asInstanceOf[ReturnStatement]
  }
  
  extension [Self <: ReturnStatement](x: Self) {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionNull: Self = StObject.set(x, "expression", null)
    
    inline def setType(value: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ReturnStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
