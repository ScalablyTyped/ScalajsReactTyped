package typingsJapgolly.auth0

import typingsJapgolly.auth0.auth0Strings.HS256
import typingsJapgolly.auth0.auth0Strings.RS256
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlg extends js.Object {
  // The algorithm used to sign the JsonWebToken
  var alg: js.UndefOr[HS256 | RS256] = js.undefined
  // The amount of time (in seconds) that the token will be valid after being issued
  var lifetime_in_seconds: js.UndefOr[Double] = js.undefined
  var scopes: js.UndefOr[js.Object] = js.undefined
}

object AnonAlg {
  @scala.inline
  def apply(alg: HS256 | RS256 = null, lifetime_in_seconds: Int | Double = null, scopes: js.Object = null): AnonAlg = {
    val __obj = js.Dynamic.literal()
    if (alg != null) __obj.updateDynamic("alg")(alg.asInstanceOf[js.Any])
    if (lifetime_in_seconds != null) __obj.updateDynamic("lifetime_in_seconds")(lifetime_in_seconds.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlg]
  }
}

