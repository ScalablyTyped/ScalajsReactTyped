package typingsJapgolly.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaiduChannelResponse extends js.Object {
  /**
    * The unique identifier for the application that the Baidu channel applies to.
    */
  var ApplicationId: js.UndefOr[string] = js.native
  /**
    * The date and time when the Baidu channel was enabled.
    */
  var CreationDate: js.UndefOr[string] = js.native
  /**
    * The API key that you received from the Baidu Cloud Push service to communicate with the service.
    */
  var Credential: string = js.native
  /**
    * Specifies whether the Baidu channel is enabled for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.native
  /**
    * (Not used) This property is retained only for backward compatibility.
    */
  var HasCredential: js.UndefOr[boolean] = js.native
  /**
    * (Deprecated) An identifier for the Baidu channel. This property is retained only for backward compatibility.
    */
  var Id: js.UndefOr[string] = js.native
  /**
    * Specifies whether the Baidu channel is archived.
    */
  var IsArchived: js.UndefOr[boolean] = js.native
  /**
    * The user who last modified the Baidu channel.
    */
  var LastModifiedBy: js.UndefOr[string] = js.native
  /**
    * The date and time when the Baidu channel was last modified.
    */
  var LastModifiedDate: js.UndefOr[string] = js.native
  /**
    * The type of messaging or notification platform for the channel. For the Baidu channel, this value is BAIDU.
    */
  var Platform: string = js.native
  /**
    * The current version of the Baidu channel.
    */
  var Version: js.UndefOr[integer] = js.native
}

object BaiduChannelResponse {
  @scala.inline
  def apply(
    Credential: string,
    Platform: string,
    ApplicationId: string = null,
    CreationDate: string = null,
    Enabled: js.UndefOr[Boolean] = js.undefined,
    HasCredential: js.UndefOr[Boolean] = js.undefined,
    Id: string = null,
    IsArchived: js.UndefOr[Boolean] = js.undefined,
    LastModifiedBy: string = null,
    LastModifiedDate: string = null,
    Version: Int | Double = null
  ): BaiduChannelResponse = {
    val __obj = js.Dynamic.literal(Credential = Credential.asInstanceOf[js.Any], Platform = Platform.asInstanceOf[js.Any])
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(HasCredential)) __obj.updateDynamic("HasCredential")(HasCredential.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (!js.isUndefined(IsArchived)) __obj.updateDynamic("IsArchived")(IsArchived.asInstanceOf[js.Any])
    if (LastModifiedBy != null) __obj.updateDynamic("LastModifiedBy")(LastModifiedBy.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaiduChannelResponse]
  }
}

