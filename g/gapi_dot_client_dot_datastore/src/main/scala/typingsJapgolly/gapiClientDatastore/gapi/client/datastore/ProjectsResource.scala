package typingsJapgolly.gapiClientDatastore.gapi.client.datastore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDatastore.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var operations: OperationsResource
  /**
    * Allocates IDs for the given keys, which is useful for referencing an entity
    * before it is inserted.
    */
  def allocateIds(request: AnonBearertoken): Request_[AllocateIdsResponse]
  /** Begins a new transaction. */
  def beginTransaction(request: AnonBearertoken): Request_[BeginTransactionResponse]
  /**
    * Commits a transaction, optionally creating, deleting or modifying some
    * entities.
    */
  def commit(request: AnonBearertoken): Request_[CommitResponse]
  /** Looks up entities by key. */
  def lookup(request: AnonBearertoken): Request_[LookupResponse]
  /** Rolls back a transaction. */
  def rollback(request: AnonBearertoken): Request_[js.Object]
  /** Queries for entities. */
  def runQuery(request: AnonBearertoken): Request_[RunQueryResponse]
}

object ProjectsResource {
  @scala.inline
  def apply(
    allocateIds: AnonBearertoken => CallbackTo[Request_[AllocateIdsResponse]],
    beginTransaction: AnonBearertoken => CallbackTo[Request_[BeginTransactionResponse]],
    commit: AnonBearertoken => CallbackTo[Request_[CommitResponse]],
    lookup: AnonBearertoken => CallbackTo[Request_[LookupResponse]],
    operations: OperationsResource,
    rollback: AnonBearertoken => CallbackTo[Request_[js.Object]],
    runQuery: AnonBearertoken => CallbackTo[Request_[RunQueryResponse]]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any])
    __obj.updateDynamic("allocateIds")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDatastore.AnonBearertoken) => allocateIds(t0).runNow()))
    __obj.updateDynamic("beginTransaction")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDatastore.AnonBearertoken) => beginTransaction(t0).runNow()))
    __obj.updateDynamic("commit")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDatastore.AnonBearertoken) => commit(t0).runNow()))
    __obj.updateDynamic("lookup")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDatastore.AnonBearertoken) => lookup(t0).runNow()))
    __obj.updateDynamic("rollback")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDatastore.AnonBearertoken) => rollback(t0).runNow()))
    __obj.updateDynamic("runQuery")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDatastore.AnonBearertoken) => runQuery(t0).runNow()))
    __obj.asInstanceOf[ProjectsResource]
  }
}

