package typingsJapgolly.qrImage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.qrImage.qrImageStrings.png
  - typingsJapgolly.qrImage.qrImageStrings.svg
  - typingsJapgolly.qrImage.qrImageStrings.pdf
  - typingsJapgolly.qrImage.qrImageStrings.eps
*/
trait imageType extends js.Object

object imageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def eps: typingsJapgolly.qrImage.qrImageStrings.eps = this.cast("eps")
  @scala.inline
  def pdf: typingsJapgolly.qrImage.qrImageStrings.pdf = this.cast("pdf")
  @scala.inline
  def png: typingsJapgolly.qrImage.qrImageStrings.png = this.cast("png")
  @scala.inline
  def svg: typingsJapgolly.qrImage.qrImageStrings.svg = this.cast("svg")
}

