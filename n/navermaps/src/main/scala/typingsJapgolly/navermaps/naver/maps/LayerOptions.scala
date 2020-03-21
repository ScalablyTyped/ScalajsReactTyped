package typingsJapgolly.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerOptions extends js.Object {
  var hd: Boolean
  var overlayMap: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object LayerOptions {
  @scala.inline
  def apply(hd: Boolean, overlayMap: js.UndefOr[Boolean] = js.undefined, zIndex: Int | Double = null): LayerOptions = {
    val __obj = js.Dynamic.literal(hd = hd.asInstanceOf[js.Any])
    if (!js.isUndefined(overlayMap)) __obj.updateDynamic("overlayMap")(overlayMap.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerOptions]
  }
}

