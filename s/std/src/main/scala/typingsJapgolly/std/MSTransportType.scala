package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.BT
  - typingsJapgolly.std.stdStrings.Embedded
  - typingsJapgolly.std.stdStrings.NFC
  - typingsJapgolly.std.stdStrings.USB
*/
trait MSTransportType extends js.Object

object MSTransportType {
  @scala.inline
  def BT: typingsJapgolly.std.stdStrings.BT = this.cast("BT")
  @scala.inline
  def Embedded: typingsJapgolly.std.stdStrings.Embedded = this.cast("Embedded")
  @scala.inline
  def NFC: typingsJapgolly.std.stdStrings.NFC = this.cast("NFC")
  @scala.inline
  def USB: typingsJapgolly.std.stdStrings.USB = this.cast("USB")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

