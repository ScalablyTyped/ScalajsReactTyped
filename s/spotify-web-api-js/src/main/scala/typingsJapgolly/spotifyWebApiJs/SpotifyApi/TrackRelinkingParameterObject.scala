package typingsJapgolly.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackRelinkingParameterObject extends js.Object {
  var market: js.UndefOr[String] = js.undefined
}

object TrackRelinkingParameterObject {
  @scala.inline
  def apply(market: String = null): TrackRelinkingParameterObject = {
    val __obj = js.Dynamic.literal()
    if (market != null) __obj.updateDynamic("market")(market.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackRelinkingParameterObject]
  }
}

