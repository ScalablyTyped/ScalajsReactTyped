package typingsJapgolly.awsSdk.clientsSsoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPermissionsBoundaryForPermissionSetRequest extends StObject {
  
  /**
    * The ARN of the IAM Identity Center instance under which the operation will be executed. 
    */
  var InstanceArn: typingsJapgolly.awsSdk.clientsSsoadminMod.InstanceArn
  
  /**
    * The ARN of the PermissionSet.
    */
  var PermissionSetArn: typingsJapgolly.awsSdk.clientsSsoadminMod.PermissionSetArn
}
object GetPermissionsBoundaryForPermissionSetRequest {
  
  inline def apply(InstanceArn: InstanceArn, PermissionSetArn: PermissionSetArn): GetPermissionsBoundaryForPermissionSetRequest = {
    val __obj = js.Dynamic.literal(InstanceArn = InstanceArn.asInstanceOf[js.Any], PermissionSetArn = PermissionSetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPermissionsBoundaryForPermissionSetRequest]
  }
  
  extension [Self <: GetPermissionsBoundaryForPermissionSetRequest](x: Self) {
    
    inline def setInstanceArn(value: InstanceArn): Self = StObject.set(x, "InstanceArn", value.asInstanceOf[js.Any])
    
    inline def setPermissionSetArn(value: PermissionSetArn): Self = StObject.set(x, "PermissionSetArn", value.asInstanceOf[js.Any])
  }
}
