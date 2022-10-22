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

object distCacheSerializerSerializerMod {
  
  @JSImport("@azure/msal-node/dist/cache/serializer/Serializer", "Serializer")
  @js.native
  open class Serializer () extends StObject
  /* static members */
  object Serializer {
    
    @JSImport("@azure/msal-node/dist/cache/serializer/Serializer", "Serializer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Serializes AccessTokens
      * @param atCache
      */
    inline def serializeAccessTokens(atCache: AccessTokenCache): Record[String, SerializedAccessTokenEntity] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAccessTokens")(atCache.asInstanceOf[js.Any]).asInstanceOf[Record[String, SerializedAccessTokenEntity]]
    
    /**
      * Serialize Accounts
      * @param accCache
      */
    inline def serializeAccounts(accCache: AccountCache): Record[String, SerializedAccountEntity] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAccounts")(accCache.asInstanceOf[js.Any]).asInstanceOf[Record[String, SerializedAccountEntity]]
    
    /**
      * Serialize the cache
      * @param jsonContent
      */
    inline def serializeAllCache(inMemCache: InMemoryCache): JsonCache = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAllCache")(inMemCache.asInstanceOf[js.Any]).asInstanceOf[JsonCache]
    
    /**
      * Serialize amdtCache
      * @param amdtCache
      */
    inline def serializeAppMetadata(amdtCache: AppMetadataCache): Record[String, SerializedAppMetadataEntity] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAppMetadata")(amdtCache.asInstanceOf[js.Any]).asInstanceOf[Record[String, SerializedAppMetadataEntity]]
    
    /**
      * Serialize IdTokens
      * @param idTCache
      */
    inline def serializeIdTokens(idTCache: IdTokenCache): Record[String, SerializedIdTokenEntity] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeIdTokens")(idTCache.asInstanceOf[js.Any]).asInstanceOf[Record[String, SerializedIdTokenEntity]]
    
    /**
      * serialize the JSON blob
      * @param data
      */
    inline def serializeJSONBlob(data: JsonCache): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeJSONBlob")(data.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Serialize refreshTokens
      * @param rtCache
      */
    inline def serializeRefreshTokens(rtCache: RefreshTokenCache): Record[String, SerializedRefreshTokenEntity] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeRefreshTokens")(rtCache.asInstanceOf[js.Any]).asInstanceOf[Record[String, SerializedRefreshTokenEntity]]
  }
}
