package typingsJapgolly.jssha.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jssha.jsshaStrings.HEX
  - typingsJapgolly.jssha.jsshaStrings.TEXT
  - typingsJapgolly.jssha.jsshaStrings.B64
  - typingsJapgolly.jssha.jsshaStrings.BYTES
*/
trait StringDataFormat extends js.Object

object StringDataFormat {
  @scala.inline
  def B64: typingsJapgolly.jssha.jsshaStrings.B64 = this.cast("B64")
  @scala.inline
  def BYTES: typingsJapgolly.jssha.jsshaStrings.BYTES = this.cast("BYTES")
  @scala.inline
  def HEX: typingsJapgolly.jssha.jsshaStrings.HEX = this.cast("HEX")
  @scala.inline
  def TEXT: typingsJapgolly.jssha.jsshaStrings.TEXT = this.cast("TEXT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

