package typingsJapgolly.webcl.WEBCL

import typingsJapgolly.webcl.webclNumbers.`0x1`
import typingsJapgolly.webcl.webclNumbers.`0x2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_command_queue_properties - bitfield */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webcl.webclNumbers.`0x1`
  - typingsJapgolly.webcl.webclNumbers.`0x2`
*/
trait CommandQueueProperties extends js.Object

object CommandQueueProperties {
  @scala.inline
  def QUEUE_OUT_OF_ORDER_EXEC_MODE_ENABLE: `0x1` = this.cast(0x1)
  @scala.inline
  def QUEUE_PROFILING_ENABLE: `0x2` = this.cast(0x2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

