package typingsJapgolly.fineUploader.coreMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleImageOptions extends js.Object {
  /**
    * Ignored if the current browser does not support image previews.
    *
    * If you want to use an alternate library to resize the image, you must contribute a function for this option that returns a `Promise`.
    *
    * Once the resize is complete, your promise must be fulfilled.
    * You may, of course, reject your returned `Promise` is the resize fails in some way.
    */
  var customResizer: js.UndefOr[CustomResizerCallBack] = js.undefined
  /**
    * @default `false`
    */
  var includeExif: js.UndefOr[Boolean] = js.undefined
  /**
    * required
    */
  var maxSize: Double
  /**
    * @default `true`
    */
  var orient: js.UndefOr[Boolean] = js.undefined
  /**
    * number between `0` and `100`
    *
    * @default `80`
    */
  var quality: js.UndefOr[Double] = js.undefined
  /**
    * defaults to the type of the reference image
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ScaleImageOptions {
  @scala.inline
  def apply(
    maxSize: Double,
    customResizer: /* resizeInfo */ ResizeInfo => CallbackTo[PromiseOptions] = null,
    includeExif: js.UndefOr[Boolean] = js.undefined,
    orient: js.UndefOr[Boolean] = js.undefined,
    quality: Int | Double = null,
    `type`: String = null
  ): ScaleImageOptions = {
    val __obj = js.Dynamic.literal(maxSize = maxSize.asInstanceOf[js.Any])
    if (customResizer != null) __obj.updateDynamic("customResizer")(js.Any.fromFunction1((t0: /* resizeInfo */ typingsJapgolly.fineUploader.coreMod.ResizeInfo) => customResizer(t0).runNow()))
    if (!js.isUndefined(includeExif)) __obj.updateDynamic("includeExif")(includeExif.asInstanceOf[js.Any])
    if (!js.isUndefined(orient)) __obj.updateDynamic("orient")(orient.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleImageOptions]
  }
}

