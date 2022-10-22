package typingsJapgolly.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swcWasm.mod.Identifier
  - typingsJapgolly.swcWasm.mod.KeyValueProperty
  - typingsJapgolly.swcWasm.mod.AssignmentProperty
  - typingsJapgolly.swcWasm.mod.GetterProperty
  - typingsJapgolly.swcWasm.mod.SetterProperty
  - typingsJapgolly.swcWasm.mod.MethodProperty
*/
trait Property extends StObject
object Property {
  
  inline def AssignmentProperty(key: Identifier, value: Expression): typingsJapgolly.swcWasm.mod.AssignmentProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentProperty")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.AssignmentProperty]
  }
  
  inline def GetterProperty(key: PropertyName, span: Span): typingsJapgolly.swcWasm.mod.GetterProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("GetterProperty")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.GetterProperty]
  }
  
  inline def Identifier(optional: Boolean, span: Span, value: String): typingsJapgolly.swcWasm.mod.Identifier = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.Identifier]
  }
  
  inline def KeyValueProperty(key: PropertyName, value: Expression): typingsJapgolly.swcWasm.mod.KeyValueProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("KeyValueProperty")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.KeyValueProperty]
  }
  
  inline def MethodProperty(async: Boolean, generator: Boolean, key: PropertyName, params: js.Array[Param], span: Span): typingsJapgolly.swcWasm.mod.MethodProperty = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MethodProperty")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.MethodProperty]
  }
  
  inline def SetterProperty(key: PropertyName, param: Pattern, span: Span): typingsJapgolly.swcWasm.mod.SetterProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SetterProperty")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.SetterProperty]
  }
}
