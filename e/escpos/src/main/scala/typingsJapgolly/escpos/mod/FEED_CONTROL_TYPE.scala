package typingsJapgolly.escpos.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.escpos.escposStrings.LF
  - typingsJapgolly.escpos.escposStrings.GLF
  - typingsJapgolly.escpos.escposStrings.FF
  - typingsJapgolly.escpos.escposStrings.CR
  - typingsJapgolly.escpos.escposStrings.HT
  - typingsJapgolly.escpos.escposStrings.VT
*/
trait FEED_CONTROL_TYPE extends js.Object

object FEED_CONTROL_TYPE {
  @scala.inline
  def CR: typingsJapgolly.escpos.escposStrings.CR = this.cast("CR")
  @scala.inline
  def FF: typingsJapgolly.escpos.escposStrings.FF = this.cast("FF")
  @scala.inline
  def GLF: typingsJapgolly.escpos.escposStrings.GLF = this.cast("GLF")
  @scala.inline
  def HT: typingsJapgolly.escpos.escposStrings.HT = this.cast("HT")
  @scala.inline
  def LF: typingsJapgolly.escpos.escposStrings.LF = this.cast("LF")
  @scala.inline
  def VT: typingsJapgolly.escpos.escposStrings.VT = this.cast("VT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

