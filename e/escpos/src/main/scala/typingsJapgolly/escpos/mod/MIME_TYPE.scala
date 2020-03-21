package typingsJapgolly.escpos.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.escpos.escposStrings.imageSlashpng
  - typingsJapgolly.escpos.escposStrings.imageSlashjpg
  - typingsJapgolly.escpos.escposStrings.imageSlashjpeg
  - typingsJapgolly.escpos.escposStrings.imageSlashgif
  - typingsJapgolly.escpos.escposStrings.imageSlashbmp
*/
trait MIME_TYPE extends js.Object

object MIME_TYPE {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def imageSlashbmp: typingsJapgolly.escpos.escposStrings.imageSlashbmp = this.cast("image/bmp")
  @scala.inline
  def imageSlashgif: typingsJapgolly.escpos.escposStrings.imageSlashgif = this.cast("image/gif")
  @scala.inline
  def imageSlashjpeg: typingsJapgolly.escpos.escposStrings.imageSlashjpeg = this.cast("image/jpeg")
  @scala.inline
  def imageSlashjpg: typingsJapgolly.escpos.escposStrings.imageSlashjpg = this.cast("image/jpg")
  @scala.inline
  def imageSlashpng: typingsJapgolly.escpos.escposStrings.imageSlashpng = this.cast("image/png")
}

