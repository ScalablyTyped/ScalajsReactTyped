package typingsJapgolly.markdownPdf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.markdownPdf.markdownPdfStrings.portait
  - typingsJapgolly.markdownPdf.markdownPdfStrings.landscape
*/
trait PaperOrientation extends js.Object

object PaperOrientation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def landscape: typingsJapgolly.markdownPdf.markdownPdfStrings.landscape = this.cast("landscape")
  @scala.inline
  def portait: typingsJapgolly.markdownPdf.markdownPdfStrings.portait = this.cast("portait")
}

