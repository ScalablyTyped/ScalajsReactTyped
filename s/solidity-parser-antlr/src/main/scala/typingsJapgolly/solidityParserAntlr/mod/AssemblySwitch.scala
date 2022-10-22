package typingsJapgolly.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssemblySwitch
  extends StObject
     with BaseASTNode
     with ASTNode
     with AssemblyItem {
  
  @JSName("type")
  var type_AssemblySwitch: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblySwitch
}
object AssemblySwitch {
  
  inline def apply(): AssemblySwitch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblySwitch")
    __obj.asInstanceOf[AssemblySwitch]
  }
  
  extension [Self <: AssemblySwitch](x: Self) {
    
    inline def setType(value: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblySwitch): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
