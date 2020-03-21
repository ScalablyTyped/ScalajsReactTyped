package typingsJapgolly.ionicCore.gestureControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockerConfig extends js.Object {
  var disable: js.UndefOr[js.Array[String]] = js.undefined
  var disableScroll: js.UndefOr[Boolean] = js.undefined
}

object BlockerConfig {
  @scala.inline
  def apply(disable: js.Array[String] = null, disableScroll: js.UndefOr[Boolean] = js.undefined): BlockerConfig = {
    val __obj = js.Dynamic.literal()
    if (disable != null) __obj.updateDynamic("disable")(disable.asInstanceOf[js.Any])
    if (!js.isUndefined(disableScroll)) __obj.updateDynamic("disableScroll")(disableScroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockerConfig]
  }
}

