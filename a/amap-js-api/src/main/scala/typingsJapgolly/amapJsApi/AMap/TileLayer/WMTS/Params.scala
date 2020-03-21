package typingsJapgolly.amapJsApi.AMap.TileLayer.WMTS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  var Format: js.UndefOr[String] = js.undefined
  var Layer: js.UndefOr[String] = js.undefined
  var Style: js.UndefOr[String] = js.undefined
  var Version: js.UndefOr[String] = js.undefined
}

object Params {
  @scala.inline
  def apply(Format: String = null, Layer: String = null, Style: String = null, Version: String = null): Params = {
    val __obj = js.Dynamic.literal()
    if (Format != null) __obj.updateDynamic("Format")(Format.asInstanceOf[js.Any])
    if (Layer != null) __obj.updateDynamic("Layer")(Layer.asInstanceOf[js.Any])
    if (Style != null) __obj.updateDynamic("Style")(Style.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
}

