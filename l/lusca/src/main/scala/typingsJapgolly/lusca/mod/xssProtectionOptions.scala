package typingsJapgolly.lusca.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait xssProtectionOptions extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
}

object xssProtectionOptions {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, mode: String = null): xssProtectionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[xssProtectionOptions]
  }
}

