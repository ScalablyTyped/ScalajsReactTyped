package typingsJapgolly.saslprep.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowUnassigned: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(allowUnassigned: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUnassigned)) __obj.updateDynamic("allowUnassigned")(allowUnassigned.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

