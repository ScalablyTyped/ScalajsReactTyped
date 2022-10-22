package typingsJapgolly.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRolesDataPaged
  extends StObject
     with GetRolesData {
  
  var include_totals: Boolean
}
object GetRolesDataPaged {
  
  inline def apply(include_totals: Boolean): GetRolesDataPaged = {
    val __obj = js.Dynamic.literal(include_totals = include_totals.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRolesDataPaged]
  }
  
  extension [Self <: GetRolesDataPaged](x: Self) {
    
    inline def setInclude_totals(value: Boolean): Self = StObject.set(x, "include_totals", value.asInstanceOf[js.Any])
  }
}
