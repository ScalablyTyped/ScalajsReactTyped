package typingsJapgolly.spotifyWebPlaybackSdk.Spotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Album extends js.Object {
  var images: js.Array[Image]
  var name: String
  var uri: String
}

object Album {
  @scala.inline
  def apply(images: js.Array[Image], name: String, uri: String): Album = {
    val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Album]
  }
}

