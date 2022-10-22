package typingsJapgolly.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssemblyCase
  extends StObject
     with BaseASTNode
     with ASTNode {
  
  @JSName("type")
  var type_AssemblyCase: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCase
}
object AssemblyCase {
  
  inline def apply(): AssemblyCase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblyCase")
    __obj.asInstanceOf[AssemblyCase]
  }
  
  extension [Self <: AssemblyCase](x: Self) {
    
    inline def setType(value: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCase): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
