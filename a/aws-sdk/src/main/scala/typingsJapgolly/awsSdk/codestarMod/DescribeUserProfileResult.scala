package typingsJapgolly.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserProfileResult extends js.Object {
  /**
    * The date and time when the user profile was created in AWS CodeStar, in timestamp format.
    */
  var createdTimestamp: js.Date = js.native
  /**
    * The display name shown for the user in AWS CodeStar projects. For example, this could be set to both first and last name ("Mary Major") or a single name ("Mary"). The display name is also used to generate the initial icon associated with the user in AWS CodeStar projects. If spaces are included in the display name, the first character that appears after the space will be used as the second character in the user initial icon. The initial icon displays a maximum of two characters, so a display name with more than one space (for example "Mary Jane Major") would generate an initial icon using the first character and the first character after the space ("MJ", not "MM").
    */
  var displayName: js.UndefOr[UserProfileDisplayName] = js.native
  /**
    * The email address for the user. Optional.
    */
  var emailAddress: js.UndefOr[Email] = js.native
  /**
    * The date and time when the user profile was last modified, in timestamp format.
    */
  var lastModifiedTimestamp: js.Date = js.native
  /**
    * The SSH public key associated with the user. This SSH public key is associated with the user profile, and can be used in conjunction with the associated private key for access to project resources, such as Amazon EC2 instances, if a project owner grants remote access to those resources.
    */
  var sshPublicKey: js.UndefOr[SshPublicKey] = js.native
  /**
    * The Amazon Resource Name (ARN) of the user.
    */
  var userArn: UserArn = js.native
}

object DescribeUserProfileResult {
  @scala.inline
  def apply(
    createdTimestamp: js.Date,
    lastModifiedTimestamp: js.Date,
    userArn: UserArn,
    displayName: UserProfileDisplayName = null,
    emailAddress: Email = null,
    sshPublicKey: SshPublicKey = null
  ): DescribeUserProfileResult = {
    val __obj = js.Dynamic.literal(createdTimestamp = createdTimestamp.asInstanceOf[js.Any], lastModifiedTimestamp = lastModifiedTimestamp.asInstanceOf[js.Any], userArn = userArn.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    if (sshPublicKey != null) __obj.updateDynamic("sshPublicKey")(sshPublicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserProfileResult]
  }
}

