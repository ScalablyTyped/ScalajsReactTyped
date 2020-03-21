package typingsJapgolly.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ably.ablyStrings.publish
  - typingsJapgolly.ably.ablyStrings.subscribe
  - typingsJapgolly.ably.ablyStrings.presence
  - typingsJapgolly.ably.ablyStrings.history
  - typingsJapgolly.ably.ablyStrings.stats
  - typingsJapgolly.ably.ablyStrings.`channel-metadata`
  - typingsJapgolly.ably.ablyStrings.`push-subscribe`
  - typingsJapgolly.ably.ablyStrings.`push-admin`
*/
trait capabilityOp extends js.Object

object capabilityOp {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `channel-metadata`: typingsJapgolly.ably.ablyStrings.`channel-metadata` = this.cast("channel-metadata")
  @scala.inline
  def history: typingsJapgolly.ably.ablyStrings.history = this.cast("history")
  @scala.inline
  def presence: typingsJapgolly.ably.ablyStrings.presence = this.cast("presence")
  @scala.inline
  def publish: typingsJapgolly.ably.ablyStrings.publish = this.cast("publish")
  @scala.inline
  def `push-admin`: typingsJapgolly.ably.ablyStrings.`push-admin` = this.cast("push-admin")
  @scala.inline
  def `push-subscribe`: typingsJapgolly.ably.ablyStrings.`push-subscribe` = this.cast("push-subscribe")
  @scala.inline
  def stats: typingsJapgolly.ably.ablyStrings.stats = this.cast("stats")
  @scala.inline
  def subscribe: typingsJapgolly.ably.ablyStrings.subscribe = this.cast("subscribe")
}

