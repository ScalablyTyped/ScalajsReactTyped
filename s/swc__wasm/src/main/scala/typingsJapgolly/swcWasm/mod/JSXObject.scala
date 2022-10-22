package typingsJapgolly.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swcWasm.mod.JSXMemberExpression
  - typingsJapgolly.swcWasm.mod.Identifier
*/
trait JSXObject extends StObject
object JSXObject {
  
  inline def Identifier(optional: Boolean, span: Span, value: String): typingsJapgolly.swcWasm.mod.Identifier = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.Identifier]
  }
  
  inline def JSXMemberExpression(`object`: JSXObject, property: Identifier): typingsJapgolly.swcWasm.mod.JSXMemberExpression = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXMemberExpression")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.JSXMemberExpression]
  }
}
