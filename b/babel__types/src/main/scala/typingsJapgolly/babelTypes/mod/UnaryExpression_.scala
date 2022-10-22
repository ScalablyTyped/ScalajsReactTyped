package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.Exclamationmark
import typingsJapgolly.babelTypes.babelTypesStrings.Plussign
import typingsJapgolly.babelTypes.babelTypesStrings.Tilde
import typingsJapgolly.babelTypes.babelTypesStrings.UnaryExpression
import typingsJapgolly.babelTypes.babelTypesStrings.`-_`
import typingsJapgolly.babelTypes.babelTypesStrings.`throw`
import typingsJapgolly.babelTypes.babelTypesStrings.delete
import typingsJapgolly.babelTypes.babelTypesStrings.typeof
import typingsJapgolly.babelTypes.babelTypesStrings.void
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.babelTypes.mod._Node because Already inherited */ trait UnaryExpression_
  extends StObject
     with BaseNode
     with Expression
     with Standardized
     with UnaryLike {
  
  var argument: Expression
  
  var operator: void | `throw` | delete | Exclamationmark | Plussign | `-_` | Tilde | typeof
  
  var prefix: Boolean
  
  @JSName("type")
  var type_UnaryExpression_ : UnaryExpression
}
object UnaryExpression_ {
  
  inline def apply(
    argument: Expression,
    operator: void | `throw` | delete | Exclamationmark | Plussign | `-_` | Tilde | typeof,
    prefix: Boolean
  ): UnaryExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("UnaryExpression")
    __obj.asInstanceOf[UnaryExpression_]
  }
  
  extension [Self <: UnaryExpression_](x: Self) {
    
    inline def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: void | `throw` | delete | Exclamationmark | Plussign | `-_` | Tilde | typeof): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: Boolean): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setType(value: UnaryExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
