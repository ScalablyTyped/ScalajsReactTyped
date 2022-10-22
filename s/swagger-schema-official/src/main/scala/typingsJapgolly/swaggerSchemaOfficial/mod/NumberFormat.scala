package typingsJapgolly.swaggerSchemaOfficial.mod

import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.double
import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.float
import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberFormat
  extends StObject
     with SchemaFormatConstraints {
  
  var format: js.UndefOr[float | double] = js.undefined
  
  var `type`: number
}
object NumberFormat {
  
  inline def apply(): NumberFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("number")
    __obj.asInstanceOf[NumberFormat]
  }
  
  extension [Self <: NumberFormat](x: Self) {
    
    inline def setFormat(value: float | double): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setType(value: number): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
