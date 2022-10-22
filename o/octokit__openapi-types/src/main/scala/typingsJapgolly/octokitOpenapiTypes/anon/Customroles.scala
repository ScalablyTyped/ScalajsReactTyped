package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Customroles extends StObject {
  
  var custom_roles: js.UndefOr[js.Array[BaseroleCreatedat]] = js.undefined
  
  /**
    * @description The number of custom roles in this organization
    * @example 3
    */
  var total_count: js.UndefOr[Double] = js.undefined
}
object Customroles {
  
  inline def apply(): Customroles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Customroles]
  }
  
  extension [Self <: Customroles](x: Self) {
    
    inline def setCustom_roles(value: js.Array[BaseroleCreatedat]): Self = StObject.set(x, "custom_roles", value.asInstanceOf[js.Any])
    
    inline def setCustom_rolesUndefined: Self = StObject.set(x, "custom_roles", js.undefined)
    
    inline def setCustom_rolesVarargs(value: BaseroleCreatedat*): Self = StObject.set(x, "custom_roles", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
    
    inline def setTotal_countUndefined: Self = StObject.set(x, "total_count", js.undefined)
  }
}
