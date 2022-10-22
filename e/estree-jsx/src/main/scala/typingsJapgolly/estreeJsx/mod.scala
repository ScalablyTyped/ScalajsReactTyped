package typingsJapgolly.estreeJsx

import typingsJapgolly.estree.mod.BaseExpression
import typingsJapgolly.estree.mod.BaseNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.estreeJsx.mod.JSXSimpleAttribute
    - typingsJapgolly.estreeJsx.mod.JSXSpreadAttribute
  */
  trait JSXAttribute extends StObject
  object JSXAttribute {
    
    inline def JSXSimpleAttribute(name: JSXIdentifier): typingsJapgolly.estreeJsx.mod.JSXSimpleAttribute = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = null)
      __obj.updateDynamic("type")("JSXAttribute")
      __obj.asInstanceOf[typingsJapgolly.estreeJsx.mod.JSXSimpleAttribute]
    }
    
    inline def JSXSpreadAttribute(argument: BaseExpression): typingsJapgolly.estreeJsx.mod.JSXSpreadAttribute = {
      val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("JSXSpreadAttribute")
      __obj.asInstanceOf[typingsJapgolly.estreeJsx.mod.JSXSpreadAttribute]
    }
  }
  
  trait JSXBaseAttribute
    extends StObject
       with BaseNode {
    
    @JSName("type")
    val type_JSXBaseAttribute: typingsJapgolly.estreeJsx.estreeJsxStrings.JSXAttribute | typingsJapgolly.estreeJsx.estreeJsxStrings.JSXSpreadAttribute
  }
  object JSXBaseAttribute {
    
    inline def apply(
      `type`: typingsJapgolly.estreeJsx.estreeJsxStrings.JSXAttribute | typingsJapgolly.estreeJsx.estreeJsxStrings.JSXSpreadAttribute
    ): JSXBaseAttribute = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSXBaseAttribute]
    }
    
    extension [Self <: JSXBaseAttribute](x: Self) {
      
      inline def setType(
        value: typingsJapgolly.estreeJsx.estreeJsxStrings.JSXAttribute | typingsJapgolly.estreeJsx.estreeJsxStrings.JSXSpreadAttribute
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait JSXClosingElement
    extends StObject
       with BaseNode {
    
    val name: JSXIdentifier
    
    @JSName("type")
    val type_JSXClosingElement: typingsJapgolly.estreeJsx.estreeJsxStrings.JSXClosingElement
  }
  object JSXClosingElement {
    
    inline def apply(name: JSXIdentifier): JSXClosingElement = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("JSXClosingElement")
      __obj.asInstanceOf[JSXClosingElement]
    }
    
    extension [Self <: JSXClosingElement](x: Self) {
      
      inline def setName(value: JSXIdentifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: typingsJapgolly.estreeJsx.estreeJsxStrings.JSXClosingElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait JSXElement
    extends StObject
       with BaseNode {
    
    val children: js.Array[BaseExpression]
    
    val closingElement: JSXClosingElement | Null
    
    val openingElement: JSXOpeningElement
    
    @JSName("type")
    val type_JSXElement: typingsJapgolly.estreeJsx.estreeJsxStrings.JSXElement
  }
  object JSXElement {
    
    inline def apply(children: js.Array[BaseExpression], openingElement: JSXOpeningElement): JSXElement = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any], closingElement = null)
      __obj.updateDynamic("type")("JSXElement")
      __obj.asInstanceOf[JSXElement]
    }
    
    extension [Self <: JSXElement](x: Self) {
      
      inline def setChildren(value: js.Array[BaseExpression]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: BaseExpression*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setClosingElement(value: JSXClosingElement): Self = StObject.set(x, "closingElement", value.asInstanceOf[js.Any])
      
      inline def setClosingElementNull: Self = StObject.set(x, "closingElement", null)
      
      inline def setOpeningElement(value: JSXOpeningElement): Self = StObject.set(x, "openingElement", value.asInstanceOf[js.Any])
      
      inline def setType(value: typingsJapgolly.estreeJsx.estreeJsxStrings.JSXElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait JSXExpressionContainer
    extends StObject
       with BaseNode {
    
    val expression: BaseExpression
    
    @JSName("type")
    val type_JSXExpressionContainer: typingsJapgolly.estreeJsx.estreeJsxStrings.JSXExpressionContainer
  }
  object JSXExpressionContainer {
    
    inline def apply(expression: BaseExpression): JSXExpressionContainer = {
      val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("JSXExpressionContainer")
      __obj.asInstanceOf[JSXExpressionContainer]
    }
    
    extension [Self <: JSXExpressionContainer](x: Self) {
      
      inline def setExpression(value: BaseExpression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      inline def setType(value: typingsJapgolly.estreeJsx.estreeJsxStrings.JSXExpressionContainer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait JSXFragment
    extends StObject
       with BaseNode {
    
    val children: js.Array[BaseExpression]
    
    @JSName("type")
    val type_JSXFragment: typingsJapgolly.estreeJsx.estreeJsxStrings.JSXFragment
  }
  object JSXFragment {
    
    inline def apply(children: js.Array[BaseExpression]): JSXFragment = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("JSXFragment")
      __obj.asInstanceOf[JSXFragment]
    }
    
    extension [Self <: JSXFragment](x: Self) {
      
      inline def setChildren(value: js.Array[BaseExpression]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: BaseExpression*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setType(value: typingsJapgolly.estreeJsx.estreeJsxStrings.JSXFragment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait JSXIdentifier
    extends StObject
       with BaseNode {
    
    val name: String
    
    @JSName("type")
    val type_JSXIdentifier: typingsJapgolly.estreeJsx.estreeJsxStrings.JSXIdentifier
  }
  object JSXIdentifier {
    
    inline def apply(name: String): JSXIdentifier = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("JSXIdentifier")
      __obj.asInstanceOf[JSXIdentifier]
    }
    
    extension [Self <: JSXIdentifier](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: typingsJapgolly.estreeJsx.estreeJsxStrings.JSXIdentifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait JSXOpeningElement
    extends StObject
       with BaseNode {
    
    val attributes: js.Array[JSXAttribute]
    
    val name: JSXIdentifier
    
    val selfClosing: Boolean
    
    @JSName("type")
    val type_JSXOpeningElement: typingsJapgolly.estreeJsx.estreeJsxStrings.JSXOpeningElement
  }
  object JSXOpeningElement {
    
    inline def apply(attributes: js.Array[JSXAttribute], name: JSXIdentifier, selfClosing: Boolean): JSXOpeningElement = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("JSXOpeningElement")
      __obj.asInstanceOf[JSXOpeningElement]
    }
    
    extension [Self <: JSXOpeningElement](x: Self) {
      
      inline def setAttributes(value: js.Array[JSXAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesVarargs(value: JSXAttribute*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setName(value: JSXIdentifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSelfClosing(value: Boolean): Self = StObject.set(x, "selfClosing", value.asInstanceOf[js.Any])
      
      inline def setType(value: typingsJapgolly.estreeJsx.estreeJsxStrings.JSXOpeningElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait JSXSimpleAttribute
    extends StObject
       with JSXBaseAttribute
       with JSXAttribute {
    
    val name: JSXIdentifier
    
    @JSName("type")
    val type_JSXSimpleAttribute: typingsJapgolly.estreeJsx.estreeJsxStrings.JSXAttribute
    
    val value: BaseExpression | Null
  }
  object JSXSimpleAttribute {
    
    inline def apply(name: JSXIdentifier): JSXSimpleAttribute = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = null)
      __obj.updateDynamic("type")("JSXAttribute")
      __obj.asInstanceOf[JSXSimpleAttribute]
    }
    
    extension [Self <: JSXSimpleAttribute](x: Self) {
      
      inline def setName(value: JSXIdentifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: typingsJapgolly.estreeJsx.estreeJsxStrings.JSXAttribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: BaseExpression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
    }
  }
  
  trait JSXSpreadAttribute
    extends StObject
       with JSXBaseAttribute
       with JSXAttribute {
    
    val argument: BaseExpression
    
    @JSName("type")
    val type_JSXSpreadAttribute: typingsJapgolly.estreeJsx.estreeJsxStrings.JSXSpreadAttribute
  }
  object JSXSpreadAttribute {
    
    inline def apply(argument: BaseExpression): JSXSpreadAttribute = {
      val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("JSXSpreadAttribute")
      __obj.asInstanceOf[JSXSpreadAttribute]
    }
    
    extension [Self <: JSXSpreadAttribute](x: Self) {
      
      inline def setArgument(value: BaseExpression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
      
      inline def setType(value: typingsJapgolly.estreeJsx.estreeJsxStrings.JSXSpreadAttribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait JSXText
    extends StObject
       with BaseNode {
    
    @JSName("type")
    val type_JSXText: typingsJapgolly.estreeJsx.estreeJsxStrings.JSXText
    
    val value: String
  }
  object JSXText {
    
    inline def apply(value: String): JSXText = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("JSXText")
      __obj.asInstanceOf[JSXText]
    }
    
    extension [Self <: JSXText](x: Self) {
      
      inline def setType(value: typingsJapgolly.estreeJsx.estreeJsxStrings.JSXText): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
