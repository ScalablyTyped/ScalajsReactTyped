package typingsJapgolly.gapiClientFitness.gapi.client.fitness

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientFitness.AnonDataTypeName
import typingsJapgolly.gapiClientFitness.AnonFields
import typingsJapgolly.gapiClientFitness.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourcesResource extends js.Object {
  var dataPointChanges: DataPointChangesResource
  var datasets: DatasetsResource
  /**
    * Creates a new data source that is unique across all data sources belonging to this user. The data stream ID field can be omitted and will be generated
    * by the server with the correct format. The data stream ID is an ordered combination of some fields from the data source. In addition to the data source
    * fields reflected into the data source ID, the developer project number that is authenticated when creating the data source is included. This developer
    * project number is obfuscated when read by any other developer reading public data types.
    */
  def create(request: AnonFields): Request_[DataSource]
  /** Deletes the specified data source. The request will fail if the data source contains any data points. */
  def delete(request: AnonKey): Request_[DataSource]
  /** Returns the specified data source. */
  def get(request: AnonKey): Request_[DataSource]
  /**
    * Lists all data sources that are visible to the developer, using the OAuth scopes provided. The list is not exhaustive; the user may have private data
    * sources that are only visible to other developers, or calls using other scopes.
    */
  def list(request: AnonDataTypeName): Request_[ListDataSourcesResponse]
  /**
    * Updates the specified data source. The dataStreamId, dataType, type, dataStreamName, and device properties with the exception of version, cannot be
    * modified.
    *
    * Data sources are identified by their dataStreamId. This method supports patch semantics.
    */
  def patch(request: AnonKey): Request_[DataSource]
  /**
    * Updates the specified data source. The dataStreamId, dataType, type, dataStreamName, and device properties with the exception of version, cannot be
    * modified.
    *
    * Data sources are identified by their dataStreamId.
    */
  def update(request: AnonKey): Request_[DataSource]
}

object DataSourcesResource {
  @scala.inline
  def apply(
    create: AnonFields => CallbackTo[Request_[DataSource]],
    dataPointChanges: DataPointChangesResource,
    datasets: DatasetsResource,
    delete: AnonKey => CallbackTo[Request_[DataSource]],
    get: AnonKey => CallbackTo[Request_[DataSource]],
    list: AnonDataTypeName => CallbackTo[Request_[ListDataSourcesResponse]],
    patch: AnonKey => CallbackTo[Request_[DataSource]],
    update: AnonKey => CallbackTo[Request_[DataSource]]
  ): DataSourcesResource = {
    val __obj = js.Dynamic.literal(dataPointChanges = dataPointChanges.asInstanceOf[js.Any], datasets = datasets.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFitness.AnonFields) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFitness.AnonKey) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFitness.AnonKey) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFitness.AnonDataTypeName) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFitness.AnonKey) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFitness.AnonKey) => update(t0).runNow()))
    __obj.asInstanceOf[DataSourcesResource]
  }
}

