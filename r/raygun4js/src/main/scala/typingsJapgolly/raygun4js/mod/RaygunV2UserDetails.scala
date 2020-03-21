package typingsJapgolly.raygun4js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaygunV2UserDetails extends js.Object {
  /**
    * The user's email address.
    */
  var email: js.UndefOr[String] = js.undefined
  /**
    * The user's first or preferred name.
    */
  var firstName: js.UndefOr[String] = js.undefined
  /**
    * The user's full name.
    */
  var fullName: js.UndefOr[String] = js.undefined
  /**
    * Uniquely identifies the user within Raygun.
    */
  var identifier: String
  /**
    * Indicates whether the user is anonymous or has a user account. Even if this is set to true, you should still give the user a unique identifier of some kind.
    */
  var isAnonymous: js.UndefOr[Boolean] = js.undefined
  /**
    * Identifier of the device the app is running on. This could be used to correlate user accounts over multiple machines.
    */
  var uuid: js.UndefOr[String] = js.undefined
}

object RaygunV2UserDetails {
  @scala.inline
  def apply(
    identifier: String,
    email: String = null,
    firstName: String = null,
    fullName: String = null,
    isAnonymous: js.UndefOr[Boolean] = js.undefined,
    uuid: String = null
  ): RaygunV2UserDetails = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (firstName != null) __obj.updateDynamic("firstName")(firstName.asInstanceOf[js.Any])
    if (fullName != null) __obj.updateDynamic("fullName")(fullName.asInstanceOf[js.Any])
    if (!js.isUndefined(isAnonymous)) __obj.updateDynamic("isAnonymous")(isAnonymous.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaygunV2UserDetails]
  }
}

