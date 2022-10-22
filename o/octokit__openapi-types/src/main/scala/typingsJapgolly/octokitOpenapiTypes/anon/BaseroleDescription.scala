package typingsJapgolly.octokitOpenapiTypes.anon

import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.maintain
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.read
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.triage
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.write
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseroleDescription extends StObject {
  
  /**
    * @description The system role from which this role inherits permissions.
    * @enum {string}
    */
  var base_role: read | triage | write | maintain
  
  /** @description A short description about the intended usage of this role or what permissions it grants. */
  var description: js.UndefOr[String] = js.undefined
  
  /** @description The name of the custom role. */
  var name: String
  
  /** @description A list of additional permissions included in this role. */
  var permissions: js.Array[String]
}
object BaseroleDescription {
  
  inline def apply(base_role: read | triage | write | maintain, name: String, permissions: js.Array[String]): BaseroleDescription = {
    val __obj = js.Dynamic.literal(base_role = base_role.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseroleDescription]
  }
  
  extension [Self <: BaseroleDescription](x: Self) {
    
    inline def setBase_role(value: read | triage | write | maintain): Self = StObject.set(x, "base_role", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value*))
  }
}
