package typingsJapgolly.webcl.WEBCL

import typingsJapgolly.webcl.webclNumbers.`0x1280`
import typingsJapgolly.webcl.webclNumbers.`0x1281`
import typingsJapgolly.webcl.webclNumbers.`0x1282`
import typingsJapgolly.webcl.webclNumbers.`0x1283`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_profiling_info  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webcl.webclNumbers.`0x1280`
  - typingsJapgolly.webcl.webclNumbers.`0x1281`
  - typingsJapgolly.webcl.webclNumbers.`0x1282`
  - typingsJapgolly.webcl.webclNumbers.`0x1283`
*/
trait ProfilingInfo extends js.Object

object ProfilingInfo {
  @scala.inline
  def PROFILING_COMMAND_END: `0x1283` = this.cast(0x1283)
  @scala.inline
  def PROFILING_COMMAND_QUEUED: `0x1280` = this.cast(0x1280)
  @scala.inline
  def PROFILING_COMMAND_START: `0x1282` = this.cast(0x1282)
  @scala.inline
  def PROFILING_COMMAND_SUBMIT: `0x1281` = this.cast(0x1281)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

