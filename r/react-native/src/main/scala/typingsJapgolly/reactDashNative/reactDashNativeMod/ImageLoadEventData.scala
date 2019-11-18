package typingsJapgolly.reactDashNative.reactDashNativeMod

import typingsJapgolly.reactDashNative.Anon_HeightUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageLoadEventData extends ImageLoadEventDataAndroid {
  var source: Anon_HeightUrl
}

object ImageLoadEventData {
  @scala.inline
  def apply(source: Anon_HeightUrl, uri: String = null): ImageLoadEventData = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageLoadEventData]
  }
}

