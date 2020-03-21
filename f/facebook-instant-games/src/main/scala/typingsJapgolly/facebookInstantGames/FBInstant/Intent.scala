package typingsJapgolly.facebookInstantGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.facebookInstantGames.facebookInstantGamesStrings.INVITE
  - typingsJapgolly.facebookInstantGames.facebookInstantGamesStrings.REQUEST
  - typingsJapgolly.facebookInstantGames.facebookInstantGamesStrings.CHALLENGE
  - typingsJapgolly.facebookInstantGames.facebookInstantGamesStrings.SHARE
*/
trait Intent extends js.Object

object Intent {
  @scala.inline
  def CHALLENGE: typingsJapgolly.facebookInstantGames.facebookInstantGamesStrings.CHALLENGE = this.cast("CHALLENGE")
  @scala.inline
  def INVITE: typingsJapgolly.facebookInstantGames.facebookInstantGamesStrings.INVITE = this.cast("INVITE")
  @scala.inline
  def REQUEST: typingsJapgolly.facebookInstantGames.facebookInstantGamesStrings.REQUEST = this.cast("REQUEST")
  @scala.inline
  def SHARE: typingsJapgolly.facebookInstantGames.facebookInstantGamesStrings.SHARE = this.cast("SHARE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

