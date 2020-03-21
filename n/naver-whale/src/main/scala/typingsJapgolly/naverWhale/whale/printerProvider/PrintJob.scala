package typingsJapgolly.naverWhale.whale.printerProvider

import org.scalajs.dom.raw.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrintJob extends js.Object {
  /** The document content type. Supported formats are "application/pdf" and "image/pwg-raster". */
  var contentType: String
  /** Blob containing the document data to print. Format must match |contentType|. */
  var document: Blob
  /** ID of the printer which should handle the job. */
  var printerId: String
  /** Print ticket in  CJT format. */
  var ticket: js.Object
  /** The print job title. */
  var title: String
}

object PrintJob {
  @scala.inline
  def apply(contentType: String, document: Blob, printerId: String, ticket: js.Object, title: String): PrintJob = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], printerId = printerId.asInstanceOf[js.Any], ticket = ticket.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PrintJob]
  }
}

