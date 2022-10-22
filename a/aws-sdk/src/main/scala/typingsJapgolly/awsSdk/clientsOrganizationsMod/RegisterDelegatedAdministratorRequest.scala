package typingsJapgolly.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterDelegatedAdministratorRequest extends StObject {
  
  /**
    * The account ID number of the member account in the organization to register as a delegated administrator.
    */
  var AccountId: typingsJapgolly.awsSdk.clientsOrganizationsMod.AccountId
  
  /**
    * The service principal of the Amazon Web Services service for which you want to make the member account a delegated administrator.
    */
  var ServicePrincipal: typingsJapgolly.awsSdk.clientsOrganizationsMod.ServicePrincipal
}
object RegisterDelegatedAdministratorRequest {
  
  inline def apply(AccountId: AccountId, ServicePrincipal: ServicePrincipal): RegisterDelegatedAdministratorRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], ServicePrincipal = ServicePrincipal.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterDelegatedAdministratorRequest]
  }
  
  extension [Self <: RegisterDelegatedAdministratorRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setServicePrincipal(value: ServicePrincipal): Self = StObject.set(x, "ServicePrincipal", value.asInstanceOf[js.Any])
  }
}
