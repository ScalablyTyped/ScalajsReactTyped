package typingsJapgolly.croppie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.croppie.croppieStrings.jpeg
  - typingsJapgolly.croppie.croppieStrings.png
  - typingsJapgolly.croppie.croppieStrings.webp
*/
trait Format extends js.Object

object Format {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def jpeg: typingsJapgolly.croppie.croppieStrings.jpeg = this.cast("jpeg")
  @scala.inline
  def png: typingsJapgolly.croppie.croppieStrings.png = this.cast("png")
  @scala.inline
  def webp: typingsJapgolly.croppie.croppieStrings.webp = this.cast("webp")
}

