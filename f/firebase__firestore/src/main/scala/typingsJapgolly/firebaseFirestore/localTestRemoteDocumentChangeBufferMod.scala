package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.coreSnapshotVersionMod.SnapshotVersion
import typingsJapgolly.firebaseFirestore.localPersistenceMod.Persistence
import typingsJapgolly.firebaseFirestore.localRemoteDocumentChangeBufferMod.RemoteDocumentChangeBuffer
import typingsJapgolly.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typingsJapgolly.firebaseFirestore.modelDocumentMod.MaybeDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/unit/local/test_remote_document_change_buffer", JSImport.Namespace)
@js.native
object localTestRemoteDocumentChangeBufferMod extends js.Object {
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

