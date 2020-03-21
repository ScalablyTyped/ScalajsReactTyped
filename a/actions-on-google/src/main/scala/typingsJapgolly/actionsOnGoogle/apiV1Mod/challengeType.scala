package typingsJapgolly.actionsOnGoogle.apiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.ackNeeded
  - typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.pinNeeded
  - typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.challengeFailedPinNeeded
*/
trait challengeType extends js.Object

object challengeType {
  @scala.inline
  def ackNeeded: typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.ackNeeded = this.cast("ackNeeded")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def challengeFailedPinNeeded: typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.challengeFailedPinNeeded = this.cast("challengeFailedPinNeeded")
  @scala.inline
  def pinNeeded: typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.pinNeeded = this.cast("pinNeeded")
}

