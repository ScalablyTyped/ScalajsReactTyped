package typingsJapgolly.gapiClientFirestore.gapi.client.firestore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientFirestore.AnonAccesstoken
import typingsJapgolly.gapiClientFirestore.AnonAlt
import typingsJapgolly.gapiClientFirestore.AnonBearertoken
import typingsJapgolly.gapiClientFirestore.AnonCallback
import typingsJapgolly.gapiClientFirestore.AnonCollectionId
import typingsJapgolly.gapiClientFirestore.AnonCurrentDocumentexists
import typingsJapgolly.gapiClientFirestore.AnonFields
import typingsJapgolly.gapiClientFirestore.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentsResource extends js.Object {
  /**
    * Gets multiple documents.
    *
    * Documents returned by this method are not guaranteed to be returned in the
    * same order that they were requested.
    */
  def batchGet(request: AnonAccesstoken): Request_[BatchGetDocumentsResponse]
  /** Starts a new transaction. */
  def beginTransaction(request: AnonAccesstoken): Request_[BeginTransactionResponse]
  /** Commits a transaction, while optionally updating documents. */
  def commit(request: AnonAccesstoken): Request_[CommitResponse]
  /** Creates a new document. */
  def createDocument(request: AnonAlt): Request_[Document]
  /** Deletes a document. */
  def delete(request: AnonBearertoken): Request_[js.Object]
  /** Gets a single document. */
  def get(request: AnonCallback): Request_[Document]
  /** Lists documents. */
  def list(request: AnonCollectionId): Request_[ListDocumentsResponse]
  /** Lists all the collection IDs underneath a document. */
  def listCollectionIds(request: AnonFields): Request_[ListCollectionIdsResponse]
  /** Listens to changes. */
  def listen(request: AnonAccesstoken): Request_[ListenResponse]
  /** Updates or inserts a document. */
  def patch(request: AnonCurrentDocumentexists): Request_[Document]
  /** Rolls back a transaction. */
  def rollback(request: AnonAccesstoken): Request_[js.Object]
  /** Runs a query. */
  def runQuery(request: AnonKey): Request_[RunQueryResponse]
  /** Streams batches of document updates and deletes, in order. */
  def write(request: AnonAccesstoken): Request_[WriteResponse]
}

object DocumentsResource {
  @scala.inline
  def apply(
    batchGet: AnonAccesstoken => CallbackTo[Request_[BatchGetDocumentsResponse]],
    beginTransaction: AnonAccesstoken => CallbackTo[Request_[BeginTransactionResponse]],
    commit: AnonAccesstoken => CallbackTo[Request_[CommitResponse]],
    createDocument: AnonAlt => CallbackTo[Request_[Document]],
    delete: AnonBearertoken => CallbackTo[Request_[js.Object]],
    get: AnonCallback => CallbackTo[Request_[Document]],
    list: AnonCollectionId => CallbackTo[Request_[ListDocumentsResponse]],
    listCollectionIds: AnonFields => CallbackTo[Request_[ListCollectionIdsResponse]],
    listen: AnonAccesstoken => CallbackTo[Request_[ListenResponse]],
    patch: AnonCurrentDocumentexists => CallbackTo[Request_[Document]],
    rollback: AnonAccesstoken => CallbackTo[Request_[js.Object]],
    runQuery: AnonKey => CallbackTo[Request_[RunQueryResponse]],
    write: AnonAccesstoken => CallbackTo[Request_[WriteResponse]]
  ): DocumentsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("batchGet")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFirestore.AnonAccesstoken) => batchGet(t0).runNow()))
    __obj.updateDynamic("beginTransaction")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFirestore.AnonAccesstoken) => beginTransaction(t0).runNow()))
    __obj.updateDynamic("commit")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFirestore.AnonAccesstoken) => commit(t0).runNow()))
    __obj.updateDynamic("createDocument")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFirestore.AnonAlt) => createDocument(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFirestore.AnonBearertoken) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFirestore.AnonCallback) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFirestore.AnonCollectionId) => list(t0).runNow()))
    __obj.updateDynamic("listCollectionIds")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFirestore.AnonFields) => listCollectionIds(t0).runNow()))
    __obj.updateDynamic("listen")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFirestore.AnonAccesstoken) => listen(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFirestore.AnonCurrentDocumentexists) => patch(t0).runNow()))
    __obj.updateDynamic("rollback")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFirestore.AnonAccesstoken) => rollback(t0).runNow()))
    __obj.updateDynamic("runQuery")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFirestore.AnonKey) => runQuery(t0).runNow()))
    __obj.updateDynamic("write")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFirestore.AnonAccesstoken) => write(t0).runNow()))
    __obj.asInstanceOf[DocumentsResource]
  }
}

