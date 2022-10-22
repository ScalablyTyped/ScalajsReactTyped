package typingsJapgolly.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedImagePermissions extends StObject {
  
  /**
    * Describes the permissions for a shared image.
    */
  var imagePermissions: ImagePermissions
  
  /**
    * The 12-digit identifier of the AWS account with which the image is shared.
    */
  var sharedAccountId: AwsAccountId
}
object SharedImagePermissions {
  
  inline def apply(imagePermissions: ImagePermissions, sharedAccountId: AwsAccountId): SharedImagePermissions = {
    val __obj = js.Dynamic.literal(imagePermissions = imagePermissions.asInstanceOf[js.Any], sharedAccountId = sharedAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedImagePermissions]
  }
  
  extension [Self <: SharedImagePermissions](x: Self) {
    
    inline def setImagePermissions(value: ImagePermissions): Self = StObject.set(x, "imagePermissions", value.asInstanceOf[js.Any])
    
    inline def setSharedAccountId(value: AwsAccountId): Self = StObject.set(x, "sharedAccountId", value.asInstanceOf[js.Any])
  }
}
