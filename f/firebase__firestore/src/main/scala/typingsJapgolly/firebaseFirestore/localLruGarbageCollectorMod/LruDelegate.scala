package typingsJapgolly.firebaseFirestore.localLruGarbageCollectorMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firebaseFirestore.coreTypesMod.ListenSequenceNumber
import typingsJapgolly.firebaseFirestore.localPersistenceMod.PersistenceTransaction
import typingsJapgolly.firebaseFirestore.localPersistencePromiseMod.PersistencePromise
import typingsJapgolly.firebaseFirestore.localTargetDataMod.TargetData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LruDelegate extends js.Object {
  val garbageCollector: LruGarbageCollector
  /**
    * Enumerates sequence numbers for documents not associated with a target.
    * Note that this may include duplicate sequence numbers.
    */
  def forEachOrphanedDocumentSequenceNumber(txn: PersistenceTransaction, f: js.Function1[/* sequenceNumber */ ListenSequenceNumber, Unit]): PersistencePromise[Unit]
  /** Enumerates all the targets in the TargetCache. */
  def forEachTarget(txn: PersistenceTransaction, f: js.Function1[/* target */ TargetData, Unit]): PersistencePromise[Unit]
  def getCacheSize(txn: PersistenceTransaction): PersistencePromise[Double]
  def getSequenceNumberCount(txn: PersistenceTransaction): PersistencePromise[Double]
  /**
    * Removes all unreferenced documents from the cache that have a sequence number less than or
    * equal to the given `upperBound`.
    *
    * @return the number of documents removed.
    */
  def removeOrphanedDocuments(txn: PersistenceTransaction, upperBound: ListenSequenceNumber): PersistencePromise[Double]
  /**
    * Removes all targets that have a sequence number less than or equal to `upperBound`, and are not
    * present in the `activeTargetIds` set.
    *
    * @return the number of targets removed.
    */
  def removeTargets(txn: PersistenceTransaction, upperBound: ListenSequenceNumber, activeTargetIds: ActiveTargets): PersistencePromise[Double]
}

object LruDelegate {
  @scala.inline
  def apply(
    forEachOrphanedDocumentSequenceNumber: (PersistenceTransaction, js.Function1[/* sequenceNumber */ ListenSequenceNumber, Unit]) => CallbackTo[PersistencePromise[Unit]],
    forEachTarget: (PersistenceTransaction, js.Function1[/* target */ TargetData, Unit]) => CallbackTo[PersistencePromise[Unit]],
    garbageCollector: LruGarbageCollector,
    getCacheSize: PersistenceTransaction => CallbackTo[PersistencePromise[Double]],
    getSequenceNumberCount: PersistenceTransaction => CallbackTo[PersistencePromise[Double]],
    removeOrphanedDocuments: (PersistenceTransaction, ListenSequenceNumber) => CallbackTo[PersistencePromise[Double]],
    removeTargets: (PersistenceTransaction, ListenSequenceNumber, ActiveTargets) => CallbackTo[PersistencePromise[Double]]
  ): LruDelegate = {
    val __obj = js.Dynamic.literal(garbageCollector = garbageCollector.asInstanceOf[js.Any])
    __obj.updateDynamic("forEachOrphanedDocumentSequenceNumber")(js.Any.fromFunction2((t0: typingsJapgolly.firebaseFirestore.localPersistenceMod.PersistenceTransaction, t1: js.Function1[
  /* sequenceNumber */ typingsJapgolly.firebaseFirestore.coreTypesMod.ListenSequenceNumber, 
  scala.Unit]) => forEachOrphanedDocumentSequenceNumber(t0, t1).runNow()))
    __obj.updateDynamic("forEachTarget")(js.Any.fromFunction2((t0: typingsJapgolly.firebaseFirestore.localPersistenceMod.PersistenceTransaction, t1: js.Function1[
  /* target */ typingsJapgolly.firebaseFirestore.localTargetDataMod.TargetData, 
  scala.Unit]) => forEachTarget(t0, t1).runNow()))
    __obj.updateDynamic("getCacheSize")(js.Any.fromFunction1((t0: typingsJapgolly.firebaseFirestore.localPersistenceMod.PersistenceTransaction) => getCacheSize(t0).runNow()))
    __obj.updateDynamic("getSequenceNumberCount")(js.Any.fromFunction1((t0: typingsJapgolly.firebaseFirestore.localPersistenceMod.PersistenceTransaction) => getSequenceNumberCount(t0).runNow()))
    __obj.updateDynamic("removeOrphanedDocuments")(js.Any.fromFunction2((t0: typingsJapgolly.firebaseFirestore.localPersistenceMod.PersistenceTransaction, t1: typingsJapgolly.firebaseFirestore.coreTypesMod.ListenSequenceNumber) => removeOrphanedDocuments(t0, t1).runNow()))
    __obj.updateDynamic("removeTargets")(js.Any.fromFunction3((t0: typingsJapgolly.firebaseFirestore.localPersistenceMod.PersistenceTransaction, t1: typingsJapgolly.firebaseFirestore.coreTypesMod.ListenSequenceNumber, t2: typingsJapgolly.firebaseFirestore.localLruGarbageCollectorMod.ActiveTargets) => removeTargets(t0, t1, t2).runNow()))
    __obj.asInstanceOf[LruDelegate]
  }
}

