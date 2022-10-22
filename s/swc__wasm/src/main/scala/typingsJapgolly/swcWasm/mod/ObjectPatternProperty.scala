package typingsJapgolly.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swcWasm.mod.KeyValuePatternProperty
  - typingsJapgolly.swcWasm.mod.AssignmentPatternProperty
  - typingsJapgolly.swcWasm.mod.RestElement
*/
trait ObjectPatternProperty extends StObject
object ObjectPatternProperty {
  
  inline def AssignmentPatternProperty(key: Identifier, span: Span): typingsJapgolly.swcWasm.mod.AssignmentPatternProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentPatternProperty")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.AssignmentPatternProperty]
  }
  
  inline def KeyValuePatternProperty(key: PropertyName, value: Pattern): typingsJapgolly.swcWasm.mod.KeyValuePatternProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("KeyValuePatternProperty")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.KeyValuePatternProperty]
  }
  
  inline def RestElement(argument: Pattern, rest: Span, span: Span): typingsJapgolly.swcWasm.mod.RestElement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RestElement")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.RestElement]
  }
}
