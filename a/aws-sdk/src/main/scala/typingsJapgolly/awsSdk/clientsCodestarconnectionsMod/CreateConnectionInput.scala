package typingsJapgolly.awsSdk.clientsCodestarconnectionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConnectionInput extends StObject {
  
  /**
    * The name of the connection to be created. The name must be unique in the calling AWS account.
    */
  var ConnectionName: typingsJapgolly.awsSdk.clientsCodestarconnectionsMod.ConnectionName
  
  /**
    * The Amazon Resource Name (ARN) of the host associated with the connection to be created.
    */
  var HostArn: js.UndefOr[typingsJapgolly.awsSdk.clientsCodestarconnectionsMod.HostArn] = js.undefined
  
  /**
    * The name of the external provider where your third-party code repository is configured.
    */
  var ProviderType: js.UndefOr[typingsJapgolly.awsSdk.clientsCodestarconnectionsMod.ProviderType] = js.undefined
  
  /**
    * The key-value pair to use when tagging the resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateConnectionInput {
  
  inline def apply(ConnectionName: ConnectionName): CreateConnectionInput = {
    val __obj = js.Dynamic.literal(ConnectionName = ConnectionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConnectionInput]
  }
  
  extension [Self <: CreateConnectionInput](x: Self) {
    
    inline def setConnectionName(value: ConnectionName): Self = StObject.set(x, "ConnectionName", value.asInstanceOf[js.Any])
    
    inline def setHostArn(value: HostArn): Self = StObject.set(x, "HostArn", value.asInstanceOf[js.Any])
    
    inline def setHostArnUndefined: Self = StObject.set(x, "HostArn", js.undefined)
    
    inline def setProviderType(value: ProviderType): Self = StObject.set(x, "ProviderType", value.asInstanceOf[js.Any])
    
    inline def setProviderTypeUndefined: Self = StObject.set(x, "ProviderType", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
