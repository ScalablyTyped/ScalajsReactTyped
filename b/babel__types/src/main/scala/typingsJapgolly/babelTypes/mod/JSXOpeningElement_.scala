package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.JSXOpeningElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.babelTypes.mod._Node because Already inherited */ trait JSXOpeningElement_
  extends StObject
     with BaseNode
     with Immutable
     with JSX {
  
  var attributes: js.Array[JSXAttribute_ | JSXSpreadAttribute_]
  
  var name: JSXIdentifier_ | JSXMemberExpression_ | JSXNamespacedName_
  
  var selfClosing: Boolean
  
  var typeParameters: TypeParameterInstantiation_ | TSTypeParameterInstantiation_ | Null
  
  @JSName("type")
  var type_JSXOpeningElement_ : JSXOpeningElement
}
object JSXOpeningElement_ {
  
  inline def apply(
    attributes: js.Array[JSXAttribute_ | JSXSpreadAttribute_],
    name: JSXIdentifier_ | JSXMemberExpression_ | JSXNamespacedName_,
    selfClosing: Boolean
  ): JSXOpeningElement_ = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("JSXOpeningElement")
    __obj.asInstanceOf[JSXOpeningElement_]
  }
  
  extension [Self <: JSXOpeningElement_](x: Self) {
    
    inline def setAttributes(value: js.Array[JSXAttribute_ | JSXSpreadAttribute_]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: (JSXAttribute_ | JSXSpreadAttribute_)*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setName(value: JSXIdentifier_ | JSXMemberExpression_ | JSXNamespacedName_): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSelfClosing(value: Boolean): Self = StObject.set(x, "selfClosing", value.asInstanceOf[js.Any])
    
    inline def setType(value: JSXOpeningElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TypeParameterInstantiation_ | TSTypeParameterInstantiation_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
