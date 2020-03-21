package typingsJapgolly.acmeClient.mod

import typingsJapgolly.acmeClient.acmeClientStrings.deactivated
import typingsJapgolly.acmeClient.acmeClientStrings.expired
import typingsJapgolly.acmeClient.acmeClientStrings.invalid
import typingsJapgolly.acmeClient.acmeClientStrings.pending
import typingsJapgolly.acmeClient.acmeClientStrings.revoked
import typingsJapgolly.acmeClient.acmeClientStrings.valid
import typingsJapgolly.acmeClient.rfc8555Mod.Challenge
import typingsJapgolly.acmeClient.rfc8555Mod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Authorization
  extends typingsJapgolly.acmeClient.rfc8555Mod.Authorization {
  var url: String
}

object Authorization {
  @scala.inline
  def apply(
    challenges: js.Array[Challenge],
    identifier: Identifier,
    status: pending | valid | invalid | deactivated | expired | revoked,
    url: String,
    expires: String = null,
    wildcard: js.UndefOr[Boolean] = js.undefined
  ): Authorization = {
    val __obj = js.Dynamic.literal(challenges = challenges.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (!js.isUndefined(wildcard)) __obj.updateDynamic("wildcard")(wildcard.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorization]
  }
}

