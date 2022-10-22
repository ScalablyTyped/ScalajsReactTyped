package typingsJapgolly.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementaryTypeName
  extends StObject
     with BaseASTNode
     with ASTNode
     with TypeName {
  
  var name: String
  
  @JSName("type")
  var type_ElementaryTypeName: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeName
}
object ElementaryTypeName {
  
  inline def apply(name: String): ElementaryTypeName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ElementaryTypeName")
    __obj.asInstanceOf[ElementaryTypeName]
  }
  
  extension [Self <: ElementaryTypeName](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
