package typingsJapgolly.storybookApi.urlMod

import typingsJapgolly.storybookApi.layoutMod.PanelPositions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Additions extends js.Object {
  var isFullscreen: js.UndefOr[Boolean] = js.undefined
  var panelPosition: js.UndefOr[PanelPositions] = js.undefined
  var selectedPanel: js.UndefOr[String] = js.undefined
  var showNav: js.UndefOr[Boolean] = js.undefined
  var showPanel: js.UndefOr[Boolean] = js.undefined
  var viewMode: js.UndefOr[String] = js.undefined
}

object Additions {
  @scala.inline
  def apply(
    isFullscreen: js.UndefOr[Boolean] = js.undefined,
    panelPosition: PanelPositions = null,
    selectedPanel: String = null,
    showNav: js.UndefOr[Boolean] = js.undefined,
    showPanel: js.UndefOr[Boolean] = js.undefined,
    viewMode: String = null
  ): Additions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isFullscreen)) __obj.updateDynamic("isFullscreen")(isFullscreen.asInstanceOf[js.Any])
    if (panelPosition != null) __obj.updateDynamic("panelPosition")(panelPosition.asInstanceOf[js.Any])
    if (selectedPanel != null) __obj.updateDynamic("selectedPanel")(selectedPanel.asInstanceOf[js.Any])
    if (!js.isUndefined(showNav)) __obj.updateDynamic("showNav")(showNav.asInstanceOf[js.Any])
    if (!js.isUndefined(showPanel)) __obj.updateDynamic("showPanel")(showPanel.asInstanceOf[js.Any])
    if (viewMode != null) __obj.updateDynamic("viewMode")(viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Additions]
  }
}

