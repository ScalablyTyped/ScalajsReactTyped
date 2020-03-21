package typingsJapgolly.webcl.WEBCL

import typingsJapgolly.webcl.webclNumbers.`0x1`
import typingsJapgolly.webcl.webclNumbers.`0x2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_device_local_mem_type */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webcl.webclNumbers.`0x1`
  - typingsJapgolly.webcl.webclNumbers.`0x2`
*/
trait DeviceLocalMemType extends js.Object

object DeviceLocalMemType {
  @scala.inline
  def GLOBAL: `0x2` = this.cast(0x2)
  @scala.inline
  def LOCAL: `0x1` = this.cast(0x1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

