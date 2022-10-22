package typingsJapgolly.awsSdk.clientsSmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAppReplicationConfigurationRequest extends StObject {
  
  /**
    * The ID of the application.
    */
  var appId: js.UndefOr[AppId] = js.undefined
  
  /**
    * Information about the replication configurations for server groups in the application.
    */
  var serverGroupReplicationConfigurations: js.UndefOr[ServerGroupReplicationConfigurations] = js.undefined
}
object PutAppReplicationConfigurationRequest {
  
  inline def apply(): PutAppReplicationConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutAppReplicationConfigurationRequest]
  }
  
  extension [Self <: PutAppReplicationConfigurationRequest](x: Self) {
    
    inline def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setServerGroupReplicationConfigurations(value: ServerGroupReplicationConfigurations): Self = StObject.set(x, "serverGroupReplicationConfigurations", value.asInstanceOf[js.Any])
    
    inline def setServerGroupReplicationConfigurationsUndefined: Self = StObject.set(x, "serverGroupReplicationConfigurations", js.undefined)
    
    inline def setServerGroupReplicationConfigurationsVarargs(value: ServerGroupReplicationConfiguration*): Self = StObject.set(x, "serverGroupReplicationConfigurations", js.Array(value*))
  }
}
