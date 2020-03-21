package typingsJapgolly.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUserRequest extends js.Object {
  /**
    * A unique, user-specified identifier for this request that ensures idempotency. 
    */
  var ClientRequestToken: js.UndefOr[typingsJapgolly.awsSdk.alexaforbusinessMod.ClientRequestToken] = js.native
  /**
    * The email address for the user.
    */
  var Email: js.UndefOr[typingsJapgolly.awsSdk.alexaforbusinessMod.Email] = js.native
  /**
    * The first name for the user.
    */
  var FirstName: js.UndefOr[userFirstName] = js.native
  /**
    * The last name for the user.
    */
  var LastName: js.UndefOr[userLastName] = js.native
  /**
    * The tags for the user.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The ARN for the user.
    */
  var UserId: userUserId = js.native
}

object CreateUserRequest {
  @scala.inline
  def apply(
    UserId: userUserId,
    ClientRequestToken: ClientRequestToken = null,
    Email: Email = null,
    FirstName: userFirstName = null,
    LastName: userLastName = null,
    Tags: TagList = null
  ): CreateUserRequest = {
    val __obj = js.Dynamic.literal(UserId = UserId.asInstanceOf[js.Any])
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken.asInstanceOf[js.Any])
    if (Email != null) __obj.updateDynamic("Email")(Email.asInstanceOf[js.Any])
    if (FirstName != null) __obj.updateDynamic("FirstName")(FirstName.asInstanceOf[js.Any])
    if (LastName != null) __obj.updateDynamic("LastName")(LastName.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserRequest]
  }
}

