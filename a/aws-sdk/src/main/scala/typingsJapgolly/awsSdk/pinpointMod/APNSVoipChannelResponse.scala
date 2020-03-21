package typingsJapgolly.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait APNSVoipChannelResponse extends js.Object {
  /**
    * The unique identifier for the application that the APNs VoIP channel applies to.
    */
  var ApplicationId: js.UndefOr[string] = js.native
  /**
    * The date and time when the APNs VoIP channel was enabled.
    */
  var CreationDate: js.UndefOr[string] = js.native
  /**
    * The default authentication method that Amazon Pinpoint uses to authenticate with APNs for this channel, key or certificate.
    */
  var DefaultAuthenticationMethod: js.UndefOr[string] = js.native
  /**
    * Specifies whether the APNs VoIP channel is enabled for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.native
  /**
    * (Not used) This property is retained only for backward compatibility.
    */
  var HasCredential: js.UndefOr[boolean] = js.native
  /**
    * Specifies whether the APNs VoIP channel is configured to communicate with APNs by using APNs tokens. To provide an authentication key for APNs tokens, set the TokenKey property of the channel.
    */
  var HasTokenKey: js.UndefOr[boolean] = js.native
  /**
    * (Deprecated) An identifier for the APNs VoIP channel. This property is retained only for backward compatibility.
    */
  var Id: js.UndefOr[string] = js.native
  /**
    * Specifies whether the APNs VoIP channel is archived.
    */
  var IsArchived: js.UndefOr[boolean] = js.native
  /**
    * The user who last modified the APNs VoIP channel.
    */
  var LastModifiedBy: js.UndefOr[string] = js.native
  /**
    * The date and time when the APNs VoIP channel was last modified.
    */
  var LastModifiedDate: js.UndefOr[string] = js.native
  /**
    * The type of messaging or notification platform for the channel. For the APNs VoIP channel, this value is APNS_VOIP.
    */
  var Platform: string = js.native
  /**
    * The current version of the APNs VoIP channel.
    */
  var Version: js.UndefOr[integer] = js.native
}

object APNSVoipChannelResponse {
  @scala.inline
  def apply(
    Platform: string,
    ApplicationId: string = null,
    CreationDate: string = null,
    DefaultAuthenticationMethod: string = null,
    Enabled: js.UndefOr[Boolean] = js.undefined,
    HasCredential: js.UndefOr[Boolean] = js.undefined,
    HasTokenKey: js.UndefOr[Boolean] = js.undefined,
    Id: string = null,
    IsArchived: js.UndefOr[Boolean] = js.undefined,
    LastModifiedBy: string = null,
    LastModifiedDate: string = null,
    Version: Int | Double = null
  ): APNSVoipChannelResponse = {
    val __obj = js.Dynamic.literal(Platform = Platform.asInstanceOf[js.Any])
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (DefaultAuthenticationMethod != null) __obj.updateDynamic("DefaultAuthenticationMethod")(DefaultAuthenticationMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(HasCredential)) __obj.updateDynamic("HasCredential")(HasCredential.asInstanceOf[js.Any])
    if (!js.isUndefined(HasTokenKey)) __obj.updateDynamic("HasTokenKey")(HasTokenKey.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (!js.isUndefined(IsArchived)) __obj.updateDynamic("IsArchived")(IsArchived.asInstanceOf[js.Any])
    if (LastModifiedBy != null) __obj.updateDynamic("LastModifiedBy")(LastModifiedBy.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[APNSVoipChannelResponse]
  }
}

