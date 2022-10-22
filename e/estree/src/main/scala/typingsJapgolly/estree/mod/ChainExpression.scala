package typingsJapgolly.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChainExpression
  extends StObject
     with BaseNode {
  
  var expression: ChainElement
  
  @JSName("type")
  var type_ChainExpression: typingsJapgolly.estree.estreeStrings.ChainExpression
}
object ChainExpression {
  
  inline def apply(expression: ChainElement): ChainExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ChainExpression")
    __obj.asInstanceOf[ChainExpression]
  }
  
  extension [Self <: ChainExpression](x: Self) {
    
    inline def setExpression(value: ChainElement): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.estree.estreeStrings.ChainExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
