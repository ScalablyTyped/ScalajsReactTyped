package typingsJapgolly.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 'Properties' object passed into the WL.fileDialog method.
  */
trait IFileDialogProperties extends js.Object {
  /**
    * The color pallette to use for the file picker. Specify "white",
    * "grey", or "transparent".
    * @default "white"
    */
  var lightbox: js.UndefOr[String] = js.undefined
  /**
    * Specifies the type of SkyDrive file picker to display. Specify "open"
    * to display the download version of the file picker. Specify "save"
    * to display the upload version of the file picker.
    */
  var mode: String
  /**
    * Specify only if the mode property is set to "open". Specifies how
    * many files the user can select to download. Specify "single" for a
    * single file. Specify "multi" for multiple files.
    * @default "single"
    */
  var select: js.UndefOr[String] = js.undefined
}

object IFileDialogProperties {
  @scala.inline
  def apply(mode: String, lightbox: String = null, select: String = null): IFileDialogProperties = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    if (lightbox != null) __obj.updateDynamic("lightbox")(lightbox.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileDialogProperties]
  }
}

