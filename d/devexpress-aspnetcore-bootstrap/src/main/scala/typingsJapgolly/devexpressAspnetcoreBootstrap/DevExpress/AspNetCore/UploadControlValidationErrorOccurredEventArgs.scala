package typingsJapgolly.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadControlValidationErrorOccurredEventArgs extends EventArgs {
  var errorText: String
  val invalidFiles: js.Array[BootstrapUploadControlInvalidFileInfo]
  var showAlert: Boolean
  val validationSettings: BootstrapUploadControlValidationSettings
}

object UploadControlValidationErrorOccurredEventArgs {
  @scala.inline
  def apply(
    errorText: String,
    invalidFiles: js.Array[BootstrapUploadControlInvalidFileInfo],
    sender: Control,
    showAlert: Boolean,
    validationSettings: BootstrapUploadControlValidationSettings
  ): UploadControlValidationErrorOccurredEventArgs = {
    val __obj = js.Dynamic.literal(errorText = errorText.asInstanceOf[js.Any], invalidFiles = invalidFiles.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], showAlert = showAlert.asInstanceOf[js.Any], validationSettings = validationSettings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UploadControlValidationErrorOccurredEventArgs]
  }
}

