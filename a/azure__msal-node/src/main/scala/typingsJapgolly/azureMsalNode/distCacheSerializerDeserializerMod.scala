package typingsJapgolly.azureMsalNode

import typingsJapgolly.azureMsalCommon.distCacheUtilsCacheTypesMod.AccessTokenCache
import typingsJapgolly.azureMsalCommon.distCacheUtilsCacheTypesMod.AccountCache
import typingsJapgolly.azureMsalCommon.distCacheUtilsCacheTypesMod.AppMetadataCache
import typingsJapgolly.azureMsalCommon.distCacheUtilsCacheTypesMod.IdTokenCache
import typingsJapgolly.azureMsalCommon.distCacheUtilsCacheTypesMod.RefreshTokenCache
import typingsJapgolly.azureMsalNode.distCacheSerializerSerializerTypesMod.InMemoryCache
import typingsJapgolly.azureMsalNode.distCacheSerializerSerializerTypesMod.JsonCache
import typingsJapgolly.azureMsalNode.distCacheSerializerSerializerTypesMod.SerializedAccessTokenEntity
import typingsJapgolly.azureMsalNode.distCacheSerializerSerializerTypesMod.SerializedAccountEntity
import typingsJapgolly.azureMsalNode.distCacheSerializerSerializerTypesMod.SerializedAppMetadataEntity
import typingsJapgolly.azureMsalNode.distCacheSerializerSerializerTypesMod.SerializedIdTokenEntity
import typingsJapgolly.azureMsalNode.distCacheSerializerSerializerTypesMod.SerializedRefreshTokenEntity
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCacheSerializerDeserializerMod {
  
  @JSImport("@azure/msal-node/dist/cache/serializer/Deserializer", "Deserializer")
  @js.native
  open class Deserializer () extends StObject
  /* static members */
  object Deserializer {
    
    @JSImport("@azure/msal-node/dist/cache/serializer/Deserializer", "Deserializer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Deserializes access tokens to AccessTokenEntity objects
      * @param accessTokens
      */
    inline def deserializeAccessTokens(accessTokens: Record[String, SerializedAccessTokenEntity]): AccessTokenCache = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAccessTokens")(accessTokens.asInstanceOf[js.Any]).asInstanceOf[AccessTokenCache]
    
    /**
      * Deserializes accounts to AccountEntity objects
      * @param accounts
      */
    inline def deserializeAccounts(accounts: Record[String, SerializedAccountEntity]): AccountCache = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAccounts")(accounts.asInstanceOf[js.Any]).asInstanceOf[AccountCache]
    
    /**
      * Deserialize an inMemory Cache
      * @param jsonCache
      */
    inline def deserializeAllCache(jsonCache: JsonCache): InMemoryCache = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAllCache")(jsonCache.asInstanceOf[js.Any]).asInstanceOf[InMemoryCache]
    
    /**
      * Deserializes appMetadata to AppMetaData objects
      * @param appMetadata
      */
    inline def deserializeAppMetadata(appMetadata: Record[String, SerializedAppMetadataEntity]): AppMetadataCache = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAppMetadata")(appMetadata.asInstanceOf[js.Any]).asInstanceOf[AppMetadataCache]
    
    /**
      * Deserializes id tokens to IdTokenEntity objects
      * @param idTokens
      */
    inline def deserializeIdTokens(idTokens: Record[String, SerializedIdTokenEntity]): IdTokenCache = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeIdTokens")(idTokens.asInstanceOf[js.Any]).asInstanceOf[IdTokenCache]
    
    /**
      * Parse the JSON blob in memory and deserialize the content
      * @param cachedJson
      */
    inline def deserializeJSONBlob(jsonFile: String): JsonCache = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeJSONBlob")(jsonFile.asInstanceOf[js.Any]).asInstanceOf[JsonCache]
    
    /**
      * Deserializes refresh tokens to RefreshTokenEntity objects
      * @param refreshTokens
      */
    inline def deserializeRefreshTokens(refreshTokens: Record[String, SerializedRefreshTokenEntity]): RefreshTokenCache = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeRefreshTokens")(refreshTokens.asInstanceOf[js.Any]).asInstanceOf[RefreshTokenCache]
  }
}
