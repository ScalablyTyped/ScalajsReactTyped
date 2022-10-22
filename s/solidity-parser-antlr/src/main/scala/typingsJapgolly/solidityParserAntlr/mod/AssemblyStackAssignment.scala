package typingsJapgolly.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssemblyStackAssignment
  extends StObject
     with BaseASTNode
     with ASTNode
     with AssemblyItem {
  
  @JSName("type")
  var type_AssemblyStackAssignment: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyStackAssignment
}
object AssemblyStackAssignment {
  
  inline def apply(): AssemblyStackAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblyStackAssignment")
    __obj.asInstanceOf[AssemblyStackAssignment]
  }
  
  extension [Self <: AssemblyStackAssignment](x: Self) {
    
    inline def setType(value: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyStackAssignment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
