package typingsJapgolly.gapiClientMl.gapi.client.ml

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientMl.AnonAccesstoken
import typingsJapgolly.gapiClientMl.AnonAlt
import typingsJapgolly.gapiClientMl.AnonBearertoken
import typingsJapgolly.gapiClientMl.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobsResource extends js.Object {
  /** Cancels a running job. */
  def cancel(request: AnonAccesstoken): Request_[js.Object]
  /** Creates a training or a batch prediction job. */
  def create(request: AnonAlt): Request_[GoogleCloudMlV1Job]
  /** Describes a job. */
  def get(request: AnonAccesstoken): Request_[GoogleCloudMlV1Job]
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: AnonBearertoken): Request_[GoogleIamV1Policy]
  /** Lists the jobs in the project. */
  def list(request: AnonCallback): Request_[GoogleCloudMlV1ListJobsResponse]
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: AnonBearertoken): Request_[GoogleIamV1Policy]
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    *
    * Note: This operation is designed to be used for building permission-aware
    * UIs and command-line tools, not for authorization checking. This operation
    * may "fail open" without warning.
    */
  def testIamPermissions(request: AnonBearertoken): Request_[GoogleIamV1TestIamPermissionsResponse]
}

object JobsResource {
  @scala.inline
  def apply(
    cancel: AnonAccesstoken => CallbackTo[Request_[js.Object]],
    create: AnonAlt => CallbackTo[Request_[GoogleCloudMlV1Job]],
    get: AnonAccesstoken => CallbackTo[Request_[GoogleCloudMlV1Job]],
    getIamPolicy: AnonBearertoken => CallbackTo[Request_[GoogleIamV1Policy]],
    list: AnonCallback => CallbackTo[Request_[GoogleCloudMlV1ListJobsResponse]],
    setIamPolicy: AnonBearertoken => CallbackTo[Request_[GoogleIamV1Policy]],
    testIamPermissions: AnonBearertoken => CallbackTo[Request_[GoogleIamV1TestIamPermissionsResponse]]
  ): JobsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMl.AnonAccesstoken) => cancel(t0).runNow()))
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMl.AnonAlt) => create(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMl.AnonAccesstoken) => get(t0).runNow()))
    __obj.updateDynamic("getIamPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMl.AnonBearertoken) => getIamPolicy(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMl.AnonCallback) => list(t0).runNow()))
    __obj.updateDynamic("setIamPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMl.AnonBearertoken) => setIamPolicy(t0).runNow()))
    __obj.updateDynamic("testIamPermissions")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMl.AnonBearertoken) => testIamPermissions(t0).runNow()))
    __obj.asInstanceOf[JobsResource]
  }
}

