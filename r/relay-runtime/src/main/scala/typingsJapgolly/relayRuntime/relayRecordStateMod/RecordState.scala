package typingsJapgolly.relayRuntime.relayRecordStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.relayRuntime.relayRuntimeStrings.EXISTENT
  - typingsJapgolly.relayRuntime.relayRuntimeStrings.NONEXISTENT
  - typingsJapgolly.relayRuntime.relayRuntimeStrings.UNKNOWN
*/
trait RecordState extends js.Object

object RecordState {
  @scala.inline
  def EXISTENT: typingsJapgolly.relayRuntime.relayRuntimeStrings.EXISTENT = this.cast("EXISTENT")
  @scala.inline
  def NONEXISTENT: typingsJapgolly.relayRuntime.relayRuntimeStrings.NONEXISTENT = this.cast("NONEXISTENT")
  @scala.inline
  def UNKNOWN: typingsJapgolly.relayRuntime.relayRuntimeStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

