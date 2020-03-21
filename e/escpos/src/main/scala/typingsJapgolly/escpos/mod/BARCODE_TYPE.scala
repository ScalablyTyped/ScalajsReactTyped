package typingsJapgolly.escpos.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.escpos.escposStrings.UPC_A
  - typingsJapgolly.escpos.escposStrings.UPC_E
  - typingsJapgolly.escpos.escposStrings.EAN13
  - typingsJapgolly.escpos.escposStrings.EAN8
  - typingsJapgolly.escpos.escposStrings.CODE39
  - typingsJapgolly.escpos.escposStrings.ITF
  - typingsJapgolly.escpos.escposStrings.NW7
  - typingsJapgolly.escpos.escposStrings.CODE93
  - typingsJapgolly.escpos.escposStrings.CODE128
*/
trait BARCODE_TYPE extends js.Object

object BARCODE_TYPE {
  @scala.inline
  def CODE128: typingsJapgolly.escpos.escposStrings.CODE128 = this.cast("CODE128")
  @scala.inline
  def CODE39: typingsJapgolly.escpos.escposStrings.CODE39 = this.cast("CODE39")
  @scala.inline
  def CODE93: typingsJapgolly.escpos.escposStrings.CODE93 = this.cast("CODE93")
  @scala.inline
  def EAN13: typingsJapgolly.escpos.escposStrings.EAN13 = this.cast("EAN13")
  @scala.inline
  def EAN8: typingsJapgolly.escpos.escposStrings.EAN8 = this.cast("EAN8")
  @scala.inline
  def ITF: typingsJapgolly.escpos.escposStrings.ITF = this.cast("ITF")
  @scala.inline
  def NW7: typingsJapgolly.escpos.escposStrings.NW7 = this.cast("NW7")
  @scala.inline
  def UPC_A: typingsJapgolly.escpos.escposStrings.UPC_A = this.cast("UPC_A")
  @scala.inline
  def UPC_E: typingsJapgolly.escpos.escposStrings.UPC_E = this.cast("UPC_E")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

