package typingsJapgolly.wicgMediasession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.wicgMediasession.wicgMediasessionStrings.none
  - typingsJapgolly.wicgMediasession.wicgMediasessionStrings.paused
  - typingsJapgolly.wicgMediasession.wicgMediasessionStrings.playing
*/
trait MediaSessionPlaybackState extends js.Object

object MediaSessionPlaybackState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typingsJapgolly.wicgMediasession.wicgMediasessionStrings.none = this.cast("none")
  @scala.inline
  def paused: typingsJapgolly.wicgMediasession.wicgMediasessionStrings.paused = this.cast("paused")
  @scala.inline
  def playing: typingsJapgolly.wicgMediasession.wicgMediasessionStrings.playing = this.cast("playing")
}

