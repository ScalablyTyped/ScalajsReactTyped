package typingsJapgolly.webcl.WEBCL

import typingsJapgolly.webcl.webclNumbers.`0x1190`
import typingsJapgolly.webcl.webclNumbers.`0x1191`
import typingsJapgolly.webcl.webclNumbers.`0x1193`
import typingsJapgolly.webcl.webclNumbers.`0x1194`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_kernel_info */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webcl.webclNumbers.`0x1190`
  - typingsJapgolly.webcl.webclNumbers.`0x1191`
  - typingsJapgolly.webcl.webclNumbers.`0x1193`
  - typingsJapgolly.webcl.webclNumbers.`0x1194`
*/
trait KernelInfo extends js.Object

object KernelInfo {
  //KERNEL_REFERENCE_COUNT                    = 0x1192, // disallowed
  @scala.inline
  def KERNEL_CONTEXT: `0x1193` = this.cast(0x1193)
  @scala.inline
  def KERNEL_FUNCTION_NAME: `0x1190` = this.cast(0x1190)
  @scala.inline
  def KERNEL_NUM_RGS: `0x1191` = this.cast(0x1191)
  @scala.inline
  def KERNEL_PROGRAM: `0x1194` = this.cast(0x1194)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

