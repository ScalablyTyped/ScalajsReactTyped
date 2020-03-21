package typingsJapgolly.webcl.WEBCL

import typingsJapgolly.webcl.webclNumbers.`0x0`
import typingsJapgolly.webcl.webclNumbers.`0x1`
import typingsJapgolly.webcl.webclNumbers.`0x2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_device_MEM_CACHE_type */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webcl.webclNumbers.`0x0`
  - typingsJapgolly.webcl.webclNumbers.`0x1`
  - typingsJapgolly.webcl.webclNumbers.`0x2`
*/
trait DeviceMemCacheType extends js.Object

object DeviceMemCacheType {
  @scala.inline
  def NONE: `0x0` = this.cast(0x0)
  @scala.inline
  def READ_ONLY_CACHE: `0x1` = this.cast(0x1)
  @scala.inline
  def READ_WRITE_CACHE: `0x2` = this.cast(0x2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

