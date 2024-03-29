package typingsJapgolly.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServiceSpecificCredentialRequest extends StObject {
  
  /**
    * The name of the Amazon Web Services service that is to be associated with the credentials. The service you specify here is the only service that can be accessed using these credentials.
    */
  var ServiceName: serviceName
  
  /**
    * The name of the IAM user that is to be associated with the credentials. The new service-specific credentials have the same permissions as the associated user except that they can be used only to access the specified service. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: userNameType
}
object CreateServiceSpecificCredentialRequest {
  
  inline def apply(ServiceName: serviceName, UserName: userNameType): CreateServiceSpecificCredentialRequest = {
    val __obj = js.Dynamic.literal(ServiceName = ServiceName.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateServiceSpecificCredentialRequest]
  }
  
  extension [Self <: CreateServiceSpecificCredentialRequest](x: Self) {
    
    inline def setServiceName(value: serviceName): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: userNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
