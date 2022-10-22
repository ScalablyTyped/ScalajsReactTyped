package typingsJapgolly.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.solidityParserAntlr.mod.BooleanLiteral
  - typingsJapgolly.solidityParserAntlr.mod.NumberLiteral
  - typingsJapgolly.solidityParserAntlr.mod.Identifier
  - typingsJapgolly.solidityParserAntlr.mod.TupleExpression
  - typingsJapgolly.solidityParserAntlr.mod.ElementaryTypeNameExpression
*/
trait PrimaryExpression
  extends StObject
     with Expression
object PrimaryExpression {
  
  inline def BooleanLiteral(value: Boolean): typingsJapgolly.solidityParserAntlr.mod.BooleanLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.BooleanLiteral]
  }
  
  inline def ElementaryTypeNameExpression(typeName: ElementaryTypeName): typingsJapgolly.solidityParserAntlr.mod.ElementaryTypeNameExpression = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ElementaryTypeNameExpression")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.ElementaryTypeNameExpression]
  }
  
  inline def Identifier(name: String): typingsJapgolly.solidityParserAntlr.mod.Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.Identifier]
  }
  
  inline def NumberLiteral(number: String): typingsJapgolly.solidityParserAntlr.mod.NumberLiteral = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], subdenomination = null)
    __obj.updateDynamic("type")("NumberLiteral")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.NumberLiteral]
  }
  
  inline def TupleExpression(components: js.Array[Expression], isArray: Boolean): typingsJapgolly.solidityParserAntlr.mod.TupleExpression = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], isArray = isArray.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TupleExpression")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.TupleExpression]
  }
}
