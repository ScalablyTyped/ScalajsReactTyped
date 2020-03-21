package typingsJapgolly.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ably.ablyStrings.ACTIVE
  - typingsJapgolly.ably.ablyStrings.FAILING
  - typingsJapgolly.ably.ablyStrings.FAILED
*/
trait DevicePushState extends js.Object

object DevicePushState {
  @scala.inline
  def ACTIVE: typingsJapgolly.ably.ablyStrings.ACTIVE = this.cast("ACTIVE")
  @scala.inline
  def FAILED: typingsJapgolly.ably.ablyStrings.FAILED = this.cast("FAILED")
  @scala.inline
  def FAILING: typingsJapgolly.ably.ablyStrings.FAILING = this.cast("FAILING")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

