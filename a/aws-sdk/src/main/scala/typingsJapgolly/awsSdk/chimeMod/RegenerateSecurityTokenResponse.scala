package typingsJapgolly.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegenerateSecurityTokenResponse extends js.Object {
  var Bot: js.UndefOr[typingsJapgolly.awsSdk.chimeMod.Bot] = js.native
}

object RegenerateSecurityTokenResponse {
  @scala.inline
  def apply(Bot: Bot = null): RegenerateSecurityTokenResponse = {
    val __obj = js.Dynamic.literal()
    if (Bot != null) __obj.updateDynamic("Bot")(Bot.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegenerateSecurityTokenResponse]
  }
}

