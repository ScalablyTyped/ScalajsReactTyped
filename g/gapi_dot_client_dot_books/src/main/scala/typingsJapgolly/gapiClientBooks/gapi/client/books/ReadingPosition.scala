package typingsJapgolly.gapiClientBooks.gapi.client.books

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadingPosition extends js.Object {
  /** Position in an EPUB as a CFI. */
  var epubCfiPosition: js.UndefOr[String] = js.undefined
  /** Position in a volume for image-based content. */
  var gbImagePosition: js.UndefOr[String] = js.undefined
  /** Position in a volume for text-based content. */
  var gbTextPosition: js.UndefOr[String] = js.undefined
  /** Resource type for a reading position. */
  var kind: js.UndefOr[String] = js.undefined
  /** Position in a PDF file. */
  var pdfPosition: js.UndefOr[String] = js.undefined
  /** Timestamp when this reading position was last updated (formatted UTC timestamp with millisecond resolution). */
  var updated: js.UndefOr[String] = js.undefined
  /** Volume id associated with this reading position. */
  var volumeId: js.UndefOr[String] = js.undefined
}

object ReadingPosition {
  @scala.inline
  def apply(
    epubCfiPosition: String = null,
    gbImagePosition: String = null,
    gbTextPosition: String = null,
    kind: String = null,
    pdfPosition: String = null,
    updated: String = null,
    volumeId: String = null
  ): ReadingPosition = {
    val __obj = js.Dynamic.literal()
    if (epubCfiPosition != null) __obj.updateDynamic("epubCfiPosition")(epubCfiPosition.asInstanceOf[js.Any])
    if (gbImagePosition != null) __obj.updateDynamic("gbImagePosition")(gbImagePosition.asInstanceOf[js.Any])
    if (gbTextPosition != null) __obj.updateDynamic("gbTextPosition")(gbTextPosition.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (pdfPosition != null) __obj.updateDynamic("pdfPosition")(pdfPosition.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (volumeId != null) __obj.updateDynamic("volumeId")(volumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadingPosition]
  }
}

