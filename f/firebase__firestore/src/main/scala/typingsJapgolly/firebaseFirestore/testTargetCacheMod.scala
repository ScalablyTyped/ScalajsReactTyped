package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.documentKeyMod.DocumentKey
import typingsJapgolly.firebaseFirestore.persistenceMod.Persistence
import typingsJapgolly.firebaseFirestore.snapshotVersionMod.SnapshotVersion
import typingsJapgolly.firebaseFirestore.targetCacheMod.TargetCache
import typingsJapgolly.firebaseFirestore.targetDataMod.TargetData
import typingsJapgolly.firebaseFirestore.targetMod.Target
import typingsJapgolly.firebaseFirestore.typesMod.ListenSequenceNumber
import typingsJapgolly.firebaseFirestore.typesMod.TargetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/test/unit/local/test_target_cache", JSImport.Namespace)
@js.native
object testTargetCacheMod extends js.Object {
  @js.native
  class TestTargetCache protected () extends js.Object {
    def this(persistence: Persistence, cache: TargetCache) = this()
    var cache: TargetCache = js.native
    var persistence: Persistence = js.native
    def addMatchingKeys(keys: js.Array[DocumentKey], targetId: TargetId): js.Promise[Unit] = js.native
    def addTargetData(targetData: TargetData): js.Promise[Unit] = js.native
    def allocateTargetId(): js.Promise[TargetId] = js.native
    def containsKey(key: DocumentKey): js.Promise[Boolean] = js.native
    def getHighestSequenceNumber(): js.Promise[ListenSequenceNumber] = js.native
    def getLastRemoteSnapshotVersion(): js.Promise[SnapshotVersion] = js.native
    def getMatchingKeysForTargetId(targetId: TargetId): js.Promise[js.Array[DocumentKey]] = js.native
    def getTargetCount(): js.Promise[Double] = js.native
    def getTargetData(target: Target): js.Promise[TargetData | Null] = js.native
    def removeMatchingKeys(keys: js.Array[DocumentKey], targetId: TargetId): js.Promise[Unit] = js.native
    def removeMatchingKeysForTargetId(targetId: TargetId): js.Promise[Unit] = js.native
    def removeTargetData(targetData: TargetData): js.Promise[Unit] = js.native
    def setTargetsMetadata(highestListenSequenceNumber: ListenSequenceNumber): js.Promise[Unit] = js.native
    def setTargetsMetadata(highestListenSequenceNumber: ListenSequenceNumber, lastRemoteSnapshotVersion: SnapshotVersion): js.Promise[Unit] = js.native
    def updateTargetData(targetData: TargetData): js.Promise[Unit] = js.native
  }
  
}

