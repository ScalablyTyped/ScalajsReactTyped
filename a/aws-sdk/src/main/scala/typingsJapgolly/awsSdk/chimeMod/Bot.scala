package typingsJapgolly.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bot extends js.Object {
  /**
    * The bot email address.
    */
  var BotEmail: js.UndefOr[SensitiveString] = js.native
  /**
    * The bot ID.
    */
  var BotId: js.UndefOr[String] = js.native
  /**
    * The bot type.
    */
  var BotType: js.UndefOr[typingsJapgolly.awsSdk.chimeMod.BotType] = js.native
  /**
    * The bot creation timestamp, in ISO 8601 format.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * When true, the bot is stopped from running in your account.
    */
  var Disabled: js.UndefOr[NullableBoolean] = js.native
  /**
    * The bot display name.
    */
  var DisplayName: js.UndefOr[SensitiveString] = js.native
  /**
    * The security token used to authenticate Amazon Chime with the outgoing event endpoint.
    */
  var SecurityToken: js.UndefOr[SensitiveString] = js.native
  /**
    * The updated bot timestamp, in ISO 8601 format.
    */
  var UpdatedTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The unique ID for the bot user.
    */
  var UserId: js.UndefOr[String] = js.native
}

object Bot {
  @scala.inline
  def apply(
    BotEmail: SensitiveString = null,
    BotId: String = null,
    BotType: BotType = null,
    CreatedTimestamp: js.Date = null,
    Disabled: js.UndefOr[scala.Boolean] = js.undefined,
    DisplayName: SensitiveString = null,
    SecurityToken: SensitiveString = null,
    UpdatedTimestamp: js.Date = null,
    UserId: String = null
  ): Bot = {
    val __obj = js.Dynamic.literal()
    if (BotEmail != null) __obj.updateDynamic("BotEmail")(BotEmail.asInstanceOf[js.Any])
    if (BotId != null) __obj.updateDynamic("BotId")(BotId.asInstanceOf[js.Any])
    if (BotType != null) __obj.updateDynamic("BotType")(BotType.asInstanceOf[js.Any])
    if (CreatedTimestamp != null) __obj.updateDynamic("CreatedTimestamp")(CreatedTimestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(Disabled)) __obj.updateDynamic("Disabled")(Disabled.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (SecurityToken != null) __obj.updateDynamic("SecurityToken")(SecurityToken.asInstanceOf[js.Any])
    if (UpdatedTimestamp != null) __obj.updateDynamic("UpdatedTimestamp")(UpdatedTimestamp.asInstanceOf[js.Any])
    if (UserId != null) __obj.updateDynamic("UserId")(UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bot]
  }
}

