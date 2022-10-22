package typingsJapgolly.awsSdk.clientsCodestarconnectionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Connection extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the connection. The ARN is used as the connection reference when the connection is shared between AWS services.  The ARN is never reused if the connection is deleted. 
    */
  var ConnectionArn: js.UndefOr[typingsJapgolly.awsSdk.clientsCodestarconnectionsMod.ConnectionArn] = js.undefined
  
  /**
    * The name of the connection. Connection names must be unique in an AWS user account.
    */
  var ConnectionName: js.UndefOr[typingsJapgolly.awsSdk.clientsCodestarconnectionsMod.ConnectionName] = js.undefined
  
  /**
    * The current status of the connection. 
    */
  var ConnectionStatus: js.UndefOr[typingsJapgolly.awsSdk.clientsCodestarconnectionsMod.ConnectionStatus] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the host associated with the connection.
    */
  var HostArn: js.UndefOr[typingsJapgolly.awsSdk.clientsCodestarconnectionsMod.HostArn] = js.undefined
  
  /**
    * The identifier of the external provider where your third-party code repository is configured. For Bitbucket, this is the account ID of the owner of the Bitbucket repository.
    */
  var OwnerAccountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The name of the external provider where your third-party code repository is configured.
    */
  var ProviderType: js.UndefOr[typingsJapgolly.awsSdk.clientsCodestarconnectionsMod.ProviderType] = js.undefined
}
object Connection {
  
  inline def apply(): Connection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Connection]
  }
  
  extension [Self <: Connection](x: Self) {
    
    inline def setConnectionArn(value: ConnectionArn): Self = StObject.set(x, "ConnectionArn", value.asInstanceOf[js.Any])
    
    inline def setConnectionArnUndefined: Self = StObject.set(x, "ConnectionArn", js.undefined)
    
    inline def setConnectionName(value: ConnectionName): Self = StObject.set(x, "ConnectionName", value.asInstanceOf[js.Any])
    
    inline def setConnectionNameUndefined: Self = StObject.set(x, "ConnectionName", js.undefined)
    
    inline def setConnectionStatus(value: ConnectionStatus): Self = StObject.set(x, "ConnectionStatus", value.asInstanceOf[js.Any])
    
    inline def setConnectionStatusUndefined: Self = StObject.set(x, "ConnectionStatus", js.undefined)
    
    inline def setHostArn(value: HostArn): Self = StObject.set(x, "HostArn", value.asInstanceOf[js.Any])
    
    inline def setHostArnUndefined: Self = StObject.set(x, "HostArn", js.undefined)
    
    inline def setOwnerAccountId(value: AccountId): Self = StObject.set(x, "OwnerAccountId", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccountIdUndefined: Self = StObject.set(x, "OwnerAccountId", js.undefined)
    
    inline def setProviderType(value: ProviderType): Self = StObject.set(x, "ProviderType", value.asInstanceOf[js.Any])
    
    inline def setProviderTypeUndefined: Self = StObject.set(x, "ProviderType", js.undefined)
  }
}
