package typingsJapgolly.grpc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusObject extends StObject {
  
  /**
    * The error code, a key of `grpc.status`
    */
  var code: status
  
  /**
    * Human-readable description of the status
    */
  var details: String
  
  /**
    * Trailing metadata sent with the status, if applicable
    */
  var metadata: Metadata
}
object StatusObject {
  
  inline def apply(code: status, details: String, metadata: Metadata): StatusObject = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusObject]
  }
  
  extension [Self <: StatusObject](x: Self) {
    
    inline def setCode(value: status): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
  }
}
