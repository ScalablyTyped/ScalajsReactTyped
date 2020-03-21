package typingsJapgolly.gapiClientDrive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmailMessage extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** A plain text custom message to include in the notification email. */
  var emailMessage: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** The ID of the file or Team Drive. */
  var fileId: String
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /**
    * Whether to send a notification email when sharing to users or groups. This defaults to true for users and groups, and is not allowed for other
    * requests. It must not be disabled for ownership transfers.
    */
  var sendNotificationEmail: js.UndefOr[Boolean] = js.undefined
  /** Whether the requesting application supports Team Drives. */
  var supportsTeamDrives: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to transfer ownership to the specified user and downgrade the current owner to a writer. This parameter is required as an acknowledgement of
    * the side effect.
    */
  var transferOwnership: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the request should be treated as if it was issued by a domain administrator; if set to true, then the requester will be granted access if they
    * are an administrator of the domain to which the item belongs.
    */
  var useDomainAdminAccess: js.UndefOr[Boolean] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object AnonEmailMessage {
  @scala.inline
  def apply(
    fileId: String,
    alt: String = null,
    emailMessage: String = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    sendNotificationEmail: js.UndefOr[Boolean] = js.undefined,
    supportsTeamDrives: js.UndefOr[Boolean] = js.undefined,
    transferOwnership: js.UndefOr[Boolean] = js.undefined,
    useDomainAdminAccess: js.UndefOr[Boolean] = js.undefined,
    userIp: String = null
  ): AnonEmailMessage = {
    val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (emailMessage != null) __obj.updateDynamic("emailMessage")(emailMessage.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (!js.isUndefined(sendNotificationEmail)) __obj.updateDynamic("sendNotificationEmail")(sendNotificationEmail.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsTeamDrives)) __obj.updateDynamic("supportsTeamDrives")(supportsTeamDrives.asInstanceOf[js.Any])
    if (!js.isUndefined(transferOwnership)) __obj.updateDynamic("transferOwnership")(transferOwnership.asInstanceOf[js.Any])
    if (!js.isUndefined(useDomainAdminAccess)) __obj.updateDynamic("useDomainAdminAccess")(useDomainAdminAccess.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmailMessage]
  }
}

