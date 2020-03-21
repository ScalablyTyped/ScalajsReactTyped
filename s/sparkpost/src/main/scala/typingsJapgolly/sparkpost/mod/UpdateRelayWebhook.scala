package typingsJapgolly.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateRelayWebhook extends js.Object {
  /** Authentication token to present in the X-MessageSystems-Webhook-Token header of POST requests to target */
  var auth_token: js.UndefOr[String] = js.undefined
  /** Restrict which inbound messages will be relayed to the target */
  var `match`: js.UndefOr[Match] = js.undefined
  /** User-friendly name  no  example: Inbound Customer Replies */
  var name: js.UndefOr[String] = js.undefined
  /** URL of the target to which to POST relay batches */
  var target: String
}

object UpdateRelayWebhook {
  @scala.inline
  def apply(target: String, auth_token: String = null, `match`: Match = null, name: String = null): UpdateRelayWebhook = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    if (auth_token != null) __obj.updateDynamic("auth_token")(auth_token.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRelayWebhook]
  }
}

