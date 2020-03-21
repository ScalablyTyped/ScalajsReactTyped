package typingsJapgolly.firebaseFirestore.remoteRemoteSyncerMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firebaseFirestore.coreTypesMod.BatchId
import typingsJapgolly.firebaseFirestore.coreTypesMod.TargetId
import typingsJapgolly.firebaseFirestore.modelCollectionsMod.DocumentKeySet_
import typingsJapgolly.firebaseFirestore.modelMutationBatchMod.MutationBatchResult
import typingsJapgolly.firebaseFirestore.remoteRemoteEventMod.RemoteEvent
import typingsJapgolly.firebaseFirestore.utilErrorMod.FirestoreError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteSyncer extends js.Object {
  /**
    * Applies one remote event to the sync engine, notifying any views of the
    * changes, and releasing any pending mutation batches that would become
    * visible because of the snapshot version the remote event contains.
    */
  def applyRemoteEvent(remoteEvent: RemoteEvent): js.Promise[Unit]
  /**
    * Applies the result of a successful write of a mutation batch to the sync
    * engine, emitting snapshots in any views that the mutation applies to, and
    * removing the batch from the mutation queue.
    */
  def applySuccessfulWrite(result: MutationBatchResult): js.Promise[Unit]
  /**
    * Returns the set of remote document keys for the given target ID. This list
    * includes the documents that were assigned to the target when we received
    * the last snapshot.
    */
  def getRemoteKeysForTarget(targetId: TargetId): DocumentKeySet_
  /**
    * Rejects the batch, removing the batch from the mutation queue, recomputing
    * the local view of any documents affected by the batch and then, emitting
    * snapshots with the reverted value.
    */
  def rejectFailedWrite(batchId: BatchId, error: FirestoreError): js.Promise[Unit]
  /**
    * Rejects the listen for the given targetID. This can be triggered by the
    * backend for any active target.
    *
    * @param targetId The targetID corresponds to one previously initiated by the
    * user as part of TargetData passed to listen() on RemoteStore.
    * @param error A description of the condition that has forced the rejection.
    * Nearly always this will be an indication that the user is no longer
    * authorized to see the data matching the target.
    */
  def rejectListen(targetId: TargetId, error: FirestoreError): js.Promise[Unit]
}

object RemoteSyncer {
  @scala.inline
  def apply(
    applyRemoteEvent: RemoteEvent => CallbackTo[js.Promise[Unit]],
    applySuccessfulWrite: MutationBatchResult => CallbackTo[js.Promise[Unit]],
    getRemoteKeysForTarget: TargetId => CallbackTo[DocumentKeySet_],
    rejectFailedWrite: (BatchId, FirestoreError) => CallbackTo[js.Promise[Unit]],
    rejectListen: (TargetId, FirestoreError) => CallbackTo[js.Promise[Unit]]
  ): RemoteSyncer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("applyRemoteEvent")(js.Any.fromFunction1((t0: typingsJapgolly.firebaseFirestore.remoteRemoteEventMod.RemoteEvent) => applyRemoteEvent(t0).runNow()))
    __obj.updateDynamic("applySuccessfulWrite")(js.Any.fromFunction1((t0: typingsJapgolly.firebaseFirestore.modelMutationBatchMod.MutationBatchResult) => applySuccessfulWrite(t0).runNow()))
    __obj.updateDynamic("getRemoteKeysForTarget")(js.Any.fromFunction1((t0: typingsJapgolly.firebaseFirestore.coreTypesMod.TargetId) => getRemoteKeysForTarget(t0).runNow()))
    __obj.updateDynamic("rejectFailedWrite")(js.Any.fromFunction2((t0: typingsJapgolly.firebaseFirestore.coreTypesMod.BatchId, t1: typingsJapgolly.firebaseFirestore.utilErrorMod.FirestoreError) => rejectFailedWrite(t0, t1).runNow()))
    __obj.updateDynamic("rejectListen")(js.Any.fromFunction2((t0: typingsJapgolly.firebaseFirestore.coreTypesMod.TargetId, t1: typingsJapgolly.firebaseFirestore.utilErrorMod.FirestoreError) => rejectListen(t0, t1).runNow()))
    __obj.asInstanceOf[RemoteSyncer]
  }
}

