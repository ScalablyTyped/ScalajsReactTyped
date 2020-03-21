package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.apiCredentialsMod.CredentialsProvider
import typingsJapgolly.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typingsJapgolly.firebaseFirestore.modelDocumentMod.MaybeDocument
import typingsJapgolly.firebaseFirestore.modelMutationMod.Mutation
import typingsJapgolly.firebaseFirestore.modelMutationMod.MutationResult
import typingsJapgolly.firebaseFirestore.remoteConnectionMod.Connection
import typingsJapgolly.firebaseFirestore.remotePersistentStreamMod.PersistentListenStream
import typingsJapgolly.firebaseFirestore.remotePersistentStreamMod.PersistentWriteStream
import typingsJapgolly.firebaseFirestore.remotePersistentStreamMod.WatchStreamListener
import typingsJapgolly.firebaseFirestore.remotePersistentStreamMod.WriteStreamListener
import typingsJapgolly.firebaseFirestore.remoteSerializerMod.JsonProtoSerializer
import typingsJapgolly.firebaseFirestore.utilAsyncQueueMod.AsyncQueue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/remote/datastore", JSImport.Namespace)
@js.native
object remoteDatastoreMod extends js.Object {
  @js.native
  class Datastore protected () extends js.Object {
    def this(
      queue: AsyncQueue,
      connection: Connection,
      credentials: CredentialsProvider,
      serializer: JsonProtoSerializer
    ) = this()
    var connection: js.Any = js.native
    var credentials: js.Any = js.native
    /** Gets an auth token and invokes the provided RPC. */
    var invokeRPC: js.Any = js.native
    /** Gets an auth token and invokes the provided RPC with streamed results. */
    var invokeStreamingRPC: js.Any = js.native
    var queue: js.Any = js.native
    var serializer: js.Any = js.native
    def commit(mutations: js.Array[Mutation]): js.Promise[js.Array[MutationResult]] = js.native
    def lookup(keys: js.Array[DocumentKey]): js.Promise[js.Array[MaybeDocument]] = js.native
    def newPersistentWatchStream(listener: WatchStreamListener): PersistentListenStream = js.native
    def newPersistentWriteStream(listener: WriteStreamListener): PersistentWriteStream = js.native
  }
  
}

