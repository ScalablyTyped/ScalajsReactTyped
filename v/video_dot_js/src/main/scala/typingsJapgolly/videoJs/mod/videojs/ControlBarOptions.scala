package typingsJapgolly.videoJs.mod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControlBarOptions extends ComponentOptions {
  var fullscreenToggle: js.UndefOr[Boolean] = js.undefined
  var volumePanel: js.UndefOr[VolumePanelOptions] = js.undefined
}

object ControlBarOptions {
  @scala.inline
  def apply(
    children: js.Array[Child] = null,
    fullscreenToggle: js.UndefOr[Boolean] = js.undefined,
    volumePanel: VolumePanelOptions = null
  ): ControlBarOptions = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(fullscreenToggle)) __obj.updateDynamic("fullscreenToggle")(fullscreenToggle.asInstanceOf[js.Any])
    if (volumePanel != null) __obj.updateDynamic("volumePanel")(volumePanel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlBarOptions]
  }
}

