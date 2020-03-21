package typingsJapgolly.gapiClientAndroidpublisher.gapi.client.androidpublisher

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAndroidpublisher.AnonExpansionFileType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpansionfilesResource extends js.Object {
  /** Fetches the Expansion File configuration for the APK specified. */
  def get(request: AnonExpansionFileType): Request_[ExpansionFile]
  /**
    * Updates the APK's Expansion File configuration to reference another APK's Expansion Files. To add a new Expansion File use the Upload method. This
    * method supports patch semantics.
    */
  def patch(request: AnonExpansionFileType): Request_[ExpansionFile]
  /** Updates the APK's Expansion File configuration to reference another APK's Expansion Files. To add a new Expansion File use the Upload method. */
  def update(request: AnonExpansionFileType): Request_[ExpansionFile]
  /** Uploads and attaches a new Expansion File to the APK specified. */
  def upload(request: AnonExpansionFileType): Request_[ExpansionFilesUploadResponse]
}

object ExpansionfilesResource {
  @scala.inline
  def apply(
    get: AnonExpansionFileType => CallbackTo[Request_[ExpansionFile]],
    patch: AnonExpansionFileType => CallbackTo[Request_[ExpansionFile]],
    update: AnonExpansionFileType => CallbackTo[Request_[ExpansionFile]],
    upload: AnonExpansionFileType => CallbackTo[Request_[ExpansionFilesUploadResponse]]
  ): ExpansionfilesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonExpansionFileType) => get(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonExpansionFileType) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonExpansionFileType) => update(t0).runNow()))
    __obj.updateDynamic("upload")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonExpansionFileType) => upload(t0).runNow()))
    __obj.asInstanceOf[ExpansionfilesResource]
  }
}

