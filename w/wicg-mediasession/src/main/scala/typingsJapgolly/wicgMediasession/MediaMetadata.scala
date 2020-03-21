package typingsJapgolly.wicgMediasession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MediaMetadata")
@js.native
class MediaMetadata () extends js.Object {
  def this(init: MediaMetadataInit) = this()
  // Media's album.
  var album: String = js.native
  // Media's artist.
  var artist: String = js.native
  // Media's artwork.
  var artwork: js.Array[MediaImage] = js.native
  // Media's title.
  var title: String = js.native
}

