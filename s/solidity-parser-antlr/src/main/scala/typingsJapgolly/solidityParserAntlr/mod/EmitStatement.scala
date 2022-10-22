package typingsJapgolly.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmitStatement
  extends StObject
     with BaseASTNode
     with ASTNode
     with Statement {
  
  var eventCall: FunctionCall
  
  @JSName("type")
  var type_EmitStatement: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.EmitStatement
}
object EmitStatement {
  
  inline def apply(eventCall: FunctionCall): EmitStatement = {
    val __obj = js.Dynamic.literal(eventCall = eventCall.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EmitStatement")
    __obj.asInstanceOf[EmitStatement]
  }
  
  extension [Self <: EmitStatement](x: Self) {
    
    inline def setEventCall(value: FunctionCall): Self = StObject.set(x, "eventCall", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.EmitStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
