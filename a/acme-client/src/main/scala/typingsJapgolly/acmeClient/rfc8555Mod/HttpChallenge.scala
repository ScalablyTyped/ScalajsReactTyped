package typingsJapgolly.acmeClient.rfc8555Mod

import typingsJapgolly.acmeClient.acmeClientStrings.`http-01`
import typingsJapgolly.acmeClient.acmeClientStrings.invalid
import typingsJapgolly.acmeClient.acmeClientStrings.pending
import typingsJapgolly.acmeClient.acmeClientStrings.processing
import typingsJapgolly.acmeClient.acmeClientStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpChallenge
  extends ChallengeAbstract
     with Challenge {
  var token: String
  @JSName("type")
  var type_HttpChallenge: `http-01`
}

object HttpChallenge {
  @scala.inline
  def apply(
    status: pending | processing | valid | invalid,
    token: String,
    `type`: `http-01`,
    url: String,
    error: js.Object = null,
    validated: String = null
  ): HttpChallenge = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (validated != null) __obj.updateDynamic("validated")(validated.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpChallenge]
  }
}

