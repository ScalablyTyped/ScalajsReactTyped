package typingsJapgolly.dplayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.dplayer.dplayerStrings.auto
  - typingsJapgolly.dplayer.dplayerStrings.hls
  - typingsJapgolly.dplayer.dplayerStrings.flv
  - typingsJapgolly.dplayer.dplayerStrings.dash
  - typingsJapgolly.dplayer.dplayerStrings.webtorrent
  - typingsJapgolly.dplayer.dplayerStrings.normal
*/
trait VideoType extends js.Object

object VideoType {
  @scala.inline
  def auto: typingsJapgolly.dplayer.dplayerStrings.auto = this.cast("auto")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dash: typingsJapgolly.dplayer.dplayerStrings.dash = this.cast("dash")
  @scala.inline
  def flv: typingsJapgolly.dplayer.dplayerStrings.flv = this.cast("flv")
  @scala.inline
  def hls: typingsJapgolly.dplayer.dplayerStrings.hls = this.cast("hls")
  @scala.inline
  def normal: typingsJapgolly.dplayer.dplayerStrings.normal = this.cast("normal")
  @scala.inline
  def webtorrent: typingsJapgolly.dplayer.dplayerStrings.webtorrent = this.cast("webtorrent")
}

