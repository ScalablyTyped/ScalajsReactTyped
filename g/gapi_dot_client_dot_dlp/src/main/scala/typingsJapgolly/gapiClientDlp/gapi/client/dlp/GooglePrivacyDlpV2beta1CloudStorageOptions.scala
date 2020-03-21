package typingsJapgolly.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1CloudStorageOptions extends js.Object {
  var fileSet: js.UndefOr[GooglePrivacyDlpV2beta1FileSet] = js.undefined
}

object GooglePrivacyDlpV2beta1CloudStorageOptions {
  @scala.inline
  def apply(fileSet: GooglePrivacyDlpV2beta1FileSet = null): GooglePrivacyDlpV2beta1CloudStorageOptions = {
    val __obj = js.Dynamic.literal()
    if (fileSet != null) __obj.updateDynamic("fileSet")(fileSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1CloudStorageOptions]
  }
}

