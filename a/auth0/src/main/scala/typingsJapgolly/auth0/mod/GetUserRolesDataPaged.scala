package typingsJapgolly.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUserRolesDataPaged
  extends StObject
     with GetUserRolesData {
  
  var include_totals: Boolean
}
object GetUserRolesDataPaged {
  
  inline def apply(id: String, include_totals: Boolean): GetUserRolesDataPaged = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], include_totals = include_totals.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserRolesDataPaged]
  }
  
  extension [Self <: GetUserRolesDataPaged](x: Self) {
    
    inline def setInclude_totals(value: Boolean): Self = StObject.set(x, "include_totals", value.asInstanceOf[js.Any])
  }
}
