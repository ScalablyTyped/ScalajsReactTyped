package typingsJapgolly.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssemblyIf
  extends StObject
     with BaseASTNode
     with ASTNode
     with AssemblyItem {
  
  @JSName("type")
  var type_AssemblyIf: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyIf
}
object AssemblyIf {
  
  inline def apply(): AssemblyIf = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblyIf")
    __obj.asInstanceOf[AssemblyIf]
  }
  
  extension [Self <: AssemblyIf](x: Self) {
    
    inline def setType(value: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyIf): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
