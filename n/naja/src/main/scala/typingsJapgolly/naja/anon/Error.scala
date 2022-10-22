package typingsJapgolly.naja.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  var error: js.Error
  
  var options: typingsJapgolly.naja.distNajaMod.Options
  
  var request: org.scalajs.dom.Request
}
object Error {
  
  inline def apply(
    error: js.Error,
    options: typingsJapgolly.naja.distNajaMod.Options,
    request: org.scalajs.dom.Request
  ): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: typingsJapgolly.naja.distNajaMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: org.scalajs.dom.Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
