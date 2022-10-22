package typingsJapgolly.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSAsExpression
  extends StObject
     with Node
     with Expression {
  
  var expression: Expression
  
  var typeAnnotation: TSType
  
  @JSName("type")
  var type_TSAsExpression: typingsJapgolly.babelTypes.babelTypesStrings.TSAsExpression
}
object TSAsExpression {
  
  @JSImport("babel-types", "TSAsExpression")
  @js.native
  def apply(expression: Expression, typeAnnotation: TSType): TSAsExpression = js.native
  
  extension [Self <: TSAsExpression](x: Self) {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.babelTypes.babelTypesStrings.TSAsExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
