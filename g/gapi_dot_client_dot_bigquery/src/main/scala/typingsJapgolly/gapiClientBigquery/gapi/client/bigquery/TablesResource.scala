package typingsJapgolly.gapiClientBigquery.gapi.client.bigquery

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientBigquery.AnonDatasetId
import typingsJapgolly.gapiClientBigquery.AnonOauthtoken
import typingsJapgolly.gapiClientBigquery.AnonPrettyPrint
import typingsJapgolly.gapiClientBigquery.AnonProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TablesResource extends js.Object {
  /** Deletes the table specified by tableId from the dataset. If the table contains data, all the data will be deleted. */
  def delete(request: AnonOauthtoken): Request_[Unit]
  /**
    * Gets the specified table resource by table ID. This method does not return the data in the table, it only returns the table resource, which describes
    * the structure of this table.
    */
  def get(request: AnonPrettyPrint): Request_[Table]
  /** Creates a new, empty table in the dataset. */
  def insert(request: AnonDatasetId): Request_[Table]
  /** Lists all tables in the specified dataset. Requires the READER dataset role. */
  def list(request: AnonProjectId): Request_[TableList]
  /**
    * Updates information in an existing table. The update method replaces the entire table resource, whereas the patch method only replaces fields that are
    * provided in the submitted table resource. This method supports patch semantics.
    */
  def patch(request: AnonOauthtoken): Request_[Table]
  /**
    * Updates information in an existing table. The update method replaces the entire table resource, whereas the patch method only replaces fields that are
    * provided in the submitted table resource.
    */
  def update(request: AnonOauthtoken): Request_[Table]
}

object TablesResource {
  @scala.inline
  def apply(
    delete: AnonOauthtoken => CallbackTo[Request_[Unit]],
    get: AnonPrettyPrint => CallbackTo[Request_[Table]],
    insert: AnonDatasetId => CallbackTo[Request_[Table]],
    list: AnonProjectId => CallbackTo[Request_[TableList]],
    patch: AnonOauthtoken => CallbackTo[Request_[Table]],
    update: AnonOauthtoken => CallbackTo[Request_[Table]]
  ): TablesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBigquery.AnonOauthtoken) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBigquery.AnonPrettyPrint) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBigquery.AnonDatasetId) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBigquery.AnonProjectId) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBigquery.AnonOauthtoken) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBigquery.AnonOauthtoken) => update(t0).runNow()))
    __obj.asInstanceOf[TablesResource]
  }
}

