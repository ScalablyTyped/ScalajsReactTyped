package typingsJapgolly.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRecoveryPointRequest extends StObject {
  
  /**
    * The unique identifier of the recovery point to return information for.
    */
  var recoveryPointId: String
}
object GetRecoveryPointRequest {
  
  inline def apply(recoveryPointId: String): GetRecoveryPointRequest = {
    val __obj = js.Dynamic.literal(recoveryPointId = recoveryPointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecoveryPointRequest]
  }
  
  extension [Self <: GetRecoveryPointRequest](x: Self) {
    
    inline def setRecoveryPointId(value: String): Self = StObject.set(x, "recoveryPointId", value.asInstanceOf[js.Any])
  }
}
