package typingsJapgolly.inputmask.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.inputmask.inputmaskStrings.verbatim
  - typingsJapgolly.inputmask.inputmaskStrings.none
  - typingsJapgolly.inputmask.inputmaskStrings.text
  - typingsJapgolly.inputmask.inputmaskStrings.decimal
  - typingsJapgolly.inputmask.inputmaskStrings.numeric
  - typingsJapgolly.inputmask.inputmaskStrings.tel
  - typingsJapgolly.inputmask.inputmaskStrings.search
  - typingsJapgolly.inputmask.inputmaskStrings.email
  - typingsJapgolly.inputmask.inputmaskStrings.url
*/
trait InputMode extends js.Object

object InputMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def decimal: typingsJapgolly.inputmask.inputmaskStrings.decimal = this.cast("decimal")
  @scala.inline
  def email: typingsJapgolly.inputmask.inputmaskStrings.email = this.cast("email")
  @scala.inline
  def none: typingsJapgolly.inputmask.inputmaskStrings.none = this.cast("none")
  @scala.inline
  def numeric: typingsJapgolly.inputmask.inputmaskStrings.numeric = this.cast("numeric")
  @scala.inline
  def search: typingsJapgolly.inputmask.inputmaskStrings.search = this.cast("search")
  @scala.inline
  def tel: typingsJapgolly.inputmask.inputmaskStrings.tel = this.cast("tel")
  @scala.inline
  def text: typingsJapgolly.inputmask.inputmaskStrings.text = this.cast("text")
  @scala.inline
  def url: typingsJapgolly.inputmask.inputmaskStrings.url = this.cast("url")
  @scala.inline
  def verbatim: typingsJapgolly.inputmask.inputmaskStrings.verbatim = this.cast("verbatim")
}

