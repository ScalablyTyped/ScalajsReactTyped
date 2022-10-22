package typingsJapgolly.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinaryOperation
  extends StObject
     with BaseASTNode
     with ASTNode
     with Expression {
  
  var left: Expression
  
  var operator: BinOp
  
  var right: Expression
  
  @JSName("type")
  var type_BinaryOperation: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.BinaryOperation
}
object BinaryOperation {
  
  inline def apply(left: Expression, operator: BinOp, right: Expression): BinaryOperation = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BinaryOperation")
    __obj.asInstanceOf[BinaryOperation]
  }
  
  extension [Self <: BinaryOperation](x: Self) {
    
    inline def setLeft(value: Expression): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: BinOp): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.BinaryOperation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
