package typingsJapgolly.gapiClientBigquery.gapi.client.bigquery

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientBigquery.AnonAll
import typingsJapgolly.gapiClientBigquery.AnonAlt
import typingsJapgolly.gapiClientBigquery.AnonDatasetId
import typingsJapgolly.gapiClientBigquery.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetsResource extends js.Object {
  /**
    * Deletes the dataset specified by the datasetId value. Before you can delete a dataset, you must delete all its tables, either manually or by specifying
    * deleteContents. Immediately after deletion, you can create another dataset with the same name.
    */
  def delete(request: AnonAlt): Request_[Unit]
  /** Returns the dataset specified by datasetID. */
  def get(request: AnonDatasetId): Request_[Dataset]
  /** Creates a new empty dataset. */
  def insert(request: AnonFields): Request_[Dataset]
  /** Lists all datasets in the specified project to which you have been granted the READER dataset role. */
  def list(request: AnonAll): Request_[DatasetList]
  /**
    * Updates information in an existing dataset. The update method replaces the entire dataset resource, whereas the patch method only replaces fields that
    * are provided in the submitted dataset resource. This method supports patch semantics.
    */
  def patch(request: AnonDatasetId): Request_[Dataset]
  /**
    * Updates information in an existing dataset. The update method replaces the entire dataset resource, whereas the patch method only replaces fields that
    * are provided in the submitted dataset resource.
    */
  def update(request: AnonDatasetId): Request_[Dataset]
}

object DatasetsResource {
  @scala.inline
  def apply(
    delete: AnonAlt => CallbackTo[Request_[Unit]],
    get: AnonDatasetId => CallbackTo[Request_[Dataset]],
    insert: AnonFields => CallbackTo[Request_[Dataset]],
    list: AnonAll => CallbackTo[Request_[DatasetList]],
    patch: AnonDatasetId => CallbackTo[Request_[Dataset]],
    update: AnonDatasetId => CallbackTo[Request_[Dataset]]
  ): DatasetsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBigquery.AnonAlt) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBigquery.AnonDatasetId) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBigquery.AnonFields) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBigquery.AnonAll) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBigquery.AnonDatasetId) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBigquery.AnonDatasetId) => update(t0).runNow()))
    __obj.asInstanceOf[DatasetsResource]
  }
}

