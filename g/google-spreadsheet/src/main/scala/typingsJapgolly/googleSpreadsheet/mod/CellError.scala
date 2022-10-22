package typingsJapgolly.googleSpreadsheet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellError extends StObject {
  
  var message: String
  
  var `type`: CellErrorType
}
object CellError {
  
  inline def apply(message: String, `type`: CellErrorType): CellError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellError]
  }
  
  extension [Self <: CellError](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setType(value: CellErrorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
