package typingsJapgolly.octokitOpenapiTypes.anon

import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.maintain
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.read
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.triage
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.write
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Baserole extends StObject {
  
  /**
    * @description The system role from which this role inherits permissions.
    * @enum {string}
    */
  var base_role: js.UndefOr[read | triage | write | maintain] = js.undefined
  
  /** Format: date-time */
  var created_at: js.UndefOr[String] = js.undefined
  
  /** @description A short description about who this role is for or what permissions it grants. */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /** @description The unique identifier of the custom role. */
  var id: Double
  
  /** @description The name of the custom role. */
  var name: String
  
  var organization: js.UndefOr[Avatarurl] = js.undefined
  
  /** @description A list of additional permissions included in this role. */
  var permissions: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Format: date-time */
  var updated_at: js.UndefOr[String] = js.undefined
}
object Baserole {
  
  inline def apply(id: Double, name: String): Baserole = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Baserole]
  }
  
  extension [Self <: Baserole](x: Self) {
    
    inline def setBase_role(value: read | triage | write | maintain): Self = StObject.set(x, "base_role", value.asInstanceOf[js.Any])
    
    inline def setBase_roleUndefined: Self = StObject.set(x, "base_role", js.undefined)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOrganization(value: Avatarurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value*))
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUpdated_atUndefined: Self = StObject.set(x, "updated_at", js.undefined)
  }
}
