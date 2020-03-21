package typingsJapgolly.pulumiAws.userMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserState extends js.Object {
  /**
    * The ARN assigned by AWS for this user.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * When destroying this user, destroy even if it
    * has non-this provider-managed IAM access keys, login profile or MFA devices. Without `forceDestroy`
    * a user with non-this provider-managed access keys and login profile will fail to be destroyed.
    */
  val forceDestroy: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The user's name. The name must consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: `=,.@-_.`. User names are not distinguished by case. For example, you cannot create users named both "TESTUSER" and "testuser".
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Path in which to create the user.
    */
  val path: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the policy that is used to set the permissions boundary for the user.
    */
  val permissionsBoundary: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of tags for the IAM user
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The [unique ID][1] assigned by AWS.
    */
  val uniqueId: js.UndefOr[Input[String]] = js.native
}

object UserState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    forceDestroy: Input[Boolean] = null,
    name: Input[String] = null,
    path: Input[String] = null,
    permissionsBoundary: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    uniqueId: Input[String] = null
  ): UserState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (forceDestroy != null) __obj.updateDynamic("forceDestroy")(forceDestroy.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (permissionsBoundary != null) __obj.updateDynamic("permissionsBoundary")(permissionsBoundary.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (uniqueId != null) __obj.updateDynamic("uniqueId")(uniqueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserState]
  }
}

