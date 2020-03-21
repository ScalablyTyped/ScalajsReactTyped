package typingsJapgolly.gapiClientPubsub.gapi.client.pubsub

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientPubsub.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotsResource extends js.Object {
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: AnonAccesstoken): Request_[Policy]
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: AnonAccesstoken): Request_[Policy]
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    *
    * Note: This operation is designed to be used for building permission-aware
    * UIs and command-line tools, not for authorization checking. This operation
    * may "fail open" without warning.
    */
  def testIamPermissions(request: AnonAccesstoken): Request_[TestIamPermissionsResponse]
}

object SnapshotsResource {
  @scala.inline
  def apply(
    getIamPolicy: AnonAccesstoken => CallbackTo[Request_[Policy]],
    setIamPolicy: AnonAccesstoken => CallbackTo[Request_[Policy]],
    testIamPermissions: AnonAccesstoken => CallbackTo[Request_[TestIamPermissionsResponse]]
  ): SnapshotsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getIamPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPubsub.AnonAccesstoken) => getIamPolicy(t0).runNow()))
    __obj.updateDynamic("setIamPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPubsub.AnonAccesstoken) => setIamPolicy(t0).runNow()))
    __obj.updateDynamic("testIamPermissions")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPubsub.AnonAccesstoken) => testIamPermissions(t0).runNow()))
    __obj.asInstanceOf[SnapshotsResource]
  }
}

