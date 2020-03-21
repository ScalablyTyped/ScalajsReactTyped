package typingsJapgolly.acmeClient.rfc8555Mod

import typingsJapgolly.acmeClient.acmeClientStrings.invalid
import typingsJapgolly.acmeClient.acmeClientStrings.pending
import typingsJapgolly.acmeClient.acmeClientStrings.processing
import typingsJapgolly.acmeClient.acmeClientStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChallengeAbstract extends js.Object {
  var error: js.UndefOr[js.Object] = js.undefined
  var status: pending | processing | valid | invalid
  var `type`: String
  var url: String
  var validated: js.UndefOr[String] = js.undefined
}

object ChallengeAbstract {
  @scala.inline
  def apply(
    status: pending | processing | valid | invalid,
    `type`: String,
    url: String,
    error: js.Object = null,
    validated: String = null
  ): ChallengeAbstract = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (validated != null) __obj.updateDynamic("validated")(validated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChallengeAbstract]
  }
}

