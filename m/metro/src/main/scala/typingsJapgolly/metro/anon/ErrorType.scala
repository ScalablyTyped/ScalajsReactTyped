package typingsJapgolly.metro.anon

import typingsJapgolly.metro.libReportingMod.ReportableEvent
import typingsJapgolly.metro.metroStrings.bundling_error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorType
  extends StObject
     with ReportableEvent {
  
  var error: js.Error
  
  var `type`: bundling_error
}
object ErrorType {
  
  inline def apply(error: js.Error): ErrorType = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bundling_error")
    __obj.asInstanceOf[ErrorType]
  }
  
  extension [Self <: ErrorType](x: Self) {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setType(value: bundling_error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
