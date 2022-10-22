package typingsJapgolly.solidityParserAntlr.mod

import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.days
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ether
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.finney
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.hours
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.minutes
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.seconds
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.szabo
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.weeks
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.wei
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.years
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberLiteral
  extends StObject
     with BaseASTNode
     with AssemblyItem
     with PrimaryExpression {
  
  var number: String
  
  var subdenomination: Null | wei | szabo | finney | ether | seconds | minutes | hours | days | weeks | years
  
  @JSName("type")
  var type_NumberLiteral: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral
}
object NumberLiteral {
  
  inline def apply(number: String): NumberLiteral = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], subdenomination = null)
    __obj.updateDynamic("type")("NumberLiteral")
    __obj.asInstanceOf[NumberLiteral]
  }
  
  extension [Self <: NumberLiteral](x: Self) {
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setSubdenomination(value: wei | szabo | finney | ether | seconds | minutes | hours | days | weeks | years): Self = StObject.set(x, "subdenomination", value.asInstanceOf[js.Any])
    
    inline def setSubdenominationNull: Self = StObject.set(x, "subdenomination", null)
    
    inline def setType(value: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
