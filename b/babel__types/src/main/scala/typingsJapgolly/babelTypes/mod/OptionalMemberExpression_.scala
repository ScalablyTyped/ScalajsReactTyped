package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.OptionalMemberExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.babelTypes.mod._Node because Already inherited */ trait OptionalMemberExpression_
  extends StObject
     with BaseNode
     with Expression
     with Standardized {
  
  var computed: Boolean
  
  var `object`: Expression
  
  var optional: Boolean
  
  var property: Expression | Identifier_
  
  @JSName("type")
  var type_OptionalMemberExpression_ : OptionalMemberExpression
}
object OptionalMemberExpression_ {
  
  inline def apply(computed: Boolean, `object`: Expression, optional: Boolean, property: Expression | Identifier_): OptionalMemberExpression_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OptionalMemberExpression")
    __obj.asInstanceOf[OptionalMemberExpression_]
  }
  
  extension [Self <: OptionalMemberExpression_](x: Self) {
    
    inline def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    inline def setObject(value: Expression): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: Expression | Identifier_): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setType(value: OptionalMemberExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
