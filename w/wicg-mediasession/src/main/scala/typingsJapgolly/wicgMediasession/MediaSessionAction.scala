package typingsJapgolly.wicgMediasession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.wicgMediasession.wicgMediasessionStrings.play
  - typingsJapgolly.wicgMediasession.wicgMediasessionStrings.pause
  - typingsJapgolly.wicgMediasession.wicgMediasessionStrings.seekbackward
  - typingsJapgolly.wicgMediasession.wicgMediasessionStrings.seekforward
  - typingsJapgolly.wicgMediasession.wicgMediasessionStrings.previoustrack
  - typingsJapgolly.wicgMediasession.wicgMediasessionStrings.nexttrack
*/
trait MediaSessionAction extends js.Object

object MediaSessionAction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def nexttrack: typingsJapgolly.wicgMediasession.wicgMediasessionStrings.nexttrack = this.cast("nexttrack")
  @scala.inline
  def pause: typingsJapgolly.wicgMediasession.wicgMediasessionStrings.pause = this.cast("pause")
  @scala.inline
  def play: typingsJapgolly.wicgMediasession.wicgMediasessionStrings.play = this.cast("play")
  @scala.inline
  def previoustrack: typingsJapgolly.wicgMediasession.wicgMediasessionStrings.previoustrack = this.cast("previoustrack")
  @scala.inline
  def seekbackward: typingsJapgolly.wicgMediasession.wicgMediasessionStrings.seekbackward = this.cast("seekbackward")
  @scala.inline
  def seekforward: typingsJapgolly.wicgMediasession.wicgMediasessionStrings.seekforward = this.cast("seekforward")
}

