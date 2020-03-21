package typingsJapgolly.firebaseRemoteConfig

import typingsJapgolly.firebaseRemoteConfig.remoteConfigFetchClientMod.FetchRequest
import typingsJapgolly.firebaseRemoteConfig.remoteConfigFetchClientMod.FetchResponse
import typingsJapgolly.firebaseRemoteConfig.remoteConfigFetchClientMod.RemoteConfigAbortSignal
import typingsJapgolly.firebaseRemoteConfig.remoteConfigFetchClientMod.RemoteConfigFetchClient
import typingsJapgolly.firebaseRemoteConfig.storageMod.Storage
import typingsJapgolly.firebaseRemoteConfig.storageMod.ThrottleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/remote-config/dist/src/client/retrying_client", JSImport.Namespace)
@js.native
object retryingClientMod extends js.Object {
  @js.native
  class RetryingClient protected () extends RemoteConfigFetchClient {
    def this(client: RemoteConfigFetchClient, storage: Storage) = this()
    val client: js.Any = js.native
    val storage: js.Any = js.native
    /**
      * A recursive helper for attempting a fetch request repeatedly.
      *
      * @throws any non-retriable errors.
      */
    def attemptFetch(request: FetchRequest, hasThrottleEndTimeMillisBackoffCount: ThrottleMetadata): js.Promise[FetchResponse] = js.native
    /**
      * @throws if response status is not 200 or 304.
      */
    /* CompleteClass */
    override def fetch(request: FetchRequest): js.Promise[FetchResponse] = js.native
  }
  
  def setAbortableTimeout(signal: RemoteConfigAbortSignal, throttleEndTimeMillis: Double): js.Promise[Unit] = js.native
}

