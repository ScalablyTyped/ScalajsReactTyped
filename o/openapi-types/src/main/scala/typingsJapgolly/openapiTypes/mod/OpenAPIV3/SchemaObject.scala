package typingsJapgolly.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.openapiTypes.mod.OpenAPIV3.ArraySchemaObject
  - typingsJapgolly.openapiTypes.mod.OpenAPIV3.NonArraySchemaObject
*/
trait SchemaObject extends StObject
object SchemaObject {
  
  inline def ArraySchemaObject(items: ReferenceObject | SchemaObject, `type`: ArraySchemaObjectType): typingsJapgolly.openapiTypes.mod.OpenAPIV3.ArraySchemaObject = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.openapiTypes.mod.OpenAPIV3.ArraySchemaObject]
  }
  
  inline def NonArraySchemaObject(): typingsJapgolly.openapiTypes.mod.OpenAPIV3.NonArraySchemaObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsJapgolly.openapiTypes.mod.OpenAPIV3.NonArraySchemaObject]
  }
}
