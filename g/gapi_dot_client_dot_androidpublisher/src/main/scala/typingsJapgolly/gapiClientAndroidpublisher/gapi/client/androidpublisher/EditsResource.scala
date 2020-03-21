package typingsJapgolly.gapiClientAndroidpublisher.gapi.client.androidpublisher

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAndroidpublisher.AnonEditId
import typingsJapgolly.gapiClientAndroidpublisher.AnonPackageName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditsResource extends js.Object {
  var apklistings: ApklistingsResource
  var apks: ApksResource
  var deobfuscationfiles: DeobfuscationfilesResource
  var details: DetailsResource
  var expansionfiles: ExpansionfilesResource
  var images: ImagesResource
  var listings: ListingsResource
  var testers: TestersResource
  var tracks: TracksResource
  /** Commits/applies the changes made in this edit back to the app. */
  def commit(request: AnonEditId): Request_[AppEdit]
  /**
    * Deletes an edit for an app. Creating a new edit will automatically delete any of your previous edits so this method need only be called if you want to
    * preemptively abandon an edit.
    */
  def delete(request: AnonEditId): Request_[Unit]
  /** Returns information about the edit specified. Calls will fail if the edit is no long active (e.g. has been deleted, superseded or expired). */
  def get(request: AnonEditId): Request_[AppEdit]
  /** Creates a new edit for an app, populated with the app's current state. */
  def insert(request: AnonPackageName): Request_[AppEdit]
  /** Checks that the edit can be successfully committed. The edit's changes are not applied to the live app. */
  def validate(request: AnonEditId): Request_[AppEdit]
}

object EditsResource {
  @scala.inline
  def apply(
    apklistings: ApklistingsResource,
    apks: ApksResource,
    commit: AnonEditId => CallbackTo[Request_[AppEdit]],
    delete: AnonEditId => CallbackTo[Request_[Unit]],
    deobfuscationfiles: DeobfuscationfilesResource,
    details: DetailsResource,
    expansionfiles: ExpansionfilesResource,
    get: AnonEditId => CallbackTo[Request_[AppEdit]],
    images: ImagesResource,
    insert: AnonPackageName => CallbackTo[Request_[AppEdit]],
    listings: ListingsResource,
    testers: TestersResource,
    tracks: TracksResource,
    validate: AnonEditId => CallbackTo[Request_[AppEdit]]
  ): EditsResource = {
    val __obj = js.Dynamic.literal(apklistings = apklistings.asInstanceOf[js.Any], apks = apks.asInstanceOf[js.Any], deobfuscationfiles = deobfuscationfiles.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], expansionfiles = expansionfiles.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], listings = listings.asInstanceOf[js.Any], testers = testers.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any])
    __obj.updateDynamic("commit")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonEditId) => commit(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonEditId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonEditId) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonPackageName) => insert(t0).runNow()))
    __obj.updateDynamic("validate")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonEditId) => validate(t0).runNow()))
    __obj.asInstanceOf[EditsResource]
  }
}

