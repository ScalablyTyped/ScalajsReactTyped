package typingsJapgolly.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PragmaDirective
  extends StObject
     with BaseASTNode
     with ASTNode {
  
  var name: String
  
  @JSName("type")
  var type_PragmaDirective: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.PragmaDirective
  
  var value: String
}
object PragmaDirective {
  
  inline def apply(name: String, value: String): PragmaDirective = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PragmaDirective")
    __obj.asInstanceOf[PragmaDirective]
  }
  
  extension [Self <: PragmaDirective](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.PragmaDirective): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
