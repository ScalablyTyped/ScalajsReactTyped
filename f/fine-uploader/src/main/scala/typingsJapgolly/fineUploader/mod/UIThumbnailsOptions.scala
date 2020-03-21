package typingsJapgolly.fineUploader.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.fineUploader.coreMod.CustomResizerCallBack
import typingsJapgolly.fineUploader.coreMod.PromiseOptions
import typingsJapgolly.fineUploader.coreMod.ResizeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIThumbnailsOptions extends js.Object {
  /**
    * Ignored if the current browser does not support image previews.
    *
    * If you want to use an alternate library to resize the image, you must contribute a function for this option that returns a Promise.
    * Once the resize is complete, your promise must be fulfilled.
    *
    * You may, of course, reject your returned Promise is the resize fails in some way
    *
    * @default `undefined`
    */
  var customResizer: js.UndefOr[CustomResizerCallBack] = js.undefined
  /**
    * Maximum number of previews to render per Fine Uploader instance.
    *
    * A call to the reset method resets this value as well
    *
    * @default `0`
    */
  var maxCount: js.UndefOr[Double] = js.undefined
  /**
    *
    */
  var placeholders: js.UndefOr[UIThumbnailsPlaceholderOptions] = js.undefined
  /**
    * The amount of time, in milliseconds, to pause between each preview generation process.
    *
    * This is in place to prevent the UI thread from locking up for a continuously long period of time, as preview generation can be a resource-intensive process
    *
    * @default `750`
    */
  var timeBetweenThumbs: js.UndefOr[Double] = js.undefined
}

object UIThumbnailsOptions {
  @scala.inline
  def apply(
    customResizer: /* resizeInfo */ ResizeInfo => CallbackTo[PromiseOptions] = null,
    maxCount: Int | Double = null,
    placeholders: UIThumbnailsPlaceholderOptions = null,
    timeBetweenThumbs: Int | Double = null
  ): UIThumbnailsOptions = {
    val __obj = js.Dynamic.literal()
    if (customResizer != null) __obj.updateDynamic("customResizer")(js.Any.fromFunction1((t0: /* resizeInfo */ typingsJapgolly.fineUploader.coreMod.ResizeInfo) => customResizer(t0).runNow()))
    if (maxCount != null) __obj.updateDynamic("maxCount")(maxCount.asInstanceOf[js.Any])
    if (placeholders != null) __obj.updateDynamic("placeholders")(placeholders.asInstanceOf[js.Any])
    if (timeBetweenThumbs != null) __obj.updateDynamic("timeBetweenThumbs")(timeBetweenThumbs.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIThumbnailsOptions]
  }
}

