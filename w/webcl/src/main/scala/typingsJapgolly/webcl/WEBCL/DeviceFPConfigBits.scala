package typingsJapgolly.webcl.WEBCL

import typingsJapgolly.webcl.webclNumbers.`0x10`
import typingsJapgolly.webcl.webclNumbers.`0x1`
import typingsJapgolly.webcl.webclNumbers.`0x20`
import typingsJapgolly.webcl.webclNumbers.`0x2`
import typingsJapgolly.webcl.webclNumbers.`0x40`
import typingsJapgolly.webcl.webclNumbers.`0x4`
import typingsJapgolly.webcl.webclNumbers.`0x8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_device_fp_config - bitfield */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webcl.webclNumbers.`0x1`
  - typingsJapgolly.webcl.webclNumbers.`0x2`
  - typingsJapgolly.webcl.webclNumbers.`0x4`
  - typingsJapgolly.webcl.webclNumbers.`0x8`
  - typingsJapgolly.webcl.webclNumbers.`0x10`
  - typingsJapgolly.webcl.webclNumbers.`0x20`
  - typingsJapgolly.webcl.webclNumbers.`0x40`
*/
trait DeviceFPConfigBits extends js.Object

object DeviceFPConfigBits {
  @scala.inline
  def FP_DENORM: `0x1` = this.cast(0x1)
  @scala.inline
  def FP_FMA: `0x20` = this.cast(0x20)
  @scala.inline
  def FP_INF_NAN: `0x2` = this.cast(0x2)
  @scala.inline
  def FP_ROUND_TO_INF: `0x10` = this.cast(0x10)
  @scala.inline
  def FP_ROUND_TO_NEAREST: `0x4` = this.cast(0x4)
  @scala.inline
  def FP_ROUND_TO_ZERO: `0x8` = this.cast(0x8)
  @scala.inline
  def FP_SOFT_FLOAT: `0x40` = this.cast(0x40)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

