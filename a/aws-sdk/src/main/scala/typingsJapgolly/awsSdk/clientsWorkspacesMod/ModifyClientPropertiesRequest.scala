package typingsJapgolly.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyClientPropertiesRequest extends StObject {
  
  /**
    * Information about the Amazon WorkSpaces client.
    */
  var ClientProperties: typingsJapgolly.awsSdk.clientsWorkspacesMod.ClientProperties
  
  /**
    * The resource identifiers, in the form of directory IDs.
    */
  var ResourceId: NonEmptyString
}
object ModifyClientPropertiesRequest {
  
  inline def apply(ClientProperties: ClientProperties, ResourceId: NonEmptyString): ModifyClientPropertiesRequest = {
    val __obj = js.Dynamic.literal(ClientProperties = ClientProperties.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClientPropertiesRequest]
  }
  
  extension [Self <: ModifyClientPropertiesRequest](x: Self) {
    
    inline def setClientProperties(value: ClientProperties): Self = StObject.set(x, "ClientProperties", value.asInstanceOf[js.Any])
    
    inline def setResourceId(value: NonEmptyString): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
