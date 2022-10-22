package typingsJapgolly.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swcWasm.mod.BindingIdentifier
  - typingsJapgolly.swcWasm.mod.ArrayPattern
  - typingsJapgolly.swcWasm.mod.RestElement
  - typingsJapgolly.swcWasm.mod.ObjectPattern
*/
trait TsFnParameter extends StObject
object TsFnParameter {
  
  inline def ArrayPattern(elements: js.Array[js.UndefOr[Pattern]], optional: Boolean, span: Span): typingsJapgolly.swcWasm.mod.ArrayPattern = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayPattern")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.ArrayPattern]
  }
  
  inline def BindingIdentifier(optional: Boolean, span: Span, value: String): typingsJapgolly.swcWasm.mod.BindingIdentifier = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.BindingIdentifier]
  }
  
  inline def ObjectPattern(optional: Boolean, properties: js.Array[ObjectPatternProperty], span: Span): typingsJapgolly.swcWasm.mod.ObjectPattern = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectPattern")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.ObjectPattern]
  }
  
  inline def RestElement(argument: Pattern, rest: Span, span: Span): typingsJapgolly.swcWasm.mod.RestElement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RestElement")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.RestElement]
  }
}
