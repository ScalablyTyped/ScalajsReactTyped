package typingsJapgolly.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateImagePermissionsRequest extends js.Object {
  /**
    * The permissions for the image.
    */
  var ImagePermissions: typingsJapgolly.awsSdk.appstreamMod.ImagePermissions = js.native
  /**
    * The name of the private image.
    */
  var Name: typingsJapgolly.awsSdk.appstreamMod.Name = js.native
  /**
    * The 12-digit identifier of the AWS account for which you want add or update image permissions.
    */
  var SharedAccountId: AwsAccountId = js.native
}

object UpdateImagePermissionsRequest {
  @scala.inline
  def apply(ImagePermissions: ImagePermissions, Name: Name, SharedAccountId: AwsAccountId): UpdateImagePermissionsRequest = {
    val __obj = js.Dynamic.literal(ImagePermissions = ImagePermissions.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SharedAccountId = SharedAccountId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateImagePermissionsRequest]
  }
}

