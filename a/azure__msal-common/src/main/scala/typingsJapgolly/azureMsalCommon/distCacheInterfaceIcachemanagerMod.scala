package typingsJapgolly.azureMsalCommon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.azureMsalCommon.distAccountAccountInfoMod.AccountInfo
import typingsJapgolly.azureMsalCommon.distCacheEntitiesAccessTokenEntityMod.AccessTokenEntity
import typingsJapgolly.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity
import typingsJapgolly.azureMsalCommon.distCacheEntitiesAppMetadataEntityMod.AppMetadataEntity
import typingsJapgolly.azureMsalCommon.distCacheEntitiesAuthorityMetadataEntityMod.AuthorityMetadataEntity
import typingsJapgolly.azureMsalCommon.distCacheEntitiesCacheRecordMod.CacheRecord
import typingsJapgolly.azureMsalCommon.distCacheEntitiesCredentialEntityMod.CredentialEntity
import typingsJapgolly.azureMsalCommon.distCacheEntitiesIdTokenEntityMod.IdTokenEntity
import typingsJapgolly.azureMsalCommon.distCacheEntitiesRefreshTokenEntityMod.RefreshTokenEntity
import typingsJapgolly.azureMsalCommon.distCacheEntitiesServerTelemetryEntityMod.ServerTelemetryEntity
import typingsJapgolly.azureMsalCommon.distCacheEntitiesThrottlingEntityMod.ThrottlingEntity
import typingsJapgolly.azureMsalCommon.distCacheUtilsCacheTypesMod.AccountCache
import typingsJapgolly.azureMsalCommon.distCacheUtilsCacheTypesMod.AccountFilter
import typingsJapgolly.azureMsalCommon.distCacheUtilsCacheTypesMod.CredentialCache
import typingsJapgolly.azureMsalCommon.distCacheUtilsCacheTypesMod.CredentialFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCacheInterfaceIcachemanagerMod {
  
  trait ICacheManager extends StObject {
    
    /**
      * given an authority generates the cache key for authorityMetadata
      * @param authority
      */
    def generateAuthorityMetadataCacheKey(authority: String): String
    
    /**
      * fetch the idToken entity from the platform cache
      * @param accessTokenKey
      */
    def getAccessTokenCredential(accessTokenKey: String): AccessTokenEntity | Null
    
    /**
      * fetch the account entity from the platform cache
      * @param accountKey
      */
    def getAccount(accountKey: String): AccountEntity | Null
    
    /**
      * retrieve accounts matching all provided filters; if no filter is set, get all accounts
      * @param homeAccountId
      * @param environment
      * @param realm
      */
    def getAccountsFilteredBy(filter: AccountFilter): AccountCache
    
    /**
      * Returns all accounts in cache
      */
    def getAllAccounts(): js.Array[AccountInfo]
    
    /**
      * fetch appMetadata entity from the platform cache
      * @param appMetadataKey
      */
    def getAppMetadata(appMetadataKey: String): AppMetadataEntity | Null
    
    /**
      * fetch cloud discovery metadata entity from the platform cache
      * @param key
      */
    def getAuthorityMetadata(key: String): AuthorityMetadataEntity | Null
    
    /**
      * Provide an alias to find a matching AuthorityMetadataEntity in cache
      * @param host
      */
    def getAuthorityMetadataByAlias(host: String): AuthorityMetadataEntity | Null
    
    /**
      * Get cache keys for authority metadata
      */
    def getAuthorityMetadataKeys(): js.Array[String]
    
    /**
      * retrieve credentials matching all provided filters; if no filter is set, get all credentials
      * @param homeAccountId
      * @param environment
      * @param credentialType
      * @param clientId
      * @param realm
      * @param target
      */
    def getCredentialsFilteredBy(filter: CredentialFilter): CredentialCache
    
    /**
      * fetch the idToken entity from the platform cache
      * @param idTokenKey
      */
    def getIdTokenCredential(idTokenKey: String): IdTokenEntity | Null
    
    /**
      * fetch the idToken entity from the platform cache
      * @param refreshTokenKey
      */
    def getRefreshTokenCredential(refreshTokenKey: String): RefreshTokenEntity | Null
    
    /**
      * fetch server telemetry entity from the platform cache
      * @param serverTelemetryKey
      */
    def getServerTelemetry(serverTelemetryKey: String): ServerTelemetryEntity | Null
    
    /**
      * fetch throttling entity from the platform cache
      * @param throttlingCacheKey
      */
    def getThrottlingCache(throttlingCacheKey: String): ThrottlingEntity | Null
    
    /**
      * returns a boolean if the given account is removed
      * @param account
      */
    def removeAccount(accountKey: String): js.Promise[Boolean]
    
    /**
      * returns a boolean if the given account is removed
      * @param account
      */
    def removeAccountContext(account: AccountEntity): js.Promise[Boolean]
    
    /**
      * Removes all accounts and related tokens from cache.
      */
    def removeAllAccounts(): js.Promise[Boolean]
    
    /**
      * returns a boolean if the given credential is removed
      * @param credential
      */
    def removeCredential(credential: CredentialEntity): js.Promise[Boolean]
    
    /**
      * saves a cache record
      * @param cacheRecord
      */
    def saveCacheRecord(cacheRecord: CacheRecord): js.Promise[Unit]
    
    /**
      * set idToken entity to the platform cache
      * @param accessToken
      */
    def setAccessTokenCredential(accessToken: AccessTokenEntity): Unit
    
    /**
      * set account entity in the platform cache
      * @param account
      */
    def setAccount(account: AccountEntity): Unit
    
    /**
      * set appMetadata entity to the platform cache
      * @param appMetadata
      */
    def setAppMetadata(appMetadata: AppMetadataEntity): Unit
    
    /**
      * set cloud discovery metadata entity to the platform cache
      * @param key
      * @param value
      */
    def setAuthorityMetadata(key: String, value: AuthorityMetadataEntity): Unit
    
    /**
      * set idToken entity to the platform cache
      * @param idToken
      */
    def setIdTokenCredential(idToken: IdTokenEntity): Unit
    
    /**
      * set idToken entity to the platform cache
      * @param refreshToken
      */
    def setRefreshTokenCredential(refreshToken: RefreshTokenEntity): Unit
    
    /**
      * set server telemetry entity to the platform cache
      * @param serverTelemetryKey
      * @param serverTelemetry
      */
    def setServerTelemetry(serverTelemetryKey: String, serverTelemetry: ServerTelemetryEntity): Unit
    
    /**
      * set throttling entity to the platform cache
      * @param throttlingCacheKey
      * @param throttlingCache
      */
    def setThrottlingCache(throttlingCacheKey: String, throttlingCache: ThrottlingEntity): Unit
  }
  object ICacheManager {
    
    inline def apply(
      generateAuthorityMetadataCacheKey: String => String,
      getAccessTokenCredential: String => AccessTokenEntity | Null,
      getAccount: String => AccountEntity | Null,
      getAccountsFilteredBy: AccountFilter => AccountCache,
      getAllAccounts: CallbackTo[js.Array[AccountInfo]],
      getAppMetadata: String => AppMetadataEntity | Null,
      getAuthorityMetadata: String => AuthorityMetadataEntity | Null,
      getAuthorityMetadataByAlias: String => AuthorityMetadataEntity | Null,
      getAuthorityMetadataKeys: CallbackTo[js.Array[String]],
      getCredentialsFilteredBy: CredentialFilter => CredentialCache,
      getIdTokenCredential: String => IdTokenEntity | Null,
      getRefreshTokenCredential: String => RefreshTokenEntity | Null,
      getServerTelemetry: String => ServerTelemetryEntity | Null,
      getThrottlingCache: String => ThrottlingEntity | Null,
      removeAccount: String => js.Promise[Boolean],
      removeAccountContext: AccountEntity => js.Promise[Boolean],
      removeAllAccounts: CallbackTo[js.Promise[Boolean]],
      removeCredential: CredentialEntity => js.Promise[Boolean],
      saveCacheRecord: CacheRecord => js.Promise[Unit],
      setAccessTokenCredential: AccessTokenEntity => Callback,
      setAccount: AccountEntity => Callback,
      setAppMetadata: AppMetadataEntity => Callback,
      setAuthorityMetadata: (String, AuthorityMetadataEntity) => Callback,
      setIdTokenCredential: IdTokenEntity => Callback,
      setRefreshTokenCredential: RefreshTokenEntity => Callback,
      setServerTelemetry: (String, ServerTelemetryEntity) => Callback,
      setThrottlingCache: (String, ThrottlingEntity) => Callback
    ): ICacheManager = {
      val __obj = js.Dynamic.literal(generateAuthorityMetadataCacheKey = js.Any.fromFunction1(generateAuthorityMetadataCacheKey), getAccessTokenCredential = js.Any.fromFunction1(getAccessTokenCredential), getAccount = js.Any.fromFunction1(getAccount), getAccountsFilteredBy = js.Any.fromFunction1(getAccountsFilteredBy), getAllAccounts = getAllAccounts.toJsFn, getAppMetadata = js.Any.fromFunction1(getAppMetadata), getAuthorityMetadata = js.Any.fromFunction1(getAuthorityMetadata), getAuthorityMetadataByAlias = js.Any.fromFunction1(getAuthorityMetadataByAlias), getAuthorityMetadataKeys = getAuthorityMetadataKeys.toJsFn, getCredentialsFilteredBy = js.Any.fromFunction1(getCredentialsFilteredBy), getIdTokenCredential = js.Any.fromFunction1(getIdTokenCredential), getRefreshTokenCredential = js.Any.fromFunction1(getRefreshTokenCredential), getServerTelemetry = js.Any.fromFunction1(getServerTelemetry), getThrottlingCache = js.Any.fromFunction1(getThrottlingCache), removeAccount = js.Any.fromFunction1(removeAccount), removeAccountContext = js.Any.fromFunction1(removeAccountContext), removeAllAccounts = removeAllAccounts.toJsFn, removeCredential = js.Any.fromFunction1(removeCredential), saveCacheRecord = js.Any.fromFunction1(saveCacheRecord), setAccessTokenCredential = js.Any.fromFunction1((t0: AccessTokenEntity) => setAccessTokenCredential(t0).runNow()), setAccount = js.Any.fromFunction1((t0: AccountEntity) => setAccount(t0).runNow()), setAppMetadata = js.Any.fromFunction1((t0: AppMetadataEntity) => setAppMetadata(t0).runNow()), setAuthorityMetadata = js.Any.fromFunction2((t0: String, t1: AuthorityMetadataEntity) => (setAuthorityMetadata(t0, t1)).runNow()), setIdTokenCredential = js.Any.fromFunction1((t0: IdTokenEntity) => setIdTokenCredential(t0).runNow()), setRefreshTokenCredential = js.Any.fromFunction1((t0: RefreshTokenEntity) => setRefreshTokenCredential(t0).runNow()), setServerTelemetry = js.Any.fromFunction2((t0: String, t1: ServerTelemetryEntity) => (setServerTelemetry(t0, t1)).runNow()), setThrottlingCache = js.Any.fromFunction2((t0: String, t1: ThrottlingEntity) => (setThrottlingCache(t0, t1)).runNow()))
      __obj.asInstanceOf[ICacheManager]
    }
    
    extension [Self <: ICacheManager](x: Self) {
      
      inline def setGenerateAuthorityMetadataCacheKey(value: String => String): Self = StObject.set(x, "generateAuthorityMetadataCacheKey", js.Any.fromFunction1(value))
      
      inline def setGetAccessTokenCredential(value: String => AccessTokenEntity | Null): Self = StObject.set(x, "getAccessTokenCredential", js.Any.fromFunction1(value))
      
      inline def setGetAccount(value: String => AccountEntity | Null): Self = StObject.set(x, "getAccount", js.Any.fromFunction1(value))
      
      inline def setGetAccountsFilteredBy(value: AccountFilter => AccountCache): Self = StObject.set(x, "getAccountsFilteredBy", js.Any.fromFunction1(value))
      
      inline def setGetAllAccounts(value: CallbackTo[js.Array[AccountInfo]]): Self = StObject.set(x, "getAllAccounts", value.toJsFn)
      
      inline def setGetAppMetadata(value: String => AppMetadataEntity | Null): Self = StObject.set(x, "getAppMetadata", js.Any.fromFunction1(value))
      
      inline def setGetAuthorityMetadata(value: String => AuthorityMetadataEntity | Null): Self = StObject.set(x, "getAuthorityMetadata", js.Any.fromFunction1(value))
      
      inline def setGetAuthorityMetadataByAlias(value: String => AuthorityMetadataEntity | Null): Self = StObject.set(x, "getAuthorityMetadataByAlias", js.Any.fromFunction1(value))
      
      inline def setGetAuthorityMetadataKeys(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getAuthorityMetadataKeys", value.toJsFn)
      
      inline def setGetCredentialsFilteredBy(value: CredentialFilter => CredentialCache): Self = StObject.set(x, "getCredentialsFilteredBy", js.Any.fromFunction1(value))
      
      inline def setGetIdTokenCredential(value: String => IdTokenEntity | Null): Self = StObject.set(x, "getIdTokenCredential", js.Any.fromFunction1(value))
      
      inline def setGetRefreshTokenCredential(value: String => RefreshTokenEntity | Null): Self = StObject.set(x, "getRefreshTokenCredential", js.Any.fromFunction1(value))
      
      inline def setGetServerTelemetry(value: String => ServerTelemetryEntity | Null): Self = StObject.set(x, "getServerTelemetry", js.Any.fromFunction1(value))
      
      inline def setGetThrottlingCache(value: String => ThrottlingEntity | Null): Self = StObject.set(x, "getThrottlingCache", js.Any.fromFunction1(value))
      
      inline def setRemoveAccount(value: String => js.Promise[Boolean]): Self = StObject.set(x, "removeAccount", js.Any.fromFunction1(value))
      
      inline def setRemoveAccountContext(value: AccountEntity => js.Promise[Boolean]): Self = StObject.set(x, "removeAccountContext", js.Any.fromFunction1(value))
      
      inline def setRemoveAllAccounts(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "removeAllAccounts", value.toJsFn)
      
      inline def setRemoveCredential(value: CredentialEntity => js.Promise[Boolean]): Self = StObject.set(x, "removeCredential", js.Any.fromFunction1(value))
      
      inline def setSaveCacheRecord(value: CacheRecord => js.Promise[Unit]): Self = StObject.set(x, "saveCacheRecord", js.Any.fromFunction1(value))
      
      inline def setSetAccessTokenCredential(value: AccessTokenEntity => Callback): Self = StObject.set(x, "setAccessTokenCredential", js.Any.fromFunction1((t0: AccessTokenEntity) => value(t0).runNow()))
      
      inline def setSetAccount(value: AccountEntity => Callback): Self = StObject.set(x, "setAccount", js.Any.fromFunction1((t0: AccountEntity) => value(t0).runNow()))
      
      inline def setSetAppMetadata(value: AppMetadataEntity => Callback): Self = StObject.set(x, "setAppMetadata", js.Any.fromFunction1((t0: AppMetadataEntity) => value(t0).runNow()))
      
      inline def setSetAuthorityMetadata(value: (String, AuthorityMetadataEntity) => Callback): Self = StObject.set(x, "setAuthorityMetadata", js.Any.fromFunction2((t0: String, t1: AuthorityMetadataEntity) => (value(t0, t1)).runNow()))
      
      inline def setSetIdTokenCredential(value: IdTokenEntity => Callback): Self = StObject.set(x, "setIdTokenCredential", js.Any.fromFunction1((t0: IdTokenEntity) => value(t0).runNow()))
      
      inline def setSetRefreshTokenCredential(value: RefreshTokenEntity => Callback): Self = StObject.set(x, "setRefreshTokenCredential", js.Any.fromFunction1((t0: RefreshTokenEntity) => value(t0).runNow()))
      
      inline def setSetServerTelemetry(value: (String, ServerTelemetryEntity) => Callback): Self = StObject.set(x, "setServerTelemetry", js.Any.fromFunction2((t0: String, t1: ServerTelemetryEntity) => (value(t0, t1)).runNow()))
      
      inline def setSetThrottlingCache(value: (String, ThrottlingEntity) => Callback): Self = StObject.set(x, "setThrottlingCache", js.Any.fromFunction2((t0: String, t1: ThrottlingEntity) => (value(t0, t1)).runNow()))
    }
  }
}
