package typingsJapgolly.swaggerSchemaOfficial.mod

import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings._empty
import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.`date-time`
import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.binary
import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.byte
import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.date
import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.password
import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringFormat
  extends StObject
     with SchemaFormatConstraints {
  
  var format: js.UndefOr[_empty | byte | binary | date | `date-time` | password] = js.undefined
  
  var `type`: string
}
object StringFormat {
  
  inline def apply(): StringFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[StringFormat]
  }
  
  extension [Self <: StringFormat](x: Self) {
    
    inline def setFormat(value: _empty | byte | binary | date | `date-time` | password): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
