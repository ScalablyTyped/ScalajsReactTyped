package typingsJapgolly.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSNonNullExpression
  extends StObject
     with Node
     with Expression {
  
  var expression: Expression
  
  @JSName("type")
  var type_TSNonNullExpression: typingsJapgolly.babelTypes.babelTypesStrings.TSNonNullExpression
}
object TSNonNullExpression {
  
  @JSImport("babel-types", "TSNonNullExpression")
  @js.native
  def apply(expression: Expression): TSNonNullExpression = js.native
  
  extension [Self <: TSNonNullExpression](x: Self) {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.babelTypes.babelTypesStrings.TSNonNullExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
