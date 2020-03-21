package typingsJapgolly.firebaseFirestore.localPersistenceMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firebaseFirestore.localPersistencePromiseMod.PersistencePromise
import typingsJapgolly.firebaseFirestore.localReferenceSetMod.ReferenceSet
import typingsJapgolly.firebaseFirestore.localTargetDataMod.TargetData
import typingsJapgolly.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceDelegate extends js.Object {
  /** Notify the delegate that the given document was added to a target. */
  def addReference(txn: PersistenceTransaction, doc: DocumentKey): PersistencePromise[Unit]
  /** Notify the delegate that a document is no longer being mutated by the user. */
  def removeMutationReference(txn: PersistenceTransaction, doc: DocumentKey): PersistencePromise[Unit]
  /** Notify the delegate that the given document was removed from a target. */
  def removeReference(txn: PersistenceTransaction, doc: DocumentKey): PersistencePromise[Unit]
  /**
    * Notify the delegate that a target was removed. The delegate may, but is not obligated to,
    * actually delete the target and associated data.
    */
  def removeTarget(txn: PersistenceTransaction, targetData: TargetData): PersistencePromise[Unit]
  /**
    * Registers a ReferenceSet of documents that should be considered 'referenced' and not eligible
    * for removal during garbage collection.
    */
  def setInMemoryPins(pins: ReferenceSet): Unit
  /** Notify the delegate that a limbo document was updated. */
  def updateLimboDocument(txn: PersistenceTransaction, doc: DocumentKey): PersistencePromise[Unit]
}

object ReferenceDelegate {
  @scala.inline
  def apply(
    addReference: (PersistenceTransaction, DocumentKey) => CallbackTo[PersistencePromise[Unit]],
    removeMutationReference: (PersistenceTransaction, DocumentKey) => CallbackTo[PersistencePromise[Unit]],
    removeReference: (PersistenceTransaction, DocumentKey) => CallbackTo[PersistencePromise[Unit]],
    removeTarget: (PersistenceTransaction, TargetData) => CallbackTo[PersistencePromise[Unit]],
    setInMemoryPins: ReferenceSet => Callback,
    updateLimboDocument: (PersistenceTransaction, DocumentKey) => CallbackTo[PersistencePromise[Unit]]
  ): ReferenceDelegate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addReference")(js.Any.fromFunction2((t0: typingsJapgolly.firebaseFirestore.localPersistenceMod.PersistenceTransaction, t1: typingsJapgolly.firebaseFirestore.modelDocumentKeyMod.DocumentKey) => addReference(t0, t1).runNow()))
    __obj.updateDynamic("removeMutationReference")(js.Any.fromFunction2((t0: typingsJapgolly.firebaseFirestore.localPersistenceMod.PersistenceTransaction, t1: typingsJapgolly.firebaseFirestore.modelDocumentKeyMod.DocumentKey) => removeMutationReference(t0, t1).runNow()))
    __obj.updateDynamic("removeReference")(js.Any.fromFunction2((t0: typingsJapgolly.firebaseFirestore.localPersistenceMod.PersistenceTransaction, t1: typingsJapgolly.firebaseFirestore.modelDocumentKeyMod.DocumentKey) => removeReference(t0, t1).runNow()))
    __obj.updateDynamic("removeTarget")(js.Any.fromFunction2((t0: typingsJapgolly.firebaseFirestore.localPersistenceMod.PersistenceTransaction, t1: typingsJapgolly.firebaseFirestore.localTargetDataMod.TargetData) => removeTarget(t0, t1).runNow()))
    __obj.updateDynamic("setInMemoryPins")(js.Any.fromFunction1((t0: typingsJapgolly.firebaseFirestore.localReferenceSetMod.ReferenceSet) => setInMemoryPins(t0).runNow()))
    __obj.updateDynamic("updateLimboDocument")(js.Any.fromFunction2((t0: typingsJapgolly.firebaseFirestore.localPersistenceMod.PersistenceTransaction, t1: typingsJapgolly.firebaseFirestore.modelDocumentKeyMod.DocumentKey) => updateLimboDocument(t0, t1).runNow()))
    __obj.asInstanceOf[ReferenceDelegate]
  }
}

