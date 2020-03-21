package typingsJapgolly.blueimpLoadImage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  // Disables creating the imageHead property.
  var disableImageHead: js.UndefOr[Boolean] = js.undefined
  // Defines the maximum number of bytes to parse.
  var maxMetaDataSize: js.UndefOr[Double] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(disableImageHead: js.UndefOr[Boolean] = js.undefined, maxMetaDataSize: Int | Double = null): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableImageHead)) __obj.updateDynamic("disableImageHead")(disableImageHead.asInstanceOf[js.Any])
    if (maxMetaDataSize != null) __obj.updateDynamic("maxMetaDataSize")(maxMetaDataSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseOptions]
  }
}

