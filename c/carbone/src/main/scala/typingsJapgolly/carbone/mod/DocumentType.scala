package typingsJapgolly.carbone.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.carbone.carboneStrings.document
  - typingsJapgolly.carbone.carboneStrings.web
  - typingsJapgolly.carbone.carboneStrings.graphics
  - typingsJapgolly.carbone.carboneStrings.spreadsheet
  - typingsJapgolly.carbone.carboneStrings.presentation
*/
trait DocumentType extends js.Object

object DocumentType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def document: typingsJapgolly.carbone.carboneStrings.document = this.cast("document")
  @scala.inline
  def graphics: typingsJapgolly.carbone.carboneStrings.graphics = this.cast("graphics")
  @scala.inline
  def presentation: typingsJapgolly.carbone.carboneStrings.presentation = this.cast("presentation")
  @scala.inline
  def spreadsheet: typingsJapgolly.carbone.carboneStrings.spreadsheet = this.cast("spreadsheet")
  @scala.inline
  def web: typingsJapgolly.carbone.carboneStrings.web = this.cast("web")
}

