package typingsJapgolly.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValue
  extends StObject
     with BaseASTNode
     with ASTNode {
  
  var name: String
  
  @JSName("type")
  var type_EnumValue: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.EnumValue
}
object EnumValue {
  
  inline def apply(name: String): EnumValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumValue")
    __obj.asInstanceOf[EnumValue]
  }
  
  extension [Self <: EnumValue](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.EnumValue): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
