package typingsJapgolly.isMyJsonValid.mod

import typingsJapgolly.isMyJsonValid.isMyJsonValidStrings.`object`
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllOptionalObjectSchema[Properties /* <: Record[String, AnySchema] */] extends StObject {
  
  var additionalProperties: js.UndefOr[Boolean] = js.undefined
  
  var properties: Properties
  
  var `type`: `object`
}
object AllOptionalObjectSchema {
  
  inline def apply[Properties /* <: Record[String, AnySchema] */](properties: Properties): AllOptionalObjectSchema[Properties] = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("object")
    __obj.asInstanceOf[AllOptionalObjectSchema[Properties]]
  }
  
  extension [Self <: AllOptionalObjectSchema[?], Properties /* <: Record[String, AnySchema] */](x: Self & AllOptionalObjectSchema[Properties]) {
    
    inline def setAdditionalProperties(value: Boolean): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
    
    inline def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
    
    inline def setProperties(value: Properties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setType(value: `object`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
