package typingsJapgolly.octokitOpenapiTypes.anon

import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.admin
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.closed
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.pull
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.push
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.secret
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameParentteamid extends StObject {
  
  /** @description The description of the team. */
  var description: js.UndefOr[String] = js.undefined
  
  /** @description The name of the team. */
  var name: String
  
  /** @description The ID of a team to set as the parent team. */
  var parent_team_id: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * @description **Deprecated**. The permission that new repositories will be added to the team with when none is specified.
    * @default pull
    * @enum {string}
    */
  var permission: js.UndefOr[pull | push | admin] = js.undefined
  
  /**
    * @description The level of privacy this team should have. Editing teams without specifying this parameter leaves `privacy` intact. The options are:
    * **For a non-nested team:**
    * \* `secret` - only visible to organization owners and members of this team.
    * \* `closed` - visible to all members of this organization.
    * **For a parent or child team:**
    * \* `closed` - visible to all members of this organization.
    * @enum {string}
    */
  var privacy: js.UndefOr[secret | closed] = js.undefined
}
object NameParentteamid {
  
  inline def apply(name: String): NameParentteamid = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameParentteamid]
  }
  
  extension [Self <: NameParentteamid](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParent_team_id(value: Double): Self = StObject.set(x, "parent_team_id", value.asInstanceOf[js.Any])
    
    inline def setParent_team_idNull: Self = StObject.set(x, "parent_team_id", null)
    
    inline def setParent_team_idUndefined: Self = StObject.set(x, "parent_team_id", js.undefined)
    
    inline def setPermission(value: pull | push | admin): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    inline def setPrivacy(value: secret | closed): Self = StObject.set(x, "privacy", value.asInstanceOf[js.Any])
    
    inline def setPrivacyUndefined: Self = StObject.set(x, "privacy", js.undefined)
  }
}
