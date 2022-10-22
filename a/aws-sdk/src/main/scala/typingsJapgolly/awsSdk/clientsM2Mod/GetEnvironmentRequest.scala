package typingsJapgolly.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEnvironmentRequest extends StObject {
  
  /**
    * The unique identifier of the runtime environment.
    */
  var environmentId: Identifier
}
object GetEnvironmentRequest {
  
  inline def apply(environmentId: Identifier): GetEnvironmentRequest = {
    val __obj = js.Dynamic.literal(environmentId = environmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEnvironmentRequest]
  }
  
  extension [Self <: GetEnvironmentRequest](x: Self) {
    
    inline def setEnvironmentId(value: Identifier): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
  }
}
