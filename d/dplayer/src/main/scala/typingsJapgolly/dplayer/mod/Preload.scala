package typingsJapgolly.dplayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.dplayer.dplayerStrings.none
  - typingsJapgolly.dplayer.dplayerStrings.metadata
  - typingsJapgolly.dplayer.dplayerStrings.auto
*/
trait Preload extends js.Object

object Preload {
  @scala.inline
  def auto: typingsJapgolly.dplayer.dplayerStrings.auto = this.cast("auto")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def metadata: typingsJapgolly.dplayer.dplayerStrings.metadata = this.cast("metadata")
  @scala.inline
  def none: typingsJapgolly.dplayer.dplayerStrings.none = this.cast("none")
}

