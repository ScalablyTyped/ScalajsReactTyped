package typingsJapgolly.gapiClientStoragetransfer.gapi.client.storagetransfer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientStoragetransfer.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleServiceAccountsResource extends js.Object {
  /**
    * Returns the Google service account that is used by Storage Transfer
    * Service to access buckets in the project where transfers
    * run or in other projects. Each Google service account is associated
    * with one Google Cloud Platform Console project. Users
    * should add this service account to the Google Cloud Storage bucket
    * ACLs to grant access to Storage Transfer Service. This service
    * account is created and owned by Storage Transfer Service and can
    * only be used by Storage Transfer Service.
    */
  def get(request: AnonAccesstoken): Request_[GoogleServiceAccount]
}

object GoogleServiceAccountsResource {
  @scala.inline
  def apply(get: AnonAccesstoken => CallbackTo[Request_[GoogleServiceAccount]]): GoogleServiceAccountsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStoragetransfer.AnonAccesstoken) => get(t0).runNow()))
    __obj.asInstanceOf[GoogleServiceAccountsResource]
  }
}

