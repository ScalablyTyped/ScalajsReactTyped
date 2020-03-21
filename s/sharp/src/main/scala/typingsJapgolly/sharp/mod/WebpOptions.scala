package typingsJapgolly.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebpOptions extends OutputOptions {
  /** Quality of alpha layer, number from 0-100 (optional, default 100) */
  var alphaQuality: js.UndefOr[Double] = js.undefined
  /** Use lossless compression mode (optional, default false) */
  var lossless: js.UndefOr[Boolean] = js.undefined
  /** Use near_lossless compression mode (optional, default false) */
  var nearLossless: js.UndefOr[Boolean] = js.undefined
  /** Level of CPU effort to reduce file size, integer 0-6 (optional, default 4) */
  var reductionEffort: js.UndefOr[Double] = js.undefined
  /** Use high quality chroma subsampling (optional, default false) */
  var smartSubsample: js.UndefOr[Boolean] = js.undefined
}

object WebpOptions {
  @scala.inline
  def apply(
    alphaQuality: Int | Double = null,
    force: js.UndefOr[Boolean] = js.undefined,
    lossless: js.UndefOr[Boolean] = js.undefined,
    nearLossless: js.UndefOr[Boolean] = js.undefined,
    quality: Int | Double = null,
    reductionEffort: Int | Double = null,
    smartSubsample: js.UndefOr[Boolean] = js.undefined
  ): WebpOptions = {
    val __obj = js.Dynamic.literal()
    if (alphaQuality != null) __obj.updateDynamic("alphaQuality")(alphaQuality.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (!js.isUndefined(lossless)) __obj.updateDynamic("lossless")(lossless.asInstanceOf[js.Any])
    if (!js.isUndefined(nearLossless)) __obj.updateDynamic("nearLossless")(nearLossless.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (reductionEffort != null) __obj.updateDynamic("reductionEffort")(reductionEffort.asInstanceOf[js.Any])
    if (!js.isUndefined(smartSubsample)) __obj.updateDynamic("smartSubsample")(smartSubsample.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebpOptions]
  }
}

