package typingsJapgolly.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the user.
    */
  var ARN: js.UndefOr[String] = js.undefined
  
  /**
    * Access permissions string used for this user.
    */
  var AccessString: js.UndefOr[String] = js.undefined
  
  /**
    * Denotes whether the user requires a password to authenticate.
    */
  var Authentication: js.UndefOr[typingsJapgolly.awsSdk.clientsElasticacheMod.Authentication] = js.undefined
  
  /**
    * The current supported value is Redis.
    */
  var Engine: js.UndefOr[EngineType] = js.undefined
  
  /**
    * The minimum engine version required, which is Redis 6.0
    */
  var MinimumEngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the user status. Can be "active", "modifying" or "deleting".
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * Returns a list of the user group IDs the user belongs to.
    */
  var UserGroupIds: js.UndefOr[UserGroupIdList] = js.undefined
  
  /**
    * The ID of the user.
    */
  var UserId: js.UndefOr[String] = js.undefined
  
  /**
    * The username of the user.
    */
  var UserName: js.UndefOr[String] = js.undefined
}
object User {
  
  inline def apply(): User = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[User]
  }
  
  extension [Self <: User](x: Self) {
    
    inline def setARN(value: String): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    inline def setAccessString(value: String): Self = StObject.set(x, "AccessString", value.asInstanceOf[js.Any])
    
    inline def setAccessStringUndefined: Self = StObject.set(x, "AccessString", js.undefined)
    
    inline def setAuthentication(value: Authentication): Self = StObject.set(x, "Authentication", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationUndefined: Self = StObject.set(x, "Authentication", js.undefined)
    
    inline def setEngine(value: EngineType): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    inline def setMinimumEngineVersion(value: String): Self = StObject.set(x, "MinimumEngineVersion", value.asInstanceOf[js.Any])
    
    inline def setMinimumEngineVersionUndefined: Self = StObject.set(x, "MinimumEngineVersion", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUserGroupIds(value: UserGroupIdList): Self = StObject.set(x, "UserGroupIds", value.asInstanceOf[js.Any])
    
    inline def setUserGroupIdsUndefined: Self = StObject.set(x, "UserGroupIds", js.undefined)
    
    inline def setUserGroupIdsVarargs(value: UserGroupId*): Self = StObject.set(x, "UserGroupIds", js.Array(value*))
    
    inline def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
    
    inline def setUserName(value: String): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
  }
}
