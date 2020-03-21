package typingsJapgolly.webcl.WEBCL

import typingsJapgolly.webcl.webclNumbers.`0x0`
import typingsJapgolly.webcl.webclNumbers.`0x1`
import typingsJapgolly.webcl.webclNumbers.`0x2`
import typingsJapgolly.webcl.webclNumbers.`0x3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* command execution status */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webcl.webclNumbers.`0x0`
  - typingsJapgolly.webcl.webclNumbers.`0x1`
  - typingsJapgolly.webcl.webclNumbers.`0x2`
  - typingsJapgolly.webcl.webclNumbers.`0x3`
*/
trait CommandExecutionStatus extends js.Object

object CommandExecutionStatus {
  @scala.inline
  def COMPLETE: `0x0` = this.cast(0x0)
  @scala.inline
  def QUEUED: `0x3` = this.cast(0x3)
  @scala.inline
  def RUNNING: `0x1` = this.cast(0x1)
  @scala.inline
  def SUBMITTED: `0x2` = this.cast(0x2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

