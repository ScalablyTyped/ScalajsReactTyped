package typingsJapgolly.gapiClientBooks.gapi.client.books

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientBooks.AnonAltFields
import typingsJapgolly.gapiClientBooks.AnonFeatures
import typingsJapgolly.gapiClientBooks.AnonLicenseTypes
import typingsJapgolly.gapiClientBooks.AnonLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MyconfigResource extends js.Object {
  /** Gets the current settings for the user. */
  def getUserSettings(request: AnonAltFields): Request_[Usersettings]
  /** Release downloaded content access restriction. */
  def releaseDownloadAccess(request: AnonLocale): Request_[DownloadAccesses]
  /** Request concurrent and download access restrictions. */
  def requestAccess(request: AnonLicenseTypes): Request_[RequestAccess]
  /** Request downloaded content access for specified volumes on the My eBooks shelf. */
  def syncVolumeLicenses(request: AnonFeatures): Request_[Volumes]
  /**
    * Sets the settings for the user. If a sub-object is specified, it will overwrite the existing sub-object stored in the server. Unspecified sub-objects
    * will retain the existing value.
    */
  def updateUserSettings(request: AnonAltFields): Request_[Usersettings]
}

object MyconfigResource {
  @scala.inline
  def apply(
    getUserSettings: AnonAltFields => CallbackTo[Request_[Usersettings]],
    releaseDownloadAccess: AnonLocale => CallbackTo[Request_[DownloadAccesses]],
    requestAccess: AnonLicenseTypes => CallbackTo[Request_[RequestAccess]],
    syncVolumeLicenses: AnonFeatures => CallbackTo[Request_[Volumes]],
    updateUserSettings: AnonAltFields => CallbackTo[Request_[Usersettings]]
  ): MyconfigResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getUserSettings")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBooks.AnonAltFields) => getUserSettings(t0).runNow()))
    __obj.updateDynamic("releaseDownloadAccess")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBooks.AnonLocale) => releaseDownloadAccess(t0).runNow()))
    __obj.updateDynamic("requestAccess")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBooks.AnonLicenseTypes) => requestAccess(t0).runNow()))
    __obj.updateDynamic("syncVolumeLicenses")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBooks.AnonFeatures) => syncVolumeLicenses(t0).runNow()))
    __obj.updateDynamic("updateUserSettings")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBooks.AnonAltFields) => updateUserSettings(t0).runNow()))
    __obj.asInstanceOf[MyconfigResource]
  }
}

