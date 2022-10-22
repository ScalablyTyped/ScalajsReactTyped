package typingsJapgolly.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Conditional
  extends StObject
     with BaseASTNode
     with ASTNode
     with Expression {
  
  var falseExpression: ASTNode
  
  var trueExpression: ASTNode
  
  @JSName("type")
  var type_Conditional: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.Conditional
}
object Conditional {
  
  inline def apply(falseExpression: ASTNode, trueExpression: ASTNode): Conditional = {
    val __obj = js.Dynamic.literal(falseExpression = falseExpression.asInstanceOf[js.Any], trueExpression = trueExpression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Conditional")
    __obj.asInstanceOf[Conditional]
  }
  
  extension [Self <: Conditional](x: Self) {
    
    inline def setFalseExpression(value: ASTNode): Self = StObject.set(x, "falseExpression", value.asInstanceOf[js.Any])
    
    inline def setTrueExpression(value: ASTNode): Self = StObject.set(x, "trueExpression", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.Conditional): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
