package typingsJapgolly.evaporate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PauseConfig extends js.Object {
  var force: js.UndefOr[Boolean] = js.undefined
}

object PauseConfig {
  @scala.inline
  def apply(force: js.UndefOr[Boolean] = js.undefined): PauseConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    __obj.asInstanceOf[PauseConfig]
  }
}

