package typingsJapgolly.videoJs.mod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VolumeControlOptions extends ComponentOptions {
  var vertical: js.UndefOr[Boolean] = js.undefined
  var volumeBar: js.UndefOr[VolumeBar] = js.undefined
}

object VolumeControlOptions {
  @scala.inline
  def apply(
    children: js.Array[Child] = null,
    vertical: js.UndefOr[Boolean] = js.undefined,
    volumeBar: VolumeBar = null
  ): VolumeControlOptions = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (volumeBar != null) __obj.updateDynamic("volumeBar")(volumeBar.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeControlOptions]
  }
}

