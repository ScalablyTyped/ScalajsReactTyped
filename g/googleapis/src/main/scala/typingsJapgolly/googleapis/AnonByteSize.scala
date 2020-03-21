package typingsJapgolly.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonByteSize extends js.Object {
  var byteSize: js.UndefOr[Double] = js.native
  var contextLink: js.UndefOr[String] = js.native
  var height: js.UndefOr[Double] = js.native
  var thumbnailHeight: js.UndefOr[Double] = js.native
  var thumbnailLink: js.UndefOr[String] = js.native
  var thumbnailWidth: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object AnonByteSize {
  @scala.inline
  def apply(
    byteSize: Int | Double = null,
    contextLink: String = null,
    height: Int | Double = null,
    thumbnailHeight: Int | Double = null,
    thumbnailLink: String = null,
    thumbnailWidth: Int | Double = null,
    width: Int | Double = null
  ): AnonByteSize = {
    val __obj = js.Dynamic.literal()
    if (byteSize != null) __obj.updateDynamic("byteSize")(byteSize.asInstanceOf[js.Any])
    if (contextLink != null) __obj.updateDynamic("contextLink")(contextLink.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (thumbnailHeight != null) __obj.updateDynamic("thumbnailHeight")(thumbnailHeight.asInstanceOf[js.Any])
    if (thumbnailLink != null) __obj.updateDynamic("thumbnailLink")(thumbnailLink.asInstanceOf[js.Any])
    if (thumbnailWidth != null) __obj.updateDynamic("thumbnailWidth")(thumbnailWidth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonByteSize]
  }
}

