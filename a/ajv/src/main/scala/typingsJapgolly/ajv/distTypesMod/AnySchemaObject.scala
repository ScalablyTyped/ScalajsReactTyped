package typingsJapgolly.ajv.distTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ajv.distTypesMod.SchemaObject
  - typingsJapgolly.ajv.distTypesMod.AsyncSchema
*/
trait AnySchemaObject extends StObject
object AnySchemaObject {
  
  inline def AsyncSchema(): typingsJapgolly.ajv.distTypesMod.AsyncSchema = {
    val __obj = js.Dynamic.literal($async = true)
    __obj.asInstanceOf[typingsJapgolly.ajv.distTypesMod.AsyncSchema]
  }
  
  inline def SchemaObject(): typingsJapgolly.ajv.distTypesMod.SchemaObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsJapgolly.ajv.distTypesMod.SchemaObject]
  }
}
