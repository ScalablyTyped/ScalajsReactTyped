package typingsJapgolly.spotifyWebPlaybackSdk.Spotify

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayerInit extends js.Object {
  var name: String
  var volume: js.UndefOr[Double] = js.undefined
  def getOAuthToken(cb: js.Function1[/* token */ String, Unit]): Unit
}

object PlayerInit {
  @scala.inline
  def apply(
    getOAuthToken: js.Function1[/* token */ String, Unit] => Callback,
    name: String,
    volume: Int | Double = null
  ): PlayerInit = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("getOAuthToken")(js.Any.fromFunction1((t0: js.Function1[/* token */ java.lang.String, scala.Unit]) => getOAuthToken(t0).runNow()))
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerInit]
  }
}

