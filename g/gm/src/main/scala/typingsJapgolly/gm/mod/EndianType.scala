package typingsJapgolly.gm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.gm.gmStrings.MSB
  - typingsJapgolly.gm.gmStrings.LSB
  - typingsJapgolly.gm.gmStrings.Native
*/
trait EndianType extends js.Object

object EndianType {
  @scala.inline
  def LSB: typingsJapgolly.gm.gmStrings.LSB = this.cast("LSB")
  @scala.inline
  def MSB: typingsJapgolly.gm.gmStrings.MSB = this.cast("MSB")
  @scala.inline
  def Native: typingsJapgolly.gm.gmStrings.Native = this.cast("Native")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

