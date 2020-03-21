package typingsJapgolly.gapiClientServicemanagement.gapi.client.servicemanagement

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientServicemanagement.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumersResource extends js.Object {
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: AnonKey): Request_[Policy]
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: AnonKey): Request_[Policy]
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    *
    * Note: This operation is designed to be used for building permission-aware
    * UIs and command-line tools, not for authorization checking. This operation
    * may "fail open" without warning.
    */
  def testIamPermissions(request: AnonKey): Request_[TestIamPermissionsResponse]
}

object ConsumersResource {
  @scala.inline
  def apply(
    getIamPolicy: AnonKey => CallbackTo[Request_[Policy]],
    setIamPolicy: AnonKey => CallbackTo[Request_[Policy]],
    testIamPermissions: AnonKey => CallbackTo[Request_[TestIamPermissionsResponse]]
  ): ConsumersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getIamPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientServicemanagement.AnonKey) => getIamPolicy(t0).runNow()))
    __obj.updateDynamic("setIamPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientServicemanagement.AnonKey) => setIamPolicy(t0).runNow()))
    __obj.updateDynamic("testIamPermissions")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientServicemanagement.AnonKey) => testIamPermissions(t0).runNow()))
    __obj.asInstanceOf[ConsumersResource]
  }
}

