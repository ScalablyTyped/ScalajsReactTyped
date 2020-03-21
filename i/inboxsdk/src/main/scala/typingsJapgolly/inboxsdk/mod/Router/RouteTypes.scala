package typingsJapgolly.inboxsdk.mod.Router

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.inboxsdk.inboxsdkStrings.LIST
  - typingsJapgolly.inboxsdk.inboxsdkStrings.THREAD
  - typingsJapgolly.inboxsdk.inboxsdkStrings.SETTINGS
  - typingsJapgolly.inboxsdk.inboxsdkStrings.CHAT
  - typingsJapgolly.inboxsdk.inboxsdkStrings.CUSTOM
  - typingsJapgolly.inboxsdk.inboxsdkStrings.UNKNOWN
*/
trait RouteTypes extends js.Object

object RouteTypes {
  @scala.inline
  def CHAT: typingsJapgolly.inboxsdk.inboxsdkStrings.CHAT = this.cast("CHAT")
  @scala.inline
  def CUSTOM: typingsJapgolly.inboxsdk.inboxsdkStrings.CUSTOM = this.cast("CUSTOM")
  @scala.inline
  def LIST: typingsJapgolly.inboxsdk.inboxsdkStrings.LIST = this.cast("LIST")
  @scala.inline
  def SETTINGS: typingsJapgolly.inboxsdk.inboxsdkStrings.SETTINGS = this.cast("SETTINGS")
  @scala.inline
  def THREAD: typingsJapgolly.inboxsdk.inboxsdkStrings.THREAD = this.cast("THREAD")
  @scala.inline
  def UNKNOWN: typingsJapgolly.inboxsdk.inboxsdkStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

