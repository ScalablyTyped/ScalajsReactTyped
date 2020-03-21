package typingsJapgolly.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDeploymentmanager.AnonAlt
import typingsJapgolly.gapiClientDeploymentmanager.AnonCreatePolicy
import typingsJapgolly.gapiClientDeploymentmanager.AnonDeletePolicy
import typingsJapgolly.gapiClientDeploymentmanager.AnonFields
import typingsJapgolly.gapiClientDeploymentmanager.AnonFilter
import typingsJapgolly.gapiClientDeploymentmanager.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentsResource extends js.Object {
  /** Cancels and removes the preview currently associated with the deployment. */
  def cancelPreview(request: AnonAlt): Request_[Operation]
  /** Deletes a deployment and all of the resources in the deployment. */
  def delete(request: AnonDeletePolicy): Request_[Operation]
  /** Gets information about a specific deployment. */
  def get(request: AnonAlt): Request_[Deployment]
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(request: AnonFields): Request_[Policy]
  /** Creates a deployment and all of the resources described by the deployment manifest. */
  def insert(request: AnonOauthtoken): Request_[Operation]
  /** Lists all deployments for a given project. */
  def list(request: AnonFilter): Request_[DeploymentsListResponse]
  /** Updates a deployment and all of the resources described by the deployment manifest. This method supports patch semantics. */
  def patch(request: AnonCreatePolicy): Request_[Operation]
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: AnonFields): Request_[Policy]
  /** Stops an ongoing operation. This does not roll back any work that has already been completed, but prevents any new work from being started. */
  def stop(request: AnonAlt): Request_[Operation]
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: AnonFields): Request_[TestPermissionsResponse]
  /** Updates a deployment and all of the resources described by the deployment manifest. */
  def update(request: AnonCreatePolicy): Request_[Operation]
}

object DeploymentsResource {
  @scala.inline
  def apply(
    cancelPreview: AnonAlt => CallbackTo[Request_[Operation]],
    delete: AnonDeletePolicy => CallbackTo[Request_[Operation]],
    get: AnonAlt => CallbackTo[Request_[Deployment]],
    getIamPolicy: AnonFields => CallbackTo[Request_[Policy]],
    insert: AnonOauthtoken => CallbackTo[Request_[Operation]],
    list: AnonFilter => CallbackTo[Request_[DeploymentsListResponse]],
    patch: AnonCreatePolicy => CallbackTo[Request_[Operation]],
    setIamPolicy: AnonFields => CallbackTo[Request_[Policy]],
    stop: AnonAlt => CallbackTo[Request_[Operation]],
    testIamPermissions: AnonFields => CallbackTo[Request_[TestPermissionsResponse]],
    update: AnonCreatePolicy => CallbackTo[Request_[Operation]]
  ): DeploymentsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancelPreview")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDeploymentmanager.AnonAlt) => cancelPreview(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDeploymentmanager.AnonDeletePolicy) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDeploymentmanager.AnonAlt) => get(t0).runNow()))
    __obj.updateDynamic("getIamPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDeploymentmanager.AnonFields) => getIamPolicy(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDeploymentmanager.AnonOauthtoken) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDeploymentmanager.AnonFilter) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDeploymentmanager.AnonCreatePolicy) => patch(t0).runNow()))
    __obj.updateDynamic("setIamPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDeploymentmanager.AnonFields) => setIamPolicy(t0).runNow()))
    __obj.updateDynamic("stop")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDeploymentmanager.AnonAlt) => stop(t0).runNow()))
    __obj.updateDynamic("testIamPermissions")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDeploymentmanager.AnonFields) => testIamPermissions(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDeploymentmanager.AnonCreatePolicy) => update(t0).runNow()))
    __obj.asInstanceOf[DeploymentsResource]
  }
}

