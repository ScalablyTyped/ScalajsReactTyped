package typingsJapgolly.firebaseAdmin.admin.auth

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing a user's info from a third-party identity provider
  * such as Google or Facebook.
  */
trait UserInfo extends js.Object {
  /**
    * The display name for the linked provider.
    */
  var displayName: String
  /**
    * The email for the linked provider.
    */
  var email: String
  /**
    * The phone number for the linked provider.
    */
  var phoneNumber: String
  /**
    * The photo URL for the linked provider.
    */
  var photoURL: String
  /**
    * The linked provider ID (for example, "google.com" for the Google provider).
    */
  var providerId: String
  /**
    * The user identifier for the linked provider.
    */
  var uid: String
  /**
    * @return A JSON-serializable representation of this object.
    */
  def toJSON(): js.Object
}

object UserInfo {
  @scala.inline
  def apply(
    displayName: String,
    email: String,
    phoneNumber: String,
    photoURL: String,
    providerId: String,
    toJSON: CallbackTo[js.Object],
    uid: String
  ): UserInfo = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any], photoURL = photoURL.asInstanceOf[js.Any], providerId = providerId.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[UserInfo]
  }
}

