package typingsJapgolly.ejWebAll.ej.PdfViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerActionSettings extends js.Object {
  /** Specifies the name of the action method used for downloading the PDF document from the PDF viewer control.
    */
  var download: js.UndefOr[String] = js.undefined
  /** Specifies the name of the action method used for uploading the PDF document to the PDF viewer control.
    */
  var fileUpload: js.UndefOr[String] = js.undefined
  /** Specifies the name of the action method used for loading the PDF document.
    */
  var load: js.UndefOr[String] = js.undefined
  /** Specifies the name of the action method used for printing the PDF document in the PDF viewer control.
    */
  var print: js.UndefOr[String] = js.undefined
}

object ServerActionSettings {
  @scala.inline
  def apply(download: String = null, fileUpload: String = null, load: String = null, print: String = null): ServerActionSettings = {
    val __obj = js.Dynamic.literal()
    if (download != null) __obj.updateDynamic("download")(download.asInstanceOf[js.Any])
    if (fileUpload != null) __obj.updateDynamic("fileUpload")(fileUpload.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(load.asInstanceOf[js.Any])
    if (print != null) __obj.updateDynamic("print")(print.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerActionSettings]
  }
}

