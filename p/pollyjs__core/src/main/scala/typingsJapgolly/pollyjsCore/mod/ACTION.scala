package typingsJapgolly.pollyjsCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pollyjsCore.pollyjsCoreStrings.record
  - typingsJapgolly.pollyjsCore.pollyjsCoreStrings.replay
  - typingsJapgolly.pollyjsCore.pollyjsCoreStrings.intercept
  - typingsJapgolly.pollyjsCore.pollyjsCoreStrings.passthrough
*/
trait ACTION extends js.Object

object ACTION {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def intercept: typingsJapgolly.pollyjsCore.pollyjsCoreStrings.intercept = this.cast("intercept")
  @scala.inline
  def passthrough: typingsJapgolly.pollyjsCore.pollyjsCoreStrings.passthrough = this.cast("passthrough")
  @scala.inline
  def record: typingsJapgolly.pollyjsCore.pollyjsCoreStrings.record = this.cast("record")
  @scala.inline
  def replay: typingsJapgolly.pollyjsCore.pollyjsCoreStrings.replay = this.cast("replay")
}

