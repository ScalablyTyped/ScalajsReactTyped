package typingsJapgolly.googleCloudDatastore.transactionMod

import typingsJapgolly.googleCloudDatastore.mod.^
import typingsJapgolly.googleCloudDatastore.queryMod.Query
import typingsJapgolly.googleCloudDatastore.requestMod.CommitCallback
import typingsJapgolly.googleCloudDatastore.requestMod.CommitResult
import typingsJapgolly.googleCloudDatastore.requestMod.DatastoreRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/datastore/transaction", "DatastoreTransaction")
@js.native
class DatastoreTransaction protected () extends DatastoreRequest {
  def this(datastore: ^) = this()
  def commit(): js.Promise[CommitResult] = js.native
  def commit(callback: CommitCallback): Unit = js.native
  def createQuery(kind: String): Query = js.native
  // tslint:disable-next-line unified-signatures (Arg is semantically different)
  def createQuery(namespace: String, kind: String): Query = js.native
  def rollback(): js.Promise[RollbackResult] = js.native
  def rollback(callback: RollbackCallback): Unit = js.native
  def run(): js.Promise[TransactionResult] = js.native
  def run(callback: TransactionCallback): Unit = js.native
}

