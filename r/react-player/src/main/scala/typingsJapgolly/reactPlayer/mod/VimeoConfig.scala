package typingsJapgolly.reactPlayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VimeoConfig extends js.Object {
  var playerOptions: js.UndefOr[js.Object] = js.undefined
  var preload: js.UndefOr[Boolean] = js.undefined
}

object VimeoConfig {
  @scala.inline
  def apply(playerOptions: js.Object = null, preload: js.UndefOr[Boolean] = js.undefined): VimeoConfig = {
    val __obj = js.Dynamic.literal()
    if (playerOptions != null) __obj.updateDynamic("playerOptions")(playerOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(preload)) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    __obj.asInstanceOf[VimeoConfig]
  }
}

