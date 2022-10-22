package typingsJapgolly.googleSpreadsheet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberFormat extends StObject {
  
  /**
    * see https://developers.google.com/sheets/api/guides/formats
    */
  var pattern: String
  
  var `type`: NumberFormatType
}
object NumberFormat {
  
  inline def apply(pattern: String, `type`: NumberFormatType): NumberFormat = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFormat]
  }
  
  extension [Self <: NumberFormat](x: Self) {
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setType(value: NumberFormatType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
