package typingsJapgolly.amapJsApiOverview.AMap.OverView

import typingsJapgolly.amapJsApi.AMap.TileLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[L /* <: TileLayer */] extends js.Object {
  /**
    * 鹰眼是否展开，默认为false
    */
  var isOpen: js.UndefOr[Boolean] = js.undefined
  /**
    * 鹰眼窗体中需显示的切片图层
    */
  var tileLayer: js.UndefOr[L] = js.undefined
  /**
    * 鹰眼是否显示，默认为true
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply[L /* <: TileLayer */](
    isOpen: js.UndefOr[Boolean] = js.undefined,
    tileLayer: L = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): Options[L] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (tileLayer != null) __obj.updateDynamic("tileLayer")(tileLayer.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[L]]
  }
}

