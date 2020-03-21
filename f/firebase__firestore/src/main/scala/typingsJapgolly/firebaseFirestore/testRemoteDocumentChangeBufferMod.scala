package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.documentKeyMod.DocumentKey
import typingsJapgolly.firebaseFirestore.documentMod.MaybeDocument
import typingsJapgolly.firebaseFirestore.persistenceMod.Persistence
import typingsJapgolly.firebaseFirestore.remoteDocumentChangeBufferMod.RemoteDocumentChangeBuffer
import typingsJapgolly.firebaseFirestore.snapshotVersionMod.SnapshotVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/test/unit/local/test_remote_document_change_buffer", JSImport.Namespace)
@js.native
object testRemoteDocumentChangeBufferMod extends js.Object {
  @js.native
  class TestRemoteDocumentChangeBuffer protected () extends js.Object {
    def this(persistence: Persistence, buffer: RemoteDocumentChangeBuffer) = this()
    var buffer: RemoteDocumentChangeBuffer = js.native
    var persistence: Persistence = js.native
    def addEntry(maybeDocument: MaybeDocument, readTime: SnapshotVersion): Unit = js.native
    @JSName("apply")
    def apply(): js.Promise[Unit] = js.native
    def getEntry(documentKey: DocumentKey): js.Promise[MaybeDocument | Null] = js.native
    def removeEntry(key: DocumentKey): Unit = js.native
  }
  
}

