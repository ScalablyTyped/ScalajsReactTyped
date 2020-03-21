package typingsJapgolly.pdfkit.PDFKit.Mixins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The winding / filling rule accepted by PDFKit:
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pdfkit.pdfkitStrings.`even-odd`
  - typingsJapgolly.pdfkit.pdfkitStrings.evenodd
  - typingsJapgolly.pdfkit.pdfkitStrings.`non-zero`
  - typingsJapgolly.pdfkit.pdfkitStrings.nonzero
*/
trait RuleValue extends js.Object

object RuleValue {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `even-odd`: typingsJapgolly.pdfkit.pdfkitStrings.`even-odd` = this.cast("even-odd")
  @scala.inline
  def evenodd: typingsJapgolly.pdfkit.pdfkitStrings.evenodd = this.cast("evenodd")
  @scala.inline
  def `non-zero`: typingsJapgolly.pdfkit.pdfkitStrings.`non-zero` = this.cast("non-zero")
  @scala.inline
  def nonzero: typingsJapgolly.pdfkit.pdfkitStrings.nonzero = this.cast("nonzero")
}

