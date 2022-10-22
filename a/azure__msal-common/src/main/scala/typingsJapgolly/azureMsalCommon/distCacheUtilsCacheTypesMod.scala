package typingsJapgolly.azureMsalCommon

import typingsJapgolly.azureMsalCommon.distCacheEntitiesAccessTokenEntityMod.AccessTokenEntity
import typingsJapgolly.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity
import typingsJapgolly.azureMsalCommon.distCacheEntitiesAppMetadataEntityMod.AppMetadataEntity
import typingsJapgolly.azureMsalCommon.distCacheEntitiesIdTokenEntityMod.IdTokenEntity
import typingsJapgolly.azureMsalCommon.distCacheEntitiesRefreshTokenEntityMod.RefreshTokenEntity
import typingsJapgolly.azureMsalCommon.distUtilsConstantsMod.AuthenticationScheme
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCacheUtilsCacheTypesMod {
  
  type AccessTokenCache = Record[String, AccessTokenEntity]
  
  type AccountCache = Record[String, AccountEntity]
  
  trait AccountFilter extends StObject {
    
    var environment: js.UndefOr[String] = js.undefined
    
    var homeAccountId: js.UndefOr[String] = js.undefined
    
    var nativeAccountId: js.UndefOr[String] = js.undefined
    
    var realm: js.UndefOr[String] = js.undefined
  }
  object AccountFilter {
    
    inline def apply(): AccountFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccountFilter]
    }
    
    extension [Self <: AccountFilter](x: Self) {
      
      inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      inline def setHomeAccountId(value: String): Self = StObject.set(x, "homeAccountId", value.asInstanceOf[js.Any])
      
      inline def setHomeAccountIdUndefined: Self = StObject.set(x, "homeAccountId", js.undefined)
      
      inline def setNativeAccountId(value: String): Self = StObject.set(x, "nativeAccountId", value.asInstanceOf[js.Any])
      
      inline def setNativeAccountIdUndefined: Self = StObject.set(x, "nativeAccountId", js.undefined)
      
      inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
      
      inline def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
    }
  }
  
  type AppMetadataCache = Record[String, AppMetadataEntity]
  
  trait AppMetadataFilter extends StObject {
    
    var clientId: js.UndefOr[String] = js.undefined
    
    var environment: js.UndefOr[String] = js.undefined
  }
  object AppMetadataFilter {
    
    inline def apply(): AppMetadataFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppMetadataFilter]
    }
    
    extension [Self <: AppMetadataFilter](x: Self) {
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    }
  }
  
  trait CredentialCache extends StObject {
    
    var accessTokens: AccessTokenCache
    
    var idTokens: IdTokenCache
    
    var refreshTokens: RefreshTokenCache
  }
  object CredentialCache {
    
    inline def apply(accessTokens: AccessTokenCache, idTokens: IdTokenCache, refreshTokens: RefreshTokenCache): CredentialCache = {
      val __obj = js.Dynamic.literal(accessTokens = accessTokens.asInstanceOf[js.Any], idTokens = idTokens.asInstanceOf[js.Any], refreshTokens = refreshTokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[CredentialCache]
    }
    
    extension [Self <: CredentialCache](x: Self) {
      
      inline def setAccessTokens(value: AccessTokenCache): Self = StObject.set(x, "accessTokens", value.asInstanceOf[js.Any])
      
      inline def setIdTokens(value: IdTokenCache): Self = StObject.set(x, "idTokens", value.asInstanceOf[js.Any])
      
      inline def setRefreshTokens(value: RefreshTokenCache): Self = StObject.set(x, "refreshTokens", value.asInstanceOf[js.Any])
    }
  }
  
  trait CredentialFilter extends StObject {
    
    var clientId: js.UndefOr[String] = js.undefined
    
    var credentialType: js.UndefOr[String] = js.undefined
    
    var environment: js.UndefOr[String] = js.undefined
    
    var familyId: js.UndefOr[String] = js.undefined
    
    var homeAccountId: js.UndefOr[String] = js.undefined
    
    var keyId: js.UndefOr[String] = js.undefined
    
    var realm: js.UndefOr[String] = js.undefined
    
    var requestedClaimsHash: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
    
    var tokenType: js.UndefOr[AuthenticationScheme] = js.undefined
    
    var userAssertionHash: js.UndefOr[String] = js.undefined
  }
  object CredentialFilter {
    
    inline def apply(): CredentialFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CredentialFilter]
    }
    
    extension [Self <: CredentialFilter](x: Self) {
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      inline def setCredentialType(value: String): Self = StObject.set(x, "credentialType", value.asInstanceOf[js.Any])
      
      inline def setCredentialTypeUndefined: Self = StObject.set(x, "credentialType", js.undefined)
      
      inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      inline def setFamilyId(value: String): Self = StObject.set(x, "familyId", value.asInstanceOf[js.Any])
      
      inline def setFamilyIdUndefined: Self = StObject.set(x, "familyId", js.undefined)
      
      inline def setHomeAccountId(value: String): Self = StObject.set(x, "homeAccountId", value.asInstanceOf[js.Any])
      
      inline def setHomeAccountIdUndefined: Self = StObject.set(x, "homeAccountId", js.undefined)
      
      inline def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
      
      inline def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
      
      inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
      
      inline def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
      
      inline def setRequestedClaimsHash(value: String): Self = StObject.set(x, "requestedClaimsHash", value.asInstanceOf[js.Any])
      
      inline def setRequestedClaimsHashUndefined: Self = StObject.set(x, "requestedClaimsHash", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTokenType(value: AuthenticationScheme): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
      
      inline def setTokenTypeUndefined: Self = StObject.set(x, "tokenType", js.undefined)
      
      inline def setUserAssertionHash(value: String): Self = StObject.set(x, "userAssertionHash", value.asInstanceOf[js.Any])
      
      inline def setUserAssertionHashUndefined: Self = StObject.set(x, "userAssertionHash", js.undefined)
    }
  }
  
  type IdTokenCache = Record[String, IdTokenEntity]
  
  type RefreshTokenCache = Record[String, RefreshTokenEntity]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity
    - typingsJapgolly.azureMsalCommon.distCacheEntitiesIdTokenEntityMod.IdTokenEntity
    - typingsJapgolly.azureMsalCommon.distCacheEntitiesAccessTokenEntityMod.AccessTokenEntity
    - typingsJapgolly.azureMsalCommon.distCacheEntitiesRefreshTokenEntityMod.RefreshTokenEntity
    - typingsJapgolly.azureMsalCommon.distCacheEntitiesAppMetadataEntityMod.AppMetadataEntity
    - typingsJapgolly.azureMsalCommon.distCacheEntitiesAuthorityMetadataEntityMod.AuthorityMetadataEntity
    - typingsJapgolly.azureMsalCommon.distCacheEntitiesServerTelemetryEntityMod.ServerTelemetryEntity
    - typingsJapgolly.azureMsalCommon.distCacheEntitiesThrottlingEntityMod.ThrottlingEntity
    - java.lang.String
  */
  type ValidCacheType = _ValidCacheType | String
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.azureMsalCommon.distCacheEntitiesIdTokenEntityMod.IdTokenEntity
    - typingsJapgolly.azureMsalCommon.distCacheEntitiesAccessTokenEntityMod.AccessTokenEntity
    - typingsJapgolly.azureMsalCommon.distCacheEntitiesRefreshTokenEntityMod.RefreshTokenEntity
  */
  trait ValidCredentialType extends StObject
  
  trait _ValidCacheType extends StObject
}
