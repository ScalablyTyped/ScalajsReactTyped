package typingsJapgolly.googleAppsScript.GoogleAppsScript.Base

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for objects that can export their data as a Blob.
  * Implementing classes
  *
  * NameBrief description
  *
  * AttachmentA Sites Attachment such as a file attached to a page.
  *
  * BlobA data interchange object for Apps Script services.
  *
  * ChartA Chart object, which can be converted to a static image.
  *
  * DocumentA document, containing rich text and elements such as tables and lists.
  *
  * EmbeddedChartRepresents a chart that has been embedded into a spreadsheet.
  *
  * FileA file in Google Drive.
  *
  * GmailAttachmentAn attachment from Gmail.
  *
  * HTTPResponseThis class allows users to access specific information on HTTP responses.
  *
  * HtmlOutputAn HtmlOutput object that can be served from a script.
  *
  * ImageA PageElement representing an image.
  *
  * InlineImageAn element representing an embedded image.
  *
  * JdbcBlobA JDBC Blob.
  *
  * JdbcClobA JDBC Clob.
  *
  * PictureFillA fill that renders an image that's stretched to the dimensions of its container.
  *
  * PositionedImageFixed position image anchored to a Paragraph.
  *
  * SpreadsheetAccess and modify Google Sheets files.
  *
  * StaticMapAllows for the creation and decoration of static map images.
  */
trait BlobSource extends js.Object {
  def getAs(contentType: String): Blob
  def getBlob(): Blob
}

object BlobSource {
  @scala.inline
  def apply(getAs: String => CallbackTo[Blob], getBlob: CallbackTo[Blob]): BlobSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAs")(js.Any.fromFunction1((t0: java.lang.String) => getAs(t0).runNow()))
    __obj.updateDynamic("getBlob")(getBlob.toJsFn)
    __obj.asInstanceOf[BlobSource]
  }
}

