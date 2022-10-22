package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.distFirestoreSrcApiCredentialsMod.CredentialsProvider
import typingsJapgolly.firebaseFirestore.distFirestoreSrcAuthUserMod.User
import typingsJapgolly.firebaseFirestore.distFirestoreSrcCoreQueryMod.Query
import typingsJapgolly.firebaseFirestore.distFirestoreSrcModelDocumentKeyMod.DocumentKey
import typingsJapgolly.firebaseFirestore.distFirestoreSrcModelDocumentMod.Document
import typingsJapgolly.firebaseFirestore.distFirestoreSrcModelMutationMod.Mutation
import typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.Value
import typingsJapgolly.firebaseFirestore.distFirestoreSrcRemoteConnectionMod.Connection
import typingsJapgolly.firebaseFirestore.distFirestoreSrcRemotePersistentStreamMod.PersistentListenStream
import typingsJapgolly.firebaseFirestore.distFirestoreSrcRemotePersistentStreamMod.PersistentWriteStream
import typingsJapgolly.firebaseFirestore.distFirestoreSrcRemotePersistentStreamMod.WatchStreamListener
import typingsJapgolly.firebaseFirestore.distFirestoreSrcRemotePersistentStreamMod.WriteStreamListener
import typingsJapgolly.firebaseFirestore.distFirestoreSrcRemoteSerializerMod.JsonProtoSerializer
import typingsJapgolly.firebaseFirestore.distFirestoreSrcUtilAsyncQueueMod.AsyncQueue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreSrcRemoteDatastoreMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/remote/datastore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@firebase/firestore/dist/firestore/src/remote/datastore", "Datastore")
  @js.native
  open class Datastore () extends StObject {
    
    def terminate(): Unit = js.native
  }
  
  inline def invokeBatchGetDocumentsRpc(datastore: Datastore, keys: js.Array[DocumentKey]): js.Promise[js.Array[Document]] = (^.asInstanceOf[js.Dynamic].applyDynamic("invokeBatchGetDocumentsRpc")(datastore.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Document]]]
  
  inline def invokeCommitRpc(datastore: Datastore, mutations: js.Array[Mutation]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("invokeCommitRpc")(datastore.asInstanceOf[js.Any], mutations.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def invokeRunAggregationQueryRpc(datastore: Datastore, query: Query): js.Promise[js.Array[Value]] = (^.asInstanceOf[js.Dynamic].applyDynamic("invokeRunAggregationQueryRpc")(datastore.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Value]]]
  
  inline def invokeRunQueryRpc(datastore: Datastore, query: Query): js.Promise[js.Array[Document]] = (^.asInstanceOf[js.Dynamic].applyDynamic("invokeRunQueryRpc")(datastore.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Document]]]
  
  inline def newDatastore(
    authCredentials: CredentialsProvider[User],
    appCheckCredentials: CredentialsProvider[String],
    connection: Connection,
    serializer: JsonProtoSerializer
  ): Datastore = (^.asInstanceOf[js.Dynamic].applyDynamic("newDatastore")(authCredentials.asInstanceOf[js.Any], appCheckCredentials.asInstanceOf[js.Any], connection.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any])).asInstanceOf[Datastore]
  
  inline def newPersistentWatchStream(datastore: Datastore, queue: AsyncQueue, listener: WatchStreamListener): PersistentListenStream = (^.asInstanceOf[js.Dynamic].applyDynamic("newPersistentWatchStream")(datastore.asInstanceOf[js.Any], queue.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[PersistentListenStream]
  
  inline def newPersistentWriteStream(datastore: Datastore, queue: AsyncQueue, listener: WriteStreamListener): PersistentWriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("newPersistentWriteStream")(datastore.asInstanceOf[js.Any], queue.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[PersistentWriteStream]
}
