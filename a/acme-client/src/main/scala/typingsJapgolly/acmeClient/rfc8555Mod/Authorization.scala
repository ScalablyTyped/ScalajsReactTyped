package typingsJapgolly.acmeClient.rfc8555Mod

import typingsJapgolly.acmeClient.acmeClientStrings.deactivated
import typingsJapgolly.acmeClient.acmeClientStrings.expired
import typingsJapgolly.acmeClient.acmeClientStrings.invalid
import typingsJapgolly.acmeClient.acmeClientStrings.pending
import typingsJapgolly.acmeClient.acmeClientStrings.revoked
import typingsJapgolly.acmeClient.acmeClientStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Authorization extends js.Object {
  var challenges: js.Array[Challenge]
  var expires: js.UndefOr[String] = js.undefined
  var identifier: Identifier
  var status: pending | valid | invalid | deactivated | expired | revoked
  var wildcard: js.UndefOr[Boolean] = js.undefined
}

object Authorization {
  @scala.inline
  def apply(
    challenges: js.Array[Challenge],
    identifier: Identifier,
    status: pending | valid | invalid | deactivated | expired | revoked,
    expires: String = null,
    wildcard: js.UndefOr[Boolean] = js.undefined
  ): Authorization = {
    val __obj = js.Dynamic.literal(challenges = challenges.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (!js.isUndefined(wildcard)) __obj.updateDynamic("wildcard")(wildcard.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorization]
  }
}

