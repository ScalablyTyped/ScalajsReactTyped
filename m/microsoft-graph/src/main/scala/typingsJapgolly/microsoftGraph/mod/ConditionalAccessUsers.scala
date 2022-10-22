package typingsJapgolly.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalAccessUsers extends StObject {
  
  // Group IDs excluded from scope of policy.
  var excludeGroups: js.UndefOr[js.Array[String]] = js.undefined
  
  // Role IDs excluded from scope of policy.
  var excludeRoles: js.UndefOr[js.Array[String]] = js.undefined
  
  // User IDs excluded from scope of policy and/or GuestsOrExternalUsers.
  var excludeUsers: js.UndefOr[js.Array[String]] = js.undefined
  
  // Group IDs in scope of policy unless explicitly excluded, or All.
  var includeGroups: js.UndefOr[js.Array[String]] = js.undefined
  
  // Role IDs in scope of policy unless explicitly excluded, or All.
  var includeRoles: js.UndefOr[js.Array[String]] = js.undefined
  
  // User IDs in scope of policy unless explicitly excluded, or None or All or GuestsOrExternalUsers.
  var includeUsers: js.UndefOr[js.Array[String]] = js.undefined
}
object ConditionalAccessUsers {
  
  inline def apply(): ConditionalAccessUsers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalAccessUsers]
  }
  
  extension [Self <: ConditionalAccessUsers](x: Self) {
    
    inline def setExcludeGroups(value: js.Array[String]): Self = StObject.set(x, "excludeGroups", value.asInstanceOf[js.Any])
    
    inline def setExcludeGroupsUndefined: Self = StObject.set(x, "excludeGroups", js.undefined)
    
    inline def setExcludeGroupsVarargs(value: String*): Self = StObject.set(x, "excludeGroups", js.Array(value*))
    
    inline def setExcludeRoles(value: js.Array[String]): Self = StObject.set(x, "excludeRoles", value.asInstanceOf[js.Any])
    
    inline def setExcludeRolesUndefined: Self = StObject.set(x, "excludeRoles", js.undefined)
    
    inline def setExcludeRolesVarargs(value: String*): Self = StObject.set(x, "excludeRoles", js.Array(value*))
    
    inline def setExcludeUsers(value: js.Array[String]): Self = StObject.set(x, "excludeUsers", value.asInstanceOf[js.Any])
    
    inline def setExcludeUsersUndefined: Self = StObject.set(x, "excludeUsers", js.undefined)
    
    inline def setExcludeUsersVarargs(value: String*): Self = StObject.set(x, "excludeUsers", js.Array(value*))
    
    inline def setIncludeGroups(value: js.Array[String]): Self = StObject.set(x, "includeGroups", value.asInstanceOf[js.Any])
    
    inline def setIncludeGroupsUndefined: Self = StObject.set(x, "includeGroups", js.undefined)
    
    inline def setIncludeGroupsVarargs(value: String*): Self = StObject.set(x, "includeGroups", js.Array(value*))
    
    inline def setIncludeRoles(value: js.Array[String]): Self = StObject.set(x, "includeRoles", value.asInstanceOf[js.Any])
    
    inline def setIncludeRolesUndefined: Self = StObject.set(x, "includeRoles", js.undefined)
    
    inline def setIncludeRolesVarargs(value: String*): Self = StObject.set(x, "includeRoles", js.Array(value*))
    
    inline def setIncludeUsers(value: js.Array[String]): Self = StObject.set(x, "includeUsers", value.asInstanceOf[js.Any])
    
    inline def setIncludeUsersUndefined: Self = StObject.set(x, "includeUsers", js.undefined)
    
    inline def setIncludeUsersVarargs(value: String*): Self = StObject.set(x, "includeUsers", js.Array(value*))
  }
}
