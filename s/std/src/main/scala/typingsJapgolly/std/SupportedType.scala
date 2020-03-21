package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.applicationSlashxhtmlPlussignxml
  - typingsJapgolly.std.stdStrings.applicationSlashxml
  - typingsJapgolly.std.stdStrings.imageSlashsvgPlussignxml
  - typingsJapgolly.std.stdStrings.textSlashhtml
  - typingsJapgolly.std.stdStrings.textSlashxml
*/
trait SupportedType extends js.Object

object SupportedType {
  @scala.inline
  def applicationSlashxhtmlPlussignxml: typingsJapgolly.std.stdStrings.applicationSlashxhtmlPlussignxml = this.cast("application/xhtml+xml")
  @scala.inline
  def applicationSlashxml: typingsJapgolly.std.stdStrings.applicationSlashxml = this.cast("application/xml")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def imageSlashsvgPlussignxml: typingsJapgolly.std.stdStrings.imageSlashsvgPlussignxml = this.cast("image/svg+xml")
  @scala.inline
  def textSlashhtml: typingsJapgolly.std.stdStrings.textSlashhtml = this.cast("text/html")
  @scala.inline
  def textSlashxml: typingsJapgolly.std.stdStrings.textSlashxml = this.cast("text/xml")
}

