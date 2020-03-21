package typingsJapgolly.croppie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.croppie.croppieStrings.canvas
  - typingsJapgolly.croppie.croppieStrings.base64
  - typingsJapgolly.croppie.croppieStrings.html
  - typingsJapgolly.croppie.croppieStrings.blob
  - typingsJapgolly.croppie.croppieStrings.rawcanvas
*/
trait Type extends js.Object

object Type {
  @scala.inline
  def base64: typingsJapgolly.croppie.croppieStrings.base64 = this.cast("base64")
  @scala.inline
  def blob: typingsJapgolly.croppie.croppieStrings.blob = this.cast("blob")
  @scala.inline
  def canvas: typingsJapgolly.croppie.croppieStrings.canvas = this.cast("canvas")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def html: typingsJapgolly.croppie.croppieStrings.html = this.cast("html")
  @scala.inline
  def rawcanvas: typingsJapgolly.croppie.croppieStrings.rawcanvas = this.cast("rawcanvas")
}

