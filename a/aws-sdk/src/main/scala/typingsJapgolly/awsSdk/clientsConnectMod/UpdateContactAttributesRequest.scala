package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateContactAttributesRequest extends StObject {
  
  /**
    * The Amazon Connect attributes. These attributes can be accessed in flows just like any other contact attributes. You can have up to 32,768 UTF-8 bytes across all attributes for a contact. Attribute keys can include only alphanumeric, dash, and underscore characters.
    */
  var Attributes: typingsJapgolly.awsSdk.clientsConnectMod.Attributes
  
  /**
    * The identifier of the contact. This is the identifier of the contact associated with the first interaction with the contact center.
    */
  var InitialContactId: ContactId
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typingsJapgolly.awsSdk.clientsConnectMod.InstanceId
}
object UpdateContactAttributesRequest {
  
  inline def apply(Attributes: Attributes, InitialContactId: ContactId, InstanceId: InstanceId): UpdateContactAttributesRequest = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], InitialContactId = InitialContactId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContactAttributesRequest]
  }
  
  extension [Self <: UpdateContactAttributesRequest](x: Self) {
    
    inline def setAttributes(value: Attributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setInitialContactId(value: ContactId): Self = StObject.set(x, "InitialContactId", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
