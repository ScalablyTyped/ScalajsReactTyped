package typingsJapgolly.seneca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLocal extends js.Object {
  var local: js.UndefOr[Boolean] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
}

object AnonLocal {
  @scala.inline
  def apply(local: js.UndefOr[Boolean] = js.undefined, prefix: String = null): AnonLocal = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(local)) __obj.updateDynamic("local")(local.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLocal]
  }
}

