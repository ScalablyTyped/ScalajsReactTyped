package typingsJapgolly.swaggerSchemaOfficial.mod

import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.int32
import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.int64
import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntegerFormat
  extends StObject
     with SchemaFormatConstraints {
  
  var format: js.UndefOr[int32 | int64] = js.undefined
  
  var `type`: integer
}
object IntegerFormat {
  
  inline def apply(): IntegerFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("integer")
    __obj.asInstanceOf[IntegerFormat]
  }
  
  extension [Self <: IntegerFormat](x: Self) {
    
    inline def setFormat(value: int32 | int64): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setType(value: integer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
