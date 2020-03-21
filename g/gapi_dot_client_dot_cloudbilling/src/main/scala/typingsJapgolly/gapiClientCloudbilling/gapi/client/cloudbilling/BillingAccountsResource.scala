package typingsJapgolly.gapiClientCloudbilling.gapi.client.cloudbilling

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCloudbilling.AnonAlt
import typingsJapgolly.gapiClientCloudbilling.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BillingAccountsResource extends js.Object {
  var projects: ProjectsResource
  /**
    * Gets information about a billing account. The current authenticated user
    * must be an [owner of the billing
    * account](https://support.google.com/cloud/answer/4430947).
    */
  def get(request: AnonAlt): Request_[BillingAccount]
  /**
    * Lists the billing accounts that the current authenticated user
    * [owns](https://support.google.com/cloud/answer/4430947).
    */
  def list(request: AnonBearertoken): Request_[ListBillingAccountsResponse]
}

object BillingAccountsResource {
  @scala.inline
  def apply(
    get: AnonAlt => CallbackTo[Request_[BillingAccount]],
    list: AnonBearertoken => CallbackTo[Request_[ListBillingAccountsResponse]],
    projects: ProjectsResource
  ): BillingAccountsResource = {
    val __obj = js.Dynamic.literal(projects = projects.asInstanceOf[js.Any])
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudbilling.AnonAlt) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudbilling.AnonBearertoken) => list(t0).runNow()))
    __obj.asInstanceOf[BillingAccountsResource]
  }
}

