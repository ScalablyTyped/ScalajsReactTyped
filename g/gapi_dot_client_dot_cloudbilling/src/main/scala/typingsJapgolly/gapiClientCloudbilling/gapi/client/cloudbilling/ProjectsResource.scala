package typingsJapgolly.gapiClientCloudbilling.gapi.client.cloudbilling

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCloudbilling.AnonAccesstoken
import typingsJapgolly.gapiClientCloudbilling.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  /**
    * Gets the billing information for a project. The current authenticated user
    * must have [permission to view the
    * project](https://cloud.google.com/docs/permissions-overview#h.bgs0oxofvnoo
    * ).
    */
  def getBillingInfo(request: AnonAlt): Request_[ProjectBillingInfo]
  /**
    * Lists the projects associated with a billing account. The current
    * authenticated user must be an [owner of the billing
    * account](https://support.google.com/cloud/answer/4430947).
    */
  def list(request: AnonAccesstoken): Request_[ListProjectBillingInfoResponse]
  /**
    * Sets or updates the billing account associated with a project. You specify
    * the new billing account by setting the `billing_account_name` in the
    * `ProjectBillingInfo` resource to the resource name of a billing account.
    * Associating a project with an open billing account enables billing on the
    * project and allows charges for resource usage. If the project already had a
    * billing account, this method changes the billing account used for resource
    * usage charges.
    *
    * &#42;Note:&#42; Incurred charges that have not yet been reported in the transaction
    * history of the Google Cloud Console may be billed to the new billing
    * account, even if the charge occurred before the new billing account was
    * assigned to the project.
    *
    * The current authenticated user must have ownership privileges for both the
    * [project](https://cloud.google.com/docs/permissions-overview#h.bgs0oxofvnoo
    * ) and the [billing
    * account](https://support.google.com/cloud/answer/4430947).
    *
    * You can disable billing on the project by setting the
    * `billing_account_name` field to empty. This action disassociates the
    * current billing account from the project. Any billable activity of your
    * in-use services will stop, and your application could stop functioning as
    * expected. Any unbilled charges to date will be billed to the previously
    * associated account. The current authenticated user must be either an owner
    * of the project or an owner of the billing account for the project.
    *
    * Note that associating a project with a &#42;closed&#42; billing account will have
    * much the same effect as disabling billing on the project: any paid
    * resources used by the project will be shut down. Thus, unless you wish to
    * disable billing, you should always call this method with the name of an
    * &#42;open&#42; billing account.
    */
  def updateBillingInfo(request: AnonAlt): Request_[ProjectBillingInfo]
}

object ProjectsResource {
  @scala.inline
  def apply(
    getBillingInfo: AnonAlt => CallbackTo[Request_[ProjectBillingInfo]],
    list: AnonAccesstoken => CallbackTo[Request_[ListProjectBillingInfoResponse]],
    updateBillingInfo: AnonAlt => CallbackTo[Request_[ProjectBillingInfo]]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getBillingInfo")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudbilling.AnonAlt) => getBillingInfo(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudbilling.AnonAccesstoken) => list(t0).runNow()))
    __obj.updateDynamic("updateBillingInfo")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudbilling.AnonAlt) => updateBillingInfo(t0).runNow()))
    __obj.asInstanceOf[ProjectsResource]
  }
}

