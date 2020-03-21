package typingsJapgolly.facebookInstantGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.facebookInstantGames.facebookInstantGamesStrings.POST
  - typingsJapgolly.facebookInstantGames.facebookInstantGamesStrings.THREAD
  - typingsJapgolly.facebookInstantGames.facebookInstantGamesStrings.GROUP
  - typingsJapgolly.facebookInstantGames.facebookInstantGamesStrings.SOLO
*/
trait Type extends js.Object

object Type {
  @scala.inline
  def GROUP: typingsJapgolly.facebookInstantGames.facebookInstantGamesStrings.GROUP = this.cast("GROUP")
  @scala.inline
  def POST: typingsJapgolly.facebookInstantGames.facebookInstantGamesStrings.POST = this.cast("POST")
  @scala.inline
  def SOLO: typingsJapgolly.facebookInstantGames.facebookInstantGamesStrings.SOLO = this.cast("SOLO")
  @scala.inline
  def THREAD: typingsJapgolly.facebookInstantGames.facebookInstantGamesStrings.THREAD = this.cast("THREAD")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

