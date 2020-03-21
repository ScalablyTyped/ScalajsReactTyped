package typingsJapgolly.bleno.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.bleno.blenoStrings.read
  - typingsJapgolly.bleno.blenoStrings.write
  - typingsJapgolly.bleno.blenoStrings.indicate
  - typingsJapgolly.bleno.blenoStrings.notify
  - typingsJapgolly.bleno.blenoStrings.writeWithoutResponse
*/
trait Property extends js.Object

object Property {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def indicate: typingsJapgolly.bleno.blenoStrings.indicate = this.cast("indicate")
  @scala.inline
  def read: typingsJapgolly.bleno.blenoStrings.read = this.cast("read")
  @scala.inline
  def write: typingsJapgolly.bleno.blenoStrings.write = this.cast("write")
  @scala.inline
  def writeWithoutResponse: typingsJapgolly.bleno.blenoStrings.writeWithoutResponse = this.cast("writeWithoutResponse")
}

