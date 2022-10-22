package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInstanceRequest extends StObject {
  
  /**
    * The idempotency token.
    */
  var ClientToken: js.UndefOr[typingsJapgolly.awsSdk.clientsConnectMod.ClientToken] = js.undefined
  
  /**
    * The identifier for the directory.
    */
  var DirectoryId: js.UndefOr[typingsJapgolly.awsSdk.clientsConnectMod.DirectoryId] = js.undefined
  
  /**
    * The type of identity management for your Amazon Connect users.
    */
  var IdentityManagementType: DirectoryType
  
  /**
    * Your contact center handles incoming contacts.
    */
  var InboundCallsEnabled: typingsJapgolly.awsSdk.clientsConnectMod.InboundCallsEnabled
  
  /**
    * The name for your instance.
    */
  var InstanceAlias: js.UndefOr[DirectoryAlias] = js.undefined
  
  /**
    * Your contact center allows outbound calls.
    */
  var OutboundCallsEnabled: typingsJapgolly.awsSdk.clientsConnectMod.OutboundCallsEnabled
}
object CreateInstanceRequest {
  
  inline def apply(
    IdentityManagementType: DirectoryType,
    InboundCallsEnabled: InboundCallsEnabled,
    OutboundCallsEnabled: OutboundCallsEnabled
  ): CreateInstanceRequest = {
    val __obj = js.Dynamic.literal(IdentityManagementType = IdentityManagementType.asInstanceOf[js.Any], InboundCallsEnabled = InboundCallsEnabled.asInstanceOf[js.Any], OutboundCallsEnabled = OutboundCallsEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInstanceRequest]
  }
  
  extension [Self <: CreateInstanceRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
    
    inline def setIdentityManagementType(value: DirectoryType): Self = StObject.set(x, "IdentityManagementType", value.asInstanceOf[js.Any])
    
    inline def setInboundCallsEnabled(value: InboundCallsEnabled): Self = StObject.set(x, "InboundCallsEnabled", value.asInstanceOf[js.Any])
    
    inline def setInstanceAlias(value: DirectoryAlias): Self = StObject.set(x, "InstanceAlias", value.asInstanceOf[js.Any])
    
    inline def setInstanceAliasUndefined: Self = StObject.set(x, "InstanceAlias", js.undefined)
    
    inline def setOutboundCallsEnabled(value: OutboundCallsEnabled): Self = StObject.set(x, "OutboundCallsEnabled", value.asInstanceOf[js.Any])
  }
}
