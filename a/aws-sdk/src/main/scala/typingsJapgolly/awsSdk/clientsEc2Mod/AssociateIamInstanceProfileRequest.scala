package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateIamInstanceProfileRequest extends StObject {
  
  /**
    * The IAM instance profile.
    */
  var IamInstanceProfile: IamInstanceProfileSpecification
  
  /**
    * The ID of the instance.
    */
  var InstanceId: typingsJapgolly.awsSdk.clientsEc2Mod.InstanceId
}
object AssociateIamInstanceProfileRequest {
  
  inline def apply(IamInstanceProfile: IamInstanceProfileSpecification, InstanceId: InstanceId): AssociateIamInstanceProfileRequest = {
    val __obj = js.Dynamic.literal(IamInstanceProfile = IamInstanceProfile.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateIamInstanceProfileRequest]
  }
  
  extension [Self <: AssociateIamInstanceProfileRequest](x: Self) {
    
    inline def setIamInstanceProfile(value: IamInstanceProfileSpecification): Self = StObject.set(x, "IamInstanceProfile", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
