package typingsJapgolly.firebaseRemoteConfig

import typingsJapgolly.firebaseLogger.mod.Logger
import typingsJapgolly.firebaseRemoteConfig.remoteConfigFetchClientMod.FetchRequest
import typingsJapgolly.firebaseRemoteConfig.remoteConfigFetchClientMod.FetchResponse
import typingsJapgolly.firebaseRemoteConfig.remoteConfigFetchClientMod.RemoteConfigFetchClient
import typingsJapgolly.firebaseRemoteConfig.storageCacheMod.StorageCache
import typingsJapgolly.firebaseRemoteConfig.storageMod.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/remote-config/dist/src/client/caching_client", JSImport.Namespace)
@js.native
object cachingClientMod extends js.Object {
  @js.native
  class CachingClient protected () extends RemoteConfigFetchClient {
    def this(client: RemoteConfigFetchClient, storage: Storage, storageCache: StorageCache, logger: Logger) = this()
    val client: js.Any = js.native
    val logger: js.Any = js.native
    val storage: js.Any = js.native
    val storageCache: js.Any = js.native
    /**
      * @throws if response status is not 200 or 304.
      */
    /* CompleteClass */
    override def fetch(request: FetchRequest): js.Promise[FetchResponse] = js.native
    def isCachedDataFresh(cacheMaxAgeMillis: Double): Boolean = js.native
    /**
      * Returns true if the age of the cached fetched configs is less than or equal to
      * {@link Settings#minimumFetchIntervalInSeconds}.
      *
      * <p>This is comparable to passing `headers = { 'Cache-Control': max-age <maxAge> }` to the
      * native Fetch API.
      *
      * <p>Visible for testing.
      */
    def isCachedDataFresh(cacheMaxAgeMillis: Double, lastSuccessfulFetchTimestampMillis: Double): Boolean = js.native
  }
  
}

