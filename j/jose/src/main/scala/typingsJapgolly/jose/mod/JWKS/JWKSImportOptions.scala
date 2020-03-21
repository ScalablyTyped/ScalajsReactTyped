package typingsJapgolly.jose.mod.JWKS

import typingsJapgolly.jose.mod.ImportOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JWKSImportOptions extends ImportOptions {
  var ignoreErrors: js.UndefOr[Boolean] = js.undefined
}

object JWKSImportOptions {
  @scala.inline
  def apply(
    calculateMissingRSAPrimes: js.UndefOr[Boolean] = js.undefined,
    ignoreErrors: js.UndefOr[Boolean] = js.undefined
  ): JWKSImportOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(calculateMissingRSAPrimes)) __obj.updateDynamic("calculateMissingRSAPrimes")(calculateMissingRSAPrimes.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreErrors)) __obj.updateDynamic("ignoreErrors")(ignoreErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWKSImportOptions]
  }
}

