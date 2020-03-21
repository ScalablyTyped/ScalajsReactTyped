package typingsJapgolly.gapiClientAndroidpublisher.gapi.client.androidpublisher

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAndroidpublisher.AnonDeobfuscationFileType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeobfuscationfilesResource extends js.Object {
  /** Uploads the deobfuscation file of the specified APK. If a deobfuscation file already exists, it will be replaced. */
  def upload(request: AnonDeobfuscationFileType): Request_[DeobfuscationFilesUploadResponse]
}

object DeobfuscationfilesResource {
  @scala.inline
  def apply(upload: AnonDeobfuscationFileType => CallbackTo[Request_[DeobfuscationFilesUploadResponse]]): DeobfuscationfilesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("upload")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonDeobfuscationFileType) => upload(t0).runNow()))
    __obj.asInstanceOf[DeobfuscationfilesResource]
  }
}

