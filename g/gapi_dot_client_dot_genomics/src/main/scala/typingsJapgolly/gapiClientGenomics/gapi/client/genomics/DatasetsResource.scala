package typingsJapgolly.gapiClientGenomics.gapi.client.genomics

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGenomics.AnonAccesstoken
import typingsJapgolly.gapiClientGenomics.AnonDatasetId
import typingsJapgolly.gapiClientGenomics.AnonFields
import typingsJapgolly.gapiClientGenomics.AnonKey
import typingsJapgolly.gapiClientGenomics.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetsResource extends js.Object {
  /**
    * Creates a new dataset.
    *
    * For the definitions of datasets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def create(request: AnonAccesstoken): Request_[Dataset]
  /**
    * Deletes a dataset and all of its contents (all read group sets,
    * reference sets, variant sets, call sets, annotation sets, etc.)
    * This is reversible (up to one week after the deletion) via
    * the
    * datasets.undelete
    * operation.
    *
    * For the definitions of datasets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def delete(request: AnonDatasetId): Request_[js.Object]
  /**
    * Gets a dataset by ID.
    *
    * For the definitions of datasets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def get(request: AnonDatasetId): Request_[Dataset]
  /**
    * Gets the access control policy for the dataset. This is empty if the
    * policy or resource does not exist.
    *
    * See <a href="/iam/docs/managing-policies#getting_a_policy">Getting a
    * Policy</a> for more information.
    *
    * For the definitions of datasets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def getIamPolicy(request: AnonFields): Request_[Policy]
  /**
    * Lists datasets within a project.
    *
    * For the definitions of datasets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def list(request: AnonKey): Request_[ListDatasetsResponse]
  /**
    * Updates a dataset.
    *
    * For the definitions of datasets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * This method supports patch semantics.
    */
  def patch(request: AnonOauthtoken): Request_[Dataset]
  /**
    * Sets the access control policy on the specified dataset. Replaces any
    * existing policy.
    *
    * For the definitions of datasets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * See <a href="/iam/docs/managing-policies#setting_a_policy">Setting a
    * Policy</a> for more information.
    */
  def setIamPolicy(request: AnonFields): Request_[Policy]
  /**
    * Returns permissions that a caller has on the specified resource.
    * See <a href="/iam/docs/managing-policies#testing_permissions">Testing
    * Permissions</a> for more information.
    *
    * For the definitions of datasets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def testIamPermissions(request: AnonFields): Request_[TestIamPermissionsResponse]
  /**
    * Undeletes a dataset by restoring a dataset which was deleted via this API.
    *
    * For the definitions of datasets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * This operation is only possible for a week after the deletion occurred.
    */
  def undelete(request: AnonDatasetId): Request_[Dataset]
}

object DatasetsResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => CallbackTo[Request_[Dataset]],
    delete: AnonDatasetId => CallbackTo[Request_[js.Object]],
    get: AnonDatasetId => CallbackTo[Request_[Dataset]],
    getIamPolicy: AnonFields => CallbackTo[Request_[Policy]],
    list: AnonKey => CallbackTo[Request_[ListDatasetsResponse]],
    patch: AnonOauthtoken => CallbackTo[Request_[Dataset]],
    setIamPolicy: AnonFields => CallbackTo[Request_[Policy]],
    testIamPermissions: AnonFields => CallbackTo[Request_[TestIamPermissionsResponse]],
    undelete: AnonDatasetId => CallbackTo[Request_[Dataset]]
  ): DatasetsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGenomics.AnonAccesstoken) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGenomics.AnonDatasetId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGenomics.AnonDatasetId) => get(t0).runNow()))
    __obj.updateDynamic("getIamPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGenomics.AnonFields) => getIamPolicy(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGenomics.AnonKey) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGenomics.AnonOauthtoken) => patch(t0).runNow()))
    __obj.updateDynamic("setIamPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGenomics.AnonFields) => setIamPolicy(t0).runNow()))
    __obj.updateDynamic("testIamPermissions")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGenomics.AnonFields) => testIamPermissions(t0).runNow()))
    __obj.updateDynamic("undelete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGenomics.AnonDatasetId) => undelete(t0).runNow()))
    __obj.asInstanceOf[DatasetsResource]
  }
}

