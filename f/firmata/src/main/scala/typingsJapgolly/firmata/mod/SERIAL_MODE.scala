package typingsJapgolly.firmata.mod

import typingsJapgolly.firmata.firmataNumbers.`0x00`
import typingsJapgolly.firmata.firmataNumbers.`0x01`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/firmata/firmata.js/blob/v0.15.0/lib/firmata.js#L491-L494
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firmata.firmataNumbers.`0x00`
  - typingsJapgolly.firmata.firmataNumbers.`0x01`
*/
trait SERIAL_MODE extends js.Object

object SERIAL_MODE {
  @scala.inline
  def CONTINUOUS_READ: `0x00` = this.cast(0x00)
  @scala.inline
  def STOP_READING: `0x01` = this.cast(0x01)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

