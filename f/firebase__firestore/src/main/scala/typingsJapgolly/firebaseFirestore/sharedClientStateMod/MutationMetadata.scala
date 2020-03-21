package typingsJapgolly.firebaseFirestore.sharedClientStateMod

import typingsJapgolly.firebaseFirestore.errorMod.FirestoreError
import typingsJapgolly.firebaseFirestore.typesMod.BatchId
import typingsJapgolly.firebaseFirestore.typesMod.MutationBatchState
import typingsJapgolly.firebaseFirestore.userMod.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/local/shared_client_state", "MutationMetadata")
@js.native
class MutationMetadata protected () extends js.Object {
  def this(user: User, batchId: BatchId, state: MutationBatchState) = this()
  def this(user: User, batchId: BatchId, state: MutationBatchState, error: FirestoreError) = this()
  val batchId: BatchId = js.native
  val error: js.UndefOr[FirestoreError] = js.native
  val state: MutationBatchState = js.native
  val user: User = js.native
  def toWebStorageJSON(): String = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/lib/src/local/shared_client_state", "MutationMetadata")
@js.native
object MutationMetadata extends js.Object {
  /**
    * Parses a MutationMetadata from its JSON representation in WebStorage.
    * Logs a warning and returns null if the format of the data is not valid.
    */
  def fromWebStorageEntry(user: User, batchId: BatchId, value: String): MutationMetadata | Null = js.native
}

