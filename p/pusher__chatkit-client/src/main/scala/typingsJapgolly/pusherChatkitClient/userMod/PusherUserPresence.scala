package typingsJapgolly.pusherChatkitClient.userMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pusherChatkitClient.pusherChatkitClientStrings.online
  - typingsJapgolly.pusherChatkitClient.pusherChatkitClientStrings.offline
  - typingsJapgolly.pusherChatkitClient.pusherChatkitClientStrings.unknown
*/
trait PusherUserPresence extends js.Object

object PusherUserPresence {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def offline: typingsJapgolly.pusherChatkitClient.pusherChatkitClientStrings.offline = this.cast("offline")
  @scala.inline
  def online: typingsJapgolly.pusherChatkitClient.pusherChatkitClientStrings.online = this.cast("online")
  @scala.inline
  def unknown: typingsJapgolly.pusherChatkitClient.pusherChatkitClientStrings.unknown = this.cast("unknown")
}

