package typingsJapgolly.babelTypes.libMod

import typingsJapgolly.babelTypes.babelTypesStrings.BlockStatement
import typingsJapgolly.babelTypes.babelTypesStrings.ClassBody
import typingsJapgolly.babelTypes.babelTypesStrings.Identifier
import typingsJapgolly.babelTypes.babelTypesStrings.Placeholder
import typingsJapgolly.babelTypes.babelTypesStrings.StringLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Placeholder_
  extends StObject
     with BaseNode
     with Miscellaneous
     with Node {
  
  var expectedNode: Identifier | StringLiteral | typingsJapgolly.babelTypes.babelTypesStrings.Expression | typingsJapgolly.babelTypes.babelTypesStrings.Statement | typingsJapgolly.babelTypes.babelTypesStrings.Declaration | BlockStatement | ClassBody | typingsJapgolly.babelTypes.babelTypesStrings.Pattern
  
  var name: Identifier_
  
  @JSName("type")
  var type_Placeholder_ : Placeholder
}
object Placeholder_ {
  
  inline def apply(
    expectedNode: Identifier | StringLiteral | typingsJapgolly.babelTypes.babelTypesStrings.Expression | typingsJapgolly.babelTypes.babelTypesStrings.Statement | typingsJapgolly.babelTypes.babelTypesStrings.Declaration | BlockStatement | ClassBody | typingsJapgolly.babelTypes.babelTypesStrings.Pattern,
    name: Identifier_
  ): Placeholder_ = {
    val __obj = js.Dynamic.literal(expectedNode = expectedNode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Placeholder")
    __obj.asInstanceOf[Placeholder_]
  }
  
  extension [Self <: Placeholder_](x: Self) {
    
    inline def setExpectedNode(
      value: Identifier | StringLiteral | typingsJapgolly.babelTypes.babelTypesStrings.Expression | typingsJapgolly.babelTypes.babelTypesStrings.Statement | typingsJapgolly.babelTypes.babelTypesStrings.Declaration | BlockStatement | ClassBody | typingsJapgolly.babelTypes.babelTypesStrings.Pattern
    ): Self = StObject.set(x, "expectedNode", value.asInstanceOf[js.Any])
    
    inline def setName(value: Identifier_): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: Placeholder): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
