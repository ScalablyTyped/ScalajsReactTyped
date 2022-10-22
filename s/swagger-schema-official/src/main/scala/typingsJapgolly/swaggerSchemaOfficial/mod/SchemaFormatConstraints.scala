package typingsJapgolly.swaggerSchemaOfficial.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swaggerSchemaOfficial.mod.GenericFormat
  - typingsJapgolly.swaggerSchemaOfficial.mod.IntegerFormat
  - typingsJapgolly.swaggerSchemaOfficial.mod.NumberFormat
  - typingsJapgolly.swaggerSchemaOfficial.mod.StringFormat
*/
trait SchemaFormatConstraints extends StObject
object SchemaFormatConstraints {
  
  inline def GenericFormat(): typingsJapgolly.swaggerSchemaOfficial.mod.GenericFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsJapgolly.swaggerSchemaOfficial.mod.GenericFormat]
  }
  
  inline def IntegerFormat(): typingsJapgolly.swaggerSchemaOfficial.mod.IntegerFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("integer")
    __obj.asInstanceOf[typingsJapgolly.swaggerSchemaOfficial.mod.IntegerFormat]
  }
  
  inline def NumberFormat(): typingsJapgolly.swaggerSchemaOfficial.mod.NumberFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("number")
    __obj.asInstanceOf[typingsJapgolly.swaggerSchemaOfficial.mod.NumberFormat]
  }
  
  inline def StringFormat(): typingsJapgolly.swaggerSchemaOfficial.mod.StringFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[typingsJapgolly.swaggerSchemaOfficial.mod.StringFormat]
  }
}
