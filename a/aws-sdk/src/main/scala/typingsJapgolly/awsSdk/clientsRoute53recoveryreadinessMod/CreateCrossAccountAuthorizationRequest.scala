package typingsJapgolly.awsSdk.clientsRoute53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCrossAccountAuthorizationRequest extends StObject {
  
  /**
    * The cross-account authorization.
    */
  var CrossAccountAuthorization: typingsJapgolly.awsSdk.clientsRoute53recoveryreadinessMod.CrossAccountAuthorization
}
object CreateCrossAccountAuthorizationRequest {
  
  inline def apply(CrossAccountAuthorization: CrossAccountAuthorization): CreateCrossAccountAuthorizationRequest = {
    val __obj = js.Dynamic.literal(CrossAccountAuthorization = CrossAccountAuthorization.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCrossAccountAuthorizationRequest]
  }
  
  extension [Self <: CreateCrossAccountAuthorizationRequest](x: Self) {
    
    inline def setCrossAccountAuthorization(value: CrossAccountAuthorization): Self = StObject.set(x, "CrossAccountAuthorization", value.asInstanceOf[js.Any])
  }
}
