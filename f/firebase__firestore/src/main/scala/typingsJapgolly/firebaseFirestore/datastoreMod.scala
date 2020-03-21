package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.asyncQueueMod.AsyncQueue
import typingsJapgolly.firebaseFirestore.connectionMod.Connection
import typingsJapgolly.firebaseFirestore.credentialsMod.CredentialsProvider
import typingsJapgolly.firebaseFirestore.documentKeyMod.DocumentKey
import typingsJapgolly.firebaseFirestore.documentMod.MaybeDocument
import typingsJapgolly.firebaseFirestore.mutationMod.Mutation
import typingsJapgolly.firebaseFirestore.mutationMod.MutationResult
import typingsJapgolly.firebaseFirestore.persistentStreamMod.PersistentListenStream
import typingsJapgolly.firebaseFirestore.persistentStreamMod.PersistentWriteStream
import typingsJapgolly.firebaseFirestore.persistentStreamMod.WatchStreamListener
import typingsJapgolly.firebaseFirestore.persistentStreamMod.WriteStreamListener
import typingsJapgolly.firebaseFirestore.serializerMod.JsonProtoSerializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/remote/datastore", JSImport.Namespace)
@js.native
object datastoreMod extends js.Object {
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

