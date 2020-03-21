package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.coreTypesMod.BatchId
import typingsJapgolly.firebaseFirestore.coreTypesMod.TargetId
import typingsJapgolly.firebaseFirestore.modelCollectionsMod.DocumentKeySet_
import typingsJapgolly.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/reference_set", JSImport.Namespace)
@js.native
object localReferenceSetMod extends js.Object {
  @js.native
  class DocReference protected () extends js.Object {
    def this(key: DocumentKey, targetOrBatchId: BatchId | TargetId) = this()
    var key: DocumentKey = js.native
    var targetOrBatchId: TargetId | BatchId = js.native
  }
  
  @js.native
  class ReferenceSet () extends js.Object {
    var refsByKey: js.Any = js.native
    var refsByTarget: js.Any = js.native
    var removeRef: js.Any = js.native
    /** Adds a reference to the given document key for the given ID. */
    def addReference(key: DocumentKey, id: BatchId | TargetId): Unit = js.native
    /** Add references to the given document keys for the given ID. */
    def addReferences(keys: DocumentKeySet_, id: BatchId | TargetId): Unit = js.native
    def containsKey(key: DocumentKey): Boolean = js.native
    /** Returns true if the reference set contains no references. */
    def isEmpty(): Boolean = js.native
    def referencesForId(id: BatchId | TargetId): DocumentKeySet_ = js.native
    def removeAllReferences(): Unit = js.native
    /**
      * Removes a reference to the given document key for the given
      * ID.
      */
    def removeReference(key: DocumentKey, id: BatchId | TargetId): Unit = js.native
    def removeReferences(keys: DocumentKeySet_, id: BatchId | TargetId): Unit = js.native
    /**
      * Clears all references with a given ID. Calls removeRef() for each key
      * removed.
      */
    def removeReferencesForId(id: BatchId | TargetId): js.Array[DocumentKey] = js.native
  }
  
  /* static members */
  @js.native
  object DocReference extends js.Object {
    /** Compare by key then by ID */
    def compareByKey(left: DocReference, right: DocReference): Double = js.native
    /** Compare by ID then by key */
    def compareByTargetId(left: DocReference, right: DocReference): Double = js.native
  }
  
}

