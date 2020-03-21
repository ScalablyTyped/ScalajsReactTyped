package typingsJapgolly.gapiClientSpanner.gapi.client.spanner

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientSpanner.AnonAccesstoken
import typingsJapgolly.gapiClientSpanner.AnonCallback
import typingsJapgolly.gapiClientSpanner.AnonDatabase
import typingsJapgolly.gapiClientSpanner.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionsResource extends js.Object {
  /**
    * Begins a new transaction. This step can often be skipped:
    * Read, ExecuteSql and
    * Commit can begin a new transaction as a
    * side-effect.
    */
  def beginTransaction(request: AnonCallback): Request_[Transaction]
  /**
    * Commits a transaction. The request includes the mutations to be
    * applied to rows in the database.
    *
    * `Commit` might return an `ABORTED` error. This can occur at any time;
    * commonly, the cause is conflicts with concurrent
    * transactions. However, it can also happen for a variety of other
    * reasons. If `Commit` returns `ABORTED`, the caller should re-attempt
    * the transaction from the beginning, re-using the same session.
    */
  def commit(request: AnonCallback): Request_[CommitResponse]
  /**
    * Creates a new session. A session can be used to perform
    * transactions that read and/or modify data in a Cloud Spanner database.
    * Sessions are meant to be reused for many consecutive
    * transactions.
    *
    * Sessions can only execute one transaction at a time. To execute
    * multiple concurrent read-write/write-only transactions, create
    * multiple sessions. Note that standalone reads and queries use a
    * transaction internally, and count toward the one transaction
    * limit.
    *
    * Cloud Spanner limits the number of sessions that can exist at any given
    * time; thus, it is a good idea to delete idle and/or unneeded sessions.
    * Aside from explicit deletes, Cloud Spanner can delete sessions for which no
    * operations are sent for more than an hour. If a session is deleted,
    * requests to it return `NOT_FOUND`.
    *
    * Idle sessions can be kept alive by sending a trivial SQL query
    * periodically, e.g., `"SELECT 1"`.
    */
  def create(request: AnonDatabase): Request_[Session]
  /** Ends a session, releasing server resources associated with it. */
  def delete(request: AnonAccesstoken): Request_[js.Object]
  /**
    * Executes an SQL query, returning all rows in a single reply. This
    * method cannot be used to return a result set larger than 10 MiB;
    * if the query yields more data than that, the query fails with
    * a `FAILED_PRECONDITION` error.
    *
    * Queries inside read-write transactions might return `ABORTED`. If
    * this occurs, the application should restart the transaction from
    * the beginning. See Transaction for more details.
    *
    * Larger result sets can be fetched in streaming fashion by calling
    * ExecuteStreamingSql instead.
    */
  def executeSql(request: AnonCallback): Request_[ResultSet]
  /**
    * Like ExecuteSql, except returns the result
    * set as a stream. Unlike ExecuteSql, there
    * is no limit on the size of the returned result set. However, no
    * individual row in the result set can exceed 100 MiB, and no
    * column value can exceed 10 MiB.
    */
  def executeStreamingSql(request: AnonCallback): Request_[PartialResultSet]
  /**
    * Gets a session. Returns `NOT_FOUND` if the session does not exist.
    * This is mainly useful for determining whether a session is still
    * alive.
    */
  def get(request: AnonAccesstoken): Request_[Session]
  /** Lists all sessions in a given database. */
  def list(request: AnonFields): Request_[ListSessionsResponse]
  /**
    * Reads rows from the database using key lookups and scans, as a
    * simple key/value style alternative to
    * ExecuteSql.  This method cannot be used to
    * return a result set larger than 10 MiB; if the read matches more
    * data than that, the read fails with a `FAILED_PRECONDITION`
    * error.
    *
    * Reads inside read-write transactions might return `ABORTED`. If
    * this occurs, the application should restart the transaction from
    * the beginning. See Transaction for more details.
    *
    * Larger result sets can be yielded in streaming fashion by calling
    * StreamingRead instead.
    */
  def read(request: AnonCallback): Request_[ResultSet]
  /**
    * Rolls back a transaction, releasing any locks it holds. It is a good
    * idea to call this for any transaction that includes one or more
    * Read or ExecuteSql requests and
    * ultimately decides not to commit.
    *
    * `Rollback` returns `OK` if it successfully aborts the transaction, the
    * transaction was already aborted, or the transaction is not
    * found. `Rollback` never returns `ABORTED`.
    */
  def rollback(request: AnonCallback): Request_[js.Object]
  /**
    * Like Read, except returns the result set as a
    * stream. Unlike Read, there is no limit on the
    * size of the returned result set. However, no individual row in
    * the result set can exceed 100 MiB, and no column value can exceed
    * 10 MiB.
    */
  def streamingRead(request: AnonCallback): Request_[PartialResultSet]
}

object SessionsResource {
  @scala.inline
  def apply(
    beginTransaction: AnonCallback => CallbackTo[Request_[Transaction]],
    commit: AnonCallback => CallbackTo[Request_[CommitResponse]],
    create: AnonDatabase => CallbackTo[Request_[Session]],
    delete: AnonAccesstoken => CallbackTo[Request_[js.Object]],
    executeSql: AnonCallback => CallbackTo[Request_[ResultSet]],
    executeStreamingSql: AnonCallback => CallbackTo[Request_[PartialResultSet]],
    get: AnonAccesstoken => CallbackTo[Request_[Session]],
    list: AnonFields => CallbackTo[Request_[ListSessionsResponse]],
    read: AnonCallback => CallbackTo[Request_[ResultSet]],
    rollback: AnonCallback => CallbackTo[Request_[js.Object]],
    streamingRead: AnonCallback => CallbackTo[Request_[PartialResultSet]]
  ): SessionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("beginTransaction")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSpanner.AnonCallback) => beginTransaction(t0).runNow()))
    __obj.updateDynamic("commit")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSpanner.AnonCallback) => commit(t0).runNow()))
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSpanner.AnonDatabase) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSpanner.AnonAccesstoken) => delete(t0).runNow()))
    __obj.updateDynamic("executeSql")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSpanner.AnonCallback) => executeSql(t0).runNow()))
    __obj.updateDynamic("executeStreamingSql")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSpanner.AnonCallback) => executeStreamingSql(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSpanner.AnonAccesstoken) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSpanner.AnonFields) => list(t0).runNow()))
    __obj.updateDynamic("read")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSpanner.AnonCallback) => read(t0).runNow()))
    __obj.updateDynamic("rollback")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSpanner.AnonCallback) => rollback(t0).runNow()))
    __obj.updateDynamic("streamingRead")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSpanner.AnonCallback) => streamingRead(t0).runNow()))
    __obj.asInstanceOf[SessionsResource]
  }
}

