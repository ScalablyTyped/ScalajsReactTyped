package typingsJapgolly.massive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropOptions extends js.Object {
  var cascade: js.UndefOr[Boolean] = js.undefined
}

object DropOptions {
  @scala.inline
  def apply(cascade: js.UndefOr[Boolean] = js.undefined): DropOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cascade)) __obj.updateDynamic("cascade")(cascade.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropOptions]
  }
}

