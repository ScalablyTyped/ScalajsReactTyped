package typingsJapgolly.webpackBlocksTypescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonModules extends js.Object {
  var modules: js.UndefOr[Boolean] = js.undefined
  var targets: js.UndefOr[String] = js.undefined
}

object AnonModules {
  @scala.inline
  def apply(modules: js.UndefOr[Boolean] = js.undefined, targets: String = null): AnonModules = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(modules)) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonModules]
  }
}

