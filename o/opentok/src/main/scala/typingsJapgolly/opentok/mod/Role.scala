package typingsJapgolly.opentok.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.opentok.opentokStrings.subscriber
  - typingsJapgolly.opentok.opentokStrings.publisher
  - typingsJapgolly.opentok.opentokStrings.moderator
*/
trait Role extends js.Object

object Role {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def moderator: typingsJapgolly.opentok.opentokStrings.moderator = this.cast("moderator")
  @scala.inline
  def publisher: typingsJapgolly.opentok.opentokStrings.publisher = this.cast("publisher")
  @scala.inline
  def subscriber: typingsJapgolly.opentok.opentokStrings.subscriber = this.cast("subscriber")
}

