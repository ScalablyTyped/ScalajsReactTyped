package typingsJapgolly.gapiClientMl.gapi.client.ml

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientMl.AnonAccesstoken
import typingsJapgolly.gapiClientMl.AnonAlt
import typingsJapgolly.gapiClientMl.AnonBearertoken
import typingsJapgolly.gapiClientMl.AnonFields
import typingsJapgolly.gapiClientMl.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelsResource extends js.Object {
  var versions: VersionsResource
  /**
    * Creates a model which will later contain one or more versions.
    *
    * You must add at least one version before you can request predictions from
    * the model. Add versions by calling
    * [projects.models.versions.create](/ml-engine/reference/rest/v1/projects.models.versions/create).
    */
  def create(request: AnonAlt): Request_[GoogleCloudMlV1Model]
  /**
    * Deletes a model.
    *
    * You can only delete a model if there are no versions in it. You can delete
    * versions by calling
    * [projects.models.versions.delete](/ml-engine/reference/rest/v1/projects.models.versions/delete).
    */
  def delete(request: AnonAccesstoken): Request_[GoogleLongrunningOperation]
  /**
    * Gets information about a model, including its name, the description (if
    * set), and the default version (if at least one version of the model has
    * been deployed).
    */
  def get(request: AnonAccesstoken): Request_[GoogleCloudMlV1Model]
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: AnonBearertoken): Request_[GoogleIamV1Policy]
  /**
    * Lists the models in a project.
    *
    * Each project can contain multiple models, and each model can have multiple
    * versions.
    */
  def list(request: AnonFields): Request_[GoogleCloudMlV1ListModelsResponse]
  /**
    * Updates a specific model resource.
    *
    * Currently the only supported fields to update are `description` and
    * `default_version.name`.
    */
  def patch(request: AnonKey): Request_[GoogleLongrunningOperation]
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

object ModelsResource {
  @scala.inline
  def apply(
    create: AnonAlt => CallbackTo[Request_[GoogleCloudMlV1Model]],
    delete: AnonAccesstoken => CallbackTo[Request_[GoogleLongrunningOperation]],
    get: AnonAccesstoken => CallbackTo[Request_[GoogleCloudMlV1Model]],
    getIamPolicy: AnonBearertoken => CallbackTo[Request_[GoogleIamV1Policy]],
    list: AnonFields => CallbackTo[Request_[GoogleCloudMlV1ListModelsResponse]],
    patch: AnonKey => CallbackTo[Request_[GoogleLongrunningOperation]],
    setIamPolicy: AnonBearertoken => CallbackTo[Request_[GoogleIamV1Policy]],
    testIamPermissions: AnonBearertoken => CallbackTo[Request_[GoogleIamV1TestIamPermissionsResponse]],
    versions: VersionsResource
  ): ModelsResource = {
    val __obj = js.Dynamic.literal(versions = versions.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMl.AnonAlt) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMl.AnonAccesstoken) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMl.AnonAccesstoken) => get(t0).runNow()))
    __obj.updateDynamic("getIamPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMl.AnonBearertoken) => getIamPolicy(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMl.AnonFields) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMl.AnonKey) => patch(t0).runNow()))
    __obj.updateDynamic("setIamPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMl.AnonBearertoken) => setIamPolicy(t0).runNow()))
    __obj.updateDynamic("testIamPermissions")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMl.AnonBearertoken) => testIamPermissions(t0).runNow()))
    __obj.asInstanceOf[ModelsResource]
  }
}

