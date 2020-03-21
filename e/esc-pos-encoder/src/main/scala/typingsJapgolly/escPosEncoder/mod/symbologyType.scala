package typingsJapgolly.escPosEncoder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.escPosEncoder.escPosEncoderStrings.upca
  - typingsJapgolly.escPosEncoder.escPosEncoderStrings.upce
  - typingsJapgolly.escPosEncoder.escPosEncoderStrings.ean13
  - typingsJapgolly.escPosEncoder.escPosEncoderStrings.ean8
  - typingsJapgolly.escPosEncoder.escPosEncoderStrings.coda39
  - typingsJapgolly.escPosEncoder.escPosEncoderStrings.itf
  - typingsJapgolly.escPosEncoder.escPosEncoderStrings.codabar
*/
trait symbologyType extends js.Object

object symbologyType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def coda39: typingsJapgolly.escPosEncoder.escPosEncoderStrings.coda39 = this.cast("coda39")
  @scala.inline
  def codabar: typingsJapgolly.escPosEncoder.escPosEncoderStrings.codabar = this.cast("codabar")
  @scala.inline
  def ean13: typingsJapgolly.escPosEncoder.escPosEncoderStrings.ean13 = this.cast("ean13")
  @scala.inline
  def ean8: typingsJapgolly.escPosEncoder.escPosEncoderStrings.ean8 = this.cast("ean8")
  @scala.inline
  def itf: typingsJapgolly.escPosEncoder.escPosEncoderStrings.itf = this.cast("itf")
  @scala.inline
  def upca: typingsJapgolly.escPosEncoder.escPosEncoderStrings.upca = this.cast("upca")
  @scala.inline
  def upce: typingsJapgolly.escPosEncoder.escPosEncoderStrings.upce = this.cast("upce")
}

