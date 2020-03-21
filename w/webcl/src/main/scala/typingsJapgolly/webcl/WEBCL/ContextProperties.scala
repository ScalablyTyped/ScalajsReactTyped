package typingsJapgolly.webcl.WEBCL

import typingsJapgolly.webcl.webclNumbers.`0x1090`
import typingsJapgolly.webcl.webclNumbers.`0x1091`
import typingsJapgolly.webcl.webclNumbers.`0x1093`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_context_properties */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webcl.webclNumbers.`0x1090`
  - typingsJapgolly.webcl.webclNumbers.`0x1091`
  - typingsJapgolly.webcl.webclNumbers.`0x1093`
*/
trait ContextProperties extends js.Object

object ContextProperties {
  //CONTEXT_PLATFORM                          = 0x1084, // disallowed, no context properties in Web /* cl_command_queue_info */
  @scala.inline
  def QUEUE_CONTEXT: `0x1090` = this.cast(0x1090)
  @scala.inline
  def QUEUE_DEVICE: `0x1091` = this.cast(0x1091)
  //QUEUE_REFERENCE_COUNT                     = 0x1092, // disallowed
  @scala.inline
  def QUEUE_PROPERTIES: `0x1093` = this.cast(0x1093)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

