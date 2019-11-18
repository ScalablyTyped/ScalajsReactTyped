package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.Embedded
  - typings.std.stdStrings.USB
  - typings.std.stdStrings.NFC
  - typings.std.stdStrings.BT
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

