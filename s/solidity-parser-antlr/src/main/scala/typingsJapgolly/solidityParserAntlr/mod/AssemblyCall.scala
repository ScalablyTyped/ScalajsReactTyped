package typingsJapgolly.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssemblyCall
  extends StObject
     with BaseASTNode
     with ASTNode
     with AssemblyExpression {
  
  var arguments: js.Array[AssemblyExpression]
  
  var functionName: String
  
  @JSName("type")
  var type_AssemblyCall: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCall
}
object AssemblyCall {
  
  inline def apply(arguments: js.Array[AssemblyExpression], functionName: String): AssemblyCall = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssemblyCall")
    __obj.asInstanceOf[AssemblyCall]
  }
  
  extension [Self <: AssemblyCall](x: Self) {
    
    inline def setArguments(value: js.Array[AssemblyExpression]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsVarargs(value: AssemblyExpression*): Self = StObject.set(x, "arguments", js.Array(value*))
    
    inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCall): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
