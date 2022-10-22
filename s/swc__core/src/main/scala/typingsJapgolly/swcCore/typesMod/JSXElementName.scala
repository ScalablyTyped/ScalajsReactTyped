package typingsJapgolly.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swcCore.typesMod.Identifier
  - typingsJapgolly.swcCore.typesMod.JSXMemberExpression
  - typingsJapgolly.swcCore.typesMod.JSXNamespacedName
*/
trait JSXElementName extends StObject
object JSXElementName {
  
  inline def Identifier(optional: Boolean, span: Span, value: String): typingsJapgolly.swcCore.typesMod.Identifier = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.Identifier]
  }
  
  inline def JSXMemberExpression(`object`: JSXObject, property: Identifier): typingsJapgolly.swcCore.typesMod.JSXMemberExpression = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXMemberExpression")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.JSXMemberExpression]
  }
  
  inline def JSXNamespacedName(name: Identifier, namespace: Identifier): typingsJapgolly.swcCore.typesMod.JSXNamespacedName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXNamespacedName")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.JSXNamespacedName]
  }
}
