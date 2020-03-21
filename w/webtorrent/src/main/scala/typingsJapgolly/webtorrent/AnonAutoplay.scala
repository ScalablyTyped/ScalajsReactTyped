package typingsJapgolly.webtorrent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoplay extends js.Object {
  var autoplay: js.UndefOr[Boolean] = js.undefined
  var controls: js.UndefOr[Boolean] = js.undefined
  var maxBlobLength: js.UndefOr[Double] = js.undefined
}

object AnonAutoplay {
  @scala.inline
  def apply(
    autoplay: js.UndefOr[Boolean] = js.undefined,
    controls: js.UndefOr[Boolean] = js.undefined,
    maxBlobLength: Int | Double = null
  ): AnonAutoplay = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (maxBlobLength != null) __obj.updateDynamic("maxBlobLength")(maxBlobLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoplay]
  }
}

