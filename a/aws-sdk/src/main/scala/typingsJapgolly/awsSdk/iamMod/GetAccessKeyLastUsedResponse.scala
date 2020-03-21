package typingsJapgolly.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccessKeyLastUsedResponse extends js.Object {
  /**
    * Contains information about the last time the access key was used.
    */
  var AccessKeyLastUsed: js.UndefOr[typingsJapgolly.awsSdk.iamMod.AccessKeyLastUsed] = js.native
  /**
    * The name of the AWS IAM user that owns this access key. 
    */
  var UserName: js.UndefOr[existingUserNameType] = js.native
}

object GetAccessKeyLastUsedResponse {
  @scala.inline
  def apply(AccessKeyLastUsed: AccessKeyLastUsed = null, UserName: existingUserNameType = null): GetAccessKeyLastUsedResponse = {
    val __obj = js.Dynamic.literal()
    if (AccessKeyLastUsed != null) __obj.updateDynamic("AccessKeyLastUsed")(AccessKeyLastUsed.asInstanceOf[js.Any])
    if (UserName != null) __obj.updateDynamic("UserName")(UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccessKeyLastUsedResponse]
  }
}

