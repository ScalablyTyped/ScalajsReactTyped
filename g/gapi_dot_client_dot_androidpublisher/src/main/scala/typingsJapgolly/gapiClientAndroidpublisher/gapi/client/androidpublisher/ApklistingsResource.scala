package typingsJapgolly.gapiClientAndroidpublisher.gapi.client.androidpublisher

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAndroidpublisher.AnonAlt
import typingsJapgolly.gapiClientAndroidpublisher.AnonApkVersionCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApklistingsResource extends js.Object {
  /** Deletes the APK-specific localized listing for a specified APK and language code. */
  def delete(request: AnonAlt): Request_[Unit]
  /** Deletes all the APK-specific localized listings for a specified APK. */
  def deleteall(request: AnonApkVersionCode): Request_[Unit]
  /** Fetches the APK-specific localized listing for a specified APK and language code. */
  def get(request: AnonAlt): Request_[ApkListing]
  /** Lists all the APK-specific localized listings for a specified APK. */
  def list(request: AnonApkVersionCode): Request_[ApkListingsListResponse]
  /** Updates or creates the APK-specific localized listing for a specified APK and language code. This method supports patch semantics. */
  def patch(request: AnonAlt): Request_[ApkListing]
  /** Updates or creates the APK-specific localized listing for a specified APK and language code. */
  def update(request: AnonAlt): Request_[ApkListing]
}

object ApklistingsResource {
  @scala.inline
  def apply(
    delete: AnonAlt => CallbackTo[Request_[Unit]],
    deleteall: AnonApkVersionCode => CallbackTo[Request_[Unit]],
    get: AnonAlt => CallbackTo[Request_[ApkListing]],
    list: AnonApkVersionCode => CallbackTo[Request_[ApkListingsListResponse]],
    patch: AnonAlt => CallbackTo[Request_[ApkListing]],
    update: AnonAlt => CallbackTo[Request_[ApkListing]]
  ): ApklistingsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonAlt) => delete(t0).runNow()))
    __obj.updateDynamic("deleteall")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonApkVersionCode) => deleteall(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonAlt) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonApkVersionCode) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonAlt) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonAlt) => update(t0).runNow()))
    __obj.asInstanceOf[ApklistingsResource]
  }
}

