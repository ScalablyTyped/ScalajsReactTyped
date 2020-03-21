package typingsJapgolly.firebaseFirestore.persistentStreamMod

import typingsJapgolly.firebaseFirestore.asyncQueueMod.AsyncQueue
import typingsJapgolly.firebaseFirestore.connectionMod.Connection
import typingsJapgolly.firebaseFirestore.credentialsMod.CredentialsProvider
import typingsJapgolly.firebaseFirestore.serializerMod.JsonProtoSerializer
import typingsJapgolly.firebaseFirestore.targetDataMod.TargetData
import typingsJapgolly.firebaseFirestore.typesMod.TargetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/remote/persistent_stream", "PersistentListenStream")
@js.native
class PersistentListenStream protected ()
  extends PersistentStream[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.ListenRequest */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.ListenResponse */ js.Any, 
      WatchStreamListener
    ] {
  def this(
    queue: AsyncQueue,
    connection: Connection,
    credentials: CredentialsProvider,
    serializer: JsonProtoSerializer,
    listener: WatchStreamListener
  ) = this()
  var serializer: js.Any = js.native
  /**
    * Unregisters interest in the results of the target associated with the
    * given targetId.
    */
  def unwatch(targetId: TargetId): Unit = js.native
  /**
    * Registers interest in the results of the given target. If the target
    * includes a resumeToken it will be included in the request. Results that
    * affect the target will be streamed back as WatchChange messages that
    * reference the targetId.
    */
  def watch(targetData: TargetData): Unit = js.native
}

