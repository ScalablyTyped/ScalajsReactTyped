package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.authUserMod.User
import typingsJapgolly.firebaseFirestore.coreDatabaseInfoMod.DatabaseId
import typingsJapgolly.firebaseFirestore.coreListenSequenceMod.SequenceNumberSyncer
import typingsJapgolly.firebaseFirestore.coreTypesMod.BatchId
import typingsJapgolly.firebaseFirestore.coreTypesMod.TargetId
import typingsJapgolly.firebaseFirestore.localIndexeddbPersistenceMod.IndexedDbPersistence
import typingsJapgolly.firebaseFirestore.localLocalSerializerMod.LocalSerializer
import typingsJapgolly.firebaseFirestore.localLruGarbageCollectorMod.LruParams
import typingsJapgolly.firebaseFirestore.localMemoryPersistenceMod.MemoryPersistence
import typingsJapgolly.firebaseFirestore.localSharedClientStateMod.ClientId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/unit/local/persistence_test_helpers", JSImport.Namespace)
@js.native
object localPersistenceTestHelpersMod extends js.Object {
  val INDEXEDDB_TEST_DATABASE_NAME: String = js.native
  val MOCK_SEQUENCE_NUMBER_SYNCER: SequenceNumberSyncer = js.native
  val TEST_DATABASE_ID: DatabaseId = js.native
  val TEST_PERSISTENCE_PREFIX: String = js.native
  val TEST_SERIALIZER: LocalSerializer = js.native
  def clearTestPersistence(): js.Promise[Unit] = js.native
  def clearWebStorage(): Unit = js.native
  def populateWebStorage(
    user: User,
    existingClientId: ClientId,
    existingMutationBatchIds: js.Array[BatchId],
    existingQueryTargetIds: js.Array[TargetId]
  ): js.Promise[Unit] = js.native
  def testIndexedDbPersistence(): js.Promise[IndexedDbPersistence] = js.native
  def testIndexedDbPersistence(options: AnonQueue): js.Promise[IndexedDbPersistence] = js.native
  def testIndexedDbPersistence(options: AnonQueue, lruParams: LruParams): js.Promise[IndexedDbPersistence] = js.native
  def testMemoryEagerPersistence(): js.Promise[MemoryPersistence] = js.native
  def testMemoryLruPersistence(): js.Promise[MemoryPersistence] = js.native
  def testMemoryLruPersistence(params: LruParams): js.Promise[MemoryPersistence] = js.native
}

