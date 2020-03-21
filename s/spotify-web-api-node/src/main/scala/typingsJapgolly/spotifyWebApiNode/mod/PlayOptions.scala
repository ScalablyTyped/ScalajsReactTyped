package typingsJapgolly.spotifyWebApiNode.mod

import typingsJapgolly.spotifyWebApiNode.AnonPosition
import typingsJapgolly.spotifyWebApiNode.AnonUri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayOptions extends DeviceOptions {
  var context_uri: js.UndefOr[String] = js.undefined
  var offset: js.UndefOr[AnonPosition | AnonUri] = js.undefined
  var position_ms: js.UndefOr[Double] = js.undefined
  var uris: js.UndefOr[js.Array[String]] = js.undefined
}

object PlayOptions {
  @scala.inline
  def apply(
    context_uri: String = null,
    device_id: String = null,
    offset: AnonPosition | AnonUri = null,
    position_ms: Int | Double = null,
    uris: js.Array[String] = null
  ): PlayOptions = {
    val __obj = js.Dynamic.literal()
    if (context_uri != null) __obj.updateDynamic("context_uri")(context_uri.asInstanceOf[js.Any])
    if (device_id != null) __obj.updateDynamic("device_id")(device_id.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position_ms != null) __obj.updateDynamic("position_ms")(position_ms.asInstanceOf[js.Any])
    if (uris != null) __obj.updateDynamic("uris")(uris.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayOptions]
  }
}

