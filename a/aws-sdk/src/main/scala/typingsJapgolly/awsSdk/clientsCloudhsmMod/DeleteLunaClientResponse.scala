package typingsJapgolly.awsSdk.clientsCloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLunaClientResponse extends StObject {
  
  /**
    * The status of the action.
    */
  var Status: String
}
object DeleteLunaClientResponse {
  
  inline def apply(Status: String): DeleteLunaClientResponse = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLunaClientResponse]
  }
  
  extension [Self <: DeleteLunaClientResponse](x: Self) {
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
