package typingsJapgolly.gapiDrive.gapi.client.drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyParameters extends js.Object {
  var convert: js.UndefOr[Boolean] = js.undefined
  var fileId: String
  var ocr: js.UndefOr[Boolean] = js.undefined
  var ocrLanguage: js.UndefOr[String] = js.undefined
  var pinned: js.UndefOr[Boolean] = js.undefined
  var resource: js.UndefOr[FileResource] = js.undefined
  var supportsTeamDrives: js.UndefOr[Boolean] = js.undefined
  var timedTextLanguage: js.UndefOr[String] = js.undefined
  var timedTextTrackName: js.UndefOr[String] = js.undefined
  var visibility: js.UndefOr[String] = js.undefined
}

object CopyParameters {
  @scala.inline
  def apply(
    fileId: String,
    convert: js.UndefOr[Boolean] = js.undefined,
    ocr: js.UndefOr[Boolean] = js.undefined,
    ocrLanguage: String = null,
    pinned: js.UndefOr[Boolean] = js.undefined,
    resource: FileResource = null,
    supportsTeamDrives: js.UndefOr[Boolean] = js.undefined,
    timedTextLanguage: String = null,
    timedTextTrackName: String = null,
    visibility: String = null
  ): CopyParameters = {
    val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any])
    if (!js.isUndefined(convert)) __obj.updateDynamic("convert")(convert.asInstanceOf[js.Any])
    if (!js.isUndefined(ocr)) __obj.updateDynamic("ocr")(ocr.asInstanceOf[js.Any])
    if (ocrLanguage != null) __obj.updateDynamic("ocrLanguage")(ocrLanguage.asInstanceOf[js.Any])
    if (!js.isUndefined(pinned)) __obj.updateDynamic("pinned")(pinned.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsTeamDrives)) __obj.updateDynamic("supportsTeamDrives")(supportsTeamDrives.asInstanceOf[js.Any])
    if (timedTextLanguage != null) __obj.updateDynamic("timedTextLanguage")(timedTextLanguage.asInstanceOf[js.Any])
    if (timedTextTrackName != null) __obj.updateDynamic("timedTextTrackName")(timedTextTrackName.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyParameters]
  }
}

