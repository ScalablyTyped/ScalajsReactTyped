package typingsJapgolly.globParent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var flipBackslashes: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(flipBackslashes: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(flipBackslashes)) __obj.updateDynamic("flipBackslashes")(flipBackslashes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

