package typingsJapgolly.discordRpc.mod

import typingsJapgolly.discordRpc.AnonLeft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserVoiceSettings extends js.Object {
  var id: String
  var mute: js.UndefOr[Boolean] = js.undefined
  var pan: js.UndefOr[AnonLeft] = js.undefined
  var volume: js.UndefOr[Double] = js.undefined
}

object UserVoiceSettings {
  @scala.inline
  def apply(
    id: String,
    mute: js.UndefOr[Boolean] = js.undefined,
    pan: AnonLeft = null,
    volume: Int | Double = null
  ): UserVoiceSettings = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (!js.isUndefined(mute)) __obj.updateDynamic("mute")(mute.asInstanceOf[js.Any])
    if (pan != null) __obj.updateDynamic("pan")(pan.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserVoiceSettings]
  }
}

