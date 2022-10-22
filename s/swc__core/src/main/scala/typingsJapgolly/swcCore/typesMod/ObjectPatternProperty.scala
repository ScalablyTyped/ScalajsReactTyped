package typingsJapgolly.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swcCore.typesMod.KeyValuePatternProperty
  - typingsJapgolly.swcCore.typesMod.AssignmentPatternProperty
  - typingsJapgolly.swcCore.typesMod.RestElement
*/
trait ObjectPatternProperty extends StObject
object ObjectPatternProperty {
  
  inline def AssignmentPatternProperty(key: Identifier, span: Span): typingsJapgolly.swcCore.typesMod.AssignmentPatternProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentPatternProperty")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.AssignmentPatternProperty]
  }
  
  inline def KeyValuePatternProperty(key: PropertyName, value: Pattern): typingsJapgolly.swcCore.typesMod.KeyValuePatternProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("KeyValuePatternProperty")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.KeyValuePatternProperty]
  }
  
  inline def RestElement(argument: Pattern, rest: Span, span: Span): typingsJapgolly.swcCore.typesMod.RestElement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RestElement")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.RestElement]
  }
}
