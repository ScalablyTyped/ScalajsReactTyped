package typingsJapgolly.loopback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnabled extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var params: js.UndefOr[js.Array[_] | js.Any] = js.undefined
  var paths: js.UndefOr[js.Array[_] | String | js.RegExp] = js.undefined
  var phase: String
}

object AnonEnabled {
  @scala.inline
  def apply(
    phase: String,
    enabled: js.UndefOr[Boolean] = js.undefined,
    params: js.Array[_] | js.Any = null,
    paths: js.Array[_] | String | js.RegExp = null
  ): AnonEnabled = {
    val __obj = js.Dynamic.literal(phase = phase.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnabled]
  }
}

