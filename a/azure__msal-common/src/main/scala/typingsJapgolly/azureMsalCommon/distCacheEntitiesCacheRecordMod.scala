package typingsJapgolly.azureMsalCommon

import typingsJapgolly.azureMsalCommon.distCacheEntitiesAccessTokenEntityMod.AccessTokenEntity
import typingsJapgolly.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity
import typingsJapgolly.azureMsalCommon.distCacheEntitiesAppMetadataEntityMod.AppMetadataEntity
import typingsJapgolly.azureMsalCommon.distCacheEntitiesIdTokenEntityMod.IdTokenEntity
import typingsJapgolly.azureMsalCommon.distCacheEntitiesRefreshTokenEntityMod.RefreshTokenEntity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCacheEntitiesCacheRecordMod {
  
  @JSImport("@azure/msal-common/dist/cache/entities/CacheRecord", "CacheRecord")
  @js.native
  open class CacheRecord protected () extends StObject {
    def this(
      accountEntity: js.UndefOr[AccountEntity | Null],
      idTokenEntity: js.UndefOr[IdTokenEntity | Null],
      accessTokenEntity: js.UndefOr[AccessTokenEntity | Null],
      refreshTokenEntity: js.UndefOr[RefreshTokenEntity | Null],
      appMetadataEntity: js.UndefOr[AppMetadataEntity | Null]
    ) = this()
    
    var accessToken: AccessTokenEntity | Null = js.native
    
    var account: AccountEntity | Null = js.native
    
    var appMetadata: AppMetadataEntity | Null = js.native
    
    var idToken: IdTokenEntity | Null = js.native
    
    var refreshToken: RefreshTokenEntity | Null = js.native
  }
}
