package typingsJapgolly.gapiClientDrive.gapi.client.drive

import typingsJapgolly.gapiClientDrive.AnonInherited
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Permission extends js.Object {
  /** Whether the permission allows the file to be discovered through search. This is only applicable for permissions of type domain or anyone. */
  var allowFileDiscovery: js.UndefOr[Boolean] = js.undefined
  /** Whether the account associated with this permission has been deleted. This field only pertains to user and group permissions. */
  var deleted: js.UndefOr[Boolean] = js.undefined
  /** A displayable name for users, groups or domains. */
  var displayName: js.UndefOr[String] = js.undefined
  /** The domain to which this permission refers. */
  var domain: js.UndefOr[String] = js.undefined
  /** The email address of the user or group to which this permission refers. */
  var emailAddress: js.UndefOr[String] = js.undefined
  /**
    * The time at which this permission will expire (RFC 3339 date-time). Expiration times have the following restrictions:
    * - They can only be set on user and group permissions
    * - The time must be in the future
    * - The time cannot be more than a year in the future
    */
  var expirationTime: js.UndefOr[String] = js.undefined
  /** The ID of this permission. This is a unique identifier for the grantee, and is published in User resources as permissionId. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "drive#permission". */
  var kind: js.UndefOr[String] = js.undefined
  /** A link to the user's profile photo, if available. */
  var photoLink: js.UndefOr[String] = js.undefined
  /**
    * The role granted by this permission. While new values may be supported in the future, the following are currently allowed:
    * - organizer
    * - owner
    * - writer
    * - commenter
    * - reader
    */
  var role: js.UndefOr[String] = js.undefined
  /**
    * Details of whether the permissions on this Team Drive item are inherited or directly on this item. This is an output-only field which is present only
    * for Team Drive items.
    */
  var teamDrivePermissionDetails: js.UndefOr[js.Array[AnonInherited]] = js.undefined
  /**
    * The type of the grantee. Valid values are:
    * - user
    * - group
    * - domain
    * - anyone
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object Permission {
  @scala.inline
  def apply(
    allowFileDiscovery: js.UndefOr[Boolean] = js.undefined,
    deleted: js.UndefOr[Boolean] = js.undefined,
    displayName: String = null,
    domain: String = null,
    emailAddress: String = null,
    expirationTime: String = null,
    id: String = null,
    kind: String = null,
    photoLink: String = null,
    role: String = null,
    teamDrivePermissionDetails: js.Array[AnonInherited] = null,
    `type`: String = null
  ): Permission = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowFileDiscovery)) __obj.updateDynamic("allowFileDiscovery")(allowFileDiscovery.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    if (expirationTime != null) __obj.updateDynamic("expirationTime")(expirationTime.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (photoLink != null) __obj.updateDynamic("photoLink")(photoLink.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (teamDrivePermissionDetails != null) __obj.updateDynamic("teamDrivePermissionDetails")(teamDrivePermissionDetails.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Permission]
  }
}

