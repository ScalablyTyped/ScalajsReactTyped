package typingsJapgolly.webcl.WEBCL

import typingsJapgolly.webcl.webclNumbers.`0x1140`
import typingsJapgolly.webcl.webclNumbers.`0x1141`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_filter_mode */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webcl.webclNumbers.`0x1140`
  - typingsJapgolly.webcl.webclNumbers.`0x1141`
*/
trait FilterMode extends js.Object

object FilterMode {
  @scala.inline
  def FILTER_LINEAR: `0x1141` = this.cast(0x1141)
  @scala.inline
  def FILTER_NEAREST: `0x1140` = this.cast(0x1140)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

