package typingsJapgolly.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BooleanLiteral
  extends StObject
     with BaseASTNode
     with PrimaryExpression {
  
  @JSName("type")
  var type_BooleanLiteral: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.BooleanLiteral
  
  var value: Boolean
}
object BooleanLiteral {
  
  inline def apply(value: Boolean): BooleanLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[BooleanLiteral]
  }
  
  extension [Self <: BooleanLiteral](x: Self) {
    
    inline def setType(value: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.BooleanLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
