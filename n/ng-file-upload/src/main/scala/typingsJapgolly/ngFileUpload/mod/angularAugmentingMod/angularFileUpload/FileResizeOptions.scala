package typingsJapgolly.ngFileUpload.mod.angularAugmentingMod.angularFileUpload

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileResizeOptions extends js.Object {
  var centerCrop: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var pattern: js.UndefOr[String] = js.undefined
  var quality: js.UndefOr[Double] = js.undefined
  var ratio: js.UndefOr[Double | String] = js.undefined
  var resizeIf: js.UndefOr[ResizeIfFunction] = js.undefined
  var restoreExif: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object FileResizeOptions {
  @scala.inline
  def apply(
    centerCrop: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    pattern: String = null,
    quality: Int | Double = null,
    ratio: Double | String = null,
    resizeIf: (/* width */ Double, /* height */ Double) => CallbackTo[Boolean] = null,
    restoreExif: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    width: Int | Double = null
  ): FileResizeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(centerCrop)) __obj.updateDynamic("centerCrop")(centerCrop.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (resizeIf != null) __obj.updateDynamic("resizeIf")(js.Any.fromFunction2((t0: /* width */ scala.Double, t1: /* height */ scala.Double) => resizeIf(t0, t1).runNow()))
    if (!js.isUndefined(restoreExif)) __obj.updateDynamic("restoreExif")(restoreExif.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileResizeOptions]
  }
}

