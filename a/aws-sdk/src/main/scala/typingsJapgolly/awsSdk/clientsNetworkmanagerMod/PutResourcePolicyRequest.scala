package typingsJapgolly.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResourcePolicyRequest extends StObject {
  
  /**
    * The JSON resource policy document.
    */
  var PolicyDocument: ResourcePolicyDocument
  
  /**
    * The ARN of the resource policy. 
    */
  var ResourceArn: typingsJapgolly.awsSdk.clientsNetworkmanagerMod.ResourceArn
}
object PutResourcePolicyRequest {
  
  inline def apply(PolicyDocument: ResourcePolicyDocument, ResourceArn: ResourceArn): PutResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyDocument = PolicyDocument.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResourcePolicyRequest]
  }
  
  extension [Self <: PutResourcePolicyRequest](x: Self) {
    
    inline def setPolicyDocument(value: ResourcePolicyDocument): Self = StObject.set(x, "PolicyDocument", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
