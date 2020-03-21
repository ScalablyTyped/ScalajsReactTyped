package typingsJapgolly.relayRuntime.relayDeclarativeMutationConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.relayRuntime.relayRuntimeStrings.RANGE_ADD
  - typingsJapgolly.relayRuntime.relayRuntimeStrings.RANGE_DELETE
  - typingsJapgolly.relayRuntime.relayRuntimeStrings.NODE_DELETE
*/
trait MutationTypes extends js.Object

object MutationTypes {
  @scala.inline
  def NODE_DELETE: typingsJapgolly.relayRuntime.relayRuntimeStrings.NODE_DELETE = this.cast("NODE_DELETE")
  @scala.inline
  def RANGE_ADD: typingsJapgolly.relayRuntime.relayRuntimeStrings.RANGE_ADD = this.cast("RANGE_ADD")
  @scala.inline
  def RANGE_DELETE: typingsJapgolly.relayRuntime.relayRuntimeStrings.RANGE_DELETE = this.cast("RANGE_DELETE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

