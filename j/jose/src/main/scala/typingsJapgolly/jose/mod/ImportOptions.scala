package typingsJapgolly.jose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportOptions extends js.Object {
  var calculateMissingRSAPrimes: js.UndefOr[Boolean] = js.undefined
}

object ImportOptions {
  @scala.inline
  def apply(calculateMissingRSAPrimes: js.UndefOr[Boolean] = js.undefined): ImportOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(calculateMissingRSAPrimes)) __obj.updateDynamic("calculateMissingRSAPrimes")(calculateMissingRSAPrimes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportOptions]
  }
}

