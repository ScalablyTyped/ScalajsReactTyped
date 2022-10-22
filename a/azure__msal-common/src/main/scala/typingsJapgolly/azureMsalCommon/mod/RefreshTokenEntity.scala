package typingsJapgolly.azureMsalCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-common", "RefreshTokenEntity")
@js.native
open class RefreshTokenEntity ()
  extends typingsJapgolly.azureMsalCommon.distCacheEntitiesRefreshTokenEntityMod.RefreshTokenEntity
/* static members */
object RefreshTokenEntity {
  
  @JSImport("@azure/msal-common", "RefreshTokenEntity")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create RefreshTokenEntity
    * @param homeAccountId
    * @param authenticationResult
    * @param clientId
    * @param authority
    */
  inline def createRefreshTokenEntity(homeAccountId: String, environment: String, refreshToken: String, clientId: String): typingsJapgolly.azureMsalCommon.distCacheEntitiesRefreshTokenEntityMod.RefreshTokenEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createRefreshTokenEntity")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], refreshToken.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureMsalCommon.distCacheEntitiesRefreshTokenEntityMod.RefreshTokenEntity]
  inline def createRefreshTokenEntity(
    homeAccountId: String,
    environment: String,
    refreshToken: String,
    clientId: String,
    familyId: String
  ): typingsJapgolly.azureMsalCommon.distCacheEntitiesRefreshTokenEntityMod.RefreshTokenEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createRefreshTokenEntity")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], refreshToken.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], familyId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureMsalCommon.distCacheEntitiesRefreshTokenEntityMod.RefreshTokenEntity]
  inline def createRefreshTokenEntity(
    homeAccountId: String,
    environment: String,
    refreshToken: String,
    clientId: String,
    familyId: String,
    userAssertionHash: String
  ): typingsJapgolly.azureMsalCommon.distCacheEntitiesRefreshTokenEntityMod.RefreshTokenEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createRefreshTokenEntity")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], refreshToken.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], familyId.asInstanceOf[js.Any], userAssertionHash.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureMsalCommon.distCacheEntitiesRefreshTokenEntityMod.RefreshTokenEntity]
  inline def createRefreshTokenEntity(
    homeAccountId: String,
    environment: String,
    refreshToken: String,
    clientId: String,
    familyId: Unit,
    userAssertionHash: String
  ): typingsJapgolly.azureMsalCommon.distCacheEntitiesRefreshTokenEntityMod.RefreshTokenEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createRefreshTokenEntity")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], refreshToken.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], familyId.asInstanceOf[js.Any], userAssertionHash.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureMsalCommon.distCacheEntitiesRefreshTokenEntityMod.RefreshTokenEntity]
  
  /**
    * Validates an entity: checks for all expected params
    * @param entity
    */
  inline def isRefreshTokenEntity(entity: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRefreshTokenEntity")(entity.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
