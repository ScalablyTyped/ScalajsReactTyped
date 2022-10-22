package typingsJapgolly.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssemblyFunctionReturns
  extends StObject
     with BaseASTNode
     with ASTNode {
  
  @JSName("type")
  var type_AssemblyFunctionReturns: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionReturns
}
object AssemblyFunctionReturns {
  
  inline def apply(): AssemblyFunctionReturns = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblyFunctionReturns")
    __obj.asInstanceOf[AssemblyFunctionReturns]
  }
  
  extension [Self <: AssemblyFunctionReturns](x: Self) {
    
    inline def setType(value: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionReturns): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
