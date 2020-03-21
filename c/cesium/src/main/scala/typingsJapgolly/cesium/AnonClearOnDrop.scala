package typingsJapgolly.cesium

import org.scalajs.dom.raw.Element
import typingsJapgolly.cesium.mod.DefaultProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClearOnDrop extends js.Object {
  var clampToGround: js.UndefOr[Boolean] = js.undefined
  var clearOnDrop: js.UndefOr[Boolean] = js.undefined
  var dropTarget: js.UndefOr[Element | String] = js.undefined
  var flyToOnDrop: js.UndefOr[Boolean] = js.undefined
  var proxy: js.UndefOr[DefaultProxy] = js.undefined
}

object AnonClearOnDrop {
  @scala.inline
  def apply(
    clampToGround: js.UndefOr[Boolean] = js.undefined,
    clearOnDrop: js.UndefOr[Boolean] = js.undefined,
    dropTarget: Element | String = null,
    flyToOnDrop: js.UndefOr[Boolean] = js.undefined,
    proxy: DefaultProxy = null
  ): AnonClearOnDrop = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clampToGround)) __obj.updateDynamic("clampToGround")(clampToGround.asInstanceOf[js.Any])
    if (!js.isUndefined(clearOnDrop)) __obj.updateDynamic("clearOnDrop")(clearOnDrop.asInstanceOf[js.Any])
    if (dropTarget != null) __obj.updateDynamic("dropTarget")(dropTarget.asInstanceOf[js.Any])
    if (!js.isUndefined(flyToOnDrop)) __obj.updateDynamic("flyToOnDrop")(flyToOnDrop.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClearOnDrop]
  }
}

