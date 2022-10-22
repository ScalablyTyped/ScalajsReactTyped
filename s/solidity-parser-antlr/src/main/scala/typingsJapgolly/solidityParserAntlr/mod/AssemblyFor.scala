package typingsJapgolly.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssemblyFor
  extends StObject
     with BaseASTNode
     with ASTNode
     with AssemblyItem {
  
  @JSName("type")
  var type_AssemblyFor: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFor
}
object AssemblyFor {
  
  inline def apply(): AssemblyFor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblyFor")
    __obj.asInstanceOf[AssemblyFor]
  }
  
  extension [Self <: AssemblyFor](x: Self) {
    
    inline def setType(value: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
