package typingsJapgolly.webcl.WEBCL

import typingsJapgolly.webcl.webclNumbers.`0x11D0`
import typingsJapgolly.webcl.webclNumbers.`0x11D1`
import typingsJapgolly.webcl.webclNumbers.`0x11D3`
import typingsJapgolly.webcl.webclNumbers.`0x11D4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_event_info  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webcl.webclNumbers.`0x11D0`
  - typingsJapgolly.webcl.webclNumbers.`0x11D1`
  - typingsJapgolly.webcl.webclNumbers.`0x11D3`
  - typingsJapgolly.webcl.webclNumbers.`0x11D4`
*/
trait EventInfo extends js.Object

object EventInfo {
  //EVENT_REFERENCE_COUNT                     = 0x11D2, // disallowed
  @scala.inline
  def EVENT_COMMAND_EXECUTION_STATUS: `0x11D3` = this.cast(0x11D3)
  @scala.inline
  def EVENT_COMMAND_QUEUE: `0x11D0` = this.cast(0x11D0)
  @scala.inline
  def EVENT_COMMAND_TYPE: `0x11D1` = this.cast(0x11D1)
  @scala.inline
  def EVENT_CONTEXT: `0x11D4` = this.cast(0x11D4)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

