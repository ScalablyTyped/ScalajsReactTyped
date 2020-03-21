package typingsJapgolly.gapiClientBigquery.gapi.client.bigquery

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientBigquery.AnonFields
import typingsJapgolly.gapiClientBigquery.AnonMaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  /** Returns the email address of the service account for your project used for interactions with Google Cloud KMS. */
  def getServiceAccount(request: AnonFields): Request_[GetServiceAccountResponse]
  /** Lists all projects to which you have been granted any project role. */
  def list(request: AnonMaxResults): Request_[ProjectList]
}

object ProjectsResource {
  @scala.inline
  def apply(
    getServiceAccount: AnonFields => CallbackTo[Request_[GetServiceAccountResponse]],
    list: AnonMaxResults => CallbackTo[Request_[ProjectList]]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getServiceAccount")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBigquery.AnonFields) => getServiceAccount(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBigquery.AnonMaxResults) => list(t0).runNow()))
    __obj.asInstanceOf[ProjectsResource]
  }
}

