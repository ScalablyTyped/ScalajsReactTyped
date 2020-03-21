package typingsJapgolly.actionsOnGoogle.apiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.SUCCESS
  - typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.PENDING
  - typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.OFFLINE
  - typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.ERROR
*/
trait SmartHomeV1ExecuteStatus extends js.Object

object SmartHomeV1ExecuteStatus {
  @scala.inline
  def ERROR: typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.ERROR = this.cast("ERROR")
  @scala.inline
  def OFFLINE: typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.OFFLINE = this.cast("OFFLINE")
  @scala.inline
  def PENDING: typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.PENDING = this.cast("PENDING")
  @scala.inline
  def SUCCESS: typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.SUCCESS = this.cast("SUCCESS")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

