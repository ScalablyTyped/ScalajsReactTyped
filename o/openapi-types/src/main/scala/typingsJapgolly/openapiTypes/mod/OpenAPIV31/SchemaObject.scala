package typingsJapgolly.openapiTypes.mod.OpenAPIV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.openapiTypes.mod.OpenAPIV31.ArraySchemaObject
  - typingsJapgolly.openapiTypes.mod.OpenAPIV31.NonArraySchemaObject
  - typingsJapgolly.openapiTypes.mod.OpenAPIV31.MixedSchemaObject
*/
trait SchemaObject extends StObject
object SchemaObject {
  
  inline def ArraySchemaObject(items: ReferenceObject | SchemaObject, `type`: ArraySchemaObjectType): typingsJapgolly.openapiTypes.mod.OpenAPIV31.ArraySchemaObject = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.openapiTypes.mod.OpenAPIV31.ArraySchemaObject]
  }
  
  inline def MixedSchemaObject(): typingsJapgolly.openapiTypes.mod.OpenAPIV31.MixedSchemaObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsJapgolly.openapiTypes.mod.OpenAPIV31.MixedSchemaObject]
  }
  
  inline def NonArraySchemaObject(): typingsJapgolly.openapiTypes.mod.OpenAPIV31.NonArraySchemaObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsJapgolly.openapiTypes.mod.OpenAPIV31.NonArraySchemaObject]
  }
}
