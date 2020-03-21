package typingsJapgolly.gapiClientAndroidpublisher.gapi.client.androidpublisher

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAndroidpublisher.AnonEditId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApksResource extends js.Object {
  /**
    * Creates a new APK without uploading the APK itself to Google Play, instead hosting the APK at a specified URL. This function is only available to
    * enterprises using Google Play for Work whose application is configured to restrict distribution to the enterprise domain.
    */
  def addexternallyhosted(request: AnonEditId): Request_[ApksAddExternallyHostedResponse]
  def list(request: AnonEditId): Request_[ApksListResponse]
  def upload(request: AnonEditId): Request_[Apk]
}

object ApksResource {
  @scala.inline
  def apply(
    addexternallyhosted: AnonEditId => CallbackTo[Request_[ApksAddExternallyHostedResponse]],
    list: AnonEditId => CallbackTo[Request_[ApksListResponse]],
    upload: AnonEditId => CallbackTo[Request_[Apk]]
  ): ApksResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addexternallyhosted")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonEditId) => addexternallyhosted(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonEditId) => list(t0).runNow()))
    __obj.updateDynamic("upload")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonEditId) => upload(t0).runNow()))
    __obj.asInstanceOf[ApksResource]
  }
}

