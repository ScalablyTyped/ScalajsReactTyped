package typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelBrandingSettings extends js.Object {
  var channel: js.UndefOr[ChannelSettings] = js.undefined
  var hints: js.UndefOr[js.Array[PropertyValue]] = js.undefined
  var image: js.UndefOr[ImageSettings] = js.undefined
  var watch: js.UndefOr[WatchSettings] = js.undefined
}

object ChannelBrandingSettings {
  @scala.inline
  def apply(
    channel: ChannelSettings = null,
    hints: js.Array[PropertyValue] = null,
    image: ImageSettings = null,
    watch: WatchSettings = null
  ): ChannelBrandingSettings = {
    val __obj = js.Dynamic.literal()
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (hints != null) __obj.updateDynamic("hints")(hints.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (watch != null) __obj.updateDynamic("watch")(watch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelBrandingSettings]
  }
}

