package typingsJapgolly.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRoleUsersDataPaged
  extends StObject
     with GetRoleUsersData {
  
  var include_totals: Boolean
}
object GetRoleUsersDataPaged {
  
  inline def apply(id: String, include_totals: Boolean): GetRoleUsersDataPaged = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], include_totals = include_totals.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRoleUsersDataPaged]
  }
  
  extension [Self <: GetRoleUsersDataPaged](x: Self) {
    
    inline def setInclude_totals(value: Boolean): Self = StObject.set(x, "include_totals", value.asInstanceOf[js.Any])
  }
}
