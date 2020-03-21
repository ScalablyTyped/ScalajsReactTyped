package typingsJapgolly.webcl.WEBCL

import typingsJapgolly.webcl.webclNumbers.`0x1131`
import typingsJapgolly.webcl.webclNumbers.`0x1132`
import typingsJapgolly.webcl.webclNumbers.`0x1133`
import typingsJapgolly.webcl.webclNumbers.`0x1134`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_addressing_mode */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webcl.webclNumbers.`0x1131`
  - typingsJapgolly.webcl.webclNumbers.`0x1132`
  - typingsJapgolly.webcl.webclNumbers.`0x1133`
  - typingsJapgolly.webcl.webclNumbers.`0x1134`
*/
trait AddressingMode extends js.Object

object AddressingMode {
  @scala.inline
  def ADDRESS_CLAMP: `0x1132` = this.cast(0x1132)
  //ADDRESS_NONE                              = 0x1130, // disallowed
  @scala.inline
  def ADDRESS_CLAMP_TO_EDGE: `0x1131` = this.cast(0x1131)
  @scala.inline
  def ADDRESS_MIRRORED_REPEAT: `0x1134` = this.cast(0x1134)
  @scala.inline
  def ADDRESS_REPEAT: `0x1133` = this.cast(0x1133)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

