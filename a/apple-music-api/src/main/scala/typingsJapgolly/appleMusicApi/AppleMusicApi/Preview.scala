package typingsJapgolly.appleMusicApi.AppleMusicApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/applemusicapi/preview
trait Preview extends js.Object {
  var artwork: js.UndefOr[Artwork] = js.undefined
  var url: String
}

object Preview {
  @scala.inline
  def apply(url: String, artwork: Artwork = null): Preview = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (artwork != null) __obj.updateDynamic("artwork")(artwork.asInstanceOf[js.Any])
    __obj.asInstanceOf[Preview]
  }
}

