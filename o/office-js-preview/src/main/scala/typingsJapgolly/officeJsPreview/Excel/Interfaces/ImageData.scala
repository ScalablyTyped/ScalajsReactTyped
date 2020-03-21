package typingsJapgolly.officeJsPreview.Excel.Interfaces

import typingsJapgolly.officeJsPreview.Excel.PictureFormat
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.BMP
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.GIF
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.JPEG
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.PNG
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.SVG
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.UNKNOWN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `image.toJSON()`. */
trait ImageData extends js.Object {
  /**
    *
    * Returns the format of the image. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var format: js.UndefOr[PictureFormat | UNKNOWN | BMP | JPEG | GIF | PNG | SVG] = js.undefined
  /**
    *
    * Represents the shape identifier for the image object. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var id: js.UndefOr[String] = js.undefined
}

object ImageData {
  @scala.inline
  def apply(format: PictureFormat | UNKNOWN | BMP | JPEG | GIF | PNG | SVG = null, id: String = null): ImageData = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageData]
  }
}

