package typingsJapgolly.relayRuntime.relayStoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.relayRuntime.relayRuntimeStrings.available
  - typingsJapgolly.relayRuntime.relayRuntimeStrings.stale
  - typingsJapgolly.relayRuntime.relayRuntimeStrings.missing
*/
trait OperationAvailability extends js.Object

object OperationAvailability {
  @scala.inline
  def available: typingsJapgolly.relayRuntime.relayRuntimeStrings.available = this.cast("available")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def missing: typingsJapgolly.relayRuntime.relayRuntimeStrings.missing = this.cast("missing")
  @scala.inline
  def stale: typingsJapgolly.relayRuntime.relayRuntimeStrings.stale = this.cast("stale")
}

