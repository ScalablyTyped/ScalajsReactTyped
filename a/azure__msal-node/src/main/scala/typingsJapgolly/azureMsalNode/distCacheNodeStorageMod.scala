package typingsJapgolly.azureMsalNode

import typingsJapgolly.azureMsalCommon.distCacheUtilsCacheTypesMod.ValidCacheType
import typingsJapgolly.azureMsalCommon.distCryptoIcryptoMod.ICrypto
import typingsJapgolly.azureMsalCommon.mod.AccessTokenEntity
import typingsJapgolly.azureMsalCommon.mod.AccountEntity
import typingsJapgolly.azureMsalCommon.mod.AppMetadataEntity
import typingsJapgolly.azureMsalCommon.mod.AuthorityMetadataEntity
import typingsJapgolly.azureMsalCommon.mod.CacheManager
import typingsJapgolly.azureMsalCommon.mod.IdTokenEntity
import typingsJapgolly.azureMsalCommon.mod.Logger
import typingsJapgolly.azureMsalCommon.mod.RefreshTokenEntity
import typingsJapgolly.azureMsalCommon.mod.ServerTelemetryEntity
import typingsJapgolly.azureMsalCommon.mod.ThrottlingEntity
import typingsJapgolly.azureMsalNode.distCacheSerializerSerializerTypesMod.CacheKVStore
import typingsJapgolly.azureMsalNode.distCacheSerializerSerializerTypesMod.InMemoryCache
import typingsJapgolly.azureMsalNode.distCacheSerializerSerializerTypesMod.JsonCache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCacheNodeStorageMod {
  
  @JSImport("@azure/msal-node/dist/cache/NodeStorage", "NodeStorage")
  @js.native
  open class NodeStorage protected () extends CacheManager {
    def this(logger: Logger, clientId: String, cryptoImpl: ICrypto) = this()
    
    /* private */ var cache: Any = js.native
    
    /**
      * Converts cacheKVStore to InMemoryCache
      * @param cache - key value store
      */
    def cacheToInMemoryCache(cache: CacheKVStore): InMemoryCache = js.native
    
    /* private */ var changeEmitters: Any = js.native
    
    /**
      * Invoke the callback when cache changes
      */
    def emitChange(): Unit = js.native
    
    /**
      * get the current cache key-value store
      */
    def getCache(): CacheKVStore = js.native
    
    /**
      * gets the current in memory cache for the client
      */
    def getInMemoryCache(): InMemoryCache = js.native
    
    /**
      * Gets cache item with given key.
      * @param key - lookup key for the cache entry
      */
    def getItem(key: String): ValidCacheType = js.native
    
    /**
      * converts inMemoryCache to CacheKVStore
      * @param inMemoryCache - kvstore map for inmemory
      */
    def inMemoryCacheToCache(inMemoryCache: InMemoryCache): CacheKVStore = js.native
    
    /* private */ var logger: Any = js.native
    
    /**
      * Queue up callbacks
      * @param func - a callback function for cache change indication
      */
    def registerChangeEmitter(func: js.Function0[Unit]): Unit = js.native
    
    /**
      * set accessToken credential
      * @param accessToken -  cache value to be set of type AccessTokenEntity
      */
    def setAccessTokenCredential(accessToken: AccessTokenEntity): Unit = js.native
    
    /**
      * set account entity
      * @param account - cache value to be set of type AccountEntity
      */
    def setAccount(account: AccountEntity): Unit = js.native
    
    /**
      * set appMetadata entity to the platform cache
      * @param appMetadata - cache value to be set of type AppMetadataEntity
      */
    def setAppMetadata(appMetadata: AppMetadataEntity): Unit = js.native
    
    /**
      * set authority metadata entity to the platform cache
      * @param key - lookup key to fetch cache type AuthorityMetadataEntity
      * @param metadata - cache value to be set of type AuthorityMetadataEntity
      */
    def setAuthorityMetadata(key: String, metadata: AuthorityMetadataEntity): Unit = js.native
    
    /**
      * sets the current cache (key value store)
      * @param cacheMap - key value map
      */
    def setCache(cache: CacheKVStore): Unit = js.native
    
    /**
      * set idToken credential
      * @param idToken - cache value to be set of type IdTokenEntity
      */
    def setIdTokenCredential(idToken: IdTokenEntity): Unit = js.native
    
    /**
      * sets the current in memory cache for the client
      * @param inMemoryCache - key value map in memory
      */
    def setInMemoryCache(inMemoryCache: InMemoryCache): Unit = js.native
    
    /**
      * Gets cache item with given key-value
      * @param key - lookup key for the cache entry
      * @param value - value of the cache entry
      */
    def setItem(key: String, value: ValidCacheType): Unit = js.native
    
    /**
      * set refreshToken credential
      * @param refreshToken - cache value to be set of type RefreshTokenEntity
      */
    def setRefreshTokenCredential(refreshToken: RefreshTokenEntity): Unit = js.native
    
    /**
      * set server telemetry entity to the platform cache
      * @param serverTelemetryKey - lookup key to fetch cache type ServerTelemetryEntity
      * @param serverTelemetry - cache value to be set of type ServerTelemetryEntity
      */
    def setServerTelemetry(serverTelemetryKey: String, serverTelemetry: ServerTelemetryEntity): Unit = js.native
    
    /**
      * set throttling entity to the platform cache
      * @param throttlingCacheKey - lookup key to fetch cache type ThrottlingEntity
      * @param throttlingCache - cache value to be set of type ThrottlingEntity
      */
    def setThrottlingCache(throttlingCacheKey: String, throttlingCache: ThrottlingEntity): Unit = js.native
  }
  /* static members */
  object NodeStorage {
    
    @JSImport("@azure/msal-node/dist/cache/NodeStorage", "NodeStorage")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Initialize in memory cache from an exisiting cache vault
      * @param cache - blob formatted cache (JSON)
      */
    inline def generateInMemoryCache(cache: String): InMemoryCache = ^.asInstanceOf[js.Dynamic].applyDynamic("generateInMemoryCache")(cache.asInstanceOf[js.Any]).asInstanceOf[InMemoryCache]
    
    /**
      * retrieves the final JSON
      * @param inMemoryCache - itemised cache read from the JSON
      */
    inline def generateJsonCache(inMemoryCache: InMemoryCache): JsonCache = ^.asInstanceOf[js.Dynamic].applyDynamic("generateJsonCache")(inMemoryCache.asInstanceOf[js.Any]).asInstanceOf[JsonCache]
  }
}
